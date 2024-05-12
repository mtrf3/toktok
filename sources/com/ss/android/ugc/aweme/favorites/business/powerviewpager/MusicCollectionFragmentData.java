package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.MusicCollectionFragmentData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MusicCollectionFragmentData extends PowerViewPagerFragmentItem<MusicCollectionFragment> {
    public final boolean lazyLoad;
    public static final Parcelable.Creator<MusicCollectionFragmentData> CREATOR = new Parcelable.Creator<MusicCollectionFragmentData>() { // from class: X.8Zj
        @Override // android.os.Parcelable.Creator
        public final MusicCollectionFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MusicCollectionFragmentData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicCollectionFragmentData[] newArray(int i) {
            return new MusicCollectionFragmentData[i];
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
        out.writeInt(this.lazyLoad ? 1 : 0);
    }

    public MusicCollectionFragmentData(boolean z) {
        this.lazyLoad = z;
    }
}
