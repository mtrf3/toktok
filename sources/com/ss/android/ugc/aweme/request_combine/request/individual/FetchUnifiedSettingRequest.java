package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.AnonymousClass030;
import X.C35756E1o;
import X.C36088EEi;
import X.C38776FJs;
import X.C39380Fcu;
import X.C51784KUa;
import X.C73318Sq2;
import X.C73590SuQ;
import X.C77800Ug8;
import X.E21;
import X.EF7;
import X.EFJ;
import X.EFM;
import X.EFN;
import X.EIY;
import X.EJ5;
import X.EJV;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.T16;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import java.util.List;

/* loaded from: classes7.dex */
public final class FetchUnifiedSettingRequest implements EFM {
    public final C73318Sq2 LJLIL;

    @Override // X.EEY
    public final String key() {
        return "FetchUnifiedSettingRequest";
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

    public FetchUnifiedSettingRequest(int i) {
        if (i == 1 || i == 2) {
            C51784KUa.LIZ();
        }
        this.LJLIL = new C73318Sq2();
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        SettingApi settingApi = (SettingApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, SettingApi.class);
        String LJ = C38776FJs.LJIIL().LJ(EF7.LIZIZ(), "last_setting_version");
        this.LJLIL.LIZ(new C73590SuQ(settingApi.queryV3Setting(EJV.LIZ(), C39380Fcu.LIZ(EF7.LIZIZ()), LJ).LJIJJ(T16.LIZ()).LJIIL(T16.LIZ()).LJIIJJI(EJ5.LJLIL), E21.LJLIL).LJIIJJI(C35756E1o.LJLIL).LJIIZILJ(EIY.LJLIL, C36088EEi.LJLIL));
    }
}
