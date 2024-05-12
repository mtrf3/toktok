package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HII implements Parcelable.Creator<CreationConfigModelCompat> {
    @Override // android.os.Parcelable.Creator
    public final CreationConfigModelCompat createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new CreationConfigModelCompat();
    }

    @Override // android.os.Parcelable.Creator
    public final CreationConfigModelCompat[] newArray(int i) {
        return new CreationConfigModelCompat[i];
    }
}
