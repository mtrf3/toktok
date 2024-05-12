package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SaveDisplayInfoContent {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveDisplayInfoContent)) {
            return false;
        }
        SaveDisplayInfoContent saveDisplayInfoContent = (SaveDisplayInfoContent) obj;
        return o.LJ(this.title, saveDisplayInfoContent.title) && o.LJ(this.desc, saveDisplayInfoContent.desc);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveDisplayInfoContent(title=");
        LIZ.append(this.title);
        LIZ.append(", desc=");
        return q.LIZIZ(LIZ, this.desc, ')', LIZ);
    }

    public SaveDisplayInfoContent(String str, String str2) {
        this.title = str;
        this.desc = str2;
    }
}
