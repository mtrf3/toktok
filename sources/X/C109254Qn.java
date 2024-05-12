package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.4Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109254Qn {
    public static long LIZ;
    public static long LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C4PK.LJLIL);
    public static final List<String> LIZLLL = C47261Igj.LJJIJIIJI("comment", "aweme", "aweme_photo", "challenge", "mix_videos", "music", "point_of_interest", "playlist", "qna", "sticker", "user", "following_feed_0_following", "friends_feed_empty");

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L3a
            android.os.Bundle r1 = r5.extras
            if (r1 == 0) goto L3a
            java.lang.String r0 = "enter_from"
            java.lang.String r3 = r1.getString(r0)
        Ld:
            java.lang.String r4 = ""
            if (r3 != 0) goto L12
            r3 = r4
        L12:
            if (r5 == 0) goto L38
            android.os.Bundle r1 = r5.extras
            if (r1 == 0) goto L22
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L36
        L20:
            if (r5 == 0) goto L38
        L22:
            java.lang.String r1 = r5.itemType
        L24:
            java.lang.String r0 = "live"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r1 = 0
            if (r0 == 0) goto L3c
            java.lang.String r0 = "feed_live_long_press"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L3c
            return r1
        L36:
            r4 = r0
            goto L20
        L38:
            r1 = r2
            goto L24
        L3a:
            r3 = r2
            goto Ld
        L3c:
            java.lang.String r0 = "shortcut_panel"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = "personal_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L55
        L54:
            return r1
        L55:
            java.util.List<java.lang.String> r0 = X.C109254Qn.LIZLLL
            if (r5 == 0) goto L5b
            java.lang.String r2 = r5.itemType
        L5b:
            boolean r0 = X.ORZ.LJLJJI(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109254Qn.LIZIZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):boolean");
    }

    public static void LIZ(String groupId, String platform) {
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(platform, "platform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", Long.valueOf(LIZIZ - LIZ));
        linkedHashMap.put("platform", platform);
        linkedHashMap.put("group_id", groupId);
        C188727au c188727au = new C188727au();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c188727au.LJFF(entry.getValue(), (String) entry.getKey());
        }
        FMX.LJIIL("share_convert_loading_duration", c188727au.LIZ);
    }
}
