package com.ss.android.ugc.aweme.ad.comment.pitaya;

import X.C10K;
import X.C19N;
import X.C55384LoS;
import X.C58096Mr6;
import X.C78983UzD;
import X.ILE;
import X.InterfaceC48722JAg;
import Y.ACallableS112S0100000_9;
import Y.ACallableS36S1100000_9;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger;
import com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings;
import java.util.List;

/* loaded from: classes10.dex */
public final class PitayaServiceManager implements IPitayaServiceManeger {
    public static IPitayaServiceManeger LJFF() {
        Object LIZ = C58096Mr6.LIZ(IPitayaServiceManeger.class, false);
        if (LIZ != null) {
            return (IPitayaServiceManeger) LIZ;
        }
        return new PitayaServiceManager();
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final void LIZ() {
        CommentEmotionCheck commentEmotionCheck = new CommentEmotionCheck();
        if (!C19N.LJ("pitaya_exchange_data_with_sati", false)) {
            return;
        }
        try {
            C10K.LIZJ(new ACallableS112S0100000_9(commentEmotionCheck, 5));
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final boolean LIZJ() {
        return new CommentEmotionCheck().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final String LIZLLL() {
        M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel pitayaKeyNameModel;
        boolean z = false;
        if (!C19N.LJ("pitaya_exchange_data_with_sati", false)) {
            return "";
        }
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_client_ai_realtime_feature_reading", false);
        } catch (Throwable unused) {
        }
        if (z) {
            InterfaceC48722JAg LIZIZ = AdReRankServiceManager.LIZJ().LIZIZ(ILE.FEED);
            List<String> list = null;
            try {
                pitayaKeyNameModel = (M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel) SettingsManager.LIZLLL().LJIIIIZZ("app_m10n_client_ai_pitaya_download_settings", M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel.class, null);
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                pitayaKeyNameModel = null;
            }
            if (pitayaKeyNameModel != null) {
                list = pitayaKeyNameModel.keyNameList;
            }
            return LIZIZ.LJIILIIL(list);
        }
        return C55384LoS.LIZ.getString("client_ai_download_json_str", "");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final CommentEmotionCheck LJ() {
        return new CommentEmotionCheck();
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final void LIZIZ(String str) {
        CommentEmotionCheck commentEmotionCheck = new CommentEmotionCheck();
        if (str == null || str.length() == 0 || !C19N.LJ("pitaya_exchange_data_with_sati", false)) {
            return;
        }
        try {
            C10K.LIZJ(new ACallableS36S1100000_9(commentEmotionCheck, str, 3));
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
