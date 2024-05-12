package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NoticeDialogMessage {

    @InterfaceC65349Pkn("confirm_button_text")
    public final String confirmButtonText;

    @InterfaceC65349Pkn("content_text")
    public final String contentText;

    @InterfaceC65349Pkn("title_text")
    public final String titleText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeDialogMessage)) {
            return false;
        }
        NoticeDialogMessage noticeDialogMessage = (NoticeDialogMessage) obj;
        return o.LJ(this.titleText, noticeDialogMessage.titleText) && o.LJ(this.contentText, noticeDialogMessage.contentText) && o.LJ(this.confirmButtonText, noticeDialogMessage.confirmButtonText);
    }

    public final int hashCode() {
        String str = this.titleText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirmButtonText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeDialogMessage(titleText=");
        LIZ.append(this.titleText);
        LIZ.append(", contentText=");
        LIZ.append(this.contentText);
        LIZ.append(", confirmButtonText=");
        return q.LIZIZ(LIZ, this.confirmButtonText, ')', LIZ);
    }

    public NoticeDialogMessage(String str, String str2, String str3) {
        this.titleText = str;
        this.contentText = str2;
        this.confirmButtonText = str3;
    }
}
