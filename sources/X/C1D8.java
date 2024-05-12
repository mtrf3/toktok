package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1D8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D8 implements InterfaceC13820gU, C0XX, InterfaceC20600rQ {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final C1D9 LJLJJI;
    public final C33091Rp LJLJJL;
    public PowerManager.WakeLock LJLJLJ;
    public boolean LJLJLLL = false;
    public int LJLJL = 0;
    public final Object LJLJJLL = new Object();

    static {
        C0VW.LIZIZ("DelayMetCommandHandler");
    }

    public final void LIZIZ() {
        synchronized (this.LJLJJLL) {
            this.LJLJJL.LIZLLL();
            this.LJLJJI.LJLJI.LIZIZ(this.LJLJI);
            PowerManager.WakeLock wakeLock = this.LJLJLJ;
            if (wakeLock != null && wakeLock.isHeld()) {
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Releasing wakelock %s for WorkSpec %s", new Object[]{this.LJLJLJ, this.LJLJI});
                LIZ.getClass();
                this.LJLJLJ.release();
            }
        }
    }

    public final void LIZJ() {
        this.LJLJLJ = C20550rL.LIZ(this.LJLIL, C16880lQ.LLLZ("%s (%s)", new Object[]{this.LJLJI, Integer.valueOf(this.LJLILLLLZI)}));
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.LJLJLJ, this.LJLJI});
        LIZ.getClass();
        this.LJLJLJ.acquire();
        C19380pS LJIIIIZZ = ((C1Y1) this.LJLJJI.LJLJJL.LIZJ.LJJ()).LJIIIIZZ(this.LJLJI);
        if (LJIIIIZZ == null) {
            LJI();
            return;
        }
        boolean LIZIZ = LJIIIIZZ.LIZIZ();
        this.LJLJLLL = LIZIZ;
        if (!LIZIZ) {
            C0VW LIZ2 = C0VW.LIZ();
            C16880lQ.LLLZ("No constraints for %s", new Object[]{this.LJLJI});
            LIZ2.getClass();
            LJFF(Collections.singletonList(this.LJLJI));
            return;
        }
        this.LJLJJL.LIZJ(Collections.singletonList(LJIIIIZZ));
    }

    public final void LJI() {
        synchronized (this.LJLJJLL) {
            if (this.LJLJL < 2) {
                this.LJLJL = 2;
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Stopping work for WorkSpec %s", new Object[]{this.LJLJI});
                LIZ.getClass();
                Context context = this.LJLIL;
                String str = this.LJLJI;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                C1D9 c1d9 = this.LJLJJI;
                c1d9.LJFF(new RunnableC03570Cb(this.LJLILLLLZI, intent, c1d9));
                if (this.LJLJJI.LJLJJI.LIZLLL(this.LJLJI)) {
                    C0VW LIZ2 = C0VW.LIZ();
                    C16880lQ.LLLZ("WorkSpec %s needs to be rescheduled", new Object[]{this.LJLJI});
                    LIZ2.getClass();
                    Intent LIZIZ = C1D7.LIZIZ(this.LJLIL, this.LJLJI);
                    C1D9 c1d92 = this.LJLJJI;
                    c1d92.LJFF(new RunnableC03570Cb(this.LJLILLLLZI, LIZIZ, c1d92));
                } else {
                    C0VW LIZ3 = C0VW.LIZ();
                    C16880lQ.LLLZ("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.LJLJI});
                    LIZ3.getClass();
                }
            } else {
                C0VW LIZ4 = C0VW.LIZ();
                C16880lQ.LLLZ("Already stopped work for %s", new Object[]{this.LJLJI});
                LIZ4.getClass();
            }
        }
    }

    @Override // X.InterfaceC20600rQ
    public final void LIZ(String str) {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Exceeded time limits on execution for %s", new Object[]{str});
        LIZ.getClass();
        LJI();
    }

    @Override // X.InterfaceC13820gU
    public final void LIZLLL(List<String> list) {
        LJI();
    }

    @Override // X.InterfaceC13820gU
    public final void LJFF(List<String> list) {
        if (!list.contains(this.LJLJI)) {
            return;
        }
        synchronized (this.LJLJJLL) {
            if (this.LJLJL == 0) {
                this.LJLJL = 1;
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("onAllConstraintsMet for %s", new Object[]{this.LJLJI});
                LIZ.getClass();
                if (this.LJLJJI.LJLJJI.LJII(this.LJLJI, null)) {
                    this.LJLJJI.LJLJI.LIZ(this.LJLJI, this);
                } else {
                    LIZIZ();
                }
            } else {
                C0VW LIZ2 = C0VW.LIZ();
                C16880lQ.LLLZ("Already started work for %s", new Object[]{this.LJLJI});
                LIZ2.getClass();
            }
        }
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        LIZ.getClass();
        LIZIZ();
        if (z) {
            Intent LIZIZ = C1D7.LIZIZ(this.LJLIL, this.LJLJI);
            C1D9 c1d9 = this.LJLJJI;
            c1d9.LJFF(new RunnableC03570Cb(this.LJLILLLLZI, LIZIZ, c1d9));
        }
        if (this.LJLJLLL) {
            Intent intent = new Intent(this.LJLIL, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            C1D9 c1d92 = this.LJLJJI;
            c1d92.LJFF(new RunnableC03570Cb(this.LJLILLLLZI, intent, c1d92));
        }
    }

    public C1D8(Context context, int i, String str, C1D9 c1d9) {
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJJI = c1d9;
        this.LJLJI = str;
        this.LJLJJL = new C33091Rp(context, c1d9.LJLILLLLZI, this);
    }
}
