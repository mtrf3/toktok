package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AnonymousClass572;
import X.AnonymousClass574;
import X.AnonymousClass576;
import X.C127594zb;
import X.C1280450u;
import X.C1281951j;
import X.C1288053s;
import X.C16880lQ;
import X.C221108m2;
import X.C47261Igj;
import X.C50Q;
import X.C53H;
import X.C56A;
import X.C57F;
import X.C57H;
import X.C57I;
import X.C5G0;
import X.C62822Ol8;
import X.C79057V0z;
import X.InterfaceC1287853q;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TransitionTabItemFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment;
import com.ss.android.ugc.gamora.editorpro.transition.TransitionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS165S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoTransitionFragment extends TTResourcePanelFragment<TransitionViewModel> {
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C1281951j.LJLIL);

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "video_transition";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.at6;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        TransitionViewModel.Companion.getClass();
        return C5G0.LIZ(TransitionViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C53H LJIILIIL;
        C50Q c50q = (C50Q) this.LJLZ.getValue();
        if (c50q != null && (LJIILIIL = c50q.LJIILIIL()) != null) {
            LJIILIIL.LJ(true);
        }
        C57F c57f = (C57F) _$_findCachedViewById(R.id.ljt);
        c57f.LJLJL = null;
        c57f.LJLJLLL = null;
        c57f.LJLJLJ = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lm() {
        NLETrackSlot preNLESlot;
        String str;
        View view;
        NLEResourceNode LIZLLL;
        Iterator<Fragment> it = ((C57F) _$_findCachedViewById(R.id.ljt)).getFragments().iterator();
        while (it.hasNext()) {
            Fragment next = it.next();
            if ((next instanceof TransitionTabItemFragment) && next.isResumed() && (preNLESlot = ((TransitionViewModel) Ml()).getPreNLESlot(Jl())) != null) {
                if (preNLESlot.hasExtra("slot_extra_transition_effect_id")) {
                    TransitionViewModel transitionViewModel = (TransitionViewModel) Ml();
                    String extra = preNLESlot.getExtra("slot_extra_transition_effect_id");
                    o.LJIIIIZZ(extra, "it.getExtra(SLOT_EXTRA_TRANSITION_EFFECT_ID)");
                    transitionViewModel.setCurApplyTransitionId(extra);
                }
                NLESegmentTransition LIZLLL2 = preNLESlot.LIZLLL();
                if (LIZLLL2 == null || (LIZLLL = LIZLLL2.LIZLLL()) == null || (str = LIZLLL.LIZJ()) == null) {
                    str = "";
                }
                View view2 = next.getView();
                if (view2 != null) {
                    view = view2.findViewById(R.id.ljy);
                } else {
                    view = null;
                }
                AnonymousClass574 anonymousClass574 = (AnonymousClass574) view;
                o.LJIIIIZZ(anonymousClass574, "updateResourceSelectStat…da$14$lambda$13$lambda$12");
                AnonymousClass574.LJI(anonymousClass574, str, 14);
                AnonymousClass576 resourceListAdapter = anonymousClass574.getResourceListAdapter();
                if (resourceListAdapter != null) {
                    Iterator<AnonymousClass572> it2 = resourceListAdapter.LJLJJL.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (it2.hasNext()) {
                        AnonymousClass572 next2 = it2.next();
                        int i3 = i + 1;
                        if (i >= 0) {
                            if (o.LJ(next2.LJLIL.getPath(), str)) {
                                i2 = i;
                            }
                            i = i3;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    RecyclerView recyclerView = anonymousClass574.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.LJLIL(i2);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
        lm();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C53H LJIILIIL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            Nl();
            MJ();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.ljr), "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
            final C57F c57f = (C57F) _$_findCachedViewById(R.id.ljt);
            c57f.setOnStartFetchCategory(C1288053s.LJLIL);
            c57f.setOnInitFinishListener(new AqS165S0200000_2(this, c57f, 4));
            c57f.setOnPageSelected(new AqS133S0200000_2(this, c57f, 137));
            c57f.setMultiPageAdapter(new InterfaceC1287853q() { // from class: X.53p
                public final FragmentManager LIZ;

                @Override // X.InterfaceC1287853q
                public final FragmentManager getFragmentManager() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1287853q
                public final TransitionTabItemFragment LIZ(C1288653y category) {
                    o.LJIIIZ(category, "category");
                    TransitionTabItemFragment transitionTabItemFragment = new TransitionTabItemFragment();
                    Bundle bundle2 = new Bundle();
                    boolean z = true;
                    if (c57f.getCategoryList().size() <= 1) {
                        z = false;
                    }
                    bundle2.putBoolean("has_category", z);
                    String str = category.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                    bundle2.putString("category", str);
                    transitionTabItemFragment.setArguments(bundle2);
                    transitionTabItemFragment.LJLJI = new AqS168S0100000_2(VideoTransitionFragment.this, 586);
                    return transitionTabItemFragment;
                }

                {
                    FragmentManager childFragmentManager = VideoTransitionFragment.this.getChildFragmentManager();
                    o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                    this.LIZ = childFragmentManager;
                }
            });
            C57I c57i = new C57I(0);
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(c57f.getContext()), R.layout.as1, c57f, true);
            c57f.LJLJI = c57i;
            Context context = c57f.getContext();
            o.LJIIIIZZ(context, "context");
            c57f.LJLIL = new C57H(context);
            if (c57i.LJFF == C56A.UP) {
                ViewGroup viewGroup = (ViewGroup) c57f.LIZ(R.id.n9z);
                C57H c57h = c57f.LJLIL;
                if (c57h != null) {
                    viewGroup.addView(c57h, 0);
                } else {
                    o.LJIJI("resourceMultiTab");
                    throw null;
                }
            } else {
                ViewGroup viewGroup2 = (ViewGroup) c57f.LIZ(R.id.n9z);
                C57H c57h2 = c57f.LJLIL;
                if (c57h2 != null) {
                    viewGroup2.addView(c57h2, 1);
                } else {
                    o.LJIJI("resourceMultiTab");
                    throw null;
                }
            }
            c57f.LIZIZ(false);
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.lji), new ACListenerS22S0100000_2(this, 143));
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.ljh), new ACListenerS22S0100000_2(this, 141));
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.lju), new ACListenerS22S0100000_2(this, 144));
            if (Jl().getSelectedTrackSlot() != null) {
                C79057V0z.LJJJJL(Jl(), "select_slot_event", new C127594zb(null, null, 14));
            }
            C50Q c50q = (C50Q) this.LJLZ.getValue();
            if (c50q != null && (LJIILIIL = c50q.LJIILIIL()) != null) {
                LJIILIIL.LJ(false);
            }
            MutableLiveData LJII = C79057V0z.LJII(Jl(), "update_transition_select");
            if (LJII != null) {
                LJII.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 299));
            }
        }
    }
}
