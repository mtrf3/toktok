package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddonNotice {

    @InterfaceC65349Pkn("click_toast")
    public final List<AddonClickToast> clickToast;

    @InterfaceC65349Pkn("expand_text")
    public final String tipsText;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddonNotice copy$default(AddonNotice addonNotice, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addonNotice.clickToast;
        }
        if ((i & 2) != 0) {
            str = addonNotice.tipsText;
        }
        return addonNotice.copy(list, str);
    }

    public final AddonNotice copy(List<AddonClickToast> list, String str) {
        return new AddonNotice(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonNotice)) {
            return false;
        }
        AddonNotice addonNotice = (AddonNotice) obj;
        return o.LJ(this.clickToast, addonNotice.clickToast) && o.LJ(this.tipsText, addonNotice.tipsText);
    }

    public int hashCode() {
        List<AddonClickToast> list = this.clickToast;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.tipsText;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonNotice(clickToast=");
        LIZ.append(this.clickToast);
        LIZ.append(", tipsText=");
        return q.LIZIZ(LIZ, this.tipsText, ')', LIZ);
    }

    public final List<AddonClickToast> getClickToast() {
        return this.clickToast;
    }

    public final String getTipsText() {
        return this.tipsText;
    }

    public AddonNotice(List<AddonClickToast> list, String str) {
        this.clickToast = list;
        this.tipsText = str;
    }
}
