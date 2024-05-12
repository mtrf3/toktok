package Y;

import X.BinderC39601gy;
import X.C09900aA;
import X.C0CS;
import X.C0NB;
import X.C0NE;
import X.C0RD;
import X.C0VW;
import X.C141335gf;
import X.C16880lQ;
import X.C19380pS;
import X.C1DA;
import X.C1Y1;
import X.C31041Js;
import X.C3C5;
import X.C42681lw;
import X.C43731nd;
import X.C64096PDo;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.RunnableC09050Xd;
import android.os.Bundle;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS0S1200000 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        try {
            try {
                C0CS c0cs = (C0CS) ((C43731nd) this.l1).get();
                if (c0cs == null) {
                    C0VW LIZ = C0VW.LIZ();
                    C16880lQ.LLLZ("%s returned a null result. Treating it as a failure.", new Object[]{((RunnableC09050Xd) this.l2).LJLJJI.LIZJ});
                    LIZ.getClass();
                } else {
                    C0VW LIZ2 = C0VW.LIZ();
                    C16880lQ.LLLZ("%s returned a %s result.", new Object[]{((RunnableC09050Xd) this.l2).LJLJJI.LIZJ, c0cs});
                    LIZ2.getClass();
                    ((RunnableC09050Xd) this.l2).LJLJL = c0cs;
                }
            } catch (InterruptedException | ExecutionException unused) {
                C0VW LIZ3 = C0VW.LIZ();
                C16880lQ.LLLZ("%s failed because it threw an exception/error", new Object[]{this.s0});
                LIZ3.getClass();
            } catch (CancellationException unused2) {
                C0VW LIZ4 = C0VW.LIZ();
                C16880lQ.LLLZ("%s was cancelled", new Object[]{this.s0});
                LIZ4.getClass();
            }
        } finally {
            ((RunnableC09050Xd) this.l2).LIZLLL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Object LIZ;
        String json = ((PersistenceReporter) this.l1).LJFF.getString(this.s0, "{}");
        PersistenceReporter persistenceReporter = (PersistenceReporter) this.l1;
        String str = this.s0;
        o.LJIIIIZZ(json, "json");
        PersistenceReporter.Companion.InnerRecord LJIIJ = persistenceReporter.LJIIJ(str, json);
        if (LJIIJ == null) {
            LJIIJ = new PersistenceReporter.Companion.InnerRecord();
        }
        try {
            ((InterfaceC88471Ynr) this.l2).invoke(LJIIJ.getValue(), Long.valueOf(LJIIJ.getCreateTimeStamp()));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C0NB.LJ("PersistenceReporter", m10exceptionOrNullimpl.getMessage());
        }
    }

    public final void LIZ$2() {
        C19380pS LJIIIIZZ = ((C1Y1) ((WorkDatabase) this.l1).LJJ()).LJIIIIZZ(this.s0);
        if (LJIIIIZZ != null && LJIIIIZZ.LIZIZ()) {
            synchronized (((C1DA) this.l2).LJLJI) {
                ((HashMap) ((C1DA) this.l2).LJLJJLL).put(this.s0, LJIIIIZZ);
                ((HashSet) ((C1DA) this.l2).LJLJL).add(LJIIIIZZ);
                C1DA c1da = (C1DA) this.l2;
                c1da.LJLJLJ.LIZJ(c1da.LJLJL);
            }
        }
    }

    public static final void run$0(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            ((BinderC39601gy) iDRunnableS0S1200000.l2).LJLJI.LJIJI((Bundle) iDRunnableS0S1200000.l1, iDRunnableS0S1200000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            ((BinderC39601gy) iDRunnableS0S1200000.l2).LJLJI.LJJJJ((Bundle) iDRunnableS0S1200000.l1, iDRunnableS0S1200000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            iDRunnableS0S1200000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = new C64096PDo(iDRunnableS0S1200000.s0, 0, (JSONObject) iDRunnableS0S1200000.l1, null, null, (JSONObject) iDRunnableS0S1200000.l2).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorDuration", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            ((C42681lw) iDRunnableS0S1200000.l1).LJJIJIIJI(iDRunnableS0S1200000.s0, (LiveEffect) iDRunnableS0S1200000.l2, true, true, Long.valueOf(System.currentTimeMillis()));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            iDRunnableS0S1200000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            ((GameCastWiredFragment) iDRunnableS0S1200000.l1).xl(1, (View) iDRunnableS0S1200000.l2, iDRunnableS0S1200000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            ((GameCastWiredFragment) iDRunnableS0S1200000.l1).xl(2, (View) iDRunnableS0S1200000.l2, iDRunnableS0S1200000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            ((GameCastWiredFragment) iDRunnableS0S1200000.l1).xl(0, (View) iDRunnableS0S1200000.l2, iDRunnableS0S1200000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            iDRunnableS0S1200000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        C0NE c0ne = (C0NE) iDRunnableS0S1200000.l1;
        String str = iDRunnableS0S1200000.s0;
        Map map = (Map) iDRunnableS0S1200000.l2;
        c0ne.getClass();
        C0NB.LJIIIZ(str, c0ne.LJFF(str, C0NE.LJIIJJI(map)));
    }

    public static final void run$7(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        C0NE c0ne = (C0NE) iDRunnableS0S1200000.l1;
        String str = iDRunnableS0S1200000.s0;
        C0NB.LJIIIZ(str, c0ne.LJFF(str, (JSONObject) iDRunnableS0S1200000.l2));
    }

    public static final void run$8(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        C0NE c0ne = (C0NE) iDRunnableS0S1200000.l1;
        String str = iDRunnableS0S1200000.s0;
        C0NB.LJIIL(str, c0ne.LJFF(str, (JSONObject) iDRunnableS0S1200000.l2));
    }

    public static final void run$9(IDRunnableS0S1200000 iDRunnableS0S1200000) {
        boolean LIZ;
        try {
            C31041Js c31041Js = (C31041Js) iDRunnableS0S1200000.l2;
            c31041Js.LIZIZ(c31041Js.LIZIZ, (C0RD) iDRunnableS0S1200000.l1, iDRunnableS0S1200000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS0S1200000(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }
}
