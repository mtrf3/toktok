package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C38995FSd;
import X.DMN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.ARunnableS5S0001000_10;
import android.content.Context;
import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.fackbook.drawee.DraweeConfigOutServiceDowngrade;
import com.fackbook.drawee.IDraweeConfigOutService;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.List;

/* loaded from: classes11.dex */
public class BindFrescoTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "BindFrescoTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!DMN.LIZ()) {
            ServiceManager.get().bind(IDraweeConfigOutService.class, new ServiceProvider() { // from class: X.MrF
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return new DraweeConfigOutServiceDowngrade();
                }
            }).asSingleton();
            ServiceManager.get().bind(IImagePipelineOutService.class, new ServiceProvider() { // from class: X.Nrs
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return new W9I();
                }
            }).asSingleton();
            ServiceManager.get().bind(ILightenConfigOutService.class, new ServiceProvider() { // from class: X.Nrt
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return new C81817W9d();
                }
            }).asSingleton();
            C38995FSd.LIZJ().execute(new ARunnableS5S0001000_10(1, 0));
        }
    }
}
