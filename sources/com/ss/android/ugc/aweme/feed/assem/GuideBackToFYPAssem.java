package com.ss.android.ugc.aweme.feed.assem;

import X.C110614Vt;
import X.C16880lQ;
import X.C213688a4;
import X.C214348b8;
import X.C221018lt;
import X.C221108m2;
import X.C224948sE;
import X.C224958sF;
import X.C224968sG;
import X.C224978sH;
import X.C224988sI;
import X.C26338AVi;
import X.C29701Eo;
import X.C32151Nz;
import X.C53295Kvr;
import X.C5H3;
import X.C61328O5c;
import X.C61447O9r;
import X.C65352Pkq;
import X.C8YN;
import X.FMX;
import X.LFH;
import X.LJK;
import X.LXS;
import X.LXU;
import X.O6R;
import X.OSZ;
import X.QD3;
import X.TBT;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class GuideBackToFYPAssem extends FeedBaseAssem<GuideBackToFYPAssem> {
    public static String LLI = "default";
    public final C5H3 LLFFF;
    public C29701Eo LLFII;
    public TuxIconView LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.avr;
    }

    public GuideBackToFYPAssem() {
        new LinkedHashMap();
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C224958sF.INSTANCE);
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 277));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final void unBind() {
        EventBus.LIZJ().LJIJ(this);
    }

    public static void q4(String str) {
        OSZ osz;
        if (str.length() > 0) {
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ(str, "action_type");
            oszArr[1] = new OSZ("homepage_follow", "enter_from");
            oszArr[2] = new OSZ("read_all", "enter_method");
            if (C53295Kvr.LIZJ()) {
                osz = new OSZ(1, "is_top_tab");
            } else {
                osz = new OSZ(0, "is_top_tab");
            }
            oszArr[3] = osz;
            FMX.LJIILL("homepage_return_guide", oszArr);
        }
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        EventBus.LIZJ().LJIILJJIL(this);
        String aid = item.getAweme().getAid();
        o.LJIIIIZZ(aid, "item.aweme.aid");
        if (!C224948sE.LIZ(aid)) {
            getContainerView().setVisibility(8);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on bind item: ");
        LIZ.append(item.getAweme().getAid());
        LIZ.append('!');
        C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ));
    }

    @QD3
    public final void onRefreshEvent(LJK event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 9) {
            p4("");
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        o.LJIIIZ(view, "view");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.e0s);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(42);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        linearLayout.setBackground(c110614Vt.LIZ(context));
        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS23S0100000_3(this, 231));
        ((TextView) view.findViewById(R.id.e1b)).setMaxLines(1);
        C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.a89);
        c29701Eo.setRepeatCount(-1);
        c29701Eo.post(new ARunnableS37S0100000_1(c29701Eo, 82));
        this.LLFII = c29701Eo;
        this.LLFZ = (TuxIconView) view.findViewById(R.id.ey4);
        if (C53295Kvr.LIZIZ() && (tuxIconView = this.LLFZ) != null) {
            tuxIconView.setIconRes(R.raw.icon_arrow_left_ltr);
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 232), getContainerView());
        if (C61447O9r.LJIIIZ || LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() != 0) {
            C26338AVi.LJIIIZ(Y3(), null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C61447O9r.LJIIJ)))), 23);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8sJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C224968sG.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8sK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C224988sI.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.85Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZ;
            }
        }, C213688a4.LIZLLL(), C224978sH.LJLIL, 4);
    }

    public final void p4(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dismissGuide ");
        LIZ.append(str);
        LIZ.append(" 1");
        C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ));
        LXS LIZ2 = LXU.LIZ();
        if (LIZ2 != null && LIZ2.LIZIZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("dismissGuide ");
            LIZ3.append(str);
            LIZ3.append(" 2");
            C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ3));
            getContainerView().setVisibility(8);
            LLI = "default";
            C29701Eo c29701Eo = this.LLFII;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
            }
            LXS LIZ4 = LXU.LIZ();
            if (LIZ4 != null) {
                LIZ4.LIZJ(false);
            }
            q4(str);
            C221018lt.LJFF("GuideFYPAssem", "dismiss guide!");
        }
    }
}
