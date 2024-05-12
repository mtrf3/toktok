package com.ss.android.ugc.aweme.compliance.protection.perception;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PerceptionPopup {

    @InterfaceC65349Pkn("biz_scene")
    public final String businessScene;

    @InterfaceC65349Pkn("popup_url")
    public final String popupUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerceptionPopup)) {
            return false;
        }
        PerceptionPopup perceptionPopup = (PerceptionPopup) obj;
        return o.LJ(this.businessScene, perceptionPopup.businessScene) && o.LJ(this.popupUrl, perceptionPopup.popupUrl);
    }

    public final int hashCode() {
        String str = this.businessScene;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.popupUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PerceptionPopup(businessScene=");
        LIZ.append(this.businessScene);
        LIZ.append(", popupUrl=");
        return q.LIZIZ(LIZ, this.popupUrl, ')', LIZ);
    }

    public PerceptionPopup(String str, String str2) {
        this.businessScene = str;
        this.popupUrl = str2;
    }
}
