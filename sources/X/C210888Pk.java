package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210888Pk {
    public static String LIZIZ;
    public static final List<String> LIZ = new ArrayList();
    public static final java.util.Set<String> LIZJ = C77275UUl.LJIIIIZZ("left_container_author", "left_container_description", "left_container_social_repost", "right_container_report", "right_container_avatar", "right_container_digg", "right_container_comment", "right_container_favorite", "right_container_share", "right_container_music_cover", "bottom_container_story_progress_bar", "bottom_container_story_uploading_bar", "bottom_container_download_progress_bar", "bottom_container_photomode_page_control", "bottom_container_photomode_dot_page_control", "bottom_container_video_progress_bar", "right_container_clear_mode", "top_bottom_container_landscape_entrance", "top_bottom_container_photomode_indicator");

    public static final String LIZLLL(C8O4 c8o4) {
        String str;
        String str2;
        M89 m89;
        o.LJIIIZ(c8o4, "<this>");
        KRA LIZIZ2 = c8o4.LIZIZ();
        String str3 = null;
        if (LIZIZ2 != null) {
            str = LIZIZ2.LIZ;
        } else {
            str = null;
        }
        KRA LIZIZ3 = c8o4.LIZIZ();
        if (LIZIZ3 != null) {
            str2 = C56509MFt.LIZLLL(LIZIZ3);
        } else {
            str2 = null;
        }
        KRA LIZIZ4 = c8o4.LIZIZ();
        if (LIZIZ4 != null) {
            str3 = C56509MFt.LJ(LIZIZ4);
        }
        if (!o.LJ(str2, "personal_homepage") && !o.LJ(str2, "others_homepage")) {
            if (!o.LJ(str3, "from_profile_other") || !o.LJ(str2, "collection_video")) {
                KRA LIZIZ5 = c8o4.LIZIZ();
                if (LIZIZ5 != null && (m89 = LIZIZ5.LIZJ) != null && m89.isMyProfile()) {
                    return "PROFILE";
                }
                if (o.LJ(str2, "playlist") || C56509MFt.LJII(c8o4.LIZIZ())) {
                    return "DETAIL";
                }
                return str;
            }
            return "PROFILE";
        }
        return "PROFILE";
    }

    public static String LIZ(String str, String str2, List list) {
        FeedComponentPriorityData LIZ2 = C8QN.LIZ(str, str2);
        if (LIZ2 == null || list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) it.next();
            linkedHashMap.put(anchorCommonStruct.getComponentKey(), anchorCommonStruct);
        }
        List<String> list2 = LIZ2.priorityList;
        if (list2 != null) {
            for (String str3 : list2) {
                if (linkedHashMap.containsKey(str3)) {
                    return str3;
                }
            }
        }
        return null;
    }

    public static String LIZIZ(FeedComponentPriorityData feedComponentPriorityData, List list, EnumC210828Pe convertType) {
        List<String> list2;
        String str;
        o.LJIIIZ(convertType, "convertType");
        if (feedComponentPriorityData != null && (list2 = feedComponentPriorityData.priorityList) != null) {
            for (String str2 : list2) {
                int i = C210818Pd.LIZ[convertType.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    str = "";
                } else {
                    str = str2;
                }
                if (list != null && list.contains(str)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public static String LIZJ(String str, String str2, java.util.Map map) {
        List<String> list;
        FeedComponentPriorityData LIZ2 = C8QN.LIZ(str, str2);
        if (LIZ2 != null && (list = LIZ2.priorityList) != null) {
            for (String str3 : list) {
                if (map.containsKey(str3)) {
                    return str3;
                }
            }
        }
        return null;
    }
}
