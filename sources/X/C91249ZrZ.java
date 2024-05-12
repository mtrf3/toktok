package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZrZ */
/* loaded from: classes22.dex */
public final class C91249ZrZ {
    public static long LIZ = SystemClock.elapsedRealtime();
    public static long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(X.C91299ZsN r1) {
        /*
            if (r1 == 0) goto L92
            java.lang.String r1 = r1.LIZ
            if (r1 == 0) goto L92
            int r0 = r1.hashCode()
            switch(r0) {
                case -1975256498: goto L85;
                case -1286965972: goto L7f;
                case -329387598: goto L7c;
                case 57912506: goto L70;
                case 270608360: goto L64;
                case 353894318: goto L58;
                case 377203138: goto L55;
                case 527034455: goto L49;
                case 595155138: goto L40;
                case 1130771465: goto L37;
                case 1484257568: goto L2e;
                case 1553123424: goto L25;
                case 1721588043: goto L1c;
                case 1807185499: goto L19;
                case 2062106709: goto L10;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "exit"
        Lf:
            return r0
        L10:
            java.lang.String r0 = "PAUSE_FROM_MEDIA_SESSION_CALLBACK"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Ld
        L19:
            java.lang.String r0 = "PAUSE_FROM_MAIN_PLAYER"
            goto L81
        L1c:
            java.lang.String r0 = "PAUSE_FROM_AUDIO_OUTPUT_CHANGED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Ld
        L25:
            java.lang.String r0 = "PAUSE_FROM_NOTIFICATION_CLICK"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Ld
        L2e:
            java.lang.String r0 = "RESUME_FROM_ON_FOREGROUND"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8e
            goto Ld
        L37:
            java.lang.String r0 = "STOP_FROM_PLAYABLE_CHANGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L52
            goto Ld
        L40:
            java.lang.String r0 = "PAUSE_FROM_ON_BACKGROUND"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Ld
        L49:
            java.lang.String r0 = "STOP_FROM_PLAYABLE_QUEUE_CHANGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L52
            goto Ld
        L52:
            java.lang.String r0 = "shift"
            goto Lf
        L55:
            java.lang.String r0 = "PAUSE_FROM_ON_PAUSE"
            goto L81
        L58:
            java.lang.String r0 = "PAUSE_FROM_USER_PAUSE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Ld
        L61:
            java.lang.String r0 = "pause"
            goto Lf
        L64:
            java.lang.String r0 = "PAUSE_FROM_LOSS_FOCUS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6d
            goto Ld
        L6d:
            java.lang.String r0 = "open_other_app"
            goto Lf
        L70:
            java.lang.String r0 = "PAUSE_FROM_LOG_BACKGROUND_CHANGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L79
            goto Ld
        L79:
            java.lang.String r0 = "backward"
            goto Lf
        L7c:
            java.lang.String r0 = "PAUSE_FROM_CHANGE_TAB"
            goto L81
        L7f:
            java.lang.String r0 = "PAUSE_FROM_SUB_PLAYER"
        L81:
            r1.equals(r0)
            goto Ld
        L85:
            java.lang.String r0 = "RESUME_FROM_LOG_FOREGROUND_CHANGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8e
            goto Ld
        L8e:
            java.lang.String r0 = "forward"
            goto Lf
        L92:
            java.lang.String r0 = "finish"
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91249ZrZ.LIZ(X.ZsN):java.lang.String");
    }

    public static void LJIIIIZZ(C91301ZsP eventData) {
        String str;
        o.LJIIIZ(eventData, "eventData");
        OSZ[] oszArr = new OSZ[10];
        oszArr[0] = new OSZ("enter_method", eventData.LJ);
        oszArr[1] = new OSZ("scene_name", eventData.LIZLLL);
        oszArr[2] = new OSZ("request_id", eventData.LJI);
        oszArr[3] = new OSZ("music_id", eventData.LIZ);
        oszArr[4] = new OSZ("full_clip_id", eventData.LIZIZ);
        oszArr[5] = new OSZ("meta_song_id", eventData.LIZJ);
        if (ActivityStack.isAppBackGround()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[6] = new OSZ("is_background", str);
        oszArr[7] = new OSZ("mvid", eventData.LJII);
        oszArr[8] = new OSZ("media_type", eventData.LJIIIIZZ);
        oszArr[9] = new OSZ("video_group_id", "");
        FMX.LJIIL("dsp_track_show", C113554cx.LJJL(oszArr));
    }

    public static void LJ(String str, String contentId) {
        o.LJIIIZ(contentId, "contentId");
        HashMap hashMap = new HashMap();
        hashMap.put("content_type", str);
        hashMap.put("content_id", contentId);
        FMX.LJIIL("content_show", hashMap);
    }

    public static void LJFF(String tag, String str) {
        Object obj;
        o.LJIIIZ(tag, "tag");
        OSZ[] oszArr = new OSZ[3];
        String str2 = "track_reco";
        if (!o.LJ(tag, "LIBRARY") && !o.LJ(tag, "LIBRARY V2")) {
            obj = "track_reco";
        } else {
            obj = "my_playlist";
        }
        oszArr[0] = new OSZ("scene_name", obj);
        if (o.LJ(tag, "LIBRARY") || o.LJ(tag, "LIBRARY V2")) {
            str2 = "my_playlist";
        }
        oszArr[1] = new OSZ("page", str2);
        oszArr[2] = new OSZ("enter_method", str);
        FMX.LJIIL("dsp_page_status", C113554cx.LJJL(oszArr));
    }

    public static void LJIILIIL(String str, String result) {
        o.LJIIIZ(result, "result");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "");
        hashMap.put("enter_method", str);
        hashMap.put("entrance_type", "dsp");
        hashMap.put("judge_result", result);
        FMX.LJIIL("dsp_entrance_show_judge", hashMap);
    }

    public static void LIZLLL(String enterFrom, String enterMethod, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        HashMap hashMap = new HashMap();
        hashMap.put("show_reason", "backward_guidance");
        hashMap.put("enter_from", enterFrom);
        hashMap.put("enter_method", enterMethod);
        hashMap.put("reaction_type", str);
        FMX.LJIIL("dsp_view_click", hashMap);
    }

    public static void LJI(int i, String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", enterFrom);
        hashMap.put("enter_method", enterMethod);
        hashMap.put("direction", String.valueOf(i));
        FMX.LJIIL("dsp_scene_change_click", hashMap);
    }

    public static void LJII(int i, String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", enterFrom);
        hashMap.put("enter_method", enterMethod);
        hashMap.put("reason", String.valueOf(i));
        FMX.LJIIL("dsp_scene_change_show", hashMap);
    }

    public static void LJIIIZ(String str, String str2, String reportType) {
        o.LJIIIZ(reportType, "reportType");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("enter_method", str2);
        hashMap.put("report_type", reportType);
        FMX.LJIIL("enter_music_dsp", hashMap);
    }

    public static void LJIIJJI(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("leave_method", str2);
        hashMap.put("enter_method", str3);
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - LIZ));
        FMX.LJIIL("leave_music_dsp", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bf, code lost:
    
        if (com.ss.android.ugc.aweme.utils.ActivityStack.isAppBackGround() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r1 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r2.put("is_background", r1);
        r2.put("scene_name", r7.LIZLLL);
        r2.put("enter_method", r7.LJ);
        r2.put("enter_from", r7.LJFF);
        r2.put("request_id", r7.LJI);
        r2.put("audio_over_status", LIZ(r12));
        r2.put("duration", java.lang.String.valueOf(r8));
        r0 = (r8 / r10) * 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        if (java.lang.Double.isNaN(r0) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        r2.put("duration_pct", java.lang.String.valueOf(r0 / 100.0f));
        r2.put("mvid", r7.LJII);
        r2.put("media_type", r7.LJIIIIZZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (r7.LJIIJ == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        r3 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        r2.put("song_type", r3);
        X.FMX.LJIIL("audio_over", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        r0 = X.O6R.LJJIIJZLJL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        r1 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (com.ss.android.ugc.aweme.utils.ActivityStack.isAppBackGround() != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C91301ZsP r7, long r8, long r10, X.C91299ZsN r12) {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = "video_group_id"
            java.lang.String r1 = ""
            r2.put(r0, r1)
            java.lang.String r0 = "video_author_id"
            r2.put(r0, r1)
            java.lang.String r1 = "music_id"
            java.lang.String r0 = r7.LIZ
            r2.put(r1, r0)
            java.lang.String r1 = "full_clip_id"
            java.lang.String r0 = r7.LIZIZ
            r2.put(r1, r0)
            java.lang.String r1 = "meta_song_id"
            java.lang.String r0 = r7.LIZJ
            r2.put(r1, r0)
            r4 = 0
            if (r12 == 0) goto Lc3
            java.lang.String r1 = r12.LIZ
        L2b:
            java.lang.String r0 = "PAUSE_FROM_LOG_BACKGROUND_CHANGE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            java.lang.String r3 = "0"
            java.lang.String r6 = "1"
            if (r0 != 0) goto L43
            if (r12 == 0) goto L3b
            java.lang.String r4 = r12.LIZ
        L3b:
            java.lang.String r0 = "RESUME_FROM_LOG_FOREGROUND_CHANGE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto Lbb
        L43:
            boolean r0 = com.ss.android.ugc.aweme.utils.ActivityStack.isAppBackGround()
            if (r0 == 0) goto Lc1
        L49:
            r1 = r3
        L4a:
            java.lang.String r0 = "is_background"
            r2.put(r0, r1)
            java.lang.String r1 = "scene_name"
            java.lang.String r0 = r7.LIZLLL
            r2.put(r1, r0)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = r7.LJ
            r2.put(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r7.LJFF
            r2.put(r1, r0)
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r7.LJI
            r2.put(r1, r0)
            java.lang.String r1 = LIZ(r12)
            java.lang.String r0 = "audio_over_status"
            r2.put(r0, r1)
            java.lang.String r1 = "duration"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r2.put(r1, r0)
            double r0 = (double) r8
            double r4 = (double) r10
            double r0 = r0 / r4
            r4 = 100
            double r4 = (double) r4
            double r0 = r0 * r4
            boolean r4 = java.lang.Double.isNaN(r0)
            if (r4 == 0) goto Lb6
            r0 = 0
        L8b:
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "duration_pct"
            r2.put(r0, r1)
            java.lang.String r1 = "mvid"
            java.lang.String r0 = r7.LJII
            r2.put(r1, r0)
            java.lang.String r1 = "media_type"
            java.lang.String r0 = r7.LJIIIIZZ
            r2.put(r1, r0)
            boolean r0 = r7.LJIIJ
            if (r0 == 0) goto Lab
            r3 = r6
        Lab:
            java.lang.String r0 = "song_type"
            r2.put(r0, r3)
            java.lang.String r0 = "audio_over"
            X.FMX.LJIIL(r0, r2)
            return
        Lb6:
            int r0 = X.O6R.LJJIIJZLJL(r0)
            goto L8b
        Lbb:
            boolean r0 = com.ss.android.ugc.aweme.utils.ActivityStack.isAppBackGround()
            if (r0 == 0) goto L49
        Lc1:
            r1 = r6
            goto L4a
        Lc3:
            r1 = r4
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91249ZrZ.LIZIZ(X.ZsP, long, long, X.ZsN):void");
    }

    public static void LJIILLIIL(C91301ZsP eventData, String str, String str2, String str3, String enterMethod) {
        o.LJIIIZ(eventData, "eventData");
        o.LJIIIZ(enterMethod, "enterMethod");
        FMX.LJIIL("page_status", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("enter_method", enterMethod), new OSZ("page", "resso_upsell"), new OSZ("upsell_reason", str2), new OSZ("call_to_action", str3), new OSZ("music_id", eventData.LIZ), new OSZ("full_clip_id", eventData.LIZIZ), new OSZ("meta_song_id", eventData.LIZJ), new OSZ("mvid", eventData.LJII), new OSZ("media_type", eventData.LJIIIIZZ), new OSZ("video_group_id", "")));
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", str);
        hashMap.put("group_id", str2);
        hashMap.put("music_from", str4);
        hashMap.put("music_id", str5);
        hashMap.put("song_id", null);
        hashMap.put("show_type", str6);
        hashMap.put("request_id", str3);
        FMX.LJIIL("click_copyright_music", hashMap);
    }

    public static void LJIIL(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", str);
        hashMap.put("group_id", str2);
        hashMap.put("music_from", str4);
        hashMap.put("music_id", str5);
        hashMap.put("song_id", null);
        hashMap.put("show_type", str6);
        hashMap.put("request_id", str3);
        FMX.LJIIL("show_copyright_music", hashMap);
    }

    public static void LJIILJJIL(String str, C91301ZsP eventData, String str2, String action, String enterMethod, String str3, String str4) {
        o.LJIIIZ(eventData, "eventData");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(enterMethod, "enterMethod");
        FMX.LJIIL("group_click", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("enter_method", enterMethod), new OSZ("page", "resso_upsell"), new OSZ("upsell_reason", str2), new OSZ("call_to_action", action), new OSZ("music_id", eventData.LIZ), new OSZ("full_clip_id", eventData.LIZIZ), new OSZ("meta_song_id", eventData.LIZJ), new OSZ("mvid", eventData.LJII), new OSZ("media_type", eventData.LJIIIIZZ), new OSZ("video_group_id", ""), new OSZ("content_type", str3), new OSZ("content_id", str4)));
    }

    public static /* synthetic */ void LJIILL(String str, C91301ZsP c91301ZsP, String str2, String str3, String str4, String str5, int i) {
        if ((i & 32) != 0) {
            str5 = null;
        }
        LJIILJJIL(str, c91301ZsP, str2, str3, str4, str5, null);
    }
}
