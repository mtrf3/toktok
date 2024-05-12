package X;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;

/* renamed from: X.OVj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62011OVj {
    public static boolean LJ() {
        C53079KsN.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("live_wallpaper_block", false);
    }

    public static String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZIZ());
        LIZ.append("fallback.mp4");
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZIZ() {
        File LLIIJLIL = C16880lQ.LLIIJLIL(EF7.LIZIZ());
        if (LLIIJLIL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LLIIJLIL);
            LIZ.append("/LiveWallpaper");
            LIZ.append("/");
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    public static boolean LJI() {
        if (!C1DH.LJJIFFI() || Build.VERSION.SDK_INT < 26) {
            C53080KsO.LIZ.getClass();
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("live_wallpaper_not_use_plugin", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (LIZLLL(aweme) || (aweme != null && aweme.getAuthor() != null && !HG3.LJIILL().isMe(aweme.getAuthor().getUid()) && aweme.getAuthor().isSecret())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return true;
        }
        int width = video.getWidth();
        int height = video.getHeight();
        if (width == 0 || height == 0 || aweme.getAwemeType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(Activity activity) {
        String message;
        String str = InterfaceC28729BPh.LIZ;
        int i = -1;
        if (activity != null && !TextUtils.isEmpty(str)) {
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null) {
                try {
                    PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, str, 0);
                    if (LLLLLLZ != null) {
                        i = LLLLLLZ.versionCode;
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    message = e.getMessage();
                }
            }
            message = "";
            if (!TextUtils.isEmpty(message)) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("errorMsg", message);
                C8HX.LIZIZ("get_app_info", "", c198517qh.LJ());
            }
        }
        C52734Kmo.LIZ.getClass();
        if (((Number) C52734Kmo.LIZIZ.getValue()).intValue() <= i) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Context context, String str) {
        try {
            WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
            if (wallpaperInfo != null) {
                String packageName = wallpaperInfo.getPackageName();
                if (LJI()) {
                    return InterfaceC28729BPh.LIZ.equals(packageName);
                }
                return packageName.equals(str);
            }
            return false;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static void LJII(int i, String str) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("message", str);
        C09900aA.LJIIJJI("livewall_paper_download", i, c198517qh.LJ());
        if (!TextUtils.isEmpty(str)) {
            C198517qh c198517qh2 = new C198517qh();
            c198517qh2.LIZ.put("message", str);
            C8HX.LIZIZ("type_livewall_paper_download", "", c198517qh2.LJ());
        }
    }

    public static void LJIIIIZZ(int i, String str) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("message", str);
        C09900aA.LJIIJJI("livewall_paper_setting", i, c198517qh.LJ());
        if (!TextUtils.isEmpty(str)) {
            C198517qh c198517qh2 = new C198517qh();
            c198517qh2.LIZ.put("message", str);
            C8HX.LIZIZ("type_livewallpaper_setting", "", c198517qh2.LJ());
        }
    }

    public static void LJIIIZ(Activity activity, boolean z, boolean z2) {
        C188727au LIZJ = C78920UyC.LIZJ(z ? 1 : 0, "action");
        LIZJ.LIZLLL(FCD.LJFF(activity, "com.android.vending") ? 1 : 0, "is_gp_install");
        LIZJ.LIZLLL(z2 ? 1 : 0, "type");
        FMX.LJIIL("wallpaper_plugin_download_dialog_click", LIZJ.LIZ);
    }

    public static void LJIIJJI(String str, String str2, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LIZLLL(z ? 1 : 0, "is_success");
        FMX.LJIIL("wallpaper_download_result", c188727au.LIZ);
    }

    public static boolean LJIILIIL(final Activity activity, final Aweme aweme, String str) {
        int i;
        int i2;
        int i3;
        if (!LJI() || activity == null || activity.isFinishing()) {
            return false;
        }
        final boolean LJFF = FCD.LJFF(activity, InterfaceC28729BPh.LIZ);
        if (LJFF && !LJIIL(activity)) {
            return false;
        }
        if (activity.isFinishing()) {
            return true;
        }
        if (LJFF) {
            i = R.string.tgh;
            i2 = R.string.tgi;
            i3 = R.string.tgg;
        } else {
            i = R.string.tto;
            i2 = R.string.ttp;
            i3 = R.string.hi3;
        }
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new SY9(activity, R.raw.icon_2pt_live_wallpaper));
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJ(i2);
        c26227ARb.LIZ(i);
        ARI ari = new ARI(activity);
        ari.LJI(i3, new InterfaceC88472Yns() { // from class: X.OW5
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                Video video;
                UrlModel cover;
                Object obj2;
                Aweme aweme2 = aweme;
                Activity activity2 = activity;
                boolean z = LJFF;
                if (aweme2 != null) {
                    C31268COy c31268COy = C31268COy.LJI;
                    c31268COy.getClass();
                    if (!c31268COy.LIZ(aweme2.getAid()) && (video = aweme2.getVideo()) != null && (cover = video.getCover()) != null && video.getPlayAddrH264() != null && !C79004UzY.LJJIFFI(video.getPlayAddrH264().getUrlList())) {
                        List<String> urlList = video.getPlayAddrH264().getUrlList();
                        if (urlList.size() > 2) {
                            obj2 = ListProtector.get(urlList, 2);
                        } else {
                            obj2 = ListProtector.get(urlList, 0);
                        }
                        String LIZ = C41823GbD.LIZ(aweme2, (String) obj2);
                        if (!TextUtils.isEmpty(LIZ)) {
                            OW7 newBuilder = LiveWallPaperBean.newBuilder();
                            newBuilder.LIZ = aweme2.getAid();
                            newBuilder.LJII = cover;
                            newBuilder.LJIIIIZZ = LIZ;
                            newBuilder.LJIIIZ = video.getPlayAddrH264().getUri();
                            newBuilder.LIZLLL = video.getWidth();
                            newBuilder.LJ = video.getHeight();
                            newBuilder.LJFF = "video_share";
                            newBuilder.LJI = 0.0f;
                            newBuilder.LJIIJ = C4LD.LIZ.LJJ(aweme2);
                            ListProtector.add(c31268COy.LIZ, 0, new LiveWallPaperBean(newBuilder));
                            c31268COy.LJ();
                        }
                    }
                }
                if (activity2 != null) {
                    try {
                        if (!FCD.LJFF(activity2, "com.android.vending")) {
                            SmartRoute buildRoute = SmartRouter.buildRoute(activity2, "aweme://webview/");
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("https://play.google.com/store/apps/details?id=");
                            LIZ2.append("com.zhiliao.musically.livewallpaper");
                            buildRoute.withParam(UriProtector.parse(X1D.LIZIZ(LIZ2)));
                            buildRoute.withParam("hide_nav_bar", true);
                            buildRoute.withParam("hide_status_bar", true);
                            buildRoute.open();
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("market://details?id=");
                            LIZ3.append("com.zhiliao.musically.livewallpaper");
                            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ3)));
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
                            C16880lQ.LIZIZ(activity2, intent);
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                C62011OVj.LJIIIZ(activity2, true, z);
                return C76800UCe.LIZ;
            }
        });
        ari.LJIIIIZZ(R.string.ivd, new InterfaceC88472Yns() { // from class: X.OVk
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                C62011OVj.LJIIIZ(activity, false, LJFF);
                return C76800UCe.LIZ;
            }
        });
        c26227ARb.LJIIL = ari;
        c26227ARb.LJIIIZ = new C244689iy(activity, imageView);
        c26227ARb.LJI().LIZLLL();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJFF(Boolean.valueOf(FCD.LJFF(EF7.LIZIZ(), "com.android.vending")), "is_gp_install");
        FMX.LJIIL("wallpaper_plugin_alert", c188727au.LIZ);
        return true;
    }

    public static void LJIIJ(String str, String str2, String str3, boolean z) {
        int i;
        String str4;
        String str5;
        LiveWallPaperBean liveWallPaperBean = C31268COy.LJI.LIZLLL;
        if (liveWallPaperBean != null && liveWallPaperBean.getVolume() > 0.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (z) {
            str4 = "wall_paper_success";
        } else {
            str4 = "wall_paper_fail";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LIZLLL(i, "is_volume_enable");
        c188727au.LJIIIZ("error_msg", str3);
        FMX.LJIIL(str4, c188727au.LIZ);
        if (z) {
            UgCommonServiceImpl.LJIJ().LIZLLL();
        }
        IRuntimeBehaviorService LJ = RuntimeBehaviorServiceImpl.LJ();
        if (z) {
            str5 = "wallpaper_set_success";
        } else {
            str5 = "wallpaper_set_error";
        }
        LJ.event(str5, String.valueOf(C62016OVo.LIZ().getBoolean("keva_key_last_engine_is_tt_player", false)));
    }
}
