package androidx.databinding;

import X.AbstractC024207q;
import X.AbstractC024907x;
import X.C023707l;
import X.C023907n;
import X.C024107p;
import X.C024307r;
import X.C16880lQ;
import X.C28581Ag;
import X.C28601Ai;
import X.ChoreographerFrameCallbackC025007y;
import X.InterfaceC024507t;
import X.InterfaceC06750Oh;
import X.ViewOnAttachStateChangeListenerC023807m;
import Y.IDRunnableS85S0100000;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends C28601Ai implements InterfaceC06750Oh {
    public static final boolean LJLLLLLL = true;
    public final IDRunnableS85S0100000 LJLIL;
    public boolean LJLILLLLZI;
    public final C024107p[] LJLJI;
    public final View LJLJJI;
    public C024307r<AbstractC024907x, ViewDataBinding, Void> LJLJJL;
    public boolean LJLJJLL;
    public final Choreographer LJLJL;
    public final ChoreographerFrameCallbackC025007y LJLJLJ;
    public final Handler LJLJLLL;
    public final InterfaceC024507t LJLL;
    public ViewDataBinding LJLLI;
    public LifecycleOwner LJLLILLLL;
    public OnStartListener LJLLJ;
    public boolean LJLLL;
    public static final int LJLLLL = Build.VERSION.SDK_INT;
    public static final C023707l LJLZ = new C023707l();
    public static final C28581Ag LJZ = new AbstractC024207q<AbstractC024907x, ViewDataBinding, Void>() { // from class: X.1Ag
        @Override // X.AbstractC024207q
        public final void LIZ(int i, Object obj, Object obj2) {
            AbstractC024907x abstractC024907x = (AbstractC024907x) obj;
            ViewDataBinding viewDataBinding = (ViewDataBinding) obj2;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    abstractC024907x.LIZ(viewDataBinding);
                    return;
                }
                abstractC024907x.getClass();
                return;
            }
            abstractC024907x.getClass();
        }
    };
    public static final ReferenceQueue<ViewDataBinding> LJZI = new ReferenceQueue<>();
    public static final ViewOnAttachStateChangeListenerC023807m LJZL = new View.OnAttachStateChangeListener() { // from class: X.07m
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding viewDataBinding;
            if (view != null) {
                viewDataBinding = (ViewDataBinding) view.getTag(R.id.c3j);
            } else {
                viewDataBinding = null;
            }
            viewDataBinding.LJLIL.run();
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* loaded from: classes.dex */
    public static class OnStartListener implements GenericLifecycleObserver {
        public final WeakReference<ViewDataBinding> LJLIL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                onStart();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.LJLIL.get();
            if (viewDataBinding != null) {
                viewDataBinding.LJI();
            }
        }

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.LJLIL = new WeakReference<>(viewDataBinding);
        }
    }

    public abstract void LIZLLL();

    public abstract boolean LJII();

    public abstract void LJIIIIZZ();

    public abstract boolean LJIIJJI(int i, int i2, Object obj);

    public final void LJ() {
        if (this.LJLJJLL) {
            LJIILIIL();
            return;
        }
        if (!LJII()) {
            return;
        }
        this.LJLJJLL = true;
        C024307r<AbstractC024907x, ViewDataBinding, Void> c024307r = this.LJLJJL;
        if (c024307r != null) {
            c024307r.LIZJ(1, this);
        }
        LIZLLL();
        C024307r<AbstractC024907x, ViewDataBinding, Void> c024307r2 = this.LJLJJL;
        if (c024307r2 != null) {
            c024307r2.LIZJ(3, this);
        }
        this.LJLJJLL = false;
    }

    public final void LJI() {
        ViewDataBinding viewDataBinding = this.LJLLI;
        if (viewDataBinding == null) {
            LJ();
        } else {
            viewDataBinding.LJI();
        }
    }

    public final void LJIILIIL() {
        ViewDataBinding viewDataBinding = this.LJLLI;
        if (viewDataBinding != null) {
            viewDataBinding.LJIILIIL();
            return;
        }
        LifecycleOwner lifecycleOwner = this.LJLLILLLL;
        if (lifecycleOwner != null && !lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        synchronized (this) {
            if (!this.LJLILLLLZI) {
                this.LJLILLLLZI = true;
                if (LJLLLLLL) {
                    this.LJLJL.postFrameCallback(this.LJLJLJ);
                } else {
                    this.LJLJLLL.post(this.LJLIL);
                }
            }
        }
    }

    @Override // X.InterfaceC06750Oh
    public final View getRoot() {
        return this.LJLJJI;
    }

    public static InterfaceC024507t LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC024507t) {
            return (InterfaceC024507t) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = this.LJLLILLLL;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.LJLLJ);
        }
        this.LJLLILLLL = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.LJLLJ == null) {
                this.LJLLJ = new OnStartListener(this);
            }
            lifecycleOwner.getLifecycle().addObserver(this.LJLLJ);
        }
        for (C024107p c024107p : this.LJLJI) {
            if (c024107p != null) {
                c024107p.LIZ.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public final void LJIILL(int i, MutableLiveData mutableLiveData) {
        this.LJLLL = true;
        try {
            C023707l c023707l = LJLZ;
            if (mutableLiveData == null) {
                C024107p c024107p = this.LJLJI[i];
                if (c024107p != null) {
                    c024107p.LIZ();
                }
            } else {
                C024107p c024107p2 = this.LJLJI[i];
                if (c024107p2 == null) {
                    LJIIL(i, mutableLiveData, c023707l);
                } else if (c024107p2.LIZJ != mutableLiveData) {
                    c024107p2.LIZ();
                    LJIIL(i, mutableLiveData, c023707l);
                }
            }
        } finally {
            this.LJLLL = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.07y] */
    public ViewDataBinding(int i, View view, Object obj) {
        InterfaceC024507t LIZIZ = LIZIZ(obj);
        this.LJLIL = new IDRunnableS85S0100000(this, 15);
        this.LJLILLLLZI = false;
        this.LJLL = LIZIZ;
        this.LJLJI = new C024107p[i];
        this.LJLJJI = view;
        if (Looper.myLooper() != null) {
            if (LJLLLLLL) {
                this.LJLJL = C16880lQ.LLIIIJ();
                this.LJLJLJ = new Choreographer.FrameCallback() { // from class: X.07y
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        ViewDataBinding.this.LJLIL.run();
                    }
                };
                return;
            } else {
                this.LJLJLJ = null;
                this.LJLJLLL = new Handler(Looper.myLooper());
                return;
            }
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(int i, MutableLiveData mutableLiveData, C023707l c023707l) {
        if (mutableLiveData == 0) {
            return;
        }
        C024107p c024107p = this.LJLJI[i];
        if (c024107p == null) {
            c024107p = C023707l.LIZ(this, i);
            this.LJLJI[i] = c024107p;
            LifecycleOwner lifecycleOwner = this.LJLLILLLL;
            if (lifecycleOwner != null) {
                c024107p.LIZ.setLifecycleOwner(lifecycleOwner);
            }
        }
        c024107p.LIZ();
        c024107p.LIZJ = mutableLiveData;
        c024107p.LIZ.LIZ(mutableLiveData);
    }

    public static Object[] LJIIJ(InterfaceC024507t interfaceC024507t, View view, int i, C023907n c023907n, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        LJIIIZ(interfaceC024507t, view, objArr, c023907n, sparseIntArray, true);
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01aa, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003e, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.InterfaceC024507t r27, android.view.View r28, java.lang.Object[] r29, X.C023907n r30, android.util.SparseIntArray r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.LJIIIZ(X.07t, android.view.View, java.lang.Object[], X.07n, android.util.SparseIntArray, boolean):void");
    }
}
