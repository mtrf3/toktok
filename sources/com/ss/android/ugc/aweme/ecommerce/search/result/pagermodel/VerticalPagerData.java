package com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel;

import X.C78966Uyw;
import X.KAK;
import X.KE9;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.EcSearchPagerItem;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class VerticalPagerData extends PowerViewPagerFragmentItem<EcSearchPagerItem> {
    public static final Parcelable.Creator<VerticalPagerData> CREATOR = new KE9();
    public final int pageIndex;
    public final KAK pageName;

    public final Object[] LIZ() {
        return new Object[]{this.pageName, Integer.valueOf(this.pageIndex)};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalPagerData) {
            return C78966Uyw.LJIIIZ(((VerticalPagerData) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("VerticalPagerData:%s,%s", LIZ());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.pageName.name());
        out.writeInt(this.pageIndex);
    }

    public VerticalPagerData(KAK pageName, int i) {
        o.LJIIIZ(pageName, "pageName");
        this.pageName = pageName;
        this.pageIndex = i;
    }
}
