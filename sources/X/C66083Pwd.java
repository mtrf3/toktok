package X;

import Y.ARunnableS4S2100000_11;
import android.os.Handler;
import android.os.Message;
import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b0;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Pwd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66083Pwd implements InterfaceC66032Pvo {
    public static final InterfaceC66048Pw4 LIZIZ;
    public static List<ApiStatistics> LIZJ;
    public static volatile ApiStatistics LIZLLL;
    public static final ConcurrentHashMap<String, C66085Pwf> LJ;
    public static final ConcurrentHashMap<String, Runnable> LJFF;
    public static String LJI;
    public static String LJII;
    public static final C66083Pwd LJIIIIZZ = new C66083Pwd();
    public static final ArrayList<ConcurrentHashMap<String, AtomicLong>> LIZ = new ArrayList<>();

    static {
        C66055PwB LJ2;
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        InterfaceC66045Pw1 interfaceC66045Pw1 = heliosEnvImpl.LJIILIIL;
        C66222Pys c66222Pys = null;
        if (interfaceC66045Pw1 != null && (LJ2 = interfaceC66045Pw1.LJ()) != null) {
            c66222Pys = LJ2.LIZ("helios_api_statistics_repo");
        }
        LIZIZ = c66222Pys;
        LIZJ = C61878OQg.INSTANCE;
        LJ = new ConcurrentHashMap<>();
        LJFF = new ConcurrentHashMap<>();
    }

    public static String LIZIZ(Object... objArr) {
        String str = "";
        for (Object obj : objArr) {
            str = i0.LJFF(b0.LIZIZ(str, obj), "##");
        }
        return s.LJJZZIII("##", str);
    }

    public static void LJFF(C66120PxE event) {
        String str;
        Long valueOf;
        o.LJIIIZ(event, "event");
        if (LIZLLL == null) {
            return;
        }
        Boolean fuse = (Boolean) event.LLI.getInterceptResult().first;
        if (event.LJZL) {
            str = "cache";
        } else {
            str = "fuse";
            o.LJIIIIZZ(fuse, "fuse");
            if (!fuse.booleanValue()) {
                str = "guard";
            }
        }
        String valueOf2 = String.valueOf(event.LJLJI);
        String str2 = (String) event.LJLLLL.get("api_sub_type");
        String str3 = (String) event.LJLLLL.get("certToken");
        if (str3 == null) {
            str3 = "";
        }
        InterfaceC66086Pwg interfaceC66086Pwg = HeliosEnvImpl.get().LIZIZ;
        if (interfaceC66086Pwg == null) {
            valueOf = Long.valueOf(System.currentTimeMillis());
        } else {
            valueOf = Long.valueOf(interfaceC66086Pwg.LIZIZ());
        }
        C66085Pwf c66085Pwf = LJ.get(valueOf2);
        Throwable th = event.LJLJJLL;
        if (th == null) {
            th = new Throwable();
        }
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new RunnableC66084Pwe(th, str, str2, valueOf, str3, event, c66085Pwf, valueOf2));
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        ApiStatistics apiStatistics;
        java.util.Map<String, ?> all;
        o.LJIIIZ(newSettings, "newSettings");
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC66048Pw4 interfaceC66048Pw4 = LIZIZ;
        if (interfaceC66048Pw4 != null && (all = interfaceC66048Pw4.getAll()) != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                List LJLJJL = s.LJLJJL(entry.getKey(), new String[]{"##"}, 4, 2);
                if (LJLJJL.size() >= 4) {
                    String str = (String) ListProtector.get(LJLJJL, 0);
                    String str2 = (String) ListProtector.get(LJLJJL, 3);
                    boolean parseBoolean = Boolean.parseBoolean((String) ListProtector.get(LJLJJL, 2));
                    Object value = entry.getValue();
                    if (value != null) {
                        C66059PwF.LIZIZ(ApmEvent.LIZLLL(((Long) value).longValue(), str, str2, parseBoolean));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                }
            }
        }
        InterfaceC66048Pw4 interfaceC66048Pw42 = LIZIZ;
        if (interfaceC66048Pw42 != null) {
            interfaceC66048Pw42.clear();
        }
        int size = LIZ.size();
        for (int i = 0; i < size; i++) {
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.removeMessages(i, "statistics");
        }
        LIZ.clear();
        List<ApiStatistics> list = newSettings.apiStatisticsConfigs;
        LIZJ = list;
        Iterator<ApiStatistics> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                apiStatistics = it.next();
                if (o.LJ(apiStatistics.type, "fact")) {
                    break;
                }
            } else {
                apiStatistics = null;
                break;
            }
        }
        LIZLLL = apiStatistics;
        int size2 = LIZJ.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LIZ.add(new ConcurrentHashMap<>());
        }
        C65929Pu9.LIZ(currentTimeMillis, "ApiStatisticsManager.onNewSettings", true);
    }

    public static void LIZJ(int i, String str) {
        if (i < 0) {
            return;
        }
        HandlerThreadC64418PPy.LIZ();
        if (!HandlerThreadC64418PPy.LJLJJI.hasMessages(i, "statistics")) {
            HandlerThreadC64418PPy.LIZ();
            Message obtain = Message.obtain(HandlerThreadC64418PPy.LJLJJI, new RunnableC66082Pwc(i));
            obtain.what = i;
            obtain.obj = "statistics";
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.sendMessageDelayed(obtain, ((ApiStatistics) ListProtector.get(LIZJ, i)).sessionIntervalTime);
        }
        if (((ApiStatistics) ListProtector.get(LIZJ, i)).cached && LIZIZ != null) {
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new RunnableC66081Pwb(i, str));
            return;
        }
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZIZ2 = LIZIZ(Boolean.valueOf(PQ0.LJFF()), str);
        ArrayList<ConcurrentHashMap<String, AtomicLong>> arrayList = LIZ;
        AtomicLong atomicLong = (AtomicLong) ((ConcurrentHashMap) ListProtector.get(arrayList, i)).get(LIZIZ2);
        if (atomicLong == null) {
            atomicLong = new AtomicLong(0L);
        }
        atomicLong.incrementAndGet();
        Object obj = ListProtector.get(arrayList, i);
        o.LJIIIIZZ(obj, "statisticsList[configIndex]");
        ((java.util.Map) obj).put(LIZIZ2, atomicLong);
    }

    public static void LIZLLL(String str, java.util.Map map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            long longValue = ((Number) entry.getValue()).longValue();
            if (longValue > 0) {
                List LJLJJL = s.LJLJJL((CharSequence) entry.getKey(), new String[]{"##"}, 2, 2);
                if (LJLJJL.size() >= 2) {
                    C66059PwF.LIZIZ(ApmEvent.LIZLLL(longValue, str, (String) ListProtector.get(LJLJJL, 1), Boolean.parseBoolean((String) ListProtector.get(LJLJJL, 0))));
                }
            }
        }
    }

    public static void LJ(String str, String str2, C66085Pwf c66085Pwf, long j) {
        ConcurrentHashMap<String, Runnable> concurrentHashMap = LJFF;
        if (concurrentHashMap.containsKey(str)) {
            HandlerThreadC64418PPy.LIZ();
            Handler handler = HandlerThreadC64418PPy.LJLJJI;
            Runnable runnable = concurrentHashMap.get(str);
            o.LJI(runnable);
            handler.removeCallbacks(runnable);
        }
        concurrentHashMap.put(str, new ARunnableS4S2100000_11(c66085Pwf, str, str2, 6));
        HandlerThreadC64418PPy.LIZ();
        Handler handler2 = HandlerThreadC64418PPy.LJLJJI;
        Runnable runnable2 = concurrentHashMap.get(str);
        o.LJI(runnable2);
        handler2.postDelayed(runnable2, j);
    }
}
