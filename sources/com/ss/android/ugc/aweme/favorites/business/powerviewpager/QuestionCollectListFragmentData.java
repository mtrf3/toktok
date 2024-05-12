package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.QuestionCollectListFragmentData;
import com.ss.android.ugc.aweme.favorites.business.question.QuestionCollectListFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QuestionCollectListFragmentData extends PowerViewPagerFragmentItem<QuestionCollectListFragment> {
    public static final Parcelable.Creator<QuestionCollectListFragmentData> CREATOR = new Parcelable.Creator<QuestionCollectListFragmentData>() { // from class: X.7SR
        @Override // android.os.Parcelable.Creator
        public final QuestionCollectListFragmentData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            parcel.readInt();
            return new QuestionCollectListFragmentData();
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionCollectListFragmentData[] newArray(int i) {
            return new QuestionCollectListFragmentData[i];
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
