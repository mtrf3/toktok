package com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm;

import X.C113554cx;
import X.C221108m2;
import X.C36746EbW;
import X.C48189Ivh;
import X.C51029K0z;
import X.C51755KSx;
import X.C55983Ly7;
import X.C55989LyD;
import X.C56063LzP;
import X.C56092Lzs;
import X.C56123M0x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C68672ml;
import X.C72912tb;
import X.C78404Ups;
import X.C78565UsT;
import X.C78613UtF;
import X.C78983UzD;
import X.EV6;
import X.EnumC51775KTr;
import X.EnumC56062LzO;
import X.EnumC56082Lzi;
import X.EnumC56107M0h;
import X.EnumC56121M0v;
import X.EnumC56124M0y;
import X.FKM;
import X.M0A;
import X.M0D;
import X.M0E;
import X.M0H;
import X.M0L;
import X.M1A;
import X.M1B;
import X.M1F;
import X.M1Z;
import X.O5Y;
import X.OSZ;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShopMainLynxViewModel extends AssemViewModel<C55983Ly7> {
    public M0E LJLIL;
    public boolean LJLJJLL;
    public volatile C68672ml LJLJLLL;
    public final M0L LJLILLLLZI = new M0L(0);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 130));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 129));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(M1Z.LJLIL);
    public final EV6 LJLJL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C51755KSx.class));
    public final String LJLJLJ = "sslocal://webcast_lynxview?hide_nav_bar=1&use_new_container=1&trans_status_bar=1&hide_status_bar=0&trackParams=%7B%22previous_page%22%3A%22mall%22%2C%22enter_from%22%3A%22mall%22%7D&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_shop_cart%2Fall%2Fpages%2Fmain%2Ftemplate.js";
    public final long LJLL = 3000;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C55983Ly7 defaultState() {
        return new C55983Ly7(0);
    }

    public final M0H hv0() {
        return (M0H) this.LJLJI.getValue();
    }

    public final void jv0(EnumC56124M0y requestType) {
        int type;
        o.LJIIIZ(requestType, "requestType");
        OSZ[] oszArr = new OSZ[2];
        int i = C56063LzP.LIZ[this.LJLILLLLZI.LJLIL.ordinal()];
        if (i != 1 && i != 2) {
            type = EnumC51775KTr.ERROR_RETRY.getType();
        } else {
            type = EnumC51775KTr.FIRST_REQUEST.getType();
        }
        oszArr[0] = new OSZ("mall_request_type", Integer.valueOf(type));
        oszArr[1] = new OSZ("mall_request_scene", "ttmall_homepage");
        Map LJJL = C113554cx.LJJL(oszArr);
        if (!C48189Ivh.LJFF(FKM.LIZ())) {
            M0L m0l = this.LJLILLLLZI;
            EnumC56062LzO enumC56062LzO = EnumC56062LzO.NETWORK_UNAVAILABLE_RETRY;
            m0l.getClass();
            o.LJIIIZ(enumC56062LzO, "<set-?>");
            m0l.LJLIL = enumC56062LzO;
            setState(M1A.LJLIL);
            O5Y.LJJJJLL(EnumC56082Lzi.STAGE_LOAD_DATA.getStage(), this.LJLILLLLZI, C51029K0z.LJJIIZI(new OSZ("err_msg", EnumC56121M0v.NETWORK_UNAVAILABLE.getErrMsg())));
            C56092Lzs.LIZ.getClass();
            C56092Lzs.LJIILL(LJJL, false);
            return;
        }
        C78565UsT.LJJIJIIJI(this, C78613UtF.LIZJ, new M0A(this, LJJL, requestType, null));
    }

    public final void kv0(Response<?> response) {
        Throwable LIZ;
        TemplateData LIZJ;
        if (getState().LJLIL instanceof C72912tb) {
            if (response == null) {
                LIZJ = M0D.LIZLLL(EnumC56107M0h.DATA_NULL);
            } else {
                LIZJ = M0D.LIZJ(response.code, response.message);
            }
            C36746EbW.LIZ(3, "LynxDataUpdate");
            C36746EbW.LIZ(3, "ShopTabV3 DataUpdate onDataFail stateForReqErr withCache");
            M0E m0e = this.LJLIL;
            if (m0e != null) {
                m0e.LIZ(new C56123M0x(LIZJ, false));
                return;
            }
            return;
        }
        if (response == null) {
            LIZ = M0D.LIZIZ(EnumC56107M0h.DATA_NULL);
        } else {
            LIZ = M0D.LIZ(response.code, response.message);
        }
        C36746EbW.LIZ(3, "LynxDataUpdate");
        C36746EbW.LIZ(3, "ShopTabV3 DataUpdate onDataFail stateForReqErr withoutCache");
        setState(new AqS175S0100000_9(LIZ, 65));
    }

    public final void lv0(C68672ml c68672ml) {
        if (c68672ml == null) {
            this.LJLJLLL = null;
            C36746EbW.LIZ(3, "ShopTab Tooltip CartTooltip setState Fail");
            setState(C55989LyD.LJLIL);
        } else {
            C36746EbW.LIZ(3, "ShopTab Tooltip CartTooltip setState Success");
            setState(new AqS175S0100000_9(c68672ml, 66));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.M0V
            if (r0 == 0) goto L69
            r4 = r8
            X.M0V r4 = (X.M0V) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L6f
            com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel r0 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.2ml r1 = (X.C68672ml) r1
            r0.LJLJLLL = r1
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            if (r7 == 0) goto L26
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData r0 = r7.getDiversionData()
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetRes r2 = X.C73340SqO.LJJI(r0)
            if (r2 == 0) goto L26
            X.Le5 r0 = com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment.LJZ
            r0.getClass()
            boolean r0 = X.C54741Le5.LIZIZ()
            if (r0 == 0) goto L26
            java.lang.String r1 = r2.name
            X.M15 r0 = X.M15.MALL_CART_BASE_TOOLTIP
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData r1 = r7.getDiversionData()
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetResCfg r0 = r2.config
            r4.getClass()
            r4.LJLIL = r6
            r4.LJLJJI = r3
            java.lang.Object r1 = r6.gv0(r1, r0, r4)
            if (r1 != r5) goto L67
            return r5
        L67:
            r0 = r6
            goto L22
        L69:
            X.M0V r4 = new X.M0V
            r4.<init>(r6, r8)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel.iv0(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData, X.2kd):java.lang.Object");
    }

    public final void mv0(String str, Map map) {
        EnumC56062LzO enumC56062LzO;
        try {
            M0E m0e = this.LJLIL;
            if (m0e != null) {
                if (this.LJLILLLLZI.LJLJI) {
                    EnumC56062LzO dataFrom = this.LJLILLLLZI.LJLIL;
                    o.LJIIIZ(dataFrom, "dataFrom");
                    if (dataFrom != EnumC56062LzO.API_ERROR_RETRY && dataFrom != EnumC56062LzO.NETWORK_UNAVAILABLE_RETRY && dataFrom != EnumC56062LzO.TEMPLATE_ERROR_RETRY) {
                        M0L m0l = this.LJLILLLLZI;
                        if (m0l.LJLJJI) {
                            enumC56062LzO = EnumC56062LzO.REFRESH;
                        } else {
                            enumC56062LzO = EnumC56062LzO.PREFETCH;
                        }
                        o.LJIIIZ(enumC56062LzO, "<set-?>");
                        m0l.LJLIL = enumC56062LzO;
                    }
                }
                this.LJLILLLLZI.LJLJI = true;
                O5Y.LJJJJLL(EnumC56082Lzi.STAGE_SET_DATA_STATE.getStage(), this.LJLILLLLZI, C51029K0z.LJJIIZI(new OSZ("is_data_cache", CardStruct.IStatusCode.DEFAULT)));
                if (!map.isEmpty()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("jason LynxDataUpdate dataFrom = ");
                    LIZ.append(this.LJLILLLLZI.LJLIL);
                    C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ShopTabV3 DataUpdate onDataSuccess dataFrom = ");
                    LIZ2.append(this.LJLILLLLZI.LJLIL);
                    C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
                    m0e.LIZIZ(new C56123M0x(nv0(str, map), true));
                    setState(M1F.LJLIL);
                    C56092Lzs c56092Lzs = C56092Lzs.LIZ;
                    int status = M1B.HIDE.getStatus();
                    c56092Lzs.getClass();
                    C56092Lzs.LJIIL(status, null);
                    return;
                }
                C36746EbW.LIZ(3, "LynxDataUpdate");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ShopTabV3 DataUpdate onDataFail ");
                EnumC56107M0h enumC56107M0h = EnumC56107M0h.DATA_NULL;
                LIZ3.append(enumC56107M0h);
                C36746EbW.LIZ(3, X1D.LIZIZ(LIZ3));
                m0e.LIZ(new C56123M0x(M0D.LIZLLL(enumC56107M0h), 2));
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    public final TemplateData nv0(String str, Map map) {
        TemplateData LIZIZ = TemplateData.LIZIZ();
        LIZIZ.LJI("data", map);
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIIJ(new OSZ("type", this.LJLILLLLZI.LJLIL.getValue()), new OSZ("log_id", str))).entrySet()) {
            LIZIZ.LJI((String) entry.getKey(), entry.getValue());
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009a, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:11:0x00af, B:12:0x00b2, B:15:0x00bc, B:17:0x00c0, B:18:0x00c6, B:22:0x00cf), top: B:10:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #1 {all -> 0x00d3, blocks: (B:11:0x00af, B:12:0x00b2, B:15:0x00bc, B:17:0x00c0, B:18:0x00c6, B:22:0x00cf), top: B:10:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #2 {all -> 0x0098, blocks: (B:43:0x0064, B:45:0x006a, B:46:0x006e, B:48:0x0074, B:52:0x008c, B:61:0x0093), top: B:42:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData r21, com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetResCfg r22, X.InterfaceC67352kd<? super X.C68672ml> r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel.gv0(com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData, com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetResCfg, X.2kd):java.lang.Object");
    }
}
