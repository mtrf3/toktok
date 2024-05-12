package com.bytedance.liko.leakdetector.strategy.fd;

import X.C32I;
import X.C39596FgO;
import X.C39598FgQ;
import X.C39599FgR;
import X.C61878OQg;
import X.C64882ge;
import X.C72972SkS;
import X.InterfaceC39600FgS;
import X.ORZ;
import X.X1D;
import Y.IDComparatorS334S0100000_1;
import Y.IDComparatorS339S0100000_6;
import Y.IDHandlerS7S0000000_6;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class FdLeakDetector {
    public static Handler handler;
    public static volatile boolean hasInstalled;
    public static final FdLeakDetector INSTANCE = new FdLeakDetector();
    public static final HandlerThread handlerThread = new HandlerThread("FdLeakThread");

    public final void dumpFdAndReport() {
        List<String> list;
        if (!C39598FgQ.LIZ) {
            return;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(Process.myPid());
            LIZ.append("/fd");
            list = C64882ge.LIZ(new File(X1D.LIZIZ(LIZ)));
        } catch (Throwable unused) {
            list = C61878OQg.INSTANCE;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("found ");
        LIZ2.append(list.size());
        LIZ2.append(" fd");
        C39596FgO.LIZ(X1D.LIZIZ(LIZ2));
        parse(list);
    }

    public final void install() {
        if (hasInstalled) {
            return;
        }
        HandlerThread handlerThread2 = handlerThread;
        handlerThread2.start();
        IDHandlerS7S0000000_6 iDHandlerS7S0000000_6 = new IDHandlerS7S0000000_6(handlerThread2.getLooper(), 0);
        handler = iDHandlerS7S0000000_6;
        iDHandlerS7S0000000_6.sendEmptyMessageDelayed(0, C39598FgQ.LIZLLL);
        hasInstalled = true;
    }

    private final void parse(List<String> list) {
        Object next;
        if (list.size() < C39598FgQ.LIZIZ && list.size() < C39598FgQ.LIZJ) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            linkedHashSet.add(str);
            String tag = INSTANCE.getTag(str);
            Integer num = (Integer) linkedHashMap.get(tag);
            if (num != null) {
                linkedHashMap.put(tag, Integer.valueOf(num.intValue() + 1));
            } else {
                linkedHashMap.put(tag, 1);
            }
            Integer num2 = (Integer) linkedHashMap2.get(str);
            if (num2 != null) {
                linkedHashMap2.put(str, Integer.valueOf(num2.intValue() + 1));
            } else {
                linkedHashMap2.put(str, 1);
            }
        }
        Iterator it = linkedHashMap2.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry<String, Integer> entry = (Map.Entry) next;
        if (entry != null && entry.getValue().intValue() >= C39598FgQ.LIZJ) {
            parseSingle(linkedHashSet, linkedHashMap2, entry);
        } else {
            if (list.size() < C39598FgQ.LIZIZ) {
                return;
            }
            parseTotal(list, linkedHashSet, linkedHashMap2, linkedHashMap);
        }
    }

    public final String getTag(String fd) {
        o.LJIIJ(fd, "fd");
        if (s.LJJJLZIJ(fd, ":", false)) {
            return (String) ListProtector.get(s.LJLJJL(fd, new String[]{":"}, 0, 6), 0);
        }
        if (!s.LJJJLZIJ(fd, "/", false)) {
            return fd;
        }
        String substring = fd.substring(0, s.LJJLIIJ(fd, "/", 6));
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    private final void report(List<String> list, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FdLeakWarning: ");
        LIZ.append(str);
        LIZ.append('\n');
        stringBuffer.append(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("at ");
        LIZ2.append(FdLeakDetector.class.getName());
        LIZ2.append(".INSTANCE (FdLeakDetector.java:0)\n");
        stringBuffer.append(X1D.LIZIZ(LIZ2));
        for (String str2 : list) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str2);
            LIZ3.append('\n');
            stringBuffer.append(X1D.LIZIZ(LIZ3));
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("start report \n");
        LIZ4.append(stringBuffer);
        C39596FgO.LIZ(X1D.LIZIZ(LIZ4));
        InterfaceC39600FgS interfaceC39600FgS = C39599FgR.LIZ;
        if (interfaceC39600FgS != null) {
            interfaceC39600FgS.LIZIZ(stringBuffer.toString());
        }
    }

    private final void parseSingle(Set<String> set, Map<String, Integer> map, Map.Entry<String, Integer> entry) {
        List<String> LLILII = ORZ.LLILII(new IDComparatorS334S0100000_1(map, 2), ORZ.LLJI(set));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
        for (String str : LLILII) {
            StringBuilder LJFF = C72972SkS.LJFF(str, '(');
            LJFF.append(map.get(str));
            LJFF.append(')');
            arrayList.add(X1D.LIZIZ(LJFF));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("found more than ");
        LIZ.append(C39598FgQ.LIZJ);
        LIZ.append(" fd(");
        LIZ.append(entry.getValue().intValue());
        LIZ.append(") by single count with max fd:");
        LIZ.append(entry.getKey());
        report(arrayList, X1D.LIZIZ(LIZ));
    }

    private final void parseTotal(List<String> list, Set<String> set, Map<String, Integer> map, Map<String, Integer> map2) {
        Map.Entry<String, Integer> next;
        List<String> LLILII = ORZ.LLILII(new IDComparatorS339S0100000_6(map2, 0), ORZ.LLJI(set));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
        for (String str : LLILII) {
            StringBuilder LJFF = C72972SkS.LJFF(str, '(');
            LJFF.append(map.get(str));
            LJFF.append(')');
            arrayList.add(X1D.LIZIZ(LJFF));
        }
        StringBuilder sb = new StringBuilder("found more than ");
        sb.append(C39598FgQ.LIZIZ);
        sb.append(" fd(");
        sb.append(list.size());
        sb.append(") by total count with max fd:");
        Iterator<Map.Entry<String, Integer>> it = map2.entrySet().iterator();
        String str2 = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int intValue = next.getValue().intValue();
                do {
                    Map.Entry<String, Integer> next2 = it.next();
                    int intValue2 = next2.getValue().intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry<String, Integer> entry = next;
        if (entry != null) {
            str2 = entry.getKey();
        }
        sb.append(str2);
        report(arrayList, sb.toString());
    }
}
