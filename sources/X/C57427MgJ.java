package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MgJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57427MgJ {
    public static final String LIZ = ComplianceServiceImpl.LIZ().LJIJI();

    public static void LIZ(String str, Uri.Builder builder) {
        boolean z;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && curUser.isDisciplineMember()) {
            z = true;
        } else {
            z = false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (builder != null) {
            builder.scheme(parse.getScheme());
            builder.authority(parse.getAuthority());
            builder.path(parse.getPath());
        }
        Boolean LIZ2 = SharePrefCache.inst().getIsFirstReportVideo().LIZ();
        o.LJIIIIZZ(LIZ2, "inst().isFirstReportVideo.cache");
        if (LIZ2.booleanValue() && !z) {
            if (builder != null) {
                builder.appendQueryParameter("isFirst", "1");
            } else {
                return;
            }
        } else if (builder == null) {
            return;
        }
        builder.appendQueryParameter("no_hw", "1");
    }

    public static void LIZIZ(Activity activity, Uri.Builder builder, Bundle bundle) {
        boolean z;
        String str;
        o.LJIIIZ(activity, "activity");
        if (builder != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        C25574A1y.LIZLLL("report_url_null_check_ri", null, z);
        if (builder == null) {
            return;
        }
        LIZ("https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html", builder);
        android.net.Uri build = builder.build();
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", String.valueOf(build));
        bundle2.putBoolean("show_load_dialog", false);
        bundle2.putBoolean("hide_nav_bar", true);
        String string = activity.getResources().getString(R.color.ar);
        o.LJIIIIZZ(string, "activity.resources\n     …String(R.color.BGPrimary)");
        bundle2.putString("status_bar_color", ujb.o.LJJJJZ(string, "#", "", false));
        bundle2.putLong("enter_time", System.currentTimeMillis());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (build != null) {
            str = UriProtector.getQueryParameter(build, "object_id");
            str2 = UriProtector.getQueryParameter(build, "enter_from");
        } else {
            str = null;
        }
        C43163Gwp.LIZ(activity, bundle2, str, str2);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i) {
        String str11;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", str5);
        c188727au.LJIIIZ("object_id", str4);
        c188727au.LJIIIZ("object_type", str2);
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str6);
        String str12 = "";
        if (TextUtils.isEmpty(str6)) {
            str11 = "";
        } else {
            str11 = "long_press";
            if (str6 != "long_press") {
                str11 = "share_panel";
            }
        }
        c188727au.LJIIIZ("panel_source", str11);
        c188727au.LIZLLL(i, "is_landscape_screen");
        c188727au.LJIIIZ("group_id", str3);
        if ((TextUtils.equals(str, "search_result") || TextUtils.equals(str, "general_search") || TextUtils.equals(str, "playlist")) && context != null) {
            M89 LIZ2 = C2S6.LIZ(context);
            Z9N z9n = Z9N.LIZIZ;
            java.util.Map<String, String> LLJLLIL = z9n.LLJLLIL(str, LIZ2.getPlaylistPreviousPage());
            if (!LLJLLIL.isEmpty()) {
                java.util.Map LLJJJJ = z9n.LLJJJJ(str, "", "", "", LLJLLIL);
                if (!LLJJJJ.isEmpty()) {
                    c188727au.LJIIIIZZ(LLJJJJ);
                }
            }
        }
        if (!TextUtils.isEmpty("")) {
            c188727au.LJI("room_id", "");
        }
        if (aweme != null) {
            V0N.LJI(c188727au, aweme);
            c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
            c188727au.LIZLLL(C227768wm.LJIILIIL(aweme), "pic_cnt");
            c188727au.LIZLLL(C227768wm.LJIJJ(aweme), "text_post_content");
            if (C78685UuP.LJJJZ(C187677Yd.LIZ(aweme))) {
                c188727au.LJI("photo_content_type", C187677Yd.LIZ(aweme));
            }
            c188727au.LJI("enter_position", C222578oP.LJII(context, str, str9));
            if (aweme.getAwemeType() == 150 && aweme.getPhotoModeImageInfo() != null) {
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                o.LJI(photoModeImageInfo);
                if (photoModeImageInfo.getImageList() != null) {
                    PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                    o.LJI(photoModeImageInfo2);
                    List<PhotoModeImageUrlModel> imageList = photoModeImageInfo2.getImageList();
                    o.LJI(imageList);
                    if (imageList.size() > 0 && !((Boolean) C53115Ksx.LIZ.getValue()).booleanValue()) {
                        PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
                        o.LJI(photoModeImageInfo3);
                        boolean hasTitle = photoModeImageInfo3.hasTitle();
                        c188727au.LJI("from_page", str10);
                        c188727au.LIZLLL(hasTitle ? 1 : 0, "has_title");
                    }
                }
            }
            C51556KLg.LIZ.getClass();
            c188727au.LJIIIIZZ(C51556KLg.LIZ().LJIIJJI(aweme, C51556KLg.LIZ().LJJIJIIJI(aweme.getAid())));
            if (o.LJ("homepage_nearby", str)) {
                LQA lqa = LQA.LIZIZ;
                java.util.Map<String, String> map = c188727au.LIZ;
                o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                lqa.LJII(str, (HashMap) map, aweme, true);
            }
            c188727au.LJI("log_pb", aweme.getLogPbString());
            c188727au.LIZLLL(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        if (str7 != null) {
            c188727au.LJI("last_from_group_id", str7);
        }
        if (str8 != null) {
            c188727au.LJI("search_id", str8);
        }
        String str13 = "post";
        if (Z89.LIZIZ.LIZIZ(aweme) && aweme != null) {
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo == null) {
                str12 = "post";
            } else {
                String nowMediaType = nowPostInfo.getNowMediaType();
                if (nowMediaType != null) {
                    str12 = nowMediaType;
                }
            }
            c188727au.LIZLLL(aweme.getFollowStatus(), "follow_status");
            str13 = str12;
        }
        c188727au.LJI("now_type", str13);
        C51556KLg.LIZ.getClass();
        IPoiService LIZ3 = C51556KLg.LIZ();
        java.util.Map<String, String> map2 = c188727au.LIZ;
        o.LJII(map2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        LIZ3.LJJIJLIJ(aweme, (HashMap) map2);
        C222578oP.LIZJ(C220488l2.LIZIZ.LJII(aweme, c188727au), aweme, null, null, 14);
        FMX.LJIIL("click_report", c188727au.LIZ);
    }
}
