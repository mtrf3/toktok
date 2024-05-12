package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.B27;
import X.C1FJ;
import X.C1FL;
import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExceptionUX implements Parcelable {
    public static final Parcelable.Creator<ExceptionUX> CREATOR = new B27();

    @InterfaceC65349Pkn("dialog_content")
    public final DialogContent dialogContent;

    @InterfaceC65349Pkn("exception_ux_type")
    public final Integer exceptionUXType;

    @InterfaceC65349Pkn("input_box_hint_content_list")
    public final List<InputBoxHintContent> inputBoxHintContentList;

    @InterfaceC65349Pkn("redirect_content")
    public final RedirectContent redirectContent;

    @InterfaceC65349Pkn("render_page")
    public final Boolean renderPage;

    @InterfaceC65349Pkn("toast_content")
    public final ToastContent toastContent;

    @InterfaceC65349Pkn("verification_content")
    public final String verificationContent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExceptionUX copy$default(ExceptionUX exceptionUX, Integer num, Boolean bool, DialogContent dialogContent, ToastContent toastContent, String str, RedirectContent redirectContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = exceptionUX.exceptionUXType;
        }
        if ((i & 2) != 0) {
            bool = exceptionUX.renderPage;
        }
        if ((i & 4) != 0) {
            dialogContent = exceptionUX.dialogContent;
        }
        if ((i & 8) != 0) {
            toastContent = exceptionUX.toastContent;
        }
        if ((i & 16) != 0) {
            str = exceptionUX.verificationContent;
        }
        if ((i & 32) != 0) {
            redirectContent = exceptionUX.redirectContent;
        }
        if ((i & 64) != 0) {
            list = exceptionUX.inputBoxHintContentList;
        }
        return exceptionUX.copy(num, bool, dialogContent, toastContent, str, redirectContent, list);
    }

    public final ExceptionUX copy(Integer num, Boolean bool, DialogContent dialogContent, ToastContent toastContent, String str, RedirectContent redirectContent, List<InputBoxHintContent> list) {
        return new ExceptionUX(num, bool, dialogContent, toastContent, str, redirectContent, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionUX)) {
            return false;
        }
        ExceptionUX exceptionUX = (ExceptionUX) obj;
        return o.LJ(this.exceptionUXType, exceptionUX.exceptionUXType) && o.LJ(this.renderPage, exceptionUX.renderPage) && o.LJ(this.dialogContent, exceptionUX.dialogContent) && o.LJ(this.toastContent, exceptionUX.toastContent) && o.LJ(this.verificationContent, exceptionUX.verificationContent) && o.LJ(this.redirectContent, exceptionUX.redirectContent) && o.LJ(this.inputBoxHintContentList, exceptionUX.inputBoxHintContentList);
    }

    public int hashCode() {
        Integer num = this.exceptionUXType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.renderPage;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DialogContent dialogContent = this.dialogContent;
        int hashCode3 = (hashCode2 + (dialogContent == null ? 0 : dialogContent.hashCode())) * 31;
        ToastContent toastContent = this.toastContent;
        int hashCode4 = (hashCode3 + (toastContent == null ? 0 : toastContent.hashCode())) * 31;
        String str = this.verificationContent;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        RedirectContent redirectContent = this.redirectContent;
        int hashCode6 = (hashCode5 + (redirectContent == null ? 0 : redirectContent.hashCode())) * 31;
        List<InputBoxHintContent> list = this.inputBoxHintContentList;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExceptionUX(exceptionUXType=");
        LIZ.append(this.exceptionUXType);
        LIZ.append(", renderPage=");
        LIZ.append(this.renderPage);
        LIZ.append(", dialogContent=");
        LIZ.append(this.dialogContent);
        LIZ.append(", toastContent=");
        LIZ.append(this.toastContent);
        LIZ.append(", verificationContent=");
        LIZ.append(this.verificationContent);
        LIZ.append(", redirectContent=");
        LIZ.append(this.redirectContent);
        LIZ.append(", inputBoxHintContentList=");
        return C1NE.LIZIZ(LIZ, this.inputBoxHintContentList, ')', LIZ);
    }

    public final DialogContent getDialogContent() {
        return this.dialogContent;
    }

    public final Integer getExceptionUXType() {
        return this.exceptionUXType;
    }

    public final List<InputBoxHintContent> getInputBoxHintContentList() {
        return this.inputBoxHintContentList;
    }

    public final RedirectContent getRedirectContent() {
        return this.redirectContent;
    }

    public final Boolean getRenderPage() {
        return this.renderPage;
    }

    public final ToastContent getToastContent() {
        return this.toastContent;
    }

    public final String getVerificationContent() {
        return this.verificationContent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.exceptionUXType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.renderPage;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        DialogContent dialogContent = this.dialogContent;
        if (dialogContent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dialogContent.writeToParcel(out, i);
        }
        ToastContent toastContent = this.toastContent;
        if (toastContent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            toastContent.writeToParcel(out, i);
        }
        out.writeString(this.verificationContent);
        RedirectContent redirectContent = this.redirectContent;
        if (redirectContent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirectContent.writeToParcel(out, i);
        }
        List<InputBoxHintContent> list = this.inputBoxHintContentList;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((InputBoxHintContent) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public ExceptionUX(Integer num, Boolean bool, DialogContent dialogContent, ToastContent toastContent, String str, RedirectContent redirectContent, List<InputBoxHintContent> list) {
        this.exceptionUXType = num;
        this.renderPage = bool;
        this.dialogContent = dialogContent;
        this.toastContent = toastContent;
        this.verificationContent = str;
        this.redirectContent = redirectContent;
        this.inputBoxHintContentList = list;
    }
}
