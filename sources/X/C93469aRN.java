package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.album.EditMedia;
import kotlin.jvm.internal.o;

/* renamed from: X.aRN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93469aRN implements Parcelable.Creator<EditMedia> {
    @Override // android.os.Parcelable.Creator
    public final EditMedia createFromParcel(Parcel in) {
        boolean z;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EditMedia(readString, z);
    }

    @Override // android.os.Parcelable.Creator
    public final EditMedia[] newArray(int i) {
        return new EditMedia[i];
    }
}
