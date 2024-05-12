package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56913MVh extends MVY {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final C62354Oda LJLJJL;
    public final View LJLJJLL;
    public final C188627ak LJLJL;
    public CommentNotice LJLJLJ;
    public final C51698KQs LJLJLLL;
    public BaseNotice LJLL;
    public String LJLLI;
    public String LJLLILLLL;

    @Override // X.MVY
    public final User getUserFromNotice() {
        Comment comment;
        CommentNotice commentNotice = this.LJLJLJ;
        if (commentNotice != null && (comment = commentNotice.getComment()) != null) {
            return comment.getUser();
        }
        return null;
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final void onLifecycleSet() {
        C51698KQs c51698KQs = this.LJLJLLL;
        if (c51698KQs != null) {
            c51698KQs.LJLLI = requireLifeCycleOwner();
        }
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 441));
        }
    }

    public C56913MVh(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById2;
        this.LJLILLLLZI = ap9;
        View findViewById3 = view.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_name)");
        TextView textView = (TextView) findViewById3;
        this.LJLJI = textView;
        View findViewById4 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById4;
        C62354Oda c62354Oda = (C62354Oda) view.findViewById(R.id.h4n);
        if (c62354Oda == null) {
            View findViewById5 = view.findViewById(R.id.h4p);
            o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…notification_cover_right)");
            c62354Oda = (C62354Oda) findViewById5;
        }
        this.LJLJJL = c62354Oda;
        View findViewById6 = view.findViewById(R.id.h5h);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…ation_name_append_follow)");
        AnonymousClass976 anonymousClass976 = (AnonymousClass976) findViewById6;
        View findViewById7 = view.findViewById(R.id.h5i);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…_append_follow_container)");
        this.LJLJJLL = findViewById7;
        View findViewById8 = view.findViewById(R.id.gv3);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.mutual_relation_view)");
        this.LJLJL = (C188627ak) findViewById8;
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
        this.LJLJLLL = new C51698KQs(anonymousClass976, new MWA(this));
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLJJL);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyTitleSize(c96533qb, this.LJLJI);
        applyContentColor(c96533qb, this.LJLJJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56913MVh.onClick(android.view.View):void");
    }

    public final void M(BaseNotice notice, String str, String enterFrom, boolean z) {
        boolean z2;
        Integer valueOf;
        Aweme aliasAweme;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        String str2;
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(enterFrom, "enterFrom");
        CommentNotice commentNotice = notice.commentNotice;
        if (commentNotice == null || !commentNotice.isReplyWithVideo() || notice.commentNotice.getComment() == null || notice.commentNotice.getComment().getAliasAweme() == null) {
            return;
        }
        this.LJLLI = str;
        this.LJLL = notice;
        this.LJLLILLLL = enterFrom;
        CommentNotice commentNotice2 = notice.commentNotice;
        this.LJLJLJ = commentNotice2;
        if (commentNotice2 != null) {
            User user = commentNotice2.getComment().getUser();
            this.LJLILLLLZI.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.LJLILLLLZI.LIZ();
            User user2 = commentNotice2.getComment().getUser();
            String str3 = "";
            if (user2 != null) {
                this.LJLJJLL.setVisibility(8);
                C57446Mgc c57446Mgc = this.nameAppendFollowText;
                C7YW c7yw = new C7YW();
                c7yw.LIZ = user2;
                c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                c7yw.LJ = true;
                c7yw.LJFF = requireLifeCycleOwner();
                c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                this.nameAppendFollowText.setTracker(new AqS159S0100000_9(this, 444));
                user2.getFollowStatus();
                EnumC57435MgR.UNFOLLOW.getValue();
                C57446Mgc nameAppendFollowText = this.nameAppendFollowText;
                o.LJIIIIZZ(nameAppendFollowText, "nameAppendFollowText");
                C26338AVi.LJI(nameAppendFollowText, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7))), null, null, null, false, 30);
                C57446Mgc nameAppendFollowText2 = this.nameAppendFollowText;
                o.LJIIIIZZ(nameAppendFollowText2, "nameAppendFollowText");
                BaseNotice baseNotice = this.LJLL;
                if (baseNotice == null || (str2 = baseNotice.getAccountType()) == null) {
                    str2 = "";
                }
                ctrlFollowTextVisibilityAndMob$awemenotice_release(nameAppendFollowText2, str2, Collections.singletonList(user2), true);
            }
            setRelationLabel(this.LJLJL, Collections.singletonList(commentNotice2.getComment().getUser()), null, this.LJLIL);
            TextView textView = this.LJLJI;
            if (this.LJLJJLL.getVisibility() == 0 || this.nameAppendFollowText.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C56906MVa.resetTitleMaxLine$default(this, textView, z2, false, 4, null);
            setClickableNameText(this.LJLJI, user, this.LJLL, str, enterFrom);
            Comment comment = commentNotice2.getComment();
            if (comment == null || (aliasAweme = comment.getAliasAweme()) == null || (video = aliasAweme.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || urlList.isEmpty()) {
                C62354Oda c62354Oda = this.LJLJJL;
                Context context = this.mContext;
                o.LJIIIIZZ(context, "context");
                c62354Oda.setImageDrawable(C79045V0n.LJIIIIZZ(R.attr.cf, context));
            } else {
                W5F LJII = W5U.LJII(C78939UyV.LJ(commentNotice2.getComment().getAliasAweme().getVideo().getOriginCover()));
                LJII.LJIILIIL(J7H.LIZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
                LJII.LIZIZ("Notice");
                LJII.LJJIIJ = this.LJLJJL;
                C16880lQ.LLJJJ(LJII);
            }
            if (L0K.LIZLLL) {
                ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
            }
            CommentNotice commentNotice3 = this.LJLJLJ;
            if (commentNotice3 != null && (valueOf = Integer.valueOf(commentNotice3.getCommentType())) != null) {
                if (valueOf.intValue() == 17) {
                    str3 = C29822Bn8.LIZ(this.mContext, R.string.ixl, "context.resources.getStr…_your_comment_with_video)");
                } else if (valueOf.intValue() == 18) {
                    str3 = C29822Bn8.LIZ(this.mContext, R.string.ixk, "context.resources.getStr…plied_comment_with_video)");
                } else if (valueOf.intValue() == 19) {
                    str3 = C29822Bn8.LIZ(this.mContext, R.string.ixj, "context.resources.getStr…liked_comment_with_video)");
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
            addCreateTimeSpan(spannableStringBuilder, notice);
            this.LJLJJI.setText(spannableStringBuilder);
            MVY.checkAndGetStory$default(this, false, 1, null);
            addTypeIconToAvatar(this.LJLILLLLZI, commentNotice2.getAvatarBadgeUrl(), false);
        }
        resetContentTopMargin(this.LJLJI, this.LJLJJI, this.LJLJL, 0);
        markUnreadIfNeed(notice.hasRead, this.itemView, z);
    }
}
