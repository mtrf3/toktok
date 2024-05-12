package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordSwapConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.PSj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64481PSj implements Parcelable.Creator<RecordSwapConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordSwapConfigModel createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
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
        return new RecordSwapConfigModel(bool, in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RecordSwapConfigModel[] newArray(int i) {
        return new RecordSwapConfigModel[i];
    }
}
