package com.google.android.gms.common.data;

import X.C53251Kv9;
import X.C53252KvA;
import X.C67610QgA;
import X.C79057V0z;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

/* loaded from: classes12.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C67610QgA();
    public static final C53251Kv9 zaf = new C53252KvA(new String[0]);
    public final int LJLIL;
    public Bundle LJLILLLLZI;
    public int[] LJLJI;
    public boolean LJLJJI;
    public int zad;
    public final String[] zag;
    public final CursorWindow[] zah;
    public final int zai;
    public final Bundle zaj;
    public boolean zak = true;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zah;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void LJJJJL() {
        this.LJLILLLLZI = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i2 >= strArr.length) {
                break;
            }
            this.LJLILLLLZI.putInt(strArr[i2], i2);
            i2++;
        }
        this.LJLJI = new int[this.zah.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i < cursorWindowArr.length) {
                this.LJLJI[i] = i3;
                i3 += this.zah[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.zad = i3;
                return;
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.zak && this.zah.length > 0) {
                synchronized (this) {
                    z = this.LJLJJI;
                }
                if (!z) {
                    close();
                    new StringBuilder(String.valueOf(toString()).length() + 178);
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJL(parcel, 1, this.zag);
        C79057V0z.LJLIIIL(parcel, 2, this.zah, i);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zai);
        C79057V0z.LJJLI(parcel, 4, this.zaj);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.LJLIL = i;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i2;
        this.zaj = bundle;
    }
}
