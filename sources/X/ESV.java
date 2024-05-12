package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ESV implements Parcelable.Creator<BackgroundVideo> {
    @Override // android.os.Parcelable.Creator
    public final BackgroundVideo createFromParcel(Parcel in) {
        boolean z;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        long readLong = in.readLong();
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new BackgroundVideo(readString, readString2, readLong, z, in.readLong(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BackgroundVideo[] newArray(int i) {
        return new BackgroundVideo[i];
    }
}
