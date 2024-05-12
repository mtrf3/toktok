package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.BasicModelDsl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIE implements Parcelable.Creator<BasicModelDsl> {
    @Override // android.os.Parcelable.Creator
    public final BasicModelDsl createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new BasicModelDsl();
    }

    @Override // android.os.Parcelable.Creator
    public final BasicModelDsl[] newArray(int i) {
        return new BasicModelDsl[i];
    }
}
