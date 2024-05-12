package com.ss.android.ugc.aweme.effect;

import X.ActivityC45651qj;
import X.C03150Al;
import X.C03880Dg;
import X.C0JU;
import X.C113554cx;
import X.C134235Op;
import X.C164996dj;
import X.C165706es;
import X.C170516md;
import X.C171236nn;
import X.C171246no;
import X.C171266nq;
import X.C171296nt;
import X.C171316nv;
import X.C171486oC;
import X.C1A7;
import X.C221108m2;
import X.C60903NvH;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C68332mD;
import X.ORZ;
import X.OSZ;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.IDrS42S0100000_2;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FilterEffectTabFragment extends EditEffectTabFragment {
    public C171246no LJLLL;
    public EditEffectVideoModel LJLLLL;
    public C171296nt LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public C170516md LJZI;
    public boolean LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public final C68332mD LJZL = new C68332mD(new LinkedHashSet());
    public final C62822Ol8 LL = C221108m2.LIZIZ(C171486oC.LJLIL);

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
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

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public FilterEffectTabFragment() {
        new C68332mD(new ArrayList());
        new C68332mD(new ArrayList());
    }

    public final boolean Il() {
        if (this.LJLLILLLL.size() < 5) {
            return false;
        }
        TreeMap treeMap = new TreeMap();
        C113554cx.LJJLIIIJL(treeMap, new OSZ[0]);
        Iterator<EffectPointModel> it = this.LJLLILLLL.iterator();
        while (it.hasNext()) {
            EffectPointModel next = it.next();
            ArrayList arrayList = (ArrayList) treeMap.get(Integer.valueOf(next.getUiStartPoint()));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = (ArrayList) treeMap.get(Integer.valueOf(next.getUiEndPoint()));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            Integer valueOf = Integer.valueOf(next.getUiStartPoint());
            arrayList.add(1);
            treeMap.put(valueOf, arrayList);
            Integer valueOf2 = Integer.valueOf(next.getUiEndPoint());
            arrayList2.add(-1);
            treeMap.put(valueOf2, arrayList2);
        }
        Iterator it2 = treeMap.entrySet().iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                Integer point = (Integer) it3.next();
                o.LJIIIIZZ(point, "point");
                i2 += point.intValue();
                i = C1A7.LJJIIZ(i2, i);
            }
        }
        if (i < 5) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC170126m0
    public final void P6() {
        C171296nt c171296nt = this.LJLLLLLL;
        if (c171296nt != null) {
            Iterator<Map.Entry<Integer, C171316nv>> it = c171296nt.LJLILLLLZI.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().LJLJI = false;
            }
            return;
        }
        o.LJIJI("motionEffectControll");
        throw null;
    }

    public final void Hl(boolean z) {
        RecyclerView.ViewHolder viewHolder;
        LinearLayoutManager linearLayoutManager = this.LJLJI;
        if (linearLayoutManager != null) {
            int LLILL = linearLayoutManager.LLILL();
            LinearLayoutManager linearLayoutManager2 = this.LJLJI;
            if (linearLayoutManager2 != null) {
                int LLILLJJLI = linearLayoutManager2.LLILLJJLI();
                if (LLILL > LLILLJJLI) {
                    return;
                }
                while (true) {
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isv);
                    if (recyclerView != null) {
                        viewHolder = recyclerView.LJJIZ(LLILL);
                    } else {
                        viewHolder = null;
                    }
                    if (viewHolder instanceof C171266nq) {
                        ((C171266nq) viewHolder).LJLJI.LIZ(z);
                    }
                    if (LLILL != LLILLJJLI) {
                        LLILL++;
                    } else {
                        return;
                    }
                }
            } else {
                o.LJIJI("mLinearLayoutManager");
                throw null;
            }
        } else {
            o.LJIJI("mLinearLayoutManager");
            throw null;
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void LLJJLIIIJLLLLLLLZ(Effect rawEffect) {
        o.LJIIIZ(rawEffect, "rawEffect");
        int indexOf = wl().indexOf(rawEffect);
        if (indexOf >= 0) {
            C171246no c171246no = this.LJLLL;
            if (c171246no != null) {
                c171246no.LJLLLLLL(indexOf, 8);
            } else {
                o.LJIJI("mEffectAdapter");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void P3(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = wl().indexOf(effect)) >= 0) {
            C171246no c171246no = this.LJLLL;
            if (c171246no != null) {
                c171246no.LJLLLLLL(indexOf, 32);
            } else {
                o.LJIJI("mEffectAdapter");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJZ = true;
        if (mo49getActivity() != null) {
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJII(getView(), null, 6).get(EditEffectVideoModel.class);
            this.LJLLLL = editEffectVideoModel;
            if (editEffectVideoModel != null) {
                editEffectVideoModel.hv0().LJI().observe(this, new AObserverS70S0100000_2(this, 22));
                ((LiveData) this.LL.getValue()).observe(this, new AObserverS70S0100000_2(this, 23));
                ((LiveData) this.LL.getValue()).setValue(Boolean.valueOf(true ^ Il()));
                return;
            }
            o.LJIJI("mViewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void pl(Effect rawEffect) {
        o.LJIIIZ(rawEffect, "rawEffect");
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        int indexOf = wl().indexOf(rawEffect);
        if (indexOf >= 0) {
            C171246no c171246no = this.LJLLL;
            if (c171246no != null) {
                c171246no.LJLLLLLL(indexOf, 16);
                C170516md c170516md = this.LJZI;
                if (c170516md != null) {
                    if (indexOf == c170516md.LIZIZ && c170516md.LIZ == 0 && !((Set) this.LJZL.getValue()).contains(rawEffect)) {
                        C170516md c170516md2 = this.LJZI;
                        if (c170516md2 != null) {
                            Integer valueOf = Integer.valueOf(c170516md2.LIZ);
                            C170516md c170516md3 = this.LJZI;
                            if (c170516md3 != null) {
                                Gl(valueOf, c170516md3.LIZJ);
                                if (this.LJZI != null) {
                                    ((Set) this.LJZL.getValue()).add(rawEffect);
                                    C60903NvH.LJIIJJI().getApplicationService().getClass();
                                    return;
                                } else {
                                    o.LJIJI("mTouchStateHolder");
                                    throw null;
                                }
                            }
                            o.LJIJI("mTouchStateHolder");
                            throw null;
                        }
                        o.LJIJI("mTouchStateHolder");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("mTouchStateHolder");
                throw null;
            }
            o.LJIJI("mEffectAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "308018983997486821");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/effect/FilterEffectTabFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/effect/FilterEffectTabFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.LJZ) {
            if (z) {
                Hl(true);
            } else {
                Hl(false);
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/effect/FilterEffectTabFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Gl(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel == null) {
                return;
            }
            EditEffectVideoModel editEffectVideoModel = this.LJLLLL;
            if (editEffectVideoModel != null) {
                editEffectVideoModel.jv0().setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
                EditEffectVideoModel editEffectVideoModel2 = this.LJLLLL;
                if (editEffectVideoModel2 != null) {
                    ArrayList<EffectPointModel> J7 = editEffectVideoModel2.hv0().J7();
                    if (!J7.isEmpty()) {
                        this.LJLLILLLL.add(ListProtector.get(J7, J7.size() - 1));
                        return;
                    } else {
                        C0JU.LIZLLL("add effect failed");
                        return;
                    }
                }
                o.LJIJI("mViewModel");
                throw null;
            }
            o.LJIJI("mViewModel");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJZI = new C170516md();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        this.LJLLLLLL = new C171296nt(mo49getActivity);
        _$_findCachedViewById(R.id.isv);
        C171246no c171246no = new C171246no(this.LJLJLJ);
        this.LJLLL = c171246no;
        c171246no.LJLZ(this.LJLJJL);
        C171246no c171246no2 = this.LJLLL;
        if (c171246no2 != null) {
            c171246no2.LJLJJI = new C171236nn(this);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isv);
            C171246no c171246no3 = this.LJLLL;
            if (c171246no3 != null) {
                recyclerView.setAdapter(c171246no3);
                ((RecyclerView) _$_findCachedViewById(R.id.isv)).LJIIJJI(new IDrS42S0100000_2(this, 0));
                String str = this.LJLIL;
                if (str != null) {
                    if (C164996dj.LIZLLL(str)) {
                        ((TextView) _$_findCachedViewById(R.id.lwl)).setText(getString(R.string.fyf));
                    } else {
                        String str2 = this.LJLIL;
                        if (str2 != null) {
                            if (C164996dj.LIZ(str2)) {
                                ((TextView) _$_findCachedViewById(R.id.lwl)).setText(getString(R.string.i81));
                            }
                        } else {
                            o.LJIJI("mCategory");
                            throw null;
                        }
                    }
                    C134235Op.LIZIZ(_$_findCachedViewById(R.id.lw5), 0.5f);
                    _$_findCachedViewById(R.id.lw5).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 23)));
                    vl();
                    return;
                }
                o.LJIJI("mCategory");
                throw null;
            }
            o.LJIJI("mEffectAdapter");
            throw null;
        }
        o.LJIJI("mEffectAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void xl(C03150Al c03150Al, List<? extends EffectModel> list) {
        C171246no c171246no = this.LJLLL;
        if (c171246no != null) {
            c03150Al.LIZJ(c171246no);
            this.LJLJJL = list;
            C171246no c171246no2 = this.LJLLL;
            if (c171246no2 != null) {
                c171246no2.LJLZ(list);
                return;
            } else {
                o.LJIJI("mEffectAdapter");
                throw null;
            }
        }
        o.LJIJI("mEffectAdapter");
        throw null;
    }

    public static final FilterEffectTabFragment Jl(List effects, boolean z, boolean z2, String category) {
        o.LJIIIZ(effects, "effects");
        o.LJIIIZ(category, "category");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("effect_list", (ArrayList) ORZ.LLJILJILJ(effects));
        bundle.putString("effect_category", category);
        bundle.putBoolean("motio_toast", z);
        bundle.putBoolean("show_goto_capcut_effect", z2);
        FilterEffectTabFragment filterEffectTabFragment = new FilterEffectTabFragment();
        filterEffectTabFragment.setArguments(bundle);
        return filterEffectTabFragment;
    }
}
