package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InnerEffectExtraConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectExtraConfig> CREATOR = new Parcelable.Creator<InnerEffectExtraConfig>() { // from class: X.6Ap
        @Override // android.os.Parcelable.Creator
        public final InnerEffectExtraConfig createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new InnerEffectExtraConfig(z);
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectExtraConfig[] newArray(int i) {
            return new InnerEffectExtraConfig[i];
        }
    };
    public final boolean forceUpdate;

    public InnerEffectExtraConfig() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.forceUpdate ? 1 : 0);
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public InnerEffectExtraConfig(boolean z) {
        this.forceUpdate = z;
    }

    public /* synthetic */ InnerEffectExtraConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
