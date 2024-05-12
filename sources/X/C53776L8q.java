package X;

import Y.ARunnableS45S0100000_9;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.L8q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53776L8q implements F67 {
    public static final C53776L8q LJLIL = new C53776L8q();

    @Override // X.F67
    public final void onChanged() {
        C53774L8o c53774L8o = C53774L8o.LIZ;
        C53775L8p c53775L8p = C53775L8p.LJLIL;
        c53774L8o.getClass();
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            c53775L8p.invoke();
        } else {
            C1DH.LJJIJIIJI(new ARunnableS45S0100000_9((InterfaceC65784Pro) c53775L8p, 218));
        }
    }
}
