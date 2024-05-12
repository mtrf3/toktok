package com.ss.android.ugc.aweme.utils;

import X.C113554cx;
import X.C16880lQ;
import X.C178456zR;
import X.C188727au;
import X.C27740Aue;
import X.C40925G4j;
import X.C55954Lxe;
import X.C56045Lz7;
import X.C56501MFl;
import X.C56502MFm;
import X.C65661Ppp;
import X.C74181T9l;
import X.C78450Uqc;
import X.FMX;
import X.HT5;
import X.InterfaceC65895Ptb;
import X.MBR;
import X.OSZ;
import X.TAT;
import Y.IDeS355S0100000_9;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCell;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCellNew;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class Au2S17S0200000_9 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S17S0200000_9 au2S17S0200000_9, View view) {
        if (view != null) {
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("button_name", ((C55954Lxe) au2S17S0200000_9.l0).LJLIL.getButtonName()), new OSZ("actionsheet_name", "mall_tools"), new OSZ("page_struc_type", "tools_in"), new OSZ("item_order", String.valueOf(((ToolEntryCell) au2S17S0200000_9.l1).getAbsoluteAdapterPosition() + 1)));
            if (((TuxAlertBadgeLayout) ((ToolEntryCell) au2S17S0200000_9.l1).itemView.findViewById(R.id.lca)).LJLJL) {
                LJJLIIIIJ.put("notice_number", "");
                LJJLIIIIJ.put("notice_type", "red_dot");
            }
            C56045Lz7.LIZ.getClass();
            C56045Lz7.LIZLLL(LJJLIIIIJ);
            ToolEntryCell toolEntryCell = (ToolEntryCell) au2S17S0200000_9.l1;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9((ToolEntryCell) au2S17S0200000_9.l1, (C55954Lxe) au2S17S0200000_9.l0, 82);
            toolEntryCell.getClass();
            IAccountService LJIJ = AccountService.LJIJ();
            if (!LJIJ.LJFF().isLogin()) {
                InterfaceC65895Ptb LJI = LJIJ.LJI();
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = C27740Aue.LIZ(context);
                c78450Uqc.LJ = new IDeS355S0100000_9(aqS156S0200000_9, 1);
                C40925G4j.LIZ(c78450Uqc, LJI);
                return;
            }
            aqS156S0200000_9.invoke();
        }
    }

    public static final void LIZ$1(Au2S17S0200000_9 au2S17S0200000_9, View view) {
        if (view != null) {
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("button_name", ((C55954Lxe) au2S17S0200000_9.l0).LJLIL.getButtonName()), new OSZ("page_struc_type", "tools_out"), new OSZ("item_order", String.valueOf(((ToolEntryCellNew) au2S17S0200000_9.l1).getAbsoluteAdapterPosition() + 1)));
            if (((TuxAlertBadgeLayout) ((ToolEntryCellNew) au2S17S0200000_9.l1).itemView.findViewById(R.id.lca)).LJLJL) {
                LJJLIIIIJ.put("notice_number", "");
                LJJLIIIIJ.put("notice_type", "red_dot");
            }
            C56045Lz7.LIZ.getClass();
            C56045Lz7.LIZLLL(LJJLIIIIJ);
            Uri.Builder buildUpon = UriProtector.parse(((C55954Lxe) au2S17S0200000_9.l0).LJLIL.getLink()).buildUpon();
            buildUpon.appendQueryParameter("click_time", String.valueOf(SystemClock.elapsedRealtime()));
            ToolEntryVO toolEntryVO = ((C55954Lxe) au2S17S0200000_9.l0).LJLIL;
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            toolEntryVO.setLink(builder);
            ToolEntryCellNew toolEntryCellNew = (ToolEntryCellNew) au2S17S0200000_9.l1;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9((ToolEntryCellNew) au2S17S0200000_9.l1, (C55954Lxe) au2S17S0200000_9.l0, 83);
            toolEntryCellNew.getClass();
            IAccountService LJIJ = AccountService.LJIJ();
            if (!LJIJ.LJFF().isLogin()) {
                InterfaceC65895Ptb LJI = LJIJ.LJI();
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = C27740Aue.LIZ(context);
                c78450Uqc.LJ = new IDeS355S0100000_9(aqS156S0200000_9, 2);
                C40925G4j.LIZ(c78450Uqc, LJI);
                return;
            }
            aqS156S0200000_9.invoke();
        }
    }

    public static final void LIZ$2(Au2S17S0200000_9 au2S17S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        Context context = ((C56502MFm) au2S17S0200000_9.l0).itemView.getContext();
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) au2S17S0200000_9.l1;
        String str = newFaceStickerBean.id;
        C188727au c188727au = new C188727au();
        if (!TextUtils.isEmpty("")) {
            c188727au.LJI("tab_name", "");
        }
        c188727au.LJIIIZ("enter_from", "collection_prop");
        c188727au.LJIIIZ("content", "prop");
        c188727au.LJIIIZ("prop_id", str);
        FMX.LJIIL("click_personal_collection", c188727au.LIZ);
        String str2 = newFaceStickerBean.id;
        LogPbBean logPbBean = newFaceStickerBean.logPbBean;
        C188727au c188727au2 = new C188727au();
        if (!TextUtils.isEmpty("")) {
            c188727au2.LJI("tab_name", "");
        }
        c188727au2.LJIIIZ("enter_from", "collection_prop");
        c188727au2.LJIIIZ("enter_method", "click_collection_prop");
        c188727au2.LJIIIZ("prop_id", str2);
        c188727au2.LJFF(logPbBean, "log_pb");
        FMX.LJIIL("enter_prop_detail", c188727au2.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://stickers/detail");
        buildRoute.withParam("extra_stickers", C65661Ppp.LIZIZ(newFaceStickerBean.id));
        buildRoute.open();
        HT5.LIZ = true;
    }

    public static final void LIZ$3(Au2S17S0200000_9 au2S17S0200000_9, View v) {
        List<String> LIZIZ;
        o.LJIIIZ(v, "v");
        Context context = v.getContext();
        if (context != null && MSAdaptionService.LJIIL().LJI(context)) {
            C16880lQ.LLZILL(Toast.makeText(context, context.getString(R.string.f1i), 0));
            return;
        }
        FaceStickerBean.sCurPropSource = "favorite_prop";
        MBR mbr = new MBR();
        mbr.LIZIZ = "prop_page";
        mbr.LIZLLL = "prop_auto";
        mbr.LJFF = "prop_collection";
        mbr.LJIIL = new C56501MFl();
        C74181T9l LIZ = mbr.LIZ();
        List<String> list = ((NewFaceStickerBean) au2S17S0200000_9.l0).children;
        if (list != null && !list.isEmpty()) {
            LIZIZ = ((NewFaceStickerBean) au2S17S0200000_9.l0).children;
            o.LJIIIIZZ(LIZIZ, "{\n                    //…hildren\n                }");
        } else {
            LIZIZ = C65661Ppp.LIZIZ(((NewFaceStickerBean) au2S17S0200000_9.l0).id);
        }
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        IPropReuseService LJIIJ = PropReuseServiceImpl.LJIIJ();
        Context context2 = ((C56502MFm) au2S17S0200000_9.l1).LJLJJLL.getContext();
        o.LJIIIIZZ(context2, "ivRecord.context");
        LJIIJ.LJFF(context2, LIZIZ, LIZ, downloadEffectOrMusicAfterEnterCamera);
        String str = ((NewFaceStickerBean) au2S17S0200000_9.l0).id;
        String LIZIZ2 = C178456zR.LIZIZ(2);
        C188727au LIZ2 = C178456zR.LIZ("prop", "collection_prop");
        LIZ2.LJIIIZ("prop_id", str);
        FMX.LJIIL(LIZIZ2, LIZ2.LIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S17S0200000_9(X.C56502MFm r2, com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S17S0200000_9.<init>(X.MFm, com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S17S0200000_9(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
