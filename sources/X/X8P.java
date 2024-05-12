package X;

import X.X8D;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class X8P<T extends X8D> implements X8D, Runnable {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJL;
    public final C36411bp LJLIL = new C36411bp((InterfaceC65784Pro) X8A.LJLIL);
    public final C36411bp LJLILLLLZI = new C36411bp((InterfaceC65784Pro) X8B.LJLIL);
    public final C36411bp LJLJI = new C36411bp((InterfaceC65784Pro) X89.LJLIL);
    public final T LJLJJI;
    public final X8X LJLJJL;
    public final Bundle LJLJJLL;

    static {
        TBV tbv = new TBV(C65352Pkq.LIZ(X8P.class), "owner", "getOwner()Landroid/app/Activity;");
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbv, new TBV(C65352Pkq.LIZ(X8P.class), "stubOwner", "getStubOwner()Landroidx/fragment/app/Fragment;"), new TBV(C65352Pkq.LIZ(X8P.class), "callback", "getCallback()Lcom/bytedance/ies/powerpreload/task/Task$Callback;")};
    }

    public void LIZ(Bundle bundle) {
    }

    public abstract Object LIZLLL();

    public final X8Q LJ() {
        return (X8Q) this.LJLJI.LIZIZ(LJLJL[2]);
    }

    @Override // X.X8D
    public final boolean enable(Bundle bundle) {
        return true;
    }

    public final void LIZIZ() {
        TaskTraceMetric LJJIIJZLJL;
        java.util.Set<Class<?>> keySet;
        X8R<?> x8r;
        TaskTraceMetric LJJIIJZLJL2;
        TaskTraceMetric LJJIIJZLJL3;
        TaskTraceMetric LJJIIJZLJL4;
        TaskTraceMetric LJJIIJZLJL5;
        TaskTraceMetric LJJIIJZLJL6;
        try {
            Bundle bundle = this.LJLJJLL;
            if (bundle != null && (LJJIIJZLJL6 = C78847Ux1.LJJIIJZLJL(bundle)) != null) {
                LJJIIJZLJL6.taskExecuteStartTime = SystemClock.elapsedRealtime();
            }
            Object LIZLLL = LIZLLL();
            Bundle bundle2 = this.LJLJJLL;
            if (bundle2 != null && (LJJIIJZLJL5 = C78847Ux1.LJJIIJZLJL(bundle2)) != null) {
                LJJIIJZLJL5.taskExecuteEndTime = SystemClock.elapsedRealtime();
            }
            if (LIZLLL != null) {
                X8N x8n = X8G.LIZ;
                if (x8n != null) {
                    HashMap<Class<?>, X8R<?>> hashMap = x8n.LJ;
                    if (hashMap != null && (keySet = hashMap.keySet()) != null) {
                        Iterator<Class<?>> it = keySet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Class<?> next = it.next();
                            if (next.isAssignableFrom(LIZLLL.getClass())) {
                                if (next != null) {
                                    X8N x8n2 = X8G.LIZ;
                                    if (x8n2 != null) {
                                        HashMap<Class<?>, X8R<?>> hashMap2 = x8n2.LJ;
                                        if (hashMap2 != null && (x8r = hashMap2.get(next)) != null) {
                                            try {
                                                Bundle bundle3 = this.LJLJJLL;
                                                if (bundle3 != null && (LJJIIJZLJL4 = C78847Ux1.LJJIIJZLJL(bundle3)) != null) {
                                                    LJJIIJZLJL4.shootStartTime = SystemClock.elapsedRealtime();
                                                }
                                                x8r.LIZ(LIZLLL, LJ());
                                                Bundle bundle4 = this.LJLJJLL;
                                                if (bundle4 != null && (LJJIIJZLJL3 = C78847Ux1.LJJIIJZLJL(bundle4)) != null) {
                                                    LJJIIJZLJL3.shootEndTime = SystemClock.elapsedRealtime();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                Bundle bundle5 = this.LJLJJLL;
                                                if (bundle5 != null && (LJJIIJZLJL2 = C78847Ux1.LJJIIJZLJL(bundle5)) != null) {
                                                    LJJIIJZLJL2.taskExecuteStartTime = 0L;
                                                    LJJIIJZLJL2.taskExecuteEndTime = 0L;
                                                    LJJIIJZLJL2.shootStartTime = 0L;
                                                    LJJIIJZLJL2.shootEndTime = 0L;
                                                }
                                                T t = this.LJLJJI;
                                                if (t instanceof X8M) {
                                                    ((X8M) t).handleException(e);
                                                    return;
                                                } else {
                                                    if (LJ() != null) {
                                                        X8Q LJ = LJ();
                                                        if (LJ != null) {
                                                            LJ.LIZ(e);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw e;
                                                }
                                            }
                                        }
                                        return;
                                    }
                                    o.LJIJI("config");
                                    throw null;
                                }
                            }
                        }
                    }
                    X8Q LJ2 = LJ();
                    if (LJ2 != null) {
                        LJ2.onSuccess(LIZLLL);
                        return;
                    }
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
        } catch (Exception e2) {
            Bundle bundle6 = this.LJLJJLL;
            if (bundle6 != null && (LJJIIJZLJL = C78847Ux1.LJJIIJZLJL(bundle6)) != null) {
                LJJIIJZLJL.taskExecuteStartTime = 0L;
                LJJIIJZLJL.taskExecuteEndTime = 0L;
                LJJIIJZLJL.shootStartTime = 0L;
                LJJIIJZLJL.shootEndTime = 0L;
            }
            T t2 = this.LJLJJI;
            if (t2 instanceof X8M) {
                ((X8M) t2).handleException(e2);
            } else {
                if (LJ() != null) {
                    X8Q LJ3 = LJ();
                    if (LJ3 == null) {
                        return;
                    }
                    LJ3.LIZ(e2);
                    return;
                }
                throw e2;
            }
        }
    }

    public void onDetach() {
        C36411bp c36411bp = this.LJLIL;
        InterfaceC74236TBo[] interfaceC74236TBoArr = LJLJL;
        if (c36411bp.LIZIZ(interfaceC74236TBoArr[0]) != null) {
            C36411bp c36411bp2 = this.LJLIL;
            InterfaceC74236TBo property = interfaceC74236TBoArr[0];
            c36411bp2.getClass();
            o.LJIIJ(property, "property");
            c36411bp2.LJLIL = new WeakReference(null);
        }
        if (this.LJLILLLLZI.LIZIZ(interfaceC74236TBoArr[1]) != null) {
            C36411bp c36411bp3 = this.LJLILLLLZI;
            InterfaceC74236TBo property2 = interfaceC74236TBoArr[1];
            c36411bp3.getClass();
            o.LJIIJ(property2, "property");
            c36411bp3.LJLIL = new WeakReference(null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Task(preload=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", relationData=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public X8P(T t, X8X x8x, Bundle bundle) {
        this.LJLJJI = t;
        this.LJLJJL = x8x;
        this.LJLJJLL = bundle;
    }
}
