package com.ss.android.ugc.aweme.setting.model;

import X.C0JT;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.WM7;
import X.X1D;

/* loaded from: classes9.dex */
public class MLModel {

    @InterfaceC65349Pkn("disable")
    public boolean disable;

    @InterfaceC65349Pkn("package")
    public String packageUrl;

    @InterfaceC65349Pkn("params")
    public int[] params;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("type")
    public int type = 3;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MLModel{scene='");
        Q89.LIZIZ(LIZ, this.scene, '\'', ", packageUrl='");
        Q89.LIZIZ(LIZ, this.packageUrl, '\'', ", type=");
        LIZ.append(this.type);
        LIZ.append(", params=");
        C0JT.LIZLLL(this.params, LIZ, ", disable=");
        return C48339Iy7.LIZJ(LIZ, this.disable, '}', LIZ);
    }
}
