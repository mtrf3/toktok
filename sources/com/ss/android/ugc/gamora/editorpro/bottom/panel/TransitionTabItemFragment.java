package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.AnonymousClass551;
import X.AnonymousClass553;
import X.AnonymousClass574;
import X.C10A;
import X.C1280450u;
import X.C1287253k;
import X.C1287353l;
import X.C1287453m;
import X.C1291354z;
import X.C1295856s;
import X.C1295956t;
import X.C1296156v;
import X.C132805Jc;
import X.C134845Qy;
import X.C141335gf;
import X.C150135ur;
import X.C16880lQ;
import X.C173376rF;
import X.C2068389v;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C56A;
import X.C57B;
import X.C57U;
import X.C5QW;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78926UyI;
import X.C79045V0n;
import X.C90903hW;
import X.SY9;
import X.V3N;
import Y.IDrS42S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TransitionTabItemFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.transition.TransitionViewModel;
import com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TransitionTabItemFragment extends Fragment {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public AqS168S0100000_2 LJLJI;
    public IDrS42S0100000_2 LJLJJI;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C1287353l.LJLIL);
    public final ArrayList<String> LJLJJLL = new ArrayList<>();
    public final ArrayList<String> LJLJL = new ArrayList<>();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLJ;
        Integer valueOf = Integer.valueOf(R.id.ljy);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.ljy)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        this.LJLJI = null;
        IDrS42S0100000_2 iDrS42S0100000_2 = this.LJLJJI;
        if (iDrS42S0100000_2 != null && (recyclerView = ((AnonymousClass574) _$_findCachedViewById(R.id.ljy)).getRecyclerView()) != null) {
            recyclerView.LJJLL(iDrS42S0100000_2);
        }
        this.LJLJJI = null;
        AnonymousClass574 anonymousClass574 = (AnonymousClass574) _$_findCachedViewById(R.id.ljy);
        anonymousClass574.LJLJJL = null;
        anonymousClass574.LJLJJLL = null;
        anonymousClass574.LJLJL = null;
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    public final EditorProContext vl() {
        return (EditorProContext) this.LJLJJL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final AnonymousClass574 anonymousClass574;
        boolean z;
        String str;
        int i;
        int i2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.53n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        if (C1280450u.LIZ() && (anonymousClass574 = (AnonymousClass574) _$_findCachedViewById(R.id.ljy)) != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("has_category");
            } else {
                z = false;
            }
            this.LJLILLLLZI = z;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (str = arguments2.getString("category")) == null) {
                str = "";
            }
            this.LJLIL = str;
            C1291354z c1291354z = new C1291354z();
            c1291354z.LJ = this.LJLILLLLZI;
            c1291354z.LIZJ = "editor_pro_transition";
            c1291354z.LIZ = new ScrollCenterLayoutManager(getContext());
            c1291354z.LIZIZ = new C150135ur(13);
            c1291354z.LJFF = false;
            String string = requireActivity().getString(R.string.sjc);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_block;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c2068389v.LIZIZ = C134845Qy.LIZ(24.0f);
            c2068389v.LIZJ = C134845Qy.LIZ(24.0f);
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            SY9 LIZ = c2068389v.LIZ(requireActivity);
            o.LJIIIIZZ(string, "getString(R.string.trans…ioneditorpro_button_none)");
            c1291354z.LJI = new AnonymousClass553(true, R.drawable.are, true, LIZ, string, 96);
            c1291354z.LJIIJJI = new C1295956t(true, 62, 62, R.drawable.arc, 240);
            c1291354z.LJIIIIZZ = new C1296156v(54, 54, 8, R.drawable.are, R.drawable.are, 0.0f, 449);
            C56A c56a = C56A.DOWN;
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            Integer LJI = C79045V0n.LJI(Integer.valueOf(R.attr.dl).intValue(), requireActivity2);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = -1;
            }
            ActivityC45651qj requireActivity3 = requireActivity();
            o.LJIIIIZZ(requireActivity3, "requireActivity()");
            Integer LJI2 = C79045V0n.LJI(Integer.valueOf(R.attr.dj).intValue(), requireActivity3);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            } else {
                i2 = -1;
            }
            c1291354z.LJII = new C57B(i, i2, c56a, 2, 0.0f, new AqS152S0100000_2(this, 946), C1287453m.LJLIL, 177);
            c1291354z.LJIIIZ = new C1295856s(0, 0, 0, null, 126);
            c1291354z.LJIIZILJ = new C1287253k(new AqS152S0100000_2(this, 947), new V3N());
            if (this.LJLILLLLZI) {
                String str2 = this.LJLIL;
                if (str2 != null) {
                    c1291354z.LIZLLL = str2;
                } else {
                    o.LJIJI("categoryKey");
                    throw null;
                }
            }
            AnonymousClass551 anonymousClass551 = new AnonymousClass551(c1291354z);
            anonymousClass574.setResourceListInitListener(new C57U() { // from class: X.53i
                @Override // X.C57U
                public final void LIZ(boolean z2, boolean z3) {
                    ViewTreeObserver viewTreeObserver;
                    AqS168S0100000_2 aqS168S0100000_2 = TransitionTabItemFragment.this.LJLJI;
                    if (aqS168S0100000_2 != null) {
                        aqS168S0100000_2.invoke(Boolean.valueOf(z2));
                    }
                    if (z2) {
                        TransitionViewModel.Companion.getClass();
                        final TransitionViewModel transitionViewModel = (TransitionViewModel) C5G0.LIZ(TransitionViewModel.class);
                        RecyclerView recyclerView = anonymousClass574.getRecyclerView();
                        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                            final TransitionTabItemFragment transitionTabItemFragment = TransitionTabItemFragment.this;
                            final AnonymousClass574 anonymousClass5742 = anonymousClass574;
                            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.53h
                                /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
                                
                                    if (kotlin.jvm.internal.o.LJ(r2, r0) == false) goto L12;
                                 */
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void onGlobalLayout() {
                                    /*
                                        r7 = this;
                                        com.ss.android.ugc.gamora.editorpro.bottom.panel.TransitionTabItemFragment r6 = com.ss.android.ugc.gamora.editorpro.bottom.panel.TransitionTabItemFragment.this
                                        com.ss.android.ugc.gamora.editorpro.transition.TransitionViewModel r5 = r2
                                        r6.getClass()
                                        java.lang.String r0 = "viewModel"
                                        kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                                        r0 = 2131378256(0x7f0a4050, float:1.837674E38)
                                        android.view.View r3 = r6._$_findCachedViewById(r0)
                                        X.574 r3 = (X.AnonymousClass574) r3
                                        if (r3 == 0) goto L3c
                                        com.ss.ugc.android.editor.core.EditorProContext r0 = r6.vl()
                                        int r4 = r5.getSaveIndex(r0)
                                        com.ss.ugc.android.editor.core.EditorProContext r0 = r6.vl()
                                        java.lang.String r2 = r5.getSaveTab(r0)
                                        boolean r0 = r6.LJLILLLLZI
                                        r1 = 0
                                        if (r0 == 0) goto L4e
                                        int r0 = r2.length()
                                        if (r0 <= 0) goto L4e
                                        java.lang.String r0 = r6.LJLIL
                                        if (r0 == 0) goto L8f
                                        boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
                                        if (r0 != 0) goto L4e
                                    L3c:
                                        X.574 r0 = r3
                                        androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                                        if (r0 == 0) goto L4d
                                        android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                                        if (r0 == 0) goto L4d
                                        r0.removeOnGlobalLayoutListener(r7)
                                    L4d:
                                        return
                                    L4e:
                                        X.576 r0 = r3.getResourceListAdapter()
                                        if (r0 == 0) goto L3c
                                        java.util.List r2 = r0.LJLLLLLL()
                                        if (r2 == 0) goto L3c
                                        boolean r0 = r2.isEmpty()
                                        if (r0 == 0) goto L61
                                        goto L3c
                                    L61:
                                        if (r4 < 0) goto L3c
                                        int r0 = r2.size()
                                        if (r4 >= r0) goto L3c
                                        java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r4)
                                        com.ss.ugc.android.editor.base.resource.ResourceItem r0 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r0
                                        java.lang.String r1 = r0.getEffectId()
                                        java.lang.String r0 = "list[selectedPosition].effectId"
                                        kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                                        r5.setCurApplyTransitionId(r1)
                                        java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r4)
                                        com.ss.ugc.android.editor.base.resource.ResourceItem r0 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r0
                                        java.lang.String r1 = r0.getPath()
                                        java.lang.String r0 = "list[selectedPosition].path"
                                        kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                                        r0 = 6
                                        X.AnonymousClass574.LJI(r3, r1, r0)
                                        goto L3c
                                    L8f:
                                        java.lang.String r0 = "categoryKey"
                                        kotlin.jvm.internal.o.LJIJI(r0)
                                        throw r1
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC1286953h.onGlobalLayout():void");
                                }
                            });
                        }
                        final TransitionTabItemFragment transitionTabItemFragment2 = TransitionTabItemFragment.this;
                        final AnonymousClass574 anonymousClass5743 = anonymousClass574;
                        transitionTabItemFragment2.getClass();
                        final RecyclerView recyclerView2 = anonymousClass5743.getRecyclerView();
                        if (recyclerView2 != null) {
                            C0A3 c0a3 = new C0A3() { // from class: X.53j
                                @Override // X.C0A3
                                public final void LJIILIIL(View view2) {
                                    o.LJIIIZ(view2, "view");
                                }

                                @Override // X.C0A3
                                public final void LJJIFFI(View view2) {
                                    ResourceItem resourceItem;
                                    o.LJIIIZ(view2, "view");
                                    AnonymousClass576 resourceListAdapter = AnonymousClass574.this.getResourceListAdapter();
                                    if (resourceListAdapter != null) {
                                        C40517FvF LJJ = C47261Igj.LJJ(resourceListAdapter.LJLLLLLL());
                                        RecyclerView recyclerView3 = recyclerView2;
                                        AnonymousClass574 anonymousClass5744 = AnonymousClass574.this;
                                        TransitionTabItemFragment transitionTabItemFragment3 = transitionTabItemFragment2;
                                        recyclerView3.getClass();
                                        Integer valueOf = Integer.valueOf(RecyclerView.LJJJJJ(view2));
                                        int intValue = valueOf.intValue();
                                        if (intValue <= LJJ.LJLILLLLZI && intValue >= 0) {
                                            int intValue2 = valueOf.intValue();
                                            AnonymousClass576 resourceListAdapter2 = anonymousClass5744.getResourceListAdapter();
                                            if (resourceListAdapter2 != null && (resourceItem = (ResourceItem) ORZ.LJLLLLLL(intValue2, resourceListAdapter2.LJLLLLLL())) != null) {
                                                transitionTabItemFragment3.LJLJJLL.add(resourceItem.getEffectId());
                                                transitionTabItemFragment3.LJLJL.add(resourceItem.getEffectId());
                                            }
                                        }
                                    }
                                }
                            };
                            transitionTabItemFragment2.getClass();
                            recyclerView2.LJIIIZ(c0a3);
                        }
                    }
                }
            });
            anonymousClass574.setResourceListMobListener(new C173376rF());
            anonymousClass574.LJ(anonymousClass551);
            anonymousClass574.setOnItemClickListener(new C78926UyI() { // from class: X.4yx
                @Override // X.InterfaceC1296256w
                public final void LIZJ(ResourceItem resourceItem, int i3, boolean z2) {
                    if (z2) {
                        if (resourceItem != null) {
                            TransitionTabItemFragment transitionTabItemFragment = TransitionTabItemFragment.this;
                            AnonymousClass574 anonymousClass5742 = anonymousClass574;
                            transitionTabItemFragment.getClass();
                            TransitionViewModel.Companion.getClass();
                            TransitionViewModel transitionViewModel = (TransitionViewModel) C5G0.LIZ(TransitionViewModel.class);
                            if (C78609UtB.LJJJJJ(resourceItem)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                String string2 = transitionTabItemFragment.requireActivity().getString(R.string.sjc);
                                o.LJIIIIZZ(string2, "requireActivity().getStr…ioneditorpro_button_none)");
                                transitionViewModel.setNullTransition(string2, transitionTabItemFragment.vl());
                                FMX.LJIIL("acc_advanced_edit_delete_transition_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis, "acc_advanced_edit_delete_transition_duration").LIZ);
                                transitionTabItemFragment.wl(transitionViewModel, "");
                            } else {
                                Double d = resourceItem.transitionDefaultDuration;
                                if (d != null) {
                                    d.doubleValue();
                                    long maxDuration = transitionViewModel.getMaxDuration(transitionTabItemFragment.vl());
                                    long doubleValue = (long) (resourceItem.transitionDefaultDuration.doubleValue() * 1000000);
                                    IInternalAVService LIZ2 = AVServiceImpl.LIZ();
                                    LIZ2.setLastStickerId(resourceItem.getEffectId(), 7);
                                    LIZ2.setLastStickerId(resourceItem.getResourceId(), 6);
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    String path = resourceItem.getPath();
                                    o.LJIIIIZZ(path, "item.path");
                                    transitionViewModel.setTransition(new C124984vO(Math.min(maxDuration, doubleValue), "", path, resourceItem.getEffectId(), resourceItem.getName(), i3, resourceItem.getResourceId(), resourceItem.overlap), transitionTabItemFragment.vl());
                                    FMX.LJIIL("acc_advanced_edit_add_transition_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis2, "acc_advanced_edit_add_transition_duration").LIZ);
                                    String effectId = resourceItem.getEffectId();
                                    o.LJIIIIZZ(effectId, "item.effectId");
                                    transitionTabItemFragment.wl(transitionViewModel, effectId);
                                }
                            }
                            String path2 = resourceItem.getPath();
                            o.LJIIIIZZ(path2, "this.path");
                            AnonymousClass574.LJI(anonymousClass5742, path2, 14);
                            TransitionViewModel transitionViewModel2 = (TransitionViewModel) C5G0.LIZ(TransitionViewModel.class);
                            String effectId2 = resourceItem.getEffectId();
                            o.LJIIIIZZ(effectId2, "this.effectId");
                            transitionViewModel2.setCurApplyTransitionId(effectId2);
                            return;
                        }
                        return;
                    }
                    ActivityC45651qj requireActivity4 = TransitionTabItemFragment.this.requireActivity();
                    o.LJIIIIZZ(requireActivity4, "requireActivity()");
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    String string3 = TransitionTabItemFragment.this.requireActivity().getString(R.string.sjn);
                    o.LJIIIIZZ(string3, "requireActivity().getStr…ro_transition_toast_fail)");
                    creativeToastBuilder.message(string3);
                    C78915Uy7.LJJIIZI(requireActivity4, 3046, creativeToastBuilder);
                }
            });
            RecyclerView recyclerView = anonymousClass574.getRecyclerView();
            if (recyclerView != null) {
                IDrS42S0100000_2 iDrS42S0100000_2 = new IDrS42S0100000_2(this, 5);
                this.LJLJJI = iDrS42S0100000_2;
                recyclerView.LJIIJJI(iDrS42S0100000_2);
            }
        }
    }

    public final void wl(TransitionViewModel transitionViewModel, String str) {
        NLETrackSlot preNLESlot;
        VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ != null && (preNLESlot = transitionViewModel.getPreNLESlot(vl())) != null) {
            boolean hasExtra = preNLESlot.hasExtra("split_ref_name");
            Iterator<NLETrackSlot> it = vl().getMainTrack().LJIILL().iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (o.LJ(it.next(), preNLESlot)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            C5QW.LJJJ(LIZIZ, vl(), C47261Igj.LJII(str), true, C47261Igj.LJII(Integer.valueOf(i + 1)), hasExtra);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.at3, viewGroup, false);
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
