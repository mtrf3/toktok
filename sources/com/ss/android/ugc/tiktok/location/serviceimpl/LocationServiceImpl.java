package com.ss.android.ugc.tiktok.location.serviceimpl;

import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C00F;
import X.C141335gf;
import X.C16880lQ;
import X.C1791471i;
import X.C29822Bn8;
import X.C2QE;
import X.C35908E7k;
import X.C36922EeM;
import X.C3C5;
import X.C53090KsY;
import X.C53091KsZ;
import X.C54933LhB;
import X.C54941LhJ;
import X.C54943LhL;
import X.C56184M3g;
import X.C58096Mr6;
import X.C61099NyR;
import X.C61100NyS;
import X.C64401PPh;
import X.C64403PPj;
import X.C64707PaR;
import X.C66613QCj;
import X.C66614QCk;
import X.C68322mC;
import X.C72242sW;
import X.C73305Spp;
import X.C73306Spq;
import X.C78580Usi;
import X.C78857UxB;
import X.C78866UxK;
import X.C85258Xd8;
import X.C85261XdB;
import X.C85264XdE;
import X.C85295Xdj;
import X.C85296Xdk;
import X.C85297Xdl;
import X.C85298Xdm;
import X.C85403XfT;
import X.EE1;
import X.EF7;
import X.FFL;
import X.HG3;
import X.InterfaceC54674Ld0;
import X.InterfaceC56182M3e;
import X.InterfaceC56322M8o;
import X.InterfaceC85311Xdz;
import X.J0X;
import X.J13;
import X.OHI;
import X.RBX;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.BDLocationSpi;
import com.bytedance.bdlocation.init.IBDLocationAgent;
import com.bytedance.bdlocation.init.LocationInitConfig;
import com.bytedance.bdlocation.log.Printer;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.task.InitLocationTask;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS47S1000000_9;
import ujb.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class LocationServiceImpl implements ILocationService {
    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIZILJ() {
    }

    public static ILocationService LJIJJ() {
        Object LIZ = C58096Mr6.LIZ(ILocationService.class, false);
        if (LIZ != null) {
            return (ILocationService) LIZ;
        }
        if (C58096Mr6.R8 == null) {
            synchronized (ILocationService.class) {
                if (C58096Mr6.R8 == null) {
                    C58096Mr6.R8 = new LocationServiceImpl();
                }
            }
        }
        return C58096Mr6.R8;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C85403XfT.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LIZJ() {
        C53091KsZ.LIZ.getClass();
        String str = EF7.LJI.LIZ;
        if (TextUtils.isEmpty(str)) {
            C36922EeM.LIZLLL(2, "LocationInitializer", "Api host is null");
        } else {
            if (o.LJJJLIIL(str, "https://", false)) {
                return;
            }
            "https://".concat(str);
        }
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LIZLLL() {
        if (C00F.LIZ(31744, 0, "poi_add_location_optimization_ip", false) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJ() {
        if (C00F.LIZ(31744, 0, "poi_add_location_optimization_precise", false) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJFF() {
        if (C00F.LIZ(31744, 0, "poi_add_location_optimization_coarse", false) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final EE1 LJIIIZ() {
        return new InitLocationTask();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LIZ() {
        return C85295Xdj.LIZJ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILL() {
        boolean z;
        Locale locale;
        IBDLocationAgent bDLocationAgent = BDLocationSpi.getBDLocationAgent();
        if (bDLocationAgent != null && bDLocationAgent.isInit()) {
            return;
        }
        C53091KsZ.LIZ.getClass();
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).bindAccuracyFetcher();
        HashMap hashMap = new HashMap();
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-poi_location_sdk_init");
        with.auth("dwcr");
        hashMap.put("init_cert", with);
        TokenCert with2 = companion.with("bpea-poi_sdk_cold_start");
        with2.auth("lubb");
        hashMap.put("coldstart_cert", with2);
        String str = EF7.LJI.LIZ;
        if (TextUtils.isEmpty(str)) {
            C36922EeM.LIZLLL(2, "LocationInitializer", "Api host is null");
            return;
        }
        if (!o.LJJJLIIL(str, "https://", false)) {
            str = "https://".concat(str);
        }
        LocationInitConfig.Builder builder = new LocationInitConfig.Builder(C1791471i.LIZ);
        if (C53090KsY.LIZ()) {
            C66613QCj c66613QCj = C66613QCj.LIZ;
            C64403PPj.LJ(c66613QCj);
            builder.setBackgroundProvider(c66613QCj);
        }
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).initPermissionAccuracyAndGPSProvider(builder);
        builder.setBaseUrl(str);
        builder.setRestrictedMode(new C78866UxK());
        builder.setCustomNetworkApi(TikTokLocationApi.LIZ);
        builder.setALogPrinter(new Printer() { // from class: X.2U9
            @Override // com.bytedance.bdlocation.log.Printer
            public final void d(String str2, String str3, Throwable th) {
                LIZ(3, str2, str3, th);
            }

            @Override // com.bytedance.bdlocation.log.Printer
            public final void e(String str2, String str3, Throwable th) {
                LIZ(6, str2, str3, th);
            }

            @Override // com.bytedance.bdlocation.log.Printer
            public final void i(String str2, String str3, Throwable th) {
                LIZ(4, str2, str3, th);
            }

            @Override // com.bytedance.bdlocation.log.Printer
            public final void v(String str2, String str3, Throwable th) {
                LIZ(2, str2, str3, th);
            }

            @Override // com.bytedance.bdlocation.log.Printer
            public final void w(String str2, String str3, Throwable th) {
                LIZ(5, str2, str3, th);
            }

            public static void LIZ(int i, String str2, String str3, Throwable th) {
                if (th != null) {
                    StringBuilder LJFF = C72972SkS.LJFF(str3, '\n');
                    LJFF.append(android.util.Log.getStackTraceString(th));
                    str3 = X1D.LIZIZ(LJFF);
                }
                C36922EeM.LIZLLL(i, str2, str3);
            }
        });
        if (a.LJIJI().LIZ()) {
            z = true;
        } else {
            z = false;
        }
        builder.isPrivacyConfirmed(z);
        builder.setAppId(String.valueOf(EF7.LJIIIZ));
        builder.setDid(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        builder.setChannel(EF7.LJIILIIL);
        builder.setAppVersion(String.valueOf(EF7.LJI()));
        builder.setUpdateVersionCode(String.valueOf(EF7.LJFF()));
        builder.setEventManager(C78857UxB.LJLIL);
        builder.setBpeaCerts(hashMap);
        builder.setOverseas(true);
        builder.setLatLngEncrypt(true);
        builder.setNetworkBodyEncrypt(false);
        builder.setEnableH3(true);
        builder.setH3Distance(1);
        builder.setH3Resolution(7);
        builder.setLatlngPrecision(2);
        builder.setPathPrefix("/tiktok");
        builder.setMonitorConfigUrl("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
        builder.setMonitorReportUrl("https://mon.isnssdk.com/monitor/collect/");
        if (Build.VERSION.SDK_INT >= 24) {
            locale = EF7.LIZIZ().getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = EF7.LIZIZ().getResources().getConfiguration().locale;
        }
        builder.setLocal(locale);
        String str2 = C64707PaR.LIZJ;
        kotlin.jvm.internal.o.LJIIIIZZ(str2, "getUserRegion()");
        Locale locale2 = Locale.getDefault();
        kotlin.jvm.internal.o.LJIIIIZZ(locale2, "getDefault()");
        String lowerCase = str2.toLowerCase(locale2);
        kotlin.jvm.internal.o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        builder.setUserRegion(lowerCase);
        builder.setDebug(TextUtils.equals(EF7.LJIILIIL, "local_test"));
        FFL.LJIIIZ().getClass();
        builder.setEnableCoarseOpt(FFL.LJ(31744, "enable_location_sdk_desensitization_optimize", false, false));
        LocationInitConfig build = builder.build();
        kotlin.jvm.internal.o.LJIIIIZZ(build, "builder.setBaseUrl(host)…e())\n            .build()");
        IBDLocationAgent bDLocationAgent2 = BDLocationSpi.getBDLocationAgent();
        if (bDLocationAgent2 != null) {
            bDLocationAgent2.init(build);
        }
        if (!C53090KsY.LIZ()) {
            return;
        }
        C66614QCk c66614QCk = new C66614QCk();
        if (C64401PPh.LIZIZ.get()) {
            c66614QCk.LIZ();
        } else {
            C64401PPh.LJI.add(c66614QCk);
        }
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final Map<String, String> getLocationCommonParamsIfHave() {
        return ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationCommonParamsIfHave();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIJJI(View view) {
        View findViewById;
        if (view == null || (findViewById = view.findViewById(R.id.cd9)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIJ(String... strArr) {
        PermissionCache permissionCache = PermissionCache.LJLIL;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        permissionCache.getClass();
        return PermissionCache.LIZIZ(strArr2);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final View LJIIJ(Context context, ViewGroup viewGroup) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(viewGroup, "viewGroup");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.brf, viewGroup, false);
        kotlin.jvm.internal.o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.View");
        return LLLLIILL;
    }

    @Override // X.InterfaceC56180M3c
    public final boolean LJIILIIL(String str, String str2) {
        C85296Xdk.LIZ.getClass();
        return C85296Xdk.LIZLLL(str, str2);
    }

    @Override // X.InterfaceC56180M3c
    public final boolean LJIILLIIL(int i, Context context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        PermissionCache.LJLIL.getClass();
        return PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJI(Fragment fragment, String str, boolean z) {
        ActivityC45651qj mo49getActivity;
        boolean LJ;
        Object LIZ;
        long longValue;
        long j;
        C54941LhJ c54941LhJ = C54941LhJ.LIZ;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C54933LhB.LJLJI = str;
        C54943LhL c54943LhL = C54943LhL.LIZ;
        c54943LhL.getClass();
        Boolean bool = C54943LhL.LIZ().enable;
        Boolean bool2 = Boolean.TRUE;
        if (!kotlin.jvm.internal.o.LJ(bool, bool2) || C54943LhL.LIZ().isPoiEvent || C54943LhL.LIZ().vvCount == 0 || fragment == 0 || !(fragment instanceof InterfaceC56322M8o) || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return;
        }
        InterfaceC56322M8o interfaceC56322M8o = (InterfaceC56322M8o) fragment;
        C85258Xd8 c85258Xd8 = new C85258Xd8("homepage_hot", "", null, false, 252);
        AqS47S1000000_9 aqS47S1000000_9 = new AqS47S1000000_9(str, 0);
        if (mo49getActivity.isFinishing() || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        aqS47S1000000_9.invoke();
        c54943LhL.getClass();
        if (!kotlin.jvm.internal.o.LJ(C54943LhL.LIZ().enable, bool2) || C54943LhL.LIZ().isPoiEvent || C54943LhL.LIZ().vvCount == 0) {
            return;
        }
        int size = C54941LhJ.LIZIZ.size();
        c54943LhL.getClass();
        if (size != C54943LhL.LIZ().vvCount) {
            return;
        }
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        kotlin.jvm.internal.o.LJIIIIZZ(uid, "uid");
        if (C2QE.LIZ()) {
            LJ = m0.LIZLLL("fyp_poi_permission_popup_showed_", uid, C35908E7k.LIZIZ(), false);
        } else {
            LJ = kotlin.jvm.internal.o.LJ(((LinkedHashMap) C35908E7k.LIZLLL("fyp_poi_permission_popup_showed")).get(uid), bool2);
        }
        if (C2QE.LIZ()) {
            longValue = C78580Usi.LIZIZ("fyp_poi_permission_popup_time_", uid, C35908E7k.LIZIZ(), -1L);
        } else {
            try {
                String str2 = (String) ((LinkedHashMap) C35908E7k.LIZLLL("fyp_poi_permission_popup_time")).get(uid);
                if (str2 != null) {
                    j = CastLongProtector.parseLong(str2);
                } else {
                    j = 0;
                }
                LIZ = Long.valueOf(j);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = 0L;
            }
            longValue = ((Number) LIZ).longValue();
        }
        C54943LhL c54943LhL2 = C54943LhL.LIZ;
        c54943LhL2.getClass();
        Boolean bool3 = C54943LhL.LIZ().enable;
        Boolean bool4 = Boolean.TRUE;
        if (kotlin.jvm.internal.o.LJ(bool3, bool4)) {
            c54943LhL2.getClass();
            if (C54943LhL.LIZ().isOnlyOnce) {
                if (LJ) {
                    return;
                }
                c54941LhJ.LIZ(uid, z, interfaceC56322M8o, mo49getActivity, c85258Xd8);
                return;
            }
        }
        c54943LhL2.getClass();
        if (!kotlin.jvm.internal.o.LJ(C54943LhL.LIZ().enable, bool4)) {
            return;
        }
        c54943LhL2.getClass();
        if (C54943LhL.LIZ().isOnlyOnce || C54943LhL.LIZ().timeGap <= 0) {
            return;
        }
        if (longValue > 0) {
            c54943LhL2.getClass();
            if ((C54943LhL.LIZ().timeGap * 1000) + longValue >= System.currentTimeMillis()) {
                return;
            }
            c54941LhJ.LIZ(uid, z, interfaceC56322M8o, mo49getActivity, c85258Xd8);
            return;
        }
        c54941LhJ.LIZ(uid, z, interfaceC56322M8o, mo49getActivity, c85258Xd8);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIL(Context context, View view, AqS158S0100000_8 aqS158S0100000_8) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        View findViewById = view.findViewById(R.id.cd9);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.kfr);
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LJFF = C29822Bn8.LIZ(context, R.string.gsu, "context.resources.getStr…g.gpsbanner_popup_desc_b)");
            c73306Spq.LJI = C29822Bn8.LIZ(context, R.string.gss, "context.resources.getStr…ing.gpsbanner_popup_desc)");
            c73306Spq.LJII = new AqS146S0200000_15(context, aqS158S0100000_8, 57);
            c73305Spp.setStatus(c73306Spq);
        }
        t1.LJFF("enter_from", "search_poi", "show_location_banner");
    }

    public static void LJIL(String str, String str2, Cert cert, Cert cert2, InterfaceC56182M3e interfaceC56182M3e) {
        BDLocation lastKnownLocation;
        try {
            IBDLocationAgent bDLocationAgent = BDLocationSpi.getBDLocationAgent();
            if (bDLocationAgent != null && (lastKnownLocation = bDLocationAgent.getLastKnownLocation(cert, cert2)) != null) {
                C56184M3g.LIZ(cert, cert2, lastKnownLocation, str, str2);
                if (interfaceC56182M3e != null) {
                    interfaceC56182M3e.LIZIZ(new BDLocationProxy(lastKnownLocation));
                }
            } else if (interfaceC56182M3e != null) {
                interfaceC56182M3e.LIZIZ(null);
            }
        } catch (Exception e) {
            if (interfaceC56182M3e != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                interfaceC56182M3e.onError(new J0X(message, "location sdk", ""));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("e = ");
            LIZ.append(e.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIIIIZZ(String business, String scene, Cert bpeaCert, Cert decryptCert, InterfaceC56182M3e interfaceC56182M3e) {
        kotlin.jvm.internal.o.LJIIIZ(business, "business");
        kotlin.jvm.internal.o.LJIIIZ(scene, "scene");
        kotlin.jvm.internal.o.LJIIIZ(bpeaCert, "bpeaCert");
        kotlin.jvm.internal.o.LJIIIZ(decryptCert, "decryptCert");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getLastLocation - business: ");
        LIZ.append(business);
        LIZ.append(", scene: ");
        LIZ.append(scene);
        LIZ.append(",bepaCert: ");
        LIZ.append(bpeaCert);
        LIZ.append(", decryptCert: ");
        LIZ.append(decryptCert);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ));
        if (LIZ()) {
            C85296Xdk.LIZ.getClass();
            if (C85296Xdk.LIZLLL(business, scene)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isInAllowLocationMode = ");
                LIZ2.append(LIZ());
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ2));
                try {
                    IBDLocationAgent bDLocationAgent = BDLocationSpi.getBDLocationAgent();
                    if ((bDLocationAgent != null && bDLocationAgent.isInit()) || C16880lQ.LLJJJJ().getThread() != C16880lQ.LLLLIIIILLL()) {
                        LJIL(business, scene, bpeaCert, decryptCert, interfaceC56182M3e);
                        return;
                    } else {
                        BDLocationSpi.installLocationPlugin(EF7.LIZIZ(), new C85264XdE(this, business, scene, bpeaCert, decryptCert, interfaceC56182M3e));
                        return;
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    interfaceC56182M3e.onError(new J0X(message, "location sdk", ""));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("e = ");
                    LIZ3.append(e.getMessage());
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ3));
                    return;
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("getLastLocation - not allow, isInAllowLocationMode = ");
        LIZ4.append(LIZ());
        LIZ4.append(",isEnable = LocationPopupConfig.isEnable(business, scene)");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ4));
        interfaceC56182M3e.onError(new J0X("not allow to locate", "location sdk", ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 < 0) goto L12;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x005d: IF  (r10 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:27:? (LINE:100663389), block:B:21:0x005d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(java.lang.String r14, java.lang.String r15, com.bytedance.bpea.basics.Cert r16, com.bytedance.bpea.basics.Cert r17, X.InterfaceC56182M3e r18, java.lang.Long r19) {
        /*
            java.lang.String r5 = "location sdk"
            java.lang.String r4 = ""
            r10 = r18
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L5c
            com.bytedance.bdlocation.client.IBDLocationClient r6 = com.bytedance.bdlocation.BDLocationSpi.getBDLocationClient()     // Catch: java.lang.Exception -> L5c
            if (r6 != 0) goto L1d
            if (r10 == 0) goto L1c
            X.J0X r1 = new X.J0X     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = "Location SDK is not available, make sure you have added it to your dependency"
            r1.<init>(r0, r5, r4)     // Catch: java.lang.Exception -> L5c
            r10.onError(r1)     // Catch: java.lang.Exception -> L5c
        L1c:
            return
        L1d:
            com.bytedance.bdlocation.client.BDLocationClientOption r7 = new com.bytedance.bdlocation.client.BDLocationClientOption     // Catch: java.lang.Exception -> L5c
            r7.<init>()     // Catch: java.lang.Exception -> L5c
            if (r19 == 0) goto L2e
            long r2 = r19.longValue()     // Catch: java.lang.Exception -> L5c
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L31
        L2e:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
        L31:
            r0 = 30000(0x7530, double:1.4822E-319)
            r7.setLocationTimeOut(r0)     // Catch: java.lang.Exception -> L5c
            r7.setMaxCacheTime(r2)     // Catch: java.lang.Exception -> L5c
            r0 = 4
            r7.setAccuracyLevel(r0)     // Catch: java.lang.Exception -> L5c
            r0 = 1
            r7.setTriggerType(r0)     // Catch: java.lang.Exception -> L5c
            r0 = r16
            r7.setBpeaCert(r0)     // Catch: java.lang.Exception -> L5c
            r13 = r17
            if (r13 == 0) goto L4d
            r7.setDecryptCert(r13)     // Catch: java.lang.Exception -> L5c
        L4d:
            r6.setClientOption(r7)     // Catch: java.lang.Exception -> L5c
            X.M3f r7 = new X.M3f     // Catch: java.lang.Exception -> L5c
            r9 = r15
            r8 = r14
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r13, r14)     // Catch: java.lang.Exception -> L5c
            r6.getLocation(r7)     // Catch: java.lang.Exception -> L5c
            goto L6e
        L5c:
            r0 = move-exception
            if (r10 == 0) goto L6e
            X.J0X r1 = new X.J0X
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L68
            r0 = r4
        L68:
            r1.<init>(r0, r5, r4)
            r10.onError(r1)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl.LJIJJLI(java.lang.String, java.lang.String, com.bytedance.bpea.basics.Cert, com.bytedance.bpea.basics.Cert, X.M3e, java.lang.Long):void");
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIILJJIL(String business, String scene, TokenCert bpeaCert, TokenCert tokenCert, InterfaceC56182M3e interfaceC56182M3e, Long l) {
        Boolean bool;
        kotlin.jvm.internal.o.LJIIIZ(business, "business");
        kotlin.jvm.internal.o.LJIIIZ(scene, "scene");
        kotlin.jvm.internal.o.LJIIIZ(bpeaCert, "bpeaCert");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchLocation - business: ");
        LIZ.append(business);
        LIZ.append(", scene: ");
        LIZ.append(scene);
        LIZ.append(",bepaCert: ");
        LIZ.append(bpeaCert);
        LIZ.append(", decryptCert: ");
        LIZ.append(tokenCert);
        LIZ.append(", cacheTime: ");
        LIZ.append(l);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ));
        if (!LIZ()) {
            if (interfaceC56182M3e != null) {
                interfaceC56182M3e.onError(new J0X("not allow to locate", "location sdk", ""));
                return;
            }
            return;
        }
        C85296Xdk.LIZ.getClass();
        if (!C85296Xdk.LIZLLL(business, scene)) {
            if (interfaceC56182M3e != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('(');
                LIZ2.append(business);
                LIZ2.append(',');
                LIZ2.append(scene);
                LIZ2.append(") is not allow");
                interfaceC56182M3e.onError(new J0X(X1D.LIZIZ(LIZ2), "location sdk", ""));
                return;
            }
            return;
        }
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("location sdk init = ");
            IBDLocationAgent bDLocationAgent = BDLocationSpi.getBDLocationAgent();
            if (bDLocationAgent != null) {
                bool = Boolean.valueOf(bDLocationAgent.isInit());
            } else {
                bool = null;
            }
            LIZ3.append(bool);
            LIZ3.append("  currentThread = ");
            LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LocationService", X1D.LIZIZ(LIZ3));
            IBDLocationAgent bDLocationAgent2 = BDLocationSpi.getBDLocationAgent();
            if ((bDLocationAgent2 != null && bDLocationAgent2.isInit()) || C16880lQ.LLJJJJ().getThread() != C16880lQ.LLLLIIIILLL()) {
                LJIJJLI(business, scene, bpeaCert, tokenCert, interfaceC56182M3e, l);
            } else {
                BDLocationSpi.installLocationPlugin(EF7.LIZIZ(), new C85261XdB(this, business, scene, bpeaCert, tokenCert, interfaceC56182M3e, l));
            }
        } catch (Exception e) {
            if (interfaceC56182M3e != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                interfaceC56182M3e.onError(new J0X(message, "location sdk", ""));
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("e = ");
            LIZ4.append(e.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ4));
        }
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIJI(String str, String scene, Cert cert, ActivityC45651qj activity, C85258Xd8 c85258Xd8, InterfaceC54674Ld0 interfaceC54674Ld0, InterfaceC85311Xdz interfaceC85311Xdz) {
        kotlin.jvm.internal.o.LJIIIZ(scene, "scene");
        kotlin.jvm.internal.o.LJIIIZ(cert, "cert");
        kotlin.jvm.internal.o.LJIIIZ(activity, "activity");
        if (cert.certToken() == null) {
            cert.certType();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            J13 j13 = new J13();
            C85296Xdk.LIZ.getClass();
            if (!C85296Xdk.LIZLLL(str, scene)) {
                if (interfaceC54674Ld0 != null) {
                    interfaceC54674Ld0.LIZIZ(0, "this scene is not allow to apply for location permissions");
                    return;
                }
                return;
            }
            OHI.LIZ.getClass();
            if (OHI.LJ(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                if (interfaceC54674Ld0 == null) {
                    return;
                }
                interfaceC54674Ld0.LIZ();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            List<String> locationPermissions = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).locationPermissions();
            boolean shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION");
            C68322mC c68322mC = new C68322mC();
            C72242sW c72242sW = new C72242sW();
            c72242sW.element = System.currentTimeMillis();
            C61099NyR LIZIZ = C61099NyR.LIZIZ.LIZIZ(activity, cert);
            String[] strArr = (String[]) locationPermissions.toArray(new String[0]);
            C61100NyS LIZ = LIZIZ.LIZ((String[]) Arrays.copyOf(strArr, strArr.length));
            LIZ.LIZ(new C85297Xdl(str, scene, activity, c85258Xd8, c68322mC, c72242sW, shouldShowRequestPermissionRationale));
            LIZ.LIZJ(new C85298Xdm(c68322mC, activity, shouldShowRequestPermissionRationale, c72242sW, interfaceC54674Ld0, c85258Xd8, interfaceC85311Xdz, j13, str, scene, currentTimeMillis));
            return;
        }
        if (interfaceC54674Ld0 == null) {
            return;
        }
        interfaceC54674Ld0.LIZ();
    }
}
