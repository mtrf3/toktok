package X;

import Y.IDCListenerS256S0100000_9;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DonationNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56914MVi extends C56906MVa {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final View LJLJJL;
    public final C62354Oda LJLJJLL;
    public DonationNotice LJLJL;
    public BaseNotice LJLJLJ;
    public String LJLJLLL;
    public String LJLL;

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 445));
        }
    }

    public C56914MVi(View view) {
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
        View findViewById5 = view.findViewById(R.id.h5l);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…fication_reply_container)");
        this.LJLJJL = findViewById5;
        View findViewById6 = view.findViewById(R.id.h4p);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…notification_cover_right)");
        C62354Oda c62354Oda = (C62354Oda) findViewById6;
        this.LJLJJLL = c62354Oda;
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
        c62354Oda.addOnLayoutChangeListener(new IDCListenerS256S0100000_9(c62354Oda, 1));
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
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.d3, context), 1);
        findViewById5.setVisibility(8);
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLJJLL);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyTitleSize(c96533qb, this.LJLJI);
        applyContentColor(c96533qb, this.LJLJJI);
        if (c96533qb != null && c96533qb.LJFF == 16) {
            resetViewTopMargin(this.LJLJJI, MVV.NEW_CONTENT_TITLE_SPACE);
        }
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        int i2;
        Integer valueOf;
        Aweme aweme;
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            onItemClick();
            DonationNotice donationNotice = this.LJLJL;
            if (donationNotice != null) {
                BaseNotice baseNotice = this.LJLJLJ;
                if (baseNotice != null) {
                    str = baseNotice.getAccountType();
                } else {
                    str = null;
                }
                BaseNotice baseNotice2 = this.LJLJLJ;
                if (baseNotice2 != null) {
                    i = baseNotice2.clientOrder;
                } else {
                    i = -1;
                }
                String str2 = this.LJLL;
                String str3 = this.LJLJLLL;
                if (baseNotice2 != null && baseNotice2.hasRead) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                logNotificationAction("click", str, i, baseNotice2, true, "", str2, str3, i2, donationNotice.user);
                if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                    if (valueOf.intValue() == R.id.h4v) {
                        User user = donationNotice.user;
                        if (user != null) {
                            MW4 mw4 = C56906MVa.Companion;
                            String uid = user.getUid();
                            o.LJIIIIZZ(uid, "user.uid");
                            String secUid = user.getSecUid();
                            o.LJIIIIZZ(secUid, "user.secUid");
                            MW4.LIZ(mw4, uid, secUid, this.LJLJLJ, false, null, C56906MVa.buildOpenAwemeLogExtra$default(this, null, 1, null), 56);
                        }
                    } else if ((valueOf.intValue() == R.id.h5p || valueOf.intValue() == R.id.h4p) && (aweme = donationNotice.aweme) != null) {
                        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://aweme/detail/");
                        buildRoute.withParam("id", aweme.getAid());
                        buildRoute.withParam("refer", "message");
                        C0NY.LIZJ(buildRoute, "enter_method", "notice_click", "show_donation", true);
                    }
                }
            }
            markHasRead(this.LJLJLJ);
            return;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26045AKb c26045AKb = new C26045AKb(itemView);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    public final void M(BaseNotice notice, String str, String enterFrom, boolean z) {
        boolean z2;
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(enterFrom, "enterFrom");
        DonationNotice donationNotice = notice.donationNotice;
        if (donationNotice == null) {
            return;
        }
        this.LJLJLLL = str;
        this.LJLJLJ = notice;
        this.LJLL = enterFrom;
        this.LJLJL = donationNotice;
        User user = donationNotice.user;
        if (user != null) {
            this.LJLILLLLZI.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.LJLILLLLZI.LIZ();
            setClickableNameText(this.LJLJI, user, this.LJLJLJ, str, enterFrom);
            this.mTvNameAppendContainer.setVisibility(8);
            C57446Mgc c57446Mgc = this.nameAppendFollowText;
            C7YW c7yw = new C7YW();
            c7yw.LIZ = user;
            c7yw.LIZIZ(EnumC57119MbL.NORMAL);
            c7yw.LJFF = requireLifeCycleOwner();
            c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
            C57434MgQ.LIZIZ.contains(Integer.valueOf(user.getFollowStatus()));
            C57446Mgc nameAppendFollowText = this.nameAppendFollowText;
            o.LJIIIIZZ(nameAppendFollowText, "nameAppendFollowText");
            C26338AVi.LJI(nameAppendFollowText, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, null, false, 30);
            C57446Mgc nameAppendFollowText2 = this.nameAppendFollowText;
            o.LJIIIIZZ(nameAppendFollowText2, "nameAppendFollowText");
            ctrlFollowTextVisibilityAndMob$awemenotice_release(nameAppendFollowText2, "", Collections.singletonList(user), true);
        }
        Aweme aweme = donationNotice.aweme;
        if (aweme != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(aweme.getVideo().getOriginCover()));
            LJII.LJIILIIL(J7H.LIZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
            LJII.LIZIZ("DONATION_NOTICE");
            LJII.LJJIIJ = this.LJLJJLL;
            C16880lQ.LLJJJ(LJII);
        }
        TextView textView = this.LJLJI;
        if (this.mTvNameAppendContainer.getVisibility() == 0 || this.nameAppendFollowText.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C56906MVa.resetTitleMaxLine$default(this, textView, z2, false, 4, null);
        MXH.LIZIZ(this.LJLJJI, new SpannableStringBuilder(this.mContext.getString(R.string.ewv)), notice, 7, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 148.0f)));
        markUnreadIfNeed(notice.hasRead, this.itemView, z);
    }
}
