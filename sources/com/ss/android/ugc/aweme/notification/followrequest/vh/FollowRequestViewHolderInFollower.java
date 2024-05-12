package com.ss.android.ugc.aweme.notification.followrequest.vh;

import X.AJ9;
import X.AXU;
import X.C00F;
import X.C113554cx;
import X.C16880lQ;
import X.C39061g6;
import X.C45804HyK;
import X.C51698KQs;
import X.C53341Kwb;
import X.C53551Kzz;
import X.C56948MWq;
import X.C56950MWs;
import X.C56967MXj;
import X.C57362MfG;
import X.C57434MgQ;
import X.C58049MqL;
import X.C58050MqM;
import X.C61200O0e;
import X.C71799SFv;
import X.C78857UxB;
import X.C78939UyV;
import X.C7MY;
import X.C86V;
import X.C96533qb;
import X.C99W;
import X.E1X;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.InterfaceC221688my;
import X.InterfaceC51700KQu;
import X.InterfaceC51702KQw;
import X.KL2;
import X.MVP;
import X.MVR;
import X.MVV;
import X.MVY;
import X.MW5;
import X.MX5;
import X.OSZ;
import X.SY4;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.IDCListenerS246S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowRequestViewHolderInFollower extends MVY implements InterfaceC51702KQw {
    public final View acceptBtn;
    public final C71799SFv avatarView;
    public User curUser;
    public final View deleteBtn;
    public final TuxTextView descView;
    public String enterFrom;
    public C51698KQs followBlock;
    public final InterfaceC51700KQu followStatusView;
    public final MW5 mobHelper;
    public final TuxTextView nameView;
    public final C56967MXj relationBtn;
    public final MX5 removedListener;
    public C58049MqL tvMutualLabel;

    @Override // X.InterfaceC51702KQw
    public void onFollowFail(Exception exc) {
    }

    public final void onItemClicked() {
        Activity LJIJJ;
        String str;
        User user = this.curUser;
        if (user != null) {
            if (AXU.LIZJ(user)) {
                EnumC57366MfK enumC57366MfK = EnumC57366MfK.RELATION_LABEL;
                BaseNotice baseNotice = this.mMTBaseNotice;
                if (baseNotice != null) {
                    str = baseNotice.getAccountType();
                } else {
                    str = null;
                }
                enterProfileWithRecommendParams(user, "follow_request_page", "follow_request", enumC57366MfK, true, str);
                return;
            }
            Context context = this.itemView.getContext();
            if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
                return;
            }
            C61200O0e LIZLLL = C61200O0e.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://user/profile/");
            LIZ.append(user.getUid());
            C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
            c39061g6.LIZIZ("sec_user_id", user.getSecUid());
            c39061g6.LIZIZ("enter_from", "follow_request_page");
            LIZLLL.LJI(LJIJJ, c39061g6.LIZJ());
            LogHelper LJIIIIZZ = LogHelperImpl.LJIIIIZZ();
            String str2 = this.enterFrom;
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            LJIIIIZZ.LJII(user.getFollowStatus(), str2, uid);
        }
    }

    @Override // X.InterfaceC51702KQw
    public void onStartFollowOperation() {
    }

    private final void setDeleteStyle() {
        this.acceptBtn.setVisibility(0);
        if (C00F.LIZ(31744, 0, "tt_merge_follow_request_into_new_follower", true) == 2) {
            this.deleteBtn.setVisibility(0);
            return;
        }
        this.deleteBtn.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.acceptBtn.getLayoutParams();
        layoutParams.width = (int) KL2.LIZJ(this.itemView.getContext(), 88.0f);
        layoutParams.height = (int) KL2.LIZJ(this.itemView.getContext(), 28.0f);
        this.acceptBtn.setLayoutParams(layoutParams);
    }

    private final void setFollowBtnUIStyle() {
        ViewGroup.LayoutParams buttonLayoutParams = this.relationBtn.getButtonLayoutParams();
        buttonLayoutParams.width = (int) KL2.LIZJ(this.itemView.getContext(), 88.0f);
        buttonLayoutParams.height = (int) KL2.LIZJ(this.itemView.getContext(), 28.0f);
        this.relationBtn.setButtonLayoutParams(buttonLayoutParams);
        this.relationBtn.setButtonHorizontalPadding(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mobFollowApprove() {
        /*
            r8 = this;
            boolean r0 = X.E1X.LIZ()
            r2 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L8b
            r3 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r5] = r0
            java.util.Set r1 = X.C77275UUl.LJIIIIZZ(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.curUser
            if (r0 == 0) goto L89
            int r0 = r0.getFollowStatus()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L28:
            boolean r0 = X.ORZ.LJLJJI(r0, r1)
            if (r0 == 0) goto L8b
            r7 = 1
        L2f:
            r6 = 0
        L30:
            X.7au r4 = new X.7au
            r4.<init>()
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.curUser
            if (r0 == 0) goto L3d
            java.lang.String r2 = r0.getUid()
        L3d:
            java.lang.String r0 = "to_user_id"
            r4.LJIIIZ(r0, r2)
            java.lang.String r1 = r8.enterFrom
            java.lang.String r0 = "enter_from"
            r4.LJIIIZ(r0, r1)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r6 == 0) goto L87
            r1 = r3
        L50:
            java.lang.String r0 = "has_label"
            r4.LJIIIZ(r0, r1)
            if (r7 == 0) goto L85
        L57:
            java.lang.String r0 = "has_follow_tag"
            r4.LJIIIZ(r0, r3)
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.curUser
            if (r0 == 0) goto L75
            int r0 = r0.getFollowStatus()
            if (r0 != r5) goto L75
            java.lang.String r1 = "mutual"
        L68:
            java.lang.String r0 = "follow_type"
            r4.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "follow_approve"
            X.FMX.LJIIL(r0, r1)
            return
        L75:
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.curUser
            if (r0 == 0) goto L82
            int r0 = r0.getFollowStatus()
            if (r0 != 0) goto L82
            java.lang.String r1 = ""
            goto L68
        L82:
            java.lang.String r1 = "single"
            goto L68
        L85:
            r3 = r2
            goto L57
        L87:
            r1 = r2
            goto L50
        L89:
            r0 = r2
            goto L28
        L8b:
            r7 = 0
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.curUser
            if (r0 == 0) goto L2f
            boolean r0 = X.AXU.LIZJ(r0)
            if (r0 != r5) goto L2f
            r6 = 1
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.followrequest.vh.FollowRequestViewHolderInFollower.mobFollowApprove():void");
    }

    @Override // X.MVY
    public User getUserFromNotice() {
        return this.curUser;
    }

    private final boolean useFollowMsgStyle(User user) {
        if (user.getFollowFrom() == 29 && C78857UxB.LJJJIL(user.getFollowFromMsg())) {
            return true;
        }
        return false;
    }

    @Override // X.MVY, X.MVV
    public void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.avatarView);
        applyTitleSize(c96533qb, this.nameView);
        applyContentColor(c96533qb, this.descView);
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            C56967MXj c56967MXj = this.relationBtn;
            resetViewTopMargin(c56967MXj, getViewTopMarginAddSpace(c56967MXj, MVV.LARGE_AVATAR_ADD_SPACE));
        }
    }

    @Override // X.InterfaceC51702KQw
    public void onFollowSuccess(FollowStatus followStatus) {
        if (followStatus != null) {
            IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJI(followStatus);
            if (2 == followStatus.followStatus) {
                InterfaceC221688my imSayhiAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getImSayhiAnalytics();
                String str = followStatus.userId;
                Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "follow_request_page"));
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                imSayhiAnalytics.LIZ(str, LJJLIIIIJ, C57434MgQ.LIZIZ(context), false);
            }
        }
    }

    public final void showFollowBtn(boolean z, User user) {
        if (z) {
            this.acceptBtn.setVisibility(8);
            this.deleteBtn.setVisibility(8);
            this.relationBtn.setVisibility(0);
            user.setFollowerStatus(1);
            setFollowBtnUIStyle();
            if (user.getFollowStatus() == 1) {
                user.setFollowStatus(2);
            }
            if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
                MW5 mw5 = this.mobHelper;
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                String accurateRecType = user.getAccurateRecType();
                if (accurateRecType == null) {
                    accurateRecType = "";
                }
                String str = this.enterFrom;
                mw5.getClass();
                MW5.LIZ(uid, accurateRecType, str);
            }
            C51698KQs c51698KQs = this.followBlock;
            if (c51698KQs != null) {
                c51698KQs.LIZ(user);
            }
            C51698KQs c51698KQs2 = this.followBlock;
            if (c51698KQs2 != null) {
                c51698KQs2.LJLJL = new C56948MWq(user, this);
                return;
            }
            return;
        }
        setDeleteStyle();
        this.relationBtn.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowRequestViewHolderInFollower(View view, MX5 removedListener, MW5 mobHelper) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(removedListener, "removedListener");
        o.LJIIIZ(mobHelper, "mobHelper");
        this.removedListener = removedListener;
        this.mobHelper = mobHelper;
        this.enterFrom = "notification_page";
        KeyEvent.Callback findViewById = this.itemView.findViewById(R.id.ati);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.bt_follow_extra)");
        InterfaceC51700KQu interfaceC51700KQu = (InterfaceC51700KQu) findViewById;
        this.followStatusView = interfaceC51700KQu;
        View findViewById2 = this.itemView.findViewById(R.id.ati);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.bt_follow_extra)");
        C56967MXj c56967MXj = (C56967MXj) findViewById2;
        this.relationBtn = c56967MXj;
        View findViewById3 = this.itemView.findViewById(R.id.atc);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.bt_accept)");
        this.acceptBtn = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.atg);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.bt_delete)");
        this.deleteBtn = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.mq0);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_username)");
        TuxTextView tuxTextView = (TuxTextView) findViewById5;
        this.nameView = tuxTextView;
        View findViewById6 = this.itemView.findViewById(R.id.m4n);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_desc)");
        this.descView = (TuxTextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.f4h);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.iv_header)");
        C71799SFv c71799SFv = (C71799SFv) findViewById7;
        this.avatarView = c71799SFv;
        this.tvMutualLabel = (C58049MqL) this.itemView.findViewById(R.id.iuj);
        C51698KQs c51698KQs = new C51698KQs(interfaceC51700KQu, new C56950MWs(this));
        this.followBlock = c51698KQs;
        c51698KQs.LJLJJLL = this;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 28), this.itemView);
        C16880lQ.LJJIL(c71799SFv, new ACListenerS29S0100000_9(this, 29));
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS29S0100000_9(this, 30));
        this.itemView.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 2));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 31), findViewById4);
        if (C99W.LIZ) {
            boolean z = findViewById3 instanceof SY4;
            boolean z2 = findViewById4 instanceof SY4;
        }
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 32), findViewById3);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(this.itemView, MVP.CELL, 0.0f);
            MVR.LIZ(c71799SFv, MVP.AVATAR, 0.0f);
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        }
        c56967MXj.LJLLL = true;
        c56967MXj.LJLIL.getPaint().setTextSize(KL2.LIZJ(c56967MXj.LJLIL.getContext(), 13));
    }

    public final void onBind(User user, long j, int i, String enterFrom) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.curUser = user;
        this.enterFrom = enterFrom;
        if (user.getFollowerStatus() == 1) {
            showFollowBtn(true, user);
        } else {
            showFollowBtn(false, user);
        }
        this.nameView.setText(MVR.LIZIZ(user, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.mContext.getString(R.string.i8e));
        if (((Boolean) C53551Kzz.LIZJ.getValue()).booleanValue()) {
            addCreateTimeSpan(spannableStringBuilder, j);
        }
        this.descView.setText(spannableStringBuilder);
        AJ9.LJ(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.nameView);
        C71799SFv.LJIIJ(this.avatarView, C78939UyV.LJ(user.getAvatarMedium()), null, false, null, 126);
        MVY.checkAndGetStory$default(this, false, 1, null);
        if (E1X.LIZ() && user.getFollowStatus() == 1) {
            C58049MqL c58049MqL = this.tvMutualLabel;
            if (c58049MqL != null) {
                c58049MqL.setVisibility(0);
            }
            C58049MqL c58049MqL2 = this.tvMutualLabel;
            if (c58049MqL2 == null) {
                return;
            }
            c58049MqL2.setText(C86V.LJFF(R.string.cl_));
            return;
        }
        if (AXU.LIZJ(user)) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct == null) {
                return;
            }
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJJJIZL(user);
            c57362MfG.LJJIIZI("notification_page");
            c57362MfG.LJJJ("follow_request");
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
            c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
            c57362MfG.LJJJJI();
            c57362MfG.LJIILIIL();
            C58049MqL c58049MqL3 = this.tvMutualLabel;
            if (c58049MqL3 != null) {
                c58049MqL3.setVisibility(0);
            }
            C58049MqL c58049MqL4 = this.tvMutualLabel;
            if (c58049MqL4 == null) {
                return;
            }
            c58049MqL4.LJJJJ(matchedFriendStruct, C58050MqM.LJ);
            return;
        }
        C58049MqL c58049MqL5 = this.tvMutualLabel;
        if (c58049MqL5 == null) {
            return;
        }
        c58049MqL5.setVisibility(8);
    }

    public static /* synthetic */ void onBind$default(FollowRequestViewHolderInFollower followRequestViewHolderInFollower, User user, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "follow_request_page";
        }
        followRequestViewHolderInFollower.onBind(user, j, i, str);
    }
}
