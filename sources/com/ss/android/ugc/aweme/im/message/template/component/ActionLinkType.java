package com.ss.android.ugc.aweme.im.message.template.component;

import X.EnumC62835OlL;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public enum ActionLinkType implements BaseComponent<EnumC62835OlL> {
    INVALID(-1),
    DEEP_LINK(EnumC62835OlL.DeepLink.getValue()),
    H5_LINK(EnumC62835OlL.H5Link.getValue()),
    FOLLOW_USER(EnumC62835OlL.FollowUser.getValue()),
    REFRESH(EnumC62835OlL.Refresh.getValue()),
    CALLBACK(EnumC62835OlL.Callback.getValue());

    public static final Parcelable.Creator<ActionLinkType> CREATOR = new Parcelable.Creator<ActionLinkType>() { // from class: X.OlM
        @Override // android.os.Parcelable.Creator
        public final ActionLinkType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return ActionLinkType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinkType[] newArray(int i) {
            return new ActionLinkType[i];
        }
    };
    public final int value;

    public static ActionLinkType valueOf(String str) {
        return (ActionLinkType) V0N.LJJJ(ActionLinkType.class, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(name());
    }

    /* renamed from: toProto, reason: merged with bridge method [inline-methods] */
    public EnumC62835OlL m129toProto() {
        return EnumC62835OlL.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    ActionLinkType(int i) {
        this.value = i;
    }
}
