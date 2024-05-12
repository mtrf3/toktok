package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GylBackToTopEventParams {

    @InterfaceC65349Pkn("action_type")
    public final String actionType;

    @InterfaceC65349Pkn("back_type")
    public final Integer backType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    /* JADX WARN: Multi-variable type inference failed */
    public GylBackToTopEventParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GylBackToTopEventParams)) {
            return false;
        }
        GylBackToTopEventParams gylBackToTopEventParams = (GylBackToTopEventParams) obj;
        return o.LJ(this.actionType, gylBackToTopEventParams.actionType) && o.LJ(this.backType, gylBackToTopEventParams.backType) && o.LJ(this.scene, gylBackToTopEventParams.scene);
    }

    public final int hashCode() {
        String str = this.actionType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.backType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.scene;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GylBackToTopEventParams(actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", backType=");
        LIZ.append(this.backType);
        LIZ.append(", scene=");
        return q.LIZIZ(LIZ, this.scene, ')', LIZ);
    }

    public GylBackToTopEventParams(String str, Integer num, String str2) {
        this.actionType = str;
        this.backType = num;
        this.scene = str2;
    }

    public /* synthetic */ GylBackToTopEventParams(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
