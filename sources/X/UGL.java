package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGL implements Parcelable.Creator<LiveSubMediaModel> {
    @Override // android.os.Parcelable.Creator
    public final LiveSubMediaModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LiveSubMediaModel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final LiveSubMediaModel[] newArray(int i) {
        return new LiveSubMediaModel[i];
    }
}
