package X;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import defpackage.a1;
import defpackage.b1;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS11S2000000_9;
import kotlin.jvm.internal.AqS16S2100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lfe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54838Lfe {
    public static final boolean LIZIZ(Aweme aweme) {
        if (!C55723Ltv.LIZIZ.LJIIJ() || !LJJI(aweme)) {
            return true;
        }
        if (!C78996UzQ.LJJIIZI(aweme) && !LJIILL(aweme) && !C220858ld.LJIIIIZZ(aweme)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Aweme LIZJ(Aweme aweme) {
        if (!LJJI(aweme) || aweme.getUserStory() != null) {
            return aweme;
        }
        Aweme m114clone = aweme.m114clone();
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ()) {
            m114clone.setAid(aweme.getAuthorUid());
        }
        m114clone.setStory(null);
        boolean z = true;
        Aweme R1 = AwemeService.LIZ().R1(aweme);
        o.LJI(R1);
        boolean z2 = false;
        List LJJIJIL = C47261Igj.LJJIJIL(R1);
        Story story = aweme.getStory();
        if (story != null) {
            z2 = story.getViewed();
        }
        long j = 1;
        long j2 = 0;
        UserStory userStory = new UserStory(LJJIJIL, j, j2, z2, j2, j2, false, 0 == true ? 1 : 0, j2, !C53578L1a.LIZ(), null, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 486900, 0 == true ? 1 : 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("origin total count: ");
        LIZ.append(userStory.getOriginTotalCount());
        LIZ.append(", user story instance: ");
        LIZ.append(System.identityHashCode(userStory));
        C189837ch.LIZ("huangxin.2020", X1D.LIZIZ(LIZ));
        m114clone.setUserStory(userStory);
        m114clone.setAwemeType(40);
        m114clone.setAuthor(aweme.getAuthor());
        m114clone.setRequestId(aweme.getRequestId());
        m114clone.setIsTikTokStory(true);
        return m114clone;
    }

    public static final Aweme LJ(Aweme aweme) {
        UserStory userStory;
        if (LJJ(aweme)) {
            if (aweme != null && (userStory = aweme.getUserStory()) != null) {
                if (UserStoryKt.currentStory(userStory) != null) {
                    return UserStoryKt.currentStory(userStory);
                }
                if (userStory.getStories().size() > 0) {
                    return (Aweme) ListProtector.get(userStory.getStories(), 0);
                }
            }
            return null;
        }
        if (!LJIIZILJ(aweme)) {
            return null;
        }
        return aweme;
    }

    public static final Aweme LJFF(Aweme aweme) {
        UserStory userStory;
        if (!LJJ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.isPostStyle()) {
            return null;
        }
        return (Aweme) ORZ.LJLLLL(userStory.getStories());
    }

    public static final String LJI(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        if (!LJJI(aweme)) {
            return "";
        }
        String LJIIIIZZ = LJIIIIZZ(aweme);
        long j = 86400000;
        long currentTimeMillis = ((System.currentTimeMillis() / j) * j) - TimeZone.getDefault().getRawOffset();
        return a1.LJ(LJIIIIZZ, String.valueOf(currentTimeMillis - j), String.valueOf(currentTimeMillis + j));
    }

    public static final String LJII(Throwable th) {
        String LIZ = C25620zW.LIZ("error: ", th);
        if (th instanceof C38333F2r) {
            StringBuilder LIZJ = b1.LIZJ(LIZ, ", detail: ");
            LIZJ.append(((C38333F2r) th).getResponse());
            return X1D.LIZIZ(LIZJ);
        }
        return LIZ;
    }

    public static final String LJIIIIZZ(Aweme aweme) {
        String authorUid;
        o.LJIIIZ(aweme, "<this>");
        if (C78685UuP.LJJJZ(aweme.getAuthorUid())) {
            String authorUid2 = aweme.getAuthorUid();
            if (authorUid2 == null) {
                return "";
            }
            return authorUid2;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null || userStory.getStories().size() <= 0 || (authorUid = ((Aweme) ListProtector.get(userStory.getStories(), 0)).getAuthorUid()) == null) {
            return "";
        }
        return authorUid;
    }

    public static final int LJIIIZ(Aweme aweme) {
        UserStory userStory;
        String str;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return 0;
        }
        int originTotalCount = (int) userStory.getOriginTotalCount();
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        if (LJIIJJI(str)) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            return (originTotalCount + c55723Ltv.LJIILJJIL().LJIIIZ().size()) - c55723Ltv.LJIILJJIL().LJ(userStory);
        }
        return originTotalCount;
    }

    public static final boolean LJIIJJI(String str) {
        String str2;
        User LIZIZ = AV1.LIZIZ();
        if (LIZIZ != null) {
            str2 = LIZIZ.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    public static final boolean LJIIL(PublishModel publishModel) {
        Parcelable parcelable;
        CanvasVideoData canvasVideoData;
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        VideoPublishEditModel videoPublishEditModel = null;
        if (publishModel != null) {
            parcelable = publishModel.editModel;
        } else {
            parcelable = null;
        }
        if (parcelable instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) parcelable;
        }
        if (videoPublishEditModel == null || (canvasVideoData = videoPublishEditModel.canvasVideoData) == null || (extra = canvasVideoData.getExtra()) == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || forwardCanvasExtra.getForwardType() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        ShareToStoryStruct share2StoryStruct;
        if (aweme != null && LJJI(aweme) && aweme.getShare2StoryStruct() != null && (share2StoryStruct = aweme.getShare2StoryStruct()) != null && share2StoryStruct.getShareStoryPostType() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(Aweme aweme) {
        EnumC221928nM enumC221928nM;
        o.LJIIIZ(aweme, "<this>");
        if (aweme.getScheduleId() == null) {
            return false;
        }
        InterfaceC54401LWr LJIILJJIL = C55723Ltv.LIZIZ.LJIILJJIL();
        String scheduleId = aweme.getScheduleId();
        o.LJIIIIZZ(scheduleId, "scheduleId");
        C221958nP LJI = LJIILJJIL.LJI(scheduleId);
        if (LJI != null) {
            enumC221928nM = LJI.LIZIZ;
        } else {
            enumC221928nM = null;
        }
        if (enumC221928nM != EnumC221928nM.FAILED) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILL(Aweme aweme) {
        Story story;
        if (!LJIIZILJ(aweme) || aweme == null || (story = aweme.getStory()) == null || !story.isPublishing()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(Aweme aweme) {
        if (aweme == null || !LJJI(aweme) || aweme.getShare2StoryStruct() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(Aweme aweme) {
        if (LJJI(aweme) && aweme != null && aweme.getStory() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(Aweme aweme) {
        Aweme LJ;
        Story story;
        Story story2;
        if (LJIIZILJ(aweme)) {
            if (aweme == null || (story2 = aweme.getStory()) == null) {
                return false;
            }
            return StoryKt.isExpired(story2);
        }
        if (!LJJ(aweme) || (LJ = LJ(aweme)) == null || (story = LJ.getStory()) == null) {
            return false;
        }
        return StoryKt.isExpired(story);
    }

    public static final boolean LJIJI(Aweme aweme) {
        String str;
        User author;
        o.LJIIIZ(aweme, "<this>");
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str = author2.getUid();
        } else {
            str = null;
        }
        if (!LJIIJJI(str) || !(!C55723Ltv.LIZIZ.LJIILJJIL().LIZJ().isEmpty())) {
            if (userStory.getTotalCount() < 1) {
                return true;
            }
            List<Aweme> stories = userStory.getStories();
            if (((stories == null || stories.isEmpty()) && !userStory.getHasMoreBefore() && !userStory.getHasMoreAfter()) || (author = aweme.getAuthor()) == null || author.isBlock || author.isBlocked()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJ(Aweme aweme) {
        if (LJJI(aweme) && aweme != null && aweme.getUserStory() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJI(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        if (System.currentTimeMillis() - (aweme.getCreateTime() * 1000) < 172800000) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZ(PublishModel publishModel) {
        PublishFailureReason publishFailureReason;
        if (publishModel == null || !publishModel.LIZIZ()) {
            return false;
        }
        String str = null;
        if (publishModel.LIZIZ() && (publishFailureReason = publishModel.LIZIZ) != null) {
            str = publishFailureReason.scene;
        }
        if (!o.LJ(str, "AVATAR")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(PublishModel publishModel) {
        String str;
        VideoPublishEditModel videoPublishEditModel;
        BaseShortVideoContext baseShortVideoContext = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        }
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (str = videoPublishEditModel.shootEnterMethod) == null) {
            str = "";
        }
        if (!o.LJ(str, "inbox_top_cell") && !o.LJ(str, "click_head_plus") && !o.LJ(str, "click_profile_photo") && !LJJIIZ(publishModel)) {
            return false;
        }
        return true;
    }

    public static final String LIZLLL(Aweme aweme, String userId) {
        boolean z;
        o.LJIIIZ(userId, "userId");
        if (aweme == null) {
            return "";
        }
        boolean LJJIII = LJJIII(aweme, userId);
        if (LJJII(aweme, userId) || LJJIFFI(aweme, userId)) {
            z = true;
        } else {
            z = false;
        }
        if (LJJIII) {
            if (z) {
                return "mentioned_tagged_video";
            }
            return "tagged_video";
        }
        if (!z) {
            return "";
        }
        return "mentioned_video";
    }

    public static final boolean LJIIJ(UserStory userStory, boolean z) {
        List<Aweme> LJIIIZ;
        o.LJIIIZ(userStory, "<this>");
        if (userStory.getStories().size() == 0 && !userStory.getHasMoreAfter() && !userStory.getHasMoreBefore()) {
            InterfaceC54401LWr LJIILJJIL = C55723Ltv.LIZIZ.LJIILJJIL();
            if (z) {
                LJIIIZ = LJIILJJIL.LIZJ();
            } else {
                LJIIIZ = LJIILJJIL.LJIIIZ();
            }
            if (LJIIIZ.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIJJ(Aweme aweme, String enterFrom) {
        UserStory userStory;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (!LJJ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.isStoryGuideCard()) {
            return false;
        }
        if (!o.LJ("homepage_hot", enterFrom) && !o.LJ("homepage_follow", enterFrom) && !o.LJ("homepage_nearby", enterFrom) && !o.LJ("homepage_friends", enterFrom)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(Aweme aweme, String enterFrom) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (!LJIJJ(aweme, enterFrom) || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) ORZ.LJLLLL(stories)) == null || !C1DF.LJJIII(aweme2)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(Aweme aweme, String enterFrom) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (!LJIJJ(aweme, enterFrom) || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) ORZ.LJLLLL(stories)) == null || C1DF.LJJIII(aweme2)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIFFI(Aweme aweme, String str) {
        if (aweme.getInteractStickerStructs() == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
            o.LJIIIIZZ(interactStickerStruct, "aweme.interactStickerStructs");
            InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
            if (interactStickerStruct2.getMentionInfo() != null && o.LJ(interactStickerStruct2.getMentionInfo().getUserId(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJII(Aweme aweme, String str) {
        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
            o.LJIIIIZZ(textExtraStruct, "aweme.textExtra");
            if (o.LJ(textExtraStruct.getUserId(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIII(Aweme aweme, String str) {
        List<InteractionTagUserInfo> taggedUsers;
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null && (taggedUsers = interactionTagInfo.getTaggedUsers()) != null) {
            Iterator<InteractionTagUserInfo> it = taggedUsers.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getUid(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void LJJIIJZLJL(String str, List list) {
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ() && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (LJJ(aweme)) {
                    InterfaceC54795Lex LJIL = C55723Ltv.LIZIZ.LJIL();
                    o.LJI(aweme);
                    LJIL.LIZJ(aweme, str, true);
                }
            }
        }
    }

    public static final boolean LJJIJIIJI(Aweme aweme, String str) {
        boolean z;
        if (aweme == null || str == null || aweme.getAuthor() == null || o.LJ(aweme.getAuthor().getUid(), str) || aweme.isAd() || aweme.getIsTikTokStory() || !aweme.isPublic() || !aweme.canShare() || !((Boolean) C34008DWi.LIZIZ.getValue()).booleanValue() || !C55723Ltv.LIZIZ.LJII().LJII(aweme)) {
            return false;
        }
        boolean LJJIII = LJJIII(aweme, str);
        if (LJJII(aweme, str) || LJJIFFI(aweme, str)) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJIII && !z) {
            return false;
        }
        return true;
    }

    public static final void LIZ(String userId, Aweme aweme, String str) {
        o.LJIIIZ(userId, "userId");
        ((GZP) C221108m2.LIZIZ(C54839Lff.LJLIL).getValue()).LJIIJ("share_to_story_show", aweme, new AqS16S2100000_9(str, aweme, userId, 0));
    }

    public static final void LJJIIZI(View v, Aweme aweme, String str, String enterFrom) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (aweme == null) {
            return;
        }
        AVExternalServiceImpl.LIZ().enterFromService().setEnterFrom("chat_page");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C4RV.LJLIL);
        GZP gzp = (GZP) LIZIZ.getValue();
        Context context = v.getContext();
        o.LJIIIIZZ(context, "v.context");
        gzp.LJFF(new C41831GbL(context, aweme, "chat_page", null, "show_on_video", 8));
        GZP shareToStoryService = (GZP) LIZIZ.getValue();
        o.LJIIIZ(shareToStoryService, "shareToStoryService");
        shareToStoryService.LJIIJ("share_to_story_click", aweme, new AqS11S2000000_9(enterFrom, str, 2));
    }
}
