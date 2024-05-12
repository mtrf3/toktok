package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.StickerMobParams;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class X66 implements Parcelable.Creator<StickerMobParams> {
    @Override // android.os.Parcelable.Creator
    public final StickerMobParams createFromParcel(Parcel in) {
        boolean z;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        int readInt = in.readInt();
        String readString3 = in.readString();
        String readString4 = in.readString();
        String readString5 = in.readString();
        String readString6 = in.readString();
        boolean z2 = false;
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (in.readInt() != 0) {
            z2 = true;
        }
        return new StickerMobParams(readString, readString2, readInt, readString3, readString4, readString5, readString6, z, z2, in.readString(), in.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final StickerMobParams[] newArray(int i) {
        return new StickerMobParams[i];
    }
}
