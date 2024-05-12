package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C235779Nd;
import X.C2U8;
import X.C36093EEn;
import X.C36296EMi;
import X.C36494ETy;
import X.C36495ETz;
import X.C40328FsC;
import X.EE1;
import X.EFK;
import X.EI0;
import X.EU0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.R3A;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class InitServiceSettingTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitServiceSettingTask";
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
        return EFK.BACKGROUND;
    }

    public static void LIZLLL(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_uniqueid_settings");
            SettingsRequestServiceImpl.LJIILLIIL().LJIIIIZZ();
            SettingsRequestServiceImpl.LJIILLIIL().LJIILJJIL(jSONObject.optJSONObject("user_badge_click_settings"));
            if (optJSONObject != null) {
                boolean z = true;
                if (optJSONObject.optInt("enable_push_deduplication", 1) <= 0) {
                    z = false;
                }
                EU0.LIZ = z;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("aweme_activity_setting");
            if (optJSONObject2 != null) {
                try {
                    FestivalEntity festivalEntity = (FestivalEntity) new Gson().LJI(optJSONObject2.toString(), FestivalEntity.class);
                    if (festivalEntity != null) {
                        R3A.LJLILLLLZI = festivalEntity;
                    }
                } catch (Exception unused) {
                }
                C235779Nd.LIZ.LJFF().LIZLLL(optJSONObject2.toString());
                C2U8.LIZ(new C36495ETz());
                return;
            }
            C235779Nd.LIZ.LJFF().LIZLLL("");
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        String API_URL_PREFIX_SI = Api.LIZ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        LIZJ.LIZIZ(new FetchTTSettingTask(API_URL_PREFIX_SI), true);
        LIZJ.LIZJ();
        C36296EMi.LJ(new C36494ETy(this));
    }
}
