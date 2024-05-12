package com.ss.android.ugc.aweme.profile.viewer.ui;

import X.AbstractC13940gg;
import X.C107724Kq;
import X.C119354mJ;
import X.C12460eI;
import X.C16880lQ;
import X.C187917Zb;
import X.C1FL;
import X.C221108m2;
import X.C226668v0;
import X.C226908vO;
import X.C226958vT;
import X.C227768wm;
import X.C3KP;
import X.C4FY;
import X.C51029K0z;
import X.C53341Kwb;
import X.C57362MfG;
import X.C57364MfI;
import X.C58049MqL;
import X.C58050MqM;
import X.C62822Ol8;
import X.C78939UyV;
import X.C78946Uyc;
import X.C78983UzD;
import X.C7ZI;
import X.C7ZT;
import X.C88473db;
import X.EnumC112364b2;
import X.EnumC112374b3;
import X.EnumC112664bW;
import X.EnumC112694bZ;
import X.EnumC112754bf;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57435MgR;
import X.EnumC88493dd;
import X.FT5;
import X.InterfaceC100393wp;
import X.InterfaceC112734bd;
import X.OSZ;
import X.OUP;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.viewer.api.ProfileViewerInfo;
import com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerCell;
import com.ss.android.ugc.aweme.profile.viewer.viewmodel.ProfileViewerViewModel;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS41S1000000_3;
import kotlin.jvm.internal.o;
import n.b;

