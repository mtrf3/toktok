package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SettingModel {

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("show")
    public final Boolean show;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingModel)) {
            return false;
        }
        SettingModel settingModel = (SettingModel) obj;
        return o.LJ(this.show, settingModel.show) && o.LJ(this.schema, settingModel.schema) && o.LJ(this.scene, settingModel.scene);
    }

    public final int hashCode() {
        Boolean bool = this.show;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.schema;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.scene;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingModel(show=");
        LIZ.append(this.show);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", scene=");
        return s0.LIZJ(LIZ, this.scene, ')', LIZ);
    }

    public SettingModel(Boolean bool, String str, Integer num) {
        this.show = bool;
        this.schema = str;
        this.scene = num;
    }
}
