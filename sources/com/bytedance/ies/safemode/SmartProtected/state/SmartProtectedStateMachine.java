package com.bytedance.ies.safemode.SmartProtected.state;

import X.C16880lQ;
import X.C38891fp;
import X.C66460Q6m;
import X.C66463Q6p;
import X.C66464Q6q;
import X.C66467Q6t;
import X.C66469Q6v;
import X.InterfaceC65349Pkn;
import X.O1A;
import X.PP9;
import X.PSY;
import X.Q7E;
import X.Q7F;
import X.Q7H;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.QuietState;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.commons.io.FileUtils;

/* loaded from: classes12.dex */
public class SmartProtectedStateMachine {
    public static final Gson LJII;
    public volatile Q7F LIZ;
    public File LIZIZ;
    public volatile boolean LIZJ;
    public Context LJ;

    @O1A
    @InterfaceC65349Pkn("mBuildingState")
    public Q7F mBuildingState;

    @O1A
    @InterfaceC65349Pkn("mCheckingState")
    public Q7F mCheckingState;

    @O1A
    @InterfaceC65349Pkn("mQuietState")
    public Q7F mQuietState;

    @O1A
    @InterfaceC65349Pkn("mRollBackState")
    public Q7F mRollBackState;

    @O1A
    @InterfaceC65349Pkn("mStopState")
    public Q7F mStopState;
    public final List<Q7H> LIZLLL = new ArrayList();
    public final ScheduledExecutorService LJI = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("SmartProtectedStateMachine"));

    @O1A
    @InterfaceC65349Pkn("lastStateName")
    public String lastStateName = "";
    public boolean LJFF = false;

    public final synchronized Q7F LIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x00d7, TryCatch #1 {, blocks: (B:4:0x0001, B:6:0x0005, B:7:0x000a, B:10:0x000c, B:12:0x0049, B:14:0x0057, B:15:0x005e, B:17:0x0085, B:18:0x0089, B:19:0x008c, B:22:0x008e, B:24:0x009c, B:25:0x00a4, B:27:0x00b2, B:28:0x00ba, B:30:0x00c8, B:32:0x00d0), top: B:3:0x0001, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r6 = this;
            monitor-enter(r6)     // Catch: java.lang.Exception -> Lda
            boolean r0 = r6.LIZJ     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Lc
            java.lang.String r0 = "machine has been started,so skip start op"
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld7
            return
        Lc:
            android.content.Context r0 = r6.LJ     // Catch: java.lang.Throwable -> Ld7
            java.io.File r0 = LIZIZ(r0)     // Catch: java.lang.Throwable -> Ld7
            r6.LIZIZ = r0     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mBuildingState     // Catch: java.lang.Throwable -> Ld7
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mCheckingState     // Catch: java.lang.Throwable -> Ld7
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mRollBackState     // Catch: java.lang.Throwable -> Ld7
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mQuietState     // Catch: java.lang.Throwable -> Ld7
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mStopState     // Catch: java.lang.Throwable -> Ld7
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> Ld7
            android.content.Context r0 = r6.LJ     // Catch: java.lang.Throwable -> Ld7
            com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager r1 = com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager.LIZJ(r0)     // Catch: java.lang.Throwable -> Ld7
            X.Q6r r0 = X.C66465Q6r.LJIILLIIL     // Catch: java.lang.Throwable -> Ld7
            X.Q7A r0 = r0.LJIILJJIL     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Ld7
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r6.lastStateName     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld7
            r2 = 0
            if (r0 != 0) goto Ld0
            java.lang.String r1 = r6.lastStateName     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mCheckingState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L8e
            X.Q7F r5 = r6.mCheckingState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "machine lastState mCheckingState"
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
        L5e:
            r1 = 1
            r6.LIZJ = r1     // Catch: java.lang.Throwable -> Ld7
            X.Q6v r0 = new X.Q6v     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            r6.LIZ = r0     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.LIZ     // Catch: java.lang.Throwable -> Ld7
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "machine start %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.LIZ     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> Ld7
            r0 = 0
            r3[r0] = r1     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = X.C16880lQ.LLLZ(r4, r3)     // Catch: java.lang.Throwable -> Ld7
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.LIZ     // Catch: java.lang.Throwable -> Ld7
            if (r5 == 0) goto L89
            com.bytedance.ies.safemode.SmartProtected.state.StateParam r2 = r5.getParam()     // Catch: java.lang.Throwable -> Ld7
        L89:
            r0.LIZLLL(r5, r2)     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld7
            goto Ldf
        L8e:
            java.lang.String r1 = r6.lastStateName     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mBuildingState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto La4
            X.Q7F r5 = r6.mBuildingState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "machine lastState mBuildingState"
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
            goto L5e
        La4:
            java.lang.String r1 = r6.lastStateName     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mRollBackState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Lba
            X.Q7F r5 = r6.mRollBackState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "machine lastState mRollBackState"
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
            goto L5e
        Lba:
            java.lang.String r1 = r6.lastStateName     // Catch: java.lang.Throwable -> Ld7
            X.Q7F r0 = r6.mQuietState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Ld5
            X.Q7F r5 = r6.mQuietState     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "machine lastState mQuietState"
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
            goto L5e
        Ld0:
            java.lang.String r0 = "lastStateName is empty"
            X.PSY.LJ(r0)     // Catch: java.lang.Throwable -> Ld7
        Ld5:
            r5 = r2
            goto L5e
        Ld7:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld7
            throw r0     // Catch: java.lang.Exception -> Lda
        Lda:
            r1 = move-exception
            r0 = 4
            r6.LJ(r0, r1)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine.LJII():void");
    }

    public final void LJIIIIZZ() {
        try {
            synchronized (this) {
                LJIIIZ(this.mStopState, new StateParam());
                this.LIZ.LIZJ(this.mStopState);
                Iterator it = ((ArrayList) this.LIZLLL).iterator();
                while (it.hasNext()) {
                    ((Q7H) it.next()).LIZ();
                }
                this.LIZ = null;
                LJI();
                if (!this.LJI.isShutdown()) {
                    this.LJI.shutdownNow();
                }
            }
            PSY.LJ(C16880lQ.LLLZ("machine stop", new Object[0]));
        } catch (Exception e) {
            LJ(6, e);
        }
    }

    static {
        e eVar = new e();
        eVar.LJIILL = true;
        Excluder clone = eVar.LIZ.clone();
        clone.LJLJJI = true;
        eVar.LIZ = clone;
        StateMachineDeserializer stateMachineDeserializer = new StateMachineDeserializer();
        QuietState.QuietStateDeserializer quietStateDeserializer = new QuietState.QuietStateDeserializer();
        eVar.LIZIZ(stateMachineDeserializer, SmartProtectedStateMachine.class);
        eVar.LIZIZ(quietStateDeserializer, QuietState.class);
        LJII = eVar.LIZ();
    }

    public final void LJFF() {
        try {
            this.LIZ = new C66469Q6v();
            this.LIZ.LIZIZ(this);
            PSY.LJ(C16880lQ.LLLZ("machine restart %s", new Object[]{this.LIZ.getName()}));
            this.LIZ.LIZLLL(null, null);
        } catch (Exception e) {
            LJ(5, e);
        }
    }

    public final void LJI() {
        try {
            FileUtils.writeStringToFile(this.LIZIZ, GsonProtectorUtils.toJson(LJII, this), Charset.forName("UTF-8"));
        } catch (IOException e) {
            LJ(9, e);
            PSY.LIZJ("saveState", e);
        }
    }

    public static File LIZIZ(Context context) {
        return new File(new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), "machine"), "machine.json");
    }

    public static SmartProtectedStateMachine LIZLLL(Context context) {
        String str = "{}";
        try {
            if (LIZIZ(context).exists()) {
                str = FileUtils.readFileToString(LIZIZ(context), Charset.forName("UTF-8"));
            }
        } catch (IOException e) {
            PP9.LIZJ(8, e);
            PSY.LIZJ("loadState", e);
        }
        SmartProtectedStateMachine smartProtectedStateMachine = (SmartProtectedStateMachine) GsonProtectorUtils.fromJson(LJII, str, SmartProtectedStateMachine.class);
        PSY.LJ(C16880lQ.LLLZ("machine json %s", new Object[]{str}));
        smartProtectedStateMachine.LJ = context;
        return smartProtectedStateMachine;
    }

    public final void LJ(int i, Exception exc) {
        PP9.LIZJ(i, exc);
        PSY.LIZJ(C16880lQ.LLLZ("onExceptionInStage %d", new Object[]{Integer.valueOf(i)}), exc);
        this.LIZ = this.mStopState;
        if (this.LJFF) {
            PSY.LIZLLL("SmartProtectedStateMachine", "onExceptionInStage skipResetMachineStateOnException");
            return;
        }
        try {
            C38891fp.LJIILJJIL(LIZIZ(this.LJ).getAbsolutePath());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJIIIZ(Q7F q7f, StateParam stateParam) {
        if (q7f == null) {
            return;
        }
        try {
            synchronized (this) {
                Q7F q7f2 = this.LIZ;
                LJI();
                this.LIZ.LIZJ(q7f);
                Iterator it = ((ArrayList) this.LIZLLL).iterator();
                while (it.hasNext()) {
                    ((Q7H) it.next()).LIZ();
                }
                LJI();
                this.LIZ = q7f;
                PSY.LJ(C16880lQ.LLLZ("machine switchState %s -> %s ", new Object[]{q7f2.getName(), this.LIZ.getName()}));
                this.lastStateName = q7f.getName();
                LJI();
                this.LIZ.LIZLLL(q7f2, stateParam);
                Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((Q7H) it2.next()).LIZIZ();
                }
                LJI();
            }
        } catch (Exception e) {
            LJ(7, e);
        }
    }

    /* loaded from: classes12.dex */
    public static class StateMachineDeserializer implements i<SmartProtectedStateMachine> {
        @Override // com.google.gson.i
        public final SmartProtectedStateMachine deserialize(j jVar, Type type, h hVar) {
            SmartProtectedStateMachine smartProtectedStateMachine = new SmartProtectedStateMachine();
            m LJIIZILJ = jVar.LJIIZILJ();
            if (LJIIZILJ.LJJIJLIJ("lastStateName")) {
                smartProtectedStateMachine.lastStateName = LJIIZILJ.LJJIJ("lastStateName").LJJIFFI();
            }
            if (LJIIZILJ.LJJIJLIJ("mBuildingState")) {
                smartProtectedStateMachine.mBuildingState = (Q7F) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, LJIIZILJ.LJJIJ("mBuildingState").toString(), C66467Q6t.class);
            } else {
                smartProtectedStateMachine.mBuildingState = new C66467Q6t();
            }
            if (LJIIZILJ.LJJIJLIJ("mCheckingState")) {
                smartProtectedStateMachine.mCheckingState = (Q7F) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, LJIIZILJ.LJJIJ("mCheckingState").toString(), C66464Q6q.class);
            } else {
                smartProtectedStateMachine.mCheckingState = new C66464Q6q();
            }
            if (LJIIZILJ.LJJIJLIJ("mRollBackState")) {
                smartProtectedStateMachine.mRollBackState = (Q7F) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, LJIIZILJ.LJJIJ("mRollBackState").toString(), C66463Q6p.class);
            } else {
                smartProtectedStateMachine.mRollBackState = new C66463Q6p();
            }
            if (LJIIZILJ.LJJIJLIJ("mQuietState")) {
                smartProtectedStateMachine.mQuietState = (Q7F) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, LJIIZILJ.LJJIJ("mQuietState").toString(), QuietState.class);
            } else {
                smartProtectedStateMachine.mQuietState = new QuietState();
            }
            if (LJIIZILJ.LJJIJLIJ("mStopState")) {
                smartProtectedStateMachine.mStopState = (Q7F) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, LJIIZILJ.LJJIJ("mStopState").toString(), Q7E.class);
            } else {
                smartProtectedStateMachine.mStopState = new Q7E();
            }
            return smartProtectedStateMachine;
        }
    }

    public final synchronized void LIZJ(long j, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            PSY.LIZLLL("SmartProtectedStateMachine", C16880lQ.LLLZ("skip handleException crashReason is null", new Object[0]));
            SafeModeReporter.LIZIZ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 1);
            return;
        }
        if (PP9.LIZ(this.LJ)) {
            PSY.LJFF("SmartProtectedStateMachine", C16880lQ.LLLZ("has safe mode process so skip this crash", new Object[0]));
            SafeModeReporter.LIZIZ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 2);
            return;
        }
        PSY.LJFF("SmartProtectedStateMachine", C16880lQ.LLLZ("crash type: %s reason: %s", new Object[]{str, str2}));
        if (!this.LIZJ && this.LIZ == null) {
            PSY.LJFF("SmartProtectedStateMachine", C16880lQ.LLLZ("try start immediately", new Object[0]));
            LJII();
        }
        if (this.LIZ != null) {
            this.LIZ.LIZ(j, str, str2);
            C66460Q6m.LIZIZ().getClass();
            ExceptionManager.LIZJ(this.LJ).LJFF();
            return;
        }
        SafeModeReporter.LIZIZ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 3);
    }
}
