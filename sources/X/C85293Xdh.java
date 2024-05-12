package X;

import Y.ARunnableS51S0100000_15;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.Xdh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85293Xdh implements F67 {
    public static final C85293Xdh LJLIL = new C85293Xdh();

    @Override // X.F67
    public final void onChanged() {
        C85292Xdg c85292Xdg = C85292Xdg.LJLIL;
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C38995FSd.LJFF().execute(new ARunnableS51S0100000_15(c85292Xdg, 83));
        } else {
            c85292Xdg.invoke();
        }
    }
}
