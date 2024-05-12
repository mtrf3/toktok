package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import defpackage.a1;

/* renamed from: X.Fhv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39691Fhv implements InterfaceC73463SsN<C39693Fhx> {
    public final /* synthetic */ Context LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    public C39691Fhv(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(C39693Fhx c39693Fhx) {
        String str;
        int i;
        int i2;
        boolean z;
        String str2;
        String str3;
        C39693Fhx c39693Fhx2 = c39693Fhx;
        C39695Fhz c39695Fhz = c39693Fhx2.LIZ;
        C39690Fhu c39690Fhu = c39693Fhx2.LIZIZ;
        C39689Fht c39689Fht = c39693Fhx2.LIZJ;
        C39697Fi1 c39697Fi1 = c39693Fhx2.LIZLLL;
        C39694Fhy c39694Fhy = c39693Fhx2.LJ;
        Bundle bundle = new Bundle();
        bundle.putInt("screen_width_dp", C53947LFf.LIZLLL());
        bundle.putInt("screen_height_dp", C53947LFf.LIZ());
        AppLog.setCustomerHeader(bundle);
        String str4 = "on";
        if (PipServiceImpl.LJJII().LJJIFFI()) {
            str = "on";
        } else {
            str = "off";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("cpu_vendor", c39695Fhz.LIZ);
        c188727au.LIZLLL(c39695Fhz.LIZJ, "cpu_core_nums");
        c188727au.LIZLLL(c39695Fhz.LIZIZ, "cpu_freq");
        c188727au.LIZLLL(c39690Fhu.LIZ, "screen_dpi");
        c188727au.LIZLLL(c39690Fhu.LIZIZ, "screen_width");
        c188727au.LIZLLL(c39690Fhu.LIZJ, "screen_height");
        c188727au.LJ(c39689Fht.LJ, "app_storage_size");
        c188727au.LJ(c39689Fht.LIZIZ, "storage_total_external_size");
        c188727au.LJ(c39689Fht.LIZ, "storage_available_external_size");
        c188727au.LJ(c39689Fht.LIZLLL, "storage_total_internal_size");
        c188727au.LJ(c39689Fht.LIZJ, "storage_available_internal_size");
        c188727au.LJ(c39689Fht.LJIIIIZZ, "storage_app_size");
        c188727au.LJ(c39689Fht.LJIIIZ, "storage_data_size");
        c188727au.LJ(c39689Fht.LJIIJ, "storage_cache_size");
        c188727au.LJ(c39689Fht.LJIIIIZZ + c39689Fht.LJIIIZ + c39689Fht.LJIIJ, "total_storage_size");
        c188727au.LJ(c39697Fi1.LIZ, "memory_total_size");
        c188727au.LJ(c39697Fi1.LIZIZ, "memory_available_size");
        String str5 = Build.BRAND;
        c188727au.LJIIIZ("brand", str5);
        c188727au.LJIIIZ("os_version", Build.VERSION.RELEASE);
        c188727au.LIZLLL(Build.VERSION.SDK_INT, "os_api_level");
        c188727au.LJIIIZ("Board", Build.BOARD);
        c188727au.LJIIIZ("brand", str5);
        c188727au.LJIIIZ("device", Build.DEVICE);
        c188727au.LJIIIZ("hardware", Build.HARDWARE);
        c188727au.LJIIIZ("manufacturer", Build.MANUFACTURER);
        c188727au.LJIIIZ("model", Build.MODEL);
        c188727au.LJIIIZ("product", Build.PRODUCT);
        String[] strArr = Build.SUPPORTED_ABIS;
        String str6 = "";
        if (strArr != null) {
            for (String str7 : strArr) {
                str6 = a1.LJ(str6, str7, "_");
            }
        }
        c188727au.LJIIIZ("abis", str6);
        c188727au.LJ(Build.TIME, "build_time");
        if (C61447O9r.LJIILJJIL == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_transparent_bar");
        if (C235779Nd.LIZ.LIZJ().LIZ().intValue() == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "traffic_economy_mode");
        c188727au.LIZLLL(c39689Fht.LJII, "install_on_sdcard");
        c188727au.LIZIZ(c39690Fhu.LIZLLL, "screen_xdpi");
        c188727au.LIZIZ(c39690Fhu.LJ, "screen_ydpi");
        c188727au.LIZLLL(C53947LFf.LIZLLL(), "screen_width_dp");
        c188727au.LIZLLL(C53947LFf.LIZ(), "screen_height_dp");
        double sqrt = Math.sqrt(Math.pow(c39690Fhu.LIZJ / c39690Fhu.LJ, 2.0d) + Math.pow(c39690Fhu.LIZIZ / c39690Fhu.LIZLLL, 2.0d));
        Bundle bundle2 = new Bundle();
        bundle2.putDouble("screen_inches", sqrt);
        AppLog.setCustomerHeader(bundle2);
        c188727au.LIZJ("screen_inches", sqrt);
        double sqrt2 = Math.sqrt(Math.pow(c39690Fhu.LIZJ / c39690Fhu.LIZ, 2.0d) + Math.pow(c39690Fhu.LIZIZ / c39690Fhu.LIZ, 2.0d));
        Bundle bundle3 = new Bundle();
        bundle3.putDouble("screen_inches_v2", sqrt2);
        AppLog.setCustomerHeader(bundle3);
        c188727au.LIZJ("screen_inches_v2", sqrt2);
        float f = c39690Fhu.LIZIZ;
        float f2 = c39690Fhu.LJFF;
        double min = Math.min(f / f2, c39690Fhu.LIZJ / f2);
        new Bundle().putDouble("screen_sw", min);
        c188727au.LIZJ("screen_sw", min);
        if ((this.LJLIL.getResources().getConfiguration().screenLayout & 15) >= 3) {
            z = true;
        } else {
            z = false;
        }
        c188727au.LJFF(Boolean.valueOf(z), "is_tablet");
        c188727au.LIZLLL(c39694Fhy.LIZ, "camera_permission_status");
        c188727au.LIZLLL(c39694Fhy.LIZIZ, "mic_permission_status");
        c188727au.LIZLLL(c39694Fhy.LIZJ, "photo_permission_status");
        c188727au.LIZLLL(c39694Fhy.LJ, "upload_permission_video");
        c188727au.LIZLLL(c39694Fhy.LIZLLL, "upload_permission_image");
        if (c39694Fhy.LJFF) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c188727au.LJIIIZ("floating_window_system_permission_status", str2);
        c188727au.LJIIIZ("floating_window_permission_status", str);
        if (SettingServiceImpl.LIZ().shouldUseFasterPaging()) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c188727au.LJI("fasterscroll_speed_switch_status", str3);
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        if (c55888Lwa.LJIIZILJ()) {
            if (!c55888Lwa.LJJI(false)) {
                str4 = "off";
            }
            c188727au.LJI("creator_inbox_status", str4);
        }
        FMX.LJIIL("device_info", c188727au.LIZ);
    }
}
