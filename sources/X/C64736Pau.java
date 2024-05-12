package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.SsHttpCall;
import ee1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pau, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64736Pau implements InterfaceC64787Pbj {
    public static C64736Pau LJIIIZ;
    public final java.util.Map<EnumC64749Pb7, C64751Pb9> LIZ = new ConcurrentHashMap();
    public boolean LIZIZ = false;
    public boolean LIZJ = false;
    public int LIZLLL = 1000;
    public int LJ = 100;
    public java.util.Set<String> LJFF = new CopyOnWriteArraySet();
    public java.util.Map<String, Integer> LJI = new ConcurrentHashMap();
    public final java.util.Map<String, Integer> LJII = new ConcurrentHashMap();
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(0);

    public C64736Pau(Context context) {
        C16880lQ.LLLLL(context);
    }

    public static C64736Pau LIZJ(Context context) {
        if (LJIIIZ == null) {
            synchronized (C64736Pau.class) {
                if (LJIIIZ == null) {
                    C64736Pau c64736Pau = new C64736Pau(context);
                    LJIIIZ = c64736Pau;
                    SsHttpCall.setThrottleControl(c64736Pau);
                }
            }
        }
        return LJIIIZ;
    }

    public final int LIZ(String str) {
        int i = 0;
        if (this.LIZJ) {
            java.util.Map<String, Integer> map = this.LJI;
            if (map != null) {
                Iterator it = ((ConcurrentHashMap) map).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                        Integer num = (Integer) ((ConcurrentHashMap) this.LJI).get(str2);
                        if (num != null) {
                            i = num.intValue();
                        }
                    }
                }
            }
        } else if (C77357UXp.LJJIIJ(str, this.LJFF)) {
            i = this.LJ;
            if (i > 0) {
                this.LJIIIIZZ.incrementAndGet();
                ((ConcurrentHashMap) this.LJII).put(str, Integer.valueOf(i));
            }
        }
        return i;
    }

    public final void LIZLLL(EnumC64749Pb7 enumC64749Pb7) {
        C64751Pb9 c64751Pb9 = (C64751Pb9) ((ConcurrentHashMap) this.LIZ).get(enumC64749Pb7);
        synchronized (this) {
            this.LIZJ = false;
            ((ConcurrentHashMap) this.LJI).clear();
            this.LJ = 100;
            ((CopyOnWriteArraySet) this.LJFF).clear();
            this.LIZLLL = 1000;
            ((ConcurrentHashMap) this.LJII).clear();
            if (c64751Pb9 == null) {
                this.LIZIZ = false;
            } else if (!((CopyOnWriteArraySet) c64751Pb9.LIZIZ).isEmpty()) {
                this.LIZIZ = true;
                this.LJ = c64751Pb9.LIZLLL;
                this.LJFF = c64751Pb9.LIZIZ;
                this.LIZLLL = c64751Pb9.LJ;
            } else if (!((ConcurrentHashMap) c64751Pb9.LIZ).isEmpty()) {
                this.LIZIZ = true;
                this.LIZJ = true;
                this.LJI = c64751Pb9.LIZ;
                this.LIZLLL = c64751Pb9.LIZJ;
            }
        }
        C64770PbS.LIZIZ = enumC64749Pb7;
        if (enumC64749Pb7 == EnumC64749Pb7.ColdStart && this.LIZIZ) {
            C64793Pbp.LIZ(EnumC64792Pbo.NETWORK).LIZIZ(new C64768PbQ(this, this.LIZLLL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LIZIZ(String str, String str2) {
        EnumC64675PZv enumC64675PZv;
        String str3;
        int i;
        EnumC64750Pb8 enumC64750Pb8;
        l LJ = l.LJ();
        LJ.getClass();
        Logger.debug();
        if (!EZX.LIZ(str)) {
            Logger.debug();
            return 0;
        }
        LJ.LJI.readLock().lock();
        ArrayList arrayList = new ArrayList();
        ListProtector.add(arrayList, 0, 0);
        Iterator it = ((ArrayList) LJ.LJFF).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C48162IvG c48162IvG = (C48162IvG) it.next();
            Logger.debug();
            c48162IvG.getClass();
            Logger.debug();
            if (!c48162IvG.LIZJ() || TextUtils.isEmpty(str)) {
                ListProtector.set(arrayList, 0, 0);
                enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
            } else {
                android.net.Uri parse = UriProtector.parse(str);
                if (parse.getHost() == null || !c48162IvG.LIZLLL(parse)) {
                    enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
                } else if (((HashMap) c48162IvG.LJIIZILJ).isEmpty()) {
                    ListProtector.set(arrayList, 0, Integer.valueOf(c48162IvG.LJI()));
                    Logger.debug();
                    enumC64675PZv = EnumC64675PZv.DISPATCH_DELAY;
                } else if (!C64758PbG.LIZIZ.get()) {
                    Logger.debug();
                    enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
                } else {
                    if ("".equals(str2)) {
                        str3 = "s=0;p=0";
                    } else {
                        str3 = str2;
                    }
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    if (!C61694OJe.LIZIZ(str3, ";", arrayList2)) {
                        enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            hashMap.put(pair.first, pair.second);
                        }
                        EnumC64750Pb8 enumC64750Pb82 = EnumC64750Pb8.NormalStart;
                        String num = Integer.toString(enumC64750Pb82.getValue());
                        if (C64758PbG.LIZ != enumC64750Pb82) {
                            Logger.debug();
                            int i2 = C64763PbL.LIZ[C64758PbG.LIZ.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        enumC64750Pb8 = C64758PbG.LIZ;
                                    } else {
                                        long j = C64758PbG.LIZJ.get();
                                        if ((System.currentTimeMillis() / 1000) - j > C64758PbG.LJFF.get()) {
                                            C64758PbG.LIZ = enumC64750Pb82;
                                        }
                                        enumC64750Pb8 = C64758PbG.LIZ;
                                    }
                                } else {
                                    long j2 = C64758PbG.LIZJ.get();
                                    if ((System.currentTimeMillis() / 1000) - j2 > C64758PbG.LJ.get()) {
                                        C64758PbG.LIZ = enumC64750Pb82;
                                    }
                                    enumC64750Pb8 = C64758PbG.LIZ;
                                }
                            } else {
                                long j3 = C64758PbG.LIZJ.get();
                                if ((System.currentTimeMillis() / 1000) - j3 > C64758PbG.LIZLLL.get()) {
                                    C64758PbG.LIZ = enumC64750Pb82;
                                }
                                enumC64750Pb8 = C64758PbG.LIZ;
                            }
                            num = Integer.toString(enumC64750Pb8.getValue());
                        }
                        hashMap.put("s", num);
                        Context context = l.LJ().LIZ;
                        if (context != null) {
                            i = C36841Ed3.LIZJ(context);
                        } else {
                            i = 1;
                        }
                        hashMap.put("p", Integer.toString(i ^ 1));
                        Logger.debug();
                        enumC64675PZv = EnumC64675PZv.DISPATCH_DELAY;
                        Iterator it3 = ((HashMap) c48162IvG.LJIIZILJ).entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it3.next();
                            Object obj = hashMap.get(entry.getKey());
                            if (obj == null) {
                                enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
                                break;
                            }
                            if (!((java.util.Set) entry.getValue()).contains(obj)) {
                                enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
                                break;
                            }
                        }
                        if (enumC64675PZv == EnumC64675PZv.DISPATCH_DELAY) {
                            ListProtector.set(arrayList, 0, Integer.valueOf(c48162IvG.LJI()));
                        }
                        Logger.debug();
                    }
                }
            }
            if (enumC64675PZv == EnumC64675PZv.DISPATCH_DELAY) {
                Logger.debug();
                break;
            }
        }
        LJ.LJI.readLock().unlock();
        return ((Integer) ListProtector.get(arrayList, 0)).intValue();
    }
}
