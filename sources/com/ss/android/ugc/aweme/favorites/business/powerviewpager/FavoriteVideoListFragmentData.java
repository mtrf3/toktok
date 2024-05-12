package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoriteVideoListFragmentData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoriteVideoListFragmentData extends PowerViewPagerFragmentItem<AllFavoriteFragment> {
    public final boolean isShowNavBar;
    public static final Parcelable.Creator<FavoriteVideoListFragmentData> CREATOR = new Parcelable.Creator<FavoriteVideoListFragmentData>() { // from class: X.7i3
        @Override // android.os.Parcelable.Creator
        public final FavoriteVideoListFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new FavoriteVideoListFragmentData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteVideoListFragmentData[] newArray(int i) {
            return new FavoriteVideoListFragmentData[i];
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
        out.writeInt(this.isShowNavBar ? 1 : 0);
    }

    public FavoriteVideoListFragmentData(boolean z) {
        this.isShowNavBar = z;
    }
}
