package com.bytedance.zoin.model;

import X.Q89;
import X.X1D;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class ZoinBuildFileInfo implements Comparable<ZoinBuildFileInfo> {
    public int beginOffset;
    public long checkNumber;
    public String compressedName;
    public String decompressPath;
    public int endOffset;
    public int fileLength;
    public String name;
    public LinkedList<String> neededDeps = new LinkedList<>();
    public int offsetInFile;
    public String relativePath;

    public int getFileBlockLength() {
        return this.endOffset - this.beginOffset;
    }

    public int hashCode() {
        int i;
        String str = this.name;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.checkNumber;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileInfo{name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", compressedName='");
        Q89.LIZIZ(LIZ, this.compressedName, '\'', ", beginOffset=");
        LIZ.append(this.beginOffset);
        LIZ.append(", endOffset=");
        LIZ.append(this.endOffset);
        LIZ.append(", checkNumber=");
        LIZ.append(this.checkNumber);
        LIZ.append(", needed=");
        LIZ.append(this.neededDeps);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoinBuildFileInfo)) {
            return false;
        }
        ZoinBuildFileInfo zoinBuildFileInfo = (ZoinBuildFileInfo) obj;
        if (this.checkNumber != zoinBuildFileInfo.checkNumber) {
            return false;
        }
        String str = this.name;
        String str2 = zoinBuildFileInfo.name;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoinBuildFileInfo zoinBuildFileInfo) {
        return this.beginOffset - zoinBuildFileInfo.beginOffset;
    }
}
