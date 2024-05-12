package X;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PNk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64352PNk extends AbstractC06100Lu implements InterfaceC64217PIf {
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C64354PNm.LJLIL);
    public final List<C64351PNj> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;

    @Override // X.InterfaceC64217PIf
    public final void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC64217PIf
    public final void LIZLLL(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC64217PIf
    public final void LJFF(Activity activity) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(null, "fragment");
    }

    @Override // X.InterfaceC64217PIf
    public final void LJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC64217PIf
    public final void LJII(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIIZZ(String msg) {
        o.LJIIIZ(msg, "msg");
        this.LJLIL = true;
        if (this.LJLJI) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                C64351PNj c64351PNj = (C64351PNj) it.next();
                c64351PNj.getClass();
                if (c64351PNj.LJFF) {
                    try {
                        C64353PNl c64353PNl = c64351PNj.LIZJ;
                        if (c64353PNl != null && C36381bm.LJIL.LIZIZ.LIZIZ()) {
                            c64353PNl.LIZLLL = true;
                        }
                        C64353PNl c64353PNl2 = c64351PNj.LIZIZ;
                        c64353PNl2.LIZ = PFB.LIZIZ;
                        c64353PNl2.LIZIZ = msg;
                        c64353PNl2.LIZJ = -1L;
                        c64353PNl2.LIZLLL = false;
                        c64353PNl2.LJ = false;
                        c64353PNl2.LJFF = false;
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        this.LJLIL = false;
        if (this.LJLJI) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                C64351PNj c64351PNj = (C64351PNj) it.next();
                if (c64351PNj.LJFF) {
                    try {
                        C64353PNl c64353PNl = c64351PNj.LIZJ;
                        if (c64353PNl != null) {
                            if (z) {
                                c64353PNl.LJ = true;
                            }
                            if (c64351PNj.LIZLLL.size() > 20000) {
                                c64351PNj.LIZLLL.poll();
                            }
                            c64351PNj.LIZLLL.add(c64353PNl);
                            c64351PNj.LIZJ = null;
                        }
                        C64353PNl c64353PNl2 = c64351PNj.LIZIZ;
                        long j5 = c64353PNl2.LIZ;
                        if (j5 >= 0) {
                            long j6 = PFB.LIZIZ;
                            c64353PNl2.LIZJ = j6;
                            if (j6 - j5 > c64351PNj.LJIIIZ) {
                                C64353PNl c64353PNl3 = new C64353PNl(j5, c64353PNl2.LIZIZ);
                                c64353PNl3.LIZJ = j6;
                                c64353PNl3.LJFF = c64353PNl2.LJFF;
                                c64353PNl3.LIZLLL = c64353PNl2.LIZLLL;
                                c64353PNl3.LJ = c64353PNl2.LJ;
                                c64351PNj.LIZJ = c64353PNl3;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
