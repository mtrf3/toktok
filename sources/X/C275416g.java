package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.als.AlsLogicContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.16g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C275416g {
    public final AlsLogicContainer LIZ;

    public final void LIZIZ() {
        final AlsLogicContainer alsLogicContainer = this.LIZ;
        alsLogicContainer.getClass();
        C0I2.LIZ();
        if (alsLogicContainer.LJLIL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            alsLogicContainer.LJLL = true;
        }
        alsLogicContainer.LJLLJ.LIZJ(C0I8.class, null, alsLogicContainer.LJLLILLLL);
        C82622Wbi LIZ = alsLogicContainer.LJLLJ.LIZ();
        InterfaceC82629Wbp interfaceC82629Wbp = LIZ.LIZ;
        o.LJIIIIZZ(interfaceC82629Wbp, "this.name");
        interfaceC82629Wbp.LIZIZ(alsLogicContainer.LJZI);
        alsLogicContainer.LJLLL = LIZ;
        List<C29841Fc> list = alsLogicContainer.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0I7 c0i7 = ((C29841Fc) next).LJLJJI;
            if (c0i7 == C0I7.LAZY || c0i7 == C0I7.FORCE_LAZY) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            LifecycleRegistry lifecycleRegistry = alsLogicContainer.LJLJLJ.LJLIL.LJLJLLL;
            o.LJIIIIZZ(lifecycleRegistry, "timingLifeCycleOwner.lifecycle");
            if (!lifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                alsLogicContainer.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_START);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                final C29841Fc c29841Fc = (C29841Fc) it2.next();
                final Class<AbstractC29891Fh<?>> cls = c29841Fc.LJLIL;
                InterfaceC77386UYs<AbstractC29891Fh<?>> interfaceC77386UYs = new InterfaceC77386UYs<AbstractC29891Fh<?>>() { // from class: X.1FZ
                    @Override // X.InterfaceC77386UYs
                    public final void LIZ(Class instanceClass, Object obj, boolean z) {
                        AbstractC29891Fh<?> abstractC29891Fh = (AbstractC29891Fh) obj;
                        o.LJIIIZ(instanceClass, "instanceClass");
                        C82622Wbi c82622Wbi = AlsLogicContainer.this.LJLLL;
                        if (c82622Wbi != null) {
                            c82622Wbi.LJIIL(new C83683Qe(null, cls), this);
                        }
                        if (c29841Fc.LJLJJI == C0I7.FORCE_LAZY) {
                            AlsLogicContainer alsLogicContainer2 = AlsLogicContainer.this;
                            if (alsLogicContainer2.LJLL) {
                                if (alsLogicContainer2.LJLLI) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(cls.getName());
                                    LIZ2.append(" is registered with AttachOption.FORCE_LAZY, it can not be created in ");
                                    throw new RuntimeException(JBR.LJFF(LIZ2, AlsLogicContainer.this.LJLLLL, " lifecycle method", LIZ2)) { // from class: X.00a
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(message);
                                            o.LJIIIZ(message, "message");
                                        }
                                    };
                                }
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(cls.getName());
                                LIZ3.append(" is registered with AttachOption.FORCE_LAZY, it can not be created before ");
                                throw new RuntimeException(JBR.LJFF(LIZ3, AlsLogicContainer.this.LJLLLL, " lifecycle method", LIZ3)) { // from class: X.00Z
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(message);
                                        o.LJIIIZ(message, "message");
                                    }
                                };
                            }
                        }
                        if (AlsLogicContainer.this.LJZ.LIZIZ) {
                            Class clazz = cls;
                            o.LJIIIZ(clazz, "clazz");
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Lazy component ");
                            LIZ4.append(clazz.getName());
                            LIZ4.append(" is created by following stack trace: \n");
                            X1D.LIZIZ(LIZ4);
                            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                            StackTraceElement[] stackTrace = LLLLIIIILLL.getStackTrace();
                            int length = stackTrace.length;
                            boolean z2 = false;
                            int i = 5;
                            for (int i2 = 3; i2 < length; i2++) {
                                StackTraceElement s = stackTrace[i2];
                                o.LJIIIIZZ(s, "s");
                                if (o.LJ(s.getClassName(), AbstractC82626Wbm.class.getName())) {
                                    z2 = true;
                                } else if (z2 && i > 0) {
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("\tat ");
                                    LIZ5.append(s.getClassName());
                                    LIZ5.append(".");
                                    LIZ5.append(s.getMethodName());
                                    LIZ5.append("(");
                                    LIZ5.append(s.getFileName());
                                    LIZ5.append(":");
                                    LIZ5.append(s.getLineNumber());
                                    LIZ5.append(")\n");
                                    X1D.LIZIZ(LIZ5);
                                    i--;
                                    if (i == 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (AlsLogicContainer.this.LJLIL.getCurrentState() != Lifecycle.State.DESTROYED) {
                            AlsLogicContainer.this.LIZ(abstractC29891Fh, c29841Fc);
                            return;
                        }
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append(cls.getName());
                        LIZ6.append(" is registered with AttachOption.LAZY or AttachOption.FORCE_LAZY, it can not be created after ");
                        throw new RuntimeException(JBR.LJFF(LIZ6, AlsLogicContainer.this.LJLLLL, " lifecycle onDestroy", LIZ6)) { // from class: X.00b
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(message);
                                o.LJIIIZ(message, "message");
                            }
                        };
                    }
                };
                C82622Wbi c82622Wbi = alsLogicContainer.LJLLL;
                if (c82622Wbi != null) {
                    c82622Wbi.LJIIJ(new C83683Qe(null, cls), interfaceC77386UYs);
                }
                final C0IB<Boolean> c0ib = c29841Fc.LJLJJL;
                if (c0ib != null && alsLogicContainer.LJ(c29841Fc.LJLILLLLZI) == null) {
                    c0ib.LIZIZ(alsLogicContainer.LJLJLJ, new InterfaceC29911Fj<Boolean>() { // from class: X.1ix
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                AlsLogicContainer alsLogicContainer2 = alsLogicContainer;
                                C29841Fc c29841Fc2 = c29841Fc;
                                if (alsLogicContainer2.LJLLL != null) {
                                    if (o.LJ(c29841Fc2.LJLILLLLZI, C0I6.class)) {
                                        C82622Wbi c82622Wbi2 = alsLogicContainer2.LJLLL;
                                        if (c82622Wbi2 != null) {
                                            c82622Wbi2.LJ(c29841Fc2.LJLIL, null);
                                        }
                                    } else {
                                        C82622Wbi c82622Wbi3 = alsLogicContainer2.LJLLL;
                                        if (c82622Wbi3 != null) {
                                            c82622Wbi3.LJ(c29841Fc2.LJLILLLLZI, null);
                                        }
                                    }
                                    C0IB.this.LJFF(this);
                                    return;
                                }
                                throw new RuntimeException("componentsInitTiming triggered but alsLogicContainer not stated") { // from class: X.00d
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(message);
                                        o.LJIIIZ(message, "message");
                                    }
                                };
                            }
                        }
                    });
                }
            }
        }
        if (alsLogicContainer.LJLL || !alsLogicContainer.LJZ.LIZ) {
            alsLogicContainer.LJFF();
        }
    }

    public C275416g(AlsLogicContainer alsLogicContainer) {
        this.LIZ = alsLogicContainer;
        C0I7 c0i7 = C0I7.IMMEDIATE;
        alsLogicContainer.LJLLJ.LIZLLL(C40691ij.class, null, new AbstractC82618Wbe<C40691ij>() { // from class: X.1gR
            @Override // X.AbstractC82618Wbe
            public final C40691ij LIZIZ(C82622Wbi container) {
                o.LJIIIZ(container, "container");
                return new C40691ij(container);
            }
        });
        alsLogicContainer.LJII(0, c0i7, alsLogicContainer.LIZLLL(C1EP.class, C40691ij.class), null, null, C40691ij.class, C1EP.class, null);
    }

    public static void LIZ(AbstractC29891Fh component, long j) {
        o.LJIIIZ(component, "component");
        component.afterInit$als_release(j);
    }
}
