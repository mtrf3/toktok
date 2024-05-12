package X;

import android.view.View;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MSM extends C56906MVa {
    public final C62822Ol8 LJLIL;
    public C56646MLa LJLILLLLZI;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        int i;
        super.onAttached();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        C56646MLa c56646MLa = this.LJLILLLLZI;
        if (c56646MLa != null) {
            i = c56646MLa.LIZ;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "message_number");
        FMX.LJIIL("show_follow_request", c188727au.LIZ);
    }

    public MSM(View view) {
        super(view);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(view, 432));
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 431));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ((View) LIZIZ.getValue(), MVP.CELL, 0.0f);
        } else {
            C56812MRk.LIZ((View) LIZIZ.getValue());
        }
        C16880lQ.LJIJ((RelativeLayout) LIZIZ.getValue(), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            X.EF7.LIZIZ()
            r4 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lc
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L2a
        Lc:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L2a
            X.AKb r2 = new X.AKb
            android.view.View r1 = r6.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
            return
        L2a:
            r6.onItemClick()
            androidx.fragment.app.Fragment r5 = r6.mFragment
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            X.MLa r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L73
            int r0 = r0.LIZ
        L3b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r1 = r5.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity> r0 = com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity.class
            r2.<init>(r1, r0)
            java.lang.String r0 = "unread_count"
            r2.putExtra(r0, r3)
            r0 = 1024(0x400, float:1.435E-42)
            X.C16880lQ.LJII(r5, r2, r0)
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r2.LJIIIZ(r1, r0)
            X.MLa r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L66
            int r4 = r0.LIZ
        L66:
            java.lang.String r0 = "message_number"
            r2.LIZLLL(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "enter_follow_request"
            X.FMX.LJIIL(r0, r1)
            return
        L73:
            r0 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MSM.onClick(android.view.View):void");
    }
}
