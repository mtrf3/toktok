package com.ss.android.ugc.aweme.creative.model;

import X.C43561H7t;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GreenScreenEffectModel implements Parcelable {
    public static final Parcelable.Creator<GreenScreenEffectModel> CREATOR = new C43561H7t();

    @InterfaceC65349Pkn("prop_customized_pic_cnt")
    public int propCustomPicCnt;

    public GreenScreenEffectModel() {
        this(0, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.propCustomPicCnt);
    }

    public GreenScreenEffectModel(int i) {
        this.propCustomPicCnt = i;
    }

    public /* synthetic */ GreenScreenEffectModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
