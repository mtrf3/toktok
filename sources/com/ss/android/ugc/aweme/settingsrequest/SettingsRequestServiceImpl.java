package com.ss.android.ugc.aweme.settingsrequest;

import X.C100023wE;
import X.C58096Mr6;
import X.C85920Xno;
import X.EU4;
import X.EU6;
import X.EU7;
import X.EU8;
import X.EUC;
import X.EUE;
import X.EUH;
import X.EUJ;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.m;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SettingsRequestServiceImpl implements ISettingsRequestService {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIIZ() {
    }

    public static ISettingsRequestService LJIILLIIL() {
        Object LIZ = C58096Mr6.LIZ(ISettingsRequestService.class, false);
        if (LIZ != null) {
            return (ISettingsRequestService) LIZ;
        }
        if (C58096Mr6.I6 == null) {
            synchronized (ISettingsRequestService.class) {
                if (C58096Mr6.I6 == null) {
                    C58096Mr6.I6 = new SettingsRequestServiceImpl();
                }
            }
        }
        return C58096Mr6.I6;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final C100023wE LJ() {
        return EU6.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final List<EUJ> LJII() {
        return EU6.LIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final FetchABTestCommonRequest LJIILL() {
        return new FetchABTestCommonRequest();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return EU6.LIZIZ.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZ(Context context) {
        EU6.LIZIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZIZ(m mVar) {
        EU6.LIZIZ.LIZIZ(mVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZJ(Activity activity) {
        EU6.LIZIZ.LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZLLL(EU4 eu4) {
        EU6.LIZIZ.LIZ.LIZLLL(eu4);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final JSONObject LJFF(String str) {
        if (str != null && !str.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            String[] split = Uri.decode(str).split(",");
            try {
                m mVar = new m();
                for (String str2 : split) {
                    EUE.LIZLLL(mVar, str2, EUE.LIZ(str2));
                }
                jSONObject = new JSONObject(mVar.toString());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIJ(Map<String, String> map) {
        if (map != null) {
            EU7.LIZJ.putAll(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIJJI(PushSettings pushSettings) {
        EUH.LIZIZ(pushSettings);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIL(C85920Xno c85920Xno) {
        EUH.LIZJ(c85920Xno, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl.LJIILIIL(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIILJJIL(JSONObject jSONObject) {
        EUC euc;
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.toString()) || (euc = (EUC) EU8.LIZ.getValue()) == null) {
            return;
        }
        euc.LIZ(jSONObject.toString());
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final C100023wE LJI(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        return EU6.LIZIZ.LJI(editor, iESSettingsProxy);
    }
}
