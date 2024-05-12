package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.MCa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56412MCa<R> {
    public boolean LIZ;
    public InterfaceC73786Sxa<R, R> LIZIZ = MCZ.LJLIL;
    public boolean LIZJ = true;
    public boolean LIZLLL;
    public MBA LJ;
    public boolean LJFF;
    public InterfaceC73396SrI LJI;

    public C56412MCa() {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        EXR.LIZIZ(C1A7.LIZLLL(LLJJJJ, true), "fast-main");
    }

    public final void LIZ(InterfaceC88471Ynr<? super R, ? super R, Boolean> value) {
        o.LJIIIZ(value, "value");
        this.LIZIZ = new C56413MCb(value);
    }

    public final void LIZIZ(boolean z) {
        this.LIZJ = z;
        this.LIZLLL = true;
    }
}
