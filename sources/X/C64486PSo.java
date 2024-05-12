package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordBeautyConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.PSo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64486PSo implements Parcelable.Creator<RecordBeautyConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordBeautyConfigModel createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
        boolean z2 = false;
        Boolean bool2 = null;
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z2 = true;
            }
            bool2 = Boolean.valueOf(z2);
        }
        return new RecordBeautyConfigModel(bool, bool2);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordBeautyConfigModel[] newArray(int i) {
        return new RecordBeautyConfigModel[i];
    }
}
