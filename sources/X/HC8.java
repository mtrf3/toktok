package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HC8 {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LJFF;
    public static Integer LJIIIZ;
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";

    public static String LIZIZ(boolean z) {
        return z ? "sound_sync" : "video";
    }

    public static C145995oB LIZ() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", LIZ);
        c145995oB.LJI("creation_id", LIZIZ);
        c145995oB.LJI("enter_from", "video_sync_page");
        return c145995oB;
    }

    public static C145995oB LJI() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", LIZ);
        c145995oB.LJI("creation_id", LIZIZ);
        c145995oB.LJI("content_source", "upload");
        c145995oB.LJI("content_type", LIZIZ(false));
        return c145995oB;
    }

    public static void LIZJ(List list) {
        int i;
        if (C77413UZt.LJIILL(list)) {
            return;
        }
        o.LJI(list);
        Iterator it = list.iterator();
        long j = 0;
        int i2 = 0;
        while (it.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it.next();
            j += videoSegment.duration;
            if (videoSegment.isImageType) {
                i2++;
            }
        }
        if (!o.LJ("comment_reply", LIZ)) {
            LIZLLL = "";
            LJ = "";
        }
        C145995oB LIZ2 = LIZ();
        LIZ2.LJI("content_type", LIZIZ(false));
        LIZ2.LJI("content_source", "upload");
        LIZ2.LIZIZ(j, "content_duration_ms");
        LIZ2.LJI("reply_comment_id", LIZLLL);
        LIZ2.LJI("reply_user_id", LJ);
        LIZ2.LIZ(list.size() - i2, "video_cnt");
        LIZ2.LIZ(i2, "pic_cnt");
        if (list.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ2.LIZ(i, "is_multi_content");
        LIZ2.LJI("mix_type", C78977Uz7.LJJJJJ(list.size() - i2, i2));
        LIZ2.LJI("upload_next_method", LJFF);
        LIZ2.LJI("enter_from", "clip_edit_page");
        LIZ2.LJI("channel", LJI);
        LIZ2.LJI("share_panel_option", LJII);
        LIZ2.LJI("effect_resource_id", LJIIIIZZ);
        LIZ2.LIZJ(LJIIIZ, "share_media_type");
        String str = LIZJ;
        if (str != null && str.length() != 0) {
            LIZ2.LIZLLL("enter_method", LIZJ);
        }
        H8W.LIZ("enter_clip_edit_page");
        FMX.LJIIL("enter_clip_edit_page", LIZ2.LIZ);
    }

    public static void LIZLLL(String str, List list) {
        if (C77413UZt.LJIILL(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        o.LJI(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it.next();
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((VideoSegment) it2.next()).duration;
        }
        C145995oB LIZ2 = LIZ();
        LIZ2.LJI("content_type", LIZIZ(false));
        LIZ2.LJI("content_source", "upload");
        LIZ2.LIZIZ(j, "content_duration_ms");
        FMX.LJIIL(str, LIZ2.LIZ);
    }

    public static void LJFF(int i, String fastImportErrorDesc, boolean z) {
        int i2;
        o.LJIIIZ(fastImportErrorDesc, "fastImportErrorDesc");
        C145995oB c145995oB = new C145995oB();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c145995oB.LIZ(i2, "fast_import");
        c145995oB.LIZ(i, "clip_mode");
        c145995oB.LJI("fast_import_fail", fastImportErrorDesc);
        FMX.LJIIL("single_fast_import_cover_rate", c145995oB.LIZ);
    }

    public static void LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z) {
            C145995oB LJI2 = LJI();
            LJI2.LJI("edit_way", "click");
            FMX.LJIIL("edit_clip", LJI2.LIZ);
        } else {
            if (z4) {
                FMX.LJIIL("edit_clip_delete", LJI().LIZ);
                return;
            }
            if (z2) {
                FMX.LJIIL("edit_clip_complete", LJI().LIZ);
                return;
            }
            if (z3) {
                FMX.LJIIL("edit_clip_cancel", LJI().LIZ);
            } else if (z5) {
                C145995oB LJI3 = LJI();
                LJI3.LJI("edit_way", "press");
                FMX.LJIIL("edit_clips_order", LJI3.LIZ);
            }
        }
    }
}
