package com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71302Ryc;
import X.C76800UCe;
import X.C78926UyI;
import X.C79045V0n;
import X.C86V;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC219588ja;
import X.InterfaceC88472Yns;
import X.S53;
import X.S5A;
import X.S5C;
import X.S5D;
import X.S5F;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductImageSelectFragment extends Fragment implements InterfaceC219588ja {
    public static final String LJLJLJ = ProductImageSelectFragment.class.getName();
    public static final String LJLJLLL = C86V.LJFF(R.string.qfy);
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public InterfaceC88472Yns<? super C71302Ryc, C76800UCe> LJLJI;
    public final C62822Ol8 LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    public ProductImageSelectFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 708);
        S5C s5c = S5C.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), s5c, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), s5c, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ProductListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(LIZ2, 709);
        S5D s5d = S5D.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS162S0100000_122, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), s5d, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS162S0100000_122, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), s5d, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b32;
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 707));
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String IMAGE_SELECT_TITLE = LJLJLLL;
        o.LJIIIIZZ(IMAGE_SELECT_TITLE, "IMAGE_SELECT_TITLE");
        c9kf.LIZJ = IMAGE_SELECT_TITLE;
        c235119Kp.LIZJ = c9kf;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
            c235119Kp.LIZJ(LJI.intValue());
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 706));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    public final RootData vl() {
        return (RootData) this.LJLJJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Map LIZ;
        super.onDestroy();
        String roomId = vl().roomId;
        String authorId = vl().authorId;
        boolean z = vl().isNewUser;
        String L = vl().L();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        LIZ = S5F.LIZ(roomId, authorId, null, L, "template_product_list", z);
        LIZ.put("stay_time", Long.valueOf(currentTimeMillis));
        b.LJJIJIIJI("livesdk_tiktokec_stay_page", LIZ);
        S53.LIZ = 0L;
        S53.LIZIZ = 0L;
        S53.LIZJ = 0L;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Map LIZ;
        super.onCreate(bundle);
        this.LJLJJL = System.currentTimeMillis();
        String roomId = vl().roomId;
        String authorId = vl().authorId;
        boolean z = vl().isNewUser;
        String L = vl().L();
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        LIZ = S5F.LIZ(roomId, authorId, null, L, "template_product_list", z);
        b.LJJIJIIJI("livesdk_tiktokec_enter_page", LIZ);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLJJLL = arguments.getLong("start_click_time");
        }
        long j = this.LJLJJLL;
        S53.LIZ = j;
        S5A.LIZLLL(System.currentTimeMillis() - j, "template_product_list", "notice_board_edit");
        ((ProductListViewModel) this.LJLILLLLZI.getValue()).LJLILLLLZI = new AqS178S0100000_12(this, 700);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 229));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aqk, viewGroup, false);
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
