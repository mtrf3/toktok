package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1D9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D9 implements C0XX {
    public static final /* synthetic */ int LJLLI = 0;
    public final Context LJLIL;
    public final InterfaceC23750wV LJLILLLLZI;
    public final C20620rS LJLJI;
    public final C1OR LJLJJI;
    public final C1OU LJLJJL;
    public final C1D7 LJLJJLL;
    public final Handler LJLJL;
    public final List<Intent> LJLJLJ;
    public Intent LJLJLLL;
    public InterfaceC03580Cc LJLL;

    static {
        C0VW.LIZIZ("SystemAlarmDispatcher");
    }

    public final void LIZIZ() {
        if (this.LJLJL.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean LIZJ() {
        LIZIZ();
        synchronized (this.LJLJLJ) {
            Iterator it = ((ArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void LIZLLL() {
        C0VW.LIZ().getClass();
        this.LJLJJI.LJFF(this);
        C20620rS c20620rS = this.LJLJI;
        if (!c20620rS.LIZ.isShutdown()) {
            c20620rS.LIZ.shutdownNow();
        }
        this.LJLL = null;
    }

    public final void LJI() {
        LIZIZ();
        PowerManager.WakeLock LIZ = C20550rL.LIZ(this.LJLIL, "ProcessCommand");
        try {
            LIZ.acquire();
            ((C35591aV) this.LJLJJL.LIZLLL).LIZ(new IDRunnableS85S0100000(this, 36));
        } finally {
            LIZ.release();
        }
    }

    public C1D9(Context context) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJLIL = LLLLL;
        this.LJLJJLL = new C1D7(LLLLL);
        this.LJLJI = new C20620rS();
        C1OU LJ = C1OU.LJ(context);
        this.LJLJJL = LJ;
        C1OR c1or = LJ.LJFF;
        this.LJLJJI = c1or;
        this.LJLILLLLZI = LJ.LIZLLL;
        c1or.LIZ(this);
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = null;
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
    }

    public final void LJFF(Runnable runnable) {
        this.LJLJL.post(runnable);
    }

    public final void LIZ(int i, Intent intent) {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)});
        LIZ.getClass();
        LIZIZ();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C0VW.LIZ().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && LIZJ()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.LJLJLJ) {
            boolean z = !((ArrayList) this.LJLJLJ).isEmpty();
            ((ArrayList) this.LJLJLJ).add(intent);
            if (!z) {
                LJI();
            }
        }
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        Intent intent = new Intent(this.LJLIL, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        LJFF(new RunnableC03570Cb(0, intent, this));
    }
}
