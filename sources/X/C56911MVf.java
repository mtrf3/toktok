package X;

import Y.ACallableS112S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.service.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AqS115S0101000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56911MVf extends MVY {
    public final View LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final AP9 LJLJI;
    public final TextView LJLJJI;
    public final View LJLJJL;
    public final C188627ak LJLJJLL;
    public final TextView LJLJL;
    public final C62354Oda LJLJLJ;
    public final TuxIconView LJLJLLL;
    public final TuxIconView LJLL;
    public final C62354Oda LJLLI;
    public final View LJLLILLLL;
    public final TextView LJLLJ;
    public BaseNotice LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public final C51698KQs LJLZ;
    public User LJZ;
    public AtMe LJZI;

    @Override // X.MVY
    public final User getUserFromNotice() {
        AtMe atMe = this.LJZI;
        if (atMe != null) {
            return atMe.getUser();
        }
        return null;
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final void onLifecycleSet() {
        C51698KQs c51698KQs = this.LJLZ;
        if (c51698KQs != null) {
            c51698KQs.LJLLI = requireLifeCycleOwner();
        }
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 437));
        }
    }

    public C56911MVf(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.ikn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…k_comment_like_container)");
        this.LJLILLLLZI = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById3;
        this.LJLJI = ap9;
        View findViewById4 = view.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_name)");
        TextView textView = (TextView) findViewById4;
        this.LJLJJI = textView;
        View findViewById5 = view.findViewById(R.id.h5h);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…ation_name_append_follow)");
        AnonymousClass976 anonymousClass976 = (AnonymousClass976) findViewById5;
        View findViewById6 = view.findViewById(R.id.h5i);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…_append_follow_container)");
        this.LJLJJL = findViewById6;
        View findViewById7 = view.findViewById(R.id.gv3);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.mutual_relation_view)");
        this.LJLJJLL = (C188627ak) findViewById7;
        View findViewById8 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.notification_content)");
        this.LJLJL = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.h4p);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.…notification_cover_right)");
        C62354Oda c62354Oda = (C62354Oda) findViewById9;
        this.LJLJLJ = c62354Oda;
        View findViewById10 = view.findViewById(R.id.h5c);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.….notification_mark_right)");
        this.LJLJLLL = (TuxIconView) findViewById10;
        View findViewById11 = view.findViewById(R.id.h5b);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.…notification_mark_bottom)");
        this.LJLL = (TuxIconView) findViewById11;
        View findViewById12 = view.findViewById(R.id.h4o);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.…otification_cover_bottom)");
        C62354Oda c62354Oda2 = (C62354Oda) findViewById12;
        this.LJLLI = c62354Oda2;
        View findViewById13 = view.findViewById(R.id.h5l);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.…fication_reply_container)");
        this.LJLLILLLL = findViewById13;
        View findViewById14 = view.findViewById(R.id.h5m);
        o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.…tification_reply_content)");
        this.LJLLJ = (TextView) findViewById14;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            SmartAvatarImageView avatarImageView = ap9.getAvatarImageView();
            MVP mvp = MVP.AVATAR;
            MVR.LIZ(avatarImageView, mvp, 0.0f);
            MVR.LIZ(c62354Oda, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(c62354Oda2, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(textView, MVP.USERNAME, 0.0f);
        } else {
            MVR.LJ(findViewById);
            C7FA.LIZIZ(ap9);
            C7FA.LIZIZ(c62354Oda);
            C7FA.LIZIZ(c62354Oda2);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
        if (C99W.LIZ) {
            c62354Oda.setCornerRadius(C32151Nz.LJIIZILJ(4));
            c62354Oda2.setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        C16880lQ.LJJJJLI(c62354Oda, this);
        C16880lQ.LJJJJLI(c62354Oda2, this);
        C16880lQ.LJJJLL(anonymousClass976, this);
        this.LJLZ = new C51698KQs(anonymousClass976, new MW9(this));
        V92 hierarchy = c62354Oda.getHierarchy();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cf, context), 1);
        V92 hierarchy2 = c62354Oda2.getHierarchy();
        Context context2 = this.mContext;
        o.LJIIIIZZ(context2, "context");
        hierarchy2.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cf, context2), 1);
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLJLJ);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLJI);
        applyTitleSize(c96533qb, this.LJLJJI);
        applyContentColor(c96533qb, this.LJLJL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56911MVf.onClick(android.view.View):void");
    }

    @Override // X.C56906MVa
    public final void setNotificationGuideBundle(int i) {
        String string;
        Bundle LIZ = C141415gn.LIZ("from_where", i);
        LIZ.putString("username", this.LJLJJI.getText().toString());
        AtMe atMe = this.LJZI;
        if (atMe != null) {
            UrlModel avatarThumb = atMe.getUser().getAvatarThumb();
            int subType = atMe.getSubType();
            if (subType != 1) {
                if (subType != 2) {
                    if (subType != 7) {
                        return;
                    } else {
                        string = this.mContext.getResources().getString(R.string.ix8);
                    }
                } else {
                    string = this.mContext.getResources().getString(R.string.h6z);
                }
            } else {
                string = this.mContext.getResources().getString(R.string.h70);
            }
            if (string == null) {
                return;
            }
            LIZ.putString("content", string);
            LIZ.putSerializable("avatar_thumb", avatarThumb);
        }
        this.mNotificationGuideBundle = LIZ;
        this.isRecordNotificationGuideInto = true;
    }

    public final void M(BaseNotice notice, String str, String enterFrom, boolean z) {
        boolean z2;
        User user;
        String cid;
        String LIZ;
        int i;
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(enterFrom, "enterFrom");
        AtMe atMe = notice.atMe;
        if (atMe == null) {
            return;
        }
        this.LJLLL = notice;
        this.LJLLLL = str;
        this.LJLLLLLL = enterFrom;
        this.LJZI = atMe;
        this.LJLJLLL.setVisibility(8);
        this.LJLL.setVisibility(8);
        AtMe atMe2 = this.LJZI;
        if (atMe2 != null) {
            this.LJLJI.setUserData(new UserVerify(atMe2.getUser().getAvatarThumb(), atMe2.getUser().getCustomVerify(), atMe2.getUser().getEnterpriseVerifyReason(), Integer.valueOf(atMe2.getUser().getVerificationType())));
            this.LJLJI.LIZ();
            TextView textView = this.LJLJJI;
            User user2 = atMe2.getUser();
            o.LJIIIIZZ(user2, "it.user");
            setClickableNameText(textView, user2, this.LJLLL, str, enterFrom);
            User user3 = atMe2.getUser();
            if (user3 != null) {
                this.LJLJJL.setVisibility(8);
                C57446Mgc nameAppendFollowText = this.nameAppendFollowText;
                o.LJIIIIZZ(nameAppendFollowText, "nameAppendFollowText");
                ctrlFollowTextVisibilityAndMob$awemenotice_release(nameAppendFollowText, "at", Collections.singletonList(user3), true);
                if (!C53752L7s.LIZJ() || !o.LJ(user3, this.LJZ)) {
                    C57446Mgc c57446Mgc = this.nameAppendFollowText;
                    C7YW c7yw = new C7YW();
                    c7yw.LIZ = user3;
                    c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                    c7yw.LJ = true;
                    c7yw.LJFF = requireLifeCycleOwner();
                    c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                    this.nameAppendFollowText.setTracker(new AqS159S0100000_9(this, 439));
                    user3.getFollowStatus();
                    EnumC57435MgR.UNFOLLOW.getValue();
                    C57446Mgc nameAppendFollowText2 = this.nameAppendFollowText;
                    o.LJIIIIZZ(nameAppendFollowText2, "nameAppendFollowText");
                    C26338AVi.LJI(nameAppendFollowText2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7))), null, null, null, false, 30);
                    this.LJZ = user3;
                }
            }
            setRelationLabel(this.LJLJJLL, Collections.singletonList(atMe2.getUser()), this.LJLJLJ, this.LJLIL);
            TextView textView2 = this.LJLJJI;
            if (this.LJLJJL.getVisibility() == 0 || this.nameAppendFollowText.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C56906MVa.resetTitleMaxLine$default(this, textView2, z2, false, 4, null);
            if (atMe2.getSubType() == 2 || atMe2.getSubType() == 55) {
                this.LJLJLJ.setVisibility(0);
                this.LJLLI.setVisibility(8);
                Comment replyComment = atMe2.getReplyComment();
                if (replyComment != null && (cid = replyComment.getCid()) != null && cid.length() != 0 && !C53288Kvk.LIZ()) {
                    this.LJLLILLLL.setVisibility(0);
                    NoticeCommentHelperService LIZIZ = NoticeCommentHelperServiceImpl.LIZIZ();
                    TextView textView3 = this.LJLLJ;
                    if (replyComment.getUser() != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(MVR.LIZIZ(replyComment.getUser(), true));
                        LIZ2.append(": ");
                        LIZ2.append(LIZIZ.LIZ(replyComment));
                        LIZ = X1D.LIZIZ(LIZ2);
                    } else {
                        LIZ = LIZIZ.LIZ(replyComment);
                    }
                    textView3.setText(LIZ);
                    C118824lS.LIZJ(this.LJLLJ, null);
                }
                if (atMe2.getImageUrl() == null) {
                    this.LJLJLLL.setVisibility(0);
                } else {
                    AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(atMe2, this, 31);
                    if ((C53752L7s.LIZIZ() & 2) == 2) {
                        C10K.LIZJ(new ACallableS112S0100000_9(aqS156S0200000_9, (InterfaceC65784Pro<C76800UCe>) 36));
                    } else {
                        aqS156S0200000_9.invoke();
                    }
                }
                if (MDT.LIZ(atMe2.getComment(), atMe2.getAweme())) {
                    Comment comment = atMe2.getComment();
                    o.LJIIIIZZ(comment, "it.comment");
                    Aweme aweme = atMe2.getAweme();
                    o.LJIIIIZZ(aweme, "it.aweme");
                    this.LJLILLLLZI.setVisibility(0);
                    EnumC178066yo LIZLLL = MDT.LIZLLL();
                    C70B c70b = (C70B) this.LJLILLLLZI.findViewById(R.id.ikk);
                    if (c70b != null) {
                        c70b.LIZ(comment, aweme, LIZLLL, this);
                    } else {
                        CommentService.LIZ.getClass();
                        CommentService LJJL = CommentServiceImpl.LJJL();
                        Context context = this.mContext;
                        o.LJIIIIZZ(context, "context");
                        c70b = LJJL.LJJIIZI(context, this.mFragment, comment, aweme, LIZLLL, this);
                        this.LJLILLLLZI.removeAllViews();
                        c70b.setId(R.id.ikk);
                        this.LJLILLLLZI.addView(c70b);
                    }
                    AtMe atMe3 = this.LJZI;
                    if (atMe3 != null) {
                        user = atMe3.getUser();
                    } else {
                        user = null;
                    }
                    c70b.LIZJ(new AqS115S0101000_9(this, C222578oP.LJFF(user), 0));
                } else {
                    this.LJLILLLLZI.setVisibility(8);
                }
            } else {
                this.LJLJLJ.setVisibility(8);
                this.LJLLI.setVisibility(0);
                this.LJLILLLLZI.setVisibility(8);
                this.LJLLILLLL.setVisibility(8);
                if (atMe2.getImageUrl() == null) {
                    this.LJLL.setVisibility(0);
                } else {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(atMe2.getImageUrl()));
                    LJII.LJIILIIL(J7H.LIZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
                    LJII.LIZIZ("Notice");
                    LJII.LJJIIJ = this.LJLLI;
                    C16880lQ.LLJJJ(LJII);
                }
                if (L0K.LIZLLL) {
                    this.LJLLI.setVisibility(8);
                    this.LJLJLJ.setVisibility(0);
                    if (atMe2.getImageUrl() == null) {
                        this.LJLL.setVisibility(8);
                        this.LJLJLLL.setVisibility(0);
                    } else {
                        AqS156S0200000_9 aqS156S0200000_92 = new AqS156S0200000_9(atMe2, this, 33);
                        if ((C53752L7s.LIZIZ() & 2) == 2) {
                            C10K.LIZJ(new ACallableS112S0100000_9(aqS156S0200000_92, (InterfaceC65784Pro<C76800UCe>) 36));
                        } else {
                            aqS156S0200000_92.invoke();
                        }
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MSH.LIZLLL(atMe2));
            if (this.LJLLILLLL.getVisibility() == 8) {
                i = 6;
            } else {
                i = 5;
            }
            MXH.LIZ(this.LJLJL, spannableStringBuilder, notice, i, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 148.0f)));
            C118824lS.LIZJ(this.LJLJL, null);
            MVY.checkAndGetStory$default(this, false, 1, null);
            addTypeIconToAvatar(this.LJLJI, atMe2.getAvatarBadgeUrl(), false);
        }
        resetContentTopMargin(this.LJLJJI, this.LJLJL, this.LJLJJLL, 0);
        markUnreadIfNeed(notice.hasRead, this.itemView, z);
    }
}
