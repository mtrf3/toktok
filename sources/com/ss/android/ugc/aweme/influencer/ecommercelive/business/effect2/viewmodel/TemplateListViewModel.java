package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel;

import X.A2F;
import X.A2G;
import X.C33Q;
import X.C71533S5p;
import X.C71562S6s;
import X.C78685UuP;
import X.C86393XvR;
import X.C8HZ;
import X.InterfaceC07990Tb;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.ORZ;
import X.S5F;
import X.S5I;
import X.S6U;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateListViewModel extends AssemListViewModel<S6U, InterfaceC57784Mm4, Integer> {
    public final C71533S5p LJLIL = new C71533S5p();
    public final InterfaceC07990Tb LJLILLLLZI;
    public final C71562S6s LJLJI;
    public S5I LJLJJI;
    public final HashSet<String> LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new S6U(0);
    }

    public TemplateListViewModel() {
        InterfaceC07990Tb interfaceC07990Tb;
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null) {
            interfaceC07990Tb = LJJIJIL.LJJIJIL();
        } else {
            interfaceC07990Tb = null;
        }
        this.LJLILLLLZI = interfaceC07990Tb;
        this.LJLJI = new C71562S6s();
        this.LJLJJL = new HashSet<>();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 228));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.S7T
            if (r0 == 0) goto L45
            r5 = r7
            X.S7T r5 = (X.S7T) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L4b
            X.C141335gf.LIZJ(r1)
        L20:
            if (r1 != 0) goto L28
        L22:
            X.A2F r0 = X.A2G.LIZ
            X.A2H r1 = X.A2F.LIZIZ(r0)
        L28:
            return r1
        L29:
            X.C141335gf.LIZJ(r1)
            X.S5I r0 = r6.LJLJJI
            if (r0 == 0) goto L22
            X.S6S r0 = r0.Rj()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData r0 = r0.LJLILLLLZI
            java.lang.String r2 = r0.roomId
            java.lang.String r1 = r0.authorId
            int r0 = r0.templateEntryType
            r5.LJLJI = r3
            java.lang.Object r1 = r6.hv0(r0, r2, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L45:
            X.S7T r5 = new X.S7T
            r5.<init>(r6, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r7, X.InterfaceC67352kd<? super X.S7Z> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.S7V
            if (r0 == 0) goto L68
            r4 = r8
            X.S7V r4 = (X.S7V) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L6e
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem r7 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            X.Pbt r1 = (X.C64797Pbt) r1
            if (r1 == 0) goto L31
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L31
            T r5 = r0.data
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse r5 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse) r5
        L31:
            java.lang.String r4 = ""
            r3 = 0
            if (r5 != 0) goto L3c
            X.S7Z r1 = new X.S7Z
            r1.<init>(r3, r7, r3, r4)
        L3b:
            return r1
        L3c:
            int r2 = r5.reviewStatus
            r0 = 2
            if (r2 != r0) goto L47
            X.S7Z r1 = new X.S7Z
            r1.<init>(r7)
            goto L3b
        L47:
            X.S7Z r1 = new X.S7Z
            java.lang.String r0 = r5.reviewMsg
            if (r0 != 0) goto L51
        L4d:
            r1.<init>(r3, r7, r2, r4)
            goto L3b
        L51:
            r4 = r0
            goto L4d
        L53:
            X.C141335gf.LIZJ(r1)
            X.FSJ r1 = X.C36576EXc.LIZIZ
            X.S7L r0 = new X.S7L
            r0.<init>(r6, r7, r5)
            r4.LJLIL = r7
            r4.LJLJJI = r2
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r4)
            if (r1 != r3) goto L23
            return r3
        L68:
            X.S7V r4 = new X.S7V
            r4.<init>(r6, r8)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel.gv0(com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem, X.2kd):java.lang.Object");
    }

    public final void iv0(RootData rootData, TemplateItem t) {
        String str;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        o.LJIIIZ(rootData, "rootData");
        o.LJIIIZ(t, "t");
        if (!this.LJLJJL.contains(t.getTemplateId())) {
            this.LJLJJL.add(t.getTemplateId());
            String roomId = rootData.roomId;
            String authorId = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = t.getTemplateId();
            int type = t.getType();
            boolean LJJJLZIJ = t.LJJJLZIJ();
            String L = rootData.L();
            int i = rootData.templateEntryType;
            List<TemplateDecoration> LLILIL = t.LLILIL();
            if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
                str = templateDecorationTitle.text;
            } else {
                str = null;
            }
            boolean LJJJZ = C78685UuP.LJJJZ(str);
            o.LJIIIZ(roomId, "roomId");
            o.LJIIIZ(authorId, "authorId");
            o.LJIIIZ(templateId, "templateId");
            Map LIZ = S5F.LIZ(roomId, authorId, Integer.valueOf(i), L, "notice_board_template", z);
            LIZ.put("template_id", templateId);
            LIZ.put("module_name", "template_display");
            LIZ.put("is_org_template", Integer.valueOf(!LJJJLZIJ ? 1 : 0));
            LIZ.put("template_type", Integer.valueOf(type));
            LIZ.put("is_suggested_template", Integer.valueOf(LJJJZ ? 1 : 0));
            b.LJJIJIIJI("livesdk_tiktokec_module_show", LIZ);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        return A2F.LIZIZ(A2G.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:13)(2:10|11))(3:94|95|(1:97))|14|(5:22|(4:25|(2:27|(2:29|(2:31|(8:33|(1:35)|36|(1:38)|39|(1:44)|41|42)(8:45|(1:47)|48|(1:50)|51|(1:55)|53|54))(8:56|(1:58)|59|(1:61)|62|(1:66)|64|65))(8:67|(1:69)|70|(1:72)|73|(1:77)|75|76))(8:78|(1:80)|81|(1:83)|84|(1:88)|86|87)|43|23)|89|90|91)|92|90|91))|99|6|7|(0)(0)|14|(8:16|18|20|22|(1:23)|89|90|91)|92|90|91) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(int r17, java.lang.String r18, java.lang.String r19, X.InterfaceC67352kd r20) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel.hv0(int, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
