package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import X.AbstractC030309z;
import X.AbstractC76146TuY;
import X.ActivityC45651qj;
import X.B5G;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C29S;
import X.C3C5;
import X.C48459J0d;
import X.C75545Tkr;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76029Tsf;
import X.C76147TuZ;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76280Twi;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC30442Bx8;
import X.InterfaceC75477Tjl;
import X.U20;
import X.U21;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDrS51S0100000_13;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MatchOnlyGiftSelectContract$AbsView;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchOnlyGiftSelectFragment extends MatchOnlyGiftSelectContract$AbsView {
    public static final /* synthetic */ int LJLJLLL = 0;
    public RecyclerView LJLJJL;
    public InterfaceC75477Tjl LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MatchOnlyGiftSelectContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        int i;
        C76029Tsf c76029Tsf = new C76029Tsf();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mxx);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_ma…option_select_page_title)");
        c76029Tsf.LIZ = LJIILJJIL;
        c76029Tsf.LIZIZ = 307;
        c76029Tsf.LJFF = true;
        LiveIconView liveIconView = new LiveIconView(getContext(), null);
        liveIconView.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(24.0f), C15380j0.LIZ(24.0f)));
        Context context = liveIconView.getContext();
        if (C15380j0.LJIIZILJ()) {
            i = R.attr.asp;
        } else {
            i = R.attr.asm;
        }
        liveIconView.setIcon(C259910h.LIZLLL(i, context));
        C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 190));
        c76029Tsf.LIZLLL = liveIconView;
        c76029Tsf.LJI = C76147TuZ.LJLIL;
        return c76029Tsf;
    }

    public final void wl() {
        C0A2 c0a2;
        LinearLayoutManager linearLayoutManager;
        int LLILL;
        int LLILLJJLI;
        RecyclerView.ViewHolder LJJIZ;
        U21 u21;
        GiftMode giftMode;
        GiftMode giftMode2;
        String str;
        Map<String, String> LIZJ;
        Long l;
        RecyclerView recyclerView = this.LJLJJL;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (!(c0a2 instanceof LinearLayoutManager) || (LLILL = (linearLayoutManager = (LinearLayoutManager) c0a2).LLILL()) > (LLILLJJLI = linearLayoutManager.LLILLJJLI())) {
            return;
        }
        while (true) {
            RecyclerView recyclerView2 = this.LJLJJL;
            if (recyclerView2 != null && (LJJIZ = recyclerView2.LJJIZ(LLILL)) != null && (LJJIZ instanceof U21) && (((giftMode = (u21 = (U21) LJJIZ).LJLLI) == null || giftMode.giftId != 0) && EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue() && (giftMode2 = u21.LJLLI) != null && giftMode2.hasFlashEffect)) {
                C48459J0d<Map<String, String>> c48459J0d = InterfaceC30442Bx8.P2;
                if (c48459J0d != null && (LIZJ = c48459J0d.LIZJ()) != null) {
                    GiftMode giftMode3 = u21.LJLLI;
                    if (giftMode3 != null) {
                        l = Long.valueOf(giftMode3.giftId);
                    } else {
                        l = null;
                    }
                    str = LIZJ.get(String.valueOf(l));
                } else {
                    str = null;
                }
                if (o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                    u21.itemView.post(new ARunnableS49S0100000_13(u21, 257));
                }
            }
            if (LLILL != LLILLJJLI) {
                LLILL++;
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MatchOnlyGiftSelectContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC76146TuY abstractC76146TuY = (AbstractC76146TuY) this.LJLILLLLZI;
        if (abstractC76146TuY != null) {
            abstractC76146TuY.LIZLLL();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List<C75883TqJ> list;
        MutableLiveData<List<C75883TqJ>> mutableLiveData;
        MutableLiveData<List<C75883TqJ>> mutableLiveData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C75832TpU c75832TpU = C75832TpU.LIZ;
        boolean z = this.LJLJL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C75832TpU.LJI(linkedHashMap, z);
        C75832TpU.LJIIL(linkedHashMap, z);
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        C75832TpU.LIZ(linkedHashMap);
        if (C75832TpU.LJIIZILJ()) {
            C76244Tw8 c76244Tw8 = C75832TpU.LJII;
            List<C75883TqJ> list2 = null;
            if (c76244Tw8 != null && (mutableLiveData2 = c76244Tw8.LJ) != null) {
                list = mutableLiveData2.getValue();
            } else {
                list = null;
            }
            C76244Tw8 c76244Tw82 = C75832TpU.LJII;
            if (c76244Tw82 != null && (mutableLiveData = c76244Tw82.LJFF) != null) {
                list2 = mutableLiveData.getValue();
            }
            C75832TpU.LJIILJJIL(list, list2, linkedHashMap);
            C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_option_selection_page_show", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_option_selection_page_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.dtl);
        this.LJLJJL = recyclerView;
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView2 = this.LJLJJL;
        if (recyclerView2 != null) {
            final int LIZ = C15380j0.LIZ(12.0f);
            recyclerView2.LJII(new AbstractC030309z(LIZ) { // from class: X.4ag
                public final int LJLIL;

                {
                    this.LJLIL = LIZ;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect outRect, View view2, RecyclerView parent, C0AC state) {
                    o.LJIIIZ(outRect, "outRect");
                    o.LJIIIZ(view2, "view");
                    o.LJIIIZ(parent, "parent");
                    o.LJIIIZ(state, "state");
                    AbstractC029409q adapter = parent.getAdapter();
                    if (adapter != null) {
                        if (RecyclerView.LJJJJIZL(view2) == adapter.getItemCount() - 1) {
                            return;
                        }
                    }
                    outRect.bottom = this.LJLIL;
                }
            }, -1);
        }
        RecyclerView recyclerView3 = this.LJLJJL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(new U20(this.LJLJL, new AqS179S0100000_13(this, 205)));
        }
        IDrS51S0100000_13 iDrS51S0100000_13 = new IDrS51S0100000_13(this, 6);
        RecyclerView recyclerView4 = this.LJLJJL;
        if (recyclerView4 != null) {
            recyclerView4.LJIIJJI(iDrS51S0100000_13);
        }
        AbstractC76146TuY abstractC76146TuY = (AbstractC76146TuY) this.LJLILLLLZI;
        if (abstractC76146TuY != null) {
            abstractC76146TuY.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C76280Twi c76280Twi;
        boolean z;
        o.LJIIIZ(inflater, "inflater");
        if (this.LJLJL) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        List LIZJ = C76265TwT.LIZJ();
        C29S c29s = null;
        if (LIZJ != null) {
            Iterator it = LIZJ.iterator();
            while (it.hasNext()) {
                if (((GiftMode) it.next()).giftId == c76280Twi.LJIILL) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            }
        }
        c76280Twi.LJIILJJIL = true;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cyq, viewGroup, false);
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
