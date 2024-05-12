package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Hashtag;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BIE implements Parcelable.Creator<Hashtag> {
    @Override // android.os.Parcelable.Creator
    public final Hashtag createFromParcel(Parcel in) {
        Long l;
        o.LJIIIZ(in, "in");
        if (in.readInt() != 0) {
            l = Long.valueOf(in.readLong());
        } else {
            l = null;
        }
        return new Hashtag(l, in.readString(), (ImageModel) in.readParcelable(Hashtag.class.getClassLoader()), in.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Hashtag[] newArray(int i) {
        return new Hashtag[i];
    }
}
