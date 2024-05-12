package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.internal.wallet.zzq;

/* renamed from: X.QbQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67316QbQ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            bArr = C67315QbP.LIZJ(parcel, readInt);
                        }
                    } else {
                        remoteViews = (RemoteViews) C67315QbP.LJI(parcel, readInt, RemoteViews.CREATOR);
                    }
                } else {
                    iArr = C67315QbP.LIZLLL(parcel, readInt);
                }
            } else {
                strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzq(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
