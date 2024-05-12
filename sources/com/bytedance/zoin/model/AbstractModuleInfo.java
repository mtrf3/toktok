package com.bytedance.zoin.model;

import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes7.dex */
public class AbstractModuleInfo {
    public String moduleName;
    public int moduleType;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbstractModuleInfo{moduleName='");
        Q89.LIZIZ(LIZ, this.moduleName, '\'', ", moduleType=");
        return b0.LIZJ(LIZ, this.moduleType, '}', LIZ);
    }
}
