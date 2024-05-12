package X;

import Y.IDRunnableS29S0200000;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1PG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PG implements C0XZ, InterfaceC13820gU, C0XX {
    public final Context LJLIL;
    public final C1OU LJLILLLLZI;
    public final C33091Rp LJLJI;
    public final C0ZY LJLJJL;
    public boolean LJLJJLL;
    public Boolean LJLJLJ;
    public final java.util.Set<C19380pS> LJLJJI = new HashSet();
    public final Object LJLJL = new Object();

    @Override // X.C0XZ
    public final boolean LIZIZ() {
        return false;
    }

    static {
        C0VW.LIZIZ("GreedyScheduler");
    }

    @Override // X.C0XZ
    public final void LIZ(String str) {
        Runnable runnable;
        if (this.LJLJLJ == null) {
            this.LJLJLJ = Boolean.valueOf(C20500rG.LIZ(this.LJLIL, this.LJLILLLLZI.LIZIZ));
        }
        if (!this.LJLJLJ.booleanValue()) {
            C0VW.LIZ().getClass();
            return;
        }
        if (!this.LJLJJLL) {
            this.LJLILLLLZI.LJFF.LIZ(this);
            this.LJLJJLL = true;
        }
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Cancelling work ID %s", new Object[]{str});
        LIZ.getClass();
        C0ZY c0zy = this.LJLJJL;
        if (c0zy != null && (runnable = (Runnable) ((HashMap) c0zy.LIZJ).remove(str)) != null) {
            ((Handler) c0zy.LIZIZ.LIZ).removeCallbacks(runnable);
        }
        this.LJLILLLLZI.LJIIIZ(str);
    }

    @Override // X.C0XZ
    public final void LIZJ(C19380pS... c19380pSArr) {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = Boolean.valueOf(C20500rG.LIZ(this.LJLIL, this.LJLILLLLZI.LIZIZ));
        }
        if (!this.LJLJLJ.booleanValue()) {
            C0VW.LIZ().getClass();
            return;
        }
        if (!this.LJLJJLL) {
            this.LJLILLLLZI.LJFF.LIZ(this);
            this.LJLJJLL = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C19380pS c19380pS : c19380pSArr) {
            long LIZ = c19380pS.LIZ();
            long currentTimeMillis = System.currentTimeMillis();
            if (c19380pS.LIZIZ == EnumC08510Vb.ENQUEUED) {
                if (currentTimeMillis < LIZ) {
                    C0ZY c0zy = this.LJLJJL;
                    if (c0zy != null) {
                        Runnable runnable = (Runnable) ((HashMap) c0zy.LIZJ).remove(c19380pS.LIZ);
                        if (runnable != null) {
                            ((Handler) c0zy.LIZIZ.LIZ).removeCallbacks(runnable);
                        }
                        IDRunnableS29S0200000 iDRunnableS29S0200000 = new IDRunnableS29S0200000(c19380pS, c0zy, 24);
                        ((HashMap) c0zy.LIZJ).put(c19380pS.LIZ, iDRunnableS29S0200000);
                        ((Handler) c0zy.LIZIZ.LIZ).postDelayed(iDRunnableS29S0200000, c19380pS.LIZ() - System.currentTimeMillis());
                    }
                } else if (c19380pS.LIZIZ()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        if (c19380pS.LJIIIZ.LIZJ) {
                            C0VW LIZ2 = C0VW.LIZ();
                            C16880lQ.LLLZ("Ignoring WorkSpec %s, Requires device idle.", new Object[]{c19380pS});
                            LIZ2.getClass();
                        } else if (i >= 24 && ((HashSet) c19380pS.LJIIIZ.LJII.LIZ).size() > 0) {
                            C0VW LIZ3 = C0VW.LIZ();
                            C16880lQ.LLLZ("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{c19380pS});
                            LIZ3.getClass();
                        }
                    }
                    hashSet.add(c19380pS);
                    hashSet2.add(c19380pS.LIZ);
                } else {
                    C0VW LIZ4 = C0VW.LIZ();
                    C16880lQ.LLLZ("Starting work for %s", new Object[]{c19380pS.LIZ});
                    LIZ4.getClass();
                    this.LJLILLLLZI.LJIIIIZZ(c19380pS.LIZ, null);
                }
            }
        }
        synchronized (this.LJLJL) {
            if (!hashSet.isEmpty()) {
                C0VW LIZ5 = C0VW.LIZ();
                C16880lQ.LLLZ("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)});
                LIZ5.getClass();
                this.LJLJJI.addAll(hashSet);
                this.LJLJI.LIZJ(this.LJLJJI);
            }
        }
    }

    @Override // X.InterfaceC13820gU
    public final void LIZLLL(List<String> list) {
        for (String str : list) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Constraints not met: Cancelling work ID %s", new Object[]{str});
            LIZ.getClass();
            this.LJLILLLLZI.LJIIIZ(str);
        }
    }

    @Override // X.InterfaceC13820gU
    public final void LJFF(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Constraints met: Scheduling work ID %s", new Object[]{str});
            LIZ.getClass();
            this.LJLILLLLZI.LJIIIIZZ(str, null);
        }
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        synchronized (this.LJLJL) {
            Iterator it = ((HashSet) this.LJLJJI).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C19380pS c19380pS = (C19380pS) it.next();
                if (c19380pS.LIZ.equals(str)) {
                    C0VW LIZ = C0VW.LIZ();
                    C16880lQ.LLLZ("Stopping tracking for %s", new Object[]{str});
                    LIZ.getClass();
                    ((HashSet) this.LJLJJI).remove(c19380pS);
                    this.LJLJI.LIZJ(this.LJLJJI);
                    break;
                }
            }
        }
    }

    public C1PG(Context context, C0CW c0cw, C35591aV c35591aV, C1OU c1ou) {
        this.LJLIL = context;
        this.LJLILLLLZI = c1ou;
        this.LJLJI = new C33091Rp(context, c35591aV, this);
        this.LJLJJL = new C0ZY(this, c0cw.LJ);
    }
}
