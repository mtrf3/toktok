package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C100023wE;
import X.C85920Xno;
import X.EU4;
import X.EUJ;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.m;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface ISettingsRequestService {
    void LIZ(Context context);

    void LIZIZ(m mVar);

    void LIZJ(Activity activity);

    void LIZLLL(EU4 eu4);

    C100023wE LJ();

    JSONObject LJFF(String str);

    C100023wE LJI(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy);

    List<EUJ> LJII();

    void LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ(Map<String, String> map);

    void LJIIJJI(PushSettings pushSettings);

    void LJIIL(C85920Xno c85920Xno);

    void LJIILIIL(String str);

    void LJIILJJIL(JSONObject jSONObject);

    FetchABTestCommonRequest LJIILL();

    boolean shouldUseRecyclerPartialUpdate();
}
