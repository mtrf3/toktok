package X;

import Y.IDRunnableS85S0100000;
import android.app.Activity;
import android.os.Build;
import android.os.Looper;
import android.util.Printer;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36381bm implements InterfaceC64218PIg {
    public static final C36381bm LJIL = new C36381bm();
    public static AbstractC06100Lu LJJ;
    public volatile boolean LIZ;
    public Object LJII;
    public Object[] LJIIIIZZ;
    public long[] LJIIIZ;
    public Method LJIIJ;
    public Choreographer LJIIJJI;
    public IDRunnableS85S0100000 LJIILJJIL;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJLI;
    public final C25440zE LIZIZ = new C25440zE();
    public final long[] LIZJ = new long[4];
    public final List<AbstractC06100Lu> LIZLLL = new CopyOnWriteArrayList();
    public boolean LJ = false;
    public boolean LJFF = false;
    public boolean LJI = false;
    public boolean LJIIL = false;
    public final PF1 LJIILIIL = new PF1();
    public final PF4 LJIILL = new PF4("looper_monitor");
    public final HashMap<Window, Window.OnFrameMetricsAvailableListener> LJIILLIIL = new HashMap<>();
    public final HashMap<Window, Window.OnFrameMetricsAvailableListener> LJIIZILJ = new HashMap<>();
    public long LJIJJ = -1;

    public final synchronized void LJIIIZ() {
        if (!C09970aH.LJIIIZ()) {
            return;
        }
        if (this.LJIJJLI) {
            if (!this.LIZ) {
                this.LIZ = true;
            }
            if (this.LJ && Build.VERSION.SDK_INT < 24) {
                LIZIZ(this.LJIILJJIL);
            }
            return;
        }
        throw new RuntimeException("never init!");
    }

    @Override // X.InterfaceC64218PIg
    public final void onBackground() {
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final void LJFF() {
        C64178PGs c64178PGs;
        C64177PGr LIZIZ;
        boolean z = this.LJFF;
        ?? r4 = 0;
        if (this.LJ && Build.VERSION.SDK_INT < 24 && z) {
            LIZIZ(this.LJIILJJIL);
            this.LJFF = false;
            final long j = PFB.LIZIZ;
            final long j2 = this.LJIJJ;
            if (this.LJIIIZ != null) {
                C64176PGq c64176PGq = C64125PEr.LIZLLL().LJIIIIZZ;
                C64183PGx c64183PGx = null;
                if (c64176PGq != null && c64176PGq.LJ != null) {
                    C64176PGq c64176PGq2 = C64125PEr.LIZLLL().LJIIIIZZ;
                    if (c64176PGq2 != null) {
                        c64183PGx = c64176PGq2.LJ;
                    }
                    long[] jArr = this.LJIIIZ;
                    C64176PGq c64176PGq3 = c64183PGx.LIZ;
                    if (c64176PGq3.LJIJ && (c64178PGs = c64176PGq3.LJIIIZ) != null && (LIZIZ = c64178PGs.LIZIZ()) != null && LIZIZ.LIZLLL == 8) {
                        C64181PGv c64181PGv = new C64181PGv();
                        if (jArr != null) {
                            c64181PGv.LIZ = jArr[1];
                            c64181PGv.LIZIZ = jArr[5];
                            c64181PGv.LIZJ = jArr[6];
                            c64181PGv.LIZLLL = jArr[7];
                            c64181PGv.LJ = jArr[8];
                        }
                        LIZIZ.LJIILJJIL = c64181PGv;
                    }
                }
                if (C25430zD.LIZ == null) {
                    synchronized (C25430zD.class) {
                        if (C25430zD.LIZ == null) {
                            C25430zD.LIZ = new C25430zD();
                        }
                    }
                }
                C25430zD.LIZ.getClass();
            }
            if (Build.VERSION.SDK_INT < 24 && !((CopyOnWriteArrayList) this.LIZLLL).isEmpty()) {
                this.LJIILIIL.LIZ(new Runnable() { // from class: X.0zG
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            Iterator it = ((CopyOnWriteArrayList) C36381bm.this.LIZLLL).iterator();
                            while (it.hasNext()) {
                                AbstractC06100Lu abstractC06100Lu = (AbstractC06100Lu) it.next();
                                if (abstractC06100Lu != null) {
                                    abstractC06100Lu.LJIIJ(j2, j, ActivityLifeObserver.getInstance().getTopActivityClassName());
                                }
                            }
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
        long[] jArr2 = this.LIZJ;
        jArr2[1] = PFB.LIZIZ;
        char c = 3;
        jArr2[3] = PFB.LIZJ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.LIZLLL;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC06100Lu abstractC06100Lu = (AbstractC06100Lu) ListProtector.get(copyOnWriteArrayList, i);
            if (abstractC06100Lu != null && abstractC06100Lu.LJIIJJI()) {
                long[] jArr3 = this.LIZJ;
                abstractC06100Lu.LJIIIZ(jArr3[r4], jArr3[2], jArr3[1], jArr3[c], z);
            }
            i++;
            c = 3;
            r4 = 0;
        }
        long[] jArr4 = this.LIZIZ.LIZ;
        jArr4[r4] = 0;
        jArr4[1] = 0;
        jArr4[2] = Long.MAX_VALUE;
        jArr4[3] = 0;
        this.LJI = r4;
    }

    public final int LJII() {
        int size = ((CopyOnWriteArrayList) this.LIZLLL).size();
        C64099PDr.LIZJ("block_monitor");
        return size;
    }

    public final void LJIIIIZZ() {
        if (this.LJIJJLI) {
            return;
        }
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            ActivityLifeObserver.getInstance().register(this);
            PF6.LIZLLL();
            PF6.LJ = new PFB() { // from class: X.1bl
                @Override // X.PFB
                public final void LIZ() {
                    this.LIZ = false;
                    C36381bm c36381bm = C36381bm.this;
                    c36381bm.getClass();
                    if (!((Boolean) C2VW.LIZJ.getValue()).booleanValue()) {
                        c36381bm.LJFF();
                        return;
                    }
                    C26827Afv.LIZ = false;
                    C26827Afv.LIZIZ = true;
                    c36381bm.LJFF();
                    C26827Afv.LIZIZ = false;
                    C26827Afv.LIZ();
                }

                @Override // X.PFB
                public final boolean LIZJ() {
                    return C36381bm.this.LIZ;
                }

                @Override // X.PFB
                public final void LIZIZ(String str) {
                    this.LIZ = true;
                    C36381bm c36381bm = C36381bm.this;
                    c36381bm.getClass();
                    if (!((Boolean) C2VW.LIZJ.getValue()).booleanValue()) {
                        c36381bm.LJ(str);
                        return;
                    }
                    C26827Afv.LIZ = true;
                    C26827Afv.LIZIZ = false;
                    c36381bm.LJ(str);
                    C26827Afv.LIZ = false;
                    C26827Afv.LIZ();
                }
            };
            this.LJIJJLI = true;
            return;
        }
        throw new AssertionError("must be init in main thread!");
    }

    @Override // X.InterfaceC64218PIg
    public final void LIZ(Activity activity) {
        try {
            final Window window = activity.getWindow();
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    final Window.Callback callback = window.getCallback();
                    window.setCallback(new AbstractWindowCallbackC25540zO(callback) { // from class: X.1bn
                        @Override // android.view.Window.Callback
                        public final void onDetachedFromWindow() {
                            try {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    Window.OnFrameMetricsAvailableListener remove = C36381bm.this.LJIILLIIL.remove(window);
                                    C36381bm.this.LJIIZILJ.remove(window);
                                    C36381bm.this.getClass();
                                    if (remove != null) {
                                        window.removeOnFrameMetricsAvailableListener(remove);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            this.LJLIL.onDetachedFromWindow();
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                            C36381bm c36381bm = C36381bm.this;
                            if (!c36381bm.LJI) {
                                c36381bm.LIZIZ.LIZ(keyEvent.getEventTime());
                            }
                            return this.LJLIL.dispatchKeyEvent(keyEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            C36381bm c36381bm = C36381bm.this;
                            if (!c36381bm.LJI) {
                                c36381bm.LIZIZ.LIZ(motionEvent.getEventTime());
                            }
                            return this.LJLIL.dispatchTouchEvent(motionEvent);
                        }
                    });
                }
            } catch (Exception unused) {
            }
            String name = activity.getClass().getName();
            Window window2 = activity.getWindow();
            try {
                if (Build.VERSION.SDK_INT >= 24 && this.LJIILL.LIZLLL != null) {
                    WindowOnFrameMetricsAvailableListenerC25480zI windowOnFrameMetricsAvailableListenerC25480zI = new WindowOnFrameMetricsAvailableListenerC25480zI(this, name);
                    this.LJIILLIIL.put(window2, windowOnFrameMetricsAvailableListenerC25480zI);
                    window2.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC25480zI, this.LJIILL.LIZLLL);
                }
            } catch (Exception unused2) {
            }
            if (PF6.LIZ && !PF6.LJIIJ) {
                C36381bm c36381bm = LJIL;
                if (c36381bm.LJIJ) {
                    int LJII = c36381bm.LJII();
                    if (PF6.LIZLLL.isEmpty() && LJII == 0) {
                        PF6.LIZ();
                    }
                }
            }
            if (this.LJIJI) {
                ((CopyOnWriteArrayList) this.LIZLLL).size();
            }
        } catch (Exception unused3) {
        }
    }

    public final synchronized void LIZIZ(Runnable runnable) {
        if (!this.LIZ) {
            return;
        }
        if (this.LJIIL) {
            return;
        }
        try {
            synchronized (this.LJII) {
                Method method = this.LJIIJ;
                if (method != null) {
                    method.invoke(this.LJIIIIZZ[0], -1L, runnable, null);
                    this.LJIIL = true;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC64218PIg
    public final void LIZJ(Activity activity) {
        if (this.LJIIJJI != null) {
            return;
        }
        try {
            activity.getWindow();
        } catch (Exception unused) {
        }
        if (this.LJ && Build.VERSION.SDK_INT < 24) {
            try {
                this.LJIIJJI = C16880lQ.LLIIIJ();
            } catch (Exception unused2) {
            }
            F9U.LIZ.LIZJ(new IDRunnableS85S0100000(this, 111));
        }
    }

    public final void LIZLLL(AbstractC06100Lu abstractC06100Lu) {
        if (abstractC06100Lu == null) {
            return;
        }
        if (!this.LIZ) {
            LJIIIZ();
        }
        if (!((CopyOnWriteArrayList) this.LIZLLL).contains(abstractC06100Lu)) {
            ((CopyOnWriteArrayList) this.LIZLLL).add(abstractC06100Lu);
            if (this.LJIJ) {
                PF6.LJII();
            }
        }
    }

    public final void LJ(String str) {
        this.LJI = true;
        long[] jArr = this.LIZJ;
        jArr[0] = PFB.LIZIZ;
        jArr[2] = PFB.LIZJ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.LIZLLL;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC06100Lu abstractC06100Lu = (AbstractC06100Lu) ListProtector.get(copyOnWriteArrayList, i);
            if (abstractC06100Lu != null && !abstractC06100Lu.LJIIJJI()) {
                abstractC06100Lu.LJIIIIZZ(str);
            }
        }
    }

    public final void LJI(AbstractC06100Lu abstractC06100Lu) {
        ((CopyOnWriteArrayList) this.LIZLLL).remove(abstractC06100Lu);
        if (this.LJIJ) {
            if (LJII() == 0 && PF6.LIZLLL.size() == 0) {
                PF6.LIZ();
                return;
            }
            return;
        }
        if (!((CopyOnWriteArrayList) this.LIZLLL).isEmpty()) {
            return;
        }
        synchronized (this) {
            if (!C09970aH.LJIIIIZZ()) {
                return;
            }
            if (this.LJIJJLI) {
                if (this.LIZ) {
                    this.LIZ = false;
                }
                return;
            }
            throw new RuntimeException("MainThreadMonitor is never init!");
        }
    }

    public final void LJIIL(final AbstractC06100Lu abstractC06100Lu) {
        if (!((Boolean) C2VW.LIZJ.getValue()).booleanValue()) {
            LJI(abstractC06100Lu);
            return;
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            if (C26827Afv.LIZ || C26827Afv.LIZIZ) {
                ((LinkedList) C26827Afv.LIZJ).add(abstractC06100Lu);
                if (C26827Afv.LIZ) {
                    C26827Afv.LIZIZ("Call MainThreadMonitor#removeObserver in dispatchBegin.");
                    return;
                } else {
                    C26827Afv.LIZIZ("Call MainThreadMonitor#removeObserver in dispatchEnd.");
                    return;
                }
            }
            LJI(abstractC06100Lu);
            return;
        }
        C57022Lq.LIZ.LJLIL.post(new Runnable(abstractC06100Lu) { // from class: X.9Ap
            public final AbstractC06100Lu LJLIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C36381bm.LJIL.LJIIL(this.LJLIL);
                } finally {
                    if (LIZ) {
                    }
                }
            }

            {
                this.LJLIL = abstractC06100Lu;
            }
        });
        C26827Afv.LIZIZ("Call MainThreadMonitor#removeObserver not in main thread.");
    }

    @Override // X.InterfaceC64218PIg
    public final void onActivityDestroyed(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Window.OnFrameMetricsAvailableListener remove = this.LJIILLIIL.remove(activity.getWindow());
                this.LJIIZILJ.remove(activity.getWindow());
                if (remove != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(remove);
                }
                if (this.LJIJI) {
                    int size = ((CopyOnWriteArrayList) this.LIZLLL).size();
                    int size2 = ((ArrayList) FAI.LIZ()).size();
                    if (size2 > 0) {
                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[((CopyOnWriteArrayList) this.LIZLLL).size() + ((ArrayList) FAI.LIZ()).size() + 1];
                        for (int i = 0; i < size; i++) {
                            stackTraceElementArr[i] = new StackTraceElement(((AbstractC06100Lu) ListProtector.get(this.LIZLLL, i)).getClass().getName(), "addObserver", activity.getLocalClassName(), 0);
                        }
                        List<Printer> LIZ = FAI.LIZ();
                        int i2 = 0;
                        do {
                            stackTraceElementArr[i2 + size] = new StackTraceElement(((Printer) ListProtector.get(LIZ, i2)).getClass().getName(), "addPrinter", activity.getLocalClassName(), 0);
                            i2++;
                        } while (i2 < size2);
                        C78983UzD.LJIJ(new C25450zF("Looper Opt", stackTraceElementArr), "Looper Opt");
                        PF6.LJI();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC64218PIg
    public final void onActivityResumed(Activity activity) {
        try {
            activity.getWindow();
        } catch (Throwable unused) {
        }
    }

    public static Object LJIIJ(Object obj, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Object LJIIJJI(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
