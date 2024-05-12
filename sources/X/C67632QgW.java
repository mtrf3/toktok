package X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: X.QgW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67632QgW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 1000) {
                                    C67315QbP.LJJII(parcel, readInt);
                                } else {
                                    i = C67315QbP.LJIJJLI(parcel, readInt);
                                }
                            } else {
                                bArr = C67315QbP.LIZJ(parcel, readInt);
                            }
                        } else {
                            bundle = C67315QbP.LIZIZ(parcel, readInt);
                        }
                    } else {
                        i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    pendingIntent = (PendingIntent) C67315QbP.LJI(parcel, readInt, PendingIntent.CREATOR);
                }
            } else {
                i2 = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
