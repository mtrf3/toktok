package com.ss.android.ugc.aweme.im.sdk.u16.controller;

import X.C0RN;
import X.C34B;
import X.C35478DwA;
import X.C4IE;
import X.C88024Yge;
import X.DPI;
import X.DS1;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.RBX;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMUnder16InitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "IMUnder16InitTask";
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

    @Override // X.EE1
    public final EFK type() {
        if (!DPI.LIZ() ? ((Boolean) C88024Yge.LJI.getValue()).booleanValue() : !(!C35478DwA.LIZIZ() || !DS1.LIZ())) {
            return EFK.BOOT_FINISH;
        }
        return EFK.SPARSE;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C4IE.LIZ.getClass();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_NAME)");
        C4IE.LIZIZ(repo, ((RBX) HG3.LJIILL()).isLogin());
        C34B.LIZIZ("ImUnder16Manger", "init Task done !");
    }
}
