package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C100023wE;
import X.EU4;
import X.EUJ;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.m;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;

/* loaded from: classes7.dex */
public interface ISettingsMainApi {
    void LIZ(Context context);

    void LIZIZ(m mVar);

    void LIZJ(Activity activity);

    void LIZLLL(EU4 eu4);

    C100023wE LJ();

    C100023wE LJI(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy);

    List<EUJ> LJII();

    boolean shouldUseRecyclerPartialUpdate();
}
