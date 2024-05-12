package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.commercialize.service.SplashAdOutService;
import com.ss.android.ugc.aweme.dsp.data.TTMStoreLinkLynx;
import com.ss.android.ugc.aweme.dsp.experiment.TTMUGAFConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes13.dex */
public final class SV7 {
    public static final SV7 LIZ = new SV7();
    public static volatile String LIZIZ = "";
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(N5X.LJLIL);

    public static boolean LJIIJ() {
        if (((Number) C52585KkP.LIZ.getValue()).intValue() != 1 && ((Number) C52587KkR.LIZ.getValue()).intValue() != 1 && ((TTMUGAFConfig) SVD.LIZIZ.getValue()).getMusicDspAfClick() == 0) {
            return false;
        }
        return true;
    }

    public static String LIZLLL() {
        boolean z;
        boolean z2;
        String str;
        ISplashAdOutService splashAdOutService;
        String str2;
        boolean z3 = true;
        if (a.LJIJI().LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SV9.LIZ.getClass();
            if (SV9.LJI.getEnableGaid()) {
                String str3 = LIZIZ;
                if (str3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    synchronized (C65352Pkq.LIZ(SV7.class)) {
                        if (LIZIZ.length() != 0) {
                            z3 = false;
                        }
                        if (z3) {
                            Object LIZ2 = C58096Mr6.LIZ(ISplashAdOutService.class, false);
                            if (LIZ2 != null) {
                                splashAdOutService = (ISplashAdOutService) LIZ2;
                            } else {
                                splashAdOutService = new SplashAdOutService();
                            }
                            NW4 LIZ3 = splashAdOutService.LIZ();
                            if (LIZ3 != null) {
                                str2 = LIZ3.LJJIJ();
                            } else {
                                str2 = "";
                            }
                            LIZIZ = str2;
                        }
                        str = LIZIZ;
                    }
                    return str;
                }
                return str3;
            }
        }
        return "";
    }

