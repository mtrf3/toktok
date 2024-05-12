package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.QzY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68812QzY extends C68811QzX implements R04 {
    @Override // X.R04
    public final int LIZJ() {
        Parcel LJLJI = LJLJI(LLJI(), 17);
        int readInt = LJLJI.readInt();
        LJLJI.recycle();
        return readInt;
    }

    @Override // X.R04
    public final LatLng LJII() {
        LatLng createFromParcel;
        Parcel LJLJI = LJLJI(LLJI(), 4);
        Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
        if (LJLJI.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(LJLJI);
        }
        LatLng latLng = createFromParcel;
        LJLJI.recycle();
        return latLng;
    }

    @Override // X.R04
    public final String LJIIJ() {
        Parcel LJLJI = LJLJI(LLJI(), 6);
        String readString = LJLJI.readString();
        LJLJI.recycle();
        return readString;
    }

    @Override // X.R04
    public final void LJIILLIIL() {
        LLJJIII(LLJI(), 1);
    }

    @Override // X.R04
    public final void LJJJ() {
        LLJJIII(LLJI(), 11);
    }

    @Override // X.R04
    public final boolean LJJJJI() {
        boolean z;
        Parcel LJLJI = LJLJI(LLJI(), 13);
        if (LJLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LJLJI.recycle();
        return z;
    }

    public C68812QzY(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // X.R04
    public final void LJLLLLLL(BinderC68153Qov binderC68153Qov) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        LLJJIII(LLJI, 29);
    }

    @Override // X.R04
    public final boolean LJLZ(R04 r04) {
        boolean z;
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r04);
        Parcel LJLJI = LJLJI(LLJI, 16);
        if (LJLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LJLJI.recycle();
        return z;
    }

    @Override // X.R04
    public final void LLIZLLLIL(LatLng latLng) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, latLng);
        LLJJIII(LLJI, 3);
    }

    @Override // X.R04
    public final void LLJJJJJIL(String str) {
        Parcel LLJI = LLJI();
        LLJI.writeString(str);
        LLJJIII(LLJI, 5);
    }

    @Override // X.R04
    public final void LLLIILIL(float f) {
        Parcel LLJI = LLJI();
        LLJI.writeFloat(f);
        LLJJIII(LLJI, 27);
    }

    @Override // X.R04
    public final void LLLILZLLLI(InterfaceC68163Qp5 interfaceC68163Qp5) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, interfaceC68163Qp5);
        LLJJIII(LLJI, 18);
    }

    @Override // X.R04
    public final void o(float f, float f2) {
        Parcel LLJI = LLJI();
        LLJI.writeFloat(f);
        LLJI.writeFloat(f2);
        LLJJIII(LLJI, 19);
    }
}
