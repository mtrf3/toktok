package com.ss.android.ugc.aweme.search.pages.voice.core.ui;

import X.ActivityC45651qj;
import X.C5HC;
import X.InterfaceC45540Hu4;
import X.K0Y;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ChooseMusicVoiceSearchContainerFragment extends VoiceSearchContainerFragment implements C5HC {
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ICreativeSAAService LIZ;
        InterfaceC45540Hu4 aVListenableActivityRegistry;
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (LIZ = SAAService.LIZ()) != null && (aVListenableActivityRegistry = LIZ.getAVListenableActivityRegistry(mo49getActivity)) != null) {
            aVListenableActivityRegistry.unRegisterActivityOnKeyDownListener(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ICreativeSAAService LIZ;
        InterfaceC45540Hu4 aVListenableActivityRegistry;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (LIZ = SAAService.LIZ()) != null && (aVListenableActivityRegistry = LIZ.getAVListenableActivityRegistry(mo49getActivity)) != null) {
            aVListenableActivityRegistry.registerActivityOnKeyDownListenerHead(this);
        }
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return K0Y.LIZ(mo49getActivity());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.setClickable(true);
    }
}
