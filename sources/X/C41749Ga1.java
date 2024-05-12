package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ga1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41749Ga1 implements Parcelable.Creator<PrivacySettingModel> {
    @Override // android.os.Parcelable.Creator
    public final PrivacySettingModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new PrivacySettingModel(readInt, z, AIGCInfo.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final PrivacySettingModel[] newArray(int i) {
        return new PrivacySettingModel[i];
    }
}
