package X;

import Y.IDCListenerS256S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.VoteNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MV1 extends C56906MVa {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final AP9 LJLJI;
    public final C119624mk LJLJJI;
    public final C119624mk LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TextView LJLJL;
    public final C62846OlW LJLJLJ;
    public final ViewStub LJLJLLL;
    public VoteNotice LJLL;
    public BaseNotice LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 410));
        }
    }

    public MV1(View view) {
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
        View findViewById8 = view.findViewById(R.id.h4n);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.notification_cover)");
        C62846OlW c62846OlW = (C62846OlW) findViewById8;
        this.LJLJLJ = c62846OlW;
        View findViewById9 = view.findViewById(R.id.km3);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.stub_avatar_expand)");
        this.LJLJLLL = (ViewStub) findViewById9;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 408));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 409));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            SmartAvatarImageView avatarImageView = ap9.getAvatarImageView();
            MVP mvp = MVP.AVATAR;
            MVR.LIZ(avatarImageView, mvp, 0.0f);
            findViewById2.setOnTouchListener(new MV8(findViewById2, c119624mk, c119624mk2));
            MVR.LIZ(c62846OlW, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(findViewById2);
            C7FA.LIZIZ(c62846OlW);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJIIJ(this, findViewById2);
        C16880lQ.LJJJJJ(ap9, this);
        if (C99W.LIZ) {
            c62846OlW.setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        C16880lQ.LJJJJJL(c62846OlW, this);
        V92 hierarchy = c62846OlW.getHierarchy();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cf, context), 1);
        c62846OlW.addOnLayoutChangeListener(new IDCListenerS256S0100000_9(c62846OlW, 1));
    }

    public final void M(String str) {
        String str2;
        BaseNotice baseNotice = this.mMTBaseNotice;
        if (baseNotice != null) {
            str2 = baseNotice.getAccountType();
        } else {
            str2 = null;
        }
        logNotificationClick(str2, getLayoutPosition());
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        C39061g6 c39061g6 = new C39061g6(str);
        c39061g6.LIZIZ("refer", "message");
        LIZLLL.LJII(c39061g6.LIZJ());
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLJLJ);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLJI);
        applyAggregatedHead(c96533qb, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL);
        applyTitleSize(c96533qb, this.LJLJJLL);
        applyContentColor(c96533qb, this.LJLJL);
        if (c96533qb != null && c96533qb.LJFF == 16) {
            resetViewTopMargin(this.LJLJL, MVV.NEW_CONTENT_TITLE_SPACE);
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
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            X.EF7.LIZIZ()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L29
        Lb:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L29
            X.AKb r2 = new X.AKb
            android.view.View r1 = r12.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
            return
        L29:
            r12.onItemClick()
            com.ss.android.ugc.aweme.notice.repo.list.bean.VoteNotice r3 = r12.LJLL
            if (r3 == 0) goto L3e
            r9 = 0
            if (r13 == 0) goto L3e
            int r0 = r13.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r4 != 0) goto L3f
        L3e:
            return
        L3f:
            int r1 = r4.intValue()
            r0 = 2131372167(0x7f0a2887, float:1.836439E38)
            if (r1 != r0) goto L4e
        L48:
            java.lang.String r0 = r3.schemaUrl
            r12.M(r0)
            goto L3e
        L4e:
            int r1 = r4.intValue()
            r0 = 2131372175(0x7f0a288f, float:1.8364406E38)
            if (r1 != r0) goto L58
            goto L48
        L58:
            int r1 = r4.intValue()
            r0 = 2131372206(0x7f0a28ae, float:1.8364468E38)
            if (r1 != r0) goto L62
            goto L48
        L62:
            int r1 = r4.intValue()
            r0 = 2131372179(0x7f0a2893, float:1.8364414E38)
            if (r1 != r0) goto L3e
            X.MW4 r4 = X.C56906MVa.Companion
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r0 = r3.userList
            if (r0 == 0) goto L7f
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            if (r0 == 0) goto L7f
            java.lang.String r5 = r0.getUid()
            if (r5 != 0) goto L80
        L7f:
            return
        L80:
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r0 = r3.userList
            if (r0 == 0) goto L92
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            if (r0 == 0) goto L92
            java.lang.String r6 = r0.getSecUid()
            if (r6 != 0) goto L93
        L92:
            return
        L93:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r7 = r12.LJLLI
            r8 = 0
            java.util.HashMap r10 = X.C56906MVa.buildOpenAwemeLogExtra$default(r12, r9, r2, r9)
            r11 = 56
            X.MW4.LIZ(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MV1.onClick(android.view.View):void");
    }
}
