package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.VideoInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.KOd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51631KOd implements Parcelable.Creator<Video> {
    @Override // android.os.Parcelable.Creator
    public final Video createFromParcel(Parcel parcel) {
        Double valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Double.valueOf(parcel.readDouble());
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(VideoInfo.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new Video(readString, valueOf, readString2, readString3, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Video[] newArray(int i) {
        return new Video[i];
    }
}
