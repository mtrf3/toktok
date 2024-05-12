package com.ss.android.ugc.aweme.legoImp.task;

import X.C09900aA;
import X.C09970aH;
import X.C0RN;
import X.C10K;
import X.C16880lQ;
import X.C47261Igj;
import X.C48189Ivh;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F3H;
import X.F76;
import X.F78;
import X.F9U;
import X.UCH;
import X.X1D;
import Y.ACallableS83S0200000_6;
import android.content.Context;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class RheaTraceUploadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "RheaTraceUploadTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
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
        o.LJIIIZ(context, "context");
        try {
            if (ujb.o.LJJJJIZL("ATrace", F78.LIZ, true) || ujb.o.LJJJJIZL("MTrace", F78.LIZ, true)) {
                LauncherServiceImpl.LIZLLL().LIZ();
                if (o.LJ("disabled", "MTrace")) {
                    File LIZLLL = LIZLLL(context, "MTrace");
                    if (LIZLLL.exists() && C48189Ivh.LJI(context) && C09900aA.LIZJ("upload_rhea_fake_trace_file")) {
                        C10K.LIZJ(new ACallableS83S0200000_6(this, LIZLLL, 3));
                        return;
                    }
                    return;
                }
                if (o.LJ("disabled", "ATrace")) {
                    File LIZLLL2 = LIZLLL(context, "ATrace");
                    if (LIZLLL2.exists() && C48189Ivh.LJI(context) && C09900aA.LIZJ("upload_rhea_atrace_file")) {
                        C10K.LIZJ(new ACallableS83S0200000_6(this, LIZLLL2, 2));
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static File LIZLLL(Context context, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(context).getAbsolutePath());
        LIZ.append("/rhea");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (o.LJ(str, "ATrace")) {
            return new File(LIZIZ, "rhea_startup.trace");
        }
        return new File(LIZIZ, "rhea_startup.fake");
    }

    public static void LJ(File file, String str) {
        UCH uch = new UCH();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EF7.LJFF());
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(DeviceRegisterManager.getAppId());
        LIZ2.append("");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        List LJJIJ = C47261Igj.LJJIJ(file.getAbsolutePath());
        JSONObject jSONObject = new JSONObject();
        Map<String, String> LJ = C09970aH.LJ();
        o.LJIIIIZZ(LJ, "getQueryParamsMap()");
        for (Map.Entry<String, String> entry : LJ.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        F9U.LIZ.LJII(new F3H(uch, LIZIZ2, "66812471934", LIZIZ, LJJIJ, "rhea_trace_upload", jSONObject, new F76(file)));
    }
}
