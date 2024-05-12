package com.ss.android.ugc.aweme.legoImp.task;

import X.C34710Djm;
import X.C38987FRv;
import android.content.Context;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SharePreferenceApplicationPreloadTask extends SharedPreferencePreloadTask {
    @Override // X.EEY
    public final String key() {
        return "SharePreferenceApplicationPreloadTask";
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        LJII(context, 0, "prefs_feed_check");
        LJII(context, 0, "key_language_sp_key");
        LJII(context, 0, "KEY_NEED_UPLOAD_LAUNCHLOG");
        LJII(context, 0, "pref_language_key");
        LJII(context, 0, "preinsatll_appflyer");
        LJII(context, 0, "appsflyer-data");
        LJII(context, 0, "aweme_user");
        LJII(context, 0, "current_foreground_uid");
        PreferenceManager.getDefaultSharedPreferences(context).getAll();
        LJII(context, 0, "app_bundle_session_ids");
        LJII(context, 0, "com.google.android.gms.measurement.prefs");
        LJII(context, 0, "com.google.firebase.common.prefs");
        LJII(context, 0, "google_ads_flags");
        LJII(context, 0, "InitialChooseLanguagePreferences");
        LJII(context, 0, "ttnet_tnc_config");
        LJII(context, 0, "com.zhiliaoapp.musically");
        LIZLLL(context, "first_install_version");
        LJ(context, "setting_repo_sp");
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        if (LIZLLL.booleanValue() || ((Boolean) C34710Djm.LJIIJ.getValue()).booleanValue()) {
            LIZLLL(context, "new_user_journey");
        }
    }
}
