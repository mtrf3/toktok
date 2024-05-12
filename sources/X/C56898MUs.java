package X;

import Y.AObjectS54S0101000_9;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MUs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56898MUs extends MVV {
    public final AP9 LJLIL;
    public final TextView LJLILLLLZI;
    public final C56966MXi LJLJI;
    public FriendNotice LJLJJI;
    public final Context LJLJJL;
    public final C51698KQs LJLJJLL;
    public MusNotice LJLJL;

    @Override // X.MVV
    public final int getRootId() {
        return R.id.h4u;
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final void onLifecycleSet() {
        this.LJLJJLL.LJLLI = requireLifeCycleOwner();
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AObjectS54S0101000_9(0, this, 1));
        }
    }

    public C56898MUs(View view) {
        super(view);
        this.LJLJJL = view.getContext();
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.h4u);
        AP9 ap9 = (AP9) view.findViewById(R.id.h4t);
        this.LJLIL = ap9;
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.h4l);
        C56966MXi c56966MXi = (C56966MXi) view.findViewById(R.id.h4i);
        this.LJLJI = c56966MXi;
        c56966MXi.getLayoutParams().width = C56812MRk.LIZIZ(this.mContext);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(relativeLayout, MVP.CELL, 0.0f);
            MVR.LIZ(ap9, MVP.AVATAR, C17N.LJIILL(28.0d));
        } else {
            C56812MRk.LIZ(relativeLayout);
            C56812MRk.LIZ(ap9);
        }
        C7FA.LIZIZ(c56966MXi);
        C16880lQ.LJIJ(relativeLayout, this);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
        this.LJLJJLL = new C51698KQs(c56966MXi, null);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLIL);
        applyContentColor(c96533qb, this.LJLILLLLZI);
        if (c96533qb.LIZIZ == C17N.LJIILL(56.0d)) {
            C56966MXi c56966MXi = this.LJLJI;
            resetViewTopMargin(c56966MXi, getViewTopMarginAddSpace(c56966MXi, MVV.LARGE_AVATAR_ADD_SPACE));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            X.EF7.LIZIZ()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L24
        Lb:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L24
            X.AKb r1 = new X.AKb
            android.view.View r0 = r5.itemView
            r1.<init>(r0)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            return
        L24:
            r5.onItemClick()
            int r1 = r6.getId()
            r0 = 2131372174(0x7f0a288e, float:1.8364404E38)
            java.lang.String r4 = "message"
            java.lang.String r3 = "enter_from"
            if (r1 == r0) goto L39
            r0 = 2131372162(0x7f0a2882, float:1.836438E38)
            if (r1 != r0) goto L65
        L39:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r5.LJLJL
            java.lang.String r1 = r0.getAccountType()
            int r0 = r5.getLayoutPosition()
            r5.logNotificationClick(r1, r0)
            X.O0e r2 = X.C61200O0e.LIZLLL()
            com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice r0 = r5.LJLJJI
            java.lang.String r1 = r0.getOpenUrl()
            X.1g6 r0 = new X.1g6
            r0.<init>(r1)
            r0.LIZIZ(r3, r4)
            java.lang.String r0 = r0.LIZJ()
            r2.LJII(r0)
        L5f:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r5.LJLJL
            r5.markHasRead(r0)
            return
        L65:
            r0 = 2131372173(0x7f0a288d, float:1.8364402E38)
            if (r1 != r0) goto L5f
            X.O0e r2 = X.C61200O0e.LIZLLL()
            com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice r0 = r5.LJLJJI
            java.lang.String r1 = r0.getOpenUrl()
            X.1g6 r0 = new X.1g6
            r0.<init>(r1)
            r0.LIZIZ(r3, r4)
            java.lang.String r0 = r0.LIZJ()
            r2.LJII(r0)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56898MUs.onClick(android.view.View):void");
    }
}
