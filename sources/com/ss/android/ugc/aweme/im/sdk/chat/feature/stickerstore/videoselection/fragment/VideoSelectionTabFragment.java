package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.fragment;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1BC;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C42625Go9;
import X.C45804HyK;
import X.C47261Igj;
import X.C74053T4n;
import X.C76800UCe;
import X.C87393br;
import X.C89033eV;
import X.C90903hW;
import X.C91063hm;
import X.C91093hp;
import X.C91143hu;
import X.C9KF;
import X.EnumC85173Vx;
import X.EnumC91123hs;
import X.InterfaceC61213O0r;
import X.InterfaceC74055T4p;
import X.KEI;
import X.QD3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.fragment.VideoSelectionContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.fragment.VideoSelectionTabFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class VideoSelectionTabFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public C74053T4n LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final List<Integer> LJLIL = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC85173Vx.LIKED.getType()), Integer.valueOf(EnumC85173Vx.POSTED.getType()), Integer.valueOf(EnumC85173Vx.FAVORITES.getType()));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void stickerCreationComplete(C89033eV e) {
        o.LJIIIZ(e, "e");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    public final String vl(int i) {
        String string;
        if (i == EnumC85173Vx.LIKED.getType()) {
            Context context = getContext();
            if (context == null || (string = context.getString(R.string.e67)) == null) {
                return "";
            }
        } else if (i == EnumC85173Vx.POSTED.getType()) {
            Context context2 = getContext();
            if (context2 == null || (string = context2.getString(R.string.e68)) == null) {
                return "";
            }
        } else if (i == EnumC85173Vx.FAVORITES.getType()) {
            Context context3 = getContext();
            if (context3 == null || (string = context3.getString(R.string.e66)) == null) {
                return "";
            }
        } else {
            return null;
        }
        return string;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        Context context2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.n8c);
        C74053T4n initViews$lambda$2 = (C74053T4n) view.findViewById(R.id.n5c);
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.n5d);
        this.LJLILLLLZI = initViews$lambda$2;
        final List<Integer> list = this.LJLIL;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        viewPager.setAdapter(new C1BC(childFragmentManager) { // from class: X.3hx
            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJIIIIZZ(int i, View container, Object object) {
                o.LJIIIZ(container, "container");
                o.LJIIIZ(object, "object");
            }

            @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
            public final void LJIIIZ(int i, ViewGroup container, Object object) {
                o.LJIIIZ(container, "container");
                o.LJIIIZ(object, "object");
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return list.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIILIIL(int i) {
                return this.vl(((Number) ListProtector.get(list, i)).intValue());
            }

            @Override // X.C1BC
            public final Fragment LJJIII(int i) {
                Bundle LIZ = C141415gn.LIZ("video_content_type", ((Number) ListProtector.get(list, i)).intValue());
                VideoSelectionContentFragment videoSelectionContentFragment = new VideoSelectionContentFragment();
                videoSelectionContentFragment.setArguments(LIZ);
                return videoSelectionContentFragment;
            }
        });
        Iterator<Integer> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            String vl = vl(it.next().intValue());
            if (vl != null) {
                o.LJIIIIZZ(initViews$lambda$2, "tabBar");
                KEI LJII = initViews$lambda$2.LJII();
                LJII.LIZIZ(vl);
                C74053T4n.LIZJ(initViews$lambda$2, LJII, 0, false, 6);
            }
        }
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 1063));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        Context context3 = getContext();
        if (context3 == null || (str = context3.getString(R.string.fvw)) == null) {
            str = "";
        }
        LIZLLL.LIZJ = str;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        o.LJIIIIZZ(initViews$lambda$2, "initViews$lambda$2");
        C74053T4n.LJIILJJIL(initViews$lambda$2, viewPager);
        initViews$lambda$2.LIZ(new InterfaceC74055T4p() { // from class: X.3hj
            @Override // X.InterfaceC74055T4p
            public final void LIZIZ(KEI kei) {
            }

            @Override // X.InterfaceC74055T4p
            public final void LIZJ(KEI tab) {
                o.LJIIIZ(tab, "tab");
            }

            @Override // X.InterfaceC74055T4p
            public final void LIZ(KEI tab) {
                o.LJIIIZ(tab, "tab");
                VideoSelectionTabFragment videoSelectionTabFragment = VideoSelectionTabFragment.this;
                C87393br.LJIIIIZZ(videoSelectionTabFragment.vl(((Number) ListProtector.get(videoSelectionTabFragment.LJLIL, tab.LIZLLL)).intValue()));
                viewPager.setCurrentItem(tab.LIZLLL, true);
            }
        });
        if (!C91093hp.LIZ() && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (context2 = getContext()) != null) {
            new C91063hm(EnumC91123hs.EDUCATION_SHEET_GOT_IT.getValue(), context2, C91143hu.LJLIL).LIZ(supportFragmentManager, "video_selection_panel");
        }
        C87393br.LJIIIIZZ(vl(EnumC85173Vx.LIKED.getType()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2i, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
