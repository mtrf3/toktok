package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TTSAndVCRefIDsModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8N implements Parcelable.Creator<TTSAndVCRefIDsModel> {
    @Override // android.os.Parcelable.Creator
    public final TTSAndVCRefIDsModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TTSAndVCRefIDsModel(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final TTSAndVCRefIDsModel[] newArray(int i) {
        return new TTSAndVCRefIDsModel[i];
    }
}
