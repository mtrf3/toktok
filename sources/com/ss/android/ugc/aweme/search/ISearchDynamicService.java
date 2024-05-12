package com.ss.android.ugc.aweme.search;

import X.ActivityC45651qj;
import X.InterfaceC65784Pro;
import X.K55;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import java.util.HashMap;

/* loaded from: classes9.dex */
public interface ISearchDynamicService {
    boolean engineSupportDynamicFeature();

    void initEditVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 k55, HashMap<String, String> hashMap, InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    void initVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 k55, HashMap<String, String> hashMap);

    void startVoiceSearch(ActivityC45651qj activityC45651qj, HashMap<String, String> hashMap, boolean z, K55 k55, String str, int i);
}
