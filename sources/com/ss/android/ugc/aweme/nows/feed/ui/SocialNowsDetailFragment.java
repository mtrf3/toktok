package com.ss.android.ugc.aweme.nows.feed.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C184617Mj;
import X.C184627Mk;
import X.C184647Mm;
import X.C184657Mn;
import X.C184667Mo;
import X.C184677Mp;
import X.C184687Mq;
import X.C184697Mr;
import X.C184707Ms;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2L4;
import X.C3C5;
import X.C5H3;
import X.C62822Ol8;
import X.C62826OlC;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.nows.ability.NowDetailScope;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class SocialNowsDetailFragment extends SocialNowsBaseDetailFragment implements C2L4 {
    public static boolean LJLLJ;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C62822Ol8 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    public SocialNowsDetailFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLJJI = routeArgExtension.requiredArg(this, C184697Mr.LJLIL, "item_id", String.class);
        this.LJLJJL = routeArgExtension.requiredArg(this, C184707Ms.LJLIL, "author_id", String.class);
        this.LJLJJLL = routeArgExtension.optionalArg(this, C184657Mn.LJLIL, "cid", String.class);
        this.LJLJL = routeArgExtension.optionalArg(this, C184687Mq.LJLIL, "showViews", Integer.class);
        this.LJLJLJ = routeArgExtension.optionalArg(this, C184677Mp.LJLIL, "refer", String.class);
        this.LJLJLLL = routeArgExtension.optionalArgNotNull(this, C184627Mk.LJLIL, "expired", Integer.class);
        this.LJLL = routeArgExtension.optionalArg(this, C184667Mo.LJLIL, "enter_from", String.class);
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
        C65776Prg LIZ = C65352Pkq.LIZ(NowDetailListViewModel.class);
        new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 641), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C184647Mm.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(NowDetailScope.class);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C62826OlC c62826OlC = (C62826OlC) this.LJLLI.getValue();
        if (c62826OlC != null) {
            c62826OlC.LIZLLL();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LJLLJ = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LJLLJ = true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new C184617Mj(this));
        C62826OlC c62826OlC = (C62826OlC) this.LJLLI.getValue();
        if (c62826OlC != null) {
            c62826OlC.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (onCreateView != null && (viewGroup2 = (ViewGroup) onCreateView.findViewById(R.id.c92)) != null) {
            C16880lQ.LLLLIILL(inflater, R.layout.bxk, viewGroup2, true);
        }
        C29S c29s = null;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }
}
