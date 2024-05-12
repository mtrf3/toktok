package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GGL implements Parcelable.Creator<TCMPostPageSubmitTextModel> {
    @Override // android.os.Parcelable.Creator
    public final TCMPostPageSubmitTextModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TCMPostPageSubmitTextModel(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TCMPostPageSubmitTextModel[] newArray(int i) {
        return new TCMPostPageSubmitTextModel[i];
    }
}
