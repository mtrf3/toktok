package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71603S8h;
import X.C78685UuP;
import X.C78926UyI;
import X.C86V;
import X.C9BD;
import X.C9BE;
import X.ORZ;
import X.OUP;
import X.S5F;
import X.S5G;
import X.S83;
import X.S84;
import X.S8H;
import X.SY4;
import X.TBT;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateEditBottomAreaAssem extends UISlotAssem implements S8H {
    public final C214298b3 LJLL;
    public final C214298b3 LJLLI;
    public long LJLLILLLL;
    public Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C71603S8h.class, null), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this.LJLLJ.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.S8H, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return R.layout.aqd;
    }

    public TemplateEditBottomAreaAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TemplateEditBottomAreaViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 651), S83.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS162S0100000_12(LIZ2, 652), S84.INSTANCE, null);
    }

    private final C71603S8h I3() {
        return (C71603S8h) this.LJLJLLL.getValue();
    }

    public final BillboardGlobalViewModel H3() {
        return (BillboardGlobalViewModel) this.LJLLI.getValue();
    }

    public final TemplateEditBottomAreaViewModel K3() {
        return (TemplateEditBottomAreaViewModel) this.LJLL.getValue();
    }

    private final void initSubscribe() {
        AssemViewModel.asyncSubscribe$default(K3(), new TBT() { // from class: X.S81
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71583S7n) obj).LJLIL;
            }
        }, null, new AqS178S0100000_12(this, 217), new AqS162S0100000_12(this, 649), new AqS178S0100000_12(this, 218), 2, null);
        AssemViewModel.asyncSubscribe$default(K3(), new TBT() { // from class: X.S82
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71583S7n) obj).LJLILLLLZI;
            }
        }, null, new AqS178S0100000_12(this, 219), new AqS162S0100000_12(this, 650), new AqS178S0100000_12(this, 220), 2, null);
    }

    public final void N3() {
        String str;
        RootData rootData = H3().getState().LJLILLLLZI;
        LiveEffect liveEffect = H3().getState().LJLJJLL;
        if (liveEffect == null || (str = liveEffect.getResourceId()) == null) {
            str = "";
        }
        S5G.LIZJ(rootData, "notice_board_edit", str, "template_edit", "display_total");
    }

    @Override // X.S8H
    public void ef() {
        ((SY4) _$_findCachedViewById(R.id.aud)).setEnabled(true);
        ((SY4) _$_findCachedViewById(R.id.au9)).setEnabled(true);
        View llErrorContainer = _$_findCachedViewById(R.id.g0p);
        o.LJIIIIZZ(llErrorContainer, "llErrorContainer");
        OUP.LJIJJLI(llErrorContainer);
    }

    @Override // X.S8H
    public SY4 fi() {
        SY4 btnDisplay = (SY4) _$_findCachedViewById(R.id.au9);
        o.LJIIIIZZ(btnDisplay, "btnDisplay");
        return btnDisplay;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        TemplateItem templateItem = I3().LJLIL;
        TemplateEditBottomAreaViewModel K3 = K3();
        BillboardGlobalViewModel globalStateProvider = H3();
        K3.getClass();
        o.LJIIIZ(globalStateProvider, "globalStateProvider");
        K3.LJLJJI = globalStateProvider;
        K3.LJLJI.LIZIZ = globalStateProvider.Rj().LJLJJI;
        _$_findCachedViewById(R.id.aud).getClass();
        View btnSave = _$_findCachedViewById(R.id.aud);
        o.LJIIIIZZ(btnSave, "btnSave");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, templateItem, 28, 42), btnSave);
        _$_findCachedViewById(R.id.au9).getClass();
        View btnDisplay = _$_findCachedViewById(R.id.au9);
        o.LJIIIIZZ(btnDisplay, "btnDisplay");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, templateItem, 29, 42), btnDisplay);
        if (templateItem.LLJLLIL()) {
            View btnSave2 = _$_findCachedViewById(R.id.aud);
            o.LJIIIIZZ(btnSave2, "btnSave");
            OUP.LJIJJLI(btnSave2);
            ((TextView) _$_findCachedViewById(R.id.au9)).setText(C86V.LJFF(R.string.a23));
        }
        initSubscribe();
    }

    public final void L3(boolean z, String str) {
        String str2;
        String str3;
        RootData rootData = H3().getState().LJLILLLLZI;
        LiveEffect liveEffect = H3().getState().LJLJJLL;
        if (liveEffect == null || (str2 = liveEffect.getResourceId()) == null) {
            str2 = "";
        }
        if (z) {
            str3 = "display_total_success";
        } else {
            str3 = "display_total_fail";
        }
        S5G.LIZIZ(rootData, "notice_board_edit", str2, "template_edit", str3, "display_total", z, Long.valueOf(System.currentTimeMillis() - this.LJLLILLLL), str, 256);
    }

    public final void O3(boolean z, String str) {
        String str2;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        TemplateField templateField;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        RootData rootData = H3().getState().LJLILLLLZI;
        TemplateItem templateItem = I3().LJLIL;
        boolean z2 = false;
        String str3 = null;
        if ((templateItem instanceof ProductTemplateItem) && (templateField = (TemplateField) ORZ.LJLLLLLL(0, templateItem.LJJLJLI())) != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null) {
            str2 = templateFieldProduct.productId;
        } else {
            str2 = null;
        }
        String roomId = rootData.roomId;
        String authorId = rootData.authorId;
        boolean z3 = rootData.isNewUser;
        String templateId = templateItem.getTemplateId();
        int type = templateItem.getType();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        List<TemplateDecoration> LLILIL = templateItem.LLILIL();
        if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str3 = templateDecorationTitle.text;
        }
        boolean LJJJZ = C78685UuP.LJJJZ(str3);
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(templateId, "templateId");
        Map LIZ = S5F.LIZ(roomId, authorId, Integer.valueOf(i), L, "notice_board_edit", z3);
        LIZ.put("is_success", Integer.valueOf(z ? 1 : 0));
        LIZ.put("template_id", templateId);
        if (str != null) {
            LIZ.put("fail_reason", str);
        }
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            LIZ.put("result_name", "template_review");
        } else {
            LIZ.put("result_name", "upload_product_image");
            LIZ.put("product_id", str2);
        }
        LIZ.put("template_type", Integer.valueOf(type));
        LIZ.put("is_suggested_template", Integer.valueOf(LJJJZ ? 1 : 0));
        b.LJJIJIIJI("livesdk_tiktokec_result_show", LIZ);
    }

    public static /* synthetic */ void M3(TemplateEditBottomAreaAssem templateEditBottomAreaAssem, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        templateEditBottomAreaAssem.L3(z, str);
    }
}
