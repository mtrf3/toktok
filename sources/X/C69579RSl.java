package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DeleteImageResponseData;
import kotlin.jvm.internal.o;

/* renamed from: X.RSl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69579RSl implements Parcelable.Creator<DeleteImageResponseData> {
    @Override // android.os.Parcelable.Creator
    public final DeleteImageResponseData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DeleteImageResponseData(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DeleteImageResponseData[] newArray(int i) {
        return new DeleteImageResponseData[i];
    }
}
