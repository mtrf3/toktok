package com.bytedance.ies.ugc.aweme.ttsetting;

import X.C0RN;
import X.C36296EMi;
import X.C68322mC;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.IDdS378S0100000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FetchTTSettingTask implements EE1 {
    public final String LJLIL;

    @Override // X.EEY
    public final String key() {
        return "FetchTTSettingTask";
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

    public FetchTTSettingTask(String str) {
        this.LJLIL = str;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (System.currentTimeMillis() - Keva.getRepo("TTSettingData").getLong("last_get_setting_time", 0L) > TimeUnit.HOURS.toMillis(6L)) {
            String host = this.LJLIL;
            o.LJIIIZ(host, "host");
            IRetrofit createNewRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(host);
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = "";
            ((TTSettingDataApi$SettingApi) createNewRetrofit.create(TTSettingDataApi$SettingApi.class)).getResponse(!TextUtils.isEmpty(Keva.getRepo("TTSettingData").getString("settingData", "")), 1, 1).enqueue(new IDdS378S0100000_6(c68322mC, 9));
            return;
        }
        C36296EMi.LIZ();
    }
}
