package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordTabConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.PSr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64489PSr implements Parcelable.Creator<RecordTabConfig> {
    @Override // android.os.Parcelable.Creator
    public final RecordTabConfig createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        String readString = in.readString();
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
        return new RecordTabConfig(readInt, readString, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordTabConfig[] newArray(int i) {
        return new RecordTabConfig[i];
    }
}
