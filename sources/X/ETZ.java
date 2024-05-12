package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.player.CutSameVideoConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ETZ implements Parcelable.Creator<CutSameVideoConfig> {
    @Override // android.os.Parcelable.Creator
    public final CutSameVideoConfig createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new CutSameVideoConfig(readInt, readString, z);
    }

    @Override // android.os.Parcelable.Creator
    public final CutSameVideoConfig[] newArray(int i) {
        return new CutSameVideoConfig[i];
    }
}
