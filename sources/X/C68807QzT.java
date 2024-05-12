package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.QzT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68807QzT extends C68811QzX implements InterfaceC68816Qzc {
    @Override // X.InterfaceC68816Qzc
    public final int LIZLLL() {
        Parcel LJLJI = LJLJI(LLJI(), 9);
        int readInt = LJLJI.readInt();
        LJLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC68816Qzc
    public final InterfaceC68803QzP LJ() {
        InterfaceC68803QzP c68806QzS;
        Parcel LJLJI = LJLJI(LLJI(), 4);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68806QzS = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof InterfaceC68803QzP) {
                c68806QzS = (InterfaceC68803QzP) queryLocalInterface;
            } else {
                c68806QzS = new C68806QzS(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68806QzS;
    }

    @Override // X.InterfaceC68816Qzc
    public final InterfaceC68819Qzf LJIIJJI() {
        InterfaceC68819Qzf c68810QzW;
        Parcel LJLJI = LJLJI(LLJI(), 5);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68810QzW = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof InterfaceC68819Qzf) {
                c68810QzW = (InterfaceC68819Qzf) queryLocalInterface;
            } else {
                c68810QzW = new C68810QzW(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68810QzW;
    }

    public C68807QzT(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // X.InterfaceC68816Qzc
    public final void LLJJ(BinderC68153Qov binderC68153Qov) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        LLJI.writeInt(12451000);
        LLJJIII(LLJI, 6);
    }

    @Override // X.InterfaceC68816Qzc
    public final R02 LLJJJJLIIL(BinderC68153Qov binderC68153Qov) {
        R02 c68808QzU;
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        Parcel LJLJI = LJLJI(LLJI, 2);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68808QzU = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (queryLocalInterface instanceof R02) {
                c68808QzU = (R02) queryLocalInterface;
            } else {
                c68808QzU = new C68808QzU(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68808QzU;
    }

    @Override // X.InterfaceC68816Qzc
    public final R03 LLJLL(BinderC68153Qov binderC68153Qov) {
        R03 c68809QzV;
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        Parcel LJLJI = LJLJI(LLJI, 8);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68809QzV = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (queryLocalInterface instanceof R03) {
                c68809QzV = (R03) queryLocalInterface;
            } else {
                c68809QzV = new C68809QzV(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68809QzV;
    }

    @Override // X.InterfaceC68816Qzc
    public final void Z(BinderC68153Qov binderC68153Qov, int i) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        LLJI.writeInt(i);
        LLJJIII(LLJI, 10);
    }
}
