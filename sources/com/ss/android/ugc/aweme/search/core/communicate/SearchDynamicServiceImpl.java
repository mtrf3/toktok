package com.ss.android.ugc.aweme.search.core.communicate;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C39647FhD;
import X.C58096Mr6;
import X.C78897Uxp;
import X.C93756aW0;
import X.C93906aYQ;
import X.C93963aZL;
import X.C94814an4;
import X.InterfaceC65784Pro;
import X.K55;
import X.KI2;
import X.KI3;
import X.ViewOnClickListenerC93581aTB;
import X.ViewOnClickListenerC93582aTC;
import X.X1D;
import X.XKX;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ISearchDynamicService;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchHelper$performVoiceSearch$1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class SearchDynamicServiceImpl implements ISearchDynamicService {
    public static ISearchDynamicService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISearchDynamicService.class, false);
        if (LIZ != null) {
            return (ISearchDynamicService) LIZ;
        }
        if (C58096Mr6.G4 == null) {
            synchronized (ISearchDynamicService.class) {
                if (C58096Mr6.G4 == null) {
                    C58096Mr6.G4 = new SearchDynamicServiceImpl();
                }
            }
        }
        return (SearchDynamicServiceImpl) C58096Mr6.G4;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final boolean engineSupportDynamicFeature() {
        if (C93963aZL.LIZ == -1) {
            C93963aZL.LIZ = SpeechEngineGenerator.isEngineSupported("asr") ? 1 : 0;
        }
        if (C93963aZL.LIZ == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void initVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 k55, HashMap<String, String> hashMap) {
        if (tuxIconView == null || fragment == null) {
            return;
        }
        C78897Uxp.LJJJJLI(tuxIconView, null);
        C16880lQ.LJJJ(tuxIconView, new ViewOnClickListenerC93582aTC(tuxIconView, hashMap, this, fragment, k55));
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void initEditVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 k55, HashMap<String, String> hashMap, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        if (tuxIconView == null || fragment == null) {
            return;
        }
        C78897Uxp.LJJJJLI(tuxIconView, null);
        C16880lQ.LJJJ(tuxIconView, new ViewOnClickListenerC93581aTB(tuxIconView, (KI2) interfaceC65784Pro, hashMap, this, fragment, (KI3) k55));
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void startVoiceSearch(ActivityC45651qj activityC45651qj, HashMap<String, String> mobParams, boolean z, K55 voiceSearchCallback, String str, int i) {
        o.LJIIIZ(mobParams, "mobParams");
        o.LJIIIZ(voiceSearchCallback, "voiceSearchCallback");
        if (activityC45651qj == null) {
            return;
        }
        C39647FhD.LJ(activityC45651qj);
        if (i < 1 || i > 2 || (i == 1 && o.LJ(str, "choose_music"))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("source =  ");
            LIZ.append(str);
            LIZ.append(", enterPage = ");
            LIZ.append(i);
            C93756aW0.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        C93906aYQ c93906aYQ = new C93906aYQ();
        if (activityC45651qj.getSupportFragmentManager() == null) {
            return;
        }
        activityC45651qj.getLifecycle().addObserver(new VoiceSearchHelper$performVoiceSearch$1(XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), null, null, new C94814an4(z, c93906aYQ, activityC45651qj, str, mobParams, i, voiceSearchCallback, null), 3), activityC45651qj));
    }
}
