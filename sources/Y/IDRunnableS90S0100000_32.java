package Y;

import X.EnumC93240aNg;
import X.InterfaceC93239aNf;
import com.bytedance.pitaya.feature.ApplicationLifecycleWatcher;
import java.util.Iterator;

/* loaded from: classes30.dex */
public class IDRunnableS90S0100000_32 implements Runnable {
    public final int $t;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDRunnableS90S0100000_32 iDRunnableS90S0100000_32) {
        boolean LIZ;
        try {
            EnumC93240aNg enumC93240aNg = (EnumC93240aNg) iDRunnableS90S0100000_32.l0;
            ApplicationLifecycleWatcher applicationLifecycleWatcher = ApplicationLifecycleWatcher.LJLJI;
            if (enumC93240aNg != ApplicationLifecycleWatcher.LJLILLLLZI) {
                ApplicationLifecycleWatcher.LJLILLLLZI = enumC93240aNg;
                applicationLifecycleWatcher.getClass();
                Iterator<InterfaceC93239aNf> it = ApplicationLifecycleWatcher.LJLIL.iterator();
                while (it.hasNext()) {
                    InterfaceC93239aNf next = it.next();
                    ApplicationLifecycleWatcher applicationLifecycleWatcher2 = ApplicationLifecycleWatcher.LJLJI;
                    EnumC93240aNg enumC93240aNg2 = ApplicationLifecycleWatcher.LJLILLLLZI;
                    applicationLifecycleWatcher2.getClass();
                    ApplicationLifecycleWatcher.LIZ(next, enumC93240aNg2);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS90S0100000_32 iDRunnableS90S0100000_32) {
        boolean LIZ;
        try {
            ApplicationLifecycleWatcher applicationLifecycleWatcher = ApplicationLifecycleWatcher.LJLJI;
            InterfaceC93239aNf interfaceC93239aNf = (InterfaceC93239aNf) iDRunnableS90S0100000_32.l0;
            EnumC93240aNg enumC93240aNg = ApplicationLifecycleWatcher.LJLILLLLZI;
            applicationLifecycleWatcher.getClass();
            ApplicationLifecycleWatcher.LIZ(interfaceC93239aNf, enumC93240aNg);
            ApplicationLifecycleWatcher.LJLIL.add((InterfaceC93239aNf) iDRunnableS90S0100000_32.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS90S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
