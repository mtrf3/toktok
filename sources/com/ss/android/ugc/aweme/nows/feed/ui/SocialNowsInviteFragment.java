package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C5H3;
import X.C7N1;
import X.C8VV;
import X.InterfaceC61213O0r;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.arg.RouteArgExtension;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class SocialNowsInviteFragment extends SocialNowsBaseDetailFragment {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C5H3 LJLJJI = RouteArgExtension.INSTANCE.requiredArg(this, C7N1.LJLIL, "uid", String.class);

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 322));
    }
}
