package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.AqS76S1100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56916MVk extends MVY {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public boolean LJLIL;
    public final View LJLILLLLZI;
    public final AP9 LJLJI;
    public final TuxTextView LJLJJI;
    public final TextView LJLJJL;
    public final RelationButton LJLJJLL;
    public final C58049MqL LJLJL;
    public FollowNotice LJLJLJ;
    public BaseNotice LJLJLLL;
    public String LJLL;
    public String LJLLI;

    public final String N() {
        String str;
        User user;
        String charSequence = this.LJLJJLL.getText().toString();
        if (o.LJ(charSequence, this.mContext.getString(R.string.hcd))) {
            str = "open_now";
        } else if (o.LJ(charSequence, this.mContext.getString(R.string.hcc))) {
            str = "open_app";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            Context context = this.mContext;
            FollowNotice followNotice = this.LJLJLJ;
            if (followNotice != null) {
                user = followNotice.getUser();
            } else {
                user = null;
            }
            return C221658mv.LIZ(context, user);
        }
        return str;
    }

    public final String P() {
        Integer valueOf;
        FollowNotice followNotice = this.LJLJLJ;
        if (followNotice != null && (valueOf = Integer.valueOf(followNotice.getFollowFrom())) != null) {
            if (valueOf.intValue() == 1) {
                return "now_app";
            }
            if (valueOf.intValue() == 2) {
                return "now_feature";
            }
            if (valueOf.intValue() == 3) {
                return "now_link";
            }
        }
        return "";
    }

    @Override // X.MVY
    public final User getUserFromNotice() {
        FollowNotice followNotice = this.LJLJLJ;
        if (followNotice != null) {
            return followNotice.getUser();
        }
        return null;
    }

    public final boolean Q() {
        FollowNotice followNotice;
        User user;
        if (!C53551Kzz.LIZ() || ((RBX) HG3.LJIILL()).getCurUser().historyMaxFollowerCount >= C56717MNt.LIZ().getMaxFansDivide()) {
            return false;
        }
        BaseNotice baseNotice = this.LJLJLLL;
        if (baseNotice != null && (followNotice = baseNotice.followNotice) != null && (user = followNotice.getUser()) != null && user.getFollowStatus() == 2) {
            return false;
        }
        return true;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 415));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56916MVk(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = itemView.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById2;
        this.LJLJI = ap9;
        View findViewById3 = itemView.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLJJI = tuxTextView;
        View findViewById4 = itemView.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.iu_);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.relationBtn)");
        RelationButton relationButton = (RelationButton) findViewById5;
        this.LJLJJLL = relationButton;
        View findViewById6 = itemView.findViewById(R.id.iuj);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.relation_label)");
        this.LJLJL = (C58049MqL) findViewById6;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(ap9.getAvatarImageView(), MVP.AVATAR, 0.0f);
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        } else {
            MVR.LJ(findViewById);
            C7FA.LIZIZ(ap9);
        }
        C7FA.LIZIZ(relationButton);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        C16880lQ.LJJJJI(tuxTextView, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
        relationButton.setTuxFont(62);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLJI);
        applyTitleSize(c96533qb, this.LJLJJI);
        applyContentColor(c96533qb, this.LJLJJL);
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            RelationButton relationButton = this.LJLJJLL;
            resetViewTopMargin(relationButton, getViewTopMarginAddSpace(relationButton, MVV.LARGE_AVATAR_ADD_SPACE));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56916MVk.onClick(android.view.View):void");
    }

    @Override // X.C56906MVa
    public final void setNotificationGuideBundle(int i) {
        Bundle LIZ = C141415gn.LIZ("from_where", i);
        LIZ.putString("username", this.LJLJJI.getText().toString());
        FollowNotice followNotice = this.LJLJLJ;
        if (followNotice != null) {
            UrlModel avatarThumb = followNotice.getUser().getAvatarThumb();
            LIZ.putString("content", this.mContext.getString(R.string.iwo));
            LIZ.putSerializable("avatar_thumb", avatarThumb);
        }
        this.mNotificationGuideBundle = LIZ;
        this.isRecordNotificationGuideInto = true;
    }

    public final void M(BaseNotice notice, String str, String enterFrom, boolean z) {
        int i;
        FollowNotice followNotice;
        String str2;
        FollowNotice followNotice2;
        FollowNotice followNotice3;
        int i2;
        User user;
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(enterFrom, "enterFrom");
        FollowNotice followNotice4 = notice.followNotice;
        if (followNotice4 == null) {
            return;
        }
        this.LJLJLLL = notice;
        this.LJLL = str;
        this.LJLLI = enterFrom;
        this.LJLJLJ = followNotice4;
        User user2 = followNotice4.getUser();
        if (user2 != null) {
            this.LJLJI.setUserData(new UserVerify(user2.getAvatarThumb(), user2.getCustomVerify(), user2.getEnterpriseVerifyReason(), Integer.valueOf(user2.getVerificationType())));
            this.LJLJI.LIZ();
            TuxTextView tuxTextView = this.LJLJJI;
            tuxTextView.LJLLJ = true;
            setClickableNameText(tuxTextView, user2, this.LJLJLLL, str, enterFrom);
            if (C3U6.LIZ && user2.getFollowStatus() == 2) {
                InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                String uid = user2.getUid();
                o.LJIIIIZZ(uid, "it.uid");
                if (imSayHiService.LJII(uid)) {
                    InterfaceC57106Mb8 imSayHiService2 = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                    String uid2 = user2.getUid();
                    o.LJIIIIZZ(uid2, "it.uid");
                    imSayHiService2.LJ(user2.getFollowerStatus(), uid2, true);
                }
            }
            boolean LIZLLL = AXU.LIZLLL(user2);
            if (AXU.LIZLLL(user2)) {
                str2 = EnumC57366MfK.RELATION_LABEL.getType();
            } else {
                str2 = "";
            }
            RelationButton relationButton = this.LJLJJLL;
            C226668v0 c226668v0 = new C226668v0();
            c226668v0.LIZ = user2;
            if (!C34169Db3.LIZ() || !C54218LPq.LJLIL.LIZ() || (((followNotice2 = this.LJLJLJ) != null && (user = followNotice2.getUser()) != null && user.getFollowStatus() == 2) || (followNotice3 = this.LJLJLJ) == null || !followNotice3.isNowFollow())) {
                c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_ICE_BREAKING);
            } else {
                EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOW_MUTUAL;
                Context context = this.mContext;
                if (C54218LPq.LJLIL.LIZ() && !MWW.LIZIZ()) {
                    i2 = R.string.hcd;
                } else {
                    i2 = R.string.hcc;
                }
                String string = context.getString(i2);
                o.LJIIIIZZ(string, "context.getString(if (is…g.inbox_now_open_app_btn)");
                c226668v0.LJFF.putAll(C51029K0z.LJJIIZI(new OSZ(enumC57435MgR, new C112704ba(string, new AqS153S0100000_3(this, 558)))));
            }
            c226668v0.LJIIIZ = requireLifeCycleOwner();
            c226668v0.LJIIJJI = false;
            c226668v0.LJIIIIZZ = LIZLLL;
            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            this.LJLJJLL.setTracker(new AqS76S1100000_9(this, str2, 1));
            this.LJLJJLL.setFollowClickInterceptor(new C56926MVu(this, notice, user2, null));
            this.LJLJJLL.setFollowClickListener(new AqS164S0200000_1(user2, this, 11));
            this.LJLJJLL.setRequestListener(new AqS172S0200000_9(this, notice, 1));
            if (AXU.LIZLLL(user2)) {
                MatchedFriendStruct matchedFriendStruct = user2.getMatchedFriendStruct();
                if (matchedFriendStruct != null) {
                    C57362MfG c57362MfG = new C57362MfG();
                    c57362MfG.LJJJJIZL(user2);
                    c57362MfG.LJJIIZI("notification_page");
                    c57362MfG.LJJJ(AX5.LIZ);
                    c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
                    c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
                    c57362MfG.LJJJJI();
                    c57362MfG.LJIILIIL();
                    this.LJLJL.setVisibility(0);
                    this.LJLJL.LJJJJ(matchedFriendStruct, C58050MqM.LJIIIIZZ);
                }
            } else {
                this.LJLJL.setVisibility(8);
            }
        }
        resetContentTopMargin(this.LJLJJI, this.LJLJJL, this.LJLJL, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context2 = this.mContext;
        if (C34169Db3.LIZ() && C54218LPq.LJLIL.LIZ() && (followNotice = this.LJLJLJ) != null && followNotice.isNowFollow()) {
            i = R.string.hcb;
        } else {
            i = R.string.iwo;
        }
        CharSequence string2 = context2.getString(i);
        o.LJIIIIZZ(string2, "context.getString(\n     …on_follows_tip,\n        )");
        spannableStringBuilder.append(string2);
        if (((Boolean) C53551Kzz.LIZJ.getValue()).booleanValue()) {
            addCreateTimeSpan(spannableStringBuilder, notice);
        }
        this.LJLJJL.setText(spannableStringBuilder);
        MVY.checkAndGetStory$default(this, false, 1, null);
        markUnreadIfNeed(notice.hasRead, this.itemView, z);
    }
}
