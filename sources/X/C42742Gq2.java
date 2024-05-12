package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import kotlin.jvm.internal.o;

/* renamed from: X.Gq2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42742Gq2 implements Parcelable.Creator<AnchorIcon> {
    @Override // android.os.Parcelable.Creator
    public final AnchorIcon createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AnchorIcon(parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final AnchorIcon[] newArray(int i) {
        return new AnchorIcon[i];
    }
}
