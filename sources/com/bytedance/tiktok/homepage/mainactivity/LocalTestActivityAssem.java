package com.bytedance.tiktok.homepage.mainactivity;

import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C38485F8n;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.EF7;
import X.FWN;
import X.PVC;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.utils.JacocoUtils;
import java.io.File;
import kotlin.jvm.internal.AqS156S0100000_6;
import n59.m0;

/* loaded from: classes7.dex */
public final class LocalTestActivityAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 14));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(FWN.INSTANCE);

    @Override // X.C8W0
    public final void onCreate() {
        String LLLFFI;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(LocalTestActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        if (this.LJLIL.getValue() != null) {
            ((IPerformanceAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), IPerformanceAbility.class)).uf(new AqS156S0100000_6(this, 15));
            if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                try {
                    File file = new File(C16880lQ.LLIIJI(EF7.LIZIZ(), null), "auto_sleep");
                    if (file.exists()) {
                        LLLFFI = C38485F8n.LLLFFI(file, PVC.LIZ);
                        Thread.sleep(CastLongProtector.parseLong(LLLFFI));
                    }
                } catch (Exception unused) {
                }
            }
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(LocalTestActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null) {
            ((m0) serviceManager.getService(m0.class)).LIZLLL();
            m0 m0Var = (m0) serviceManager.getService(m0.class);
            C212428Vi.LIZ(this);
            m0Var.LIZ();
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        JacocoUtils.uploadCoverageFileNow();
        ((Handler) this.LJLILLLLZI.getValue()).removeCallbacksAndMessages(null);
    }
}
