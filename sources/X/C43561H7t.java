package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.GreenScreenEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43561H7t implements Parcelable.Creator<GreenScreenEffectModel> {
    @Override // android.os.Parcelable.Creator
    public final GreenScreenEffectModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new GreenScreenEffectModel(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final GreenScreenEffectModel[] newArray(int i) {
        return new GreenScreenEffectModel[i];
    }
}
