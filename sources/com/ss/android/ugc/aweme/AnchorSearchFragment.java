package com.ss.android.ugc.aweme;

import X.AbstractC42751GqB;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C31413CUn;
import X.C3C5;
import X.C42730Gpq;
import X.C42732Gps;
import X.C42759GqJ;
import X.C42770GqU;
import X.C42773GqX;
import X.C42774GqY;
import X.C42775GqZ;
import X.C42776Gqa;
import X.C42780Gqe;
import X.C51031K1b;
import X.C56525MGj;
import X.C61898ORa;
import X.C65300Pk0;
import X.C76800UCe;
import X.C8ID;
import X.C90903hW;
import X.C9UE;
import X.InterfaceC223218pR;
import X.InterfaceC36571c5;
import X.InterfaceC42726Gpm;
import X.InterfaceC56526MGk;
import X.ORY;
import X.ORZ;
import X.X1D;
import Y.ACListenerS27S0100000_7;
import Y.IDObjectS179S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class AnchorSearchFragment extends AnchorBaseFragment implements InterfaceC223218pR<AnchorCell>, InterfaceC56526MGk {
    public C51031K1b<C42780Gqe> LJLJJI;
    public C42775GqZ LJLJJL;
    public C31413CUn LJLJJLL;
    public C31413CUn LJLJL;
    public C42730Gpq<RecyclerView.ViewHolder> LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // X.InterfaceC223218pR
    public final void jh(List<AnchorCell> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        boolean z = false;
        if (c42730Gpq != null && c42730Gpq.LJLIL == 0) {
            z = true;
        }
        return !z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C51031K1b<C42780Gqe> c51031K1b = this.LJLJJI;
        if (c51031K1b != null) {
            c51031K1b.LIZIZ();
            c51031K1b.LJJII();
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(1);
    }

    public final void vl() {
        C42775GqZ c42775GqZ = this.LJLJJL;
        if (c42775GqZ != null) {
            String[] stringArray = c42775GqZ.LIZIZ.getStringArray(c42775GqZ.LIZ, new String[0]);
            o.LJIIIIZZ(stringArray, "keva.getStringArray(name, arrayOf())");
            List<?> LJLIIIL = ORY.LJLIIIL(stringArray);
            C31413CUn c31413CUn = this.LJLJJLL;
            if (c31413CUn != null) {
                c31413CUn.LJZ(LJLIIIL);
                C31413CUn c31413CUn2 = this.LJLJJLL;
                if (c31413CUn2 != null) {
                    c31413CUn2.notifyDataSetChanged();
                    if (((ArrayList) LJLIIIL).size() > 2) {
                        _$_findCachedViewById(R.id.bec).setVisibility(0);
                        return;
                    }
                    return;
                }
                o.LJIJI("mHistoryAdapter");
                throw null;
            }
            o.LJIJI("mHistoryAdapter");
            throw null;
        }
    }

    public final void wl() {
        C51031K1b<C42780Gqe> c51031K1b = this.LJLJJI;
        if (c51031K1b != null) {
            String history = s.LJZI(((EditText) _$_findCachedViewById(R.id.jf4)).getText().toString()).toString();
            if (!TextUtils.isEmpty(history)) {
                c51031K1b.LJIILL(1, history);
                _$_findCachedViewById(R.id.isj).setVisibility(8);
                _$_findCachedViewById(R.id.bec).setVisibility(8);
                C9UE.LIZ(getContext(), _$_findCachedViewById(R.id.jf4));
                C42775GqZ c42775GqZ = this.LJLJJL;
                if (c42775GqZ != null) {
                    o.LJIIIZ(history, "history");
                    String[] stringArray = c42775GqZ.LIZIZ.getStringArray(c42775GqZ.LIZ, new String[0]);
                    o.LJIIIIZZ(stringArray, "keva.getStringArray(name, arrayOf())");
                    c42775GqZ.LIZIZ.storeStringArray(c42775GqZ.LIZ, (String[]) ORZ.LLILLL(ORY.LJJIJIL(C61898ORa.LJJIII(new String[]{history}, stringArray)), 10).toArray(new String[0]));
                }
            }
        }
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        String charSequence = s.LJZI(((EditText) _$_findCachedViewById(R.id.jf4)).getText().toString()).toString();
        C51031K1b<C42780Gqe> c51031K1b = this.LJLJJI;
        if (c51031K1b != null) {
            c51031K1b.LJIILL(4, charSequence);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        ((C8ID) _$_findCachedViewById(R.id.g8q)).setVisibility(0);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        _$_findCachedViewById(R.id.msb).setVisibility(0);
        _$_findCachedViewById(R.id.msa).setVisibility(0);
        ((C8ID) _$_findCachedViewById(R.id.g8q)).setVisibility(8);
        _$_findCachedViewById(R.id.isk).setVisibility(8);
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(0);
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(0);
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(0);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(2);
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        C31413CUn c31413CUn = new C31413CUn();
        InterfaceC36571c5 mo49getActivity = mo49getActivity();
        o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.IFragmentNavigation");
        C42773GqX c42773GqX = new C42773GqX((InterfaceC42726Gpm) mo49getActivity);
        c42773GqX.LIZJ = new C42770GqU(this);
        c42773GqX.LIZLLL = new C42776Gqa(c31413CUn, this);
        c31413CUn.LJLZ(String.class, c42773GqX);
        this.LJLJJLL = c31413CUn;
        AbstractC42751GqB LIZ = C42759GqJ.LIZ((InterfaceC42726Gpm) mo49getActivity(), AnchorBaseFragment.LJLJI);
        C31413CUn c31413CUn2 = new C31413CUn();
        LIZ.LIZ(c31413CUn2, LIZ.LIZ, "search_result");
        this.LJLJL = c31413CUn2;
        this.LJLJJI = new C51031K1b<>();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("anchor_search_history");
        LIZ2.append(AnchorBaseFragment.LJLJI.name());
        this.LJLJJL = new C42775GqZ(X1D.LIZIZ(LIZ2));
        C42780Gqe c42780Gqe = new C42780Gqe(AnchorBaseFragment.LJLJI.getTYPE());
        C51031K1b<C42780Gqe> c51031K1b = this.LJLJJI;
        if (c51031K1b != null) {
            c51031K1b.LJLILLLLZI = this;
            c51031K1b.LJJ(c42780Gqe);
        }
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b41), new ACListenerS27S0100000_7(this, 117));
        TextView textView = (TextView) _$_findCachedViewById(R.id.jf4);
        Context context = getContext();
        if (context != null) {
            C42759GqJ.LIZIZ(AnchorBaseFragment.LJLJI);
            str = context.getString(R.string.dmx);
        } else {
            str = null;
        }
        textView.setHint(str);
        ((TextView) _$_findCachedViewById(R.id.jf4)).setImeOptions(3);
        ((TextView) _$_findCachedViewById(R.id.jf4)).setInputType(1);
        ((TextView) _$_findCachedViewById(R.id.jf4)).setOnEditorActionListener(new C42774GqY(this));
        ((TextView) _$_findCachedViewById(R.id.jf4)).addTextChangedListener(new IDObjectS179S0100000_7(this, 2));
        _$_findCachedViewById(R.id.jf4).setFocusable(true);
        _$_findCachedViewById(R.id.jf4).setFocusableInTouchMode(true);
        _$_findCachedViewById(R.id.jf4).requestFocus();
        Context context2 = getContext();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jf4);
        if (context2 != null && _$_findCachedViewById != null) {
            try {
                _$_findCachedViewById.requestFocus();
                Object LLILL = C16880lQ.LLILL(context2, "input_method");
                o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) LLILL).showSoftInput(_$_findCachedViewById, 2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.jez), new ACListenerS27S0100000_7(this, 118));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.bec), new ACListenerS27S0100000_7(this, 119));
        this.LJLJLJ = C42732Gps.LIZ(this.LJLJL);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isk);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.isk)).setAdapter(this.LJLJLJ);
        ((RecyclerView) _$_findCachedViewById(R.id.isk)).setOnFlingListener(new C56525MGj((RecyclerView) _$_findCachedViewById(R.id.isk), this));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isj);
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.isj);
        C31413CUn c31413CUn3 = this.LJLJJLL;
        if (c31413CUn3 != null) {
            recyclerView3.setAdapter(c31413CUn3);
            vl();
        } else {
            o.LJIJI("mHistoryAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4325289206823581068");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/AnchorSearchFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/AnchorSearchFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            ((EditText) _$_findCachedViewById(R.id.jf4)).getText().clear();
            C9UE.LIZ(getContext(), _$_findCachedViewById(R.id.jf4));
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/AnchorSearchFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<AnchorCell> list, boolean z) {
        _$_findCachedViewById(R.id.msb).setVisibility(8);
        _$_findCachedViewById(R.id.msa).setVisibility(8);
        ((C8ID) _$_findCachedViewById(R.id.g8q)).setVisibility(8);
        _$_findCachedViewById(R.id.isk).setVisibility(0);
        if (list == null || list.isEmpty()) {
            return;
        }
        C31413CUn c31413CUn = this.LJLJL;
        if (c31413CUn != null) {
            c31413CUn.LJLIL = list;
        }
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq != null) {
            c42730Gpq.LJLLLLLL(z ? 1 : 0);
        }
        C31413CUn c31413CUn2 = this.LJLJL;
        if (c31413CUn2 != null) {
            c31413CUn2.notifyDataSetChanged();
        }
        C42759GqJ.LIZJ(AnchorBaseFragment.LJLJI);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<AnchorCell> list, boolean z) {
        C31413CUn c31413CUn;
        if (list != null && !list.isEmpty() && (c31413CUn = this.LJLJL) != null) {
            c31413CUn.LJLIL = list;
        }
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJLJ;
        if (c42730Gpq != null) {
            c42730Gpq.LJLLLLLL(z ? 1 : 0);
        }
        C31413CUn c31413CUn2 = this.LJLJL;
        if (c31413CUn2 != null) {
            c31413CUn2.notifyDataSetChanged();
        }
        C42759GqJ.LIZJ(AnchorBaseFragment.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dn, viewGroup, false);
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
