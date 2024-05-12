package X;

import Y.AfS58S0100000_6;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.client.experiment.UploadVidApi;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS13S0200100_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS30S0100100_6;
import kotlin.jvm.internal.o;

/* renamed from: X.E5l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35857E5l implements InterfaceC35868E5w {
    public static final C35857E5l LIZ = new C35857E5l();
    public static final UploadVidApi LIZIZ;
    public static final Keva LIZJ;
    public static int LIZLLL;
    public static final INetworkStateService LJ;

    static {
        IRetrofitFactory LIZLLL2 = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (UploadVidApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL2, str, UploadVidApi.class);
        LIZJ = Keva.getRepo("upload_vids_keva_repo");
        LJ = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
    }

    @Override // X.InterfaceC35868E5w
    public final void LIZ(EnumC41264GHk networkStatus) {
        String[] strArr;
        long j;
        List LJLJL;
        o.LJIIIZ(networkStatus, "networkStatus");
        if (networkStatus == EnumC41264GHk.STRONG) {
            LIZLLL++;
            C35858E5m c35858E5m = C35858E5m.LJLIL;
            List<String> LJIILJJIL = NewUserJourneyService.LJIILLIIL().LJIILJJIL();
            o.LJIIIIZZ(LIZJ.getStringArray("key_successful_vids", new String[0]), "keva.getStringArray(KEY_…his.toList()}\")\n        }");
            ArrayList arrayList = new ArrayList();
            for (String str : LJIILJJIL) {
                if (!ORY.LJJIJIIJIL(str, r9)) {
                    arrayList.add(str);
                }
            }
            String[] stringArray = LIZJ.getStringArray("key_successful_vids", new String[0]);
            o.LJIIIIZZ(stringArray, "keva.getStringArray(KEY_…his.toList()}\")\n        }");
            List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            ORS.LJJLIIIJJIZ(LLJILJILJ, stringArray);
            if (((ArrayList) LLJILJILJ).size() <= 50 || (LJLJL = ORZ.LJLJL(30, LLJILJILJ)) == null || (strArr = (String[]) LJLJL.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            if (!arrayList.isEmpty()) {
                String LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
                AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(strArr, 103);
                long j2 = C56662Kg.LIZ().LJIIJJI;
                if (j2 > 0) {
                    j = SystemClock.elapsedRealtime() - j2;
                } else {
                    j = -1;
                }
                C188727au LJ2 = C169696lJ.LJ(j, "app_start_req_send_duration");
                Boolean LIZLLL2 = C38987FRv.LIZLLL();
                o.LJIIIIZZ(LIZLLL2, "isFirstInstallAndFirstLaunch()");
                LJ2.LIZLLL(LIZLLL2.booleanValue() ? 1 : 0, "is_cold_start_first_launch");
                java.util.Map<String, String> sendUploadVidEvent$lambda$3 = LJ2.LIZ;
                o.LJIIIIZZ(sendUploadVidEvent$lambda$3, "sendUploadVidEvent$lambda$3");
                V2B.LJIJ(sendUploadVidEvent$lambda$3);
                FMX.LJIIL("upload_vid_req_send", sendUploadVidEvent$lambda$3);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                LIZIZ.uploadVid(new UploadVidApi.UploadVidRequest(LLD)).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJJJ(3L).LJJJLIIL(new AfS58S0100000_6(new AqS13S0200100_6(elapsedRealtime, aqS156S0100000_6, c35858E5m, 0), (InterfaceC88472Yns<? super Throwable, C76800UCe>) 39), new AfS58S0100000_6(new AqS30S0100100_6(c35858E5m, elapsedRealtime, 0), (InterfaceC88472Yns<? super Throwable, C76800UCe>) 39));
            } else {
                LJ.removeNetworkChangeObserver(this);
            }
        }
        if (LIZLLL >= 3) {
            LJ.removeNetworkChangeObserver(this);
        }
    }

    public static void LIZIZ(int i, long j) {
        long j2;
        long j3 = C56662Kg.LIZ().LJIIJJI;
        if (j3 > 0) {
            j2 = SystemClock.elapsedRealtime() - j3;
        } else {
            j2 = -1;
        }
        C188727au LIZJ2 = C78920UyC.LIZJ(i, "status");
        LIZJ2.LJ(SystemClock.elapsedRealtime() - j, "req_duration");
        Boolean LIZLLL2 = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL2, "isFirstInstallAndFirstLaunch()");
        LIZJ2.LIZLLL(LIZLLL2.booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        LIZJ2.LJ(j2, "duration_from_start");
        java.util.Map<String, String> sendUploadVidEndEvent$lambda$4 = LIZJ2.LIZ;
        o.LJIIIIZZ(sendUploadVidEndEvent$lambda$4, "sendUploadVidEndEvent$lambda$4");
        V2B.LJIJ(sendUploadVidEndEvent$lambda$4);
        FMX.LJIIL("upload_vid_req_recv", sendUploadVidEndEvent$lambda$4);
    }
}
