package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C1FJ;
import X.C64477PSf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DialogButton implements Parcelable {
    public static final Parcelable.Creator<DialogButton> CREATOR = new C64477PSf();

    @InterfaceC65349Pkn("button_action")
    public final ButtonAction buttonAction;

    @InterfaceC65349Pkn("dialog_button_style")
    public final Integer dialogButtonStyle;

    @InterfaceC65349Pkn("text")
    public final String text;

    public static /* synthetic */ DialogButton copy$default(DialogButton dialogButton, String str, Integer num, ButtonAction buttonAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogButton.text;
        }
        if ((i & 2) != 0) {
            num = dialogButton.dialogButtonStyle;
        }
        if ((i & 4) != 0) {
            buttonAction = dialogButton.buttonAction;
        }
        return dialogButton.copy(str, num, buttonAction);
    }

    public final DialogButton copy(String str, Integer num, ButtonAction buttonAction) {
        return new DialogButton(str, num, buttonAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogButton)) {
            return false;
        }
        DialogButton dialogButton = (DialogButton) obj;
        return o.LJ(this.text, dialogButton.text) && o.LJ(this.dialogButtonStyle, dialogButton.dialogButtonStyle) && o.LJ(this.buttonAction, dialogButton.buttonAction);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.dialogButtonStyle;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ButtonAction buttonAction = this.buttonAction;
        return hashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogButton(text=");
        LIZ.append(this.text);
        LIZ.append(", dialogButtonStyle=");
        LIZ.append(this.dialogButtonStyle);
        LIZ.append(", buttonAction=");
        LIZ.append(this.buttonAction);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    public final Integer getDialogButtonStyle() {
        return this.dialogButtonStyle;
    }

    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        Integer num = this.dialogButtonStyle;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        ButtonAction buttonAction = this.buttonAction;
        if (buttonAction == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buttonAction.writeToParcel(out, i);
        }
    }

    public DialogButton(String str, Integer num, ButtonAction buttonAction) {
        this.text = str;
        this.dialogButtonStyle = num;
        this.buttonAction = buttonAction;
    }

    public /* synthetic */ DialogButton(String str, Integer num, ButtonAction buttonAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0 : num, buttonAction);
    }
}
