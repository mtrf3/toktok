package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C2Q0;
import X.C35009Dob;
import X.C38745FIn;
import X.C38995FSd;
import X.C53947LFf;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.InterfaceC36076EDw;
import X.LFH;
import X.RBX;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class InitModules implements EE1, InterfaceC36076EDw {
    public static final AtomicBoolean LJLIL = new AtomicBoolean(false);

    @Override // X.EEY
    public final String key() {
        return "InitModules";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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

    public static void LIZLLL() {
        if (LJLIL.compareAndSet(false, true)) {
            if (((RBX) HG3.LJIILL()).isLogin()) {
                AppLog.setUserId(CastLongProtector.parseLong(((RBX) HG3.LJIILL()).getCurUserId()));
                AppLog.setSessionKey(((RBX) HG3.LJIILL()).getSessionKey());
            }
            Bundle bundle = new Bundle();
            bundle.putInt("screen_width_dp", C53947LFf.LIZLLL());
            bundle.putInt("screen_height_dp", C53947LFf.LIZ());
            LFH.LIZIZ.LIZLLL().LJIJ().LIZIZ(bundle);
            AppLog.setCustomerHeader(bundle);
        }
    }

    @Override // X.InterfaceC36076EDw
    public final String[] deps() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!((Boolean) C38745FIn.LIZIZ.getValue()).booleanValue()) {
            int i = C35009Dob.LIZ;
            int i2 = 1;
            if (i == 2 || i == 100) {
                C38995FSd.LIZLLL().execute(new C2Q0(i2));
            } else {
                LIZLLL();
            }
        }
    }
}
