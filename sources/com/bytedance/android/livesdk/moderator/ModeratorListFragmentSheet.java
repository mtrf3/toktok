package com.bytedance.android.livesdk.moderator;

import X.ActivityC45651qj;
import X.BEI;
import X.BEJ;
import X.BEM;
import X.BEP;
import X.BEQ;
import X.BFC;
import X.BZI;
import X.C03880Dg;
import X.C0KB;
import X.C0KJ;
import X.C15380j0;
import X.C16880lQ;
import X.C238749Yo;
import X.C259910h;
import X.C28787BRn;
import X.C29306Beo;
import X.C2NU;
import X.C30161Gi;
import X.C30868C9o;
import X.C51029K0z;
import X.C5H3;
import X.C65300Pk0;
import X.C73943T0h;
import X.C78496UrM;
import X.C78996UzQ;
import X.CN1;
import X.CVT;
import X.ORZ;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ModeratorListFragmentSheet extends LiveSheetFragment {
    public C238749Yo LLF;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public int LLD = 30;
    public final C5H3 LLFF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 248));
    public final C5H3 LLFFF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 247));
    public final BEI LLFII = new BEI(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.mlj));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (Ol()) {
            arrayList2.add(new C30161Gi(R.attr.auz, new ACListenerS25S0100000_5(this, 214)));
            arrayList2.add(new C0KJ(R.drawable.d2w, new ACListenerS25S0100000_5(this, 215)));
        }
        c0kb.LJFF = arrayList2;
        return c0kb;
    }

    public final boolean Ol() {
        return ((Boolean) this.LLFFF.getValue()).booleanValue();
    }

    public final void refresh() {
        this.LLF = new C238749Yo(((Number) this.LLFF.getValue()).longValue(), C51029K0z.LJIILIIL(this), "moderator_panel", Ol(), false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        getContext();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        C238749Yo c238749Yo = this.LLF;
        if (c238749Yo != null) {
            recyclerView2.setAdapter(c238749Yo);
            Ml();
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_admin_list_show");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            _$_findCachedViewById(R.id.j6w).setVisibility(0);
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cuc, C16880lQ.LLZIL(mo49getActivity), null);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 336), LLLZIIL);
            BEJ bej = new BEJ(mo49getActivity);
            bej.LIZIZ(C259910h.LJ(R.attr.au4, mo49getActivity));
            bej.LIZJ(getString(R.string.n30));
            bej.LIZLLL(getString(R.string.npl));
            if (Ol() && !C29306Beo.LJJII(C51029K0z.LJIILIIL(this))) {
                String string = getString(R.string.npd);
                o.LJIIIIZZ(string, "getString(R.string.pm_pr…ngs_addmods_screen_title)");
                bej.LIZ(string, new AqS155S0100000_5(this, 344));
            }
            bej.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            BEQ beq = (BEQ) _$_findCachedViewById(R.id.j6w);
            BEP LIZ2 = BEP.LIZ(mo49getActivity);
            LIZ2.LIZJ = bej;
            LIZ2.LIZLLL = LLLZIIL;
            LIZ2.LIZIZ = new CVT(mo49getActivity, null);
            beq.setBuilder(LIZ2);
            return;
        }
        o.LJIJI("adminAdapter");
        throw null;
    }

    public final void Ml() {
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZLLL();
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).EG(this.LLFII, ((Number) this.LLFF.getValue()).longValue());
        } else {
            C30868C9o.LIZLLL(R.string.n0o, getContext());
        }
    }

    public final List<BFC> Nl() {
        List<BFC> list;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (list = (List) LJIILIIL.kv0(ModeratorListChannel.class)) == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    public final void Pl(int i) {
        if (Ol()) {
            BZI LIZ = C28787BRn.LIZ("livesdk_moderator_page_show");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
            LIZ.LJIJJ(Integer.valueOf(i), "moderator_number");
            LIZ.LJJIIJZLJL();
        }
    }

    public final void Ql(boolean z) {
        String str;
        this.LJLZ.LJIIIIZZ(AddModeratorFragmentSheet.class, "add_moderator", null, null);
        BZI LIZ = C28787BRn.LIZ("livesdk_add_moderator_click");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        if (z) {
            str = "add_icon";
        } else {
            str = "add_button";
        }
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJJIIJZLJL();
    }

    public final void onEvent(BEM bem) {
        if (bem == null) {
            return;
        }
        List<BFC> Nl = Nl();
        ArrayList arrayList = new ArrayList();
        for (BFC bfc : Nl) {
            if (bfc.LIZ != bem.LIZIZ) {
                arrayList.add(bfc);
            }
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(ModeratorListChannel.class, LLJILJILJ);
        }
        if (getView() != null && !bem.LIZ) {
            C238749Yo c238749Yo = this.LLF;
            if (c238749Yo != null) {
                c238749Yo.LJLZ(bem.LIZIZ);
                C238749Yo c238749Yo2 = this.LLF;
                if (c238749Yo2 != null) {
                    if (c238749Yo2.getItemCount() == 0) {
                        ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZIZ();
                        return;
                    }
                    return;
                }
                o.LJIJI("adminAdapter");
                throw null;
            }
            o.LJIJI("adminAdapter");
            throw null;
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8819573013417433783");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/livesdk/moderator/ModeratorListFragmentSheet", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/livesdk/moderator/ModeratorListFragmentSheet", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            refresh();
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/android/livesdk/moderator/ModeratorListFragmentSheet", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cyx, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        refresh();
        C73943T0h.LIZ().LIZJ(this, BEM.class).LIZIZ(new AfS57S0100000_5(this, 149));
    }
}
