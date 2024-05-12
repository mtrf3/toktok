package com.ss.android.ugc.aweme.profile.aigc;

import X.AbstractC008101l;
import X.ActivityC45651qj;
import X.C5H3;
import X.STD;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ProfileAigcIntroFragment extends BaseFragment {
    public String LJLILLLLZI;
    public String LJLJI;
    public SmartImageView LJLJJL;
    public TuxTextView LJLJJLL;
    public boolean LJLJL;
    public TuxSheet LJLJLJ;
    public boolean LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLIL = true;
    public final C5H3 LJLJJI = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        STD.LIZJ(Boolean.valueOf(this.LJLJLLL), "close", Boolean.valueOf(!this.LJLIL));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onResume();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new AbstractC008101l() { // from class: X.4l8
                @Override // X.AbstractC008101l
                public final void LIZ() {
                    ProfileAigcIntroFragment profileAigcIntroFragment = ProfileAigcIntroFragment.this;
                    if (!profileAigcIntroFragment.LJLJL) {
                        ActivityC45651qj mo49getActivity2 = profileAigcIntroFragment.mo49getActivity();
                        if (mo49getActivity2 != null) {
                            mo49getActivity2.finish();
                            return;
                        }
                        return;
                    }
                    TuxSheet tuxSheet = profileAigcIntroFragment.LJLJLJ;
                    if (tuxSheet == null) {
                        return;
                    }
                    tuxSheet.dismiss();
                }

                {
                    super(true);
                }
            });
        }
    }
}
