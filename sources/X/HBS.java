package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HBS implements Parcelable.Creator<LibraryVideo> {
    @Override // android.os.Parcelable.Creator
    public final LibraryVideo createFromParcel(Parcel in) {
        Long l;
        Long l2;
        Integer num;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        String readString3 = in.readString();
        Integer num2 = null;
        if (in.readInt() != 0) {
            l = Long.valueOf(in.readLong());
        } else {
            l = null;
        }
        if (in.readInt() != 0) {
            l2 = Long.valueOf(in.readLong());
        } else {
            l2 = null;
        }
        String readString4 = in.readString();
        String readString5 = in.readString();
        if (in.readInt() != 0) {
            num = Integer.valueOf(in.readInt());
        } else {
            num = null;
        }
        if (in.readInt() != 0) {
            num2 = Integer.valueOf(in.readInt());
        }
        return new LibraryVideo(readString, readString2, readString3, l, l2, readString4, readString5, num, num2);
    }

    @Override // android.os.Parcelable.Creator
    public final LibraryVideo[] newArray(int i) {
        return new LibraryVideo[i];
    }
}
