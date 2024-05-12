package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelFigure;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27509Aqv implements Parcelable.Creator<ModelFigure> {
    @Override // android.os.Parcelable.Creator
    public final ModelFigure createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ModelFigure(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ModelFigure[] newArray(int i) {
        return new ModelFigure[i];
    }
}
