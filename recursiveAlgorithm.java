public static void recursive(int[] lines, int[][] networkMatrix, int row,int lastRow)
    {       
        wasHere[row][value((int)use.sumArr(lines))]=true;
        if(min<sum(lines)) return;
        if(isAllNotMinus1000(lines)) min=sum(lines); 
        int[][] copyOfMatrix=new int[n][n];
        int[] copyOfLines;
        for(int i=0; i<n; i++)
        {
            copyOfLines=Arrays.copyOf(lines, lines.length);
            for(int k=0; k<n; k++)  copyOfMatrix[k]=Arrays.copyOf(networkMatrix[k], networkMatrix[k].length);
            if(i!=0&&copyOfMatrix[i][row]!=0) copyOfLines[i]=copyOfMatrix[i][row];
            copyOfMatrix[i][row]=0; copyOfMatrix[row][i]=0;
            if(networkMatrix[row][i]==-1) continue;
            if(wasHere[i][value((int)use.sumArr(copyOfLines))]) continue;
            if(min<sum(copyOfLines)) continue;
            recursive(copyOfLines,copyOfMatrix,i,row);
        }
