package Y;

import X.AbstractC59475NVv;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10K;
import X.C16880lQ;
import X.C198517qh;
import X.C1DJ;
import X.C36922EeM;
import X.C39398FdC;
import X.C43287Gyp;
import X.C48153Iv7;
import X.C55509LqT;
import X.C58530My6;
import X.C58655N0h;
import X.C58704N2e;
import X.C58764N4m;
import X.C58766N4o;
import X.C58773N4v;
import X.C58774N4w;
import X.C59222NMc;
import X.C59273NOb;
import X.C59835Ne3;
import X.C61191Nzv;
import X.C61230O1i;
import X.C61359O6h;
import X.C61367O6p;
import X.C61501OBt;
import X.C61604OFs;
import X.C61608OFw;
import X.C62114OZi;
import X.C62912Oma;
import X.C64797Pbt;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78886Uxe;
import X.C78983UzD;
import X.C82711Wd9;
import X.DialogC25756A8y;
import X.EF7;
import X.FFL;
import X.FUA;
import X.InterfaceC58548MyO;
import X.NNK;
import X.NNL;
import X.NOL;
import X.NU6;
import X.NW6;
import X.O2N;
import X.O76;
import X.O77;
import X.O7O;
import X.O7P;
import X.O80;
import X.O88;
import X.O8E;
import X.OB6;
import X.ORZ;
import X.OSI;
import X.OX9;
import X.QXX;
import X.V1B;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import com.ss.android.ugc.aweme.brdatagift.api.ICarrierRequestApi;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import defpackage.q;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ACallableS113S0100000_10 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) ((C62114OZi) aCallableS113S0100000_10.l0).LIZIZ;
        DialogC25756A8y dialogC25756A8y = scanQRCodeActivityV2.LJLJJI;
        if (dialogC25756A8y == null) {
            DialogC25756A8y dialogC25756A8y2 = new DialogC25756A8y(scanQRCodeActivityV2);
            scanQRCodeActivityV2.LJLJJI = dialogC25756A8y2;
            V1B.LJLJJL(dialogC25756A8y2);
            return null;
        }
        if (dialogC25756A8y.isShowing()) {
            return null;
        }
        DialogC25756A8y dialogC25756A8y3 = scanQRCodeActivityV2.LJLJJI;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y3, new Object[0], "void", new C65300Pk0(false, "()V", "-8708083310463960986")).LIZ) {
            return null;
        }
        dialogC25756A8y3.show();
        return null;
    }

    public static final Object call$1(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        AgeGateServiceImpl ageGateServiceImpl = (AgeGateServiceImpl) aCallableS113S0100000_10.l0;
        ageGateServiceImpl.getClass();
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/app/store_region/", Collections.emptyMap(), new C61501OBt(System.currentTimeMillis(), ageGateServiceImpl));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$10(Y.ACallableS113S0100000_10 r20) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS113S0100000_10.call$10(Y.ACallableS113S0100000_10):java.lang.Object");
    }

    public static final Object call$11(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        IAppLogDepend LIZ;
        if (!TextUtils.equals(((C58655N0h) aCallableS113S0100000_10.l0).LIZIZ, "click")) {
            JSONObject LJ = ((C58655N0h) aCallableS113S0100000_10.l0).LJ();
            LJ.put("tag", ((C58655N0h) aCallableS113S0100000_10.l0).LIZ);
            LJ.put("value", ((C58655N0h) aCallableS113S0100000_10.l0).LIZJ);
            LJ.put("group_id", ((C58655N0h) aCallableS113S0100000_10.l0).LIZLLL);
            LJ.put("category", "event_v3");
            C55509LqT c55509LqT = C55509LqT.LIZ;
            C58655N0h c58655N0h = (C58655N0h) aCallableS113S0100000_10.l0;
            c55509LqT.LIZ(c58655N0h.LIZ, c58655N0h.LIZIZ, c58655N0h.LIZJ, LJ);
            InterfaceC58548MyO interfaceC58548MyO = (InterfaceC58548MyO) C58530My6.LJFF.getValue();
            C58655N0h c58655N0h2 = (C58655N0h) aCallableS113S0100000_10.l0;
            interfaceC58548MyO.invoke(new OSI(c58655N0h2.LJII, LJ, c58655N0h2.LIZIZ, c58655N0h2.LIZJ));
            C58655N0h c58655N0h3 = (C58655N0h) aCallableS113S0100000_10.l0;
            C58704N2e.LIZ(c58655N0h3.LIZ, c58655N0h3.LIZIZ, c58655N0h3.LIZJ, LJ);
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "enable_send_staging_adlog", "v3", true);
            if (LJIILJJIL != null) {
                int hashCode = LJIILJJIL.hashCode();
                if (hashCode != 3707) {
                    if (hashCode != 3709) {
                        if (hashCode == 96673 && LJIILJJIL.equals("all")) {
                            LJ.put("_ad_staging_flag", "3");
                            IAppLogDepend LIZ2 = C59835Ne3.LIZ();
                            if (LIZ2 != null) {
                                LIZ2.onEventV3Json(((C58655N0h) aCallableS113S0100000_10.l0).LIZIZ, LJ);
                            }
                        }
                    } else if (LJIILJJIL.equals("v3") && (LIZ = C59835Ne3.LIZ()) != null) {
                        LIZ.onEventV3Json(((C58655N0h) aCallableS113S0100000_10.l0).LIZIZ, LJ);
                    }
                } else {
                    LJIILJJIL.equals("v1");
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        return AVExternalServiceImpl.LIZ().infoService().getMediaLoaderImages((ImageChooseUploadActivity) aCallableS113S0100000_10.l0);
    }

    public static final Object call$13(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        OX9 ox9 = ImageChooseUploadActivity.LJLLLL;
        if (ox9 != null) {
            ImageChooseUploadActivity imageChooseUploadActivity = (ImageChooseUploadActivity) aCallableS113S0100000_10.l0;
            ox9.multiUploadImages(imageChooseUploadActivity.LJLJL, new AqS160S0100000_10(imageChooseUploadActivity, 440));
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$14(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        ((NOL) aCallableS113S0100000_10.l0).LIZ = ORZ.LLJILJILJ(IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIILLIIL());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$15(Y.ACallableS113S0100000_10 r10) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS113S0100000_10.call$15(Y.ACallableS113S0100000_10):java.lang.Object");
    }

    public static final Object call$16(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        QXX qxx;
        if (C61359O6h.LIZJ != null) {
            boolean z = ((O7P) aCallableS113S0100000_10.l0).LJLIL;
            O7O LIZIZ = C61359O6h.LIZIZ();
            LIZIZ.LJIJI = false;
            if (C61359O6h.LJIIL == null && (qxx = C61359O6h.LJIILIIL) != null) {
                C61359O6h.LJIIL = qxx.LLIL();
            }
            HashMap<String, String> hashMap = C61359O6h.LJIIL;
            StringBuilder sb = new StringBuilder(5120);
            try {
                sb.append("/api/ad/v1/splash/stock/");
                sb.append("?_unused=0");
                sb.append((CharSequence) O77.LJIIIIZZ());
                sb.append(LIZIZ.toString());
                if (hashMap != null) {
                    sb.append(O77.LJIIIZ(hashMap));
                }
                if (z) {
                    sb.append("&show_limit=1");
                } else {
                    sb.append("&show_limit=0");
                }
                int LJII = O76.LJI().LJII();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" sending stop request, current refresh time is ");
                LIZ.append(LJII);
                C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
                sb.append("&refresh_num=");
                sb.append(LJII);
                if (C61359O6h.LJJIJIIJI != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C61359O6h.LJJIJIIJI);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            String sb2 = sb.toString();
            if (!C78886Uxe.LJJIIZI(sb2)) {
                C61359O6h.LIZJ.getClass();
                if (!NW6.LIZ().isChildrenMode()) {
                    try {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("SplashAdResponse_sendStockUrl");
                        LIZ2.append(sb2);
                        C36922EeM.LJ(X1D.LIZIZ(LIZ2));
                        try {
                            JSONObject jSONObject = new JSONObject(C61367O6p.LIZ().executeGet(0, sb2).execute().LIZIZ);
                            O88 o88 = new O88();
                            o88.LIZIZ = true;
                            o88.LIZ = jSONObject;
                            return new O80(o88);
                        } catch (JSONException e2) {
                            C78983UzD.LJIIZILJ(e2);
                        }
                    } catch (Exception e3) {
                        C78983UzD.LJIIZILJ(e3);
                        C36922EeM.LJFF(new O8E(e3));
                    }
                }
            }
        }
        return null;
    }

    public static final Object call$17(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        ((C61191Nzv) aCallableS113S0100000_10.l0).LIZ.LJ();
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        C62912Oma.LIZIZ((ActivityC45651qj) aCallableS113S0100000_10.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$19(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        return (AbstractC59475NVv) aCallableS113S0100000_10.l0;
    }

    public static final Object call$2(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        return AVExternalServiceImpl.LIZ().infoService().getMediaLoaderImages((ImageChooseActivity) aCallableS113S0100000_10.l0);
    }

    public static final Object call$20(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        C61604OFs LIZ;
        try {
            ICarrierRequestApi.LIZ.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("https://");
            LIZ2.append(EF7.LJI.LIZ);
            ICarrierRequestApi iCarrierRequestApi = (ICarrierRequestApi) LIZLLL.create(X1D.LIZIZ(LIZ2)).create(ICarrierRequestApi.class);
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIIIIZZ = 5000L;
            C64797Pbt<String> execute = iCarrierRequestApi.checkTiktokConnection("tik-tok", c48153Iv7, "custom").execute();
            int i = execute.LIZ.LIZIZ;
            C10K.LIZIZ(new ACallableS23S0001000_1(i, 0), C10K.LJI, null);
            if (execute.LIZIZ()) {
                if (i == 200) {
                    String str = execute.LIZIZ;
                    str.toString();
                    BaseBemobiResponse baseBemobiResponse = new BaseBemobiResponse(str, null, null, null, null, 30, null);
                    String str2 = execute.LIZ.LIZ;
                    o.LJIIIIZZ(str2, "response.raw().url");
                    LIZ = new C61604OFs(i, baseBemobiResponse, null, str2);
                } else {
                    ((C61608OFw) aCallableS113S0100000_10.l0).getClass();
                    LIZ = C61608OFw.LIZ();
                }
            } else {
                ((C61608OFw) aCallableS113S0100000_10.l0).getClass();
                LIZ = C61608OFw.LIZ();
            }
            return LIZ;
        } catch (Exception unused) {
            C10K.LIZIZ(new ACallableS23S0001000_1(-999, 0), C10K.LJI, null);
            ((C61608OFw) aCallableS113S0100000_10.l0).getClass();
            return C61608OFw.LIZ();
        }
    }

    public static final Object call$21(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        O2N o2n = (O2N) aCallableS113S0100000_10.l0;
        o2n.LIZIZ.LJI(o2n.LJFF, o2n.LJIIIIZZ, o2n.LIZLLL, o2n.LJ, false, o2n.LJIIIZ, o2n.LJIIJ);
        return C76800UCe.LIZ;
    }

    public static final Object call$22(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        O2N o2n = (O2N) aCallableS113S0100000_10.l0;
        o2n.LIZIZ.LJI(o2n.LJFF, o2n.LJIIIIZZ, o2n.LIZLLL, o2n.LJ, false, o2n.LJIIIZ, o2n.LJIIJ);
        return C76800UCe.LIZ;
    }

    public static final Object call$23(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        try {
            C43287Gyp.LIZIZ.LIZ = ((NNK) aCallableS113S0100000_10.l0).LIZLLL().LIZ.LIZ;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LJFF(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$24(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        String str;
        Uri uri = (Uri) aCallableS113S0100000_10.l0;
        C58773N4v c58773N4v = C58774N4w.LIZIZ;
        String str2 = null;
        C58774N4w.LIZIZ = null;
        if (c58773N4v != null) {
            String str3 = c58773N4v.LIZ;
            if (str3 != null && str3.length() > 0) {
                str = c58773N4v.LIZ;
            } else {
                String queryParameter = UriProtector.getQueryParameter(uri, "tag");
                if (queryParameter != null && queryParameter.length() > 0) {
                    str = UriProtector.getQueryParameter(uri, "tag");
                } else {
                    str = "draw_ad";
                }
            }
            C58764N4m LIZ = C58766N4o.LIZ();
            LIZ.LIZ = str;
            LIZ.LIZIZ = "open_url_appback";
            LIZ.LIZJ(Long.valueOf(c58773N4v.LIZIZ));
            LIZ.LJFF(c58773N4v.LIZJ);
            Long valueOf = Long.valueOf(c58773N4v.LIZLLL);
            if (valueOf != null) {
                str2 = valueOf.toString();
            }
            LIZ.LIZLLL = str2;
            LIZ.LJIIIIZZ();
            if (str != null) {
                C58704N2e.LJ(str, "open_url_appback", String.valueOf(c58773N4v.LIZIZ), c58773N4v.LIZJ, String.valueOf(c58773N4v.LIZLLL)).LJII();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$25(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (TextUtils.equals("discovery", ((C82711Wd9) aCallableS113S0100000_10.l0).LJLJI) || TextUtils.equals("category_details_page", ((C82711Wd9) aCallableS113S0100000_10.l0).LJLJI)) {
            C39398FdC c39398FdC = C39398FdC.LIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("enter_from", ((C82711Wd9) aCallableS113S0100000_10.l0).LJLJI);
            Aweme aweme = ((C82711Wd9) aCallableS113S0100000_10.l0).LJLZ;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c198517qh.LIZ.put("group_id", str);
            Aweme aweme2 = ((C82711Wd9) aCallableS113S0100000_10.l0).LJLZ;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            c198517qh.LIZ.put("author_id", str2);
            Aweme aweme3 = ((C82711Wd9) aCallableS113S0100000_10.l0).LJLZ;
            if (aweme3 != null) {
                str5 = aweme3.getLogPbString();
            }
            c198517qh.LIZ.put("log_pb", str5);
            c198517qh.LIZ.put("rank", Integer.valueOf(((C82711Wd9) aCallableS113S0100000_10.l0).LJZ + 1));
            C39398FdC.LIZIZ("video_play", q.LIZJ(c198517qh.LIZ, OB6.LIZ, OB6.LIZIZ, c198517qh, c39398FdC));
        } else {
            C39398FdC c39398FdC2 = C39398FdC.LIZ;
            C198517qh c198517qh2 = new C198517qh();
            c198517qh2.LIZ.put("enter_from", ((C82711Wd9) aCallableS113S0100000_10.l0).LJLJI);
            Aweme aweme4 = ((C82711Wd9) aCallableS113S0100000_10.l0).LJLZ;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            } else {
                str3 = null;
            }
            c198517qh2.LIZ.put("group_id", str3);
            Aweme aweme5 = ((C82711Wd9) aCallableS113S0100000_10.l0).LJLZ;
            if (aweme5 != null) {
                str4 = aweme5.getAuthorUid();
            } else {
                str4 = null;
            }
            c198517qh2.LIZ.put("author_id", str4);
            Aweme aweme6 = ((C82711Wd9) aCallableS113S0100000_10.l0).LJLZ;
            if (aweme6 != null) {
                str5 = aweme6.getLogPbString();
            }
            C39398FdC.LIZIZ("video_play", q.LIZJ(c198517qh2.LIZ, "log_pb", str5, c198517qh2, c39398FdC2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$26(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        try {
            ((PassBackWebInfoBusiness) aCallableS113S0100000_10.l0).LJIIIIZZ();
        } catch (Exception unused) {
            C78983UzD.LJIILL("PassBackWebInfoBusiness asyncUploadWebInfo");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$27(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        long j;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            C59273NOb c59273NOb = ((PassBackWebInfoBusiness) aCallableS113S0100000_10.l0).LJIILLIIL;
            if (c59273NOb != null) {
                try {
                    str = c59273NOb.LJIILIIL;
                } catch (Exception unused) {
                }
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                    jSONObject.put("cid", j);
                }
                j = 0;
                jSONObject.put("cid", j);
            }
            JSONArray jSONArray = new JSONArray();
            Set<String> keySet = ((PassBackWebInfoBusiness) aCallableS113S0100000_10.l0).LIZIZ().keySet();
            if (keySet != null) {
                PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) aCallableS113S0100000_10.l0;
                for (String str2 : keySet) {
                    passBackWebInfoBusiness.getClass();
                    String decode = URLDecoder.decode(str2, "UTF-8");
                    o.LJIIIIZZ(decode, "decode(str, \"UTF-8\")");
                    jSONArray.put(decode);
                }
            }
            jSONObject.put("url_array", jSONArray);
        } catch (Exception unused2) {
        }
        FUA.LIZJ("aweme_ad_pass_back_web_info_url_empty", jSONObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS113S0100000_10.l0;
        if (scanQRCodeActivityV2.LJLJLLL != null) {
            synchronized (scanQRCodeActivityV2) {
                IQRCodeScanner iQRCodeScanner = ((ScanQRCodeActivityV2) aCallableS113S0100000_10.l0).LJLJLLL;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.stop();
                    ((ScanQRCodeActivityV2) aCallableS113S0100000_10.l0).LJLJLLL.release();
                    ((ScanQRCodeActivityV2) aCallableS113S0100000_10.l0).LJLJLLL.setScanListener(null);
                    ((ScanQRCodeActivityV2) aCallableS113S0100000_10.l0).LJLJLLL = null;
                }
            }
        }
        return null;
    }

    public static final Object call$4(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        try {
            ((NU6) aCallableS113S0100000_10.l0).LJI();
        } catch (Exception unused) {
            C78983UzD.LJIILL("spark PassBackWebInfoBusiness asyncUploadWebInfo");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        long j;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        JSONObject jSONObject = new JSONObject();
        try {
            C59222NMc c59222NMc = ((NU6) aCallableS113S0100000_10.l0).LJIILIIL;
            if (c59222NMc != null) {
                try {
                    awemeRawAd = c59222NMc.LIZ;
                } catch (Exception unused) {
                }
                if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                    j = creativeId.longValue();
                    jSONObject.put("cid", j);
                }
                j = 0;
                jSONObject.put("cid", j);
            }
            JSONArray jSONArray = new JSONArray();
            Set<String> keySet = ((NU6) aCallableS113S0100000_10.l0).LIZIZ().keySet();
            NU6 nu6 = (NU6) aCallableS113S0100000_10.l0;
            for (String str : keySet) {
                nu6.getClass();
                String decode = URLDecoder.decode(str, "UTF-8");
                o.LJIIIIZZ(decode, "decode(str, \"UTF-8\")");
                jSONArray.put(decode);
            }
            jSONObject.put("url_array", jSONArray);
        } catch (Exception unused2) {
        }
        FUA.LIZJ("aweme_ad_pass_back_web_info_url_empty", jSONObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS113S0100000_10.l0;
        synchronized (scanQRCodeActivityV2) {
            IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LJLJLLL;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.stop();
            }
        }
        return null;
    }

    public static final Object call$7(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        C61230O1i c61230O1i = (C61230O1i) aCallableS113S0100000_10.l0;
        c61230O1i.LIZ.LJI(c61230O1i.LIZIZ, c61230O1i.LJII, c61230O1i.LJ, c61230O1i.LJFF, false, c61230O1i.LJIIIIZZ, c61230O1i.LJIIIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        C61230O1i c61230O1i = (C61230O1i) aCallableS113S0100000_10.l0;
        c61230O1i.LIZ.LJI(c61230O1i.LIZIZ, c61230O1i.LJII, c61230O1i.LJ, c61230O1i.LJFF, false, c61230O1i.LJIIIIZZ, c61230O1i.LJIIIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS113S0100000_10 aCallableS113S0100000_10) {
        try {
            CommonAdData LIZ = ((NNL) aCallableS113S0100000_10.l0).LIZ.LIZ();
            if (LIZ instanceof AwemeRawAd) {
                C43287Gyp.LIZIZ.LIZ = (AwemeRawAd) LIZ;
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LJFF(e);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS113S0100000_10(ScanQRCodeActivityV2 scanQRCodeActivityV2, int i) {
        this.$t = i;
        switch (i) {
            case 3:
                this.l0 = scanQRCodeActivityV2;
                return;
            default:
                this.l0 = scanQRCodeActivityV2;
                return;
        }
    }

    public ACallableS113S0100000_10(long j, int i) {
        this.$t = i;
        this.l0 = C61608OFw.LIZLLL;
    }

    public ACallableS113S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
