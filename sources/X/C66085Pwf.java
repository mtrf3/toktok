package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pwf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66085Pwf {
    public final String LIZ;
    public final C1HQ LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final List<Long> LJFF;
    public final List<String> LJI;
    public final List<String> LJII;
    public final List<String> LJIIIIZZ;

    public C66085Pwf(String actionType, String str) {
        String userId;
        Long valueOf;
        long j;
        String LIZJ;
        Long valueOf2;
        Object obj;
        long j2;
        o.LJIIIZ(actionType, "actionType");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        InterfaceC66086Pwg interfaceC66086Pwg = heliosEnvImpl.LIZIZ;
        if (interfaceC66086Pwg == null) {
            userId = "null";
        } else {
            userId = interfaceC66086Pwg.getUserId();
        }
        o.LJIIIIZZ(userId, "HeliosEnvImpl.get().userId");
        this.LIZ = userId;
        C1HQ c1hq = new C1HQ();
        this.LIZIZ = c1hq;
        PQ0.LJFF.getClass();
        boolean LIZLLL = C64403PPj.LIZLLL(0L);
        c1hq.put("is_background", Boolean.valueOf(LIZLLL));
        InterfaceC66086Pwg interfaceC66086Pwg2 = HeliosEnvImpl.get().LIZIZ;
        if (interfaceC66086Pwg2 == null) {
            valueOf = Long.valueOf(System.currentTimeMillis());
        } else {
            valueOf = Long.valueOf(interfaceC66086Pwg2.LIZIZ());
        }
        long longValue = valueOf.longValue() - System.currentTimeMillis();
        if (LIZLLL) {
            C64331PMp LIZIZ = C64329PMn.LIZIZ();
            if (!LIZIZ.LIZIZ) {
                j2 = LIZIZ.LIZJ + C64329PMn.LJFF;
            } else {
                j2 = -1;
            }
            j = j2 + longValue;
        } else {
            j = -1;
        }
        this.LIZLLL = j;
        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
        InterfaceC66086Pwg interfaceC66086Pwg3 = heliosEnvImpl2.LIZIZ;
        if (interfaceC66086Pwg3 == null) {
            LIZJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            LIZJ = interfaceC66086Pwg3.LIZJ();
        }
        c1hq.put("store_region_src", LIZJ);
        HeliosEnvImpl heliosEnvImpl3 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl3, "HeliosEnvImpl.get()");
        String LJIIJ = heliosEnvImpl3.LJIIJ();
        c1hq.put("store_region", LJIIJ == null ? LiveGiftNewGifterBadgeSetting.DEFAULT : LJIIJ);
        ApiStatistics apiStatistics = C66083Pwd.LIZLLL;
        if (apiStatistics != null) {
            for (String str2 : apiStatistics.factParameters) {
                HeliosEnvImpl heliosEnvImpl4 = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl4, "HeliosEnvImpl.get()");
                InterfaceC66053Pw9 LJIIIZ = heliosEnvImpl4.LJIIIZ();
                if (LJIIIZ == null || (obj = ((C66143Pxb) LJIIIZ).LIZIZ(str2)) == null) {
                    obj = LiveGiftNewGifterBadgeSetting.DEFAULT;
                }
                c1hq.put(str2, obj);
            }
        }
        this.LIZIZ.put("action_type", actionType);
        if (str != null) {
            this.LIZIZ.put("api_sub_type", str);
        }
        Collection values = this.LIZIZ.values();
        o.LJIIIIZZ(values, "statusMap.values");
        this.LIZJ = ORZ.LLD(values, "", null, null, null, 62).hashCode();
        InterfaceC66086Pwg interfaceC66086Pwg4 = HeliosEnvImpl.get().LIZIZ;
        if (interfaceC66086Pwg4 == null) {
            valueOf2 = -1L;
        } else {
            valueOf2 = Long.valueOf(interfaceC66086Pwg4.LJFF());
        }
        o.LJIIIIZZ(valueOf2, "HeliosEnvImpl.get().usedTime()");
        this.LJ = valueOf2.longValue();
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
        this.LJIIIIZZ = new ArrayList();
    }

    public final void LIZ(long j, String token, String lastPage, String str) {
        o.LJIIIZ(token, "token");
        o.LJIIIZ(lastPage, "lastPage");
        ((ArrayList) this.LJFF).add(Long.valueOf(j));
        ((ArrayList) this.LJI).add(token);
        ((ArrayList) this.LJIIIIZZ).add(lastPage);
        ((ArrayList) this.LJII).add(str);
    }
}
