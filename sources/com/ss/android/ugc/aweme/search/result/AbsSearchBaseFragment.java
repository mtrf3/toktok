package com.ss.android.ugc.aweme.search.result;

import X.C50287JoR;
import X.C50321Joz;
import android.view.View;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class AbsSearchBaseFragment extends AmeBaseFragment {
    public boolean LJLIL;
    public C50287JoR LJLJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public boolean LJLILLLLZI = true;
    public final C50321Joz LJLJJI = new C50321Joz(0, null, null, null, null, null, null, null, false, null, null, false, null, 8191, null);

    public abstract Object Al(View view);

    public abstract void Dl(int i);

    public abstract void Gl(SearchResultParam searchResultParam);

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract Object vl();

    public abstract boolean wl();

    public abstract int xl();
}
