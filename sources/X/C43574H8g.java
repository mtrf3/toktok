package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H8g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43574H8g implements Parcelable.Creator<SmartCodecMobDataModel> {
    @Override // android.os.Parcelable.Creator
    public final SmartCodecMobDataModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new SmartCodecMobDataModel(z, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SmartCodecMobDataModel[] newArray(int i) {
        return new SmartCodecMobDataModel[i];
    }
}
