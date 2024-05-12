package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C16880lQ;
import X.C70657RoD;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class BaseNotice {
    public static final int CREATOR = 62;
    public static final int RECOMMEND_LIVE = 50;

    @InterfaceC65349Pkn("account_type")
    public String accountType;

    @InterfaceC65349Pkn("ad")
    public AdHelperNotice adHelperNotice;

    @InterfaceC65349Pkn("announcement")
    public AnnouncementNotice announcement;

    @InterfaceC65349Pkn("at")
    public AtMe atMe;

    @InterfaceC65349Pkn("biz_notice")
    public BusinessAccountNotice businessAccountNotice;

    @InterfaceC65349Pkn("category_title")
    public String categoryTitle;

    @InterfaceC65349Pkn("channel_category")
    public int channelCategory;

    @InterfaceC65349Pkn("channel_info")
    public NoticeChannelInfo channelInfo;

    @InterfaceC65349Pkn("check_profile")
    public CheckProfileNotice checkProfileNotice;

    @InterfaceC65349Pkn("comment")
    public CommentNotice commentNotice;

    @InterfaceC65349Pkn("create_time")
    public long createTime;
    public String dataSourceInterfaceName;

    @InterfaceC65349Pkn("digg")
    public DiggNotice diggNotice;

    @InterfaceC65349Pkn("donation")
    public DonationNotice donationNotice;

    @InterfaceC65349Pkn("duet")
    public DuetNotice duetNotice;

    @InterfaceC65349Pkn("follow_request_approve")
    public FollowApproveNotice followApproveNotice;

    @InterfaceC65349Pkn("follow")
    public FollowNotice followNotice;

    @InterfaceC65349Pkn("follow_request")
    public FollowRequestNotice followRequestNotice;

    @InterfaceC65349Pkn("friend")
    public FriendNotice friendNotice;

    @InterfaceC65349Pkn("has_read")
    public boolean hasRead;
    public transient long lastReadTime;
    public transient LogPbBean logPbBean;

    @InterfaceC65349Pkn("lowest_position")
    public int lowestPosition;
    public transient boolean needCollapse;

    @InterfaceC65349Pkn("nid")
    public String nid;

    @InterfaceC65349Pkn("frequency_configs")
    public List<NoticeFrequencyControlConfig> noticeFrequencyList;
    public transient int noticeListType;

    @InterfaceC65349Pkn("create_aweme")
    public PostNotice postNotice;
    public transient int priority;

    @InterfaceC65349Pkn("promote_notice")
    public PromoteNotice promoteNotice;

    @InterfaceC65349Pkn("task_id")
    public long taskId;

    @InterfaceC65349Pkn("tcm_notice")
    public TcmNotice tcmNotice;

    @InterfaceC65349Pkn("template_id")
    public String templateId;

    @InterfaceC65349Pkn("template_notice")
    public GeneralTemplateNotice templateNotice;

    @InterfaceC65349Pkn("text")
    public UserTextNotice textNotice;

    @InterfaceC65349Pkn("type")
    public int type;
    public transient int unreadCount;

    @InterfaceC65349Pkn("unsubscribed_status")
    public int unsubscribedStatus;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    @InterfaceC65349Pkn("vote_notice")
    public VoteNotice voteNotice;
    public transient int timeLineType = -1;
    public transient int clientOrder = -1;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.type), this.nid, Long.valueOf(this.createTime), Boolean.valueOf(this.hasRead), this.followNotice});
    }

    public String getAccountType() {
        JSONObject jSONObject;
        boolean z;
        AnnouncementNotice announcementNotice;
        CommentNotice commentNotice;
        if (TextUtils.isEmpty(this.accountType)) {
            GeneralTemplateNotice generalTemplateNotice = this.templateNotice;
            String str = "";
            if (generalTemplateNotice != null) {
                try {
                    String str2 = generalTemplateNotice.messageExtra;
                    if (str2 != null) {
                        jSONObject = new JSONObject(str2);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    str = jSONObject.optString("account_type");
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                o.LJIIIIZZ(str, "{\n            getAccount…eFromTemplate()\n        }");
            } else {
                boolean z2 = true;
                if (this.type == 31 && (commentNotice = this.commentNotice) != null && commentNotice.isReplyWithVideo()) {
                    z = true;
                } else {
                    z = false;
                }
                Integer num = null;
                if (z) {
                    CommentNotice commentNotice2 = this.commentNotice;
                    if (commentNotice2 != null) {
                        num = Integer.valueOf(commentNotice2.getCommentType());
                    }
                    if (num == null || num.intValue() != 17) {
                        if (num == null || num.intValue() != 18) {
                            if (num != null && num.intValue() == 19) {
                                str = "video_reply_like";
                            }
                        } else {
                            str = "video_reply_reply";
                        }
                    } else {
                        str = "video_reply_comment";
                    }
                } else {
                    int i = this.type;
                    if (i == 41) {
                        str = "like";
                    } else if (i == 31) {
                        str = "comment";
                    } else if (i == 45) {
                        str = "at";
                    } else if (i == 21) {
                        str = "duet";
                    } else if (i == 33) {
                        FollowNotice followNotice = this.followNotice;
                        if (followNotice != null) {
                            Integer valueOf = Integer.valueOf(followNotice.getFollowFrom());
                            if (valueOf.intValue() != 3) {
                                z2 = false;
                            }
                            if (z2) {
                                num = valueOf;
                            }
                            if (num != null) {
                                num.intValue();
                                str = "now_link_follow";
                            }
                        }
                        str = "fans";
                    } else if (i == 23) {
                        str = "follow_accept";
                    } else {
                        if ((i != 1 && i != 11) || (announcementNotice = this.announcement) == null || announcementNotice.getChallenge() == null) {
                            z2 = false;
                        }
                        str = z2 ? "tag" : String.valueOf(this.type);
                    }
                }
            }
            this.accountType = str;
        }
        return this.accountType;
    }

    public String getLabelText() {
        DiggNotice diggNotice = this.diggNotice;
        if (diggNotice != null) {
            return diggNotice.getLabelText();
        }
        AtMe atMe = this.atMe;
        if (atMe != null) {
            return atMe.getLabelText();
        }
        CommentNotice commentNotice = this.commentNotice;
        if (commentNotice != null) {
            return commentNotice.getLabelText();
        }
        return "";
    }

    public boolean isUnsubscribe() {
        if (this.unsubscribedStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean needForceInsert() {
        int i = this.type;
        if ((i == 1 || i == 2 || i == 1002) && this.lowestPosition > 0) {
            return true;
        }
        return false;
    }

    public boolean supportUnsubscribe() {
        if (this.unsubscribedStatus != 0) {
            return true;
        }
        return false;
    }

    public String unsubscribeStatusToMob() {
        int i = this.unsubscribedStatus;
        if (i == 1) {
            return "unsubscribed";
        }
        if (i == 2) {
            return "subscribed";
        }
        return "normal";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.type == baseNotice.type && C70657RoD.LJII(this.nid, baseNotice.nid) && this.createTime == baseNotice.createTime && this.hasRead == baseNotice.hasRead && C70657RoD.LJII(this.followNotice, baseNotice.followNotice)) {
            return true;
        }
        return false;
    }

    public void setAccountType(String str) {
        this.accountType = str;
    }

    public void updateUnsubscribeStatus(Boolean bool) {
        if (bool.booleanValue()) {
            this.unsubscribedStatus = 1;
        } else {
            this.unsubscribedStatus = 2;
        }
    }
}
