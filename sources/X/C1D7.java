package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1D7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D7 implements C0XX {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Context LJLIL;
    public final java.util.Map<String, C0XX> LJLILLLLZI = new HashMap();
    public final Object LJLJI = new Object();

    static {
        C0VW.LIZIZ("CommandHandler");
    }

    public final boolean LIZJ() {
        boolean z;
        synchronized (this.LJLJI) {
            if (!((HashMap) this.LJLILLLLZI).isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public C1D7(Context context) {
        this.LJLIL = context;
    }

    public static Intent LIZ(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent LIZIZ(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        synchronized (this.LJLJI) {
            C0XX c0xx = (C0XX) ((HashMap) this.LJLILLLLZI).remove(str);
            if (c0xx != null) {
                c0xx.LJ(str, z);
            }
        }
    }

    public final void LIZLLL(int i, Intent intent, C1D9 c1d9) {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Handling constraints changed %s", new Object[]{intent});
            LIZ.getClass();
            Context context = this.LJLIL;
            C03560Ca c03560Ca = new C03560Ca(context, i, c1d9);
            List<C19380pS> LJ = ((C1Y1) c1d9.LJLJJL.LIZJ.LJJ()).LJ();
            ArrayList arrayList = (ArrayList) LJ;
            Iterator it = arrayList.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                C0VP c0vp = ((C19380pS) it.next()).LJIIIZ;
                z2 |= c0vp.LIZLLL;
                z3 |= c0vp.LIZIZ;
                z4 |= c0vp.LJ;
                if (c0vp.LIZ != C0VX.NOT_REQUIRED) {
                    z = true;
                } else {
                    z = false;
                }
                z5 |= z;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            c03560Ca.LIZLLL.LIZJ(LJ);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19380pS c19380pS = (C19380pS) it2.next();
                String str = c19380pS.LIZ;
                if (currentTimeMillis >= c19380pS.LIZ() && (!c19380pS.LIZIZ() || c03560Ca.LIZLLL.LIZ(str))) {
                    arrayList2.add(c19380pS);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str2 = ((C19380pS) it3.next()).LIZ;
                Intent LIZ2 = LIZ(c03560Ca.LIZ, str2);
                C0VW LIZ3 = C0VW.LIZ();
                C16880lQ.LLLZ("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2});
                LIZ3.getClass();
                C1D9 c1d92 = c03560Ca.LIZJ;
                c1d92.LJFF(new RunnableC03570Cb(c03560Ca.LIZIZ, LIZ2, c1d92));
            }
            c03560Ca.LIZLLL.LIZLLL();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C0VW LIZ4 = C0VW.LIZ();
            C16880lQ.LLLZ("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)});
            LIZ4.getClass();
            c1d9.LJLJJL.LJII();
            return;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (LLJJIJI == null || LLJJIJI.isEmpty() || C16880lQ.LLJJIII(LLJJIJI, strArr[0]) == null) {
            C0VW LIZ5 = C0VW.LIZ();
            C16880lQ.LLLZ("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"});
            LIZ5.getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = C16880lQ.LLJJIJI(intent).getString("KEY_WORKSPEC_ID");
            C0VW LIZ6 = C0VW.LIZ();
            C16880lQ.LLLZ("Handling schedule work for %s", new Object[]{string});
            LIZ6.getClass();
            WorkDatabase workDatabase = c1d9.LJLJJL.LIZJ;
            workDatabase.LIZJ();
            try {
                C19380pS LJIIIIZZ = ((C1Y1) workDatabase.LJJ()).LJIIIIZZ(string);
                if (LJIIIIZZ == null) {
                    C0VW LIZ7 = C0VW.LIZ();
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("Skipping scheduling ");
                    LIZ8.append(string);
                    LIZ8.append(" because it's no longer in the DB");
                    X1D.LIZIZ(LIZ8);
                    LIZ7.getClass();
                } else if (LJIIIIZZ.LIZIZ.isFinished()) {
                    C0VW LIZ9 = C0VW.LIZ();
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("Skipping scheduling ");
                    LIZ10.append(string);
                    LIZ10.append("because it is finished.");
                    X1D.LIZIZ(LIZ10);
                    LIZ9.getClass();
                } else {
                    long LIZ11 = LJIIIIZZ.LIZ();
                    if (!LJIIIIZZ.LIZIZ()) {
                        C0VW LIZ12 = C0VW.LIZ();
                        C16880lQ.LLLZ("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(LIZ11)});
                        LIZ12.getClass();
                        C10770bZ.LIZIZ(this.LJLIL, c1d9.LJLJJL, string, LIZ11);
                    } else {
                        C0VW LIZ13 = C0VW.LIZ();
                        C16880lQ.LLLZ("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(LIZ11)});
                        LIZ13.getClass();
                        C10770bZ.LIZIZ(this.LJLIL, c1d9.LJLJJL, string, LIZ11);
                        Intent intent3 = new Intent(this.LJLIL, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        c1d9.LJFF(new RunnableC03570Cb(i, intent3, c1d9));
                    }
                    workDatabase.LJIILLIIL();
                }
                return;
            } finally {
                workDatabase.LJIIJJI();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
            synchronized (this.LJLJI) {
                String string2 = LLJJIJI2.getString("KEY_WORKSPEC_ID");
                C0VW LIZ14 = C0VW.LIZ();
                C16880lQ.LLLZ("Handing delay met for %s", new Object[]{string2});
                LIZ14.getClass();
                if (!((HashMap) this.LJLILLLLZI).containsKey(string2)) {
                    C1D8 c1d8 = new C1D8(this.LJLIL, i, string2, c1d9);
                    ((HashMap) this.LJLILLLLZI).put(string2, c1d8);
                    c1d8.LIZJ();
                } else {
                    C0VW LIZ15 = C0VW.LIZ();
                    C16880lQ.LLLZ("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string2});
                    LIZ15.getClass();
                }
            }
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            String string3 = C16880lQ.LLJJIJI(intent).getString("KEY_WORKSPEC_ID");
            C0VW LIZ16 = C0VW.LIZ();
            C16880lQ.LLLZ("Handing stopWork work for %s", new Object[]{string3});
            LIZ16.getClass();
            c1d9.LJLJJL.LJIIIZ(string3);
            Context context2 = this.LJLIL;
            C34731Xx c34731Xx = (C34731Xx) c1d9.LJLJJL.LIZJ.LJIJJ();
            C19300pK LIZ17 = c34731Xx.LIZ(string3);
            if (LIZ17 != null) {
                C10770bZ.LIZ(context2, LIZ17.LIZIZ, string3);
                C0VW LIZ18 = C0VW.LIZ();
                C16880lQ.LLLZ("Removing SystemIdInfo for workSpecId (%s)", new Object[]{string3});
                LIZ18.getClass();
                c34731Xx.LIZJ(string3);
            }
            c1d9.LJ(string3, false);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            Bundle LLJJIJI3 = C16880lQ.LLJJIJI(intent);
            String string4 = LLJJIJI3.getString("KEY_WORKSPEC_ID");
            boolean z6 = LLJJIJI3.getBoolean("KEY_NEEDS_RESCHEDULE");
            C0VW LIZ19 = C0VW.LIZ();
            C16880lQ.LLLZ("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)});
            LIZ19.getClass();
            LJ(string4, z6);
            return;
        }
        C0VW LIZ20 = C0VW.LIZ();
        C16880lQ.LLLZ("Ignoring intent %s", new Object[]{intent});
        LIZ20.getClass();
    }
}
