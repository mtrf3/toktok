package X;

import java.util.HashMap;

/* loaded from: classes10.dex */
public final class M6Q {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(M6R.LJLIL);
    public final HashMap<String, C75552xr> LIZ;

    public M6Q() {
        HashMap<String, C75552xr> hashMap = new HashMap<>();
        this.LIZ = hashMap;
        hashMap.put("(?:share/)?question/[^/?]*-(\\d+)(?=(?:[?/]|$))", new C75552xr("(?:share/)?question/[^/?]*-(\\d+)(?=(?:[?/]|$))", "qna", "https://www.tiktok.com/question/are-u-single-7188323829868221466?_r=1", "zhangpengfei.flyer", new Class[]{M6V.class}, new Class[]{M6V.class}, new String[]{"//qna/detail/"}));
        hashMap.put("third-party-oauth-redirect/music/amazon", new C75552xr("third-party-oauth-redirect/music/amazon", "musicauth", "https://www.tiktok.com/third-party-oauth-redirect/music/amazon?code=123&scope=profile", "liuxiangyu.jason", new Class[]{M6U.class}, new Class[]{M6U.class}, new String[]{"//third-party-oauth-redirect/music/amazon"}));
        hashMap.put("v2/h5/auth/authorize", new C75552xr("v2/h5/auth/authorize", "Auth", "https://www.tiktok.com/v2/h5/auth/authorize?xxx=xxx", "haifan.ou", new Class[]{M6V.class}, new Class[]{M6V.class}, new String[]{"//v2/authorize"}));
    }
}
