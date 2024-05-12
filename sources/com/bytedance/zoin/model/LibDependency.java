package com.bytedance.zoin.model;

import X.C48339Iy7;
import X.Q89;
import X.X1D;
import java.util.Arrays;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class LibDependency {
    public LinkedList<String> depsList = new LinkedList<>();
    public boolean libDecompressed = false;
    public String libName;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibDependency{libName='");
        Q89.LIZIZ(LIZ, this.libName, '\'', ", depsList=");
        LIZ.append(Arrays.toString(this.depsList.toArray()));
        LIZ.append(", libDecompressed=");
        return C48339Iy7.LIZJ(LIZ, this.libDecompressed, '}', LIZ);
    }
}
