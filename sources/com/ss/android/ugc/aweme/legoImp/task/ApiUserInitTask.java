package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C48025It3;
import X.C48027It5;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ApiUserConfig;
import com.ss.android.ugc.aweme.experiment.Scene;
import com.ss.android.ugc.aweme.experiment.SubScene;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ApiUserInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ApiUserInitTask";
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

    @Override // X.EEY
    public final void run(Context context) {
        try {
            FFL.LJIIIZ().getClass();
            boolean z = true;
            Object LJIILLIIL = FFL.LJIILLIIL(ApiUserConfig.class, "api_user_config", true);
            o.LJIIIIZZ(LJIILLIIL, "getInstance().getValue(A…erExperiment::class.java)");
            ApiUserConfig apiUserConfig = (ApiUserConfig) LJIILLIIL;
            HashMap hashMap = new HashMap();
            List<Scene> list = apiUserConfig.frequencyList;
            if (list != null) {
                for (Scene scene : list) {
                    String str = scene.name;
                    List<SubScene> list2 = scene.sublist;
                    if (list2 != null) {
                        for (SubScene subScene : list2) {
                            hashMap.put(str + subScene.name, Integer.valueOf(subScene.count));
                        }
                    }
                }
            }
            int i = apiUserConfig.enabled;
            int i2 = apiUserConfig.timeOutDuration;
            C48025It3 c48025It3 = C48025It3.LIZ;
            if (i != 1) {
                z = false;
            }
            C48027It5.LIZIZ = z;
            C48027It5.LIZLLL = hashMap;
            C48027It5.LIZ = i2;
            C48027It5.LJ = c48025It3;
        } catch (Throwable unused) {
        }
    }
}
