package X;

import android.graphics.Bitmap;
import android.os.RemoteException;
import kotlin.jvm.internal.o;

/* renamed from: X.aQ8, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93392aQ8 implements InterfaceC199637sV {
    public final R0A LIZ;

    public C93392aQ8(R0A r0a) {
        this.LIZ = r0a;
    }

    @Override // X.InterfaceC199637sV
    public final InterfaceC199637sV LIZ(float f) {
        R0A r0a = this.LIZ;
        r0a.getClass();
        try {
            r0a.LIZ.LLLIILIL(f);
            return this;
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.InterfaceC199637sV
    public final InterfaceC199637sV LIZJ(Object tag) {
        o.LJIIIZ(tag, "tag");
        R0A r0a = this.LIZ;
        r0a.getClass();
        try {
            r0a.LIZ.LJLLLLLL(new BinderC68153Qov(tag));
            return this;
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.InterfaceC199637sV
    public final InterfaceC199637sV LIZLLL(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        R0A r0a = this.LIZ;
        C68772Qyu LJIILJJIL = C78949Uyf.LJIILJJIL(bitmap);
        r0a.getClass();
        try {
            r0a.LIZ.LLLILZLLLI(LJIILJJIL.LIZ);
            return this;
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.InterfaceC199637sV
    public final InterfaceC199637sV LIZIZ(float f, float f2) {
        R0A r0a = this.LIZ;
        r0a.getClass();
        try {
            r0a.LIZ.o(f, f2);
            return this;
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}
