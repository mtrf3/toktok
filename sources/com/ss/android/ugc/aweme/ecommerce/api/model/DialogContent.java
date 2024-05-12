package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.B2V;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DialogContent implements Parcelable {
    public static final Parcelable.Creator<DialogContent> CREATOR = new B2V();

    @InterfaceC65349Pkn("button_direction")
    public final Integer buttonDirection;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("dialog_button")
    public final List<DialogButton> dialogButtons;

    @InterfaceC65349Pkn("dialog_type")
    public final Integer dialogType;

    @InterfaceC65349Pkn("has_close_button")
    public final Boolean hasCloseButton;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogContent copy$default(DialogContent dialogContent, String str, String str2, Integer num, Boolean bool, Integer num2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogContent.title;
        }
        if ((i & 2) != 0) {
            str2 = dialogContent.message;
        }
        if ((i & 4) != 0) {
            num = dialogContent.dialogType;
        }
        if ((i & 8) != 0) {
            bool = dialogContent.hasCloseButton;
        }
        if ((i & 16) != 0) {
            num2 = dialogContent.buttonDirection;
        }
        if ((i & 32) != 0) {
            list = dialogContent.dialogButtons;
        }
        if ((i & 64) != 0) {
            str3 = dialogContent.daInfo;
        }
        return dialogContent.copy(str, str2, num, bool, num2, list, str3);
    }

    public final DialogContent copy(String str, String message, Integer num, Boolean bool, Integer num2, List<DialogButton> list, String str2) {
        o.LJIIIZ(message, "message");
        return new DialogContent(str, message, num, bool, num2, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogContent)) {
            return false;
        }
        DialogContent dialogContent = (DialogContent) obj;
        return o.LJ(this.title, dialogContent.title) && o.LJ(this.message, dialogContent.message) && o.LJ(this.dialogType, dialogContent.dialogType) && o.LJ(this.hasCloseButton, dialogContent.hasCloseButton) && o.LJ(this.buttonDirection, dialogContent.buttonDirection) && o.LJ(this.dialogButtons, dialogContent.dialogButtons) && o.LJ(this.daInfo, dialogContent.daInfo);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.title;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.message, hashCode * 31, 31);
        Integer num = this.dialogType;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        Boolean bool = this.hasCloseButton;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Integer num2 = this.buttonDirection;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        List<DialogButton> list = this.dialogButtons;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str2 = this.daInfo;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogContent(title=");
        LIZ.append(this.title);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", dialogType=");
        LIZ.append(this.dialogType);
        LIZ.append(", hasCloseButton=");
        LIZ.append(this.hasCloseButton);
        LIZ.append(", buttonDirection=");
        LIZ.append(this.buttonDirection);
        LIZ.append(", dialogButtons=");
        LIZ.append(this.dialogButtons);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public final Integer getButtonDirection() {
        return this.buttonDirection;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final List<DialogButton> getDialogButtons() {
        return this.dialogButtons;
    }

    public final Integer getDialogType() {
        return this.dialogType;
    }

    public final Boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.message);
        Integer num = this.dialogType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.hasCloseButton;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Integer num2 = this.buttonDirection;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        List<DialogButton> list = this.dialogButtons;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((DialogButton) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.daInfo);
    }

    public DialogContent(String str, String message, Integer num, Boolean bool, Integer num2, List<DialogButton> list, String str2) {
        o.LJIIIZ(message, "message");
        this.title = str;
        this.message = message;
        this.dialogType = num;
        this.hasCloseButton = bool;
        this.buttonDirection = num2;
        this.dialogButtons = list;
        this.daInfo = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DialogContent(java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Boolean r12, java.lang.Integer r13, java.util.List r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r3 = r11
            r1 = r16 & 4
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Lb
            r3 = r5
        Lb:
            r0 = r16 & 16
            if (r0 == 0) goto L19
        Lf:
            r6 = r14
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L19:
            r5 = r13
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
