package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.S9H;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BillboardSettingsData extends F9E implements Parcelable {
    public static final Parcelable.Creator<BillboardSettingsData> CREATOR = new S9H();

    @InterfaceC65349Pkn("billboard_new_user")
    public final BillboardNewUser newUser;

    @InterfaceC65349Pkn("billboard_setting")
    public final BillboardSetting setting;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.setting, this.newUser};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.setting.writeToParcel(out, i);
        this.newUser.writeToParcel(out, i);
    }

    public BillboardSettingsData(BillboardSetting setting, BillboardNewUser newUser) {
        o.LJIIIZ(setting, "setting");
        o.LJIIIZ(newUser, "newUser");
        this.setting = setting;
        this.newUser = newUser;
    }
}
