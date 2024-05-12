package com.ss.android.ugc.aweme.profile.ui;

import X.YFI;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class AwemeListFragment extends ProfileListFragment implements YFI {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }
}
