package com.ss.android.ugc.aweme.appcompat;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class AmeBaseLegacyFragment extends AmeBaseFragmentAdaptationLegacyFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
