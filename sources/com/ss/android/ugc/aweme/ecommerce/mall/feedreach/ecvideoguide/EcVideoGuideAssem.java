package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C188787b0;
import X.C1DH;
import X.C212428Vi;
import X.C214348b8;
import X.C221108m2;
import X.C224498rV;
import X.C2L0;
import X.C2U8;
import X.C36636EZk;
import X.C38891fp;
import X.C3C5;
import X.C45804HyK;
import X.C51029K0z;
import X.C52933Kq1;
import X.C53913LDx;
import X.C55937LxN;
import X.C55951Lxb;
import X.C56136M1k;
import X.C56140M1o;
import X.C56141M1p;
import X.C56142M1q;
import X.C56144M1s;
import X.C56146M1u;
import X.C56147M1v;
import X.C56148M1w;
import X.C56151M1z;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.C78685UuP;
import X.C78866UxK;
import X.C78983UzD;
import X.C79146V4k;
import X.C87277YNd;
import X.C8T7;
import X.ECL;
import X.ECO;
import X.EnumC55950Lxa;
import X.EnumC56033Lyv;
import X.EnumC56143M1r;
import X.IKB;
import X.InterfaceC115514g7;
import X.InterfaceC53894LDe;
import X.InterfaceC70422pa;
import X.InterfaceC74236TBo;
import X.LE3;
import X.LE4;
import X.LXS;
import X.LXU;
import X.M20;
import X.M21;
import X.M22;
import X.M23;
import X.M24;
import X.MBA;
import X.OSZ;
import X.QD3;
import X.T2R;
import X.TBT;
import X.ViewOnClickListenerC56138M1m;
import X.XKQ;
import X.XKS;
import Y.ACListenerS27S0101000_9;
import Y.ARunnableS12S0201000_9;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class EcVideoGuideAssem extends BaseCellSlotComponent<EcVideoGuideAssem> implements ComponentPriorityProtocol, InterfaceC53894LDe, InterfaceC70422pa {
    public static final ECO LLILLJJLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLL;
    public static final HashSet<String> LLILZ;
    public final InterfaceC115514g7 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public int LLIIIZ;
    public MBA LLIIJI;
    public XKQ LLIIJLIL;
    public XKS LLIIL;
    public XKS LLIILII;
    public boolean LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public final C62822Ol8 LLILII;
    public final C62822Ol8 LLILIL;
    public final C62822Ol8 LLILL;
    public final Map<Integer, View> LLILLIZIL = new LinkedHashMap();
    public final C5H3 LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), M20.INSTANCE);
    public final C5H3 LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), M21.INSTANCE);
    public final C5H3 LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoFavoriteVM.class), M22.INSTANCE);
    public final C5H3 LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoDiggVM.class), M23.INSTANCE);
    public final C5H3 LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), M24.INSTANCE);

    static {
        TBT tbt = new TBT(EcVideoGuideAssem.class, "videoGuideVM", "getVideoGuideVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/feedreach/ecvideoguide/EcVideoGuideVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLILLL = new InterfaceC74236TBo[]{tbt};
        LLILLJJLI = new ECO();
        LLILZ = new HashSet<>();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.a7c;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLIZIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "full_container_shop_video_guide";
    }

    public EcVideoGuideAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(EcVideoGuideVM.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ, null, new AqS159S0100000_9(LIZ, 127), null, C56151M1z.INSTANCE, null, null);
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 126));
        this.LLILII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 125));
        this.LLILIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 123));
        this.LLILL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 124));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        if (this.LLIIIJ) {
            A4(true);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void e4() {
        if (this.LLIIIJ) {
            A4(false);
        }
        if (this.LLIIIJ && !ActivityStack.isAppBackGround()) {
            q4(EnumC56033Lyv.TO_SUBPAGE, this.LLIIIZ);
        }
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        MBA mba = this.LLIIJI;
        if (mba != null && C79146V4k.LJJJ(mba)) {
            return mba;
        }
        MBA plus = T2R.LJIIJJI().plus(C36636EZk.LIZ.LJJIJIL());
        this.LLIIJI = plus;
        return plus;
    }

    public final EcVideoGuideVM r4() {
        return (EcVideoGuideVM) this.LLIIII.LIZ(this, LLILLL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        MBA mba = this.LLIIJI;
        if (mba != null) {
            C79146V4k.LJIJ(mba, null);
        }
        EcVideoGuideVM r4 = r4();
        r4.getClass();
        r4.LJLIL = "";
        D4(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        HomeTabAbility LJIL;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        C76800UCe c76800UCe = null;
        if (LIZ != null) {
            try {
                C188787b0 c188787b0 = Hox.LJLLI;
                c188787b0.LIZ(LIZ).zv0("page_profile", (C56148M1w) this.LLILII.getValue());
                c188787b0.LIZ(LIZ).LJLJL.remove(this);
                MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ);
                if (LJJLIIIJJI != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                    LJIL.Q6((C56146M1u) this.LLILIL.getValue());
                    LJIL.a2((C56147M1v) this.LLILL.getValue());
                    c76800UCe = C76800UCe.LIZ;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return Y3();
    }

    public static void D4(EcVideoGuideAssem ecVideoGuideAssem) {
        try {
            EventBus LIZJ = EventBus.LIZJ();
            C76800UCe c76800UCe = null;
            if (LIZJ.LJI(ecVideoGuideAssem)) {
                LIZJ.LJIJ(ecVideoGuideAssem);
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void A4(boolean z) {
        this.LLIIIL = z;
        if (z && this.LLIL <= 0) {
            C38891fp.LJJIIJ(C76800UCe.LIZ, this.LLIILII);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x044f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C4(X.InterfaceC67352kd<? super X.C76800UCe> r29) {
        /*
            Method dump skipped, instructions count: 1717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem.C4(X.2kd):java.lang.Object");
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        EcVideoGuideVM r4 = r4();
        String aid = item.getAweme().getAid();
        o.LJIIIIZZ(aid, "item.aweme.aid");
        r4.getClass();
        r4.LJLIL = aid;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIIIILZ.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }

    @QD3(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onAnchorPanelAction(C53913LDx anchorPanelEvent) {
        long j;
        XKQ xkq;
        o.LJIIIZ(anchorPanelEvent, "anchorPanelEvent");
        if (!ECommerceAnchorService.LJJJJI().LJJJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || !C52933Kq1.LIZ() || o.LJ(anchorPanelEvent.LJLIL.LIZJ, Boolean.TRUE)) {
            return;
        }
        String str = anchorPanelEvent.LJLIL.LIZ;
        if (!this.LLIIIL || !C78685UuP.LJJJZ(str) || !o.LJ(str, r4().LJLIL)) {
            return;
        }
        int i = LE3.LIZ[anchorPanelEvent.LJLILLLLZI.ordinal()];
        String str2 = "";
        if (i != 1) {
            if (i != 2) {
                return;
            }
            EcVideoGuideVM r4 = r4();
            C56141M1p anchorParams = anchorPanelEvent.LJLIL;
            r4.getClass();
            o.LJIIIZ(anchorParams, "anchorParams");
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("stage", EnumC55950Lxa.ANCHOR_PANEL_HIDE.getValue());
            String str3 = anchorParams.LIZ;
            if (str3 != null) {
                str2 = str3;
            }
            oszArr[1] = new OSZ("video_id", str2);
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            Map<String, Object> map = anchorParams.LJIIJ;
            if (map != null) {
                LJJLIIIIJ.putAll(map);
            }
            b.LJJIJIIJI("rd_tiktokec_shop_video_guide", LJJLIIIIJ);
            C56144M1s c56144M1s = r4.LJLJLJ;
            if (c56144M1s == null) {
                return;
            }
            if (c56144M1s.LJIIIIZZ) {
                C55951Lxb.LIZIZ(anchorParams, EnumC56143M1r.ANCHOR_PANEL_HIDE_HANDLED.getValue());
                return;
            }
            c56144M1s.LJ = false;
            c56144M1s.LJIIIIZZ = true;
            C78565UsT.LJJIJIIJI(r4, C78613UtF.LIZJ, new C56136M1k(r4, anchorParams, c56144M1s, null));
            return;
        }
        EcVideoGuideVM r42 = r4();
        C56141M1p anchorParams2 = anchorPanelEvent.LJLIL;
        r42.getClass();
        o.LJIIIZ(anchorParams2, "anchorParams");
        OSZ[] oszArr2 = new OSZ[2];
        oszArr2[0] = new OSZ("stage", EnumC55950Lxa.ANCHOR_PANEL_SHOW.getValue());
        String str4 = anchorParams2.LIZ;
        if (str4 != null) {
            str2 = str4;
        }
        oszArr2[1] = new OSZ("video_id", str2);
        Map LJJLIIIIJ2 = C113554cx.LJJLIIIIJ(oszArr2);
        Map<String, Object> map2 = anchorParams2.LJIIJ;
        if (map2 != null) {
            LJJLIIIIJ2.putAll(map2);
        }
        b.LJJIJIIJI("rd_tiktokec_shop_video_guide", LJJLIIIIJ2);
        C56144M1s c56144M1s2 = r42.LJLJLJ;
        if (c56144M1s2 != null && (c56144M1s2.LJI || c56144M1s2.LJFF)) {
            return;
        }
        String str5 = anchorParams2.LIZ;
        C56144M1s c56144M1s3 = new C56144M1s();
        if (c56144M1s2 != null) {
            j = c56144M1s2.LIZ;
        } else {
            j = 0;
        }
        c56144M1s3.LIZ = j + 1;
        c56144M1s3.LIZIZ = str5;
        c56144M1s3.LJ = true;
        r42.LJLJLJ = c56144M1s3;
        if (c56144M1s2 != null && (xkq = c56144M1s2.LIZJ) != null) {
            xkq.LIZIZ(null);
        }
        c56144M1s3.LIZJ = C78565UsT.LJJIJIIJI(r42, C78613UtF.LIZJ, new ECL(anchorParams2, c56144M1s3, r42, c56144M1s2, null));
    }

    @QD3
    public final void onClickProfile(C224498rV event) {
        int i;
        o.LJIIIZ(event, "event");
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().productRecallType != 4) {
            int i2 = event.LJLIL;
            Context context = getContext();
            if (context != null) {
                i = context.hashCode();
            } else {
                i = 0;
            }
            if (i2 == i) {
                C38891fp.LJJIIJ(new OSZ(2, 4), this.LLIIL);
            }
        }
    }

    @QD3(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onEcOrderSubmitEvent(IKB ecOrderSubmitEvent) {
        C56144M1s c56144M1s;
        C56144M1s c56144M1s2;
        o.LJIIIZ(ecOrderSubmitEvent, "ecOrderSubmitEvent");
        if (!ECommerceAnchorService.LJJJJI().LJJJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || !C52933Kq1.LIZ() || ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().isAd() || (c56144M1s = r4().LJLJLJ) == null || !c56144M1s.LJ || (c56144M1s2 = r4().LJLJLJ) == null) {
            return;
        }
        c56144M1s2.LJFF = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0110, code lost:
    
        if (r1 == true) goto L16;
     */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        o.LJIIIZ(to, "to");
        if (this.LLIIIJ) {
            A4(o.LJ(to, "For You"));
        }
    }

    public final void q4(EnumC56033Lyv enumC56033Lyv, int i) {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.cl3);
        if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 0) {
            C1DH.LJJIJIIJI(new ARunnableS12S0201000_9(i, enumC56033Lyv, this, 1));
        }
    }

    public final void z4(C56142M1q c56142M1q, String str) {
        try {
            if (getContext() == null) {
                return;
            }
            if (C78685UuP.LJJJZ(c56142M1q.LIZ)) {
                Uri parse = UriProtector.parse(c56142M1q.LIZ);
                o.LJIIIIZZ(parse, "Uri.parse(this)");
                String builder = C45804HyK.LIZIZ(parse, new OSZ("previous_page", c56142M1q.LIZIZ), new OSZ("mall_extra_info", c56142M1q.LIZJ), new OSZ("diversion_params", c56142M1q.LIZLLL), new OSZ("suggest_guide_request_params", c56142M1q.LJ), new OSZ("diversion_config", c56142M1q.LJFF), new OSZ("enter_method", str)).toString();
                o.LJIIIIZZ(builder, "paramsForMall.schema.toU…             ).toString()");
                IECommerceMallService v3 = ECommerceMallService.v3();
                if (c56142M1q.LJI) {
                    v3.h();
                    v3.D0("video");
                    v3.L(c56142M1q.LJII);
                } else {
                    v3.D0(null);
                    v3.L(null);
                }
                v3.t3(null);
                SmartRouter.buildRoute(getContext(), builder).open();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void B4(C56140M1o c56140M1o, int i, String str) {
        try {
            LXS LIZ = LXU.LIZ();
            if (LIZ != null && true != LIZ.LIZ) {
                LIZ.LIZ = true;
                C2U8.LIZ(new C2L0());
            }
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.cl7);
            if (tuxTextView != null) {
                tuxTextView.setText(c56140M1o.LIZ);
            }
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.cl2);
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c56140M1o.LIZIZ);
            }
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.cl6);
            if (tuxTextView3 != null) {
                tuxTextView3.setText(c56140M1o.LIZJ);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.cl3);
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS27S0101000_9(this, i, 0));
            }
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.cl1);
            if (frameLayout != null) {
                C16880lQ.LJIILJJIL(frameLayout, new ViewOnClickListenerC56138M1m(this, i, c56140M1o, str));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.cl3);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            b.LJJIJIIJI("tiktokec_mall_entrance_show", c56140M1o.LIZLLL);
            C2U8.LIZ(new C55937LxN(LE4.SHOW));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u4(int r12, int r13, int r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.ECQ
            r8 = r11
            if (r0 == 0) goto L57
            r4 = r3
            X.ECQ r4 = (X.ECQ) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LJLJI = r2
        L15:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L40
            if (r1 != r0) goto L5d
            X.C141335gf.LIZJ(r3)
        L23:
            X.Pbt r3 = (X.C64797Pbt) r3
            if (r3 == 0) goto L3e
            T r0 = r3.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L3e
            T r0 = r0.data
            com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse r0 = (com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse) r0
            if (r0 == 0) goto L3e
            java.util.List r0 = r0.getReachConfigList()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
        L3d:
            return r0
        L3e:
            r0 = 0
            goto L3d
        L40:
            X.C141335gf.LIZJ(r3)
            X.ECM r5 = new X.ECM
            r10 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LJLJI = r0
            java.lang.String r0 = "homepage_hot"
            java.lang.Object r3 = X.C36669EaH.LIZLLL(r0, r15, r5, r4)
            if (r3 != r2) goto L23
            return r2
        L57:
            X.ECQ r4 = new X.ECQ
            r4.<init>(r8, r3)
            goto L15
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem.u4(int, int, int, java.util.Map, X.2kd):java.lang.Object");
    }
}
