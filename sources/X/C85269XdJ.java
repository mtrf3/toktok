package X;

import Y.AfS53S0100000_1;
import Y.AfS67S0100000_15;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.google.gson.internal.h;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XdJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85269XdJ {
    public static final /* synthetic */ C85269XdJ LIZ = new C85269XdJ();

    public static String LIZJ(long j) {
        String LJIIIIZZ = h.LJIIIIZZ(String.valueOf(EF7.LJIIIZ) + PoiEnableExperiment.LIZ().poiKey + j);
        o.LJIIIIZZ(LJIIIIZZ, "hexDigest(originStr.toString())");
        return LJIIIIZZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(5:21|22|(1:24)(1:29)|25|(2:27|28))|14|15|(1:17)(2:18|19)))|32|6|7|(0)(0)|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C85276XdQ
            if (r0 == 0) goto L1f
            r5 = r7
            X.XdQ r5 = (X.C85276XdQ) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L25
            goto L58
        L1f:
            X.XdQ r5 = new X.XdQ
            r5.<init>(r6, r7)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            java.lang.String r1 = com.ss.android.ugc.aweme.app.api.Api.LIZ     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "API_URL_PREFIX_SI"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L61
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = X.C46104I7o.LJJII()     // Catch: java.lang.Throwable -> L61
            X.38c r1 = r0.create(r1)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L55
            java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r0 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Throwable -> L61
        L47:
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L61
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi r0 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi) r0     // Catch: java.lang.Throwable -> L61
            r5.LJLJI = r2     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r0.isPopupEnable(r5)     // Catch: java.lang.Throwable -> L61
            if (r1 != r4) goto L5b
            goto L57
        L55:
            r0 = r3
            goto L47
        L57:
            return r4
        L58:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L61
        L5b:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PopupEnableResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse) r1     // Catch: java.lang.Throwable -> L61
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L61
            goto L69
        L61:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L69:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L70
        L6f:
            return r3
        L70:
            r3 = r1
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85269XdJ.LJ(X.2kd):java.lang.Object");
    }

    public static PoiSearchRequestBody LIZIZ(long j, C85268XdI c85268XdI) {
        String str;
        String str2;
        Long l;
        JSONObject jSONObject = new JSONObject();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c85268XdI.LIZ);
        LIZ2.append(',');
        LIZ2.append(c85268XdI.LIZIZ);
        jSONObject.put("location", X1D.LIZIZ(LIZ2));
        String str3 = c85268XdI.LJ;
        if (str3 != null) {
            jSONObject.put("keywords", str3);
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "data.toString()");
        if (TextUtils.isEmpty(jSONObject2)) {
            str = null;
        } else {
            try {
                byte[] bytes = jSONObject2.getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] LIZ3 = EncryptorUtil.LIZ(bytes.length, bytes);
                if (LIZ3 != null) {
                    str = Base64.encodeToString(LIZ3, 0);
                }
            } catch (Exception unused) {
            }
            str = null;
        }
        C51556KLg.LIZ.getClass();
        String str4 = C64707PaR.LIZJ;
        if (str4 == null) {
            str2 = "";
        } else {
            str2 = str4.toLowerCase();
            o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase()");
        }
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        String str5 = c85268XdI.LJFF;
        long j2 = c85268XdI.LIZLLL;
        long j3 = c85268XdI.LJIIL;
        if (j3 <= 0) {
            j3 = 20;
        }
        long j4 = c85268XdI.LJIILIIL;
        if (j4 <= 0) {
            j4 = 1;
        }
        int i = EF7.LJIIIZ;
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        String valueOf = String.valueOf(EF7.LJI());
        boolean z = c85268XdI.LJIILLIIL;
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "poi_sdk_ab_param", "", true);
        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…oiSdkAbParam::class.java)");
        long j5 = c85268XdI.LJIJI;
        if (j5 > 0) {
            l = Long.valueOf(j5);
        } else {
            l = null;
        }
        return new PoiSearchRequestBody(str2, appLanguage, str5, j2, j3, j4, 0, i, com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, valueOf, "1.2.0-rc.5", j, z ? 1 : 0, 0, 4, LJIILJJIL, str, l, c85268XdI.LJIJJ, c85268XdI.LJIJJLI);
    }

    public static void LIZ(C85268XdI c85268XdI, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        Object obj;
        AbstractC73672Svk<String> searchPoi;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long currentTimeMillis2 = System.currentTimeMillis();
        C72242sW c72242sW = new C72242sW();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        if (iLocationBaseServiceForMT.isSupportedPreciseGps()) {
            searchPoi = iLocationBaseServiceForMT.searchPoi("application/json", LIZJ(currentTimeMillis), String.valueOf(EF7.LJIIIZ), LIZIZ(currentTimeMillis, c85268XdI));
        } else {
            String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
            InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
            if (LJI != null) {
                obj = LJI.create(PoiSearchApi.class);
            } else {
                obj = null;
            }
            o.LJI(obj);
            searchPoi = ((PoiSearchApi) obj).searchPoi("application/json", LIZJ(currentTimeMillis), String.valueOf(EF7.LJIIIZ), LIZIZ(currentTimeMillis, c85268XdI));
        }
        if (searchPoi == null) {
            interfaceC88472Yns2.invoke(new Exception("search poi observable can't be null"));
        } else {
            searchPoi.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C85272XdM(c72242sW, currentTimeMillis2, interfaceC88472Yns), new AfS67S0100000_15(interfaceC88472Yns2, 44));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(7:21|22|(1:24)(1:33)|25|(1:32)|29|(1:31))|14|15|(1:17)(2:18|19)))|36|6|7|(0)(0)|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r8, com.ss.android.ugc.aweme.poi.PoiData r9, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiReTagResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C85275XdP
            if (r0 == 0) goto L1f
            r4 = r10
            X.XdP r4 = (X.C85275XdP) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L25
            goto L78
        L1f:
            X.XdP r4 = new X.XdP
            r4.<init>(r7, r10)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            java.lang.String r1 = com.ss.android.ugc.aweme.app.api.Api.LIZ     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "API_URL_PREFIX_SI"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L81
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = X.C46104I7o.LJJII()     // Catch: java.lang.Throwable -> L81
            X.38c r1 = r0.create(r1)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L69
            java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r0 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Throwable -> L81
        L47:
            kotlin.jvm.internal.o.LJI(r2)     // Catch: java.lang.Throwable -> L81
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi r2 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi) r2     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r9.getPoiId()     // Catch: java.lang.Throwable -> L81
            X.XdJ r0 = X.C85269XdJ.LIZ     // Catch: java.lang.Throwable -> L81
            r0.getClass()     // Catch: java.lang.Throwable -> L81
            X.KLg r0 = X.C51556KLg.LIZ     // Catch: java.lang.Throwable -> L81
            r0.getClass()     // Catch: java.lang.Throwable -> L81
            com.ss.android.ugc.aweme.poi_api.service.IPoiService r0 = X.C51556KLg.LIZ()     // Catch: java.lang.Throwable -> L81
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r0 = r0.LJJJJJ(r9)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L6d
            java.lang.String r0 = X.C75792yF.LIZJ(r0)     // Catch: java.lang.Throwable -> L81
            goto L6b
        L69:
            r2 = r6
            goto L47
        L6b:
            if (r0 != 0) goto L6f
        L6d:
            java.lang.String r0 = ""
        L6f:
            r4.LJLJI = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r1 = r2.reTagPoiV1(r8, r1, r0, r4)     // Catch: java.lang.Throwable -> L81
            if (r1 != r5) goto L7b
            return r5
        L78:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L81
        L7b:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiReTagResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiReTagResponse) r1     // Catch: java.lang.Throwable -> L81
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L81
            goto L89
        L81:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L89:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L90
        L8f:
            return r6
        L90:
            r6 = r1
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85269XdJ.LIZLLL(java.lang.String, com.ss.android.ugc.aweme.poi.PoiData, X.2kd):java.lang.Object");
    }

    public static void LJI(C85268XdI c85268XdI, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, TokenCert bpeaCert, TokenCert decryptCert) {
        Object obj;
        o.LJIIIZ(bpeaCert, "bpeaCert");
        o.LJIIIZ(decryptCert, "decryptCert");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long currentTimeMillis2 = System.currentTimeMillis();
        C72242sW c72242sW = new C72242sW();
        if (C85267XdH.LIZ(c85268XdI)) {
            String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
            InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
            if (LJI != null) {
                obj = LJI.create(PoiSearchApi.class);
            } else {
                obj = null;
            }
            o.LJI(obj);
            ((PoiSearchApi) obj).searchRecall("application/json", LIZJ(currentTimeMillis), String.valueOf(EF7.LJIIIZ), LIZIZ(currentTimeMillis, c85268XdI)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C85271XdL(c72242sW, currentTimeMillis2, interfaceC88472Yns, c85268XdI, interfaceC88472Yns2, bpeaCert, decryptCert), new AfS53S0100000_1(interfaceC88472Yns2, 36));
            return;
        }
        LIZ(c85268XdI, interfaceC88472Yns, interfaceC88472Yns2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:20|21))(5:22|23|24|16|17))(7:25|26|27|28|(1:30)|31|(2:33|(5:35|(1:37)|24|16|17)(3:38|16|17))(7:39|(1:41)(1:46)|42|(2:44|45)|15|16|17)))(2:48|49))(2:60|(4:62|(1:64)(1:70)|65|(2:67|68)(1:69))(3:71|31|(0)(0)))|50|(3:52|53|(5:55|(2:57|58)|27|28|(0))(3:59|28|(0)))|31|(0)(0)))|7|(0)(0)|50|(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        r9 = null;
        r0 = r0;
        r2 = r2;
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b0 A[Catch: Exception -> 0x0289, TryCatch #1 {Exception -> 0x0289, blocks: (B:14:0x023d, B:15:0x0240, B:16:0x0242, B:23:0x01e4, B:24:0x01e7, B:28:0x015c, B:31:0x019e, B:33:0x01b0, B:35:0x01c9, B:39:0x01ec, B:41:0x01fd, B:42:0x0203, B:49:0x0101, B:50:0x0104, B:52:0x011c, B:62:0x00ab, B:64:0x00bc, B:65:0x00c2), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ec A[Catch: Exception -> 0x0289, TryCatch #1 {Exception -> 0x0289, blocks: (B:14:0x023d, B:15:0x0240, B:16:0x0242, B:23:0x01e4, B:24:0x01e7, B:28:0x015c, B:31:0x019e, B:33:0x01b0, B:35:0x01c9, B:39:0x01ec, B:41:0x01fd, B:42:0x0203, B:49:0x0101, B:50:0x0104, B:52:0x011c, B:62:0x00ab, B:64:0x00bc, B:65:0x00c2), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c A[Catch: Exception -> 0x0289, TRY_LEAVE, TryCatch #1 {Exception -> 0x0289, blocks: (B:14:0x023d, B:15:0x0240, B:16:0x0242, B:23:0x01e4, B:24:0x01e7, B:28:0x015c, B:31:0x019e, B:33:0x01b0, B:35:0x01c9, B:39:0x01ec, B:41:0x01fd, B:42:0x0203, B:49:0x0101, B:50:0x0104, B:52:0x011c, B:62:0x00ab, B:64:0x00bc, B:65:0x00c2), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.bytedance.bpea.basics.Cert] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v11, types: [long] */
    /* JADX WARN: Type inference failed for: r4v12, types: [long] */
    /* JADX WARN: Type inference failed for: r4v13, types: [long] */
    /* JADX WARN: Type inference failed for: r4v14, types: [long] */
    /* JADX WARN: Type inference failed for: r4v8, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r31, java.lang.String r32, X.C85268XdI r33, com.bytedance.bpea.cert.token.TokenCert r34, com.bytedance.bpea.cert.token.TokenCert r35, X.InterfaceC67352kd r36) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85269XdJ.LJFF(java.lang.String, java.lang.String, X.XdI, com.bytedance.bpea.cert.token.TokenCert, com.bytedance.bpea.cert.token.TokenCert, X.2kd):java.lang.Object");
    }
}
