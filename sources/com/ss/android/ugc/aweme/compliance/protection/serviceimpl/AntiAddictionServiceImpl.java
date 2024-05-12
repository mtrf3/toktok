package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.C188727au;
import X.C198517qh;
import X.C220488l2;
import X.C222578oP;
import X.C55371LoF;
import X.C57407Mfz;
import X.FMX;
import X.M5A;
import X.MXS;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ContinuousTimeCalculator;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class AntiAddictionServiceImpl implements IAntiAddictionService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final M5A LIZIZ() {
        return new C57407Mfz();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final M5A LIZLLL() {
        return new ContinuousTimeCalculator();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final boolean LJFF() {
        boolean z = MXS.LIZIZ;
        MXS.LIZIZ = false;
        return z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void LJI() {
        FMX.LJIIL("addict_alert", new C188727au().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String LJII() {
        String str = MXS.LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final Boolean LIZ() {
        return Boolean.valueOf(!TextUtils.isEmpty(C55371LoF.LIZIZ().LJLJJL));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String LJ() {
        C55371LoF LIZIZ = C55371LoF.LIZIZ();
        String str = LIZIZ.LJLJJL;
        LIZIZ.LJLJJL = "";
        return str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final boolean LJIIIIZZ() {
        int i = C55371LoF.LIZIZ().LJLILLLLZI;
        int i2 = C55371LoF.LIZIZ().LJLJI;
        if (i > 0 && i2 > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void LIZJ(Aweme aweme) {
        String str;
        Object obj;
        if (C55371LoF.LIZIZ().LIZJ(System.currentTimeMillis())) {
            str = "night";
        } else {
            str = "day";
        }
        C198517qh c198517qh = new C198517qh();
        String str2 = "1";
        c198517qh.LIZ.put("is_addicted", "1");
        c198517qh.LIZ.put("appear_time", str);
        if (aweme.getAllowGift()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c198517qh.LIZ.put("is_giftable", obj);
        if (!aweme.isOnThisDayVideo().booleanValue()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c198517qh.LIZ.put("is_on_this_day", str2);
        JSONObject LJ = c198517qh.LJ();
        C220488l2.LIZIZ.LJII(aweme, LJ);
        C222578oP.LIZIZ(LJ, aweme, null, null, null);
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("video_play");
        obtain.setLabelName("homepage_hot");
        obtain.setValue(aweme.getAid());
        obtain.setJsonObject(LJ);
        FMX.onEvent(obtain);
    }
}
