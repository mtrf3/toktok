package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.C1788870i;
import X.C55096Ljo;
import X.C55230Lly;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class BaseNowKeyboardFragment extends BaseFragment implements INowKeyboardFragmentAbility {
    public C1788870i LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), INowKeyboardFragmentAbility.class, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, INowKeyboardFragmentAbility.class, null);
    }
}
