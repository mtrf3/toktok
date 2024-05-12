package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.MVc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class ViewOnClickListenerC56908MVc extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public BaseNotice mBaseNotice;
    public InterfaceC56810MRi mClickListener;
    public Fragment mFragment;
    public boolean mIsRTL;
    public View mItemView;
    public LifecycleOwner mLifecycleOwner;
    public int mPosition;
    public java.util.Map<String, BaseNotice> mReadedNotices;
    public String mVcdToastText;
    public InterfaceC56771MPv vm;

    private boolean isStoryCommentNotice(int i) {
        return i == 23 || i == 25 || i == 26 || i == 27;
    }

    private boolean isStoryMentionNotice(int i) {
        return i == 54 || i == 55;
    }

    public String getExplainRelation() {
        return "";
    }

    public boolean isForwardType(int i) {
        return i == 7 || i == 8 || i == 9 || i == 10;
    }

    public boolean needLongClick() {
        return false;
    }

    public void onAttached() {
    }

    public void onDetached() {
    }

    public void onLifecycleSet() {
    }

    public int getWrappedLayoutPosition() {
        int bindingAdapterPosition;
        if (C52485Kin.LIZ) {
            bindingAdapterPosition = getLayoutPosition();
        } else {
            bindingAdapterPosition = getBindingAdapterPosition();
        }
        if (bindingAdapterPosition < 0) {
            return this.mPosition;
        }
        return bindingAdapterPosition;
    }

    public LifecycleOwner requireLifeCycleOwner() {
        if (this.mLifecycleOwner == null) {
            Object context = this.itemView.getContext();
            if (context instanceof C1AU) {
                return (LifecycleOwner) context;
            }
        }
        return this.mLifecycleOwner;
    }

    public int getWrappedAdapterPosition() {
        int adapterPosition = getAdapterPosition();
        if (adapterPosition < 0) {
            return this.mPosition;
        }
        return adapterPosition;
    }

    public boolean netInvalid() {
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_notification_vh_BaseNotificationHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(EF7.LIZIZ())) {
            C26045AKb c26045AKb = new C26045AKb(this.mItemView);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return true;
        }
        return false;
    }

    public void onItemClick() {
        int wrappedLayoutPosition = getWrappedLayoutPosition();
        InterfaceC56810MRi interfaceC56810MRi = this.mClickListener;
        if (interfaceC56810MRi != null && wrappedLayoutPosition > -1) {
            interfaceC56810MRi.onItemClick(wrappedLayoutPosition);
        }
    }

    public ViewOnClickListenerC56908MVc(View view) {
        super(view);
        this.mPosition = -1;
        this.mItemView = view;
        if (needLongClick()) {
            this.mItemView.setOnLongClickListener(this);
        }
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_notification_vh_BaseNotificationHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String matchAid(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = PatternProtector.compile("\\d+\\d$").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group();
    }

    public <T extends View> T findViewById(int i) {
        return (T) this.itemView.findViewById(i);
    }

    public String getCommentNotificationType(CommentNotice commentNotice) {
        if (commentNotice == null) {
            return "";
        }
        switch (commentNotice.getCommentType()) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 14:
                return "comment_a";
            case 12:
            case 15:
                return "comment_b";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return "comment_c";
            default:
                return "";
        }
    }

    public boolean isStoryDiggNotice(int i) {
        MOW mow = MOX.LIZ;
        mow.getClass();
        if (i != 9) {
            mow.getClass();
            if (i != 10) {
                return false;
            }
        }
        return true;
    }

    public void logNotificationActionFromPush(Context context) {
        Intent intent;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (intent = LJIJJ.getIntent()) != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "rule_id");
            if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("rule_id", LLJJIJIIJIL);
                FMX.LJIIL("enter_personal_detail_backup_from_push", c188727au.LIZ);
            }
        }
    }

    public void onClick(View view) {
        refreshReadState(true);
    }

    public boolean onLongClick(View view) {
        int wrappedLayoutPosition = getWrappedLayoutPosition();
        if (this.mClickListener != null && wrappedLayoutPosition > -1 && needLongClick()) {
            this.mClickListener.onItemLongClick(wrappedLayoutPosition);
            return true;
        }
        return true;
    }

    public void refreshReadState(boolean z) {
        java.util.Map<String, BaseNotice> map;
        BaseNotice baseNotice;
        if (z && (map = this.mReadedNotices) != null && (baseNotice = this.mBaseNotice) != null) {
            map.put(baseNotice.nid, baseNotice);
        }
    }

    public void setItemClickListener(InterfaceC56810MRi interfaceC56810MRi) {
        this.mClickListener = interfaceC56810MRi;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.mLifecycleOwner = lifecycleOwner;
        onLifecycleSet();
    }

    private void buildRelationTag(C56928MVw c56928MVw, List<User> list) {
        String str;
        User user;
        User user2;
        MatchedFriendStruct matchedFriendStruct;
        OSZ osz = null;
        if (list != null && (user2 = (User) ORZ.LJLLLL(list)) != null && (matchedFriendStruct = user2.getMatchedFriendStruct()) != null) {
            str = matchedFriendStruct.getRecType();
        } else {
            str = null;
        }
        c56928MVw.LJIL = str;
        if (list != null && list.size() <= 1 && list != null && (user = (User) ORZ.LJLLLL(list)) != null) {
            osz = new OSZ(Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()));
        }
        if (str != null && osz != null) {
            int intValue = ((Integer) osz.getFirst()).intValue();
            int intValue2 = ((Integer) osz.getSecond()).intValue();
            if (intValue == 0) {
                if (intValue2 == 0) {
                    c56928MVw.LJJ = "follow";
                } else {
                    c56928MVw.LJJ = "follow_back";
                }
            }
        }
    }

    public void buildAtParam(C56928MVw c56928MVw, BaseNotice baseNotice) {
        String str;
        AtMe atMe = baseNotice.atMe;
        if (atMe == null) {
            return;
        }
        c56928MVw.LJIIJJI = 0;
        c56928MVw.LJIIIIZZ = atMe.getUser().getUid();
        buildRelationTag(c56928MVw, Collections.singletonList(atMe.getUser()));
        Aweme aweme = atMe.getAweme();
        if (aweme != null) {
            c56928MVw.LJIJJ = aweme.getGroupId();
            String aid = aweme.getAid();
            if (!TextUtils.isEmpty(aid)) {
                c56928MVw.LJIJJ = aid;
                if (isStoryMentionNotice(atMe.getSubType())) {
                    str = "story";
                } else {
                    str = "post";
                }
                c56928MVw.LJIJJLI = str;
            }
        }
    }

    public void buildCommentParam(C56928MVw c56928MVw, BaseNotice baseNotice) {
        String str;
        CommentNotice commentNotice = baseNotice.commentNotice;
        if (commentNotice == null) {
            return;
        }
        Aweme aweme = commentNotice.getAweme();
        if (aweme != null) {
            String aid = aweme.getAid();
            if (!TextUtils.isEmpty(aid)) {
                c56928MVw.LJIJJ = aid;
                if (isStoryCommentNotice(commentNotice.getCommentType())) {
                    str = "story";
                } else {
                    str = "post";
                }
                c56928MVw.LJIJJLI = str;
            }
        }
        buildRelationTag(c56928MVw, Collections.singletonList(commentNotice.getComment().getUser()));
        c56928MVw.LJIIJJI = 0;
        c56928MVw.LJIIIIZZ = commentNotice.getComment().getUser().getUid();
        int commentType = commentNotice.getCommentType();
        if (commentType != 0 && commentType != 1) {
            if (commentType != 2 && commentType != 4) {
                if (commentType != 5) {
                    if (commentType != 6 && commentType != 8) {
                        if (commentType != 14 && commentType != 11) {
                            if (commentType != 12) {
                                return;
                            }
                        }
                    }
                }
            }
            c56928MVw.LJIIIZ = "comment";
            c56928MVw.LJIIJ = commentNotice.getForwardId();
            return;
        }
        c56928MVw.LJIIIZ = "video";
        c56928MVw.LJIIJ = commentNotice.getForwardId();
    }

    public void buildFansParam(C56928MVw c56928MVw, BaseNotice baseNotice) {
        FollowNotice followNotice = baseNotice.followNotice;
        User user = followNotice.getUser();
        c56928MVw.LJIIJJI = 0;
        c56928MVw.LJIIIIZZ = followNotice.getUser().getUid();
        int followStatus = followNotice.getUser().getFollowStatus();
        buildRelationTag(c56928MVw, Collections.singletonList(followNotice.getUser()));
        if (followStatus == 0) {
            c56928MVw.LJI = "follow";
        } else if (followStatus == 1 || followStatus == 2) {
            c56928MVw.LJI = "followed";
        }
        if (user != null && AXU.LIZLLL(user)) {
            c56928MVw.LJJIFFI = "1";
        }
    }

    public void buildLikeParam(C56928MVw c56928MVw, BaseNotice baseNotice) {
        List<User> users;
        String str;
        DiggNotice diggNotice = baseNotice.diggNotice;
        if (diggNotice == null || (users = diggNotice.getUsers()) == null || users.size() == 0) {
            return;
        }
        int mergeCount = diggNotice.getMergeCount();
        buildRelationTag(c56928MVw, users);
        if (mergeCount == 1) {
            c56928MVw.LJIIJJI = 0;
            c56928MVw.LJIIIIZZ = ((User) ListProtector.get(users, 0)).getUid();
        } else {
            c56928MVw.LJIIJJI = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < users.size(); i++) {
                User user = (User) ListProtector.get(users, i);
                if (i == users.size() - 1) {
                    sb.append(user.getUid());
                } else {
                    sb.append(user.getUid());
                    sb.append(",");
                }
            }
            c56928MVw.LJIIIIZZ = sb.toString();
        }
        if (diggNotice.getDiggType() == 3) {
            c56928MVw.LJIIIZ = "comment";
            c56928MVw.LJIIJ = diggNotice.getCid();
        } else {
            c56928MVw.LJIIIZ = "video";
            c56928MVw.LJIIJ = diggNotice.getForwardId();
        }
        Aweme aweme = diggNotice.getAweme();
        if (aweme == null) {
            return;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return;
        }
        c56928MVw.LJIJJ = aid;
        if (isStoryDiggNotice(diggNotice.getDiggType())) {
            str = "story";
        } else {
            str = "post";
        }
        c56928MVw.LJIJJLI = str;
    }

    public void bind(BaseNotice baseNotice, boolean z, String str) {
        this.mBaseNotice = baseNotice;
    }

    public void enterProfileAndCompareRecommendReason(Activity activity, User user, String str) {
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/profile/");
        LIZ.append(user.getUid());
        C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
        c39061g6.LIZIZ("enter_from", str);
        c39061g6.LIZIZ("sec_user_id", user.getSecUid());
        c39061g6.LIZIZ("previous_page", "message");
        c39061g6.LIZIZ("extra_previous_page_position", "other_places");
        c39061g6.LIZIZ("enter_method", "follow_button");
        c39061g6.LIZ(1, "need_track_compare_recommend_reason");
        c39061g6.LIZIZ("previous_recommend_reason", user.getRecommendReason());
        c39061g6.LIZIZ("recommend_from_type", "card");
        LIZLLL.LJI(activity, c39061g6.LIZJ());
    }

    public static void logEnterPersonalDetail(String str, String str2, String str3, String str4) {
        String str5 = AX5.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("position", str5);
        c188727au.LJIIIZ("account_type", str4);
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("enter_personal_detail", c188727au.LIZ);
    }

    public void bind(java.util.Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str) {
        this.mReadedNotices = map;
        bind(baseNotice, z, str);
    }

    public void bind(java.util.Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str, String str2) {
        this.mVcdToastText = str2;
        bind(map, baseNotice, z, str);
    }

    public void logNotificationAction(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3, String str4, String str5, int i2, User user) {
        logNotificationAction(str, str2, i, baseNotice, z, str3, str4, str5, i2, user, 0, "", "");
    }

    public void logNotificationAction(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3, String str4, String str5, int i2, User user, int i3, String str6, String str7) {
        String str8;
        DiggNotice diggNotice;
        Comment comment;
        MWH Kg0;
        if (baseNotice == null) {
            return;
        }
        C56928MVw c56928MVw = new C56928MVw();
        c56928MVw.LIZIZ = str;
        c56928MVw.LIZJ = str2;
        c56928MVw.LJII = baseNotice.createTime;
        c56928MVw.LJFF = str3;
        c56928MVw.LJIIL = baseNotice.logPbBean;
        c56928MVw.LJIILL = str4;
        c56928MVw.LJJII = i3;
        if (user != null) {
            if (!TextUtils.isEmpty(str6)) {
                c56928MVw.LJIILLIIL = str6;
            } else {
                c56928MVw.LJIILLIIL = C221658mv.LIZ(this.mItemView.getContext(), user);
            }
            c56928MVw.LJJI = C56923MVr.LIZLLL(user);
            c56928MVw.LJJIIZI = C200017t7.LIZ(user).getType();
        }
        int i4 = baseNotice.timeLineType;
        if (i4 != -1) {
            c56928MVw.LJIILIIL = MDT.LIZJ(i4);
            c56928MVw.LJIILJJIL = "1002";
        }
        if (!TextUtils.isEmpty(baseNotice.getLabelText())) {
            c56928MVw.LJIJ = baseNotice.getLabelText();
        }
        if (i != -1) {
            c56928MVw.LIZLLL = i;
        }
        if (!z) {
            str8 = "yellow_dot";
        } else {
            str8 = "";
        }
        c56928MVw.LJ = str8;
        if (!TextUtils.isEmpty(str5)) {
            c56928MVw.LJIIZILJ = str5;
        }
        if (!TextUtils.isEmpty(str7)) {
            c56928MVw.LJJIII = str7;
        }
        if (!TextUtils.isEmpty(baseNotice.nid)) {
            c56928MVw.LJJIIZ = baseNotice.nid;
        }
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null && (Kg0 = interfaceC56771MPv.Kg0()) != null) {
            c56928MVw.LJJIIJZLJL = Kg0;
        }
        str2.getClass();
        int hashCode = str2.hashCode();
        if (hashCode != 3123) {
            if (hashCode != 3135424) {
                if (hashCode != 3321751) {
                    if (hashCode == 950398559 && str2.equals("comment")) {
                        buildCommentParam(c56928MVw, baseNotice);
                    }
                } else if (str2.equals("like")) {
                    buildLikeParam(c56928MVw, baseNotice);
                }
            } else if (str2.equals("fans")) {
                buildFansParam(c56928MVw, baseNotice);
            }
        } else if (str2.equals("at")) {
            buildAtParam(c56928MVw, baseNotice);
        }
        if (i2 != -1) {
            c56928MVw.LJIJI = i2;
        }
        CommentNotice commentNotice = baseNotice.commentNotice;
        if ((commentNotice != null && (comment = commentNotice.getComment()) != null) || ((diggNotice = baseNotice.diggNotice) != null && (comment = diggNotice.getComment()) != null)) {
            c56928MVw.LJJIIJ = comment.getCid();
        }
        c56928MVw.LIZ("action_type", c56928MVw.LIZIZ);
        c56928MVw.LIZ("account_type", c56928MVw.LIZJ);
        c56928MVw.LIZ("client_order", String.valueOf(c56928MVw.LIZLLL));
        c56928MVw.LIZ("notice_type", c56928MVw.LJ);
        c56928MVw.LIZ("notification_type", c56928MVw.LJFF);
        c56928MVw.LIZ("message_time", String.valueOf(c56928MVw.LJII));
        c56928MVw.LIZ("from_user_id", c56928MVw.LJIIIIZZ);
        c56928MVw.LIZ("from_item", c56928MVw.LJIIIZ);
        c56928MVw.LIZ("from_item_id", c56928MVw.LJIIJ);
        c56928MVw.LIZ("is_together", String.valueOf(c56928MVw.LJIIJJI));
        c56928MVw.LIZ("enter_from", c56928MVw.LJIILL);
        c56928MVw.LIZ("with_follow_button", c56928MVw.LJJ);
        c56928MVw.LIZ("follow_status_to_user", c56928MVw.LJJI);
        c56928MVw.LIZ("rec_type", c56928MVw.LJIL);
        c56928MVw.LIZ("has_label", c56928MVw.LJJIFFI);
        if (!TextUtils.isEmpty(c56928MVw.LJIILJJIL)) {
            c56928MVw.LIZ("scene_id", c56928MVw.LJIILJJIL);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJIIZILJ)) {
            c56928MVw.LIZ("tab_name", c56928MVw.LJIIZILJ);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJIILIIL)) {
            c56928MVw.LIZ("timeline", c56928MVw.LJIILIIL);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJI)) {
            c56928MVw.LIZ("follow_button", c56928MVw.LJI);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJIJ)) {
            c56928MVw.LIZ("explain_relation", c56928MVw.LJIJ);
        }
        if (c56928MVw.LJIIL != null) {
            c56928MVw.LIZ("log_pb", GsonProtectorUtils.toJson(new Gson(), c56928MVw.LJIIL));
        }
        int i5 = c56928MVw.LJIJI;
        if (i5 != -1) {
            c56928MVw.LIZ("is_read", String.valueOf(i5));
        }
        if (!TextUtils.isEmpty(c56928MVw.LJIILLIIL)) {
            c56928MVw.LIZ("button_type", c56928MVw.LJIILLIIL);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJIJJ)) {
            c56928MVw.LIZ("group_id", c56928MVw.LJIJJ);
            c56928MVw.LIZ("story_type", c56928MVw.LJIJJLI);
        }
        if (!TextUtils.isEmpty(AX5.LIZ)) {
            c56928MVw.LIZ("position", AX5.LIZ);
        }
        if ("comment".equals(c56928MVw.LIZJ)) {
            c56928MVw.LIZ("parent_comment_length", String.valueOf(c56928MVw.LJJII));
        }
        if (!TextUtils.isEmpty(c56928MVw.LJJIII)) {
            c56928MVw.LIZ("follow_source", c56928MVw.LJJIII);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJJIIJ)) {
            c56928MVw.LIZ("comment_id", c56928MVw.LJJIIJ);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJJIIZ)) {
            c56928MVw.LIZ("content_id", c56928MVw.LJJIIZ);
        }
        if (!TextUtils.isEmpty(c56928MVw.LJJIIZI)) {
            c56928MVw.LIZ("follow_type", c56928MVw.LJJIIZI);
        }
        MWH mwh = c56928MVw.LJJIIJZLJL;
        if (mwh != null) {
            if (!TextUtils.isEmpty(mwh.LIZ)) {
                c56928MVw.LIZ("sort_option_name", c56928MVw.LJJIIJZLJL.LIZ);
            }
            if (!TextUtils.isEmpty(c56928MVw.LJJIIJZLJL.LIZIZ)) {
                c56928MVw.LIZ("notification_tab_name", c56928MVw.LJJIIJZLJL.LIZIZ);
            }
        }
        FMX.LJIIL("notification_message_inner_message", c56928MVw.LIZ);
    }
}
