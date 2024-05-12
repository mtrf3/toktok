package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaLiveSeekableRange;

/* renamed from: X.ZWi, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90064ZWi implements Parcelable.Creator<MediaLiveSeekableRange> {
    @Override // android.os.Parcelable.Creator
    public final MediaLiveSeekableRange createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            z2 = C67315QbP.LJIILIIL(parcel, readInt);
                        }
                    } else {
                        z = C67315QbP.LJIILIIL(parcel, readInt);
                    }
                } else {
                    j2 = C67315QbP.LJJ(parcel, readInt);
                }
            } else {
                j = C67315QbP.LJJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaLiveSeekableRange(j, j2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaLiveSeekableRange[] newArray(int i) {
        return new MediaLiveSeekableRange[i];
    }
}
