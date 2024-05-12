package com.ss.android.ugc.aweme.challenge.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeCollectListFragmentData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ChallengeCollectListFragmentData extends PowerViewPagerFragmentItem<ChallengeCollectListFragment> {
    public static final Parcelable.Creator<ChallengeCollectListFragmentData> CREATOR = new Parcelable.Creator<ChallengeCollectListFragmentData>() { // from class: X.8Zq
        @Override // android.os.Parcelable.Creator
        public final ChallengeCollectListFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ChallengeCollectListFragmentData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeCollectListFragmentData[] newArray(int i) {
            return new ChallengeCollectListFragmentData[i];
        }
    };
    public final boolean requestLazy;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.requestLazy ? 1 : 0);
    }

    public ChallengeCollectListFragmentData(boolean z) {
        this.requestLazy = z;
    }
}
