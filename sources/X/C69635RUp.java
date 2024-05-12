package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import kotlin.jvm.internal.o;

/* renamed from: X.RUp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69635RUp implements Parcelable.Creator<InteractiveUserTask> {
    @Override // android.os.Parcelable.Creator
    public final InteractiveUserTask createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new InteractiveUserTask(readString, readString2, readString3, readString4, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final InteractiveUserTask[] newArray(int i) {
        return new InteractiveUserTask[i];
    }
}
