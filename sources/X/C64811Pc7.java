package X;

import Y.IDHandlerS10S0000000_11;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.Pc7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64811Pc7 implements WeakHandler.IHandler {
    public static final ExecutorService LJZ;
    public static volatile C64811Pc7 LJZI;
    public static String LJZL;
    public static HandlerThread LL;
    public static WeakHandler LLD;
    public volatile String LJLJI;
    public final C64812Pc8 LJLLJ;
    public volatile InterfaceC64673PZt LJLLLL;
    public final AtomicBoolean LJLIL = new AtomicBoolean(true);
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public final ConcurrentSkipListSet<String> LJLJJI = new ConcurrentSkipListSet<>();
    public final ConcurrentMap<String, CopyOnWriteArrayList<String>> LJLJJL = new ConcurrentHashMap();
    public final ConcurrentSkipListSet<String> LJLJJLL = new ConcurrentSkipListSet<>();
    public final AtomicInteger LJLJL = new AtomicInteger(30);
    public final AtomicInteger LJLJLJ = new AtomicInteger(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    public final AtomicInteger LJLJLLL = new AtomicInteger(60);
    public final AtomicInteger LJLL = new AtomicInteger(0);
    public final AtomicInteger LJLLI = new AtomicInteger(5);
    public final AtomicInteger LJLLILLLL = new AtomicInteger(5);
    public final C48180IvY LJLLL = new C48180IvY();
    public boolean LJLLLLLL = false;
    public final IDHandlerS10S0000000_11 LJLZ = new IDHandlerS10S0000000_11(C16880lQ.LLJJJJ(), 0);

    static {
        C16880lQ.LJLLJ(C64811Pc7.class);
        LJZ = C16880lQ.LLLLZ(6);
    }

    public static C64811Pc7 LJ() {
        if (LJZI == null) {
            synchronized (C64811Pc7.class) {
                if (LJZI == null) {
                    LJZI = new C64811Pc7();
                }
            }
        }
        return LJZI;
    }

    public C64811Pc7() {
        Logger.debug();
        HandlerThread handlerThread = new HandlerThread("TTOK-HTTPDNS");
        LL = handlerThread;
        handlerThread.start();
        LLD = new WeakHandler(LL.getLooper(), this);
        LJZL = "4.2.152.11-tiktok";
        this.LJLLJ = new C64812Pc8(LLD);
    }

    public final synchronized void LIZIZ(EnumC64814PcA enumC64814PcA) {
        ConcurrentSkipListSet<String> concurrentSkipListSet;
        if (this.LJLLLL != null) {
            ((C64669PZp) this.LJLLLL).getClass();
            if (C36841Ed3.LIZJ(C64667PZn.LJIIL) && (concurrentSkipListSet = this.LJLJJLL) != null && concurrentSkipListSet.size() != 0 && this.LJLJJLL.size() <= 10) {
                Logger.debug();
                Iterator<String> it = this.LJLJJLL.iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!this.LJLLJ.LJFF(next)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
                Logger.debug();
                LJIIIIZZ(arrayList, enumC64814PcA, false);
            }
        }
    }

    public final C64815PcB LIZJ(String str) {
        Logger.debug();
        if (((ConcurrentHashMap) this.LJLJJL).containsKey(str)) {
            C64815PcB c64815PcB = new C64815PcB();
            Iterator it = ((CopyOnWriteArrayList) ((ConcurrentHashMap) this.LJLJJL).get(str)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (C36981EfJ.LIZIZ(str2)) {
                    c64815PcB.ipv6List.add(str2);
                } else if (C36981EfJ.LIZ(str2)) {
                    c64815PcB.ipv4List.add(str2);
                } else {
                    Logger.debug();
                }
            }
            c64815PcB.source = EnumC64610PXi.HARDCODE_IPS;
            return c64815PcB;
        }
        return null;
    }

    public final void LJII(JSONArray jSONArray) {
        if (jSONArray.length() > 0) {
            this.LJLJJI.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.LJLJJI.add(optString);
                }
            }
            this.LJLLLL.getClass();
            SharedPreferences.Editor edit = F9J.LIZIZ(C64667PZn.LJIIL, 0, "dispatchersdk_httpdns_hardcodeips").edit();
            edit.putString("httpdns_hardcodeips", String.valueOf(jSONArray));
            edit.apply();
        }
    }

    public final void LJIIIZ(C64816PcC c64816PcC) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c64816PcC.getHost());
        LJIIIIZZ(arrayList, EnumC64814PcA.CACHE_UNSET, false);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this;
        Bundle bundle = new Bundle();
        bundle.putSerializable("dns_timeout_job_key", c64816PcC);
        obtain.setData(bundle);
        LLD.sendMessageDelayed(obtain, this.LJLLI.get() * 1000);
    }

    public final synchronized Future<Void> LJIIJ(String str) {
        Future<Void> future = null;
        if (((ConcurrentHashMap) this.LJLLJ.LIZLLL).containsKey(str)) {
            Logger.debug();
            C64812Pc8 c64812Pc8 = this.LJLLJ;
            if (((ConcurrentHashMap) c64812Pc8.LIZLLL).containsKey(str)) {
                future = (Future) ((ConcurrentHashMap) c64812Pc8.LIZLLL).get(str);
            }
            return future;
        }
        Logger.debug();
        try {
            future = LJZ.submit(new CallableC48161IvF(str, this.LJLLJ, LLD));
            ((ConcurrentHashMap) this.LJLLJ.LIZLLL).put(str, future);
        } catch (RejectedExecutionException e) {
            C16880lQ.LLLLIIL(e);
        }
        return future;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C64812Pc8 c64812Pc8;
        C64813Pc9 LJ;
        Logger.debug();
        if (message != null) {
            Object obj = message.obj;
            if ((obj instanceof C64811Pc7) || (obj instanceof CallableC64810Pc6) || (obj instanceof CallableC48161IvF) || (obj instanceof C64813Pc9) || (obj instanceof C64812Pc8)) {
                if ((obj instanceof C64811Pc7) && message.what == 2) {
                    Logger.debug();
                    C64816PcC c64816PcC = (C64816PcC) message.getData().getSerializable("httpdns_timeout_job_key");
                    if (c64816PcC == null) {
                        Logger.debug();
                        return;
                    } else {
                        if (!this.LJLLJ.LJIIJ(c64816PcC)) {
                            return;
                        }
                        Logger.debug();
                        LIZ(c64816PcC, LJI(c64816PcC.getHost(), c64816PcC.isLocalDnsExpired()));
                        this.LJLLJ.LJIIIIZZ(c64816PcC);
                        return;
                    }
                }
                if ((obj instanceof CallableC64810Pc6) && message.what == 3) {
                    Logger.debug();
                    ArrayList<String> stringArrayList = message.getData().getStringArrayList("httpdns_completed_hosts");
                    if (stringArrayList == null) {
                        Logger.debug();
                        return;
                    }
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (((ConcurrentHashMap) this.LJLLJ.LJ).containsKey(next)) {
                            Logger.debug();
                            Iterator it2 = ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJLLJ.LJ).get(next)).iterator();
                            while (it2.hasNext()) {
                                C64816PcC c64816PcC2 = (C64816PcC) it2.next();
                                C64815PcB LJFF = LJFF(next, true);
                                if (LJ().LJLILLLLZI.get() && LJFF == null) {
                                    LJFF = LJI(next, c64816PcC2.isLocalDnsExpired());
                                }
                                Logger.debug();
                                LIZ(c64816PcC2, LJFF);
                                this.LJLLJ.LJIIIIZZ(c64816PcC2);
                            }
                        }
                    }
                    return;
                }
                if ((obj instanceof CallableC48161IvF) && message.what == 1) {
                    Logger.debug();
                    String string = message.getData().getString("localdns_completed_host");
                    if (string == null) {
                        Logger.debug();
                        return;
                    }
                    if (!((ConcurrentHashMap) this.LJLLJ.LJFF).containsKey(string)) {
                        return;
                    }
                    Logger.debug();
                    Iterator it3 = ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJLLJ.LJFF).get(string)).iterator();
                    while (it3.hasNext()) {
                        C64816PcC c64816PcC3 = (C64816PcC) it3.next();
                        C64815PcB LJI = LJI(string, true);
                        if (LJI == null) {
                            C64815PcB LJFF2 = LJFF(string, false);
                            if (LJFF2 == null) {
                                LJIIIZ(c64816PcC3);
                                this.LJLLJ.LIZ(c64816PcC3.getHost(), c64816PcC3);
                            } else {
                                LIZ(c64816PcC3, LJFF2);
                            }
                        } else {
                            Logger.debug();
                            LIZ(c64816PcC3, LJI);
                        }
                        this.LJLLJ.LJIIIZ(c64816PcC3);
                    }
                    return;
                }
                if ((obj instanceof C64811Pc7) && message.what == 3) {
                    Logger.debug();
                    C64816PcC c64816PcC4 = (C64816PcC) message.getData().getSerializable("dns_timeout_job_key");
                    if (c64816PcC4 == null) {
                        Logger.debug();
                        return;
                    }
                    C64812Pc8 c64812Pc82 = this.LJLLJ;
                    if (!((ConcurrentHashMap) c64812Pc82.LJFF).containsKey(c64816PcC4.getHost())) {
                        return;
                    }
                    if (!((ConcurrentSkipListSet) ((ConcurrentHashMap) c64812Pc82.LJFF).get(c64816PcC4.getHost())).contains(c64816PcC4)) {
                        return;
                    }
                    Logger.debug();
                    C64815PcB LJFF3 = LJFF(c64816PcC4.getHost(), false);
                    if (LJFF3 != null) {
                        LIZ(c64816PcC4, LJFF3);
                    } else {
                        if (!this.LJLLJ.LJFF(c64816PcC4.getHost())) {
                            LJIIIZ(c64816PcC4);
                        }
                        this.LJLLJ.LIZ(c64816PcC4.getHost(), c64816PcC4);
                    }
                    this.LJLLJ.LJIIIZ(c64816PcC4);
                    return;
                }
                if ((obj instanceof C64811Pc7) && message.what == 4) {
                    Logger.debug();
                    C64816PcC c64816PcC5 = (C64816PcC) message.getData().getSerializable("dns_timeout_job_key");
                    if (c64816PcC5 == null) {
                        Logger.debug();
                        return;
                    } else {
                        if (!this.LJLLJ.LJIIJ(c64816PcC5)) {
                            return;
                        }
                        LIZ(c64816PcC5, null);
                        this.LJLLJ.LJIIIIZZ(c64816PcC5);
                        return;
                    }
                }
                if ((obj instanceof C64811Pc7) && message.what == 5) {
                    Logger.debug();
                    ((C64669PZp) this.LJLLLL).getClass();
                    String string2 = F9J.LIZIZ(C64667PZn.LJIIL, 0, "dispatchersdk_httpdns_hardcodeips").getString("httpdns_hardcodeips", "");
                    if (!TextUtils.isEmpty(string2)) {
                        this.LJLJJI.clear();
                        try {
                            JSONArray jSONArray = new JSONArray(string2);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String optString = jSONArray.optString(i);
                                if (!TextUtils.isEmpty(optString)) {
                                    this.LJLJJI.add(optString);
                                }
                            }
                            return;
                        } catch (JSONException unused) {
                            Logger.debug();
                            return;
                        }
                    }
                    ((C64669PZp) this.LJLLLL).getClass();
                    if (C64667PZn.LJIIJJI == null || this.LJLJJI.size() != 0) {
                        return;
                    }
                    ConcurrentSkipListSet<String> concurrentSkipListSet = this.LJLJJI;
                    ((C64669PZp) this.LJLLLL).getClass();
                    concurrentSkipListSet.addAll(Arrays.asList(C64667PZn.LJIIJJI));
                    return;
                }
                if ((obj instanceof C64811Pc7) && message.what == 6) {
                    Logger.debug();
                    C64812Pc8 c64812Pc83 = this.LJLLJ;
                    ((C64669PZp) LJ().LJLLLL).getClass();
                    c64812Pc83.LJI(C64667PZn.LJIIL);
                    return;
                }
                if ((obj instanceof C64811Pc7) && message.what == 7) {
                    Logger.debug();
                    try {
                        LJZ.submit(new CallableC64617PXp());
                        return;
                    } catch (RejectedExecutionException e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                if (obj instanceof C64813Pc9) {
                    String string3 = message.getData().getString("dnsrecord_host");
                    if (TextUtils.isEmpty(string3)) {
                        Logger.debug();
                        return;
                    }
                    switch (message.what) {
                        case 10:
                            Logger.debug();
                            C64811Pc7 LJ2 = LJ();
                            LJ2.getClass();
                            if (!C770130n.LIZ(string3) || LJ2.LJLLJ.LJFF(string3) || !LJ2.LJLILLLLZI.get()) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string3);
                            LJ2.LJIIIIZZ(arrayList, EnumC64814PcA.CACHE_STALE_EXPIRED, false);
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            Logger.debug();
                            C64811Pc7 LJ3 = LJ();
                            LJ3.getClass();
                            Logger.debug();
                            if (!C770130n.LIZ(string3) || (LJ = (c64812Pc8 = LJ3.LJLLJ).LJ(string3)) == null) {
                                return;
                            }
                            LJ.LJFF.removeMessages(11);
                            ((ConcurrentHashMap) c64812Pc8.LIZIZ).remove(string3);
                            return;
                        case 12:
                            Logger.debug();
                            C64812Pc8 c64812Pc84 = LJ().LJLLJ;
                            c64812Pc84.LJI.add(string3);
                            if (c64812Pc84.LJI.size() < 10) {
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(c64812Pc84.LJI);
                            C64811Pc7 LJ4 = LJ();
                            LJ4.getClass();
                            Logger.debug();
                            LJ4.LJIIIIZZ(arrayList2, EnumC64814PcA.REFRESH_BATCH, false);
                            return;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            Logger.debug();
                            C64811Pc7 LJ5 = LJ();
                            LJ5.getClass();
                            if (!C770130n.LIZ(string3) || LJ5.LJLLJ.LJFF(string3)) {
                                return;
                            }
                            LJ5.LJLLJ.LJII(string3);
                            return;
                        default:
                            return;
                    }
                }
                if ((obj instanceof C64812Pc8) && message.what == 20) {
                    Logger.debug();
                    this.LJLLJ.LJIIIIZZ.set(0);
                } else {
                    Logger.debug();
                }
            }
        }
    }

    public final void LIZ(C64816PcC c64816PcC, C64815PcB c64815PcB) {
        Logger.debug();
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("callback_dnsresult_job_key", c64816PcC);
        bundle.putSerializable("callback_dnsresult_key", c64815PcB);
        obtain.setData(bundle);
        this.LJLZ.sendMessage(obtain);
    }

    public final C64815PcB LIZLLL(String str, boolean z) {
        Future<Void> LJIIIIZZ;
        C64815PcB c64815PcB = null;
        if (z) {
            return null;
        }
        if (this.LJLLJ.LJFF(str)) {
            LJIIIIZZ = this.LJLLJ.LIZLLL(str);
        } else {
            LJIIIIZZ = LJIIIIZZ(C05040Hs.LIZIZ(str), EnumC64814PcA.CACHE_UNSET, true);
        }
        if (LJIIIIZZ == null) {
            return null;
        }
        if (LJIIIIZZ.isDone()) {
            return LJFF(str, true);
        }
        try {
            LJIIIIZZ.get(this.LJLLI.get() * 1000, TimeUnit.MILLISECONDS);
            c64815PcB = LJFF(str, true);
            return c64815PcB;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return c64815PcB;
        }
    }

    public final C64815PcB LJFF(String str, boolean z) {
        Logger.debug();
        C64813Pc9 LIZJ = this.LJLLJ.LIZJ(str);
        if (LIZJ == null) {
            return null;
        }
        C64815PcB c64815PcB = new C64815PcB();
        c64815PcB.ipv4List = LIZJ.LIZIZ;
        c64815PcB.ipv6List = LIZJ.LIZJ;
        if (z) {
            if ((LIZJ.LIZLLL * 1000) + LIZJ.LJ <= System.currentTimeMillis()) {
                return null;
            }
            c64815PcB.source = EnumC64610PXi.HTTPDNS_REQUEST;
            return c64815PcB;
        }
        if ((LIZJ.LIZLLL * 1000) + LIZJ.LJ > System.currentTimeMillis()) {
            c64815PcB.source = EnumC64610PXi.HTTPDNS_CACHE;
        } else {
            c64815PcB.source = EnumC64610PXi.HTTPDNS_STALE_CACHE;
        }
        return c64815PcB;
    }

    public final C64815PcB LJI(String str, boolean z) {
        Logger.debug();
        C64815PcB c64815PcB = new C64815PcB();
        C64813Pc9 LJ = this.LJLLJ.LJ(str);
        if (LJ == null) {
            return null;
        }
        c64815PcB.ipv4List = LJ.LIZIZ;
        c64815PcB.ipv6List = LJ.LIZJ;
        if (z) {
            c64815PcB.source = EnumC64610PXi.LOCALDNS_REQUEST;
        } else {
            c64815PcB.source = EnumC64610PXi.LOCALDNS_CACHE;
        }
        return c64815PcB;
    }

    public final synchronized Future<Void> LJIIIIZZ(List<String> list, EnumC64814PcA enumC64814PcA, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        Future<Void> future = null;
        if (arrayList.size() == 0) {
            Logger.debug();
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (this.LJLLJ.LJFF((String) ListProtector.get(list, i))) {
                if (z && arrayList.size() == 1 && i == 0) {
                    future = this.LJLLJ.LIZLLL((String) ListProtector.get(list, i));
                    Logger.debug();
                }
                arrayList.remove(ListProtector.get(list, i));
            }
        }
        if (arrayList.size() == 0) {
            return future;
        }
        Logger.debug();
        try {
            future = LJZ.submit(new CallableC64810Pc6(C770130n.LIZIZ(list), LJZL, this.LJLLJ, enumC64814PcA, LLD));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ((ConcurrentHashMap) this.LJLLJ.LIZJ).put(str, future);
                if (this.LJLILLLLZI.get()) {
                    C64812Pc8 c64812Pc8 = this.LJLLJ;
                    if (c64812Pc8.LJI.contains(str)) {
                        c64812Pc8.LJI.remove(str);
                    }
                }
            }
        } catch (RejectedExecutionException e) {
            C16880lQ.LLLLIIL(e);
            Logger.debug();
        }
        return future;
    }
}
