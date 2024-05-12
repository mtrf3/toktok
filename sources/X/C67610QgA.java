package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.QgA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67610QgA implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final DataHolder createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 1000) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                i = C67315QbP.LJIJJLI(parcel, readInt);
                            }
                        } else {
                            bundle = C67315QbP.LIZIZ(parcel, readInt);
                        }
                    } else {
                        i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) C67315QbP.LJIIJ(parcel, readInt, CursorWindow.CREATOR);
                }
            } else {
                strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.LJJJJL();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
