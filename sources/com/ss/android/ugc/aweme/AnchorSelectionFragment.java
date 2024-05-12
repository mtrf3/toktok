package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C31413CUn;
import X.C32I;
import X.C3C5;
import X.C42057Gez;
import X.C42730Gpq;
import X.C42732Gps;
import X.C42759GqJ;
import X.C42779Gqd;
import X.C42782Gqg;
import X.C56525MGj;
import X.C76800UCe;
import X.C81335Vw3;
import X.C8ID;
import X.C90903hW;
import X.InterfaceC36571c5;
import X.InterfaceC42726Gpm;
import X.InterfaceC42777Gqb;
import X.InterfaceC56526MGk;
import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorSelectionFragment extends AnchorBaseFragment implements InterfaceC42777Gqb, InterfaceC56526MGk {
    public C42779Gqd LJLJJI;
    public C42782Gqg LJLJJL;
    public C31413CUn LJLJJLL;
    public C42730Gpq<RecyclerView.ViewHolder> LJLJL;
    public View LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
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
    public final void jh(List<Object> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        C42782Gqg c42782Gqg = this.LJLJJL;
        if (c42782Gqg != null) {
            c42782Gqg.LJIILL(4);
        }
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        boolean z = false;
        if (c42730Gpq != null && c42730Gpq.LJLIL == 0) {
            z = true;
        }
        return !z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C42782Gqg c42782Gqg = this.LJLJJL;
        if (c42782Gqg != null) {
            c42782Gqg.LIZIZ();
            c42782Gqg.LJJII();
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(1);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        ((C8ID) _$_findCachedViewById(R.id.g89)).setVisibility(8);
        _$_findCachedViewById(R.id.fi9).setVisibility(0);
        ((C81335Vw3) _$_findCachedViewById(R.id.g8v)).setRefreshing(false);
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(0);
    }

    @Override // X.InterfaceC42777Gqb
    public final void PK() {
        _$_findCachedViewById(R.id.b87).setVisibility(8);
    }

    @Override // X.InterfaceC42777Gqb
    public final void mE() {
        _$_findCachedViewById(R.id.b87).setVisibility(0);
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(0);
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        ((C8ID) _$_findCachedViewById(R.id.g89)).setVisibility(8);
        _$_findCachedViewById(R.id.fi9).setVisibility(0);
        ((C81335Vw3) _$_findCachedViewById(R.id.g8v)).setRefreshing(false);
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(0);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq == null) {
            return;
        }
        c42730Gpq.LJLLLLLL(2);
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        InterfaceC42726Gpm interfaceC42726Gpm;
        ImageView imageView;
        TextView textView;
        super.onActivityCreated(bundle);
        this.LJLJJI = new C42779Gqd(AnchorBaseFragment.LJLJI.getTYPE());
        C42782Gqg c42782Gqg = new C42782Gqg();
        this.LJLJJL = c42782Gqg;
        c42782Gqg.LJLILLLLZI = this;
        c42782Gqg.LJJ(this.LJLJJI);
        C42782Gqg c42782Gqg2 = this.LJLJJL;
        if (c42782Gqg2 != null) {
            c42782Gqg2.LJLJJI = this;
        }
        ((C8ID) _$_findCachedViewById(R.id.g89)).setVisibility(0);
        ((C81335Vw3) _$_findCachedViewById(R.id.g8v)).setOnRefreshListener(new C42057Gez(this));
        ((ViewStub) _$_findCachedViewById(R.id.kmz)).setLayoutResource(C42759GqJ.LIZIZ(AnchorBaseFragment.LJLJI).LJJJLZIJ());
        View inflate = ((ViewStub) _$_findCachedViewById(R.id.kmz)).inflate();
        this.LJLJLJ = inflate;
        if (inflate != null && (textView = (TextView) inflate.findViewById(R.id.mse)) != null) {
            textView.setText("");
        }
        View view = this.LJLJLJ;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.eix)) != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.mrv);
        Context context = getContext();
        if (context != null) {
            C42759GqJ.LIZIZ(AnchorBaseFragment.LJLJI);
            str = context.getString(R.string.dmx);
        } else {
            str = null;
        }
        textView2.setText(str);
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.b87), new ACListenerS27S0100000_7(this, 121));
        InterfaceC36571c5 mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof InterfaceC42726Gpm) {
            interfaceC42726Gpm = (InterfaceC42726Gpm) mo49getActivity;
        } else {
            interfaceC42726Gpm = null;
        }
        C31413CUn LIZIZ = C42759GqJ.LIZ(interfaceC42726Gpm, AnchorBaseFragment.LJLJI).LIZIZ();
        this.LJLJJLL = LIZIZ;
        this.LJLJL = C42732Gps.LIZ(LIZIZ);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(this.LJLJL);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setItemAnimator(null);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setOnFlingListener(new C56525MGj((RecyclerView) _$_findCachedViewById(R.id.isn), this));
        C42782Gqg c42782Gqg3 = this.LJLJJL;
        if (c42782Gqg3 != null) {
            c42782Gqg3.LJIILL(1);
        }
    }

    @Override // X.InterfaceC42777Gqb
    public final void x10(int i) {
        int i2;
        C31413CUn c31413CUn = this.LJLJJLL;
        if (c31413CUn != null) {
            i2 = c31413CUn.getItemCount();
        } else {
            i2 = 0;
        }
        C31413CUn c31413CUn2 = this.LJLJJLL;
        if (c31413CUn2 != null) {
            c31413CUn2.notifyItemRangeChanged(i, i2);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Object> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        _$_findCachedViewById(R.id.isn).setVisibility(0);
        ((C8ID) _$_findCachedViewById(R.id.g89)).setVisibility(8);
        ((C81335Vw3) _$_findCachedViewById(R.id.g8v)).setRefreshing(false);
        _$_findCachedViewById(R.id.fi9).setVisibility(8);
        C31413CUn c31413CUn = this.LJLJJLL;
        if (c31413CUn != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (Object obj : list) {
                if (obj instanceof AnchorCell) {
                    ((AnchorCell) obj).type = AnchorBaseFragment.LJLJI.getTYPE();
                }
                arrayList.add(obj);
            }
            c31413CUn.LJLIL = arrayList;
        }
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq != null) {
            c42730Gpq.LJLLLLLL(z ? 1 : 0);
        }
        C31413CUn c31413CUn2 = this.LJLJJLL;
        if (c31413CUn2 != null) {
            c31413CUn2.notifyDataSetChanged();
        }
        C42759GqJ.LIZJ(AnchorBaseFragment.LJLJI);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Object> list, boolean z) {
        C31413CUn c31413CUn;
        if (list != null && !list.isEmpty() && (c31413CUn = this.LJLJJLL) != null) {
            c31413CUn.LJLIL = list;
        }
        C42730Gpq<RecyclerView.ViewHolder> c42730Gpq = this.LJLJL;
        if (c42730Gpq != null) {
            c42730Gpq.LJLLLLLL(z ? 1 : 0);
        }
        C31413CUn c31413CUn2 = this.LJLJJLL;
        if (c31413CUn2 != null) {
            c31413CUn2.notifyDataSetChanged();
        }
        C42759GqJ.LIZJ(AnchorBaseFragment.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.do, viewGroup, false);
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
