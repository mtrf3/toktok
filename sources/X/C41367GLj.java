package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.jvm.internal.o;

/* renamed from: X.GLj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41367GLj implements Parcelable.Creator<PublishFailureReason> {
    @Override // android.os.Parcelable.Creator
    public final PublishFailureReason createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        C41759GaB c41759GaB = (C41759GaB) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new PublishFailureReason(c41759GaB, z, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PublishFailureReason[] newArray(int i) {
        return new PublishFailureReason[i];
    }
}
