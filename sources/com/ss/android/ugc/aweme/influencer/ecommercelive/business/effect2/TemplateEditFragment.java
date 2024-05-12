package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2;

import X.ASQ;
import X.ASU;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78685UuP;
import X.C78926UyI;
import X.C79045V0n;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC219588ja;
import X.ORZ;
import X.S5A;
import X.S5F;
import X.S6R;
import X.S6S;
import X.S7G;
import X.S7H;
import X.S7I;
import X.S88;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.DiscountTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.MultiTextTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.ProductTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.SingleTextTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.SizeChartTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateEditFragment extends Fragment implements InterfaceC219588ja, S88 {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C214298b3 LJLIL;
    public S7I LJLILLLLZI;
    public S6R LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public TemplateItem LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.S88
    public final void gh() {
        String str;
        ASQ.LJ(this, new ASU());
        int i = 0;
        ((BillboardGlobalViewModel) this.LJLIL.getValue()).hv0(0);
        RootData rootData = ((S6S) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLILLLLZI;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        boolean z = rootData.isNewUser;
        TemplateItem templateItem = this.LJLJJLL;
        if (templateItem == null || (str = templateItem.getTemplateId()) == null) {
            str = "";
        }
        TemplateItem templateItem2 = this.LJLJJLL;
        if (templateItem2 != null) {
            i = templateItem2.getType();
        }
        S5F.LIZLLL(str2, str3, currentTimeMillis, z, str, i, "display", rootData.L(), rootData.templateEntryType, vl(this.LJLJJLL));
        S6R s6r = this.LJLJI;
        if (s6r != null) {
            s6r.LLJIJIL();
        }
    }

    public TemplateEditFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 636);
        S7G s7g = S7G.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), s7g, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), s7g, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(TemplateEditBottomAreaViewModel.class);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(LIZ2, 637);
        S7H s7h = S7H.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            new C214298b3(aqS162S0100000_122, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), s7h, LIZ2);
        } else {
            if (c9be == null || o.LJ(c9be, c9be)) {
                new C214298b3(aqS162S0100000_122, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), s7h, LIZ2);
                return;
            }
            throw new IllegalArgumentException("Do not support this scope here.");
        }
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.mt);
        o.LJIIIIZZ(string, "getString(R.string.Edit)");
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
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 635));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        S5A.LIZIZ(System.currentTimeMillis() - this.LJLJJL, "notice_board_edit", "notice_board_template", "onResume", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        S5A.LIZIZ(System.currentTimeMillis() - this.LJLJJL, "notice_board_edit", "notice_board_template", "onViewCreated", "onResume");
        this.LJLJJL = System.currentTimeMillis();
    }

    @Override // X.S88
    public final void ni(TemplateItem item) {
        o.LJIIIZ(item, "item");
        S7I s7i = this.LJLILLLLZI;
        if (s7i != null) {
            s7i.I(item);
        }
        ASQ.LJ(this, new ASU());
        RootData rootData = ((S6S) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLILLLLZI;
        S5F.LIZLLL(rootData.roomId, rootData.authorId, System.currentTimeMillis() - this.LJLJJI, rootData.isNewUser, item.getTemplateId(), item.getType(), "save", rootData.L(), rootData.templateEntryType, vl(item));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJJI = currentTimeMillis;
        this.LJLJJL = currentTimeMillis;
        super.onCreate(bundle);
    }

    public final boolean vl(TemplateItem templateItem) {
        String str;
        List<TemplateDecoration> LLILIL;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (templateItem != null && (LLILIL = templateItem.LLILIL()) != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        } else {
            str = null;
        }
        return C78685UuP.LJJJZ(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TemplateItem templateItem;
        Class cls;
        C65776Prg LIZ;
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                int intValue = LJI.intValue();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
                View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.g33));
                if (view2 == null) {
                    View view3 = getView();
                    if (view3 != null && (view2 = view3.findViewById(R.id.g33)) != null) {
                        linkedHashMap.put(Integer.valueOf(R.id.g33), view2);
                    } else {
                        view2 = null;
                    }
                }
                view2.setBackgroundColor(intValue);
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        Object LLJJIII = C16880lQ.LLJJIII(arguments, "extras_template_item");
        if (!(LLJJIII instanceof TemplateItem) || (templateItem = (TemplateItem) LLJJIII) == null) {
            return;
        }
        this.LJLJJLL = templateItem;
        if (templateItem instanceof MultiTextTemplateItem) {
            LIZ = C65352Pkq.LIZ(MultiTextTemplateEditAssem.class);
        } else if (templateItem instanceof SingleTextTemplateItem) {
            LIZ = C65352Pkq.LIZ(SingleTextTemplateEditAssem.class);
        } else if (templateItem instanceof ProductTemplateItem) {
            LIZ = C65352Pkq.LIZ(ProductTemplateEditAssem.class);
        } else {
            if (templateItem instanceof DiscountTemplateItem) {
                cls = DiscountTemplateEditAssem.class;
            } else {
                cls = SizeChartTemplateEditAssem.class;
            }
            LIZ = C65352Pkq.LIZ(cls);
        }
        C8VV.LIZ(this, false, new AqS116S0300000_12(this, LIZ, templateItem, 13));
        RootData rootData = ((S6S) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLILLLLZI;
        String roomId = rootData.roomId;
        String authorId = rootData.authorId;
        boolean z = rootData.isNewUser;
        String templateId = templateItem.getTemplateId();
        int type = templateItem.getType();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        boolean vl = vl(templateItem);
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(templateId, "templateId");
        Map LIZ2 = S5F.LIZ(roomId, authorId, Integer.valueOf(i), L, "notice_board_edit", z);
        LIZ2.put("template_id", templateId);
        LIZ2.put("template_type", Integer.valueOf(type));
        LIZ2.put("is_suggested_template", Integer.valueOf(vl ? 1 : 0));
        b.LJJIJIIJI("livesdk_tiktokec_enter_page", LIZ2);
        S5A.LIZLLL(System.currentTimeMillis() - arguments.getLong("start_click_time", -1L), "notice_board_edit", "notice_board_template");
        S5A.LIZIZ(System.currentTimeMillis() - this.LJLJJL, "notice_board_edit", "notice_board_template", "onCreate", "onViewCreated");
        this.LJLJJL = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aq4, viewGroup, false);
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
