package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import X.AbstractC58851N7v;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C182957Fz;
import X.C221108m2;
import X.C58853N7x;
import X.C58854N7y;
import X.C59406NTe;
import X.C59948Nfs;
import X.C62822Ol8;
import X.C78609UtB;
import X.C78886Uxe;
import X.C78897Uxp;
import X.N50;
import X.N52;
import X.N7W;
import X.N7X;
import X.NIP;
import X.O5Y;
import Y.ACListenerS30S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TopVideoAdServiceImpl implements ITopVideoAdService {
    public static final /* synthetic */ int LJI = 0;
    public View LIZ;
    public View LIZIZ;
    public C58853N7x LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(N52.LJLIL);

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LJ() {
        if (this.LIZLLL == null) {
            return;
        }
        C58854N7y.LIZ.postDelayed(new ARunnableS46S0100000_10(this, 22), 500L);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LJFF() {
        if (this.LIZLLL == null) {
            return;
        }
        if (this.LJ) {
            C58854N7y.LIZ.postDelayed(new ARunnableS46S0100000_10(this, 23), 500L);
            this.LJ = false;
            return;
        }
        LJII(4);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LJLLL() {
        C58853N7x c58853N7x = this.LIZJ;
        if (c58853N7x != null) {
            c58853N7x.LIZJ();
        }
    }

    public final void LJII(int i) {
        View view = this.LIZLLL;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LIZIZ(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd) {
        C59948Nfs c59948Nfs;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.csa, viewGroup, true);
        this.LIZ = LLLLIILL;
        if (!(LLLLIILL instanceof ViewGroup)) {
            return;
        }
        if (LLLLIILL != null) {
            c59948Nfs = (C59948Nfs) LLLLIILL.findViewById(R.id.lgr);
        } else {
            c59948Nfs = null;
        }
        C182957Fz.LIZ(c59948Nfs, awemeRawAd);
        viewGroup.setVisibility(0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LIZLLL(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd) {
        View LLLLIILL;
        if (awemeRawAd == null || awemeRawAd.getSearchAdInfo() == null || viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        if (!O5Y.LJJJZ(awemeRawAd) && !O5Y.LJIILLIIL(awemeRawAd)) {
            return;
        }
        if (O5Y.LJIILLIIL(awemeRawAd)) {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.avo, viewGroup, true);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ceq, viewGroup, true);
        }
        this.LIZLLL = LLLLIILL;
        if (!(LLLLIILL instanceof ViewGroup)) {
            return;
        }
        LJII(4);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LIZ(ViewGroup viewGroup, Context context, Aweme aweme, ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        AwemeRawAd awemeRawAd;
        C58853N7x c58853N7x;
        Float f = null;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getSearchAdInfo() == null || viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        if (O5Y.LJIILLIIL(awemeRawAd) || !O5Y.LJJJZ(awemeRawAd)) {
            return;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.csb, viewGroup, true);
        this.LIZIZ = LLLLIILL;
        if (!(LLLLIILL instanceof ViewGroup)) {
            return;
        }
        if (LLLLIILL != null) {
            c58853N7x = (C58853N7x) LLLLIILL.findViewById(R.id.lgu);
        } else {
            c58853N7x = null;
        }
        this.LIZJ = c58853N7x;
        if (c58853N7x != null) {
            C78897Uxp.LJJJJJL(c58853N7x, 0.0f);
        }
        viewGroup.setVisibility(0);
        ((NIP) this.LJFF.getValue()).LJIILJJIL(2, awemeRawAd);
        C58853N7x c58853N7x2 = this.LIZJ;
        if (c58853N7x2 != null) {
            c58853N7x2.LIZIZ(aweme, aCListenerS30S0100000_10);
        }
        AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
        if (searchAdInfo != null) {
            f = searchAdInfo.getSingleBtnColorShowSeconds();
        }
        if (!o.LIZJ(f, 0.0f)) {
            return;
        }
        C58853N7x c58853N7x3 = this.LIZJ;
        if (c58853N7x3 != null) {
            c58853N7x3.LIZJ();
        }
        ((NIP) this.LJFF.getValue()).LJIILJJIL(3, awemeRawAd);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    public final void LIZJ(Aweme aweme, Context context, AqS160S0100000_10 aqS160S0100000_10, AqS160S0100000_10 aqS160S0100000_102) {
        AwemeRawAd awemeRawAd;
        View view;
        AbstractC58851N7v abstractC58851N7v;
        TuxTextView tuxTextView;
        AwemeSearchAdModel searchAdInfo;
        AwemeSearchAdModel searchAdInfo2;
        String searchAdTransformButtonColor;
        Drawable background;
        View view2 = this.LIZLLL;
        if (view2 == null) {
            return;
        }
        view2.setAlpha(0.0f);
        LJII(0);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        View view3 = this.LIZLLL;
        if (view3 != null) {
            view3.getAlpha();
            view3.animate().alpha(1.0f).setDuration(300L).start();
        }
        View view4 = this.LIZLLL;
        if (view4 != null) {
            view = view4.findViewById(R.id.jdu);
            if (view != null && (background = view.getBackground()) != null) {
                background.setAlpha(128);
            }
        } else {
            view = null;
        }
        if (context != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context));
            if (view != null) {
                view.setBackground(gradientDrawable);
            }
        }
        View view5 = this.LIZLLL;
        if (view5 != null) {
            abstractC58851N7v = (AbstractC58851N7v) view5.findViewById(R.id.jdw);
        } else {
            abstractC58851N7v = null;
        }
        View view6 = this.LIZLLL;
        if (view6 != null) {
            tuxTextView = (TuxTextView) view6.findViewById(R.id.jdy);
        } else {
            tuxTextView = null;
        }
        ACListenerS30S0100000_10 aCListenerS30S0100000_10 = new ACListenerS30S0100000_10(aqS160S0100000_10, 102);
        if (abstractC58851N7v != null) {
            abstractC58851N7v.LIZIZ(aweme, aCListenerS30S0100000_10);
        }
        if (awemeRawAd != null && (((searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdTransformButtonColor = searchAdInfo.getMaskBtnColor()) != null) || ((searchAdInfo2 = awemeRawAd.getSearchAdInfo()) != null && (searchAdTransformButtonColor = searchAdInfo2.getSearchAdTransformButtonColor()) != null))) {
            if (abstractC58851N7v != null) {
                abstractC58851N7v.setBackgroundColor(ColorProtector.parseColor(searchAdTransformButtonColor));
            }
        } else if (abstractC58851N7v != null) {
            abstractC58851N7v.setBackgroundColor(C78609UtB.LJJJ(R.attr.eb, context));
        }
        C78886Uxe.LJJLIL(abstractC58851N7v, N7W.LJLIL);
        C78886Uxe.LJJLIL(tuxTextView, N7X.LJLIL);
        if (abstractC58851N7v != null) {
            C78897Uxp.LJJJJJL(abstractC58851N7v, 0.0f);
        }
        if (tuxTextView != null) {
            C78897Uxp.LJJJJLI(tuxTextView, null);
        }
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(aqS160S0100000_102, 103), view);
        }
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS30S0100000_10(aqS160S0100000_102, 104));
        }
        N50.LJJIJL(awemeRawAd, C59406NTe.LJI(aweme));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r2 != null) goto L39;
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7, com.ss.android.ugc.aweme.profile.model.User r8, android.content.Context r9, kotlin.jvm.internal.AqS160S0100000_10 r10, kotlin.jvm.internal.AqS160S0100000_10 r11) {
        /*
            r6 = this;
            android.view.View r0 = r6.LIZLLL
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r3 = 1
            if (r8 == 0) goto L10
            int r0 = r8.getFollowerStatus()
            if (r0 != r3) goto L10
            return
        L10:
            r6.LJII(r1)
            android.view.View r1 = r6.LIZLLL
            r5 = 0
            if (r1 == 0) goto Lcc
            r0 = 2131367280(0x7f0a1570, float:1.8354477E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            if (r1 != 0) goto Lc5
        L27:
            if (r9 == 0) goto Lb7
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r0 = 2130968673(0x7f040061, float:1.7546006E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r9)
            r1.setColor(r0)
            if (r2 != 0) goto Lb3
        L3a:
            android.view.View r1 = r6.LIZLLL
            if (r1 == 0) goto Lb1
            r0 = 2131367279(0x7f0a156f, float:1.8354475E38)
            android.view.View r4 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r4 = (com.ss.android.ugc.aweme.relation.follow.ui.RelationButton) r4
        L47:
            android.view.View r1 = r6.LIZLLL
            if (r1 == 0) goto Laf
            r0 = 2131367281(0x7f0a1571, float:1.835448E38)
            android.view.View r2 = r1.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r2 = (com.bytedance.tux.input.TuxTextView) r2
        L54:
            X.N7U r0 = X.N7U.LJLIL
            X.C78886Uxe.LJJLIL(r4, r0)
            X.N7V r0 = X.N7V.LJLIL
            X.C78886Uxe.LJJLIL(r2, r0)
            if (r4 == 0) goto L67
            r0 = 0
            X.C78897Uxp.LJJJJJL(r4, r0)
            X.C78897Uxp.LJJJJLI(r4, r5)
        L67:
            X.8v0 r1 = new X.8v0
            r1.<init>()
            r1.LIZ = r8
            X.MnB r0 = X.EnumC57853MnB.TUX_SEMI_TRANSPARENT
            r1.LIZJ(r0)
            X.8v1 r1 = r1.LIZ()
            if (r4 == 0) goto L87
            X.Mgf r0 = r4.LLIIIJ
            r0.LJJJJJL(r1)
            kotlin.jvm.internal.AqS127S0300000_10 r1 = new kotlin.jvm.internal.AqS127S0300000_10
            r0 = 2
            r1.<init>(r7, r6, r10, r0)
            r4.setFollowClickListener(r1)
        L87:
            if (r2 == 0) goto L93
            Y.ACListenerS30S0100000_10 r1 = new Y.ACListenerS30S0100000_10
            r0 = 101(0x65, float:1.42E-43)
            r1.<init>(r11, r0)
            X.C16880lQ.LJJJJI(r2, r1)
        L93:
            java.lang.String r1 = "result_ad_bg"
            java.lang.String r0 = "button_show"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r7)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "bg_button"
            r2.LIZJ(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "is_follow"
            r2.LIZIZ(r1, r0)
            r2.LJI()
            return
        Laf:
            r2 = r5
            goto L54
        Lb1:
            r4 = r5
            goto L47
        Lb3:
            r2.setBackground(r1)
            goto Lb9
        Lb7:
            if (r2 == 0) goto L3a
        Lb9:
            Y.ACListenerS30S0100000_10 r1 = new Y.ACListenerS30S0100000_10
            r0 = 100
            r1.<init>(r11, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            goto L3a
        Lc5:
            r0 = 128(0x80, float:1.8E-43)
            r1.setAlpha(r0)
            goto L27
        Lcc:
            r2 = r5
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.TopVideoAdServiceImpl.LJI(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, com.ss.android.ugc.aweme.profile.model.User, android.content.Context, kotlin.jvm.internal.AqS160S0100000_10, kotlin.jvm.internal.AqS160S0100000_10):void");
    }
}
