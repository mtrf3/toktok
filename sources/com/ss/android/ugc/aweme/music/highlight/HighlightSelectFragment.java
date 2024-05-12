package com.ss.android.ugc.aweme.music.highlight;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C240369c0;
import X.C252709vu;
import X.C29S;
import X.C2L4;
import X.C3C5;
import X.C76800UCe;
import X.C76965UIn;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.GDG;
import X.InterfaceC241869eQ;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class HighlightSelectFragment extends BaseFragment implements InterfaceC241869eQ, JBS, C2L4 {
    public C252709vu LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJJLL.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.JBS
    public /* bridge */ /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public /* bridge */ /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC241869eQ, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final void Al() {
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS153S0100000_3(this, 532));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            String string = getString(R.string.qg2);
            o.LJIIIIZZ(string, "getString(R.string.selectNewSong_pageTitle)");
            LIZLLL.LIZJ = string;
            c235119Kp.LIZJ = LIZLLL;
            c252709vu.setNavActions(c235119Kp);
        }
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(HighlightScope.class);
    }

    @Override // X.C8VB
    /* renamed from: xl, reason: merged with bridge method [inline-methods] */
    public C240369c0 defaultObservableData() {
        return new C240369c0(this.LJLILLLLZI, this.LJLJI, true, false, false, (PinnedMusicList) null, (List) null, this.LJLJJI, 224);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GDG.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (C252709vu) view.findViewById(R.id.gx9);
        Al();
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 269));
    }

    public View vl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.c7n, viewGroup, false);
    }

    public static View wl(HighlightSelectFragment highlightSelectFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View vl = highlightSelectFragment.vl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(vl instanceof View)) {
            vl = null;
        }
        if (vl != null) {
            try {
                ViewTreeLifecycleOwner.set(vl, highlightSelectFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(vl, highlightSelectFragment);
                C10A.LIZIZ(vl, highlightSelectFragment);
                ActivityC45651qj mo49getActivity = highlightSelectFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return vl;
    }
}
