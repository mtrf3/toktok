package com.ss.android.ugc.aweme.notification.creator.power;

import X.C57088Maq;
import X.C78966Uyw;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.notification.creator.CreatorNoticeAllTabResultFragment;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorAllTabFragmentData extends PowerViewPagerFragmentItem<CreatorNoticeAllTabResultFragment> {
    public static final Parcelable.Creator<CreatorAllTabFragmentData> CREATOR = new C57088Maq();
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
        if (obj instanceof CreatorAllTabFragmentData) {
            return C78966Uyw.LJIIIZ(((CreatorAllTabFragmentData) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CreatorAllTabFragmentData:%s", LIZ());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.index);
    }

    public CreatorAllTabFragmentData(int i) {
        this.index = i;
    }
}
