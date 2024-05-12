package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.AbstractC008101l;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C238549Xu;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9R5;
import X.C9RE;
import X.C9RF;
import X.C9RO;
import X.InterfaceC61213O0r;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicFragment;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class VideoTrendingTopicFragment extends BaseFragment {
    public final C214298b3 LJLILLLLZI;
    public final C9RO LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C9RE.LJLIL, "init_config", C9R5.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    /* JADX WARN: Type inference failed for: r0v10, types: [X.9RO] */
    public VideoTrendingTopicFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTrendingTopicListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 882);
        C9RF c9rf = C9RF.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c9rf, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c9rf, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        this.LJLJI = new AbstractC008101l() { // from class: X.9RO
            @Override // X.AbstractC008101l
            public final void LIZ() {
                Intent intent;
                ActivityC45651qj mo49getActivity = VideoTrendingTopicFragment.this.mo49getActivity();
                if (mo49getActivity != null) {
                    VideoTrendingTopicListViewModel videoTrendingTopicListViewModel = (VideoTrendingTopicListViewModel) VideoTrendingTopicFragment.this.LJLILLLLZI.getValue();
                    if (videoTrendingTopicListViewModel.LJLJLJ != null) {
                        intent = new Intent();
                        VideoTrendingTopic videoTrendingTopic = videoTrendingTopicListViewModel.LJLJLJ;
                        if (videoTrendingTopic != null) {
                            intent.putExtra("video_trending_topic", videoTrendingTopic);
                        }
                    } else {
                        intent = null;
                    }
                    mo49getActivity.setResult(-1, intent);
                }
                ActivityC45651qj mo49getActivity2 = VideoTrendingTopicFragment.this.mo49getActivity();
                if (mo49getActivity2 != null) {
                    mo49getActivity2.finish();
                }
            }

            {
                super(true);
            }
        };
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        fragmentConfiguration(C238549Xu.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 797));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ActivityC45651qj LJJIFFI;
        OnBackPressedDispatcher onBackPressedDispatcher;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (LJJIFFI = C45804HyK.LJJIFFI(mo49getActivity)) != null && (onBackPressedDispatcher = LJJIFFI.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(getViewLifecycleOwner(), this.LJLJI);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dsf, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
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
