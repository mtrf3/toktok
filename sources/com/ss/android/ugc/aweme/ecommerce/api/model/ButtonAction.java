package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C1FJ;
import X.C64478PSg;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ButtonAction implements Parcelable {
    public static final Parcelable.Creator<ButtonAction> CREATOR = new C64478PSg();

    @InterfaceC65349Pkn("button_action_info")
    public final ButtonActionInfo buttonActionInfo;

    @InterfaceC65349Pkn("button_action_type")
    public final Integer buttonActionType;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    public static /* synthetic */ ButtonAction copy$default(ButtonAction buttonAction, Integer num, ButtonActionInfo buttonActionInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = buttonAction.buttonActionType;
        }
        if ((i & 2) != 0) {
            buttonActionInfo = buttonAction.buttonActionInfo;
        }
        if ((i & 4) != 0) {
            str = buttonAction.daInfo;
        }
        return buttonAction.copy(num, buttonActionInfo, str);
    }

    public final ButtonAction copy(Integer num, ButtonActionInfo buttonActionInfo, String str) {
        return new ButtonAction(num, buttonActionInfo, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return o.LJ(this.buttonActionType, buttonAction.buttonActionType) && o.LJ(this.buttonActionInfo, buttonAction.buttonActionInfo) && o.LJ(this.daInfo, buttonAction.daInfo);
    }

    public int hashCode() {
        Integer num = this.buttonActionType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ButtonActionInfo buttonActionInfo = this.buttonActionInfo;
        int hashCode2 = (hashCode + (buttonActionInfo == null ? 0 : buttonActionInfo.hashCode())) * 31;
        String str = this.daInfo;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ButtonAction(buttonActionType=");
        LIZ.append(this.buttonActionType);
        LIZ.append(", buttonActionInfo=");
        LIZ.append(this.buttonActionInfo);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public final ButtonActionInfo getButtonActionInfo() {
        return this.buttonActionInfo;
    }

    public final Integer getButtonActionType() {
        return this.buttonActionType;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.buttonActionType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        ButtonActionInfo buttonActionInfo = this.buttonActionInfo;
        if (buttonActionInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buttonActionInfo.writeToParcel(out, i);
        }
        out.writeString(this.daInfo);
    }

    public ButtonAction(Integer num, ButtonActionInfo buttonActionInfo, String str) {
        this.buttonActionType = num;
        this.buttonActionInfo = buttonActionInfo;
        this.daInfo = str;
    }

    public /* synthetic */ ButtonAction(Integer num, ButtonActionInfo buttonActionInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, buttonActionInfo, str);
    }
}
