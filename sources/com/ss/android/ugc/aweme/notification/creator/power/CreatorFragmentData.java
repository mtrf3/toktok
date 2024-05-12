package com.ss.android.ugc.aweme.notification.creator.power;

import X.C57089Mar;
import X.C78966Uyw;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorFragmentData extends PowerViewPagerFragmentItem<CreatorNoticeResultFragment> {
    public static final Parcelable.Creator<CreatorFragmentData> CREATOR = new C57089Mar();
    public final int index;

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.index)};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreatorFragmentData) {
            return C78966Uyw.LJIIIZ(((CreatorFragmentData) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CreatorFragmentData:%s", LIZ());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.index);
    }

    public CreatorFragmentData(int i) {
        this.index = i;
    }
}
