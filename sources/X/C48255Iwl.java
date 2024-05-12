package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.VideoInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Iwl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48255Iwl implements Parcelable.Creator<VideoInfo> {
    @Override // android.os.Parcelable.Creator
    public final VideoInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new VideoInfo(readString, readString2, valueOf, valueOf2, valueOf3, readString3, readString4, valueOf4, num);
    }

    @Override // android.os.Parcelable.Creator
    public final VideoInfo[] newArray(int i) {
        return new VideoInfo[i];
    }
}
