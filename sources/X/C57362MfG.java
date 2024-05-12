package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MfG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57362MfG extends JHL<C57362MfG> {
    public static final /* synthetic */ int LJLLI = 0;
    public String LJJL;
    public EnumC57366MfK LJJLI;
    public EnumC57365MfJ LJJLIIIIJ;
    public EnumC199997t5 LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public final String LJJLIL;
    public final String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public String LJL;
    public boolean LJLI;
    public boolean LJLIIIL;
    public String LJLIIL;
    public int LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public java.util.Map<String, String> LJLL;

    public C57362MfG() {
        super("follow_recommend");
        this.LJJL = "";
        this.LJJLIIIJILLIZJL = "";
        this.LJJLIIIJJI = "";
        this.LJJLIIIJJIZ = "";
        this.LJJLIIIJL = "";
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJLIIJ = "";
        this.LJJLIL = "";
        this.LJJLJ = "";
        this.LJJLJLI = "";
        this.LJJLL = "";
        this.LJJZ = -1;
        this.LJJZZI = -1;
        this.LJJZZIII = -1;
        this.LJL = "";
        this.LJLIL = -1;
        this.LJLJJI = "";
        this.LJLJJL = -1;
        this.LJLJJLL = "";
        this.LJLJL = 1;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        String str2;
        String str3;
        boolean z;
        Aweme aweme;
        String str4;
        String str5 = this.LIZLLL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("enter_from", str5, c1799074g);
        LJ("previous_page", this.LJJL, c1799074g);
        EnumC57366MfK enumC57366MfK = this.LJJLI;
        String str6 = null;
        if (enumC57366MfK != null) {
            str = enumC57366MfK.getType();
        } else {
            str = null;
        }
        LJ("scene_type", str, c1799074g);
        EnumC57365MfJ enumC57365MfJ = this.LJJLIIIIJ;
        if (enumC57365MfJ != null) {
            str2 = enumC57365MfJ.getType();
        } else {
            str2 = null;
        }
        LJ("action_type", str2, c1799074g);
        LJ("rec_type", this.LJIJI, c1799074g);
        EnumC199997t5 enumC199997t5 = this.LJJLIIIJ;
        if (enumC199997t5 != null) {
            str6 = enumC199997t5.getType();
        }
        LJ("follow_type", str6, c1799074g);
        LJ("to_user_id", this.LJJLIIIJILLIZJL, c1799074g);
        LJ("group_id", this.LJJLIIIJJI, c1799074g);
        LJ("author_id", this.LJJLIIIJJIZ, c1799074g);
        LJ("req_id", this.LJJLIIIJL, c1799074g);
        LJ("homepage_user_id", this.LJJLIIIJLJLI, c1799074g);
        LJ("relation_type", this.LJJLIIIJLLLLLLLZ, c1799074g);
        LIZLLL("position", this.LJJLJLI);
        LIZJ(this.LJLJI, "is_landscape_screen");
        if (C78685UuP.LJJJZ(this.LJLJJI)) {
            LIZLLL("now_type", this.LJLJJI);
        }
        if (C78685UuP.LJJJZ(this.LJLJJLL)) {
            LIZLLL("is_now_clear", this.LJLJJLL);
        }
        LIZJ(this.LJLJL, "has_small_window");
        int i = this.LJJZ;
        String str7 = "1";
        if (i > 0) {
            LIZJ(i, "video_cover_num");
            if (this.LJLJLJ) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("video_cover_loaded", str4);
        }
        int i2 = this.LJJZZI;
        if (i2 != -1) {
            LIZJ(i2, "face_cover_num");
        }
        if (C78685UuP.LJJJZ(this.LJL)) {
            LIZLLL("video_num_type", this.LJL);
            LIZJ(this.LJJZZIII, "with_video_num");
        }
        if (!TextUtils.isEmpty(this.LJJLIIJ)) {
            LIZLLL("enter_method", this.LJJLIIJ);
        }
        if (this.LJJLL.length() > 0) {
            LIZLLL("extra_name", this.LJJLL);
        }
        if (this.LJJLI == EnumC57366MfK.ITEM) {
            Aweme aweme2 = this.LJJJJJ;
            if (aweme2 != null && aweme2.getIsTikTokStory()) {
                z = true;
            } else {
                z = false;
            }
            if (z || ((aweme = this.LJJJJJ) != null && aweme.getAwemeType() == 40)) {
                LIZLLL("story_type", "story");
            } else {
                LIZLLL("story_type", "post");
            }
        }
        if (this.LJLI) {
            LIZJ(1, "is_bigcard");
        }
        if (this.LJLIIIL) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_related_rec", str3);
        if (this.LJLIIIL) {
            LIZLLL("from_user_id", this.LJLIIL);
            LIZJ(this.LJLIL, "iterate_cnt");
        }
        int i3 = this.LJLJJL;
        if (i3 != -1) {
            LIZJ(i3, "is_new_suggested");
        }
        java.util.Map<String, String> map = this.LJLL;
        if (map != null && !map.isEmpty()) {
            LIZ(this.LJLL);
        }
        LIZJ(this.LJLJLLL, "has_badge");
        if (!this.LJLILLLLZI) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_from_local_list", str7);
    }

    public final void LJJIZ() {
        if (TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ) && TextUtils.isEmpty(this.LJIJI)) {
            return;
        }
        LJIILIIL();
    }

    public final void LJJJJI() {
        HashMap<String, String> mobParams;
        String str;
        Aweme aweme = this.LJJJJJ;
        if (aweme != null && this.LJJLI != null && (mobParams = aweme.getMobParams()) != null && (str = mobParams.get("scene_type")) != null) {
            try {
                this.LJJLI = LJJIJIL(str);
            } catch (IllegalArgumentException | Exception unused) {
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRecommendEvent(previousPage='");
        sb.append(this.LJJL);
        sb.append("', sceneType=");
        sb.append(this.LJJLI);
        sb.append(", recType=");
        sb.append(this.LJIJI);
        sb.append("actionType=");
        sb.append(this.LJJLIIIIJ);
        sb.append(", followType=");
        sb.append(this.LJJLIIIJ);
        sb.append(", toUserId='");
        sb.append(this.LJJLIIIJILLIZJL);
        sb.append("', groupId='");
        sb.append(this.LJJLIIIJJI);
        sb.append("', authorId='");
        sb.append(this.LJJLIIIJJIZ);
        sb.append("', reqId='");
        sb.append(this.LJJLIIIJL);
        sb.append("', homepageUserId='");
        sb.append(this.LJJLIIIJLJLI);
        sb.append("', friendTypeStr='");
        sb.append(this.LJJLIIIJLLLLLLLZ);
        sb.append("', enterMethod='");
        sb.append(this.LJJLIIJ);
        sb.append("', awemeRelationRecommendModel=null, storyType='");
        sb.append(this.LJJLIL);
        sb.append("', storyCollectionId='");
        sb.append(this.LJJLJ);
        sb.append("', position='");
        sb.append(this.LJJLJLI);
        sb.append("', extraName=");
        sb.append(this.LJJLL);
        sb.append(" enterFrom=");
        sb.append(this.LIZLLL);
        sb.append(" nowType=");
        sb.append(this.LJLJJI);
        sb.append(" isNowClear=");
        return C07670Rv.LIZIZ(sb, this.LJLJJLL, ')');
    }

    public static EnumC57365MfJ LJJIJIIJIL(String type) {
        o.LJIIIZ(type, "type");
        EnumC57365MfJ enumC57365MfJ = EnumC57365MfJ.SHOW;
        if (o.LJ(type, enumC57365MfJ.getType())) {
            return enumC57365MfJ;
        }
        EnumC57365MfJ enumC57365MfJ2 = EnumC57365MfJ.FOLLOW;
        if (o.LJ(type, enumC57365MfJ2.getType())) {
            return enumC57365MfJ2;
        }
        EnumC57365MfJ enumC57365MfJ3 = EnumC57365MfJ.ENTER_PROFILE;
        if (o.LJ(type, enumC57365MfJ3.getType())) {
            return enumC57365MfJ3;
        }
        EnumC57365MfJ enumC57365MfJ4 = EnumC57365MfJ.PROFILE_FOLLOW;
        if (o.LJ(type, enumC57365MfJ4.getType())) {
            return enumC57365MfJ4;
        }
        EnumC57365MfJ enumC57365MfJ5 = EnumC57365MfJ.CLOSE;
        if (o.LJ(type, enumC57365MfJ5.getType())) {
            return enumC57365MfJ5;
        }
        EnumC57365MfJ enumC57365MfJ6 = EnumC57365MfJ.FOLLOW_CANCEL;
        if (o.LJ(type, enumC57365MfJ6.getType())) {
            return enumC57365MfJ6;
        }
        EnumC57365MfJ enumC57365MfJ7 = EnumC57365MfJ.PROFILE_FOLLOW_CANCEL;
        if (o.LJ(type, enumC57365MfJ7.getType())) {
            return enumC57365MfJ7;
        }
        EnumC57365MfJ enumC57365MfJ8 = EnumC57365MfJ.DISLIKE;
        if (o.LJ(type, enumC57365MfJ8.getType())) {
            return enumC57365MfJ8;
        }
        EnumC57365MfJ enumC57365MfJ9 = EnumC57365MfJ.ENTER_CHAT;
        if (o.LJ(type, enumC57365MfJ9.getType())) {
            return enumC57365MfJ9;
        }
        EnumC57365MfJ enumC57365MfJ10 = EnumC57365MfJ.SHARE_POP_UP;
        if (o.LJ(type, enumC57365MfJ10.getType())) {
            return enumC57365MfJ10;
        }
        EnumC57365MfJ enumC57365MfJ11 = EnumC57365MfJ.PROFILE_VIDEO_FOLLOW;
        if (o.LJ(type, enumC57365MfJ11.getType())) {
            return enumC57365MfJ11;
        }
        return null;
    }

    public static EnumC57366MfK LJJIJIL(String str) {
        EnumC57366MfK enumC57366MfK = EnumC57366MfK.CARD;
        if (o.LJ(str, enumC57366MfK.getType())) {
            return enumC57366MfK;
        }
        EnumC57366MfK enumC57366MfK2 = EnumC57366MfK.POP_UP;
        if (o.LJ(str, enumC57366MfK2.getType())) {
            return enumC57366MfK2;
        }
        EnumC57366MfK enumC57366MfK3 = EnumC57366MfK.ITEM;
        if (o.LJ(str, enumC57366MfK3.getType())) {
            return enumC57366MfK3;
        }
        EnumC57366MfK enumC57366MfK4 = EnumC57366MfK.SHARE_LINK;
        if (o.LJ(str, enumC57366MfK4.getType())) {
            return enumC57366MfK4;
        }
        EnumC57366MfK enumC57366MfK5 = EnumC57366MfK.LOGIN;
        if (o.LJ(str, enumC57366MfK5.getType())) {
            return enumC57366MfK5;
        }
        EnumC57366MfK enumC57366MfK6 = EnumC57366MfK.PUSH;
        if (o.LJ(str, enumC57366MfK6.getType())) {
            return enumC57366MfK6;
        }
        EnumC57366MfK enumC57366MfK7 = EnumC57366MfK.INBOX_NOTICE;
        if (o.LJ(str, enumC57366MfK7.getType())) {
            return enumC57366MfK7;
        }
        EnumC57366MfK enumC57366MfK8 = EnumC57366MfK.RELATION_LABEL;
        if (o.LJ(str, enumC57366MfK8.getType())) {
            return enumC57366MfK8;
        }
        return null;
    }

    public static String LJJIL(ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        if (externalRecommendReasonStruct != null) {
            if (externalRecommendReasonStruct.getHashedPhoneNumber() != null && C77266UUc.LIZIZ.LJIILLIIL().LIZJ()) {
                return "contact";
            }
            if (externalRecommendReasonStruct.getExternalUsername() != null) {
                return "facebook";
            }
        }
        return "";
    }

    public final void LJJIIZ(Aweme aweme) {
        MatchedFriendStruct matchedFriendStruct;
        ExternalRecommendReasonStruct externalRecommendReasonStruct;
        LJIILL(aweme);
        if (aweme != null) {
            if (C78685UuP.LJJJZ(C188587ag.LIZ(aweme))) {
                String LIZ = C188587ag.LIZ(aweme);
                if (LIZ == null) {
                    LIZ = this.LJJLIIIJLLLLLLLZ;
                }
                this.LJJLIIIJLLLLLLLZ = LIZ;
            }
            if (C78685UuP.LJJJZ(C188587ag.LIZJ(aweme))) {
                String LIZJ = C188587ag.LIZJ(aweme);
                if (LIZJ == null) {
                    LIZJ = this.LJIJI;
                }
                this.LJIJI = LIZJ;
            }
            String groupId = aweme.getGroupId();
            String str = "";
            if (groupId == null) {
                groupId = "";
            }
            this.LJJLIIIJJI = groupId;
            String authorUid = aweme.getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            this.LJJLIIIJJIZ = authorUid;
            if (this.LJJLL.length() == 0) {
                User author = aweme.getAuthor();
                if (author != null && (((matchedFriendStruct = author.getMatchedFriendStruct()) != null && (externalRecommendReasonStruct = matchedFriendStruct.getExternalRecommendReasonStruct()) != null) || (externalRecommendReasonStruct = author.getExternalRecommendReasonStruct()) != null)) {
                    str = LJJIL(externalRecommendReasonStruct);
                }
                this.LJJLL = str;
            }
            if (C78685UuP.LJJJZ(this.LJJLIIIJLLLLLLLZ) && C78685UuP.LJJJZ(this.LJIJI)) {
                C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            }
        }
        LJJJJI();
    }

    public final void LJJIIZI(String str) {
        if (str == null) {
            str = "";
        }
        this.LIZLLL = str;
    }

    public final void LJJIJ(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLIIJ = str;
    }

    public final void LJJIJIIJI(EnumC2049482o method) {
        o.LJIIIZ(method, "method");
        this.LJJLIIJ = method.getType();
    }

    public final void LJJIJLIJ(MatchedFriendStruct matchedFriendStruct) {
        int i;
        int i2;
        Video video;
        if (matchedFriendStruct == null) {
            return;
        }
        List<Aweme> awemeList = matchedFriendStruct.getAwemeList();
        int i3 = 1;
        if (awemeList == null || awemeList.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Aweme aweme : awemeList) {
                if (aweme != null && (video = aweme.getVideo()) != null && video.getCover() != null && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        this.LJJZ = i;
        Integer faceCoverNum = matchedFriendStruct.getFaceCoverNum();
        if (faceCoverNum != null) {
            i2 = faceCoverNum.intValue();
        } else {
            i2 = this.LJJZZI;
        }
        this.LJJZZI = i2;
        String videoNumType = matchedFriendStruct.getVideoNumType();
        if (videoNumType == null) {
            videoNumType = this.LJL;
        }
        this.LJL = videoNumType;
        String recType = matchedFriendStruct.getRecType();
        if (recType == null) {
            recType = this.LJIJI;
        }
        this.LJIJI = recType;
        String relationType = matchedFriendStruct.getRelationType();
        if (relationType == null) {
            relationType = this.LJJLIIIJLLLLLLLZ;
        }
        this.LJJLIIIJLLLLLLLZ = relationType;
        int i4 = this.LJJZZIII;
        if (i4 != -1) {
            i3 = i4;
        } else if (!C78685UuP.LJJJZ(this.LJL)) {
            i3 = 0;
        }
        this.LJJZZIII = i3;
        if (C78685UuP.LJJJZ(matchedFriendStruct.getSocialInfo())) {
            User user = new User();
            user.setSocialInfo(matchedFriendStruct.getSocialInfo());
            C78866UxK.LJIIZILJ(this, user);
        }
    }

    public final void LJJJ(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLJLI = str;
    }

    public final void LJJJI(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJL = str;
    }

    public final void LJJJIL(String str) {
        if (str == null) {
            str = "";
        }
        this.LJIJI = str;
    }

    public final void LJJJJ(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLIIIJL = str;
    }

    public final void LJJJJIZL(User user) {
        boolean z;
        int i;
        int i2;
        String str;
        String str2;
        Integer faceCoverNum;
        List<Aweme> awemeList;
        ExternalRecommendReasonStruct externalRecommendReasonStruct;
        String recType;
        String friendTypeStr;
        if (user != null) {
            String uid = user.getUid();
            if (uid == null) {
                uid = this.LJJLIIIJILLIZJL;
            }
            this.LJJLIIIJILLIZJL = uid;
            int i3 = 0;
            if (this.LJJLIIIJLLLLLLLZ.length() == 0) {
                String friendTypeStr2 = user.getFriendTypeStr();
                if (friendTypeStr2 == null || friendTypeStr2.length() == 0) {
                    MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                    if (matchedFriendStruct == null || (friendTypeStr = matchedFriendStruct.getRelationType()) == null) {
                        friendTypeStr = this.LJJLIIIJLLLLLLLZ;
                    }
                } else {
                    friendTypeStr = user.getFriendTypeStr();
                    o.LJIIIIZZ(friendTypeStr, "friendTypeStr");
                }
                this.LJJLIIIJLLLLLLLZ = friendTypeStr;
            }
            String str3 = this.LJIJI;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str4 = "";
            if (z) {
                String recType2 = user.getRecType();
                if (recType2 == null || recType2.length() == 0) {
                    MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
                    if ((matchedFriendStruct2 == null || (recType = matchedFriendStruct2.getRecType()) == null) && (recType = this.LJIJI) == null) {
                        recType = "";
                    }
                } else {
                    recType = user.getRecType();
                    o.LJIIIIZZ(recType, "recType");
                }
                this.LJIJI = recType;
            }
            String requestId = user.getRequestId();
            if (requestId != null) {
                str4 = requestId;
            }
            this.LJJLIIIJL = str4;
            this.LJJLIIIJ = C200017t7.LIZ(user);
            if (this.LJJLL.length() == 0) {
                MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
                if (matchedFriendStruct3 == null || (externalRecommendReasonStruct = matchedFriendStruct3.getExternalRecommendReasonStruct()) == null) {
                    externalRecommendReasonStruct = user.getExternalRecommendReasonStruct();
                }
                this.LJJLL = LJJIL(externalRecommendReasonStruct);
            }
            C78866UxK.LJIIZILJ(this, user);
            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
            if (matchedFriendStruct4 != null && (awemeList = matchedFriendStruct4.getAwemeList()) != null) {
                i = awemeList.size();
            } else {
                i = this.LJJZ;
            }
            this.LJJZ = i;
            MatchedFriendStruct matchedFriendStruct5 = user.getMatchedFriendStruct();
            if (matchedFriendStruct5 != null && (faceCoverNum = matchedFriendStruct5.getFaceCoverNum()) != null) {
                i2 = faceCoverNum.intValue();
            } else {
                i2 = this.LJJZZI;
            }
            this.LJJZZI = i2;
            int i4 = this.LJJZZIII;
            if (i4 != -1) {
                i3 = i4;
            } else {
                MatchedFriendStruct matchedFriendStruct6 = user.getMatchedFriendStruct();
                if (matchedFriendStruct6 != null) {
                    str = matchedFriendStruct6.getVideoNumType();
                } else {
                    str = null;
                }
                if (C78685UuP.LJJJZ(str)) {
                    i3 = 1;
                }
            }
            this.LJJZZIII = i3;
            MatchedFriendStruct matchedFriendStruct7 = user.getMatchedFriendStruct();
            if (matchedFriendStruct7 == null || (str2 = matchedFriendStruct7.getVideoNumType()) == null) {
                str2 = this.LJL;
            }
            this.LJL = str2;
        }
    }

    public final void LJJJJJ(C57364MfI c57364MfI) {
        C57377MfV c57377MfV;
        int i;
        String enterFrom = c57364MfI.getEnterFrom();
        String str = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        this.LIZLLL = enterFrom;
        String previousPage = c57364MfI.getPreviousPage();
        if (previousPage == null) {
            previousPage = "";
        }
        this.LJJL = previousPage;
        this.LJJLI = c57364MfI.getSceneType();
        String recType = c57364MfI.getRecType();
        if (recType == null) {
            recType = "";
        }
        this.LJIJI = recType;
        this.LJJLIIIJ = c57364MfI.getFollowType();
        String toUserId = c57364MfI.getToUserId();
        if (toUserId == null) {
            toUserId = "";
        }
        this.LJJLIIIJILLIZJL = toUserId;
        String groupId = c57364MfI.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        this.LJJLIIIJJI = groupId;
        String authorId = c57364MfI.getAuthorId();
        if (authorId == null) {
            authorId = "";
        }
        this.LJJLIIIJJIZ = authorId;
        String reqId = c57364MfI.getReqId();
        if (reqId == null) {
            reqId = "";
        }
        this.LJJLIIIJL = reqId;
        String homepageUserId = c57364MfI.getHomepageUserId();
        if (homepageUserId == null) {
            homepageUserId = "";
        }
        this.LJJLIIIJLJLI = homepageUserId;
        String friendTypeStr = c57364MfI.getFriendTypeStr();
        if (friendTypeStr == null) {
            friendTypeStr = "";
        }
        this.LJJLIIIJLLLLLLLZ = friendTypeStr;
        String enterMethod = c57364MfI.getEnterMethod();
        if (enterMethod == null) {
            enterMethod = "";
        }
        this.LJJLIIJ = enterMethod;
        String position = c57364MfI.getPosition();
        if (position == null) {
            position = "";
        }
        this.LJJLJLI = position;
        String nowType = c57364MfI.getNowType();
        if (nowType == null) {
            nowType = "";
        }
        this.LJLJJI = nowType;
        String isNowClear = c57364MfI.isNowClear();
        if (isNowClear == null) {
            isNowClear = "";
        }
        this.LJLJJLL = isNowClear;
        this.LJJIL = c57364MfI.getSearchId();
        if (c57364MfI.getSocialInfo() != null) {
            User user = new User();
            user.setSocialInfo(c57364MfI.getSocialInfo());
            C78866UxK.LJIIZILJ(this, user);
        }
        MatchedFriendStruct matchedFriendStruct = c57364MfI.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            List<Aweme> awemeList = matchedFriendStruct.getAwemeList();
            int i2 = 0;
            if (awemeList != null) {
                i = awemeList.size();
            } else {
                i = 0;
            }
            this.LJJZ = i;
            Integer faceCoverNum = matchedFriendStruct.getFaceCoverNum();
            if (faceCoverNum != null) {
                i2 = faceCoverNum.intValue();
            }
            this.LJJZZI = i2;
            String videoNumType = matchedFriendStruct.getVideoNumType();
            if (videoNumType != null) {
                str = videoNumType;
            }
            this.LJL = str;
            this.LJJZZIII = C78685UuP.LJJJZ(matchedFriendStruct.getVideoNumType()) ? 1 : 0;
        }
        AbstractC57378MfW from = c57364MfI.getFrom();
        if ((from instanceof C57377MfV) && (c57377MfV = (C57377MfV) from) != null) {
            String fromUid = c57377MfV.getUid();
            int iterateCnt = c57377MfV.getIterateCnt();
            boolean isRelatedRec = c57364MfI.isRelatedRec();
            o.LJIIIZ(fromUid, "fromUid");
            this.LJLIIIL = isRelatedRec;
            this.LJLIIL = fromUid;
            this.LJLIL = iterateCnt;
        }
        AbstractC57378MfW from2 = c57364MfI.getFrom();
        if ((from2 instanceof C225338sr) && from2 != null) {
            this.LJLILLLLZI = true;
        }
    }

    public final void LJJIJL(String str, boolean z) {
        if (str == null) {
            str = this.LIZLLL;
        }
        if (o.LJ(str, "find_friends_page") || o.LJ(str, "now_find_friends_page")) {
            this.LJLJJL = z ? 1 : 0;
        }
    }
}
