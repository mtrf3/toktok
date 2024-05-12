package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC61106NyY;
import X.C0RN;
import X.C47261Igj;
import X.C58096Mr6;
import X.C61097NyP;
import X.C61099NyR;
import X.C61110Nyc;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.ies.powerpermissions.IGetInterceptor;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class PowerPermissionsTask implements EE1, IGetInterceptor {
    @Override // X.EEY
    public final String key() {
        return "PowerPermissionsTask";
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

    public static IGetInterceptor LJ() {
        Object LIZ = C58096Mr6.LIZ(IGetInterceptor.class, false);
        if (LIZ != null) {
            return (IGetInterceptor) LIZ;
        }
        if (C58096Mr6.m2 == null) {
            synchronized (IGetInterceptor.class) {
                if (C58096Mr6.m2 == null) {
                    C58096Mr6.m2 = new PowerPermissionsTask();
                }
            }
        }
        return C58096Mr6.m2;
    }

    @Override // com.bytedance.ies.powerpermissions.IGetInterceptor
    public final List<AbstractC61106NyY> LIZLLL() {
        C61097NyP.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("power_permssion_enable_bpea", true);
        return C47261Igj.LJJIJIL(new C61110Nyc());
    }

    @Override // com.bytedance.ies.powerpermissions.IGetInterceptor
    public final List<AbstractC61106NyY> getInterceptors() {
        return new ArrayList();
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
        C61099NyR.LIZIZ.LIZ();
        C61097NyP.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("power_permssion_enable_bpea", true);
    }
}
