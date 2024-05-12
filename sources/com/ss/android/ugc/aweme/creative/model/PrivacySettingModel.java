package com.ss.android.ugc.aweme.creative.model;

import X.C41749Ga1;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PrivacySettingModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<PrivacySettingModel> CREATOR = new C41749Ga1();

    @InterfaceC65349Pkn("aigc_info")
    public AIGCInfo aigcInfo;

    @InterfaceC65349Pkn("allow_create_sticker")
    public int allowCreateSticker;

    @InterfaceC65349Pkn("is_subscribe_only")
    public boolean isSubscribeOnly;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacySettingModel() {
        this(0, 0 == true ? 1 : 0, null, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.allowCreateSticker), Boolean.valueOf(this.isSubscribeOnly), this.aigcInfo};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.allowCreateSticker);
        out.writeInt(this.isSubscribeOnly ? 1 : 0);
        this.aigcInfo.writeToParcel(out, i);
    }

    public PrivacySettingModel(int i, boolean z, AIGCInfo aigcInfo) {
        o.LJIIIZ(aigcInfo, "aigcInfo");
        this.allowCreateSticker = i;
        this.isSubscribeOnly = z;
        this.aigcInfo = aigcInfo;
    }

    public /* synthetic */ PrivacySettingModel(int i, boolean z, AIGCInfo aIGCInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? new AIGCInfo(0, false, 0, 7, null) : aIGCInfo);
    }
}
