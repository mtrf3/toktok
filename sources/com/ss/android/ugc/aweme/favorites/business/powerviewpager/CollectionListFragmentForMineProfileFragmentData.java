package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListFragmentForMineProfile;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.CollectionListFragmentForMineProfileFragmentData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionListFragmentForMineProfileFragmentData extends PowerViewPagerFragmentItem<CollectionListFragmentForMineProfile> {
    public static final Parcelable.Creator<CollectionListFragmentForMineProfileFragmentData> CREATOR = new Parcelable.Creator<CollectionListFragmentForMineProfileFragmentData>() { // from class: X.7hl
        @Override // android.os.Parcelable.Creator
        public final CollectionListFragmentForMineProfileFragmentData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            parcel.readInt();
            return new CollectionListFragmentForMineProfileFragmentData();
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionListFragmentForMineProfileFragmentData[] newArray(int i) {
            return new CollectionListFragmentForMineProfileFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
