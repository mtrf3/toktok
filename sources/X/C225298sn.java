package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225298sn {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZIZ(Aweme aweme, int i, java.util.Set set) {
        String str;
        int i2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        String authorUid;
        C188727au c188727au = new C188727au();
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
            str2 = authorUid;
        }
        c188727au.LJIIIZ("author_id", str2);
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        }
        c188727au.LJFF(num, "aweme_type");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i2 = imageList.size();
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "pic_cnt");
        c188727au.LIZLLL(i, "download_pic_cnt");
        c188727au.LJIIIZ("download_pic_location", String.valueOf(set));
        FMX.LJIIL("download_failure_window_show", c188727au.LIZ);
    }

    public static void LIZJ(int i, int i2, Aweme aweme) {
        String str;
        Integer num;
        int i3;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        LIZ = SystemClock.elapsedRealtime();
        C188727au c188727au = new C188727au();
        c188727au.LJ(LIZ, "start_download");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("aweme_id", str);
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i3 = imageList.size();
        } else {
            i3 = 0;
        }
        c188727au.LIZLLL(i3, "pic_cnt");
        c188727au.LIZLLL(i, "download_pic_cnt");
        c188727au.LIZLLL(i2, "is_photo_download");
        LQA lqa = LQA.LIZIZ;
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        lqa.LJII(null, (HashMap) map, aweme, true);
        C51556KLg.LIZ.getClass();
        java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(aweme, null);
        if (!LJIIJJI.isEmpty()) {
            c188727au.LJIIIIZZ(LJIIJJI);
        }
        FMX.LJIIL("download_start", c188727au.LIZ);
    }

    public static void LIZ(int i, int i2, Aweme aweme, String str) {
        String str2;
        String str3;
        String str4;
        User user;
        Integer num;
        String str5;
        int i3;
        String str6;
        String str7;
        String str8;
        String string;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C188727au LJ = C169696lJ.LJ(elapsedRealtime, "end_download");
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        LJ.LJIIIZ("aweme_id", str2);
        LJ.LJ(elapsedRealtime - LIZ, "duration");
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        String str9 = "";
        if (str3 == null) {
            str3 = "";
        }
        LJ.LJIIIZ("group_id", str3);
        if (aweme == null || (str4 = aweme.getAuthorUid()) == null) {
            str4 = "";
        }
        LJ.LJIIIZ("author_id", str4);
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        LJ.LJIIIZ("follow_status", C227768wm.LJIJ(user));
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        LJ.LJFF(num, "aweme_type");
        if (C54838Lfe.LJIIZILJ(aweme)) {
            str5 = "story";
        } else {
            str5 = "post";
        }
        LJ.LJIIIZ("story_type", str5);
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i3 = imageList.size();
        } else {
            i3 = 0;
        }
        LJ.LIZLLL(i3, "pic_cnt");
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        LJ.LJIIIZ("enter_from", str6);
        LJ.LIZLLL(i2, "is_photo_download");
        Bundle bundle = C44896Hjg.LJIL;
        if (bundle == null || (str7 = bundle.getString("now_type")) == null) {
            str7 = "";
        }
        LJ.LJIIIZ("now_type", str7);
        Bundle bundle2 = C44896Hjg.LJIL;
        if (bundle2 == null || (str8 = bundle2.getString("download_method")) == null) {
            str8 = "";
        }
        LJ.LJIIIZ("download_method", str8);
        Bundle bundle3 = C44896Hjg.LJIL;
        if (bundle3 != null && (string = bundle3.getString("detail_tab_name")) != null) {
            str9 = string;
        }
        LJ.LJIIIZ("detail_tab_name", str9);
        LJ.LIZLLL(i, "download_pic_cnt");
        if (o.LJ(str, "homepage_nearby")) {
            LQA lqa = LQA.LIZIZ;
            java.util.Map<String, String> map = LJ.LIZ;
            o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
            lqa.LJII(str, (HashMap) map, aweme, true);
        }
        C51556KLg.LIZ.getClass();
        java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(aweme, null);
        if (true ^ LJIIJJI.isEmpty()) {
            LJ.LJIIIIZZ(LJIIJJI);
        }
        Object LJII = c220488l2.LJII(aweme, LJ);
        C222578oP.LIZJ(LJII, aweme, null, null, 14);
        FMX.LJIIL("download_end", ((C188727au) LJII).LIZ);
        LIZ = 0L;
    }
}
