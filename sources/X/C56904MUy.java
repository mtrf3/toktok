package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MUy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56904MUy extends C56906MVa {
    public final View LJLIL;
    public final C119624mk LJLILLLLZI;
    public final TextView LJLJI;
    public final View LJLJJI;
    public final TuxIconView LJLJJL;
    public String LJLJJLL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 442));
        }
    }

    public C56904MUy(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLILLLLZI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f7y);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.LJLJJI = findViewById4;
        View findViewById5 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJJL = (TuxIconView) findViewById5;
        this.LJLJJLL = "";
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(c119624mk, MVP.AVATAR, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(c119624mk);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyContentColor(c96533qb, this.LJLJI);
        applyArrow(c96533qb, this.LJLJJL);
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            TuxIconView tuxIconView = this.LJLJJL;
            int i = MVV.LARGE_AVATAR_ADD_SPACE;
            resetViewTopMargin(tuxIconView, getViewTopMarginAddSpace(tuxIconView, i));
            View view = this.LJLJJI;
            resetViewTopMargin(view, getViewTopMarginAddSpace(view, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L8;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            boolean r0 = X.C6ZT.LIZ(r18)
            if (r0 == 0) goto L7
            return
        L7:
            X.EF7.LIZIZ()
            r4 = 0
            r2 = r17
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L15
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L33
        L15:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L33
            X.AKb r3 = new X.AKb
            android.view.View r1 = r2.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r3.LJIIIIZZ(r0)
            r3.LJIIJ()
            return
        L33:
            r2.onItemClick()
            if (r18 == 0) goto Lbb
            r3 = 1
            int[] r1 = new int[r3]
            r0 = 61
            r1[r4] = r0
            int r0 = X.C54362LVe.LJIILJJIL(r1)
            if (r0 <= 0) goto L4d
            X.LJm r0 = new X.LJm
            r0.<init>()
            X.C2U8.LIZ(r0)
        L4d:
            android.content.Context r1 = r2.mContext
            java.lang.String r0 = "//notice/detail"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg r5 = new com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg
            r6 = 62
            int[] r0 = new int[r3]
            r0[r4] = r6
            int r7 = X.C54362LVe.LJIILJJIL(r0)
            r8 = 0
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r2.mMTBaseNotice
            if (r0 == 0) goto Lc1
            java.lang.String r10 = r0.nid
        L68:
            r11 = 0
            r12 = 0
            r15 = 236(0xec, float:3.31E-43)
            r9 = r8
            r14 = r8
            r16 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r1.withNavArg(r5)
            r1.open()
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x00c4: FILL_ARRAY_DATA , data: [62, 61} // fill-array
            X.C54362LVe.LIZIZ(r0)
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = "account_type"
            java.lang.String r0 = "starmap_assistant"
            r3.LJIIIZ(r1, r0)
            java.lang.String r1 = "client_order"
            int r0 = r2.getLayoutPosition()
            r3.LIZLLL(r0, r1)
            java.lang.String r1 = "scene_id"
            java.lang.String r0 = "1004"
            r3.LJIIIZ(r1, r0)
            java.lang.String r1 = r2.LJLJJLL
            java.lang.String r0 = "template_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r1 = X.AX5.LIZ
            java.lang.String r0 = "position"
            r3.LJIIIZ(r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r3.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "enter_official_message"
            X.FMX.LJIIL(r0, r1)
        Lbb:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r2.mMTBaseNotice
            r2.markHasRead(r0)
            return
        Lc1:
            r10 = 0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56904MUy.onClick(android.view.View):void");
    }
}
