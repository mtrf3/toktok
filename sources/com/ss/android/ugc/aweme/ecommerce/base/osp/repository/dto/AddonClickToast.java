package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AddonClickToast {

    @InterfaceC65349Pkn("icon")
    public final String iconRes;

    @InterfaceC65349Pkn("toast_content")
    public final String toastContent;

    @InterfaceC65349Pkn("toast_type")
    public final Integer toastType;

    public static /* synthetic */ AddonClickToast copy$default(AddonClickToast addonClickToast, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = addonClickToast.toastType;
        }
        if ((i & 2) != 0) {
            str = addonClickToast.toastContent;
        }
        if ((i & 4) != 0) {
            str2 = addonClickToast.iconRes;
        }
        return addonClickToast.copy(num, str, str2);
    }

    public final AddonClickToast copy(Integer num, String str, String str2) {
        return new AddonClickToast(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonClickToast)) {
            return false;
        }
        AddonClickToast addonClickToast = (AddonClickToast) obj;
        return o.LJ(this.toastType, addonClickToast.toastType) && o.LJ(this.toastContent, addonClickToast.toastContent) && o.LJ(this.iconRes, addonClickToast.iconRes);
    }

    public int hashCode() {
        Integer num = this.toastType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.toastContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconRes;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonClickToast(toastType=");
        LIZ.append(this.toastType);
        LIZ.append(", toastContent=");
        LIZ.append(this.toastContent);
        LIZ.append(", iconRes=");
        return q.LIZIZ(LIZ, this.iconRes, ')', LIZ);
    }

    public final String getIconRes() {
        return this.iconRes;
    }

    public final String getToastContent() {
        return this.toastContent;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    public AddonClickToast(Integer num, String str, String str2) {
        this.toastType = num;
        this.toastContent = str;
        this.iconRes = str2;
    }
}
