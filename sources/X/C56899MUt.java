package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AdHelperNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MUt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56899MUt extends MVV {
    public final View LJLIL;
    public final C119624mk LJLILLLLZI;
    public final TextView LJLJI;
    public final TuxIconView LJLJJI;
    public AdHelperNotice LJLJJL;
    public final Context LJLJJLL;
    public MusNotice LJLJL;

    @Override // X.MVV
    public final int getRootId() {
        return R.id.h5p;
    }

    public C56899MUt(View view) {
        super(view);
        this.LJLJJLL = view.getContext();
        View findViewById = view.findViewById(R.id.h5p);
        this.LJLIL = findViewById;
        C119624mk c119624mk = (C119624mk) view.findViewById(R.id.h4v);
        this.LJLILLLLZI = c119624mk;
        this.LJLJI = (TextView) view.findViewById(R.id.h4l);
        this.LJLJJI = (TuxIconView) view.findViewById(R.id.h4d);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(c119624mk, MVP.AVATAR, C17N.LJIILL(28.0d));
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(c119624mk);
        }
        C56812MRk.LIZ(findViewById);
        C7FA.LIZIZ(c119624mk);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyContentColor(c96533qb, this.LJLJI);
        applyArrow(c96533qb, this.LJLJJI);
        if (c96533qb.LIZIZ == C17N.LJIILL(56.0d)) {
            TuxIconView tuxIconView = this.LJLJJI;
            resetViewTopMargin(tuxIconView, getViewTopMarginAddSpace(tuxIconView, MVV.LARGE_AVATAR_ADD_SPACE));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            r2 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L9
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L9
            if (r0 != 0) goto L22
        L9:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L22
            X.AKb r1 = new X.AKb
            android.view.View r0 = r9.itemView
            r1.<init>(r0)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            return
        L22:
            r9.onItemClick()
            android.content.Context r1 = r9.LJLJJLL
            java.lang.String r0 = "//notice/detail"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg r3 = new com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg
            r4 = 21
            r0 = 1
            int[] r0 = new int[r0]
            r0[r2] = r4
            int r5 = X.C54362LVe.LJIILJJIL(r0)
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r9.mMTBaseNotice
            if (r0 == 0) goto L53
            java.lang.String r8 = r0.nid
        L44:
            r3.<init>(r4, r5, r6, r7, r8)
            r1.withNavArg(r3)
            r1.open()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r9.LJLJL
            r9.markHasRead(r0)
            return
        L53:
            r8 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56899MUt.onClick(android.view.View):void");
    }
}
