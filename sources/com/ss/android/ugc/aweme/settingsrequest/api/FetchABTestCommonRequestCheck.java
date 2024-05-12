package com.ss.android.ugc.aweme.settingsrequest.api;

import X.AnonymousClass030;
import X.C36191EIh;
import X.C39380Fcu;
import X.C53487Kyx;
import X.C73318Sq2;
import X.C73590SuQ;
import X.C78842Uww;
import X.E22;
import X.E23;
import X.E28;
import X.E2A;
import X.EF7;
import X.EFM;
import X.EFN;
import X.EJ3;
import X.EJ8;
import X.EJV;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FH1;
import X.KUZ;
import X.ORY;
import X.ORZ;
import X.Q7K;
import X.QK5;
import X.T16;
import Y.AfS58S0100000_6;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.p;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class FetchABTestCommonRequestCheck implements EFM {
    public final C73318Sq2 LJLIL = new C73318Sq2();

    @Override // X.EEY
    public final String key() {
        return "FetchABTestCommonRequestCheck";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.P0;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        String LJJJJLL;
        SettingApi settingApi = (SettingApi) RetrofitFactory.LIZLLL().create("https://libra-va.tiktokv.com").create(SettingApi.class);
        String valueOf = String.valueOf(1233);
        String serverDeviceId = AppLog.getServerDeviceId();
        Context LIZIZ = EF7.LIZIZ();
        int LIZ = C39380Fcu.LIZ(LIZIZ);
        String LIZ2 = EJV.LIZ();
        FH1.LJI.getClass();
        FH1.LIZLLL();
        C53487Kyx.LIZ();
        String[] LJII = FH1.LJII();
        int LIZIZ2 = Q7K.LIZIZ("extra_vid_req_count_settings", 0);
        if (LIZIZ2 < 0) {
            LIZIZ2 = 0;
        } else if (LIZIZ2 > 500) {
            LIZIZ2 = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        if (LIZIZ2 <= 0) {
            LJJJJLL = "";
        } else if (LJII.length > LIZIZ2) {
            LJJJJLL = ORZ.LLD(ORY.LJJLIIIJILLIZJL(LJII, C78842Uww.LJJ(0, LIZIZ2)), ",", null, null, null, 62);
        } else {
            LJJJJLL = ORY.LJJJJLL(LJII, ",", null, null, null, 62);
        }
        long LJI = EF7.LJI();
        String LIZ3 = C36191EIh.LIZIZ.LIZ();
        if (LIZ3 == null) {
            LIZ3 = "";
        }
        this.LJLIL.LIZ(new C73590SuQ(settingApi.queryABTestCommon(valueOf, serverDeviceId, LJI, 1, LIZ2, LIZ, LIZ3, QK5.LIZ(LIZIZ), EJ8.LIZ(), null, null, 1L, LJJJJLL).LJIJJ(T16.LIZ()).LJIIL(T16.LIZ()).LJIIJJI(EJ3.LJLIL), E28.LJLIL).LJIIJJI(E2A.LJLIL).LJIILJJIL(1L, E22.LJLIL).LJIIZILJ(new AfS58S0100000_6(this, 20), E23.LJLIL));
    }

    public static boolean LIZLLL(String str, p pVar, p pVar2) {
        SaveConfigType$ConfigType saveConfigType$ConfigType;
        ConfigItem configItem = (ConfigItem) ((HashMap) KUZ.LIZ).get(str);
        if (configItem != null) {
            saveConfigType$ConfigType = configItem.type;
        } else {
            saveConfigType$ConfigType = null;
        }
        if (pVar2.equals(pVar) || (saveConfigType$ConfigType != null && ((saveConfigType$ConfigType == SaveConfigType$ConfigType.INT && ((pVar2.LJIILJJIL() > 0 && pVar.LJFF()) || (pVar2.LJIILJJIL() == 0 && !pVar.LJFF()))) || (saveConfigType$ConfigType == SaveConfigType$ConfigType.BOOLEAN && ((pVar2.LJFF() && pVar.LJIILJJIL() > 0) || (!pVar2.LJFF() && pVar.LJIILJJIL() == 0)))))) {
            return true;
        }
        return false;
    }
}
