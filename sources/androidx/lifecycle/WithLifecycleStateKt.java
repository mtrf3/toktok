package androidx.lifecycle;

import X.AbstractC78621UtN;
import X.C141335gf;
import X.C16880lQ;
import X.C36636EZk;
import X.C3C5;
import X.C78555UsJ;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.MBB;
import X.X1D;
import X.XKS;
import X.XKW;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt {
    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.CREATED;
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withCreated$$forInline(Lifecycle lifecycle, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withResumed$$forInline(Lifecycle lifecycle, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withStarted$$forInline(Lifecycle lifecycle, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        if (C16880lQ.LLJJIJIL(state, Lifecycle.State.CREATED) >= 0) {
            AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
            boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                        return interfaceC65784Pro.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("target state must be CREATED or greater, found ");
        LIZ.append(state);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        if (C16880lQ.LLJJIJIL(state, Lifecycle.State.CREATED) >= 0) {
            C36636EZk.LIZ.LJJIJIL();
            throw null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("target state must be CREATED or greater, found ");
        LIZ.append(state);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                    return interfaceC65784Pro.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
    }

    public static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        C36636EZk.LIZ.LJJIJIL();
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        if (C16880lQ.LLJJIJIL(state, Lifecycle.State.CREATED) >= 0) {
            AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
            boolean isDispatchNeeded = LJJIJIL.isDispatchNeeded(interfaceC67352kd.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), state) >= 0) {
                        return interfaceC65784Pro.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, LJJIJIL, new IDqS420S0100000(interfaceC65784Pro, 6), interfaceC67352kd);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("target state must be CREATED or greater, found ");
        LIZ.append(state);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        if (C16880lQ.LLJJIJIL(state, Lifecycle.State.CREATED) >= 0) {
            C36636EZk.LIZ.LJJIJIL();
            throw null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("target state must be CREATED or greater, found ");
        LIZ.append(state);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.LifecycleObserver] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z, XKW xkw, final InterfaceC65784Pro<? extends R> interfaceC65784Pro, InterfaceC67352kd<? super R> interfaceC67352kd) {
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        final ?? r2 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object LIZ;
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.upTo(Lifecycle.State.this)) {
                    lifecycle.removeObserver(this);
                    InterfaceC67352kd interfaceC67352kd2 = xks;
                    try {
                        LIZ = interfaceC65784Pro.invoke();
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    interfaceC67352kd2.resumeWith(LIZ);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    InterfaceC67352kd interfaceC67352kd3 = xks;
                    Object LIZ2 = C141335gf.LIZ(new LifecycleDestroyedException());
                    C3C5.m7constructorimpl(LIZ2);
                    interfaceC67352kd3.resumeWith(LIZ2);
                }
            }
        };
        if (z) {
            xkw.dispatch(MBB.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1__run$___twin___() {
                    Lifecycle.this.addObserver(r2);
                }

                public static void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1) {
                    boolean LIZ;
                    try {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1.androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            lifecycle.addObserver(r2);
        }
        xks.LJIILIIL(new IDqS28S0300000(xkw, lifecycle, (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) r2, 2));
        return xks.LJIIJJI();
    }
}
