package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C111414Yv;
import X.C2NU;
import X.C48202Ivu;
import X.C84582XHm;
import X.C84583XHn;
import X.EE1;
import X.EFK;
import X.EnumC111394Yt;
import X.EnumC111404Yu;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.InterfaceC69602oG;
import X.JD6;
import X.X1D;
import X.XGL;
import X.XGQ;
import android.content.Context;
import com.ss.android.agilelogger.ALog;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MotaInitTask implements EE1, InterfaceC69602oG {
    @Override // X.EEY
    public final String key() {
        return "MotaInitTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static EnumC111404Yu LIZLLL(EnumC111394Yt enumC111394Yt) {
        int i = JD6.LIZ[enumC111394Yt.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC111404Yu.UNKNOWN;
                    }
                    return EnumC111404Yu.UNKNOWN;
                }
                return EnumC111404Yu.NOT_AVAILABLE;
            }
            return EnumC111404Yu.FAKE;
        }
        return EnumC111404Yu.AVAILABLE;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", "MotaInitTask run");
        C84583XHn builder = C84583XHn.LJLIL;
        o.LJIIIZ(builder, "builder");
        XGQ xgq = new XGQ();
        builder.invoke(xgq);
        XGL.LJFF = xgq.LIZ;
        C48202Ivu c48202Ivu = C2NU.LIZ;
        EnumC111394Yt enumC111394Yt = c48202Ivu.LIZJ;
        o.LJIIIIZZ(enumC111394Yt, "getInstance().currentNetworkAvailableType");
        EnumC111404Yu LIZLLL = LIZLLL(enumC111394Yt);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MotaInitTask latestNetworkState: ");
        LIZ.append(LIZLLL);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", X1D.LIZIZ(LIZ));
        C111414Yv.LIZ(LIZLLL);
        c48202Ivu.LIZ(this);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(C84582XHm.LJLIL);
    }

    @Override // X.InterfaceC69602oG
    public final void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt enumC111394Yt2) {
        if (enumC111394Yt2 != null) {
            EnumC111404Yu LIZLLL = LIZLLL(enumC111394Yt2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MotaInitTask onChange: ");
            LIZ.append(LIZLLL);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", X1D.LIZIZ(LIZ));
            C111414Yv.LIZ(LIZLLL);
        }
    }
}
