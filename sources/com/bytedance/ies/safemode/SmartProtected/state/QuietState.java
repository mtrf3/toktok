package com.bytedance.ies.safemode.SmartProtected.state;

import X.C16880lQ;
import X.C66458Q6k;
import X.C66459Q6l;
import X.C66460Q6m;
import X.C66462Q6o;
import X.C66465Q6r;
import X.InterfaceC65349Pkn;
import X.O1A;
import X.PP9;
import X.PSY;
import X.Q7E;
import X.Q7F;
import X.X1D;
import Y.ARunnableS18S0101000_14;
import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QuietState extends BaseState {
    public volatile int LIZIZ;
    public volatile boolean LIZJ;
    public long LIZLLL;
    public long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public volatile long LJIIIIZZ;
    public ScheduledFuture<?> LJIIIZ;

    @O1A
    @InterfaceC65349Pkn("curForeQuietTime")
    public volatile int curForeQuietTime;

    @O1A
    @InterfaceC65349Pkn("needReportBootProtectedResult")
    public volatile boolean needReportBootProtectedResult = true;
    public volatile int LJII = -1;

    @Override // X.Q7F
    public final String getName() {
        return "QuietState";
    }

    public static void LJIIIZ(QuietState quietState) {
        quietState.LJFF++;
        Context context = quietState.LIZ.LJ;
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals(context.getPackageName())) {
                if (next.importance == 100) {
                    quietState.curForeQuietTime++;
                    quietState.LIZ.LJI();
                }
            }
        }
        if (!quietState.LJI) {
            PSY.LIZIZ("QuietState", C16880lQ.LLLZ("smartboot smartEnterTimeStamp: %d maxQuietTime: %d curdiff %d", new Object[]{Long.valueOf(quietState.LJIIIIZZ), Long.valueOf(quietState.LIZLLL), Long.valueOf(System.currentTimeMillis() - quietState.LJIIIIZZ)}));
            if (System.currentTimeMillis() - quietState.LJIIIIZZ > quietState.LIZLLL) {
                PSY.LJFF("QuietState", "reach smartboot quiet time");
                quietState.LIZ.LJIIIIZZ();
                return;
            }
            return;
        }
        if (!PP9.LIZ(quietState.LIZ.LJ)) {
            if (C66460Q6m.LIZIZ().LIZJ != null) {
                if (quietState.LJFF * 1000 < 60000) {
                    PSY.LJFF("QuietState", "wait bootprtect proccess");
                    return;
                } else {
                    C66460Q6m LIZIZ = C66460Q6m.LIZIZ();
                    LIZIZ.LIZJ = null;
                    LIZIZ.LIZLLL = -1;
                }
            } else if (quietState.LJ == 0 || System.currentTimeMillis() - quietState.LJ < 10000) {
                PSY.LJFF("QuietState", "skip dispose boot protected logic");
                return;
            }
            C66459Q6l LIZ = C66458Q6k.LIZ();
            if (LIZ != null) {
                quietState.LJIIJ(LIZ);
                return;
            }
            SafeModeReporter.CrashInfo LIZ2 = SafeModeReporter.CrashInfo.LIZ(quietState.LJ().LIZLLL());
            int i = quietState.LJII;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("reachType", i);
                jSONObject.put("crash", LIZ2.LIZLLL());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            SafeModeReporter.LIZJ("safemode_kill_process_cancel_v2", jSONObject);
            PSY.LJFF("QuietState", "check kill bootprotect process");
            quietState.needReportBootProtectedResult = false;
            quietState.LIZ.LJIIIIZZ();
            return;
        }
        PSY.LJFF("QuietState", "checking bootprotect process");
        if (quietState.LJFF * 1000 <= C66465Q6r.LJIILLIIL.LIZ()) {
            return;
        }
        PSY.LIZLLL("QuietState", "too long wait bootprotect time, so give up");
        quietState.needReportBootProtectedResult = false;
        quietState.LIZ.LJIIIIZZ();
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJII(Q7F q7f) {
        if (!this.LIZJ) {
            if (q7f instanceof Q7E) {
                List<ExceptionManager.ExceptionRecord> LIZ = LJ().LIZJ.LIZ();
                ExceptionManager.ExceptionRecord LIZLLL = LJ().LIZLLL();
                if (LIZ == null || LIZ.size() == 0) {
                    if (this.LJI) {
                        if (this.needReportBootProtectedResult) {
                            Context context = this.LIZ.LJ;
                            long j = this.curForeQuietTime;
                            int i = this.LJII;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("reachType", i);
                                jSONObject.put("realUseTime", j * 1000);
                                PSY.LIZIZ("SafeModeReporter", "addEnterRollBackStack safemode_protect_success_v2_1");
                                SafeModeReporter.LIZ(context, jSONObject);
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            SafeModeReporter.LIZJ("safemode_protect_success_v2_1", jSONObject);
                            this.LIZ.getClass();
                            if (LIZLLL != null) {
                                SafeModeReporter.LJ("reportProtectSuccessV21", LIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                            }
                        }
                    } else {
                        Context context2 = this.LIZ.LJ;
                        int i2 = this.curForeQuietTime;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("realUseTime", i2 * 1000);
                            PSY.LIZIZ("SafeModeReporter", "addEnterRollBackStack safemode_roll_back_protect_success");
                            SafeModeReporter.LIZ(context2, jSONObject2);
                        } catch (JSONException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        SafeModeReporter.LIZJ("safemode_roll_back_protect_success", jSONObject2);
                        this.LIZ.getClass();
                        if (LIZLLL != null) {
                            SafeModeReporter.LJ("reportRollBackProtectSuccess", LIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                        }
                    }
                } else if (this.LJI) {
                    if (this.needReportBootProtectedResult) {
                        Context context3 = this.LIZ.LJ;
                        SafeModeReporter.CrashInfo[] LIZJ = SafeModeReporter.CrashInfo.LIZJ(LIZ);
                        long j2 = this.curForeQuietTime;
                        int i3 = this.LJII;
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("reachType", i3);
                            jSONObject3.put("realUseTime", j2 * 1000);
                            if (LIZJ != null) {
                                jSONObject3.put("crash_times", LIZJ.length);
                                jSONObject3.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, LIZJ));
                            }
                            PSY.LIZIZ("SafeModeReporter", "addEnterRollBackStack safemode_protect_success_v2_2");
                            SafeModeReporter.LIZ(context3, jSONObject3);
                        } catch (JSONException e3) {
                            C16880lQ.LLLLIIL(e3);
                        }
                        SafeModeReporter.LIZJ("safemode_protect_success_v2_2", jSONObject3);
                        this.LIZ.getClass();
                        if (LIZLLL != null) {
                            SafeModeReporter.LJ("reportProtectSuccessV22", LIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                        }
                    }
                } else {
                    Context context4 = this.LIZ.LJ;
                    SafeModeReporter.CrashInfo[] LIZJ2 = SafeModeReporter.CrashInfo.LIZJ(LIZ);
                    int i4 = this.curForeQuietTime;
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("realUseTime", i4 * 1000);
                        if (LIZJ2 != null) {
                            jSONObject4.put("crash_times", LIZJ2.length);
                            jSONObject4.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, LIZJ2));
                        }
                        PSY.LIZIZ("SafeModeReporter", "addEnterRollBackStack safemode_roll_back_protect_success_2");
                        SafeModeReporter.LIZ(context4, jSONObject4);
                    } catch (JSONException e4) {
                        C16880lQ.LLLLIIL(e4);
                    }
                    SafeModeReporter.LIZJ("safemode_roll_back_protect_success_2", jSONObject4);
                    this.LIZ.getClass();
                    if (LIZLLL != null) {
                        SafeModeReporter.LJ("reportRollBackStartSuccess2", LIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                    }
                }
                if (this.LJI) {
                    synchronized (C66458Q6k.class) {
                        C66458Q6k.LIZ.LIZ.edit().remove("protected_activity_result").apply();
                        PSY.LJ("clearSafeModeActivityResult");
                    }
                }
                LJ().LIZIZ();
            }
            ScheduledFuture<?> scheduledFuture = this.LJIIIZ;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ExceptionManager LJ = LJ();
            LJ.LIZJ.LIZ().clear();
            if (LJ.LJIIJJI) {
                LJ.LJII(LJ.LIZJ.LIZ(), LJ.LJIIIZ);
            } else {
                LJ.LJII(LJ.LIZJ.LIZ(), LJ.LJIIJ);
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("first enter quiet so skip onExitState logic pid ");
            LIZ2.append(this.LIZIZ);
            PSY.LJFF("QuietState", X1D.LIZIZ(LIZ2));
        }
        this.curForeQuietTime = 0;
        this.LIZLLL = 0L;
        this.LJFF = 0L;
        this.LJI = false;
        this.needReportBootProtectedResult = true;
        PSY.LJFF("QuietState", "Exit QuietState");
    }

    public final boolean LJIIJ(C66459Q6l c66459Q6l) {
        long j;
        if (c66459Q6l == null) {
            return false;
        }
        if (System.currentTimeMillis() - c66459Q6l.LIZ > C66465Q6r.LJIILLIIL.LIZ() * 2) {
            PSY.LIZLLL("QuietState", "checking invalid bootprotect result");
            this.needReportBootProtectedResult = false;
            this.LIZ.LJIIIIZZ();
            return true;
        }
        if (c66459Q6l.LIZIZ == 1) {
            PSY.LIZIZ("QuietState", "checking click bootprotect clean btn");
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(System.currentTimeMillis());
            C66462Q6o LIZ = C66462Q6o.LIZ(this.LIZ.LJ);
            LIZ.getClass();
            long j2 = 0;
            try {
                j = CastLongProtector.parseLong(FileUtils.readFileToString(LIZ.LIZ, Charset.forName("UTF-8")));
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                j = 0;
            }
            objArr[1] = Long.valueOf(j);
            objArr[2] = Long.valueOf(this.LIZLLL);
            PSY.LJFF("QuietState", C16880lQ.LLLZ("curtime: %d starttime: %d maxQuietTime: %d", objArr));
            long currentTimeMillis = System.currentTimeMillis();
            C66462Q6o LIZ2 = C66462Q6o.LIZ(this.LIZ.LJ);
            LIZ2.getClass();
            try {
                j2 = CastLongProtector.parseLong(FileUtils.readFileToString(LIZ2.LIZ, Charset.forName("UTF-8")));
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            if (currentTimeMillis - j2 <= this.LIZLLL) {
                return false;
            }
            PSY.LJFF("QuietState", "reach bootprotect quiet time");
            this.LIZ.LJIIIIZZ();
            return true;
        }
        PSY.LIZIZ("QuietState", "checking click bootprotect exit btn");
        this.needReportBootProtectedResult = false;
        this.LIZ.LJIIIIZZ();
        return true;
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(Q7F q7f, StateParam stateParam) {
        if (stateParam instanceof QuietStateParam) {
            QuietStateParam quietStateParam = (QuietStateParam) stateParam;
            this.LIZLLL = quietStateParam.maxQuietTime;
            this.LJI = quietStateParam.fromBootProtected;
            this.LJII = quietStateParam.reachType;
            this.LJIIIIZZ = quietStateParam.smartEnterTimeStamp;
        }
        if (C66460Q6m.LIZIZ().LIZJ != null) {
            this.LIZJ = false;
        } else if (this.LIZIZ != 0) {
            this.LIZJ = true;
        } else {
            this.LIZJ = false;
        }
        if (this.LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("first enter quiet so skip enter logic pid ");
            LIZ.append(this.LIZIZ);
            PSY.LJFF("QuietState", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJ = System.currentTimeMillis();
        PSY.LJFF("QuietState", C16880lQ.LLLZ("Enter maxQuietTime: %d fromBootProtected: %b", new Object[]{Long.valueOf(this.LIZLLL), Boolean.valueOf(this.LJI)}));
        ExceptionManager LIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
        boolean z = !this.LJI;
        LIZJ.getClass();
        synchronized (ExceptionManager.class) {
            if (!z) {
                ExceptionManager.LJIILL.LIZJ.LIZJ(LIZJ.LJ(ExceptionManager.LJIILL.LJIIJ));
            } else {
                ExceptionManager.LJIILL.LIZJ.LIZJ(LIZJ.LJ(ExceptionManager.LJIILL.LJIIIZ));
            }
            LIZJ.LJIIJJI = z;
        }
        if (!this.LJI || !LJIIJ(C66458Q6k.LIZ())) {
            this.LJIIIZ = this.LIZ.LJI.scheduleWithFixedDelay(new ARunnableS18S0101000_14(1, this, 0), 10L, 1L, TimeUnit.SECONDS);
        }
    }

    /* loaded from: classes12.dex */
    public static class QuietStateDeserializer implements i<QuietState> {
        @Override // com.google.gson.i
        public final QuietState deserialize(j jVar, Type type, h hVar) {
            QuietState quietState = new QuietState();
            m LJIIZILJ = jVar.LJIIZILJ();
            if (LJIIZILJ.LJJIJLIJ("curForeQuietTime")) {
                quietState.curForeQuietTime = LJIIZILJ.LJJIJ("curForeQuietTime").LJIILJJIL();
            }
            if (LJIIZILJ.LJJIJLIJ("stateParam")) {
                quietState.stateParam = (StateParam) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, LJIIZILJ.LJJIJ("stateParam").toString(), QuietStateParam.class);
            } else {
                quietState.stateParam = null;
            }
            return quietState;
        }
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.Q7F
    public final void LIZ(long j, String str, String str2) {
        ExceptionManager.ExceptionRecord LJI;
        PSY.LJFF("QuietState", "doException: ");
        if (this.LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("first enter quiet so skip doException logic pid ");
            LIZ.append(this.LIZIZ);
            PSY.LJFF("QuietState", X1D.LIZIZ(LIZ));
            return;
        }
        ExceptionManager LJ = LJ();
        if (LJ.LJIIJJI) {
            LJI = LJ.LJI(str, str2, j, LJ.LIZJ.LIZ(), LJ.LJIIIZ, C66465Q6r.LJIILLIIL.LJIIJ.LIZ().longValue());
        } else {
            LJI = LJ.LJI(str, str2, j, LJ.LIZJ.LIZ(), LJ.LJIIJ, C66465Q6r.LJIILLIIL.LJIIJ.LIZ().longValue());
        }
        if (!this.LJI) {
            PSY.LIZIZ("QuietState", "smart protected to dispose exception");
            if (LJI.isSameException(LJ.LIZLLL())) {
                PSY.LIZIZ("QuietState", "smart protected to dispose exception(same exception)");
                ExceptionManager LIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
                LIZJ.getClass();
                LJI.white = true;
                LIZJ.LIZIZ.LIZ().add(LJI);
                while (LIZJ.LIZIZ.LIZ().size() > 5) {
                    ListProtector.remove(LIZJ.LIZIZ.LIZ(), 0);
                }
                LIZJ.LJII(LIZJ.LIZIZ.LIZ(), LIZJ.LJIIIIZZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJI.crashType);
                LIZ2.append(LJI.crashReason);
                PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("add %s exception to white list", new Object[]{PP9.LIZIZ(X1D.LIZIZ(LIZ2))}));
                SafeModeReporter.CrashInfo LIZ3 = SafeModeReporter.CrashInfo.LIZ(LJI);
                long j2 = this.curForeQuietTime;
                long j3 = this.LJFF;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("frontTime", j2 * 1000);
                    jSONObject.put("liveTime", j3 * 1000);
                    jSONObject.put("crash", LIZ3.LIZLLL());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                SafeModeReporter.LIZJ("safemode_roll_back_protect_fail_same", jSONObject);
                SmartProtectedStateMachine smartProtectedStateMachine = this.LIZ;
                ExceptionManager.ExceptionRecord LIZLLL = LJ.LIZLLL();
                smartProtectedStateMachine.getClass();
                if (LIZLLL != null) {
                    SafeModeReporter.LJ("reportRollBackProtectFailSame", LIZLLL, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
                }
                LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(2, 1));
                return;
            }
            PSY.LIZIZ("QuietState", "smart protected to dispose exception(other exception)");
            int LJIIIIZZ = LJ.LJIIIIZZ();
            if (LJIIIIZZ != 0) {
                SafeModeReporter.CrashInfo[] LIZJ2 = SafeModeReporter.CrashInfo.LIZJ(LJ.LIZJ.LIZ());
                long j4 = this.curForeQuietTime;
                long j5 = this.LJFF;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("frontTime", j4 * 1000);
                    jSONObject2.put("liveTime", j5 * 1000);
                    jSONObject2.put("reasonType", LJIIIIZZ);
                    if (LIZJ2 != null) {
                        jSONObject2.put("crash_times", LIZJ2.length);
                        jSONObject2.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, LIZJ2));
                    }
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                SafeModeReporter.LIZJ("safemode_roll_back_protect_fail_other", jSONObject2);
                SmartProtectedStateMachine smartProtectedStateMachine2 = this.LIZ;
                ExceptionManager.ExceptionRecord LIZLLL2 = LJ.LIZLLL();
                smartProtectedStateMachine2.getClass();
                if (LIZLLL2 != null) {
                    SafeModeReporter.LJ("reportRollBackProtectFailOther", LIZLLL2, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
                }
                LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(2, 1));
                return;
            }
            return;
        }
        if (C66458Q6k.LIZ() == null && (this.LJ == 0 || System.currentTimeMillis() - this.LJ < 10000 || PP9.LIZ(this.LIZ.LJ))) {
            PSY.LJFF("QuietState", "skip dispose boot protected doException");
            return;
        }
        PSY.LIZIZ("QuietState", "boot protected to dispose exception");
        if (LJI.isSameException(LJ.LIZLLL())) {
            PSY.LJFF("QuietState", "boot protected to dispose exception(same exception)");
            SafeModeReporter.CrashInfo LIZ4 = SafeModeReporter.CrashInfo.LIZ(LJI);
            long j6 = this.curForeQuietTime;
            int i = this.LJII;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("reachType", i);
                jSONObject3.put("frontTime", j6 * 1000);
                jSONObject3.put("crash", LIZ4.LIZLLL());
            } catch (JSONException e3) {
                C16880lQ.LLLLIIL(e3);
            }
            SafeModeReporter.LIZJ("safemode_protect_fail_v2", jSONObject3);
            SmartProtectedStateMachine smartProtectedStateMachine3 = this.LIZ;
            ExceptionManager.ExceptionRecord LIZLLL3 = LJ.LIZLLL();
            smartProtectedStateMachine3.getClass();
            if (LIZLLL3 != null) {
                SafeModeReporter.LJ("reportProtectFail", LIZLLL3, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
            }
            this.needReportBootProtectedResult = false;
            this.LIZ.LJIIIIZZ();
            return;
        }
        PSY.LJFF("QuietState", "boot protected to dispose exception(other exception)");
        int LJIIIIZZ2 = LJ.LJIIIIZZ();
        if (LJIIIIZZ2 != 0) {
            SafeModeReporter.CrashInfo[] LIZJ3 = SafeModeReporter.CrashInfo.LIZJ(LJ.LIZJ.LIZ());
            long j7 = this.curForeQuietTime;
            long j8 = this.LJFF;
            int i2 = this.LJII;
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("reachType", i2);
                jSONObject4.put("frontTime", j7 * 1000);
                jSONObject4.put("liveTime", j8 * 1000);
                jSONObject4.put("reasonType", LJIIIIZZ2);
                if (LIZJ3 != null) {
                    jSONObject4.put("crash_times", LIZJ3.length);
                    jSONObject4.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, LIZJ3));
                }
            } catch (JSONException e4) {
                C16880lQ.LLLLIIL(e4);
            }
            SafeModeReporter.LIZJ("safemode_protect_other_crash_v2", jSONObject4);
            SmartProtectedStateMachine smartProtectedStateMachine4 = this.LIZ;
            ExceptionManager.ExceptionRecord LIZLLL4 = LJ.LIZLLL();
            smartProtectedStateMachine4.getClass();
            if (LIZLLL4 != null) {
                SafeModeReporter.LJ("reportProtectOtherCrash", LIZLLL4, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
            }
            PSY.LJFF("QuietState", "exit boot protected quiet ahead of time");
            this.needReportBootProtectedResult = false;
            this.LIZ.LJIIIIZZ();
        }
    }

    /* loaded from: classes12.dex */
    public static class QuietStateParam extends StateParam {

        @O1A
        @InterfaceC65349Pkn("fromBootProtected")
        public boolean fromBootProtected;

        @O1A
        @InterfaceC65349Pkn("maxQuietTime")
        public long maxQuietTime;

        @O1A
        @InterfaceC65349Pkn("reachType")
        public int reachType;

        @O1A
        @InterfaceC65349Pkn("smartEnterTimeStamp")
        public long smartEnterTimeStamp;

        public QuietStateParam(long j, boolean z, int i, long j2) {
            this.maxQuietTime = j;
            this.fromBootProtected = z;
            this.reachType = i;
            this.smartEnterTimeStamp = j2;
        }
    }
}
