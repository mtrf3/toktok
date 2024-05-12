package com.ss.android.ugc.aweme.search.voice.core.service;

import X.ActivityC45651qj;
import X.InterfaceC65784Pro;
import X.K55;
import X.KJE;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ISearchDynamicService;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchDynamicServiceDefaultImpl implements ISearchDynamicService {
    public static final KJE Companion = new KJE();

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public boolean engineSupportDynamicFeature() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public void initEditVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 voiceSearchCallback, HashMap<String, String> mobParams, InterfaceC65784Pro<Boolean> requireDelay) {
        o.LJIIIZ(voiceSearchCallback, "voiceSearchCallback");
        o.LJIIIZ(mobParams, "mobParams");
        o.LJIIIZ(requireDelay, "requireDelay");
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public void initVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 voiceSearchCallback, HashMap<String, String> mobParams) {
        o.LJIIIZ(voiceSearchCallback, "voiceSearchCallback");
        o.LJIIIZ(mobParams, "mobParams");
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public void startVoiceSearch(ActivityC45651qj activityC45651qj, HashMap<String, String> mobParams, boolean z, K55 voiceSearchCallback, String sourcePage, int i) {
        o.LJIIIZ(mobParams, "mobParams");
        o.LJIIIZ(voiceSearchCallback, "voiceSearchCallback");
        o.LJIIIZ(sourcePage, "sourcePage");
    }
}
