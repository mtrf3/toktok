package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228888ya {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(String str, String str2) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", str2);
        LIZ2.LJIIIZ("panel_source", str2);
        FMX.LJIIL("create_playlist", LIZ2.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", str2);
        FMX.LJIIL("enter_playlist_intro_page", LIZ2.LIZ);
    }

    public static void LJIIIZ(String str, String str2) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", str2);
        FMX.LJIIL("enter_playlist_name_page", LIZ2.LIZ);
    }

    public static void LJIIJ(String str, String str2) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", str2);
        FMX.LJIIL("enter_playlist_selection_page", LIZ2.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("playlist_id", str);
        FMX.LJIIL("add_multiple_playlist_video_fail", c188727au.LIZ);
    }

    public static void LIZJ(String str, String str2, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LIZLLL(z ? 1 : 0, "is_discard");
        c188727au.LJIIIZ("playlist_id", str);
        FMX.LJIIL("cancel_editing_playlist", c188727au.LIZ);
    }

    public static void LJIIL(Aweme aweme, String str, C229238z9 c229238z9) {
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        User author;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "general_search");
        c188727au.LJIIIZ("playlist_id", str);
        String str7 = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str2 = author.getUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        if (c229238z9 == null || (str3 = c229238z9.getSearchId()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("search_id", str3);
        if (c229238z9 != null) {
            num = c229238z9.isFromVideo();
        } else {
            num = null;
        }
        c188727au.LJFF(num, "is_from_video");
        if (c229238z9 != null) {
            str4 = c229238z9.getSearchType();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("search_type", str4);
        if (c229238z9 != null) {
            str5 = c229238z9.getSearchResultId();
        } else {
            str5 = null;
        }
        if (C78857UxB.LJJJIL(str5)) {
            if (c229238z9 != null) {
                str6 = c229238z9.getSearchResultId();
            } else {
                str6 = null;
            }
            c188727au.LJI("search_result_id", str6);
        }
        if (aweme != null) {
            str7 = aweme.getGroupId();
        }
        c188727au.LJIIIZ("group_id", str7);
        FMX.LJIIL("playlist_panel_click", c188727au.LIZ);
    }

    public static void LIZLLL(int i, String str, String str2, String str3) {
        C188727au LIZJ = C78920UyC.LIZJ(i, "video_cnt");
        LIZJ.LJIIIZ("playlist_id", str);
        LIZJ.LJIIIZ("enter_from", str2);
        LIZJ.LJIIIZ("enter_method", str3);
        FMX.LJIIL("post_creating_playlist", LIZJ.LIZ);
    }

    public static void LJFF(Aweme aweme, String str, String str2, C229238z9 c229238z9) {
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        User author;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("playlist_id", str);
        String str8 = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str3 = author.getUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        if (c229238z9 == null || (str4 = c229238z9.getSearchId()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("search_id", str4);
        if (c229238z9 != null) {
            num = c229238z9.isFromVideo();
        } else {
            num = null;
        }
        c188727au.LJFF(num, "is_from_video");
        if (c229238z9 != null) {
            str5 = c229238z9.getSearchType();
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("search_type", str5);
        if (c229238z9 != null) {
            str6 = c229238z9.getSearchResultId();
        } else {
            str6 = null;
        }
        if (C78857UxB.LJJJIL(str6)) {
            if (c229238z9 != null) {
                str7 = c229238z9.getSearchResultId();
            } else {
                str7 = null;
            }
            c188727au.LJI("search_result_id", str7);
        }
        if (aweme != null) {
            str8 = aweme.getGroupId();
        }
        c188727au.LJIIIZ("group_id", str8);
        FMX.LJIIL("enter_playlist", c188727au.LIZ);
    }

    public static void LJIILIIL(Integer num, String enterFrom, String enterMethod, String mixId) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mixId, "mixId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LJIIIZ("playlist_id", mixId);
        c188727au.LJFF(num, "video_cnt");
        FMX.LJIIL("remove_playlist_video", c188727au.LIZ);
    }

    public static void LIZ(Integer num, String enterFrom, String enterMethod, String mixId, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mixId, "mixId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LJIIIZ("playlist_id", mixId);
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJFF(num, "video_cnt");
        FMX.LJIIL("add_playlist_video", c188727au.LIZ);
    }

    public static void LJI(String str, String str2, String str3, String str4, Float f, String str5, C229238z9 c229238z9, Integer num) {
        String str6;
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str4, "authorId");
        if (C174826ta.LIZ()) {
            C76V.LIZ().LIZ(str3);
            LIZ2.LIZLLL(0, "spammy_tag_cnt");
        }
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("enter_method", str5);
        LIZ2.LJIIIZ("playlist_id", str2);
        LIZ2.LJIIIZ("group_id", str3);
        LIZ2.LJIIIZ("author_id", str4);
        if (c229238z9 != null) {
            String searchId = c229238z9.getSearchId();
            if (searchId == null) {
                searchId = "";
            }
            LIZ2.LJI("search_id", searchId);
            LIZ2.LJFF(c229238z9.isFromVideo(), "is_from_video");
            LIZ2.LJI("search_type", c229238z9.getSearchType());
        }
        String str7 = null;
        if (c229238z9 != null) {
            str6 = c229238z9.getSearchResultId();
        } else {
            str6 = null;
        }
        if (C78857UxB.LJJJIL(str6)) {
            if (c229238z9 != null) {
                str7 = c229238z9.getSearchResultId();
            }
            LIZ2.LJI("search_result_id", str7);
        }
        if (f != null) {
            LIZ2.LIZIZ(f.floatValue(), "video_current_time");
        }
        if (num != null) {
            LIZ2.LIZLLL(num.intValue() / 1000, "vDuration");
        }
        FMX.LJIIL("click_playlist_entrance", LIZ2.LIZ);
    }

    public static void LJIIJJI(String enterFrom, String str, String groupId, String authorId, String searchId, String searchResultId, String searchKeyword, C229238z9 c229238z9, Integer num, int i) {
        Integer num2;
        String str2;
        String str3;
        String searchId2;
        if ((i & 4) != 0) {
            groupId = "";
        }
        if ((i & 8) != 0) {
            authorId = "";
        }
        if ((i & 16) != 0) {
            searchId = "";
        }
        if ((i & 32) != 0) {
            searchResultId = "";
        }
        if ((i & 64) != 0) {
            searchKeyword = "";
        }
        String str4 = null;
        if ((i & 128) != 0) {
            c229238z9 = null;
        }
        if ((i & 256) != 0) {
            num = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("playlist_id", str);
        c188727au.LJIIIZ("group_id", groupId);
        c188727au.LJIIIZ("author_id", authorId);
        if (c229238z9 != null && (searchId2 = c229238z9.getSearchId()) != null) {
            searchId = searchId2;
        }
        c188727au.LJIIIZ("search_id", searchId);
        c188727au.LJIIIZ("search_result_id", searchResultId);
        c188727au.LJIIIZ("search_keyword", searchKeyword);
        if (c229238z9 != null) {
            num2 = c229238z9.isFromVideo();
        } else {
            num2 = null;
        }
        c188727au.LJFF(num2, "is_from_video");
        if (c229238z9 != null) {
            str2 = c229238z9.getSearchType();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("search_type", str2);
        if (c229238z9 != null) {
            str3 = c229238z9.getSearchResultId();
        } else {
            str3 = null;
        }
        if (C78857UxB.LJJJIL(str3)) {
            if (c229238z9 != null) {
                str4 = c229238z9.getSearchResultId();
            }
            c188727au.LJI("search_result_id", str4);
        }
        if (num != null) {
            c188727au.LIZLLL(num.intValue() / 1000, "vDuration");
        }
        FMX.LJIIL("show_playlist_entrance", c188727au.LIZ);
    }

    public static void LJII(String enterFrom, String mixId, String authorId, String groupId, int i, String enterMethod, String searchId, String searchResultId, String searchKeyword, C229238z9 c229238z9, Integer num, int i2) {
        Integer num2;
        String str;
        String str2;
        String searchId2;
        if ((i2 & 4) != 0) {
            authorId = "";
        }
        if ((i2 & 8) != 0) {
            groupId = "";
        }
        if ((i2 & 32) != 0) {
            enterMethod = "";
        }
        if ((i2 & 64) != 0) {
            searchId = "";
        }
        if ((i2 & 128) != 0) {
            searchResultId = "";
        }
        if ((i2 & 256) != 0) {
            searchKeyword = "";
        }
        String str3 = null;
        if ((i2 & 512) != 0) {
            c229238z9 = null;
        }
        if ((i2 & 1024) != 0) {
            num = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LJIIIZ("previous_page", enterFrom);
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("author_id", authorId);
        c188727au.LJIIIZ("group_id", groupId);
        c188727au.LJIIIZ("playlist_id", mixId);
        c188727au.LIZLLL(i, "order");
        if (c229238z9 != null && (searchId2 = c229238z9.getSearchId()) != null) {
            searchId = searchId2;
        }
        c188727au.LJIIIZ("search_id", searchId);
        c188727au.LJIIIZ("search_result_id", searchResultId);
        if (c229238z9 != null) {
            num2 = c229238z9.isFromVideo();
        } else {
            num2 = null;
        }
        c188727au.LJFF(num2, "is_from_video");
        if (c229238z9 != null) {
            str = c229238z9.getSearchType();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("search_type", str);
        if (c229238z9 != null) {
            str2 = c229238z9.getSearchResultId();
        } else {
            str2 = null;
        }
        if (C78857UxB.LJJJIL(str2)) {
            if (c229238z9 != null) {
                str3 = c229238z9.getSearchResultId();
            }
            c188727au.LJI("search_result_id", str3);
        }
        if (C78857UxB.LJJJIL(searchKeyword)) {
            c188727au.LJI("search_keyword", searchKeyword);
        }
        if (num != null) {
            c188727au.LIZLLL(num.intValue() / 1000, "vDuration");
        }
        FMX.LJIIL("enter_playlist_detail", c188727au.LIZ);
    }
}
