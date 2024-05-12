package X;

import com.bytedance.common.utility.reflect.Reflect;
import java.io.InputStream;

/* renamed from: X.Pgk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65098Pgk extends X3T {
    public final /* synthetic */ InterfaceC37276Ek4 LIZ;
    public final /* synthetic */ InputStream LIZIZ;
    public final /* synthetic */ C64797Pbt LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C65208PiW LJ;
    public final /* synthetic */ C65206PiU LJFF;

    @Override // X.X5J
    public final int LIZ() {
        return this.LIZJ.LIZ.LIZIZ;
    }

    @Override // X.X3T
    public final String LJ() {
        return this.LJ.LJII;
    }

    @Override // X.X3T
    public final String LJFF() {
        return this.LJ.LIZLLL;
    }

    @Override // X.X5J
    public final void cancel() {
        C65206PiU c65206PiU = this.LJFF;
        InterfaceC37276Ek4 interfaceC37276Ek4 = this.LIZ;
        c65206PiU.getClass();
        if (interfaceC37276Ek4 != null) {
            try {
                if (!interfaceC37276Ek4.isCanceled()) {
                    interfaceC37276Ek4.cancel();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.X5F
    public final void end() {
        C65206PiU c65206PiU = this.LJFF;
        InterfaceC37276Ek4 interfaceC37276Ek4 = this.LIZ;
        c65206PiU.getClass();
        if (interfaceC37276Ek4 != null) {
            try {
                if (!interfaceC37276Ek4.isCanceled()) {
                    interfaceC37276Ek4.cancel();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.X5F
    public final InputStream LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.X3T
    public final String LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.X5J
    public final String LIZIZ(String str) {
        EJ6 LJIIIZ = C65083PgV.LJIIIZ(str, this.LIZJ.LIZ.LIZLLL);
        if (LJIIIZ != null) {
            return LJIIIZ.LIZIZ;
        }
        return null;
    }

    @Override // X.X3T
    public final void LJII(long j) {
        try {
            Reflect.on(this.LIZ).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
        } catch (Throwable unused) {
        }
    }

    public C65098Pgk(C65206PiU c65206PiU, InterfaceC37276Ek4 interfaceC37276Ek4, POG pog, C64797Pbt c64797Pbt, String str, C65208PiW c65208PiW) {
        this.LJFF = c65206PiU;
        this.LIZ = interfaceC37276Ek4;
        this.LIZIZ = pog;
        this.LIZJ = c64797Pbt;
        this.LIZLLL = str;
        this.LJ = c65208PiW;
    }
}