/* loaded from: classes4.dex */
public final class ProfileViewerCell extends PowerCell<C187917Zb> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 825));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 817));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 823));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 814));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 824));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 820));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 819));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 815));
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

    public static boolean V() {
        C62822Ol8 c62822Ol8 = C226958vT.LIZ;
        if ((((Number) c62822Ol8.getValue()).intValue() != 1 && ((Number) c62822Ol8.getValue()).intValue() != 2) || !C7ZI.LIZJ()) {
            return false;
        }
        return true;
    }

    public final void M() {
        ProfileViewerInfo profileViewerInfo;
        User user;
        MutualStruct mMutualStruct;
        String recommendReason;
        List<MutualUser> userList;
        boolean z;
        String str;
        ProfileViewerInfo profileViewerInfo2;
        User user2;
        ActivityStatus activityStatus;
        ActivityStatus activityStatus2;
        C187917Zb item = getItem();
        if (item == null || (profileViewerInfo = item.LJLIL) == null || (user = profileViewerInfo.user) == null) {
            return;
        }
        if (C226908vO.LIZIZ()) {
            C187917Zb item2 = getItem();
            if (item2 != null) {
                activityStatus2 = item2.LJLJJI;
            } else {
                activityStatus2 = null;
            }
            U(user, String.valueOf(N(activityStatus2)));
        } else {
            U(user, null);
        }
        T(EnumC57365MfJ.ENTER_PROFILE);
        if (C226908vO.LIZIZ()) {
            C107724Kq c107724Kq = new C107724Kq(getCurrentLifecycleOwner());
            c107724Kq.LIZLLL = "profile_visitor_list";
            C187917Zb item3 = getItem();
            if (item3 != null && (activityStatus = item3.LJLJJI) != null) {
                z = OUP.LJJII(activityStatus, null, null, 3);
            } else {
                z = false;
            }
            c107724Kq.LJI = Boolean.valueOf(z);
            c107724Kq.LIZIZ = EnumC112364b2.PROFILE_VISITOR_LIST;
            c107724Kq.LJ = "profile";
            C187917Zb item4 = getItem();
            if (item4 == null || (profileViewerInfo2 = item4.LJLIL) == null || (user2 = profileViewerInfo2.user) == null || (str = user2.getUid()) == null) {
                str = "";
            }
            c107724Kq.LIZJ = str;
            C78946Uyc.LJJIJIIJI(this, c107724Kq);
        }
        UserProfilePreloadHelper.LJIIIIZZ().LIZJ(user);
        Activity LIZ = FT5.LIZ(this.itemView, "itemView.context");
        if (LIZ == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aweme://user/profile/");
        LIZ2.append(user.getUid());
        SmartRoute buildRoute = SmartRouter.buildRoute(LIZ, X1D.LIZIZ(LIZ2));
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", "profile_visitor_list");
        buildRoute.withParam("extra_from_pre_page", "profile_visitor_list");
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null && (((mMutualStruct = matchedFriendStruct.getMMutualStruct()) != null && (userList = mMutualStruct.getUserList()) != null && !userList.isEmpty()) || ((recommendReason = matchedFriendStruct.getRecommendReason()) != null && recommendReason.length() != 0))) {
            buildRoute.withParam("recommend_enter_profile_params", new C57364MfI("profile_visitor_list", Q().LJLLI, EnumC57366MfK.CARD, user.getRecType(), C78983UzD.LJJIII(user), user.getUid(), null, null, user.getRequestId(), null, user.getFriendTypeStr(), user.getSocialInfo(), null, null, null, null, false, null, null, null, null, false, null, false, 16773120, null));
        }
        buildRoute.open();
    }

    public final TuxTextView P() {
        return (TuxTextView) this.LJLJJL.getValue();
    }

    public final ProfileViewerViewModel Q() {
        return (ProfileViewerViewModel) this.LJLIL.getValue();
    }

    public ProfileViewerCell() {
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 816));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 822));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 821));
    }

    public final void X() {
        ProfileViewerInfo profileViewerInfo;
        User user;
        ActivityStatus activityStatus;
        C187917Zb item = getItem();
        if (item == null || (profileViewerInfo = item.LJLIL) == null || (user = profileViewerInfo.user) == null || user.getFollowStatus() != EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
            return;
        }
        InterfaceC112734bd imNudgeAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics();
        C187917Zb item2 = getItem();
        if (item2 != null) {
            activityStatus = item2.LJLJJI;
        } else {
            activityStatus = null;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics().LIZJ("profile_visitor_list", EnumC112374b3.PROFILE_VISITOR_LIST.getValue(), EnumC112754bf.SHOW.getValue(), imNudgeAnalytics.LIZIZ(activityStatus), user.getUid());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.8ux
            public final C226648uy LJ = C226648uy.LJLIL;
            public InterfaceC65784Pro<String> LJFF;
            public final C226628uw LJI;

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ java.util.Map LJFF() {
                return null;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJI;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.8uw] */
            {
                this.LJFF = new AqS153S0100000_3(this, 818);
                this.LJI = new InterfaceC19530ph() { // from class: X.8uw
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        String str;
                        ProfileViewerInfo profileViewerInfo;
                        User user;
                        ProfileViewerInfo profileViewerInfo2;
                        User user2;
                        ProfileViewerCell profileViewerCell;
                        C187917Zb item;
                        ProfileViewerInfo profileViewerInfo3;
                        User user3;
                        C187917Zb item2;
                        List<String> list;
                        int size;
                        TuxTextView P;
                        User user4;
                        ActivityStatus activityStatus;
                        ProfileViewerInfo profileViewerInfo4;
                        ProfileViewerInfo profileViewerInfo5;
                        User user5;
                        int i;
                        ActivityStatus activityStatus2;
                        C187917Zb item3;
                        List<String> list2;
                        o.LJIIIZ(itemID, "itemID");
                        ProfileViewerCell.this.T(EnumC57365MfJ.SHOW);
                        ProfileViewerCell profileViewerCell2 = ProfileViewerCell.this;
                        C187917Zb item4 = profileViewerCell2.getItem();
                        String str2 = null;
                        if (item4 != null && (profileViewerInfo5 = item4.LJLIL) != null && (user5 = profileViewerInfo5.user) != null) {
                            TuxTextView P2 = profileViewerCell2.P();
                            if (P2 != null && P2.getVisibility() == 0 && (item3 = profileViewerCell2.getItem()) != null && (list2 = item3.LJLILLLLZI) != null) {
                                i = list2.size();
                            } else {
                                i = 0;
                            }
                            String str3 = "";
                            if (C226908vO.LIZIZ()) {
                                String str4 = profileViewerCell2.Q().LJLLI;
                                if (str4 != null) {
                                    str3 = str4;
                                }
                                String uid = user5.getUid();
                                o.LJIIIIZZ(uid, "viewerUser.uid");
                                String LJIJ = C227768wm.LJIJ(user5);
                                C187917Zb item5 = profileViewerCell2.getItem();
                                if (item5 != null) {
                                    activityStatus2 = item5.LJLJJI;
                                } else {
                                    activityStatus2 = null;
                                }
                                C26335AVf.LJIIZILJ(i, str3, uid, LJIJ, String.valueOf(ProfileViewerCell.N(activityStatus2)));
                            } else {
                                String str5 = profileViewerCell2.Q().LJLLI;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                String uid2 = user5.getUid();
                                o.LJIIIIZZ(uid2, "viewerUser.uid");
                                C26335AVf.LJIIZILJ(i, str3, uid2, C227768wm.LJIJ(user5), null);
                            }
                        }
                        if (C226908vO.LIZIZ()) {
                            ProfileViewerCell profileViewerCell3 = ProfileViewerCell.this;
                            C187917Zb item6 = profileViewerCell3.getItem();
                            if (item6 != null && (profileViewerInfo4 = item6.LJLIL) != null) {
                                user4 = profileViewerInfo4.user;
                            } else {
                                user4 = null;
                            }
                            C187917Zb item7 = profileViewerCell3.getItem();
                            if (item7 != null) {
                                activityStatus = item7.LJLJJI;
                            } else {
                                activityStatus = null;
                            }
                            C78946Uyc.LJJIJIL(profileViewerCell3, user4, activityStatus, EnumC112364b2.PROFILE_VISITOR_LIST);
                        }
                        ProfileViewerCell.this.getClass();
                        if (ProfileViewerCell.V()) {
                            ProfileViewerCell.this.X();
                        }
                        C243119gR.LIZ(new AqS41S1000000_3(ProfileViewerCell.this.Q().LJLLI, 1));
                        if (C7ZT.LIZLLL() && (item = (profileViewerCell = ProfileViewerCell.this).getItem()) != null && (profileViewerInfo3 = item.LJLIL) != null && (user3 = profileViewerInfo3.user) != null && (item2 = profileViewerCell.getItem()) != null && (list = item2.LJLILLLLZI) != null && (size = list.size()) >= 1 && (P = profileViewerCell.P()) != null && P.getVisibility() == 0) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", "profile_visitor_list");
                            c188727au.LIZLLL(size, "unread_num");
                            c188727au.LJIIIZ("to_user_id", user3.getUid());
                            c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(user3));
                            FMX.LJIIL("unread_post_show", c188727au.LIZ);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("the expose cell's is ");
                        C187917Zb item8 = ProfileViewerCell.this.getItem();
                        if (item8 != null && (profileViewerInfo2 = item8.LJLIL) != null && (user2 = profileViewerInfo2.user) != null) {
                            str = user2.getNickname();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        LIZ.append(" : ");
                        C187917Zb item9 = ProfileViewerCell.this.getItem();
                        if (item9 != null && (profileViewerInfo = item9.LJLIL) != null && (user = profileViewerInfo.user) != null) {
                            str2 = user.getUid();
                        }
                        LIZ.append(str2);
                        C221018lt.LIZ("ProfileViewerCell", X1D.LIZIZ(LIZ));
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJFF = interfaceC65784Pro;
            }
        });
    }

    public static int N(ActivityStatus activityStatus) {
        return IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics().LIZ(activityStatus);
    }

    public final void L(C187917Zb c187917Zb) {
        List<String> list;
        String valueOf;
        Context context = this.itemView.getContext();
        if (context != null && (list = c187917Zb.LJLILLLLZI) != null && (!list.isEmpty())) {
            if (list.size() > 10) {
                valueOf = "10+";
            } else {
                valueOf = String.valueOf(list.size());
            }
            String quantityString = context.getResources().getQuantityString(R.plurals.ud, list.size(), valueOf);
            o.LJIIIIZZ(quantityString, "context.resources.getQua…ubtitle, it.size, newNum)");
            TuxTextView P = P();
            if (P != null) {
                P.setText(quantityString);
            }
            TuxTextView P2 = P();
            if (P2 == null) {
                return;
            }
            P2.setVisibility(0);
        }
    }

    public final boolean T(EnumC57365MfJ enumC57365MfJ) {
        ProfileViewerInfo profileViewerInfo;
        User user;
        int parseInt;
        String str;
        C187917Zb item = getItem();
        if (item == null || (profileViewerInfo = item.LJLIL) == null || (user = profileViewerInfo.user) == null) {
            return false;
        }
        String LJIJ = C227768wm.LJIJ(user);
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJIIZI("profile_visitor_list");
        if (LJIJ.length() == 0) {
            parseInt = -1;
        } else {
            parseInt = CastIntegerProtector.parseInt(LJIJ);
        }
        c57362MfG.LJJJJZ = parseInt;
        c57362MfG.LJJJI(Q().LJLLI);
        c57362MfG.LJJJJIZL(user);
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        String str2 = null;
        if (matchedFriendStruct == null || (str = matchedFriendStruct.getRelationType()) == null) {
            str = "";
        }
        c57362MfG.LJJLIIIJLLLLLLLZ = str;
        MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            str2 = matchedFriendStruct2.getRecType();
        }
        c57362MfG.LJJJIL(str2);
        c57362MfG.LJIILIIL();
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C187917Zb c187917Zb) {
        ActivityStatus activityStatus;
        Context context;
        C187917Zb t = c187917Zb;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User user = t.LJLIL.user;
        if (C53341Kwb.LIZ()) {
            C16880lQ.LJJJJI((TuxTextView) this.LJLJI.getValue(), new ACListenerS23S0100000_3(this, 195));
            C88473db.LIZ(this.itemView, EnumC88493dd.CELL);
            C88473db.LIZ((View) this.LJLILLLLZI.getValue(), EnumC88493dd.AVATAR);
            C88473db.LIZ((View) this.LJLJI.getValue(), EnumC88493dd.USERNAME);
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, t, 62), this.itemView);
        C16880lQ.LJJIJLIJ((SmartImageView) this.LJLILLLLZI.getValue(), new ACListenerS23S0100000_3(this, 196));
        W5F LJII = W5U.LJII(C78939UyV.LJ(user.getAvatarThumb()));
        LJII.LIZIZ("ProfileViewerCell");
        LJII.LJJIIJ = (SmartImageView) this.LJLILLLLZI.getValue();
        S3I s3i = new S3I();
        s3i.LIZ = true;
        LJII.LJIJJLI = new S3L(s3i);
        LJII.LIZLLL = true;
        C16880lQ.LLJJJ(LJII);
        ((TextView) this.LJLJI.getValue()).setText(user.getNickname());
        View view = (View) this.LJLJJI.getValue();
        if (view != null) {
            view.setVisibility(8);
        }
        TuxTextView P = P();
        if (P != null) {
            P.setVisibility(8);
        }
        View view2 = (View) this.LJLJJLL.getValue();
        if (view2 != null) {
            view2.setVisibility(8);
        }
        int followStatus = t.LJLIL.user.getFollowStatus();
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOW_MUTUAL;
        if (followStatus == enumC57435MgR.getValue()) {
            if (C226908vO.LIZIZ() && t.LJLIL.user.getFollowStatus() == enumC57435MgR.getValue()) {
                View view3 = (View) this.LJLJJLL.getValue();
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                if (this.itemView.getContext() != null && (activityStatus = t.LJLJJI) != null) {
                    Context context2 = this.itemView.getContext();
                    o.LJIIIIZZ(context2, "itemView.context");
                    if (C3KP.LIZ(activityStatus, null, context2, 3).LJLILLLLZI != C4FY.NO_STATUS && (context = this.itemView.getContext()) != null && t.LJLJJI != null) {
                        TextView textView = (TextView) this.LJLJJI.getValue();
                        if (textView != null) {
                            textView.setText(C3KP.LIZ(t.LJLJJI, null, context, 3).LJLIL);
                        }
                        View view4 = (View) this.LJLJJI.getValue();
                        if (view4 != null) {
                            view4.setVisibility(0);
                        }
                    }
                }
            }
            if (C7ZT.LIZLLL()) {
                L(t);
            }
        } else if (followStatus == EnumC57435MgR.FOLLOWED.getValue()) {
            if (C7ZT.LIZ() == 1 || C7ZT.LIZ() == 3) {
                L(t);
            }
        } else {
            MatchedFriendStruct matchedFriendStruct = t.LJLIL.user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                View view5 = (View) this.LJLJJLL.getValue();
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                C58049MqL c58049MqL = (C58049MqL) this.LJLJJLL.getValue();
                if (c58049MqL != null) {
                    c58049MqL.LJJJJ(matchedFriendStruct, C58050MqM.LJFF);
                }
            }
        }
        if (V()) {
            RelationButton relationButton = (RelationButton) this.LJLJL.getValue();
            if (relationButton != null) {
                C226668v0 c226668v0 = new C226668v0();
                c226668v0.LIZ = t.LJLIL.user;
                c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_NUDGE);
                c226668v0.LJI.putAll(C51029K0z.LJJIIZI(new OSZ(enumC57435MgR, IMService.createIIMServicebyMonsterPlugin(false).getImNudgeService().LIZJ())));
                c226668v0.LJII.putAll(C51029K0z.LJJIIZI(new OSZ(enumC57435MgR, Boolean.TRUE)));
                EnumC112664bW nudgeScenario = EnumC112664bW.PROFILE_VIEWER;
                o.LJIIIZ(nudgeScenario, "nudgeScenario");
                c226668v0.LJIILIIL = nudgeScenario;
                c226668v0.LJIIIIZZ = true;
                relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                relationButton.setTracker(new AqS150S0200000_3(this, t, 61));
                relationButton.setDataChangeListener(new AqS169S0100000_3(this, 676));
            }
        } else {
            RelationButton relationButton2 = (RelationButton) this.LJLJL.getValue();
            if (relationButton2 != null) {
                C226668v0 c226668v02 = new C226668v0();
                c226668v02.LIZ = t.LJLIL.user;
                c226668v02.LJIIIIZZ = true;
                relationButton2.LLIIIJ.LJJJJJL(c226668v02.LIZ());
            }
            RelationButton relationButton3 = (RelationButton) this.LJLJL.getValue();
            if (relationButton3 != null) {
                relationButton3.setTracker(new AqS153S0100000_3(this, 1481));
            }
        }
        ActivityStatus activityStatus2 = t.LJLJJI;
        if (activityStatus2 != null && OUP.LJJII(activityStatus2, null, null, 3) && C226908vO.LIZIZ()) {
            ((C119354mJ) this.LJLJLJ.getValue()).setActive(true);
            ((View) this.LJLJLJ.getValue()).setVisibility(0);
        } else {
            ((View) this.LJLJLJ.getValue()).setVisibility(8);
        }
        if (t.LJLIL.isUnRead && !((Set) Q().LJLJI.getValue()).contains(t.LJLIL.user.getUid())) {
            View view6 = this.itemView;
            view6.setBackgroundColor(b.LIZIZ(R.attr.dd, view6.getContext()));
        } else {
            View view7 = this.itemView;
            view7.setBackgroundColor(b.LIZIZ(R.attr.cl, view7.getContext()));
        }
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLL.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(t.LJLIL.user);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        int i;
        o.LJIIIZ(parent, "parent");
        if (((Number) C226958vT.LIZ.getValue()).intValue() == 1) {
            i = R.layout.c5t;
        } else {
            i = R.layout.c5s;
        }
        return C1FL.LIZIZ(parent, i, parent, false, "from(parent.context)\n   …te(layout, parent, false)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r3 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(com.ss.android.ugc.aweme.profile.model.User r7, java.lang.String r8) {
        /*
            r6 = this;
            X.7au r4 = new X.7au
            r4.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "profile_visitor_list"
            r4.LJIIIZ(r1, r0)
            com.ss.android.ugc.aweme.profile.viewer.viewmodel.ProfileViewerViewModel r0 = r6.Q()
            java.lang.String r1 = r0.LJLLI
            java.lang.String r0 = "previous_page"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r7.getUid()
            java.lang.String r0 = "rec_uid"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r7.getUid()
            java.lang.String r0 = "to_user_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r7.getRequestId()
            java.lang.String r0 = "req_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = X.C227768wm.LJIJ(r7)
            java.lang.String r0 = "follow_status"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r7.getRecType()
            java.lang.String r0 = "rec_type"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r7.getFriendTypeStr()
            java.lang.String r0 = "relation_type"
            r4.LJIIIZ(r0, r1)
            X.Mm4 r0 = r6.getItem()
            X.7Zb r0 = (X.C187917Zb) r0
            r5 = 0
            if (r0 == 0) goto Lb9
            java.util.List<java.lang.String> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto Lb9
            int r1 = r0.size()
        L5e:
            java.lang.String r0 = "unread_num"
            r4.LIZLLL(r1, r0)
            com.bytedance.tux.input.TuxTextView r0 = r6.P()
            if (r0 == 0) goto Lb7
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb7
            r1 = 1
        L70:
            java.lang.String r0 = "is_unread_post_show"
            r4.LIZLLL(r1, r0)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L81
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L84
        L81:
            r1 = r2
            if (r3 == 0) goto L88
        L84:
            boolean r5 = r3.isConnected()
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.LJFF(r0, r1)
            if (r3 == 0) goto L97
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L9a
        L97:
            r1 = r2
            if (r3 == 0) goto La0
        L9a:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto Lb5
        La0:
            r4.LJIIIZ(r1, r2)
            X.C78866UxK.LJIILLIIL(r4, r7)
            if (r8 == 0) goto Lad
            java.lang.String r0 = "active_status"
            r4.LJI(r0, r8)
        Lad:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r1)
            return
        Lb5:
            r2 = r0
            goto La0
        Lb7:
            r1 = 0
            goto L70
        Lb9:
            r1 = 0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerCell.U(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }
}
