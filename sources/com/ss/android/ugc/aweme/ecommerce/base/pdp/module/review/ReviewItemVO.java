package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review;

import X.EnumC27721AuL;
import X.F9E;
import X.InterfaceC27632Asu;
import X.RXZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewItemVO extends F9E implements Parcelable, InterfaceC27632Asu {
    public static final Parcelable.Creator<ReviewItemVO> CREATOR = new RXZ();
    public int brickName;
    public final boolean needDivider;
    public final ReviewItemStruct reviewItemStruct;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.reviewItemStruct, Boolean.valueOf(this.needDivider)};
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.reviewItemStruct.writeToParcel(out, i);
        out.writeInt(this.needDivider ? 1 : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.brickName;
    }

    public ReviewItemVO(ReviewItemStruct reviewItemStruct, boolean z) {
        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
        this.reviewItemStruct = reviewItemStruct;
        this.needDivider = z;
        this.brickName = EnumC27721AuL.REVIEW.getValue();
    }
}
