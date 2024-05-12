package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.apm.agent.instrumentation.OkHttp3Instrumentation;
import com.bytedance.retrofit2.SsHttpCall;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PbE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64756PbE implements InterfaceC64851Pcl {
    public final /* synthetic */ NetworkInitTask LIZ;

    public static final void LIZLLL() {
        C56662Kg.LIZ().LIZJ("feed_network_init_to_init_ttnet", false);
    }

    public C64756PbE(NetworkInitTask networkInitTask) {
        this.LIZ = networkInitTask;
    }

    @Override // X.InterfaceC64851Pcl
    public final void LIZ(C64830PcQ c64830PcQ) {
        C56662Kg.LIZ().LJFF("feed_network_init_ttnet_duration", false);
        C56662Kg.LIZ().LJFF("feed_boot_to_init_ttnet_end", false);
        C56662Kg.LIZ().LIZJ("feed_init_ttnet_end_to_network", false);
        C56662Kg.LIZ().LIZJ("feed_network_init_sec_duration", false);
        NetworkInitTask networkInitTask = this.LIZ;
        Context LIZIZ = EF7.LIZIZ();
        networkInitTask.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        FZG fzg = FZG.LJLIL;
        if (FCD.LJI(LIZIZ)) {
            String str = c64830PcQ.LJ;
            if (str == null) {
                str = "";
            }
            String str2 = c64830PcQ.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            SecApiImpl.LIZ().initSec(LIZIZ, (String) fzg.invoke(), c64830PcQ.LIZLLL, str, str2, true, new FX3(fzg));
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sec_init_time", elapsedRealtime2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZIZ("sec_init_time", "", jSONObject);
        C56662Kg.LIZ().LJFF("feed_network_init_sec_duration", false);
        InterceptorHolder.LIZLLL().LIZJ();
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new OrbuInitTask(), true);
        LJIIIZ.LIZJ();
    }

    @Override // X.InterfaceC64851Pcl
    public final void LIZIZ(C64830PcQ config) {
        C64600PWy build;
        o.LJIIIZ(config, "config");
        this.LIZ.getClass();
        C64734Pas LJIIIZ = C64734Pas.LJIIIZ(EF7.LIZIZ());
        String[] strArr = C38652FEy.LIZJ;
        if (C38652FEy.LIZIZ == 1180) {
            strArr = C38652FEy.LIZLLL;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        LJIIIZ.getClass();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!C38354F3m.LJ(str) && !V1M.LJJIIZ(str, LJIIIZ.LJZL)) {
                    ((CopyOnWriteArrayList) LJIIIZ.LJZL).add(str.trim());
                }
            }
        }
        List<InterfaceC48121Iub> LIZ = InterceptorHolder.LIZLLL().LIZ();
        if (!C79004UzY.LJJIFFI(LIZ) && LIZ != null) {
            for (InterfaceC48121Iub interfaceC48121Iub : LIZ) {
                C64622PXu c64622PXu = C64622PXu.LIZJ;
                if (c64622PXu.LIZ == null) {
                    c64622PXu.LIZ();
                }
                C64600PWy c64600PWy = c64622PXu.LIZ;
                c64600PWy.getClass();
                C64601PWz c64601PWz = new C64601PWz(c64600PWy);
                c64601PWz.addNetworkInterceptor(interfaceC48121Iub);
                if (!(c64601PWz instanceof C64601PWz)) {
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-8411805175548216656"));
                    if (LIZJ.LIZ) {
                        build = (C64600PWy) LIZJ.LIZIZ;
                    } else {
                        build = c64601PWz.build();
                    }
                } else {
                    build = OkHttp3Instrumentation.build(c64601PWz);
                }
                c64622PXu.LIZ = build;
            }
        }
        if (!C36841Ed3.LIZIZ(EF7.LIZIZ())) {
            C64735Pat.LJII = config.LJII;
            SsHttpCall.setCallMonitor(C64735Pat.LIZIZ);
        }
    }

    @Override // X.InterfaceC64851Pcl
    public final void LIZJ(C64830PcQ config) {
        o.LJIIIZ(config, "config");
        C56662Kg.LIZ().LJFF("feed_network_init_to_init_ttnet", false);
        C56662Kg.LIZ().LIZJ("feed_network_init_ttnet_duration", false);
        C56662Kg.LIZ().LJFF("feed_boot_to_init_ttnet", false);
    }
}
