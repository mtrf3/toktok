package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ga0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41748Ga0 implements Parcelable.Creator<AIGCInfo> {
    @Override // android.os.Parcelable.Creator
    public final AIGCInfo createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new AIGCInfo(readInt, z, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final AIGCInfo[] newArray(int i) {
        return new AIGCInfo[i];
    }
}
