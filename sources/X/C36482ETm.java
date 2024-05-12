package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.PhotoSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.ETm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36482ETm implements Parcelable.Creator<PhotoSegment> {
    @Override // android.os.Parcelable.Creator
    public final PhotoSegment createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new PhotoSegment(in.readString(), in.readInt(), in.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final PhotoSegment[] newArray(int i) {
        return new PhotoSegment[i];
    }
}
