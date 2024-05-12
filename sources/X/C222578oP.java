package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8oP */
/* loaded from: classes4.dex */
public final class C222578oP {
    public static String LIZ = "slide";
    public static String LIZIZ = "";

    public static int LJFF(User user) {
        if (user == null) {
            return -1;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static int LJI(Aweme aweme) {
        int i;
        InteractStickerStruct interactStickerStruct;
        VideoShareInfoStruct videoShareInfoStruct;
        int i2 = 0;
        if (aweme == null) {
            return 0;
        }
        if (aweme.isSharedStoryVisible()) {
            i = 0;
        } else {
            i = 16;
        }
        ShareToStoryStruct share2StoryStruct = aweme.getShare2StoryStruct();
        if (share2StoryStruct != null && share2StoryStruct.getShareStoryPostType() == 1) {
            i2 = 19;
        } else {
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null) {
                Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        interactStickerStruct = it.next();
                        if (interactStickerStruct.getVideoShareInfoStruct() != null) {
                            break;
                        }
                    } else {
                        interactStickerStruct = null;
                        break;
                    }
                }
                InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
                if (interactStickerStruct2 != null && (videoShareInfoStruct = interactStickerStruct2.getVideoShareInfoStruct()) != null) {
                    i2 = o.LJ(videoShareInfoStruct.getAuthorId(), aweme.getAuthorUid()) ? 2 : 1;
                }
            }
        }
        return i | i2;
    }

    public static void LJIIIZ(C221648mu c221648mu) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_position", c221648mu.LIZ);
        c188727au.LJIIIZ("enter_from", c221648mu.LIZIZ);
        c188727au.LJIIIZ("group_id", c221648mu.LIZJ);
        c188727au.LJIIIZ("author_id", c221648mu.LIZLLL);
        c188727au.LJIIIZ("follow_status", c221648mu.LJ);
        FMX.LJIIL("click_story_dm_input_box", c188727au.LIZ);
    }

    public static void LJIIJJI(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LIZLLL(1, "is_story");
        FMX.LJIIL("publish_retry_show", c188727au.LIZ);
    }

    public static void LJIIL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("story_archive_notification", c188727au.LIZ);
    }

    public static String LJII(Context context, String str, String str2) {
        String str3 = C2S6.LIZ(context).getExtra().get("enter_position");
        if (str3 != null) {
            return str3;
        }
        if (C77123UOp.LJJIJIIJIL(str2)) {
            return "top_cell";
        }
        if (ORZ.LJLJJI(str2, C47261Igj.LJJIJIIJI("STORY_ENTRANCE_AVATAR", "STORY_ENTRANCE_MINE", "STORY_ENTRANCE_OTHER"))) {
            return "head";
        }
        if (o.LJ(str2, "STORY_ENTRANCE_PREVIEW")) {
            return "";
        }
        if (o.LJ("homepage_follow", str) || o.LJ("homepage_hot", str) || o.LJ("homepage_nearby", str) || o.LJ("homepage_friends", str)) {
            return "feed";
        }
        return "video_cover";
    }

    public static void LJIIIIZZ(Object obj, Object obj2, String str) {
        if (obj instanceof JHM) {
            if (obj2 instanceof String) {
                ((JHM) obj).LIZLLL(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((JHM) obj).LIZJ(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((JHM) obj).LJFF(str, ((Boolean) obj2).booleanValue());
                return;
            } else {
                ((JHM) obj).LIZLLL(str, obj2.toString());
                return;
            }
        }
        if (obj instanceof C198517qh) {
            if (obj2 instanceof String) {
                ((C198517qh) obj).LIZLLL(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C198517qh) obj).LIZIZ((Integer) obj2, str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C198517qh) obj).LIZ((Boolean) obj2, str);
                return;
            } else {
                ((C198517qh) obj).LIZLLL(str, obj2.toString());
                return;
            }
        }
        if (obj instanceof C188727au) {
            if (obj2 instanceof String) {
                ((C188727au) obj).LJI(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C188727au) obj).LIZLLL(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C188727au) obj).LJFF(obj2, str);
                return;
            } else {
                ((C188727au) obj).LJI(str, obj2.toString());
                return;
            }
        }
        if (!(obj instanceof JSONObject)) {
            return;
        }
        if (obj2 instanceof String) {
            ((JSONObject) obj).put(str, obj2);
            return;
        }
        if (obj2 instanceof Integer) {
            ((JSONObject) obj).put(str, ((Number) obj2).intValue());
        } else if (obj2 instanceof Boolean) {
            ((JSONObject) obj).put(str, ((Boolean) obj2).booleanValue());
        } else {
            ((JSONObject) obj).put(str, obj2.toString());
        }
    }

    public static void LJIIJ(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("action_type", str3);
        c188727au.LIZLLL(1, "is_story");
        FMX.LJIIL("publish_retry", c188727au.LIZ);
    }

    public static void LJIILLIIL(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("last_group_id", str3);
        FMX.LJIIL("story_feed_play_end", c188727au.LIZ);
    }

    public static void LIZLLL(AqS185S0100000_3 aqS185S0100000_3, Aweme aweme, String str, String str2) {
        int i;
        long j;
        UserStory userStory;
        UserStory userStory2;
        Integer currentIndex;
        UserStory userStory3;
        int i2 = 0;
        if (aweme != null && (userStory3 = aweme.getUserStory()) != null) {
            i = (int) userStory3.getCurrentPosition();
        } else {
            i = 0;
        }
        aqS185S0100000_3.invoke("story_start_num", Integer.valueOf(i));
        if (aweme != null && (userStory2 = aweme.getUserStory()) != null && (currentIndex = UserStoryKt.currentIndex(userStory2)) != null) {
            i2 = currentIndex.intValue();
        }
        aqS185S0100000_3.invoke("story_current_num", Integer.valueOf(i2));
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            j = userStory.getTotalCount();
        } else {
            j = 1;
        }
        aqS185S0100000_3.invoke("item_cnt", Integer.valueOf((int) j));
        aqS185S0100000_3.invoke("enter_method", LIZ);
        if (C78685UuP.LJJJZ(str)) {
            aqS185S0100000_3.invoke("enter_position", str);
        }
        if (C78685UuP.LJJJZ(str2)) {
            aqS185S0100000_3.invoke("enter_play_method", str2);
        }
    }

    public static void LJ(Aweme aweme, Object obj, String str, String str2) {
        try {
            LIZLLL(new AqS185S0100000_3(obj, (Object) 11), aweme, str, str2);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static boolean LIZ(AqS185S0100000_3 aqS185S0100000_3, Aweme aweme, String str, String str2, Context context) {
        int i = 0;
        if (aweme == null) {
            return false;
        }
        boolean LJJI = C54838Lfe.LJJI(aweme);
        aqS185S0100000_3.invoke("is_share_to_story", Integer.valueOf(LJI(aweme)));
        if (aweme.getIsStoryToNormal()) {
            i = 1;
        }
        aqS185S0100000_3.invoke("is_story_to_normal", Integer.valueOf(i));
        if (LJJI) {
            aqS185S0100000_3.invoke("story_type", "story");
            aqS185S0100000_3.invoke("story_collection_id", C54838Lfe.LJI(aweme));
            if (str != null) {
                aqS185S0100000_3.invoke("enter_position", LJII(context, str, str2));
            }
        } else {
            aqS185S0100000_3.invoke("story_type", "post");
        }
        aqS185S0100000_3.invoke("follow_status", Integer.valueOf(LJFF(aweme.getAuthor())));
        return LJJI;
    }

    public static void LIZIZ(Object obj, Aweme aweme, String str, String str2, Context context) {
        try {
            C3C5.m7constructorimpl(Boolean.valueOf(LIZ(new AqS185S0100000_3(obj, (Object) 10), aweme, str, str2, context)));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static /* synthetic */ void LIZJ(Object obj, Aweme aweme, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        LIZIZ(obj, aweme, str, str2, null);
    }

    public static void LJIILIIL(int i, int i2, Aweme aweme, String str, String str2) {
        String str3;
        Aweme currentStory;
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterPosition");
        LIZ2.LJIIIZ("author_id", C54838Lfe.LJIIIIZZ(aweme));
        LIZ2.LJIIIZ("story_collection_id", C54838Lfe.LJI(aweme));
        LIZ2.LIZLLL(i, "item_cnt");
        LIZ2.LIZLLL(i2, "unread_item_cnt");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", LIZ);
        LIZ2.LJIIIZ("request_id", aweme.getRequestId());
        User author = aweme.getAuthor();
        Integer num = null;
        if (author != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        LIZ2.LJFF(num, "follow_status");
        LIZ2.LJIIIZ("enter_position", str2);
        UserStory userStory = aweme.getUserStory();
        if (userStory == null || (currentStory = UserStoryKt.currentStory(userStory)) == null || (str3 = currentStory.getAid()) == null) {
            str3 = "";
        }
        LIZ2.LJIIIZ("group_id", str3);
        LIZ2.LJIIIZ("story_type", "story");
        FMX.LJIIL("story_collection_play", LIZ2.LIZ);
    }

    public static void LJIILL(int i, int i2, Aweme aweme, String str, String str2) {
        String str3;
        Aweme currentStory;
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterPosition");
        LIZ2.LJIIIZ("story_collection_id", C54838Lfe.LJI(aweme));
        LIZ2.LIZLLL(i, "item_cnt");
        LIZ2.LIZLLL(i2, "unread_item_cnt");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", LIZ);
        LIZ2.LJIIIZ("author_id", C54838Lfe.LJIIIIZZ(aweme));
        LIZ2.LJIIIZ("request_id", aweme.getRequestId());
        User author = aweme.getAuthor();
        Integer num = null;
        if (author != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        LIZ2.LJFF(num, "follow_status");
        LIZ2.LJIIIZ("enter_position", str2);
        UserStory userStory = aweme.getUserStory();
        if (userStory == null || (currentStory = UserStoryKt.currentStory(userStory)) == null || (str3 = currentStory.getAid()) == null) {
            str3 = "";
        }
        LIZ2.LJIIIZ("group_id", str3);
        LIZ2.LJIIIZ("story_type", "story");
        FMX.LJIIL("story_collection_play_finish", LIZ2.LIZ);
    }

    public static void LJIILJJIL(Aweme aweme, int i, int i2, String str, int i3, String str2) {
        int i4;
        String str3;
        Aweme currentStory;
        Integer currentIndex;
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterPosition");
        LIZ2.LJIIIZ("story_collection_id", C54838Lfe.LJI(aweme));
        LIZ2.LIZLLL(i, "item_cnt");
        LIZ2.LIZLLL(i2, "unread_item_cnt");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("author_id", C54838Lfe.LJIIIIZZ(aweme));
        LIZ2.LJIIIZ("enter_method", LIZ);
        LIZ2.LJIIIZ("request_id", aweme.getRequestId());
        User author = aweme.getAuthor();
        Integer num = null;
        if (author != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        LIZ2.LJFF(num, "follow_status");
        UserStory userStory = aweme.getUserStory();
        int i5 = 0;
        if (userStory != null) {
            i4 = (int) userStory.getCurrentPosition();
        } else {
            i4 = 0;
        }
        LIZ2.LIZLLL(i4, "story_start_num");
        UserStory userStory2 = aweme.getUserStory();
        if (userStory2 != null && (currentIndex = UserStoryKt.currentIndex(userStory2)) != null) {
            i5 = currentIndex.intValue();
        }
        LIZ2.LIZLLL(i5, "story_current_num");
        UserStory userStory3 = aweme.getUserStory();
        if (userStory3 == null || (currentStory = UserStoryKt.currentStory(userStory3)) == null || (str3 = currentStory.getAid()) == null) {
            str3 = "";
        }
        LIZ2.LJIIIZ("group_id", str3);
        LIZ2.LIZLLL(i3, "read_cnt");
        LIZ2.LJIIIZ("enter_position", str2);
        LIZ2.LJIIIZ("story_type", "story");
        FMX.LJIIL("story_collection_play_end", LIZ2.LIZ);
    }
}
