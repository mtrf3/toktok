package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.LmQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55258LmQ extends AbstractC65781Prl implements InterfaceC65784Pro<C55259LmR> {
    public static final C55258LmQ INSTANCE = new C55258LmQ();

    public C55258LmQ() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final C55259LmR invoke() {
        C60741Nsf LJIIJJI = T2R.LJIIJJI();
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        return new C55259LmR(MBE.LIZ(LJIIJJI, EXR.LIZIZ(C1A7.LIZLLL(LLJJJJ, true), "fast-main")));
    }
}
