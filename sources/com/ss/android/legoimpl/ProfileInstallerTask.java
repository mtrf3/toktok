package com.ss.android.legoimpl;

import X.C028109d;
import X.C028309f;
import X.C028409g;
import X.C09900aA;
import X.C0RN;
import X.C141335gf;
import X.C1B8;
import X.C35810E3q;
import X.C3C5;
import X.C59272Uh;
import X.C66872jr;
import X.C76800UCe;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC028009c;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileInstallerTask implements EE1, InterfaceC028009c {
    @Override // X.EEY
    public final String key() {
        return "ProfileInstallerTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.InterfaceC028009c
    public final void LIZLLL() {
        LJII(5, "onDiagnosticReceived");
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Object LIZ;
        Integer num;
        if (context == null || !((Boolean) C66872jr.LIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            C028109d.LIZIZ(context, new Executor() { // from class: X.2jp
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable p0) {
                    o.LJIIIZ(p0, "p0");
                    p0.run();
                }
            }, this, false);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LJII(0, "writeProfileFailure");
        }
        Object obj = null;
        if (C35810E3q.LJIIIIZZ()) {
            try {
                C028309f c028309f = C028409g.LIZIZ;
                if (c028309f != null) {
                    String valueOf = String.valueOf(c028309f.LIZ);
                    if (c028309f.LIZ > 16) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("switch-");
                        LIZ2.append(c028309f.LIZ >> 16);
                        valueOf = X1D.LIZIZ(LIZ2);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("verify resultCode:");
                    LIZ3.append(valueOf);
                    LIZ3.append(" hasRefProfile:");
                    LIZ3.append(c028309f.LIZIZ);
                    LIZ3.append(" hasCurProfile:");
                    LIZ3.append(c028309f.LIZJ);
                    num = Integer.valueOf(Log.d("ProfileInstaller", X1D.LIZIZ(LIZ3)));
                } else {
                    num = null;
                }
                C3C5.m7constructorimpl(num);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
        }
        if (((Boolean) C59272Uh.LIZJ.getValue()).booleanValue()) {
            try {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    LJIIIIZZ.reportFullyDrawn();
                    obj = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(obj);
            } catch (Throwable th3) {
                obj = C141335gf.LIZ(th3);
                C3C5.m7constructorimpl(obj);
            }
            C3C5.m10exceptionOrNullimpl(obj);
            C3C5.m13isSuccessimpl(obj);
        }
    }

    public static void LJII(int i, String str) {
        C09900aA.LJI("profile_installer_report", C1B8.LIZIZ("method_name", str, "code", i), null, null);
    }

    @Override // X.InterfaceC028009c
    public final void LJ(int i, Object obj) {
        LJII(i, "onResultReceived");
    }
}
