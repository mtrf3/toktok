package com.ss.android.ugc.aweme.notification.followrequest.vh;

import X.AJ9;
import X.AXU;
import X.C113554cx;
import X.C16880lQ;
import X.C39061g6;
import X.C45804HyK;
import X.C51698KQs;
import X.C53341Kwb;
import X.C56331M8x;
import X.C56812MRk;
import X.C56949MWr;
import X.C56951MWt;
import X.C56967MXj;
import X.C57362MfG;
import X.C57434MgQ;
import X.C58049MqL;
import X.C58050MqM;
import X.C61200O0e;
import X.C71799SFv;
import X.C78857UxB;
import X.C78939UyV;
import X.C86V;
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
import X.MVY;
import X.MW5;
import X.MX5;
import X.O6R;
import X.OSZ;
import X.SY4;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.IDCListenerS246S0100000_9;
import android.app.Activity;
import android.content.Context;
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
public final class NewFollowRequestViewHolder extends MVY implements InterfaceC51702KQw {
    public final View mAcceptView;
    public final C71799SFv mAvatarView;
    public final View mDeleteView;
    public String mEnterFrom;
    public C51698KQs mFollowBlock;
    public final C56967MXj mFollowButton;
    public final InterfaceC51700KQu mFollowStatusView;
    public final TuxTextView mTvNameView;
    public final TuxTextView mTvNicknameView;
    public User mUser;
    public final MW5 mobHelper;
    public final MX5 removedListener;
    public C58049MqL tvMutualLabel;

    @Override // X.InterfaceC51702KQw
    public void onFollowFail(Exception exc) {
    }

    public final void onItemClicked() {
        Activity LJIJJ;
        String str;
        User user = this.mUser;
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
            String str2 = this.mEnterFrom;
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            LJIIIIZZ.LJII(-2, str2, uid);
        }
    }

    @Override // X.InterfaceC51702KQw
    public void onStartFollowOperation() {
    }

    private final void setFollowBtnUIStyle() {
        ViewGroup.LayoutParams buttonLayoutParams = this.mFollowButton.getButtonLayoutParams();
        buttonLayoutParams.width = O6R.LJJIIZ(KL2.LIZJ(this.itemView.getContext(), 136.0f));
        buttonLayoutParams.height = O6R.LJJIIZ(KL2.LIZJ(this.itemView.getContext(), 28.0f));
        if (o.LJ(this.mEnterFrom, "notification_page")) {
            buttonLayoutParams.width = C56812MRk.LIZIZ(this.mContext);
        }
        this.mFollowButton.setButtonLayoutParams(buttonLayoutParams);
        this.mFollowButton.setButtonHorizontalPadding(6);
    }

    @Override // X.MVY
    public User getUserFromNotice() {
        return this.mUser;
    }

    private final boolean useFollowMsgStyle(User user) {
        if (user.getFollowFrom() == 29 && C78857UxB.LJJJIL(user.getFollowFromMsg())) {
            return true;
        }
        return false;
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
            this.mAcceptView.setVisibility(8);
            this.mDeleteView.setVisibility(8);
            this.mFollowButton.setVisibility(0);
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
                String str = this.mEnterFrom;
                mw5.getClass();
                MW5.LIZ(uid, accurateRecType, str);
            }
            C51698KQs c51698KQs = this.mFollowBlock;
            if (c51698KQs != null) {
                c51698KQs.LIZ(user);
            }
            C51698KQs c51698KQs2 = this.mFollowBlock;
            if (c51698KQs2 != null) {
                c51698KQs2.LJLJL = new C56949MWr(user, this);
                return;
            }
            return;
        }
        this.mAcceptView.setVisibility(0);
        this.mDeleteView.setVisibility(0);
        this.mFollowButton.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFollowRequestViewHolder(View view, MX5 removedListener, MW5 mobHelper) {
        super(view);
        SY4 sy4;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(removedListener, "removedListener");
        o.LJIIIZ(mobHelper, "mobHelper");
        this.removedListener = removedListener;
        this.mobHelper = mobHelper;
        this.mEnterFrom = "follow_request_page";
        KeyEvent.Callback findViewById = this.itemView.findViewById(R.id.ati);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.bt_follow_extra)");
        InterfaceC51700KQu interfaceC51700KQu = (InterfaceC51700KQu) findViewById;
        this.mFollowStatusView = interfaceC51700KQu;
        View findViewById2 = this.itemView.findViewById(R.id.atc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.bt_accept)");
        this.mAcceptView = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.atg);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.bt_delete)");
        this.mDeleteView = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.mq0);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_username)");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.mTvNameView = tuxTextView;
        View findViewById5 = this.itemView.findViewById(R.id.mc3);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_nickname)");
        this.mTvNicknameView = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.f4h);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_header)");
        C71799SFv c71799SFv = (C71799SFv) findViewById6;
        this.mAvatarView = c71799SFv;
        View findViewById7 = this.itemView.findViewById(R.id.ati);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.bt_follow_extra)");
        this.mFollowButton = (C56967MXj) findViewById7;
        this.tvMutualLabel = (C58049MqL) this.itemView.findViewById(R.id.iuj);
        C51698KQs c51698KQs = new C51698KQs(interfaceC51700KQu, new C56951MWt(this));
        this.mFollowBlock = c51698KQs;
        c51698KQs.LJLJJLL = this;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 33), this.itemView);
        C16880lQ.LJJIL(c71799SFv, new ACListenerS29S0100000_9(this, 34));
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS29S0100000_9(this, 35));
        this.itemView.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 3));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 36), findViewById3);
        if (C99W.LIZ) {
            boolean z = findViewById2 instanceof SY4;
            if ((findViewById3 instanceof SY4) && (sy4 = (SY4) findViewById3) != null) {
                sy4.setButtonVariant(5);
            }
        }
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 37), findViewById2);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(this.itemView, MVP.CELL, 0.0f);
            MVR.LIZ(c71799SFv, MVP.AVATAR, 0.0f);
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        }
    }

    public final void onBind(User user, int i, String enterFrom) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.mUser = user;
        this.mEnterFrom = enterFrom;
        if (user.getFollowerStatus() == 1) {
            showFollowBtn(true, user);
        } else {
            showFollowBtn(false, user);
        }
        this.mTvNameView.setText(MVR.LIZIZ(user, false));
        if (((Boolean) E1X.LIZLLL.getValue()).booleanValue()) {
            this.mTvNicknameView.setVisibility(8);
        } else if (useFollowMsgStyle(user)) {
            TuxTextView tuxTextView = this.mTvNicknameView;
            tuxTextView.setText(user.getFollowFromMsg());
            tuxTextView.setSingleLine(false);
            tuxTextView.setMaxLines(Integer.MAX_VALUE);
        } else {
            this.mTvNicknameView.setText(C56331M8x.LIZ(user, true, false));
        }
        AJ9.LJ(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.mTvNameView);
        C71799SFv.LJIIJ(this.mAvatarView, C78939UyV.LJ(user.getAvatarMedium()), null, false, null, 126);
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

    public static /* synthetic */ void onBind$default(NewFollowRequestViewHolder newFollowRequestViewHolder, User user, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "follow_request_page";
        }
        newFollowRequestViewHolder.onBind(user, i, str);
    }
}
