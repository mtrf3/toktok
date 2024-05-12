package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9J implements Parcelable.Creator<PostBtnConfigure> {
    @Override // android.os.Parcelable.Creator
    public final PostBtnConfigure createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new PostBtnConfigure(z, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PostBtnConfigure[] newArray(int i) {
        return new PostBtnConfigure[i];
    }
}
