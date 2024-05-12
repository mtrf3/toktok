package com.ss.android.ugc.aweme.relation.storage.common;

import X.AnonymousClass311;
import X.C0RN;
import X.C2NU;
import X.C48202Ivu;
import X.C69532o9;
import X.C69542oA;
import X.C69582oE;
import X.C69592oF;
import X.C69622oI;
import X.C90343gc;
import X.EE1;
import X.EFK;
import X.EnumC111394Yt;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.RBX;
import X.X1D;
import X.XKX;
import X.XLM;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class StorageLegoTask implements EE1 {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);

    @Override // X.EEY
    public final String key() {
        return "StorageLegoTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        String str;
        if (!this.LJLIL.compareAndSet(false, true) || !C90343gc.LIZ()) {
            return;
        }
        C69582oE c69582oE = C69582oE.LJLIL;
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c69582oE);
        XLM xlm = C69582oE.LJLILLLLZI;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        xlm.setValue(curUserId);
        C69592oF c69592oF = C69592oF.LJLIL;
        C48202Ivu c48202Ivu = C2NU.LIZ;
        c48202Ivu.LIZ(c69592oF);
        XLM xlm2 = C69592oF.LJLILLLLZI;
        xlm2.setValue(c48202Ivu.LIZJ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init net_status: ");
        EnumC111394Yt enumC111394Yt = (EnumC111394Yt) xlm2.getValue();
        if (enumC111394Yt != null) {
            str = enumC111394Yt.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        C69542oA.LIZIZ("NetObserver", X1D.LIZIZ(LIZ));
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init module, isLogin: ");
        LIZ2.append(isLogin);
        C69542oA.LIZIZ("Lego", X1D.LIZIZ(LIZ2));
        if (!isLogin) {
            XKX.LIZLLL(AnonymousClass311.LIZ(), null, null, new C69532o9(null), 3);
        } else {
            C69622oI.LIZ();
        }
    }
}
