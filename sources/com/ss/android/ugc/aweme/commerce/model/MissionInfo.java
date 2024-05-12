package com.ss.android.ugc.aweme.commerce.model;

import X.C77414UZu;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MissionInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<MissionInfo> CREATOR = new C77414UZu();

    @InterfaceC65349Pkn("is_mission_ad")
    public final Integer isMissionAd;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    /* renamed from: isMissionAd, reason: collision with other method in class */
    public final boolean m105isMissionAd() {
        Integer num = this.isMissionAd;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final Integer isMissionAd() {
        return this.isMissionAd;
    }
}
