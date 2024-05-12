package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C191867fy;
import X.C199097rd;
import X.C214348b8;
import X.C26045AKb;
import X.C2TZ;
import X.C2U8;
import X.C45804HyK;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C72818Shy;
import X.C76800UCe;
import X.C7MY;
import X.C86V;
import X.C8RC;
import X.C8RD;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC74236TBo;
import X.InterfaceC78280Uns;
import X.TBT;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.X1D;
import Y.ACListenerS25S1200000_3;
import Y.ARunnableS1S1300000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiWriteReviewBottomBarAssem extends BaseCellSlotComponent<PoiWriteReviewBottomBarAssem> implements InterfaceC72822Si2 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public TuxTextView LLFII;
    public FrameLayout LLFZ;
    public final InterfaceC115514g7 LLI;
    public VideoItemParams LLIFFJFJJ;
    public InterfaceC65784Pro<C76800UCe> LLII;

    static {
        TBT tbt = new TBT(PoiWriteReviewBottomBarAssem.class, "reviewVm", "getReviewVm()Lcom/ss/android/ugc/feed/platform/cell/interact/bottom/bar/PoiWriteReviewViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ady;
    }

    public PoiWriteReviewBottomBarAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiWriteReviewViewModel.class);
        this.LLI = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1271), null, C8RD.INSTANCE, null, null);
    }

    public final void mp0() {
        Y3().setVisibility(8);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLII;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLIFFJFJJ = item;
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C8RC.LIZJ(aweme, item.mEventType)) {
            Aweme aweme2 = item.getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            String str = item.mEventType;
            if (Y3().getVisibility() != 0) {
                Y3().setVisibility(0);
            }
            TuxTextView tuxTextView = this.LLFII;
            if (tuxTextView != null) {
                FrameLayout frameLayout = this.LLFZ;
                if (frameLayout != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C86V.LJFF(R.string.p1q));
                    LIZ.append(' ');
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C68322mC c68322mC = new C68322mC();
                    c68322mC.element = C86V.LJFF(R.string.p1t);
                    ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(tuxTextView, new ARunnableS1S1300000_1(tuxTextView, tuxTextView, LIZIZ, c68322mC, 1));
                    C16880lQ.LJIILJJIL(frameLayout, new ACListenerS25S1200000_3(aweme2, this, str, 12));
                    C16880lQ.LJIIJ(new ACListenerS25S1200000_3(aweme2, this, str, 11), Y3());
                    return;
                }
                o.LJIJI("poiWriteReviewCloseLayout");
                throw null;
            }
            o.LJIJI("poiWriteReviewTitleTv");
            throw null;
        }
        mp0();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Aweme aweme;
        String poiId;
        if (o.LJ(c199097rd.LJLIL, "closeReviewSubmitPage")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            Boolean bool = null;
            if (interfaceC78280Uns != null) {
                bool = Boolean.valueOf(u.LJJIIZI(interfaceC78280Uns, "isSubmitReviewSuccess", false));
            }
            C72818Shy.LJII("closeReviewSubmitPage", this);
            if (o.LJ(bool, Boolean.TRUE)) {
                Context context = Y3().getContext();
                o.LJIIIIZZ(context, "contentView.context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI == null || LJJIFFI.isDestroyed()) {
                    return;
                }
                mp0();
                VideoItemParams videoItemParams = this.LLIFFJFJJ;
                if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                    PoiAnchorData.Companion.getClass();
                    PoiAnchorData LIZ = C191867fy.LIZ(aweme);
                    if (LIZ != null && (poiId = LIZ.getPoiId()) != null) {
                        C2U8.LIZ(new C2TZ(poiId));
                    }
                }
                C26045AKb c26045AKb = new C26045AKb(LJJIFFI);
                c26045AKb.LJIIIIZZ(R.string.tj9);
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LJIIJ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLFII = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.hvj, "contentView.findViewById…oi_write_review_title_tv)");
        View findViewById = view.findViewById(R.id.hvg);
        o.LJIIIIZZ(findViewById, "contentView.findViewById…rite_review_close_layout)");
        this.LLFZ = (FrameLayout) findViewById;
        this.LLII = new AqS153S0100000_3(this, 1270);
    }
}
