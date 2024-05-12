package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUD {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public static void LIZIZ(String str, List list) {
        if (list.size() == 1 && o.LJ("ttm", ((ExternalMusicInfo) ListProtector.get(list, 0)).getPartnerName())) {
            MusicDetailService.LJIJJ().LIZJ(str);
        }
    }

    public SUD(String str, String str2, String str3, java.util.Map map) {
        HH1.LIZ(str, "processId", str2, "musicId", str3, "groupId");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
    }

    public final void LIZ(Context context, ExternalMusicInfo externalMusic, boolean z, String str, String str2, OX0 ox0, java.util.Map map) {
        boolean z2;
        String str3;
        java.util.Map<String, String> map2;
        String str4 = str2;
        String str5 = str;
        o.LJIIIZ(externalMusic, "externalMusic");
        String vipVerificationSchema = externalMusic.getVipVerificationSchema();
        boolean z3 = false;
        if (vipVerificationSchema == null || vipVerificationSchema.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = null;
        if (!z2) {
            MG0.LIZ(context, vipVerificationSchema, map, null);
            return;
        }
        if (context == null) {
            return;
        }
        if (o.LJ(externalMusic.getPartnerName(), "ttm")) {
            if (SVB.LIZ(context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(externalMusic.getExternalAppLink()).buildUpon().appendQueryParameter("tt_item_id", this.LIZJ).build());
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    C16880lQ.LIZJ(context, intent);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(externalMusic.getExternalDeepLink()).buildUpon().appendQueryParameter("tt_item_id", this.LIZJ).build());
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setPackage("com.tiktok.android.music");
                    C16880lQ.LIZJ(context, intent2);
                }
            } else {
                String externalPreviewSchema = externalMusic.getExternalPreviewSchema();
                if (externalPreviewSchema == null) {
                    externalPreviewSchema = "";
                }
                if (C78857UxB.LJJJIL(externalPreviewSchema)) {
                    if (ox0 != null) {
                        bool = Boolean.valueOf(ox0.getDisableCollect());
                    }
                    C27932Axk.LIZIZ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(externalPreviewSchema);
                    LIZ.append("&enter_from=");
                    LIZ.append("single_song");
                    LIZ.append("&open_timestamp=");
                    LIZ.append(System.currentTimeMillis());
                    LIZ.append("&group_id=");
                    LIZ.append(this.LIZJ);
                    LIZ.append("&disable_collect=");
                    LIZ.append(o.LJ(bool, Boolean.TRUE) ? 1 : 0);
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
                    buildRoute.withParam("enter_from", "single_song");
                    buildRoute.open();
                    C2U8.LIZ(new C7XT());
                }
            }
        } else if (!TextUtils.isEmpty(externalMusic.getJumpUrl())) {
            SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "aweme://webview/");
            buildRoute2.withParam("url", externalMusic.getJumpUrl());
            buildRoute2.withParam("hide_nav_bar", false);
            buildRoute2.withParam("use_webview_title", true);
            buildRoute2.withParam("bundle_forbidden_jump", true);
            buildRoute2.open();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("music_id", this.LIZIZ);
        FMX.LJIIL("click_listen_complete_entrance", c188727au.LIZ);
        if (!z) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("music_id", externalMusic.getPartnerSongId());
        hashMap.put("music_from", externalMusic.getPartnerName());
        hashMap.put("process_id", this.LIZ);
        if (o.LJ("ttm", externalMusic.getPartnerName())) {
            if (SVB.LIZ(context)) {
                str4 = "other_app";
            } else if (str4 == null || str4.length() == 0) {
                str4 = "brand_pop_up";
            }
            hashMap.put("show_type", str4);
        }
        if (str5 == null) {
            str5 = this.LIZIZ;
        }
        hashMap.put("song_id", str5);
        hashMap.put("button_name", "play_full_song");
        hashMap.put("group_id", this.LIZJ);
        if (o.LJ("ttm", externalMusic.getPartnerName()) && (map2 = this.LIZLLL) != null) {
            hashMap.putAll(map2);
        }
        if (ox0 != null && ox0.isPgc()) {
            z3 = true;
        }
        if (z3) {
            str3 = "pgc_clip";
        } else {
            str3 = "original_song";
        }
        hashMap.put("from_music_type", str3);
        FMX.LJIIL("click_copyright_music", hashMap);
        String str6 = this.LIZIZ;
        if (!o.LJ("ttm", externalMusic.getPartnerName())) {
            return;
        }
        MusicDetailService.LJIJJ().LJIILL(str6);
    }
}