    public static String LIZJ(SVA targetApp) {
        String str;
        o.LJIIIZ(targetApp, "targetApp");
        SV9.LIZ.getClass();
        if (!SV9.LJII.getEnableReferrer()) {
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        if (targetApp == SVA.RESSO) {
            str = "resso_";
        } else {
            str = "ttm_";
        }
        LIZ2.append(str);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        LIZ3.append('-');
        LIZ3.append(System.currentTimeMillis());
        byte[] bytes = X1D.LIZIZ(LIZ3).getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        LIZ2.append(UUID.nameUUIDFromBytes(bytes));
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LJFF(boolean z) {
        if (z) {
            if (((TTMUGAFConfig) SVD.LIZIZ.getValue()).getMusicDspAfClick() == 0) {
                return false;
            }
            SV9.LIZ.getClass();
            if (!SV9.LJ.getEnableClick()) {
                return false;
            }
        } else {
            if (((TTMUGAFConfig) SVD.LIZIZ.getValue()).getMusicDspAfShow() == 0) {
                return false;
            }
            SV9.LIZ.getClass();
            if (!SV9.LJFF.getEnableShow()) {
                return false;
            }
        }
        if (LIZLLL().length() <= 0 && !z) {
            return false;
        }
        return true;
    }

    public static boolean LJI(boolean z) {
        if (((Number) C52585KkP.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        if (z) {
            SV9.LIZ.getClass();
            if (!SV9.LJ.getEnableClick()) {
                return false;
            }
        } else {
            SV9.LIZ.getClass();
            if (!SV9.LJFF.getEnableShow()) {
                return false;
            }
        }
        if (LIZLLL().length() <= 0 && !z) {
            return false;
        }
        return true;
    }

    public static boolean LJII(boolean z) {
        if (((Number) C52587KkR.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        if (z) {
            SV9.LIZ.getClass();
            if (!SV9.LJ.getEnableClick()) {
                return false;
            }
        } else {
            SV9.LIZ.getClass();
            if (!SV9.LJFF.getEnableShow()) {
                return false;
            }
        }
        if (LIZLLL().length() <= 0 && !z) {
            return false;
        }
        return true;
    }

    public static OSZ LJIIIIZZ(TTMStoreLink tTMStoreLink) {
        if (tTMStoreLink == null) {
            return null;
        }
        return new OSZ(tTMStoreLink.getLink(), GsonProtectorUtils.fromJson(SVF.LIZ, tTMStoreLink.getData(), new SUB().getType()));
    }

    public static String LIZ(String storeLink, String referrer) {
        o.LJIIIZ(storeLink, "storeLink");
        o.LJIIIZ(referrer, "referrer");
        if (referrer.length() > 0) {
            String uri = UriProtector.parse(storeLink).buildUpon().appendQueryParameter("referrer", referrer).build().toString();
            o.LJIIIIZZ(uri, "{\n            Uri.parse(…    .toString()\n        }");
            return uri;
        }
        return storeLink;
    }

    public static String LIZIZ(TTMStoreLink tTMStoreLink, OH3 lynxScene, SVA targetApp) {
        HashMap hashMap;
        boolean z;
        String str;
        o.LJIIIZ(lynxScene, "lynxScene");
        o.LJIIIZ(targetApp, "targetApp");
        OSZ LJIIIIZZ = LJIIIIZZ(tTMStoreLink);
        String str2 = null;
        if (LJIIIIZZ != null) {
            hashMap = (HashMap) LJIIIIZZ.getSecond();
        } else {
            hashMap = null;
        }
        String str3 = "";
        if (hashMap != null) {
            String str4 = (String) hashMap.get("pid");
            if (str4 == null) {
                str4 = "";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str4);
            LIZ2.append("_click");
            hashMap.put("pid", X1D.LIZIZ(LIZ2));
            hashMap.put("advertising_id", LIZLLL());
            if (tTMStoreLink != null && tTMStoreLink.getLink() != null) {
                hashMap.put("af_android_url", tTMStoreLink.getLink());
            }
            C62822Ol8 c62822Ol8 = LIZJ;
            if (((String) c62822Ol8.getValue()).length() > 0) {
                hashMap.put("af_ua", c62822Ol8.getValue());
            }
        }
        if (LJIIIIZZ != null) {
            str2 = (String) LJIIIIZZ.getFirst();
        }
        if (LJIIJ() && str2 != null && hashMap != null) {
            String LIZJ2 = LIZJ(targetApp);
            str2 = LIZ(str2, LIZJ2);
            hashMap.put("af_ref", LIZJ2);
            hashMap.put("af_android_url", str2);
        }
        OH3 oh3 = OH3.PLAYLIST;
        if (lynxScene == oh3 && hashMap != null) {
            hashMap.remove("af_dp");
            hashMap.remove("pid");
            hashMap.remove("c");
        }
        if (str2 != null) {
            str3 = str2;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        TTMStoreLinkLynx tTMStoreLinkLynx = new TTMStoreLinkLynx(str3, hashMap);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("&gaid=");
        LIZ3.append(LIZLLL());
        LIZ3.append("&store=");
        String json = GsonProtectorUtils.toJson((Gson) C25742A8k.LIZ.getValue(), tTMStoreLinkLynx);
        o.LJIIIIZZ(json, "gson.toJson(obj)");
        LIZ3.append(json);
        LIZ3.append("&is_ug_to_af=");
        if (LJFF(true) || ((lynxScene == oh3 && LJII(true)) || (lynxScene == OH3.NEW_RELEASE && LJI(true)))) {
            z = true;
        } else {
            z = false;
        }
        LIZ3.append(z);
        LIZ3.append("&identifier_id_enabled=");
        if (LIZLLL().length() > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.append(str);
        LIZ3.append("&time_diff_ms=");
        LIZ3.append(NetworkService.LJI().LIZ() - System.currentTimeMillis());
        return X1D.LIZIZ(LIZ3);
    }

    public static boolean LJ(SVA targetApp, Context context, boolean z) {
        o.LJIIIZ(targetApp, "targetApp");
        if (targetApp == SVA.TIKTOK_MUSIC && LJFF(z) && !C25685A6f.LIZ(context)) {
            return true;
        }
        if (targetApp == SVA.RESSO && (LJI(z) || LJII(z))) {
            try {
                C16880lQ.LLLLLLZ(context.getPackageManager(), "com.moonvideo.android.resso", 0);
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIIZ(String str, HashMap hashMap, String str2, boolean z, SVA targetApp) {
        String str3;
        o.LJIIIZ(targetApp, "targetApp");
        if (hashMap == null) {
            return;
        }
        String str4 = (String) hashMap.get("pid");
        if (str4 == null) {
            str4 = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str4);
        if (z) {
            str3 = "_click";
        } else {
            str3 = "_show";
        }
        LIZ2.append(str3);
        hashMap.put("pid", X1D.LIZIZ(LIZ2));
        if (targetApp == SVA.RESSO && hashMap.get("c") != null) {
            Object obj = hashMap.get("pid");
            if (obj == null) {
                obj = "";
            }
            hashMap.put("c", obj);
        }
        hashMap.put("advertising_id", LIZLLL());
        hashMap.put("event_time", String.valueOf(NetworkService.LJI().LIZJ()));
        if (z) {
            if (str == null) {
                str = "";
            }
            hashMap.put("af_android_url", str);
        }
        if (str2 != null && str2.length() > 0 && z) {
            hashMap.put("af_ref", str2);
        }
        C62822Ol8 c62822Ol8 = LIZJ;
        if (((String) c62822Ol8.getValue()).length() > 0) {
            hashMap.put("af_ua", c62822Ol8.getValue());
        }
    }
}
