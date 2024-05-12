package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import kotlin.jvm.internal.o;

/* renamed from: X.HdT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44511HdT implements Parcelable.Creator<DiyPropUploadVideoAutoCutConfigure> {
    @Override // android.os.Parcelable.Creator
    public final DiyPropUploadVideoAutoCutConfigure createFromParcel(Parcel in) {
        boolean z;
        o.LJIIIZ(in, "in");
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new DiyPropUploadVideoAutoCutConfigure(z, in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readLong(), in.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final DiyPropUploadVideoAutoCutConfigure[] newArray(int i) {
        return new DiyPropUploadVideoAutoCutConfigure[i];
    }
}
