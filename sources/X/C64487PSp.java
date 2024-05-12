package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordFilterConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.PSp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64487PSp implements Parcelable.Creator<RecordFilterConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordFilterConfigModel createFromParcel(Parcel in) {
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
        return new RecordFilterConfigModel(bool);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordFilterConfigModel[] newArray(int i) {
        return new RecordFilterConfigModel[i];
    }
}
