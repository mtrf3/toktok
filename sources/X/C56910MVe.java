package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56910MVe extends MVY {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final TextView LJLJJI;
    public final View LJLJJL;
    public final C188627ak LJLJJLL;
    public final TextView LJLJL;
    public final View LJLJLJ;
    public final View LJLJLLL;
    public final TextView LJLL;
    public final C62354Oda LJLLI;
    public final TuxIconView LJLLILLLL;
    public final C51698KQs LJLLJ;
    public CommentNotice LJLLL;
    public BaseNotice LJLLLL;
    public String LJLLLLLL;
    public int LJLZ;
    public User LJZ;

    @Override // X.MVY
    public final User getUserFromNotice() {
        Comment comment;
        CommentNotice commentNotice = this.LJLLL;
        if (commentNotice != null && (comment = commentNotice.getComment()) != null) {
            return comment.getUser();
        }
        return null;
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final void onLifecycleSet() {
        C51698KQs c51698KQs = this.LJLLJ;
        if (c51698KQs != null) {
            c51698KQs.LJLLI = requireLifeCycleOwner();
        }
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 468));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56910MVe(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById2;
        this.LJLILLLLZI = ap9;
        View findViewById3 = itemView.findViewById(R.id.ikn);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…k_comment_like_container)");
        this.LJLJI = (LinearLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_name)");
        TextView textView = (TextView) findViewById4;
        this.LJLJJI = textView;
        View findViewById5 = itemView.findViewById(R.id.h5h);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…ation_name_append_follow)");
        AnonymousClass976 anonymousClass976 = (AnonymousClass976) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.h5i);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…_append_follow_container)");
        this.LJLJJL = findViewById6;
        View findViewById7 = itemView.findViewById(R.id.gv3);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.mutual_relation_view)");
        this.LJLJJLL = (C188627ak) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.notification_content)");
        this.LJLJL = (TextView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.h5l);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.…fication_reply_container)");
        this.LJLJLJ = findViewById9;
        View findViewById10 = itemView.findViewById(R.id.iw7);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.reply_divider)");
        this.LJLJLLL = findViewById10;
        View findViewById11 = itemView.findViewById(R.id.h5m);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.…tification_reply_content)");
        this.LJLL = (TextView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.h4p);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.…notification_cover_right)");
        C62354Oda c62354Oda = (C62354Oda) findViewById12;
        this.LJLLI = c62354Oda;
        View findViewById13 = itemView.findViewById(R.id.h5a);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.id.notification_mark)");
        this.LJLLILLLL = (TuxIconView) findViewById13;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            SmartAvatarImageView avatarImageView = ap9.getAvatarImageView();
            MVP mvp = MVP.AVATAR;
            MVR.LIZ(avatarImageView, mvp, 0.0f);
            MVR.LIZ(c62354Oda, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(textView, MVP.USERNAME, 0.0f);
        } else {
            MVR.LJ(findViewById);
            C7FA.LIZIZ(ap9);
            C7FA.LIZIZ(c62354Oda);
        }
        if (C99W.LIZ) {
            c62354Oda.setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        C16880lQ.LJJJJLI(c62354Oda, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
        V92 hierarchy = c62354Oda.getHierarchy();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cf, context), 1);
        C16880lQ.LJJJLL(anonymousClass976, this);
        this.LJLLJ = new C51698KQs(anonymousClass976, new MWB(this));
    }

    public final void N(SpannableStringBuilder spannableStringBuilder) {
        CommentNotice commentNotice;
        Comment replyComment;
        String text;
        String text2;
        String text3;
        String LIZ;
        this.LJLJLJ.setVisibility(8);
        if (!C53288Kvk.LIZ() && (commentNotice = this.LJLLL) != null && (replyComment = commentNotice.getReplyComment()) != null) {
            int i = 0;
            this.LJLJLJ.setVisibility(0);
            if (commentNotice.getCommentType() == 12 || commentNotice.getCommentType() == 27) {
                User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                TextView textView = this.LJLL;
                String str = "";
                if (currentUser != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(MVR.LIZIZ(currentUser, true));
                    LIZ2.append(": ");
                    Comment level1Comment = commentNotice.getLevel1Comment();
                    if (level1Comment != null && (text3 = level1Comment.getText()) != null) {
                        str = text3;
                    }
                    LIZ2.append(str);
                    str = X1D.LIZIZ(LIZ2);
                } else {
                    Comment level1Comment2 = commentNotice.getLevel1Comment();
                    if (level1Comment2 != null && (text = level1Comment2.getText()) != null) {
                        str = text;
                    }
                }
                textView.setText(str);
                Comment level1Comment3 = commentNotice.getLevel1Comment();
                if (level1Comment3 != null && (text2 = level1Comment3.getText()) != null) {
                    i = text2.length();
                }
                this.LJLZ = i;
            } else {
                NoticeCommentHelperService LIZIZ = NoticeCommentHelperServiceImpl.LIZIZ();
                TextView textView2 = this.LJLL;
                if (replyComment.getUser() != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(MVR.LIZIZ(replyComment.getUser(), true));
                    LIZ3.append(": ");
                    LIZ3.append(LIZIZ.LIZ(replyComment));
                    LIZ = X1D.LIZIZ(LIZ3);
                } else {
                    LIZ = LIZIZ.LIZ(replyComment);
                }
                textView2.setText(LIZ);
                String text4 = replyComment.getText();
                if (text4 != null) {
                    i = text4.length();
                }
                this.LJLZ = i;
            }
            if (!TextUtils.isEmpty(this.LJLL.getText())) {
                C118824lS.LIZJ(this.LJLL, null);
            } else {
                this.LJLJLJ.setVisibility(8);
            }
        }
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLLI);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyTitleSize(c96533qb, this.LJLJJI);
        applyContentColor(c96533qb, this.LJLJL);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024c  */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56910MVe.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // X.C56906MVa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setNotificationGuideBundle(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = "from_where"
            android.os.Bundle r4 = X.C141415gn.LIZ(r0, r6)
            android.widget.TextView r0 = r5.LJLJJI
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "username"
            r4.putString(r0, r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r1 = r5.LJLLL
            r3 = 1
            if (r1 == 0) goto L69
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r1.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getAvatarThumb()
            int r1 = r1.getCommentType()
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L4f
            r0 = 2
            if (r1 == r0) goto L41
            r0 = 11
            if (r1 == r0) goto L4f
            r0 = 12
            if (r1 == r0) goto L41
            r0 = 23
            if (r1 == r0) goto L4f
            switch(r1) {
                case 25: goto L41;
                case 26: goto L4f;
                case 27: goto L41;
                default: goto L40;
            }
        L40:
            return
        L41:
            android.content.Context r0 = r5.mContext
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131831307(0x7f112a0b, float:1.9295636E38)
            java.lang.String r1 = r1.getString(r0)
            goto L5c
        L4f:
            android.content.Context r0 = r5.mContext
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131831309(0x7f112a0d, float:1.929564E38)
            java.lang.String r1 = r1.getString(r0)
        L5c:
            if (r1 != 0) goto L5f
            goto L40
        L5f:
            java.lang.String r0 = "content"
            r4.putString(r0, r1)
            java.lang.String r0 = "avatar_thumb"
            r4.putSerializable(r0, r2)
        L69:
            r5.isRecordNotificationGuideInto = r3
            r5.mNotificationGuideBundle = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56910MVe.setNotificationGuideBundle(int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:7|(2:9|(1:13))|14|(1:61)(1:18)|19|(2:23|(12:25|26|(1:28)(1:59)|29|(2:31|(1:35))|36|37|38|(1:40)(1:56)|41|(5:43|(1:45)(1:54)|46|(1:53)(1:50)|51)(1:55)|52))|60|26|(0)(0)|29|(0)|36|37|38|(0)(0)|41|(0)(0)|52) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e9, code lost:
    
        r19.LJLJLJ.setVisibility(8);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56910MVe.M(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, java.lang.String, java.lang.String, boolean):void");
    }
}
