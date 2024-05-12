package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import defpackage.e1;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.McQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57186McQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        return UPJ.LJ((RBX) HG3.LJIILL(), LIZ2, LIZ2);
    }

    public static boolean LIZIZ(Aweme aweme) {
        Music music;
        String str;
        if (aweme != null && (music = aweme.getMusic()) != null && music.getCoverThumb() != null) {
            UrlModel coverThumb = music.getCoverThumb();
            if (TextUtils.isEmpty(coverThumb.getUri())) {
                List<String> urlList = coverThumb.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    Iterator<String> it = urlList.iterator();
                    while (it.hasNext()) {
                        if (!TextUtils.isEmpty(it.next())) {
                        }
                    }
                }
            }
            Music music2 = aweme.getMusic();
            if (music2 != null) {
                str = music2.getOwnerId();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) || e1.LIZ(31744, "remove_music_cover_black_circle", true, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:7|(2:9|(8:11|12|(8:36|37|(1:51)(1:41)|42|(2:46|(1:49))|35|19|(1:28)(1:27))|16|(3:18|19|(1:33)(1:34))|35|19|(0)(0)))|53|12|(1:14)|36|37|(1:39)|51|42|(3:44|46|(3:49|16|(0)))|35|19|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(X.ActivityC45651qj r13, java.lang.String r14, com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            r3 = 0
            if (r15 != 0) goto L4
            return r3
        L4:
            if (r13 != 0) goto L7
            return r3
        L7:
            X.2Zj r0 = X.C2MX.LIZ()
            boolean r12 = r0.LIZ(r14)
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            boolean r11 = r0.LJJIIZ(r13)
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            com.bytedance.hox.Hox r1 = r0.LIZ(r13)
            java.lang.String r0 = "For You"
            boolean r10 = r1.vv0(r0)
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r1 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.LIZJ()
            com.ss.android.ugc.aweme.music.model.Music r0 = r15.getMusic()
            boolean r9 = r1.LJIILLIIL(r0)
            java.lang.String r2 = "music_marquee_strategy_repo"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r0 = "key_music_cover_animation_count"
            java.lang.String r0 = LIZ(r0)
            int r1 = r1.getInt(r0, r3)
            com.ss.android.ugc.aweme.feed.assem.music.MusicCapsuleConfig r8 = X.C57188McS.LIZ
            int r0 = r8.count
            r5 = 1
            if (r1 >= r0) goto Lbb
            com.bytedance.keva.Keva r4 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r0 = "key_music_cover_animation_show_time"
            java.lang.String r2 = LIZ(r0)
            r0 = 0
            long r0 = r4.getLong(r2, r0)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r6 = r6 / r0
            long r1 = r8.interval
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lbb
            r4 = 1
        L67:
            com.ss.android.ugc.aweme.music.model.Music r0 = r15.getMusic()
            if (r0 == 0) goto L8e
            boolean r0 = r0.isPgc()
            if (r0 != r5) goto L8e
        L73:
            int r0 = r15.getMusicTitleStyle()
            if (r0 != r5) goto Lb9
            r1 = 1
        L7a:
            boolean r0 = r15.isAd()
            if (r12 != 0) goto L8d
            if (r11 != 0) goto L8d
            if (r10 == 0) goto L8d
            if (r9 != 0) goto L8d
            if (r4 == 0) goto L8d
            if (r1 == 0) goto L8d
            if (r0 != 0) goto L8d
            r3 = 1
        L8d:
            return r3
        L8e:
            com.ss.android.ugc.aweme.music.model.Music r0 = r15.getMusic()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L9c
            boolean r0 = r0.isPgc()     // Catch: java.lang.Exception -> Lb9
            if (r0 != r5) goto L9c
            r2 = 1
            goto L9d
        L9c:
            r2 = 0
        L9d:
            com.ss.android.ugc.aweme.music.model.Music r0 = r15.getMusic()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto Lb9
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto Lb9
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb9
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = "is_ugc_mapping"
            boolean r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getBoolean(r1, r0)     // Catch: java.lang.Exception -> Lb9
            if (r2 != 0) goto Lb9
            if (r0 == 0) goto Lb9
            goto L73
        Lb9:
            r1 = 0
            goto L7a
        Lbb:
            r4 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57186McQ.LIZLLL(X.1qj, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("action_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("author_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("group_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("music_id", str5);
        FMX.LJIIL("music_cover_capsule", c188727au.LIZ);
    }
}
