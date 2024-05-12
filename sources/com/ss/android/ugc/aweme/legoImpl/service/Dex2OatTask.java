package com.ss.android.ugc.aweme.legoimpl.service;

import X.C09900aA;
import X.C0RN;
import X.C141335gf;
import X.C16880lQ;
import X.C33672DJk;
import X.C36885Edl;
import X.C36887Edn;
import X.C36891Edr;
import X.C37179EiV;
import X.C38776FJs;
import X.C39532FfM;
import X.C3C5;
import X.C58952Tb;
import X.C76800UCe;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FileObserverC36883Edj;
import X.Q7K;
import X.X1D;
import Y.ARunnableS25S0200000_6;
import Y.AfS55S0200000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import defpackage.s1;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Dex2OatTask implements EE1 {
    public FileObserverC36883Edj LJLIL;
    public boolean LJLILLLLZI;
    public volatile boolean LJLJI;

    @Override // X.EEY
    public final String key() {
        return "Dex2OatTask";
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

    @Override // X.EE1
    public final EFK type() {
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            return EFK.BOOT_FINISH;
        }
        if (((Boolean) C36887Edn.LIZ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.APP_BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        if (r4 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoimpl.service.Dex2OatTask.LIZLLL(android.content.Context):boolean");
    }

    public static void LJ(Context context) {
        Object LIZ;
        if (((Boolean) C58952Tb.LIZIZ.getValue()).booleanValue()) {
            Keva keva = C33672DJk.LIZ;
            keva.storeInt("key_dex2oat_did_count", keva.getInt("key_dex2oat_did_count", 0) + 1);
            keva.storeLong("key_dex2oat_last_time", System.currentTimeMillis());
        }
        o.LJIIIZ(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str = C36885Edl.LIZ;
            if (str != null) {
                C38776FJs.LJIIL().LJIIJJI(context, "aot_release_build_version", C39532FfM.LIZJ(context).LIZIZ("release_build", "default_version"));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cmd package compile -m everything-profile -f ");
                LIZ2.append(str);
                Process exec = Runtime.getRuntime().exec(X1D.LIZIZ(LIZ2));
                exec.waitFor();
                LIZ = Integer.valueOf(exec.exitValue());
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 < 100) {
            return;
        }
        C09900aA.LJI("force_dex2oat_report", Q7K.LIZLLL("cost", currentTimeMillis2), null, null);
    }

    public final void LJII(Context context) {
        ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(context, this, 14);
        if (C84763XOl.LJIIJJI) {
            C37179EiV.LJFF.post(aRunnableS25S0200000_6);
        } else {
            C84763XOl.LJI().LJJJJZI(new AfS55S0200000_6(this, aRunnableS25S0200000_6, 6));
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        Object LIZ;
        if (context == null || this.LJLILLLLZI || this.LJLIL != null) {
            return;
        }
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (LIZLLL(context)) {
            C36885Edl.LIZ = context.getPackageName();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/data/misc/profiles/cur/0/");
            LIZ2.append(context.getPackageName());
            LIZ2.append("/primary.prof");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if (!TextUtils.isEmpty(LIZIZ)) {
                if (((Boolean) C36891Edr.LIZ.getValue()).booleanValue() && ((Boolean) C36887Edn.LIZ.getValue()).booleanValue()) {
                    File file = new File(LIZIZ);
                    if (file.exists() && file.length() > 0) {
                        this.LJLILLLLZI = true;
                        LJII(context);
                        return;
                    }
                }
                Context LLLLL = C16880lQ.LLLLL(context);
                o.LJIIIIZZ(LLLLL, "context.applicationContext");
                FileObserverC36883Edj fileObserverC36883Edj = new FileObserverC36883Edj(this, LLLLL, LIZIZ);
                this.LJLIL = fileObserverC36883Edj;
                fileObserverC36883Edj.startWatching();
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
        }
    }
}
