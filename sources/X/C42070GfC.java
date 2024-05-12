package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.GfC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42070GfC implements Parcelable.Creator<DraftVideoSegment> {
    @Override // android.os.Parcelable.Creator
    public final DraftVideoSegment createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DraftVideoSegment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DraftVideoSegment[] newArray(int i) {
        return new DraftVideoSegment[i];
    }
}
