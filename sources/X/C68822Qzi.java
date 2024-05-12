package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: X.Qzi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68822Qzi extends C68811QzX implements InterfaceC68823Qzj {
    @Override // X.InterfaceC68823Qzj
    public final InterfaceC68835Qzv LJJIIZI() {
        InterfaceC68835Qzv c68826Qzm;
        Parcel LJLJI = LJLJI(LLJI(), 25);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68826Qzm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof InterfaceC68835Qzv) {
                c68826Qzm = (InterfaceC68835Qzv) queryLocalInterface;
            } else {
                c68826Qzm = new C68826Qzm(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68826Qzm;
    }

    @Override // X.InterfaceC68823Qzj
    public final InterfaceC68804QzQ LLLJIL() {
        InterfaceC68804QzQ c68805QzR;
        Parcel LJLJI = LJLJI(LLJI(), 26);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68805QzR = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof InterfaceC68804QzQ) {
                c68805QzR = (InterfaceC68804QzQ) queryLocalInterface;
            } else {
                c68805QzR = new C68805QzR(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68805QzR;
    }

    @Override // X.InterfaceC68823Qzj
    public final void clear() {
        LLJJIII(LLJI(), 14);
    }

    @Override // X.InterfaceC68823Qzj
    public final boolean e0() {
        Parcel LLJI = LLJI();
        boolean z = false;
        LLJI.writeInt(0);
        Parcel LJLJI = LJLJI(LLJI, 20);
        if (LJLJI.readInt() != 0) {
            z = true;
        }
        LJLJI.recycle();
        return z;
    }

    @Override // X.InterfaceC68823Qzj
    public final CameraPosition getCameraPosition() {
        CameraPosition createFromParcel;
        Parcel LJLJI = LJLJI(LLJI(), 1);
        Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
        if (LJLJI.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(LJLJI);
        }
        CameraPosition cameraPosition = createFromParcel;
        LJLJI.recycle();
        return cameraPosition;
    }

    public C68822Qzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // X.InterfaceC68823Qzj
    public final void H(InterfaceC68163Qp5 interfaceC68163Qp5) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, interfaceC68163Qp5);
        LLJJIII(LLJI, 4);
    }

    @Override // X.InterfaceC68823Qzj
    public final InterfaceC68838Qzy LJJLIL(CircleOptions circleOptions) {
        InterfaceC68838Qzy c68825Qzl;
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, circleOptions);
        Parcel LJLJI = LJLJI(LLJI, 35);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c68825Qzl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            if (queryLocalInterface instanceof InterfaceC68838Qzy) {
                c68825Qzl = (InterfaceC68838Qzy) queryLocalInterface;
            } else {
                c68825Qzl = new C68825Qzl(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c68825Qzl;
    }

    @Override // X.InterfaceC68823Qzj
    public final void LJJZZIII(R0H r0h) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0h);
        LLJJIII(LLJI, 30);
    }

    @Override // X.InterfaceC68823Qzj
    public final void LJLIIL(R0M r0m) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0m);
        LLJJIII(LLJI, 96);
    }

    @Override // X.InterfaceC68823Qzj
    public final void LJLIL(int i) {
        Parcel LLJI = LLJI();
        LLJI.writeInt(0);
        LLJI.writeInt(0);
        LLJI.writeInt(0);
        LLJI.writeInt(i);
        LLJJIII(LLJI, 39);
    }

    @Override // X.InterfaceC68823Qzj
    public final void LJLILLLLZI(R0U r0u) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0u);
        LLJJIII(LLJI, 42);
    }

    @Override // X.InterfaceC68823Qzj
    public final R04 LJLJJI(MarkerOptions markerOptions) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, markerOptions);
        Parcel LJLJI = LJLJI(LLJI, 11);
        R04 LLJI2 = AbstractBinderC68813QzZ.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }

    @Override // X.InterfaceC68823Qzj
    public final void LLIIIILZ(R0K r0k) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0k);
        LLJJIII(LLJI, 84);
    }

    @Override // X.InterfaceC68823Qzj
    public final boolean LLJJIJI(MapStyleOptions mapStyleOptions) {
        boolean z;
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, mapStyleOptions);
        Parcel LJLJI = LJLJI(LLJI, 91);
        if (LJLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LJLJI.recycle();
        return z;
    }

    @Override // X.InterfaceC68823Qzj
    public final void LLLFFI(R0J r0j) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0j);
        LLJJIII(LLJI, 32);
    }

    @Override // X.InterfaceC68823Qzj
    public final void LLLLIILLL(boolean z) {
        Parcel LLJI = LLJI();
        LLJI.writeInt(z ? 1 : 0);
        LLJJIII(LLJI, 41);
    }

    @Override // X.InterfaceC68823Qzj
    public final void LLLLLLIL(R0V r0v) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0v);
        LLJJIII(LLJI, 97);
    }

    @Override // X.InterfaceC68823Qzj
    public final void Q(R0Q r0q) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0q);
        LLJJIII(LLJI, 99);
    }

    @Override // X.InterfaceC68823Qzj
    public final void X(R0L r0l) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0l);
        LLJJIII(LLJI, 33);
    }

    @Override // X.InterfaceC68823Qzj
    public final void m(boolean z) {
        Parcel LLJI = LLJI();
        LLJI.writeInt(z ? 1 : 0);
        LLJJIII(LLJI, 22);
    }

    @Override // X.InterfaceC68823Qzj
    public final void y(R0I r0i) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, r0i);
        LLJJIII(LLJI, 31);
    }

    @Override // X.InterfaceC68823Qzj
    public final void LLI(InterfaceC68163Qp5 interfaceC68163Qp5, BinderC68831Qzr binderC68831Qzr) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, interfaceC68163Qp5);
        C68223Qq3.LIZJ(LLJI, binderC68831Qzr);
        LLJJIII(LLJI, 6);
    }

    @Override // X.InterfaceC68823Qzj
    public final void O(InterfaceC68163Qp5 interfaceC68163Qp5, int i, BinderC68831Qzr binderC68831Qzr) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, interfaceC68163Qp5);
        LLJI.writeInt(i);
        C68223Qq3.LIZJ(LLJI, binderC68831Qzr);
        LLJJIII(LLJI, 7);
    }
}
