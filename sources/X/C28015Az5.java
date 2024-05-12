package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import kotlin.jvm.internal.o;

/* renamed from: X.Az5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28015Az5 implements Parcelable.Creator<DynamicSchema> {
    @Override // android.os.Parcelable.Creator
    public final DynamicSchema createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DynamicSchema(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicSchema[] newArray(int i) {
        return new DynamicSchema[i];
    }
}
