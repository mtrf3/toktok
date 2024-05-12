package X;

import Y.AfS0S1110100_6;
import android.content.ContentResolver;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import defpackage.r0;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E71 implements InterfaceC35868E5w {
    public final InterfaceC35627DyZ LIZ = E73.LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35932E8i.LJLIL);
    public final Keva LIZJ = Keva.getRepo("hybrid_sdk_keva_repo");
    public final INetworkStateService LIZLLL = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
    public int LJ;
    public boolean LJFF;

    public static String LIZIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-1930643388029326214");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    @Override // X.InterfaceC35868E5w
    public final void LIZ(EnumC41264GHk networkStatus) {
        o.LJIIIZ(networkStatus, "networkStatus");
        if (networkStatus == EnumC41264GHk.STRONG) {
            this.LJ++;
            r0.LIZ.getClass();
            LIZJ(true, r0.LIZ().disableRetryWhenNetworkChange);
        }
        int i = this.LJ;
        r0.LIZ.getClass();
        if (i >= r0.LIZ().maxTimesWhenNetworkChange) {
            this.LJFF = false;
            this.LIZLLL.removeNetworkChangeObserver(this);
        }
    }

    public final void LIZJ(boolean z, boolean z2) {
        long j;
        String LIZIZ;
        ArrayList arrayList = new ArrayList();
        if (E73.LIZ()) {
            arrayList.add("ttk_app_new_install_launch");
        }
        arrayList.add("ttk_app_dau_launch");
        String LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = C56662Kg.LIZ().LJIIJJI;
        if (j2 > 0) {
            j = SystemClock.elapsedRealtime() - j2;
        } else {
            j = -1;
        }
        C188727au LJ = C169696lJ.LJ(j, "from_start_to_current_duration");
        LJ.LIZLLL(!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0, "is_did_ready");
        LJ.LIZLLL(E6T.LIZIZ, "is_in_nuj_process");
        LJ.LIZLLL(E73.LIZ() ? 1 : 0, "is_cold_start_first_launch");
        LJ.LJIIIZ("feature_name", LLD);
        LJ.LIZLLL(z ? 1 : 0, "is_from_network_change");
        LJ.LIZLLL(C84763XOl.LJIIJJI ? 1 : 0, "is_app_background");
        LJ.LIZLLL(E6T.LJII.getNetworkStatus().ordinal(), "network_status");
        FMX.LJIIL("hybrid_ab_api_req_send", LJ.LIZ);
        E6T.LJIIIIZZ = false;
        C36213EJd.LIZIZ = false;
        ContentResolver contentResolver = EF7.LIZIZ().getContentResolver();
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                LIZIZ = "";
            } else {
                if (TextUtils.isEmpty(E77.LIZ)) {
                    E77.LIZ = LIZIZ(contentResolver);
                }
                LIZIZ = E77.LIZ;
            }
        } else {
            LIZIZ = LIZIZ(contentResolver);
        }
        int i = this.LIZJ.getInt("key_request_times", 0);
        this.LIZJ.storeInt("key_request_times", i + 1);
        AbstractC73672Svk<R> LJJIII = AbstractC73672Svk.LJIIJ(new E6Z(LLD, this)).LJJIII(new C35867E5v(this, LLD, i, LIZIZ), false);
        o.LJIIIIZZ(LJJIII, "@SuppressLint(\"HardwareI…        )\n        }\n    }");
        AbstractC73672Svk LJJJ = LJJIII.LJJL(T16.LIZ()).LJJJ(T16.LIZ());
        if (!z2) {
            r0.LIZ.getClass();
            if (r0.LIZ().enableRetry || E73.LIZ()) {
                LJJJ = LJJJ.LJJJJL(new C36966Ef4(r0.LIZ().maxRetryTimes, r0.LIZ().retryIntervalMs));
            }
        }
        LJJJ.LJJJLIIL(new AfS0S1110100_6(this, LLD, elapsedRealtime, z, 0), new AfS0S1110100_6(this, LLD, elapsedRealtime, z, 1));
    }
}
