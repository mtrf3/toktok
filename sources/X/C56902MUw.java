package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MUw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56902MUw extends C56906MVa {
    public final boolean LJLIL;
    public final View LJLILLLLZI;
    public final C119624mk LJLJI;
    public final TextView LJLJJI;
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
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 435));
        }
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLJI);
        applyContentColor(c96533qb, this.LJLJJI);
        applyArrow(c96533qb, this.LJLJJL);
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            TuxIconView tuxIconView = this.LJLJJL;
            resetViewTopMargin(tuxIconView, getViewTopMarginAddSpace(tuxIconView, MVV.LARGE_AVATAR_ADD_SPACE));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L8;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            boolean r0 = X.C6ZT.LIZ(r16)
            if (r0 == 0) goto L7
            return
        L7:
            X.EF7.LIZIZ()
            r2 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L13
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto L31
        L13:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L31
            X.AKb r2 = new X.AKb
            android.view.View r1 = r15.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
            return
        L31:
            r15.onItemClick()
            if (r16 == 0) goto L63
            android.content.Context r1 = r15.mContext
            java.lang.String r0 = "//notice/detail"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg r3 = new com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg
            r4 = 46
            r0 = 1
            int[] r0 = new int[r0]
            r0[r2] = r4
            int r5 = X.C54362LVe.LJIILJJIL(r0)
            r6 = 0
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r15.mMTBaseNotice
            if (r0 == 0) goto La1
            java.lang.String r8 = r0.nid
        L52:
            r9 = 0
            r10 = 0
            r13 = 236(0xec, float:3.31E-43)
            r7 = r6
            r12 = r6
            r14 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            r1.withNavArg(r3)
            r1.open()
        L63:
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "account_type"
            java.lang.String r0 = "tiktok_assistant"
            r2.LJIIIZ(r1, r0)
            java.lang.String r1 = "client_order"
            int r0 = r15.getLayoutPosition()
            r2.LIZLLL(r0, r1)
            java.lang.String r1 = "scene_id"
            java.lang.String r0 = "1004"
            r2.LJIIIZ(r1, r0)
            java.lang.String r1 = r15.LJLJJLL
            java.lang.String r0 = "template_id"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = X.AX5.LIZ
            java.lang.String r0 = "position"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r2.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "enter_official_message"
            X.FMX.LJIIL(r0, r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r15.mMTBaseNotice
            r15.markHasRead(r0)
            return
        La1:
            r8 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56902MUw.onClick(android.view.View):void");
    }

    public C56902MUw(View view, boolean z) {
        super(view);
        this.LJLIL = z;
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLJI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJJL = (TuxIconView) findViewById4;
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

    public final void M(BaseNotice notice, boolean z) {
        o.LJIIIZ(notice, "notice");
        AnnouncementNotice announcementNotice = notice.announcement;
        if (announcementNotice == null) {
            if (notice.textNotice == null) {
                return;
            }
        } else if (this.LJLIL && announcementNotice.getChallenge() == null) {
            return;
        }
        onItemClick();
        this.LJLJJLL = notice.templateId;
        AnnouncementNotice announcementNotice2 = notice.announcement;
        if (announcementNotice2 != null) {
            this.LJLJI.setImageURI(C78964Uyu.LIZJ(R.drawable.zf));
            C116724i4 c116724i4 = new C116724i4();
            String string = this.mContext.getResources().getString(R.string.iwq);
            o.LJIIIIZZ(string, "context.resources.getStr…fication_group_assistant)");
            c116724i4.LIZLLL(string);
            c116724i4.LIZLLL(":");
            c116724i4.LIZIZ(" ");
            C116714i3 c116714i3 = c116724i4.LIZ;
            c116714i3.setSpan(new NotificationBoldSpan(), 0, c116714i3.length(), 33);
            c116714i3.append((char) 8296);
            if (!TextUtils.isEmpty(announcementNotice2.getTitle())) {
                c116714i3.append((CharSequence) announcementNotice2.getTitle());
            } else {
                c116714i3.delete(c116714i3.length() - 2, c116714i3.length());
            }
            c116714i3.append((char) 8297);
            MXH.LIZIZ(this.LJLJJI, c116714i3, notice, 5, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
        }
        UserTextNotice userTextNotice = notice.textNotice;
        if (userTextNotice != null) {
            this.LJLJI.setImageURI(C78964Uyu.LIZJ(R.drawable.zf));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mContext.getResources().getString(R.string.iwq)).append((CharSequence) ": ");
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((char) 8296);
            if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                spannableStringBuilder.append((CharSequence) userTextNotice.getTitle());
            } else {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
            }
            spannableStringBuilder.append((char) 8297);
            MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, notice, 5, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
        }
        markUnreadIfNeed(notice.hasRead, this.itemView, z);
    }
}
