package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TA7 implements Parcelable.Creator<EditImage> {
    @Override // android.os.Parcelable.Creator
    public final EditImage createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EditImage((android.net.Uri) parcel.readParcelable(EditImage.class.getClassLoader()), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final EditImage[] newArray(int i) {
        return new EditImage[i];
    }
}
