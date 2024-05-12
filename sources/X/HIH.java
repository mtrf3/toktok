package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIH implements Parcelable.Creator<CreationComposerDsl> {
    @Override // android.os.Parcelable.Creator
    public final CreationComposerDsl createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new CreationComposerDsl();
    }

    @Override // android.os.Parcelable.Creator
    public final CreationComposerDsl[] newArray(int i) {
        return new CreationComposerDsl[i];
    }
}
