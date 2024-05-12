package com.ss.android.ugc.trill.setting;

import X.C237309Ta;
import X.C25795AAl;
import X.C25797AAn;
import X.C25804AAu;
import X.C25806AAw;
import X.C25809AAz;
import X.C85895XnP;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.ICLALanguageService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ICLALanguageServiceImpl implements ICLALanguageService {
    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final void LJFF() {
        TranslationLanguageSettingPage.LJLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final Intent LIZJ() {
        DoNotTranslateSettingPage.LJLJLJ.getClass();
        return DoNotTranslateSettingPage.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final void LJII() {
        DoNotTranslateSettingPage.LJLJLJ.getClass();
        DoNotTranslateSettingPage.LJLJLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final Intent LIZ() {
        return TranslationLanguageSettingPage.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final C25806AAw LJ(C25804AAu c25804AAu) {
        return new C25806AAw(c25804AAu);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LIZIZ(Context context, PushSettings settings, String str) {
        o.LJIIIZ(settings, "settings");
        DoNotTranslateSettingPage.LJLJLJ.getClass();
        return C25797AAn.LIZ(context, settings, str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final void LIZLLL(int i, C237309Ta c237309Ta, String str, List preselectedLanguagesCodes) {
        o.LJIIIZ(preselectedLanguagesCodes, "preselectedLanguagesCodes");
        C85895XnP c85895XnP = new C85895XnP();
        c85895XnP.LJLILLLLZI = new C25795AAl(i, c237309Ta, str, preselectedLanguagesCodes);
        c85895XnP.LJIILL(new Object[0]);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LJI(Context context, PushSettings settings, String str, String enterMethod) {
        o.LJIIIZ(settings, "settings");
        o.LJIIIZ(enterMethod, "enterMethod");
        return C25809AAz.LIZ(context, settings, str, enterMethod);
    }
}
