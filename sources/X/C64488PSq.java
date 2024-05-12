package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordFlashConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.PSq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64488PSq implements Parcelable.Creator<RecordFlashConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final RecordFlashConfigModel createFromParcel(Parcel in) {
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
        return new RecordFlashConfigModel(bool);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordFlashConfigModel[] newArray(int i) {
        return new RecordFlashConfigModel[i];
    }
}
