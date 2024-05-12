package X;

import Y.ARunnableS2S1201000_6;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.FDr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38619FDr {
    public static C38612FDk LIZIZ;
    public static final C38619FDr LIZLLL = new C38619FDr();
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C38623FDv.LJLIL);

    public static InterfaceC38613FDl LIZ() {
        C38612FDk c38612FDk = LIZIZ;
        if (c38612FDk != null) {
            return c38612FDk.LIZLLL;
        }
        o.LJIJI("config");
        throw null;
    }

    public static final void LIZLLL(int i, Context context) {
        String LJJIJL = C38891fp.LJJIJL(i);
        if (LJJIJL != null) {
            LIZLLL.getClass();
            LJ(context, i, LJJIJL);
        }
    }

    public static final View LIZJ(Context context, int i, ViewGroup viewGroup) {
        boolean z;
        o.LJIIJ(context, "context");
        if (viewGroup != null) {
            z = true;
        } else {
            z = false;
        }
        return LIZIZ(i, context, viewGroup, z);
    }

    public static void LJ(Context context, int i, String str) {
        FE5 LIZ2;
        Context context2 = context;
        if (!LIZ.get()) {
            return;
        }
        if (context2 == null) {
            LIZLLL.getClass();
            C38612FDk c38612FDk = LIZIZ;
            if (c38612FDk != null) {
                context2 = c38612FDk.LIZ;
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        FE0 LJJIJIIJIL = C38891fp.LJJIJIIJIL(i);
        if (LJJIJIIJIL != null) {
            C38620FDs c38620FDs = new C38620FDs(LJJIJIIJIL);
            RunnableC38602FDa runnableC38602FDa = new RunnableC38602FDa(new ARunnableS2S1201000_6(i, str, c38620FDs, context2, 4));
            c38620FDs.LJ(runnableC38602FDa);
            FE8 fe8 = FE8.LJ;
            o.LJIIJ(context2, "context");
            FEH LIZLLL2 = fe8.LIZLLL(context2);
            ReentrantReadWriteLock.ReadLock readLock = FE8.LIZIZ.readLock();
            readLock.lock();
            try {
                List LIZLLL3 = FE8.LIZJ.LIZLLL(i);
                synchronized (LIZLLL3) {
                    LIZ2 = FE5.LJLLI.LIZ(i, context2, c38620FDs, LIZLLL2);
                    LIZLLL3.add(LIZ2);
                }
                readLock.unlock();
                FEA fea = FE8.LIZ;
                fea.getClass();
                LIZLLL.getClass();
                C38612FDk c38612FDk2 = LIZIZ;
                if (c38612FDk2 != null) {
                    long j = c38612FDk2.LJ;
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.arg1 = LIZ2.LJLILLLLZI;
                    obtain.obj = LIZ2.LJLJJI;
                    fea.sendMessageDelayed(obtain, j);
                    InterfaceC38613FDl LJ = FE8.LJ();
                    if (LJ != null) {
                        LJ.LJIILL(LIZ2.L());
                    }
                    C38612FDk c38612FDk3 = LIZIZ;
                    if (c38612FDk3 != null) {
                        c38612FDk3.LIZJ.execute(runnableC38602FDa);
                        return;
                    } else {
                        o.LJIJI("config");
                        throw null;
                    }
                }
                o.LJIJI("config");
                throw null;
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.3C4, java.lang.Object] */
    public static final View LIZIZ(int i, Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        View view;
        Configuration configuration;
        o.LJIIJ(context, "context");
        if (C109434Rf.LIZJ(context) != null) {
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                i2 = configuration.orientation;
            } else {
                i2 = 1;
            }
            FE2 fe2 = new FE2();
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    fe2.LIZ = Integer.valueOf(i2);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Invalid orientation ");
                    LIZ2.append(i2);
                    LIZ2.append(", orientation must be ");
                    LIZ2.append("ORIENTATION_UNDEFINED, ORIENTATION_PORTRAIT ");
                    LIZ2.append("or ORIENTATION_LANDSCAPE.");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                }
            } else {
                fe2.LIZ = 1;
            }
            FE1 fe1 = new FE1(fe2.LIZ);
            C38619FDr c38619FDr = LIZLLL;
            if (LIZ.get()) {
                c38619FDr.getClass();
                for (AbstractC38621FDt abstractC38621FDt : (List) LIZJ.getValue()) {
                    abstractC38621FDt.getClass();
                    InterfaceC38616FDo LIZIZ2 = abstractC38621FDt.LIZIZ(context, i, fe1);
                    View view2 = null;
                    if (LIZIZ2 != null) {
                        String LJJIIJZLJL = C38891fp.LJJIIJZLJL(i);
                        System.currentTimeMillis();
                        try {
                            LIZLLL.getClass();
                            InterfaceC38613FDl LIZ3 = LIZ();
                            if (LIZ3 != null) {
                                LIZ3.LJ(LJJIIJZLJL, abstractC38621FDt.LIZ());
                            }
                            LIZIZ2.LIZJ(context);
                            View LIZLLL2 = LIZIZ2.LIZLLL(context, viewGroup, z);
                            C3C5.m7constructorimpl(LIZLLL2);
                            view = LIZLLL2;
                        } catch (Throwable th) {
                            ?? LIZ4 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ4);
                            view = LIZ4;
                        }
                        if (C3C5.m13isSuccessimpl(view)) {
                            System.currentTimeMillis();
                            LIZLLL.getClass();
                            InterfaceC38613FDl LIZ5 = LIZ();
                            if (LIZ5 != null) {
                                LIZ5.LJII(LJJIIJZLJL, abstractC38621FDt.LIZ());
                            }
                        }
                        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(view);
                        if (m10exceptionOrNullimpl != null) {
                            LIZLLL.getClass();
                            InterfaceC38613FDl LIZ6 = LIZ();
                            if (LIZ6 != null) {
                                LIZ6.LIZIZ(LJJIIJZLJL, abstractC38621FDt.LIZ(), m10exceptionOrNullimpl);
                            }
                        }
                        if (!C3C5.m12isFailureimpl(view)) {
                            view2 = view;
                        }
                        view2 = view2;
                    }
                    if (view2 != null) {
                        return view2;
                    }
                }
            }
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, viewGroup, z);
            o.LJFF(LLLLIILL, "LayoutInflater.from(cont…utId, root, attachToRoot)");
            return LLLLIILL;
        }
        throw new IllegalArgumentException("context must contain an Activity.");
    }
}
