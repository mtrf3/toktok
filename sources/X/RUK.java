package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RUK implements Parcelable.Creator<GImage> {
    @Override // android.os.Parcelable.Creator
    public final GImage createFromParcel(Parcel in) {
        Integer num;
        o.LJIIIZ(in, "in");
        Integer num2 = null;
        if (in.readInt() != 0) {
            num = Integer.valueOf(in.readInt());
        } else {
            num = null;
        }
        if (in.readInt() != 0) {
            num2 = Integer.valueOf(in.readInt());
        }
        return new GImage(num, num2, in.readString(), in.readString(), in.createStringArrayList(), in.readString(), in.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final GImage[] newArray(int i) {
        return new GImage[i];
    }
}
