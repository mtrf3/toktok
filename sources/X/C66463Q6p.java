package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.BaseState;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.QuietState;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q6p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66463Q6p extends BaseState {
    public final List<Q79> LIZIZ = new ArrayList();

    @Override // X.Q7F
    public final String getName() {
        return "RollBackState";
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJFF() {
        ((ArrayList) this.LIZIZ).add(PTM.LJI(this.LIZ.LJ));
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJII(Q7F q7f) {
        PSY.LJFF("RollBackState", "onExitState: ");
        StateParam stateParam = this.stateParam;
        if (stateParam != null) {
            stateParam.flags = 0;
        }
    }

    public final void LJIIIZ(int i) {
        long LIZIZ;
        int i2;
        PSY.LJFF("RollBackState", C16880lQ.LLLZ("bootProtected protectedPeriod: %d", new Object[]{Long.valueOf(C66465Q6r.LJIILLIIL.LIZ())}));
        ExceptionManager.ExceptionRecord LIZLLL = LJ().LIZLLL();
        if (LIZLLL != null) {
            ExceptionManager LIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
            String crashType = LIZLLL.getCrashType();
            String crashReason = LIZLLL.getCrashReason();
            LIZJ.getClass();
            if (!TextUtils.isEmpty(crashType) && !TextUtils.isEmpty(crashReason)) {
                Iterator it = ((ArrayList) LIZJ.LJI).iterator();
                while (it.hasNext()) {
                    Q7G q7g = (Q7G) it.next();
                    if (q7g.isSameException(crashType, crashReason)) {
                        if (q7g instanceof ExceptionManager.CloudException) {
                            SafeModeReporter.CrashInfo LIZIZ2 = SafeModeReporter.CrashInfo.LIZIZ(crashType, crashReason);
                            int i3 = ((ExceptionManager.CloudException) q7g).configType;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("reachType", i3);
                                jSONObject.put("crash", LIZIZ2.LIZLLL());
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            SafeModeReporter.LIZJ("safemode_skip_crash", jSONObject);
                            PSY.LIZ(C16880lQ.LLLZ("reportSkipCrash reachType:%d", new Object[]{Integer.valueOf(i3)}));
                        }
                        PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("cloudSkipBootProtected crashType(%s) stack(%s)", new Object[]{crashType, crashReason}));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (C66458Q6k.class) {
                    LIZIZ = C66458Q6k.LIZ.LIZIZ(0L, "boot_protected_time_stamp");
                }
                if (currentTimeMillis - LIZIZ < C66465Q6r.LJIILLIIL.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Skip Enter: bootProtected ");
                    LIZ.append(i);
                    PSY.LJFF("RollBackState", X1D.LIZIZ(LIZ));
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("reachType", i);
                    } catch (JSONException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    SafeModeReporter.LIZJ("safemode_in_protect_period", jSONObject2);
                    this.LIZ.LJIIIIZZ();
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Enter: bootProtected ");
                LIZ2.append(i);
                PSY.LJFF("RollBackState", X1D.LIZIZ(LIZ2));
                Context context = this.LIZ.LJ;
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.processName.startsWith(context.getPackageName()) && (i2 = runningAppProcessInfo.pid) != myPid) {
                        Process.killProcess(i2);
                    }
                }
                SafeModeReporter.CrashInfo LIZ3 = SafeModeReporter.CrashInfo.LIZ(LIZLLL);
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("reachType", i);
                    jSONObject3.put("crash", LIZ3.LIZLLL());
                } catch (JSONException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                SafeModeReporter.LIZJ("safemode_reach_boot_protect", jSONObject3);
                PSY.LIZ(C16880lQ.LLLZ("%s reachType:%d", new Object[]{"safemode_reach_boot_protect", Integer.valueOf(i)}));
                C66460Q6m.LIZIZ().getClass();
                C66460Q6m.LIZIZ().LJFF(LIZLLL, i);
                Q7F q7f = this.LIZ.mQuietState;
                if (q7f instanceof QuietState) {
                    ((QuietState) q7f).LIZIZ = Process.myPid();
                    PSY.LJFF("RollBackState", "setEnterQuietStatePid");
                }
                LJIIIIZZ(this.LIZ.mQuietState, new QuietState.QuietStateParam(C66465Q6r.LJIILLIIL.LJII.LIZ().longValue(), true, i, -1L));
                C66460Q6m.LIZIZ().getClass();
                try {
                    Thread.sleep(120000L);
                    PSY.LJFF("RollBackState", "bootProtected: sleep");
                    return;
                } catch (InterruptedException e4) {
                    C16880lQ.LLLLIIL(e4);
                    return;
                }
            }
        }
        PSY.LJFF("RollBackState", "Skip Enter: shouldSkipBootProtected ");
        this.LIZ.LJFF();
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(Q7F q7f, StateParam stateParam) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        if (q7f instanceof C66469Q6v) {
            SafeModeReporter.LIZJ("safemode_abort_roll_back", new JSONObject());
            PSY.LIZLLL("RollBackState", "find last RollBackState abnormal exit");
            PSY.LIZIZ("RollBackState", "Begin cleanAllSnapshot");
            Iterator it = ((ArrayList) this.LIZIZ).iterator();
            while (it.hasNext()) {
                Q79 q79 = (Q79) it.next();
                q79.clearAll();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cleanAllSnapshot ");
                q79.getName();
                LIZ.append("SettingAndAB");
                PSY.LJFF("RollBackState", X1D.LIZIZ(LIZ));
            }
            PSY.LIZIZ("RollBackState", "End cleanAllSnapshot");
            this.LIZ.LJFF();
            return;
        }
        PSY.LJFF("RollBackState", "onEnterState ");
        if (stateParam != null && (stateParam.flags & 2) == 2 && (i3 = stateParam.payload) > -1) {
            LJIIIZ(i3);
            return;
        }
        C66465Q6r.LJIILLIIL.getClass();
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                if (((Q79) it2.next()).LIZ().size() >= 2) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (stateParam != null) {
            i = stateParam.payload;
        } else {
            i = -1;
        }
        if (z2) {
            this.LIZ.LJFF = true;
            PSY.LJFF("RollBackState", "Begin smart rollback");
            ArrayList arrayList = new ArrayList();
            ExceptionManager.ExceptionRecord LIZLLL = LJ().LIZLLL();
            if (LIZLLL == null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cf_names", "can't find enter rollback record");
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                SafeModeReporter.LIZJ("safemode_roll_back_fail", jSONObject);
                PSY.LJFF("RollBackState", "can't find enter rollback record");
            } else {
                SafeModeReporter.CrashInfo LIZ2 = SafeModeReporter.CrashInfo.LIZ(LIZLLL);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("crash", LIZ2.LIZLLL());
                    jSONObject2.put("reachType", i);
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                SafeModeReporter.LIZJ("safemode_reach_roll_back", jSONObject2);
                PSY.LIZ(C16880lQ.LLLZ("%s reachType:%d", new Object[]{"safemode_reach_roll_back", Integer.valueOf(i)}));
                C66465Q6r.LJIILLIIL.getClass();
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it3 = ((ArrayList) this.LIZIZ).iterator();
                while (it3.hasNext()) {
                    Q79 q792 = (Q79) it3.next();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Begin rollBack: ");
                    LIZ3.append(q792.toString());
                    PSY.LIZIZ("RollBackState", X1D.LIZIZ(LIZ3));
                    List<PTL> LIZ4 = q792.LIZ();
                    if (LIZ4.size() >= 2) {
                        if (q792.LIZJ((PTL) DIX.LIZJ(LIZ4, 2, LIZ4))) {
                            for (List<PTL> LIZ5 = q792.LIZ(); LIZ5.size() != 0; LIZ5 = q792.LIZ()) {
                                q792.LIZLLL((PTL) ListProtector.get(LIZ5, 0));
                            }
                            q792.getName();
                            arrayList.add("SettingAndAB");
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("rollBack: ");
                            LIZ6.append(q792.toString());
                            LIZ6.append(" successfully");
                            PSY.LJFF("RollBackState", X1D.LIZIZ(LIZ6));
                            z = true;
                        } else {
                            stringBuffer.append(",SettingAndAB");
                            q792.getName();
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append("rollBack: ");
                            LIZ7.append(q792.toString());
                            LIZ7.append(" failed");
                            PSY.LIZLLL("RollBackState", X1D.LIZIZ(LIZ7));
                        }
                    } else {
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("rollBack: can't find ");
                        LIZ8.append(q792.toString());
                        LIZ8.append(" stable snapshot");
                        PSY.LIZLLL("RollBackState", X1D.LIZIZ(LIZ8));
                    }
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("End rollBack: ");
                    LIZ9.append(q792.toString());
                    PSY.LIZIZ("RollBackState", X1D.LIZIZ(LIZ9));
                }
                if (z) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        String str = (String) it4.next();
                        stringBuffer2.append(',');
                        stringBuffer2.append(str);
                    }
                    PTM LJI = PTM.LJI(this.LIZ.LJ);
                    LJI.getClass();
                    JSONObject jSONObject3 = null;
                    try {
                        StringBuilder LIZ10 = X1D.LIZ();
                        LIZ10.append(LJI.LIZJ.getAbsolutePath());
                        LIZ10.append("-tmp");
                        File file = new File(X1D.LIZIZ(LIZ10));
                        if (LJI.LIZJ.exists()) {
                            PTM.LJFF(file);
                        } else if (file.exists()) {
                            file.renameTo(LJI.LIZJ);
                        }
                        if (LJI.LIZJ.exists()) {
                            String readFileToString = FileUtils.readFileToString(LJI.LIZJ, Charset.forName("UTF-8"));
                            PTK ptk = new PTK();
                            ptk.LIZIZ = readFileToString;
                            ptk.LIZ = 0L;
                            jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("settingsAndAB", ptk.LIZIZ);
                            } catch (JSONException e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                    } catch (Exception e4) {
                        PTM.LJIIIIZZ(e4);
                        C16880lQ.LLLLIIL(e4);
                    }
                    SafeModeReporter.CrashInfo LIZ11 = SafeModeReporter.CrashInfo.LIZ(LIZLLL);
                    String substring = stringBuffer2.substring(1);
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("cf_names", substring);
                        jSONObject4.put("crash", LIZ11.LIZLLL());
                        if (jSONObject3 != null) {
                            jSONObject4.put("payload", jSONObject3);
                        }
                    } catch (JSONException e5) {
                        C16880lQ.LLLLIIL(e5);
                    }
                    SafeModeReporter.LIZJ("safemode_done_roll_back", jSONObject4);
                }
                if (stringBuffer.length() > 0) {
                    String substring2 = stringBuffer.substring(1);
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("cf_names", substring2);
                    } catch (JSONException e6) {
                        C16880lQ.LLLLIIL(e6);
                    }
                    SafeModeReporter.LIZJ("safemode_roll_back_fail", jSONObject5);
                }
                StringBuilder LIZ12 = X1D.LIZ();
                LIZ12.append("End smart rollback result ");
                LIZ12.append(z);
                PSY.LJFF("RollBackState", X1D.LIZIZ(LIZ12));
                this.LIZ.LJFF = false;
                if (z) {
                    C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
                    PSY.LJFF("RollBackState", C16880lQ.LLLZ("try to enter mQuietState QuietPeriod: %d", new Object[]{Long.valueOf(c66465Q6r.LJIIJJI.LIZ().longValue())}));
                    Q7F q7f2 = this.LIZ.mQuietState;
                    if (q7f2 instanceof QuietState) {
                        ((QuietState) q7f2).LIZIZ = Process.myPid();
                        PSY.LJFF("RollBackState", "setEnterQuietStatePid");
                    }
                    LJIIIIZZ(this.LIZ.mQuietState, new QuietState.QuietStateParam(c66465Q6r.LJIIJJI.LIZ().longValue(), false, -1, System.currentTimeMillis()));
                    return;
                }
            }
            i2 = 3;
        } else {
            i2 = 0;
        }
        LJIIIZ(i2);
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.Q7F
    public final void LIZ(long j, String str, String str2) {
        PSY.LIZLLL("RollBackState", "find exception in Rolling Back");
    }
}
