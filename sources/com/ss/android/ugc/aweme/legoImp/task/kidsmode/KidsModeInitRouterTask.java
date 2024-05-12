package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0RN;
import X.C56662Kg;
import X.C61200O0e;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.router.RouterOpen;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KidsModeInitRouterTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "KidsModeInitRouterTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        C56662Kg.LIZ().LIZJ("method_init_smart_router_duration_kids_mode", false);
        AwemeHostApplication LIZ = FKM.LIZ();
        if (C61200O0e.LJI == null) {
            synchronized (C61200O0e.class) {
                if (C61200O0e.LJI == null) {
                    C61200O0e.LJI = new C61200O0e(LIZ);
                }
            }
        }
        SmartRouter.init(EF7.LIZIZ());
        SmartRouter.configRouter("snssdk1233").withOtherSchemes(new String[]{"aweme", "sslocal"});
        SmartRouter.addInterceptor(new RouterOpen());
        C56662Kg.LIZ().LJFF("method_init_smart_router_duration_kids_mode", false);
    }
}
