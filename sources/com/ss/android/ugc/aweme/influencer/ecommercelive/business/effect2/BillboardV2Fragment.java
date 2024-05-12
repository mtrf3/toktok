package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2;

import X.ASQ;
import X.ASU;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C0CM;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71544S6a;
import X.C71546S6c;
import X.C71547S6d;
import X.C71548S6e;
import X.C71549S6f;
import X.C71569S6z;
import X.C74053T4n;
import X.C76800UCe;
import X.C78926UyI;
import X.C79045V0n;
import X.C86V;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC219588ja;
import X.K37;
import X.KEI;
import X.S5A;
import X.S5F;
import X.S6R;
import X.TBT;
import X.W5F;
import X.W5U;
import X.XKQ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BillboardV2Fragment extends Fragment implements InterfaceC219588ja, S6R {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public String LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // X.S6R
    public final void LLJIJIL() {
        ASQ.LJ(this, new ASU());
        EventCenter.LJ().LIZ("ec_live_shop_widget_on_destroy", "{}");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public BillboardV2Fragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 279);
        C71547S6d c71547S6d = C71547S6d.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c71547S6d, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c71547S6d, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ImageListViewModel.class);
        AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9(LIZ2, 280);
        C71548S6e c71548S6e = C71548S6e.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c71548S6e, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b32 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c71548S6e, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b32;
        this.LJLJI = "";
        this.LJLJJI = "";
        this.LJLJL = "";
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.f7h);
        o.LJIIIIZZ(string, "getString(R.string.ecom_billbroad)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                c235119Kp.LIZJ(LJI.intValue());
            }
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 633));
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_now_setting;
        LIZJ2.LIZIZ(new AqS162S0100000_12(this, 634));
        c235119Kp.LIZIZ(LIZJ2);
        return c235119Kp;
    }

    public final BillboardGlobalViewModel vl() {
        return (BillboardGlobalViewModel) this.LJLIL.getValue();
    }

    public final ImageListViewModel wl() {
        return (ImageListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        RootData rootData = vl().getState().LJLILLLLZI;
        String roomId = rootData.roomId;
        String authorId = rootData.authorId;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL;
        boolean z = rootData.isNewUser;
        String L = rootData.L();
        int i = rootData.templateEntryType;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        Map LIZ = S5F.LIZ(roomId, authorId, Integer.valueOf(i), L, "notice_board_template", z);
        LIZ.put("stay_time", Long.valueOf(currentTimeMillis));
        b.LJJIJIIJI("livesdk_tiktokec_stay_page", LIZ);
        vl().gv0();
        S5A.LIZIZ(System.currentTimeMillis() - this.LJLJJLL, "notice_board_template", this.LJLJL, "onResume", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        S5A.LIZIZ(System.currentTimeMillis() - this.LJLJJLL, "notice_board_template", this.LJLJL, "onViewCreated", "onResume");
        this.LJLJJLL = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        if (X.C71569S6z.LIZ().getBoolean("key_is_first_show_auto_display", true) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardV2Fragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ImageListViewModel wl = wl();
        wl.LJLJJLL.clear();
        try {
            XKQ xkq = wl.LJLJL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
        } catch (Throwable unused) {
        }
        wl.setStateImmediate(new AqS178S0100000_12(wl, 525));
        C71544S6a c71544S6a = new C71544S6a(this, this);
        ((C0CM) _$_findCachedViewById(R.id.nej)).setAdapter(c71544S6a);
        KEI LJII = ((C74053T4n) _$_findCachedViewById(R.id.ky7)).LJII();
        ArrayList<Integer> arrayList = C71544S6a.LJLLI;
        Object obj = ListProtector.get(arrayList, 0);
        o.LJIIIIZZ(obj, "MainViewPagerAdapter.TABS[0]");
        LJII.LIZIZ(C86V.LJFF(((Number) obj).intValue()));
        KEI LJII2 = ((C74053T4n) _$_findCachedViewById(R.id.ky7)).LJII();
        Object obj2 = ListProtector.get(arrayList, 1);
        o.LJIIIIZZ(obj2, "MainViewPagerAdapter.TABS[1]");
        LJII2.LIZIZ(C86V.LJFF(((Number) obj2).intValue()));
        C74053T4n it = (C74053T4n) _$_findCachedViewById(R.id.ky7);
        o.LJIIIIZZ(it, "it");
        C74053T4n.LIZJ(it, LJII, 0, false, 4);
        C74053T4n.LIZJ(it, LJII2, 1, false, 4);
        it.setHorizontalScrollBarEnabled(false);
        C0CM vpContent = (C0CM) _$_findCachedViewById(R.id.nej);
        o.LJIIIIZZ(vpContent, "vpContent");
        it.LIZ(new C71549S6f(vpContent));
        vpContent.LIZIZ(new K37(it));
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                int intValue = LJI.intValue();
                _$_findCachedViewById(R.id.ky7).setBackgroundColor(intValue);
                _$_findCachedViewById(R.id.nej).setBackgroundColor(intValue);
            }
        }
        ((C0CM) _$_findCachedViewById(R.id.nej)).LIZIZ(new C71546S6c(this, c71544S6a));
        C0CM c0cm = (C0CM) _$_findCachedViewById(R.id.nej);
        if (vl().getState().LJLILLLLZI.templateEntryType == 2) {
            i = 0;
        } else {
            vl().LJLIL.LIZ.getClass();
            i = C71569S6z.LIZ().getInt("key_last_tab_index", 0);
        }
        c0cm.setCurrentItem(i);
        if (vl().getState().LJLILLLLZI.isNewUser && this.LJLJJI.length() > 0 && this.LJLJI.length() > 0) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LJLJI);
            LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ewc);
            C16880lQ.LLJJJ(LJIIIIZZ);
            ((TextView) _$_findCachedViewById(R.id.lwj)).setText(this.LJLJJI);
        }
        Bundle arguments = getArguments();
        long j = -1;
        if (arguments != null) {
            j = arguments.getLong("start_click_time", -1L);
        }
        S5A.LIZLLL(System.currentTimeMillis() - j, "notice_board_template", this.LJLJL);
        S5A.LIZIZ(System.currentTimeMillis() - this.LJLJJLL, "notice_board_template", this.LJLJL, "onCreate", "onViewCreated");
        this.LJLJJLL = System.currentTimeMillis();
        wl().asyncSubscribe(new TBT() { // from class: X.S6G
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj3) {
                return ((S6F) obj3).LJLJI;
            }
        }, C213688a4.LIZJ(), this, new AqS178S0100000_12(this, 318), new AqS162S0100000_12(this, 987), new AqS178S0100000_12(this, 319));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        if (vl().getState().LJLILLLLZI.isNewUser) {
            i = R.layout.aq3;
        } else {
            i = R.layout.apy;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
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
