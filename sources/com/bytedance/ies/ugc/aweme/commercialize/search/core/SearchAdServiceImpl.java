package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import X.C16880lQ;
import X.C58852N7w;
import X.C58854N7y;
import X.C59948Nfs;
import X.C79045V0n;
import X.JPG;
import X.O5Y;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchAdServiceImpl implements ISearchAdService {
    public static final /* synthetic */ int LJIIL = 0;
    public View LIZ;
    public C59948Nfs LIZIZ;
    public ViewGroup LIZJ;
    public C58852N7w LIZLLL;
    public View LJ;
    public RelationButton LJFF;
    public Context LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public JPG LJIIJ;
    public ViewGroup LJIIJJI;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LJLLJ() {
        C58852N7w c58852N7w = this.LIZLLL;
        if (c58852N7w != null) {
            c58852N7w.LIZLLL();
        }
        C58852N7w c58852N7w2 = this.LIZLLL;
        if (c58852N7w2 != null) {
            c58852N7w2.LJ(c58852N7w2.LJLLI, 0);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LJLLL() {
        C58852N7w c58852N7w = this.LIZLLL;
        if (c58852N7w != null) {
            c58852N7w.LIZJ();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LJLLLLLL() {
        Context context = this.LJI;
        if (context != null) {
            C58854N7y.LIZIZ(this.LJFF, C79045V0n.LJI(R.attr.gp, context), C79045V0n.LJI(R.attr.eb, context));
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LJLZ() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LJZ() {
        if (this.LJII) {
            C58854N7y.LIZ.postDelayed(new ARunnableS46S0100000_10(this, 21), 500L);
            this.LJII = false;
        } else {
            View view = this.LJ;
            if (view == null) {
                return;
            }
            view.setVisibility(4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LJZL() {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        C58854N7y.LIZJ(this.LJFF, 22, true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LLD() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LLFF() {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        C58852N7w c58852N7w = this.LIZLLL;
        if (c58852N7w != null) {
            c58852N7w.LJII(this.LJIIIIZZ);
        }
        C58852N7w c58852N7w2 = this.LIZLLL;
        if (c58852N7w2 != null) {
            c58852N7w2.LJI();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final JPG LJLLILLLL() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final ViewGroup LLFII() {
        return this.LJIIJJI;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final ViewGroup LLFZ() {
        return this.LIZJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void LL(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            C58854N7y.LIZ.postDelayed(new ARunnableS46S0100000_10(this, 20), 300L);
            return;
        }
        RelationButton relationButton = this.LJFF;
        if (relationButton != null) {
            layoutParams = relationButton.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = -200;
        relationButton.setLayoutParams(marginLayoutParams);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final ViewGroup LLFFF(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd) {
        View LLLLIILL;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.setVisibility(8);
        if (awemeRawAd == null) {
            return null;
        }
        viewGroup.removeAllViews();
        if (O5Y.LJIILLIIL(awemeRawAd)) {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.avo, viewGroup, true);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ceq, viewGroup, true);
        }
        this.LJ = LLLLIILL;
        if (!(LLLLIILL instanceof ViewGroup)) {
            return null;
        }
        return viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI(com.ss.android.ugc.aweme.feed.model.Aweme r9, android.view.ViewGroup r10, Y.ACListenerS30S0100000_10 r11, Y.ACListenerS30S0100000_10 r12) {
        /*
            r8 = this;
            android.view.View r0 = r8.LJ
            r6 = 0
            if (r0 != 0) goto L8b
        L5:
            r3 = 0
            if (r9 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r9.getAwemeRawAd()
        Lc:
            if (r10 == 0) goto L86
            r0 = 2131375285(0x7f0a34b5, float:1.8370713E38)
            android.view.View r2 = r10.findViewById(r0)
            if (r2 == 0) goto L22
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            if (r1 != 0) goto L80
        L1d:
            if (r2 == 0) goto L22
            X.C16880lQ.LJIIJ(r12, r2)
        L22:
            if (r10 == 0) goto L86
            r0 = 2131375287(0x7f0a34b7, float:1.8370717E38)
            android.view.View r2 = r10.findViewById(r0)
            X.N7v r2 = (X.AbstractC58851N7v) r2
            r0 = 2131375289(0x7f0a34b9, float:1.8370722E38)
            android.view.View r5 = r10.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r5 = (com.bytedance.tux.input.TuxTextView) r5
        L36:
            r7 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 30
            X.OUP.LJJJJLI(r2, r0, r3, r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.OUP.LJJJJLI(r5, r0, r3, r3, r1)
            if (r2 == 0) goto L68
            r2.LIZIZ(r9, r11)
            int r0 = r2.getBgColor()
            r2.LJ(r0, r6)
            int r0 = r8.LJIIIIZZ
            r2.LJII(r0)
        L68:
            if (r5 == 0) goto L6d
            X.C16880lQ.LJJJJI(r5, r12)
        L6d:
            java.lang.String r0 = X.C59406NTe.LJI(r9)
            X.N50.LJJIJL(r4, r0)
            if (r2 == 0) goto L7a
            r0 = 0
            X.C78897Uxp.LJJJJJL(r2, r0)
        L7a:
            if (r5 == 0) goto L7f
            X.C78897Uxp.LJJJJLI(r5, r3)
        L7f:
            return
        L80:
            r0 = 128(0x80, float:1.8E-43)
            r1.setAlpha(r0)
            goto L1d
        L86:
            r2 = r3
            r5 = r3
            goto L36
        L89:
            r4 = r3
            goto Lc
        L8b:
            r0.setVisibility(r6)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl.LJZI(com.ss.android.ugc.aweme.feed.model.Aweme, android.view.ViewGroup, Y.ACListenerS30S0100000_10, Y.ACListenerS30S0100000_10):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r4 != null) goto L43;
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLF(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r8, com.ss.android.ugc.aweme.profile.model.User r9, kotlin.jvm.internal.AqS160S0100000_10 r10, Y.ACListenerS30S0100000_10 r11) {
        /*
            r7 = this;
            r5 = 1
            r1 = 0
            if (r9 == 0) goto Lb
            int r0 = r9.getFollowerStatus()
            if (r0 != r5) goto Lb
            return
        Lb:
            android.view.View r0 = r7.LJ
            if (r0 != 0) goto Le1
        Lf:
            android.view.View r1 = r7.LJ
            r3 = 0
            if (r1 == 0) goto Lde
            r0 = 2131367280(0x7f0a1570, float:1.8354477E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 == 0) goto L23
            android.graphics.drawable.Drawable r1 = r4.getBackground()
            if (r1 != 0) goto Ld7
        L23:
            android.content.Context r0 = r7.LJI
            if (r0 == 0) goto Ld0
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            android.content.Context r1 = r7.LJI
            r0 = 2130968758(0x7f0400b6, float:1.7546179E38)
            int r0 = X.C78609UtB.LJJJ(r0, r1)
            r2.setColor(r0)
            if (r4 != 0) goto Lcc
        L3a:
            android.view.View r1 = r7.LJ
            if (r1 == 0) goto Lc9
            r0 = 2131367279(0x7f0a156f, float:1.8354475E38)
            android.view.View r4 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r4 = (com.ss.android.ugc.aweme.relation.follow.ui.RelationButton) r4
        L47:
            android.view.View r1 = r7.LJ
            if (r1 == 0) goto Lc7
            r0 = 2131367281(0x7f0a1571, float:1.835448E38)
            android.view.View r2 = r1.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r2 = (com.bytedance.tux.input.TuxTextView) r2
        L54:
            r6 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 30
            X.OUP.LJJJJLI(r4, r0, r3, r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.OUP.LJJJJLI(r2, r0, r3, r3, r1)
            X.8v0 r1 = new X.8v0
            r1.<init>()
            r1.LIZ = r9
            X.MnB r0 = X.EnumC57853MnB.TUX_SEMI_TRANSPARENT
            r1.LIZJ(r0)
            X.8v1 r1 = r1.LIZ()
            if (r4 == 0) goto L95
            X.Mgf r0 = r4.LLIIIJ
            r0.LJJJJJL(r1)
            kotlin.jvm.internal.AqS127S0300000_10 r1 = new kotlin.jvm.internal.AqS127S0300000_10
            r0 = 1
            r1.<init>(r7, r8, r10, r0)
            r4.setFollowClickListener(r1)
        L95:
            if (r2 == 0) goto L9a
            X.C16880lQ.LJJJJI(r2, r11)
        L9a:
            java.lang.String r1 = "result_ad_bg"
            java.lang.String r0 = "button_show"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r8)
            if (r8 == 0) goto Lb3
            boolean r0 = X.O5Y.LJJJJIZL(r8)
            if (r0 != r5) goto Lb3
            java.lang.String r1 = "is_ci"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.LIZIZ(r0, r1)
        Lb3:
            java.lang.String r1 = "refer"
            java.lang.String r0 = "bg_button"
            r2.LIZJ(r0, r1)
            r2.LJI()
            if (r4 == 0) goto Lc6
            r0 = 0
            X.C78897Uxp.LJJJJJL(r4, r0)
            X.C78897Uxp.LJJJJLI(r4, r3)
        Lc6:
            return
        Lc7:
            r2 = r3
            goto L54
        Lc9:
            r4 = r3
            goto L47
        Lcc:
            r4.setBackground(r2)
            goto Ld2
        Ld0:
            if (r4 == 0) goto L3a
        Ld2:
            X.C16880lQ.LJIIJ(r11, r4)
            goto L3a
        Ld7:
            r0 = 128(0x80, float:1.8E-43)
            r1.setAlpha(r0)
            goto L23
        Lde:
            r4 = r3
            goto L23
        Le1:
            r0.setVisibility(r1)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl.LLF(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, com.ss.android.ugc.aweme.profile.model.User, kotlin.jvm.internal.AqS160S0100000_10, Y.ACListenerS30S0100000_10):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJLLLL(android.view.ViewGroup r21, android.content.Context r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, com.ss.android.ugc.aweme.profile.model.User r24, Y.ACListenerS30S0100000_10 r25, X.C49065JNl r26) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl.LJLLLL(android.view.ViewGroup, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.User, Y.ACListenerS30S0100000_10, X.JNl):android.view.View");
    }
}
