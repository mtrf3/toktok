package X;

import Y.ACallableS107S0100000_4;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9XU, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9XU {
    public static final List<C9NF> LIZ = new ArrayList();

    public static void LIZJ(G27 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) LIZ).add(new C9NF(-listener.hashCode(), new WeakReference(listener)));
    }

    public static void LIZLLL(G27 listener) {
        WeakReference<G27> weakReference;
        G27 g27;
        o.LJIIIZ(listener, "listener");
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            C9NF c9nf = (C9NF) it.next();
            if (c9nf == null || (weakReference = c9nf.LIZIZ) == null || (g27 = weakReference.get()) == null || o.LJ(listener, g27)) {
                it.remove();
                return;
            }
        }
    }

    public static void LIZ(int i, G27 listener) {
        o.LJIIIZ(listener, "listener");
        C9NF c9nf = new C9NF(i, new WeakReference(listener));
        if (!C77357UXp.LJJIIJZLJL()) {
            C10K.LIZIZ(new ACallableS107S0100000_4(c9nf, 3), C10K.LJIIIIZZ, null);
        } else {
            ((ArrayList) LIZ).add(c9nf);
        }
    }

    public static void LIZIZ(Activity targetActivity, G27 listener) {
        o.LJIIIZ(targetActivity, "targetActivity");
        o.LJIIIZ(listener, "listener");
        LIZ(targetActivity.hashCode(), listener);
    }
}
