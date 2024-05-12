package com.ss.android.ugc.aweme.effect;

import X.AbstractC03120Ai;
import X.ActivityC45651qj;
import X.C03150Al;
import X.C03200Aq;
import X.C10A;
import X.C135625Ty;
import X.C141335gf;
import X.C165706es;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C42880GsG;
import X.C42881GsH;
import X.C47261Igj;
import X.C5H3;
import X.C5SC;
import X.C60903NvH;
import X.C61878OQg;
import X.C74216TAu;
import X.C74453TJx;
import X.C76800UCe;
import X.C78596Usy;
import X.C84507XEp;
import X.C90903hW;
import X.EnumC221088m0;
import X.InterfaceC170126m0;
import X.InterfaceC65784Pro;
import X.InterfaceC84510XEs;
import X.ORZ;
import X.TK6;
import X.WPY;
import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class EditEffectTabFragment extends Fragment implements InterfaceC170126m0, InterfaceC84510XEs {
    public String LJLIL;
    public List<? extends Effect> LJLILLLLZI;
    public LinearLayoutManager LJLJI;
    public C42880GsG LJLJJI;
    public boolean LJLJL;
    public C84507XEp LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public EditEffectVideoModel LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public List<? extends EffectModel> LJLJJL = C61878OQg.INSTANCE;
    public boolean LJLJJLL = true;
    public final C5H3 LJLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS152S0100000_2(this, 71));
    public final ArrayList<EffectPointModel> LJLLILLLL = new ArrayList<>();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public View _$_findCachedViewById(int i) {
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

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void vl() {
        A90(true);
        if (C74216TAu.LIZIZ.LIZIZ() && this.LJLJJL.isEmpty()) {
            this.LJLILLLLZI = C74453TJx.LIZIZ("edit_effect", wl(), new AqS168S0100000_2(this, 52));
        }
        if (this.LJLJJL.isEmpty()) {
            if (wl().isEmpty()) {
                WPY.LIZIZ(false, "effect", null, 12);
            } else {
                WPY.LIZIZ(true, "effect", null, 12);
            }
        }
        int i = 0;
        for (Effect effect : wl()) {
            int i2 = i + 1;
            if (i >= 0) {
                Effect effect2 = effect;
                String str = this.LJLIL;
                if (str != null) {
                    EffectModel LIZ = C5SC.LIZ(i, effect2, str);
                    if (this.LJLJL || !LIZ.isGoToCapCutEffect) {
                        final List<? extends EffectModel> list = this.LJLJJL;
                        final List<? extends EffectModel> LLJILJILJ = ORZ.LLJILJILJ(list);
                        ((ArrayList) LLJILJILJ).add(LIZ);
                        xl(C03200Aq.LIZ(new AbstractC03120Ai(list, LLJILJILJ) { // from class: X.6nu
                            public final List<EffectModel> LIZ;
                            public final List<EffectModel> LIZIZ;

                            @Override // X.AbstractC03120Ai
                            public final int LIZLLL() {
                                return this.LIZIZ.size();
                            }

                            @Override // X.AbstractC03120Ai
                            public final int LJ() {
                                return this.LIZ.size();
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                o.LJIIIZ(list, "old");
                                this.LIZ = list;
                                this.LIZIZ = LLJILJILJ;
                            }

                            @Override // X.AbstractC03120Ai
                            public final boolean LIZ(int i3, int i4) {
                                return o.LJ(ListProtector.get(this.LIZ, i3), ListProtector.get(this.LIZIZ, i4));
                            }

                            @Override // X.AbstractC03120Ai
                            public final boolean LIZIZ(int i3, int i4) {
                                return o.LJ(((EffectModel) ListProtector.get(this.LIZ, i3)).name, ((EffectModel) ListProtector.get(this.LIZIZ, i4)).name);
                            }
                        }, true), LLJILJILJ);
                        View _$_findCachedViewById = _$_findCachedViewById(R.id.isv);
                        if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 8) {
                            A90(false);
                        }
                    }
                    i = i2;
                } else {
                    o.LJIJI("mCategory");
                    throw null;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public abstract void xl(C03150Al c03150Al, List<? extends EffectModel> list);

    @Override // X.InterfaceC170126m0
    public final void I() {
        EditEffectVideoModel editEffectVideoModel = this.LJLLI;
        if (editEffectVideoModel != null) {
            this.LJLLILLLL.clear();
            ArrayList<EffectPointModel> arrayList = this.LJLLILLLL;
            ArrayList<EffectPointModel> J7 = editEffectVideoModel.hv0().J7();
            ArrayList arrayList2 = new ArrayList();
            Iterator<EffectPointModel> it = J7.iterator();
            while (it.hasNext()) {
                EffectPointModel next = it.next();
                EffectPointModel effectPointModel = next;
                String category = effectPointModel.getCategory();
                String str = this.LJLIL;
                if (str != null) {
                    if (!o.LJ(category, str)) {
                        List<Effect> wl = wl();
                        if (!wl.isEmpty()) {
                            Iterator<Effect> it2 = wl.iterator();
                            while (it2.hasNext()) {
                                if (o.LJ(it2.next().getEffectId(), effectPointModel.getKey())) {
                                }
                            }
                        }
                    }
                    arrayList2.add(next);
                } else {
                    o.LJIJI("mCategory");
                    throw null;
                }
            }
            arrayList.addAll(arrayList2);
            return;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final List<Effect> wl() {
        List list = this.LJLILLLLZI;
        if (list != null) {
            return list;
        }
        o.LJIJI("mEffectList");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C84507XEp c84507XEp = this.LJLJLJ;
        if (c84507XEp != null) {
            c84507XEp.LJ.remove(this);
        }
    }

    @Override // X.InterfaceC170126m0
    public final List<EffectPointModel> LLJJIJIIJIL() {
        return this.LJLLILLLL;
    }

    public final void A90(boolean z) {
        if (z) {
            _$_findCachedViewById(R.id.g82).setVisibility(0);
            _$_findCachedViewById(R.id.isv).setVisibility(8);
            C42880GsG c42880GsG = this.LJLJJI;
            if (c42880GsG != null) {
                c42880GsG.setVisibility(0);
                c42880GsG.setStatus(0);
                return;
            } else {
                o.LJIJI("mStatusView");
                throw null;
            }
        }
        C42880GsG c42880GsG2 = this.LJLJJI;
        if (c42880GsG2 != null) {
            c42880GsG2.LIZJ();
            _$_findCachedViewById(R.id.g82).setVisibility(8);
            _$_findCachedViewById(R.id.isv).setVisibility(0);
            return;
        }
        o.LJIJI("mStatusView");
        throw null;
    }

    public final void Al(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (c74216TAu.LIZIZ() && !c74216TAu.LJIIIZ()) {
            this.LJLJLLL = interfaceC65784Pro;
            ((TK6) this.LJLL.getValue()).LIZ();
            C78596Usy.LJJJLIIL(getContext(), true);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void Dl(int i) {
        C84507XEp c84507XEp;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        if (C60903NvH.LJIIJJI().LJIJI().LIZIZ() < 0) {
            return;
        }
        int size = wl().size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (this.LJLJLJ == null || !C84507XEp.LJ((Effect) ListProtector.get(wl(), i2))) {
                if (i2 != -1 && (c84507XEp = this.LJLJLJ) != null) {
                    c84507XEp.LIZIZ((Effect) ListProtector.get(wl(), i2));
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (mo49getActivity() != null) {
            I();
            if (C74216TAu.LIZIZ.LIZIZ()) {
                EditEffectVideoModel editEffectVideoModel = this.LJLLI;
                if (editEffectVideoModel != null) {
                    editEffectVideoModel.mv0().observe(this, new AObserverS70S0100000_2(this, 21));
                } else {
                    o.LJIJI("viewModel");
                    throw null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("effect_list");
            o.LJI(parcelableArrayList);
            this.LJLILLLLZI = parcelableArrayList;
            String string = arguments.getString("effect_category");
            o.LJI(string);
            this.LJLIL = string;
            this.LJLJJLL = arguments.getBoolean("motio_toast", true);
            this.LJLJL = arguments.getBoolean("show_goto_capcut_effect", false);
        }
        this.LJLLILLLL.clear();
        C84507XEp c84507XEp = this.LJLJLJ;
        if (c84507XEp != null) {
            c84507XEp.LJ.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJII(view, null, 6).get(EditEffectVideoModel.class);
        this.LJLLI = editEffectVideoModel;
        if (editEffectVideoModel != null) {
            if (editEffectVideoModel.LJLJJLL == null && (mo49getActivity = mo49getActivity()) != null) {
                EditEffectVideoModel editEffectVideoModel2 = this.LJLLI;
                if (editEffectVideoModel2 != null) {
                    C135625Ty LIZ = C60903NvH.LJIIJJI().LJIJI().LIZ(mo49getActivity);
                    o.LJIIIZ(LIZ, "<set-?>");
                    editEffectVideoModel2.LJLJJLL = LIZ;
                } else {
                    o.LJIJI("viewModel");
                    throw null;
                }
            }
            view.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.LLJJIII(0);
            this.LJLJI = linearLayoutManager;
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isv);
            LinearLayoutManager linearLayoutManager2 = this.LJLJI;
            if (linearLayoutManager2 != null) {
                recyclerView.setLayoutManager(linearLayoutManager2);
                return;
            } else {
                o.LJIJI("mLinearLayoutManager");
                throw null;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awi, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.g8y);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.loading_status)");
        C42880GsG c42880GsG = (C42880GsG) findViewById;
        this.LJLJJI = c42880GsG;
        C42881GsH LIZ = C42881GsH.LIZ(getContext());
        LIZ.LJ = 1;
        c42880GsG.setBuilder(LIZ);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
