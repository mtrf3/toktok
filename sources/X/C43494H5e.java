package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.H5e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43494H5e implements Parcelable.Creator<VideoFileInfo> {
    @Override // android.os.Parcelable.Creator
    public final VideoFileInfo createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new VideoFileInfo(in.readInt(), in.readInt(), in.readLong(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final VideoFileInfo[] newArray(int i) {
        return new VideoFileInfo[i];
    }
}
