package com.ss.android.ugc.aweme.effect;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C165706es;
import X.C16880lQ;
import X.C169816lV;
import X.C170326mK;
import X.C170426mU;
import X.C170506mc;
import X.C29S;
import X.C3C5;
import X.C5SC;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC153045zY;
import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TimeEffectTabFragment extends Fragment {
    public C170426mU LJLILLLLZI;
    public EditEffectVideoModel LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public boolean LJLIL = true;

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

    public final int wl() {
        InterfaceC153045zY value;
        EditEffectVideoModel editEffectVideoModel = this.LJLJI;
        if (editEffectVideoModel != null) {
            LiveData<InterfaceC153045zY> LIZIZ = editEffectVideoModel.hv0().LIZIZ();
            if (LIZIZ != null && (value = LIZIZ.getValue()) != null) {
                return value.LLIZLLLIL();
            }
            return 0;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final VideoPublishEditModel xl() {
        EditEffectVideoModel editEffectVideoModel = this.LJLJI;
        if (editEffectVideoModel != null) {
            return editEffectVideoModel.hv0().LLLLIL();
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = (EditEffectVideoModel) C165706es.LJII(view, null, 6).get(EditEffectVideoModel.class);
        _$_findCachedViewById(R.id.lw5).setVisibility(8);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        ((RecyclerView) _$_findCachedViewById(R.id.isv)).setLayoutManager(linearLayoutManager);
        C170426mU c170426mU = new C170426mU();
        this.LJLILLLLZI = c170426mU;
        boolean LJ = C169816lV.LJ(wl());
        ArrayList<EffectModel> LJ2 = C5SC.LJ();
        c170426mU.LJLIL = LJ2;
        if (LJ) {
            ((EffectModel) ListProtector.get(LJ2, 2)).isEnabled = false;
            ((EffectModel) ListProtector.get(c170426mU.LJLIL, 3)).isEnabled = false;
        }
        c170426mU.LJLILLLLZI = new C170506mc(this);
        ((RecyclerView) _$_findCachedViewById(R.id.isv)).setAdapter(c170426mU);
        if (mo49getActivity() != null) {
            EditEffectVideoModel editEffectVideoModel = this.LJLJI;
            if (editEffectVideoModel != null) {
                editEffectVideoModel.ov0().observe(this, new AObserverS70S0100000_2(this, 26));
                EditEffectVideoModel editEffectVideoModel2 = this.LJLJI;
                if (editEffectVideoModel2 != null) {
                    editEffectVideoModel2.ov0().setValue(new C170326mK(wl(), 0));
                    EditEffectVideoModel editEffectVideoModel3 = this.LJLJI;
                    if (editEffectVideoModel3 != null) {
                        editEffectVideoModel3.hv0().LJFF().observe(this, new AObserverS70S0100000_2(c170426mU, 27));
                        EditEffectVideoModel editEffectVideoModel4 = this.LJLJI;
                        if (editEffectVideoModel4 != null) {
                            editEffectVideoModel4.hv0().LJIIIZ().observe(this, new AObserverS70S0100000_2(c170426mU, 28));
                            return;
                        } else {
                            o.LJIJI("viewModel");
                            throw null;
                        }
                    }
                    o.LJIJI("viewModel");
                    throw null;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }

    public final void vl(boolean z, boolean z2) {
        C170426mU c170426mU = this.LJLILLLLZI;
        if (c170426mU != null) {
            ArrayList<EffectModel> LJ = C5SC.LJ();
            c170426mU.LJLIL = LJ;
            ((EffectModel) ListProtector.get(LJ, 1)).isEnabled = z;
            ((EffectModel) ListProtector.get(c170426mU.LJLIL, 2)).isEnabled = z2;
            ((EffectModel) ListProtector.get(c170426mU.LJLIL, 3)).isEnabled = z2;
            c170426mU.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awi, viewGroup, false);
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
