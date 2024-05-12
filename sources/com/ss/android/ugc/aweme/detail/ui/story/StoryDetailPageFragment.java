package com.ss.android.ugc.aweme.detail.ui.story;

import X.C211998Tr;
import X.C221108m2;
import X.C2304092m;
import X.C2RY;
import X.C32151Nz;
import X.C55723Ltv;
import X.C62822Ol8;
import X.C7MY;
import X.C80896Voy;
import Y.IDTListenerS118S0100000_9;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.IDqS434S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class StoryDetailPageFragment extends DetailPageFragment {
    public int LJLL;
    public int LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final int LJLJLLL = C7MY.LIZIZ(40);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 92));

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public StoryDetailPageFragment() {
        C55723Ltv.LIZIZ.LJIIIIZZ().LIZ(mo49getActivity());
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailPageComponent Gl() {
        return new StoryDetailComponent();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final void Pl() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL_STORY");
        }
    }

    public final boolean Sl() {
        if (!C2304092m.LIZ() || !C211998Tr.LIZ() || o.LJ(this.LJLJJI.getFrom(), "STORY_ENTRANCE_ARCHIVE")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C2RY c2ry = (C2RY) view.findViewById(R.id.j7n);
        if (c2ry != null) {
            c2ry.setChildListCanVerticalScrollCallback(new AqS175S0100000_9(this, 30));
        }
        C80896Voy c80896Voy = (C80896Voy) view.findViewById(R.id.kat);
        if (c80896Voy != null) {
            c80896Voy.setMaxOverScrollDistance(C32151Nz.LJIIZILJ(200));
            c80896Voy.setRubberBandCoefficient(0.4f);
            c80896Voy.setOnScrollChangeListener(new IDqS434S0100000_9(this, 0));
            c80896Voy.setOnTouchListener(new IDTListenerS118S0100000_9(this, 0));
        }
    }
}
