package X;

import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Pwb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66081Pwb implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public RunnableC66081Pwb(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    public final void LIZ() {
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZIZ = C66083Pwd.LIZIZ(((ApiStatistics) ListProtector.get(C66083Pwd.LIZJ, this.LJLIL)).type, Integer.valueOf(this.LJLIL), Boolean.valueOf(PQ0.LJFF()), this.LJLILLLLZI);
        InterfaceC66048Pw4 interfaceC66048Pw4 = C66083Pwd.LIZIZ;
        interfaceC66048Pw4.putLong(LIZIZ, interfaceC66048Pw4.getLong(LIZIZ) + 1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
