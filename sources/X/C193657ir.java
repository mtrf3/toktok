package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193657ir {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Aweme aweme) {
        String str;
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAuthor() != null) {
            HG3.LJIIL();
            String curUserId = HG3.LJLJL.LJFF().getCurUserId();
            User author = aweme.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            if (TextUtils.equals(curUserId, str)) {
                return "self";
            }
        }
        return "other";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r2) {
        /*
            java.lang.String r0 = "downloadMethod"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r0 = r2.hashCode()
            java.lang.String r1 = "shortcut_panel"
            switch(r0) {
                case -856829657: goto L2d;
                case 108405416: goto L24;
                case 573144267: goto L1d;
                case 694717273: goto L11;
                default: goto Le;
            }
        Le:
            java.lang.String r1 = ""
        L10:
            return r1
        L11:
            java.lang.String r0 = "click_download_icon"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            goto Le
        L1a:
            java.lang.String r1 = "share_panel"
            goto L10
        L1d:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L10
            goto Le
        L24:
            java.lang.String r0 = "retry"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L10
            goto Le
        L2d:
            java.lang.String r0 = "long_press_download"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            goto Le
        L36:
            java.lang.String r1 = "long_press"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193657ir.LIZIZ(java.lang.String):java.lang.String");
    }

    public static final OSZ<Integer, String> LJFF(int i) {
        int i2;
        String str;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    if (i != 1000) {
                        if (i != 1001) {
                            if (i != 2000) {
                                if (i != 2001) {
                                    if (i != 3002) {
                                        if (i != 3003) {
                                            if (i != 4000) {
                                                if (i != 4001) {
                                                    if (i != 5000) {
                                                        if (i != 8000) {
                                                            i2 = -1;
                                                            str = "";
                                                        } else {
                                                            i2 = 20;
                                                            str = "window_follow";
                                                        }
                                                    } else {
                                                        i2 = 7;
                                                        str = "found";
                                                    }
                                                } else {
                                                    i2 = 8;
                                                    str = "music_new";
                                                }
                                            } else {
                                                i2 = 6;
                                                str = "music_hot";
                                            }
                                        } else {
                                            i2 = 9;
                                            str = "challenge";
                                        }
                                    } else {
                                        i2 = 5;
                                        str = "challenge_hot";
                                    }
                                }
                            }
                        }
                        i2 = 4;
                        str = "personal_collection";
                    }
                    i2 = 3;
                    str = "personal_homepage";
                } else {
                    str = "homepage_fresh";
                }
            } else {
                str = "homepage_follow";
            }
        } else {
            i2 = 0;
            str = "homepage_hot";
        }
        return new OSZ<>(Integer.valueOf(i2), str);
    }

    public static void LJ(int i, Bundle bundle, String str, String str2, String str3) {
        String str4;
        String str5;
        String string;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("download_method", str2);
        c188727au.LJIIIZ("group_id", str3);
        Integer num = null;
        if (bundle != null) {
            str4 = bundle.getString("detail_tab_name");
        } else {
            str4 = null;
        }
        String str6 = "";
        if (str4 == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("detail_tab_name", str4);
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("aweme_type"));
        }
        c188727au.LJFF(num, "aweme_type");
        if (bundle == null || (str5 = bundle.getString("is_self_video")) == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("is_self_video", str5);
        if (bundle != null && (string = bundle.getString("download_id")) != null) {
            str6 = string;
        }
        c188727au.LJIIIZ("download_id", str6);
        c188727au.LIZLLL(i, "is_downloading");
        FMX.LJIIL("download_cancel", c188727au.LIZ);
    }

    public static final void LIZJ(Aweme aweme, String str, String downloadMethod, String str2, String str3, String str4, Bundle bundle, Integer num, HashMap<String, String> hashMap, boolean z) {
        String str5;
        String str6;
        String str7;
        String str8;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("download_type", LIZ(aweme));
        c188727au.LJIIIZ("download_method", downloadMethod);
        c188727au.LJIIIZ("panel_source", LIZIZ(downloadMethod));
        c188727au.LIZLLL(C44938HkM.LJIIIZ, "retry_time");
        c188727au.LJIIIZ("compilation_id", aweme.getMixId());
        c188727au.LJIIIZ("impr_type", C227768wm.LJFF(aweme));
        c188727au.LIZLLL(0, "is_reposted");
        c188727au.LJIIIZ("from_group_id", str3);
        if (bundle != null) {
            str5 = bundle.getString("detail_tab_name");
        } else {
            str5 = null;
        }
        String str9 = "";
        if (str5 == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("detail_tab_name", str5);
        c188727au.LJFF(num, "is_landscape_screen");
        c188727au.LIZLLL(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        V0N.LJI(c188727au, aweme);
        if (z) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str6 = "1";
        }
        c188727au.LJIIIZ("is_save_with_watermark", str6);
        AnonymousClass636.LIZIZ(c188727au, aweme.getAid());
        c188727au.LJIIIZ("enter_position", C222578oP.LJII(C84763XOl.LJIIIIZZ(), null, null));
        C222578oP.LIZJ(c188727au, aweme, null, null, 14);
        c188727au.LIZLLL(aweme.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
        if (bundle == null || (str7 = bundle.getString("is_self_video")) == null) {
            str7 = "";
        }
        c188727au.LJIIIZ("is_self_video", str7);
        if (bundle == null || (str8 = bundle.getString("download_id")) == null) {
            str8 = "";
        }
        c188727au.LJI("download_id", str8);
        if (str4 != null && str4.length() != 0) {
            c188727au.LJI("news_id", str4);
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (str != null) {
            str9 = str;
        }
        if (LJIIZILJ.LJIIJ(str9)) {
            c188727au.LJI("play_mode", FypAutoScrollServiceImpl.LJIIZILJ().LJIIIZ());
        }
        if (aweme.getRepostFromGroupId() != null || aweme.getRepostFromUserId() != null) {
            c188727au.LJI("group_id", aweme.getRepostFromGroupId());
            c188727au.LJI("author_id", aweme.getRepostFromUserId());
            c188727au.LJI("repost_from_group_id", aweme.getAid());
            c188727au.LJI("repost_from_user_id", aweme.getAuthorUid());
            c188727au.LIZLLL(1, "is_reposted");
        }
        if (C227768wm.LJJIIJ(str)) {
            if (TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) {
                C2UL.LIZ();
            }
            c188727au.LJI("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme)));
        }
        if (str2 != null && str2.length() > 0) {
            c188727au.LJI("action_on", str2);
        }
        CommonFeedApiService.LIZ().LJ(c188727au, aweme);
        Z9N z9n = Z9N.LIZIZ;
        java.util.Map<String, String> LLJLLIL = z9n.LLJLLIL(str, z9n.LJLJJLL(str));
        if (!LLJLLIL.isEmpty()) {
            c188727au.LJIIIIZZ(LLJLLIL);
        }
        LQA lqa = LQA.LIZIZ;
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        lqa.LJII(str, (HashMap) map, aweme, false);
        C51556KLg.LIZ.getClass();
        java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(aweme, null);
        if (!LJIIJJI.isEmpty()) {
            c188727au.LJIIIIZZ(LJIIJJI);
        }
        C57258Mda.LIZIZ(c188727au, "download", hashMap);
        c188727au.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(C84763XOl.LJIIIIZZ(), aweme), "music_name");
        z9n.LJJIFFI().LIZ(c188727au, aweme);
        C222578oP.LIZJ(C220488l2.LIZIZ.LJII(aweme, c188727au), aweme, null, null, 14);
        if (o.LJ(str, "homepage_nearby")) {
            HashMap<String, String> hashMap2 = new HashMap<>();
            NearbyFeedServiceImpl.LJJI().LJII(str, hashMap2, aweme, false);
            if (!hashMap2.isEmpty()) {
                c188727au.LJII(hashMap2);
            }
        }
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIIL(c188727au);
    }
}
