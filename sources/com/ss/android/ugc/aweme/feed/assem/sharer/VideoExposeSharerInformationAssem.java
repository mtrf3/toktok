package com.ss.android.ugc.aweme.feed.assem.sharer;

import X.AnonymousClass391;
import X.C105784De;
import X.C110614Vt;
import X.C16880lQ;
import X.C1FJ;
import X.C2068389v;
import X.C213688a4;
import X.C214348b8;
import X.C221018lt;
import X.C221108m2;
import X.C221148m6;
import X.C221158m7;
import X.C221188mA;
import X.C221208mC;
import X.C221218mD;
import X.C221228mE;
import X.C221238mF;
import X.C221248mG;
import X.C221258mH;
import X.C221298mL;
import X.C221308mM;
import X.C221418mX;
import X.C221518mh;
import X.C221538mj;
import X.C221558ml;
import X.C240999d1;
import X.C26338AVi;
import X.C32151Nz;
import X.C47261Igj;
import X.C4XV;
import X.C5H3;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77266UUc;
import X.C7MY;
import X.C8YN;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC51691KQl;
import X.InterfaceC74236TBo;
import X.JBR;
import X.KNV;
import X.O6R;
import X.SY4;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.ACListenerS42S1100000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoExposeSharerInformationAssem extends BaseCellSlotComponent<VideoExposeSharerInformationAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final C62822Ol8 LLI;

    static {
        TBT tbt = new TBT(VideoExposeSharerInformationAssem.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8mW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLIL;
            }
        }, null, C221258mH.LJLIL, 6);
        C8YN.LJIIJ(this, q4(), new TBT() { // from class: X.8mU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.8mS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLJI;
            }
        }, null, C221238mF.INSTANCE, 12);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8mQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C221298mL) obj).LJLJLJ);
            }
        }, null, C221218mD.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8mV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLJJLL;
            }
        }, null, C221228mE.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8mK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C221298mL) obj).LJLJL);
            }
        }, null, C221208mC.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8mT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLJJI;
            }
        }, C213688a4.LIZJ(), C221308mM.LJLIL, 4);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8mR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLJJL;
            }
        }, C213688a4.LIZJ(), C221248mG.LJLIL, 4);
        if (C221518mh.LIZ()) {
            C8YN.LJII(this, q4(), new TBT() { // from class: X.8mJ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C221298mL) obj).LJLL);
                }
            }, C213688a4.LIZJ(), C221418mX.LJLIL, 4);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.boa;
    }

    public VideoExposeSharerInformationAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoExposeSharerInformationVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 368), null, C221148m6.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C221158m7.INSTANCE);
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 367));
    }

    public final VideoExposeSharerInformationVM q4() {
        return (VideoExposeSharerInformationVM) this.LLFII.LIZ(this, LLIFFJFJJ[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        q4().LJLJLLL.LIZIZ(VideoExposeSharerInformationVM.LJLLJ[0], null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        n4();
    }

    public static void r4(View view) {
        view.setAlpha(1.0f);
        view.setClickable(true);
        view.setTranslationY(0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        int i;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        boolean z = ((C221298mL) q4().getState()).LJLJLLL;
        StringBuilder LJI = JBR.LJI("bind view visible:", z, ", aid:");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LJI.append(str);
        LJI.append(" vm: ");
        LJI.append(q4().hashCode());
        C221018lt.LJFF("@LinkRelation_Video_Assem", X1D.LIZIZ(LJI));
        View Y3 = Y3();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        Y3.setVisibility(i);
        q4().tv0(0, R.attr.cl, false);
        VideoExposeSharerInformationVM q4 = q4();
        if (q4.LJLL == null) {
            InterfaceC51691KQl followPresenter = C77266UUc.LIZIZ.getFollowPresenter();
            q4.LJLL = followPresenter;
            if (followPresenter != null) {
                followPresenter.LJIIIIZZ(q4);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        boolean z;
        User sharer;
        String uid;
        o.LJIIIZ(item, "item");
        VideoExposeSharerInformationVM.LJLLILLLL.getClass();
        Aweme aweme = item.getAweme();
        String str = null;
        if (aweme == null || (sharer = aweme.getSharer()) == null || (uid = sharer.getUid()) == null) {
            z = false;
        } else {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (LJIILL != null) {
                str = LJIILL.getCurUserId();
            }
            z = !o.LJ(uid, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recycle view, is Active:");
        LIZ.append(z);
        C221018lt.LJFF("@LinkRelation_Video_Assem", X1D.LIZIZ(LIZ));
        return z;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        getContainerView().post(new ARunnableS39S0100000_3(this, 73));
        if (((Boolean) C221538mj.LIZ.getValue()).booleanValue()) {
            view.findViewById(R.id.d25).setBackground(view.getContext().getDrawable(R.drawable.aht));
            View sharer_avatar = view.findViewById(R.id.jvp);
            o.LJIIIIZZ(sharer_avatar, "sharer_avatar");
            C26338AVi.LJI(sharer_avatar, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), C1FJ.LIZIZ(6), null, C1FJ.LIZIZ(6), false, 20);
            View findViewById = view.findViewById(R.id.jvp);
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.jvp).getLayoutParams();
            layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
            layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
            findViewById.setLayoutParams(layoutParams);
            View tv_sharer_name = view.findViewById(R.id.mjx);
            o.LJIIIIZZ(tv_sharer_name, "tv_sharer_name");
            C26338AVi.LJI(tv_sharer_name, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), KNV.LIZIZ(4.5d), C1FJ.LIZIZ(8), null, false, 24);
            View tv_sharing_text = view.findViewById(R.id.mjy);
            o.LJIIIIZZ(tv_sharing_text, "tv_sharing_text");
            C26338AVi.LJI(tv_sharing_text, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(4.5d)))), false, 23);
            ((TextView) view.findViewById(R.id.mjy)).setMaxLines(1);
            TuxTextView onViewCreated$lambda$3$lambda$2 = (TuxTextView) view.findViewById(R.id.m71);
            o.LJIIIIZZ(onViewCreated$lambda$3$lambda$2, "onViewCreated$lambda$3$lambda$2");
            C26338AVi.LJI(onViewCreated$lambda$3$lambda$2, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, false, 27);
            ViewGroup.LayoutParams layoutParams2 = onViewCreated$lambda$3$lambda$2.findViewById(R.id.m71).getLayoutParams();
            layoutParams2.width = -2;
            onViewCreated$lambda$3$lambda$2.setLayoutParams(layoutParams2);
            onViewCreated$lambda$3$lambda$2.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
            onViewCreated$lambda$3$lambda$2.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(84)));
            onViewCreated$lambda$3$lambda$2.setTuxFont(62);
            View my_arrow = view.findViewById(R.id.gvf);
            o.LJIIIIZZ(my_arrow, "my_arrow");
            C26338AVi.LJI(my_arrow, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, false, 27);
        }
        C16880lQ.LJJIZ((SY4) view.findViewById(R.id.m71), new ACListenerS38S0200000_3(this, view, 35));
        C16880lQ.LJIJ((RelativeLayout) Y3().findViewById(R.id.d25), new ACListenerS23S0100000_3(this, 72));
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8mI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLJ;
            }
        }, null, C221188mA.LJLIL, 6);
        if (!C221518mh.LIZ()) {
            return;
        }
        int i = 0;
        if (((Boolean) C221558ml.LIZ.getValue()).booleanValue()) {
            View quick_reply_box = view.findViewById(R.id.il5);
            o.LJIIIIZZ(quick_reply_box, "quick_reply_box");
            C26338AVi.LJI(quick_reply_box, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, false, 29);
            View quick_reply_box2 = view.findViewById(R.id.il5);
            o.LJIIIIZZ(quick_reply_box2, "quick_reply_box");
            z4(quick_reply_box2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))));
            View findViewById2 = view.findViewById(R.id.il5);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(20);
            c110614Vt.LJFF = Integer.valueOf(R.attr.dm);
            c110614Vt.LIZLLL = C1FJ.LIZIZ(1);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            findViewById2.setBackground(c110614Vt.LIZ(context));
            ((AppCompatTextView) view.findViewById(R.id.ctu)).setTextSize(1, 24.0f);
            ((AppCompatTextView) view.findViewById(R.id.ctv)).setTextSize(1, 24.0f);
            View emoji_container = view.findViewById(R.id.cu7);
            o.LJIIIIZZ(emoji_container, "emoji_container");
            C26338AVi.LJI(emoji_container, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, AnonymousClass391.LIZJ(16), null, false, 26);
            View quick_reply_hint = view.findViewById(R.id.il7);
            o.LJIIIIZZ(quick_reply_hint, "quick_reply_hint");
            C26338AVi.LJI(quick_reply_hint, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), null, null, null, false, 30);
            C105784De initQuickReply$lambda$21$lambda$19 = (C105784De) view.findViewById(R.id.il6);
            o.LJIIIIZZ(initQuickReply$lambda$21$lambda$19, "initQuickReply$lambda$21$lambda$19");
            z4(initQuickReply$lambda$21$lambda$19, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
            initQuickReply$lambda$21$lambda$19.setIconSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
            View findViewById3 = initQuickReply$lambda$21$lambda$19.findViewById(R.id.abh);
            o.LJIIIIZZ(findViewById3, "findViewById<View>(R.id.avatar)");
            C26338AVi.LJI(findViewById3, 0, 0, 0, 0, false, 16);
            initQuickReply$lambda$21$lambda$19.setHollow(false);
            C26338AVi.LJI(initQuickReply$lambda$21$lambda$19, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), AnonymousClass391.LIZJ(4), AnonymousClass391.LIZJ(4), AnonymousClass391.LIZJ(4), false, 16);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            c2068389v.LIZ = R.raw.icon_paperplane_fill;
            c2068389v.LIZIZ = C7MY.LIZIZ(10);
            c2068389v.LIZJ = C7MY.LIZIZ(10);
            initQuickReply$lambda$21$lambda$19.setTuxIcon(c2068389v);
            initQuickReply$lambda$21$lambda$19.findViewById(R.id.e_q).setTranslationY(C32151Nz.LJIIZILJ(1));
            initQuickReply$lambda$21$lambda$19.setIconBackgroundSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LJII = C7MY.LIZIZ(14);
            c110614Vt2.LJI = C7MY.LIZIZ(14);
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.dj);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(7);
            initQuickReply$lambda$21$lambda$19.setIconBackground(c110614Vt2);
        } else {
            View quick_reply_box3 = view.findViewById(R.id.il5);
            o.LJIIIIZZ(quick_reply_box3, "quick_reply_box");
            C26338AVi.LJI(quick_reply_box3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
            View findViewById4 = view.findViewById(R.id.il5);
            C110614Vt c110614Vt3 = new C110614Vt();
            c110614Vt3.LIZJ = C61328O5c.LIZJ(24);
            c110614Vt3.LIZIZ = Integer.valueOf(R.attr.d1);
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            findViewById4.setBackground(c110614Vt3.LIZ(context2));
            View quick_reply_header = view.findViewById(R.id.il6);
            o.LJIIIIZZ(quick_reply_header, "quick_reply_header");
            C26338AVi.LJI(quick_reply_header, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))), AnonymousClass391.LIZJ(2), AnonymousClass391.LIZJ(2), AnonymousClass391.LIZJ(2), false, 16);
            ((C105784De) view.findViewById(R.id.il6)).setIconRes(R.raw.icon_color_paperplane_circle);
        }
        view.findViewById(R.id.il6).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 200)));
        C16880lQ.LJIJ((RelativeLayout) view.findViewById(R.id.il5), new ACListenerS23S0100000_3(this, 201));
        for (String str : C4XV.LIZ()) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    ((TextView) view.findViewById(R.id.ctv)).setText(str2);
                    C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.ctv), new ACListenerS42S1100000_3(this, str2, 4));
                } else {
                    ((TextView) view.findViewById(R.id.ctu)).setText(str2);
                    C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.ctu), new ACListenerS42S1100000_3(this, str2, 3));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoExposeSharerInformationVM q4 = q4();
        q4.LJLJLLL.LIZIZ(VideoExposeSharerInformationVM.LJLLJ[0], getContext());
    }

    public final void u4(int i, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        View findViewById = Y3().findViewById(R.id.mjx);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (findViewById != null) {
            layoutParams2 = findViewById.getLayoutParams();
        }
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.setMarginEnd(i);
            if (z) {
                View findViewById2 = Y3().findViewById(R.id.gvf);
                if (findViewById2 != null) {
                    layoutParams.addRule(16, findViewById2.getId());
                }
            } else {
                View findViewById3 = Y3().findViewById(R.id.m71);
                if (findViewById3 != null) {
                    layoutParams.addRule(16, findViewById3.getId());
                }
            }
            View findViewById4 = Y3().findViewById(R.id.mjx);
            if (findViewById4 == null) {
                return;
            }
            findViewById4.setLayoutParams(layoutParams);
        }
    }

    public static void z4(View view, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            num.intValue();
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
            layoutParams.height = num2.intValue();
        }
        view.setLayoutParams(layoutParams);
    }
}
