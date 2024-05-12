package com.bytedance.zoin.model;

import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes7.dex */
public class ZoinBlockInfo {
    public long blockBeginOffset;
    public String blockCompressedName;
    public long blockEndOffset;
    public String blockName;
    public int totalDecompressedLength;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZoinBlockInfo{blockName='");
        Q89.LIZIZ(LIZ, this.blockName, '\'', ", blockCompressedName='");
        Q89.LIZIZ(LIZ, this.blockCompressedName, '\'', ", blockBeginOffset=");
        LIZ.append(this.blockBeginOffset);
        LIZ.append(", blockEndOffset=");
        LIZ.append(this.blockEndOffset);
        LIZ.append(", totalDecompressedLength=");
        return b0.LIZJ(LIZ, this.totalDecompressedLength, '}', LIZ);
    }
}
