package X;

import Y.AObjectS42S0101000_5;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OZk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62116OZk implements InterfaceC62128OZw {
    public final /* synthetic */ C62114OZi LIZ;

    public C62116OZk(C62114OZi c62114OZi) {
        this.LIZ = c62114OZi;
    }

    public final boolean LIZ(int i, String str, String url, java.util.Map map) {
        android.net.Uri parse;
        C62114OZi c62114OZi = this.LIZ;
        ActivityC86117Xqz activityC86117Xqz = c62114OZi.LIZ;
        c62114OZi.LJIIIZ.getClass();
        int i2 = -1;
        String str2 = "";
        if (!TextUtils.isEmpty(url) && (parse = UriProtector.parse(url)) != null) {
            str2 = UriProtector.getQueryParameter(parse, "sec_uid");
            if (!TextUtils.isEmpty(str2)) {
                C40515FvD.LIZJ().LJIIIIZZ(str, str2);
            }
            String queryParameter = UriProtector.getQueryParameter(parse, "scan_page_from");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    i2 = CastIntegerProtector.parseInt(queryParameter);
                } catch (Exception unused) {
                }
            }
        }
        c62114OZi.LJII.getClass();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 8) {
                                if (i != 9) {
                                    if (i != 16) {
                                        if (i != 17) {
                                            if (i != 23) {
                                                if (i == 51) {
                                                    C220488l2.LIZIZ.LJIILIIL(activityC86117Xqz, null, str, null, "scan");
                                                } else {
                                                    switch (i) {
                                                        case 29:
                                                            break;
                                                        case 30:
                                                            IExternalService LIZ = AVExternalServiceImpl.LIZ();
                                                            if (!LIZ.publishService().checkIsAlreadyPublished(c62114OZi.LIZ)) {
                                                                C5S1 c5s1 = new C5S1(c62114OZi.LIZ);
                                                                c5s1.LIZJ(R.string.py_);
                                                                c5s1.LJ();
                                                                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIIZ();
                                                                break;
                                                            } else if (!LIZ.configService().avsettingsConfig().needLoginBeforeRecord()) {
                                                                c62114OZi.LIZLLL(str);
                                                                break;
                                                            } else {
                                                                c62114OZi.LJFF = true;
                                                                J9P.LIZIZ(c62114OZi.LIZ, "scan", "click_my_qr", null, new C62118OZm(c62114OZi, str));
                                                                break;
                                                            }
                                                        case 31:
                                                            break;
                                                        case 32:
                                                            SmartRoute buildRoute = SmartRouter.buildRoute(activityC86117Xqz, "//ads/preview");
                                                            buildRoute.withParam("url", url);
                                                            buildRoute.open();
                                                            break;
                                                        case 33:
                                                            ActivityC86117Xqz activity = c62114OZi.LIZ;
                                                            InterfaceC62130OZy scanView = c62114OZi.LIZIZ;
                                                            AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(2, c62114OZi, 7);
                                                            o.LJIIIZ(activity, "activity");
                                                            o.LJIIIZ(url, "url");
                                                            o.LJIIIZ(scanView, "scanView");
                                                            AVExternalServiceImpl.LIZ().ttepAbilityService().downloadEffectAndJumpShootPage(activity, new AqS154S0100000_4(activity, 3), url, new AqS176S0100000_10(scanView, 1), aObjectS42S0101000_5);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                                }
                                            } else {
                                                CommerceChallengeServiceImpl.LIZIZ().LJIL(str);
                                            }
                                        } else {
                                            c62114OZi.LJIIJ.LIZLLL(activityC86117Xqz, C65661Ppp.LIZIZ(str));
                                            if (!TextUtils.isEmpty(str)) {
                                                C188727au c188727au = new C188727au();
                                                c188727au.LJIIIZ("enter_from", "scan");
                                                c188727au.LJIIIZ("prop_id", str);
                                                FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
                                            }
                                        }
                                    }
                                } else {
                                    IExternalService LIZ2 = AVExternalServiceImpl.LIZ();
                                    if (!LIZ2.publishService().checkIsAlreadyPublished(c62114OZi.LIZ)) {
                                        C26045AKb c26045AKb = new C26045AKb(c62114OZi.LIZ);
                                        c26045AKb.LJIIIIZZ(R.string.py_);
                                        c26045AKb.LJIIJ();
                                        ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIIZ();
                                    } else {
                                        String LJIILIIL = C30591Hz.LJIILIIL(url, "grade_key");
                                        if (!LIZ2.configService().avsettingsConfig().needLoginBeforeRecord()) {
                                            c62114OZi.LIZJ(str, LJIILIIL);
                                        } else {
                                            c62114OZi.LJFF = true;
                                            J9P.LIZIZ(c62114OZi.LIZ, "scan", "click_my_qr", null, new C62117OZl(c62114OZi, str, LJIILIIL));
                                        }
                                    }
                                }
                            } else {
                                c62114OZi.LJIIJ.LJ(activityC86117Xqz, str);
                            }
                        }
                        String str3 = null;
                        if (!((RBX) HG3.LJIILL()).isLogin()) {
                            C5S1 c5s12 = new C5S1(c62114OZi.LIZ);
                            c5s12.LIZJ(R.string.tj5);
                            c5s12.LJ();
                        } else {
                            ActivityC86117Xqz activityC86117Xqz2 = c62114OZi.LIZ;
                            if (activityC86117Xqz2 != null && !activityC86117Xqz2.isDestroyed() && !TextUtils.isEmpty(str)) {
                                User user = new User();
                                if (!TextUtils.isEmpty(url)) {
                                    String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(url), "u_code");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        try {
                                            str3 = String.valueOf(CastLongProtector.parseLong(queryParameter2, 23));
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                                if (map != null && (map.get("anchor_sec_uid") instanceof String)) {
                                    user.setSecUid((String) map.get("anchor_sec_uid"));
                                }
                                if (i == 31) {
                                    user.setUid(str);
                                } else {
                                    try {
                                        user.roomId = CastLongProtector.parseLong(str);
                                    } catch (Exception unused3) {
                                    }
                                }
                                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                                enterRoomConfig.mRoomsData.enterFromMerge = "scan";
                                enterRoomConfig.mLogData.share_from = str3;
                                LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(c62114OZi.LIZ, user, enterRoomConfig);
                            }
                        }
                    }
                    C62114OZi.LIZIZ("enter_personal_detail", "user_id", str, c62114OZi.LIZJ);
                    if (activityC86117Xqz != null) {
                        C188727au c188727au2 = new C188727au();
                        c188727au2.LJIIIZ("scan_duration", String.valueOf(System.currentTimeMillis() - c62114OZi.LJIIJJI.longValue()));
                        c188727au2.LJIIIZ("scanned_uid", str);
                        FMX.LJIIL("qr_code_scan_success", c188727au2.LIZ);
                        SmartRoute buildRoute2 = SmartRouter.buildRoute(activityC86117Xqz, "aweme://user/profile/");
                        buildRoute2.withParam("uid", str);
                        buildRoute2.withParam("sec_user_id", str2);
                        buildRoute2.withParam("enter_from", "scan");
                        if (i2 == 4) {
                            buildRoute2.withParam("enter_from", "others_homepage");
                            buildRoute2.withParam("source_page", "now_find_friends_scan");
                        }
                        buildRoute2.open();
                    }
                } else {
                    C62114OZi.LIZIZ("enter_music_detail", "music_id", str, c62114OZi.LIZJ);
                    c62114OZi.LJIIJ.LJ(activityC86117Xqz, str);
                }
                return true;
            }
            C62114OZi.LIZIZ("enter_tag_detail", "tag_id", str, c62114OZi.LIZJ);
            c62114OZi.LJIIJ.LJIIIIZZ(activityC86117Xqz, str);
            return true;
        }
        c62114OZi.LJIIJ.LJI(activityC86117Xqz, str);
        C62114OZi.LIZIZ("video_play", "group_id", str, c62114OZi.LIZJ);
        return true;
    }
}
