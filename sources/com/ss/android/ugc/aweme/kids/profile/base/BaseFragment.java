package com.ss.android.ugc.aweme.kids.profile.base;

import X.C72713SgH;
import android.view.View;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class BaseFragment extends AmeBaseFragment {
    public C72713SgH LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
