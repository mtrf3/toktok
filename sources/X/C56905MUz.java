package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MUz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56905MUz extends C56906MVa {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final AP9 LJLJI;
    public final C119624mk LJLJJI;
    public final C119624mk LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TextView LJLJL;
    public final TuxIconView LJLJLJ;
    public CheckProfileNotice LJLJLLL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 436));
        }
    }

    public C56905MUz(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.h4z);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…notification_head_single)");
        AP9 ap9 = (AP9) findViewById3;
        this.LJLJI = ap9;
        View findViewById4 = view.findViewById(R.id.h50);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        C119624mk c119624mk = (C119624mk) findViewById4;
        this.LJLJJI = c119624mk;
        View findViewById5 = view.findViewById(R.id.h51);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        C119624mk c119624mk2 = (C119624mk) findViewById5;
        this.LJLJJL = c119624mk2;
        View findViewById6 = view.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.notification_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById6;
        this.LJLJJLL = tuxTextView;
        View findViewById7 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.notification_content)");
        this.LJLJL = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJLJ = (TuxIconView) findViewById8;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(ap9.getAvatarImageView(), MVP.AVATAR, 0.0f);
            findViewById2.setOnTouchListener(new MV8(findViewById2, c119624mk, c119624mk2));
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(findViewById2);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJIIJ(this, findViewById2);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLJI);
        applyAggregatedHead(c96533qb, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL);
        applyTitleSize(c96533qb, this.LJLJJLL);
        applyContentColor(c96533qb, this.LJLJL);
        applyArrow(c96533qb, this.LJLJLJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            X.EF7.LIZIZ()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L29
        Lb:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L29
            X.AKb r2 = new X.AKb
            android.view.View r1 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
            return
        L29:
            r7.onItemClick()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r5 = r7.LJLJLLL
            if (r5 == 0) goto L3f
            r3 = 0
            if (r8 == 0) goto Lbd
            int r0 = r8.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L3b:
            java.lang.String r2 = "aweme://check_profile"
            if (r4 != 0) goto L40
        L3f:
            return
        L40:
            int r1 = r4.intValue()
            r0 = 2131372175(0x7f0a288f, float:1.8364406E38)
            if (r1 != r0) goto L99
            java.util.List r6 = r5.getUsers()
            if (r6 == 0) goto L3f
            int r0 = r6.size()
            r5 = 1
            if (r0 != r5) goto L8d
            java.lang.Object r0 = X.ORZ.LJLLJ(r6)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r4 = r0.getUid()
            java.lang.Object r0 = X.ORZ.LJLLJ(r6)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r2 = r0.getSecUid()
            java.lang.String r1 = "message"
            java.util.HashMap r0 = X.C56906MVa.buildOpenAwemeLogExtra$default(r7, r3, r5, r3)
            X.C78857UxB.LJJIFFI(r4, r2, r1, r0)
            java.lang.Object r0 = X.ORZ.LJLLJ(r6)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r2 = r0.getUid()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r7.mMTBaseNotice
            if (r0 == 0) goto L85
            java.lang.String r3 = r0.getAccountType()
        L85:
            java.lang.String r1 = "notification_page"
            java.lang.String r0 = "click_head"
            X.ViewOnClickListenerC56908MVc.logEnterPersonalDetail(r2, r1, r0, r3)
            goto L3f
        L8d:
            android.content.Context r0 = r8.getContext()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r2)
            r0.open()
            goto L3f
        L99:
            int r1 = r4.intValue()
            r0 = 2131372206(0x7f0a28ae, float:1.8364468E38)
            if (r1 != r0) goto L3f
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r7.mMTBaseNotice
            if (r0 == 0) goto Laa
            java.lang.String r3 = r0.getAccountType()
        Laa:
            int r0 = r7.getLayoutPosition()
            r7.logNotificationClick(r3, r0)
            android.content.Context r0 = r8.getContext()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r2)
            r0.open()
            goto L3f
        Lbd:
            r4 = r3
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56905MUz.onClick(android.view.View):void");
    }
}
