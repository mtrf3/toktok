package X;

import Y.IDComparatorS335S0100000_2;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tools.net.WeakNetSortRule;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.TJx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74453TJx {
    public static final List LIZIZ(String str, List list, InterfaceC88472Yns interfaceC88472Yns) {
        List LLJILJILJ;
        o.LJIIIZ(list, "list");
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (c74216TAu.LIZIZ() && !c74216TAu.LJIIIZ() && !list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            WeakNetSortRule LJ = c74216TAu.LJ();
            int sortCategory = LJ.getSortCategory();
            if (sortCategory != 1) {
                if (sortCategory == 2) {
                    boolean sortCover = LJ.getSortCover();
                    C132855Jh c132855Jh = C132855Jh.LJLIL;
                    if (C65777Prh.LJI(list)) {
                        LLJILJILJ = list;
                    } else {
                        LLJILJILJ = ORZ.LLJILJILJ(list);
                    }
                    C110574Vp LJJJJLL = OJ4.LJJJJLL(ORZ.LJLIIIL(list), new AqS45S0110000_2(c132855Jh, sortCover, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C113554cx.LJJLIIJ(linkedHashMap, LJJJJLL);
                    java.util.Map LJJLIIIJ = C113554cx.LJJLIIIJ(linkedHashMap);
                    if (LLJILJILJ.size() > 1) {
                        C40675Fxn.LJJLIIIJ(LLJILJILJ, new IDComparatorS335S0100000_2(LJJLIIIJ, 1));
                    }
                    list = LLJILJILJ;
                }
            } else {
                int minNeededCount = LJ.getMinNeededCount();
                int min = Math.min(LJ.getMaxSortCount(), list.size());
                int min2 = Math.min(minNeededCount, list.size());
                if (min > 0 && min2 > 0 && !list.isEmpty()) {
                    if (!C65777Prh.LJI(list)) {
                        list = ORZ.LLJILJILJ(list);
                    }
                    HashSet hashSet = new HashSet(min, 1.0f);
                    LinkedList linkedList = new LinkedList();
                    int i = 0;
                    int i2 = -1;
                    int i3 = 0;
                    int i4 = 0;
                    do {
                        if (((Boolean) interfaceC88472Yns.invoke(ListProtector.get(list, i3))).booleanValue()) {
                            i4++;
                            hashSet.add(Integer.valueOf(i3));
                            linkedList.addLast(ListProtector.get(list, i3));
                            i2 = i3;
                        }
                        if (i4 >= min2) {
                            break;
                        }
                        i3++;
                    } while (i3 < min);
                    if (i2 > 0) {
                        while (true) {
                            Object obj = ListProtector.get(list, i);
                            Object removeFirst = linkedList.removeFirst();
                            o.LJIIIIZZ(removeFirst, "cacheQueue.removeFirst()");
                            ListProtector.set(list, i, removeFirst);
                            if (!hashSet.contains(Integer.valueOf(i))) {
                                linkedList.addLast(obj);
                            }
                            if (i == i2) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            InterfaceC82230WPa interfaceC82230WPa = WPZ.LIZ;
            if (interfaceC82230WPa != null) {
                interfaceC82230WPa.LIZ(currentTimeMillis2, str);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> LIZ(LiveData<T> delayReturnWhenError, InterfaceC70422pa scope, InterfaceC88472Yns<? super T, Boolean> isError, InterfaceC88472Yns<? super T, Boolean> isLoading) {
        o.LJIIIZ(delayReturnWhenError, "$this$delayReturnWhenError");
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(isError, "isError");
        o.LJIIIZ(isLoading, "isLoading");
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (!c74216TAu.LIZIZ() || c74216TAu.LIZLLL() <= 0) {
            return delayReturnWhenError;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = delayReturnWhenError;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource((LiveData) c68322mC.element, new C36134EGc(isError, mediatorLiveData, scope, c68322mC, isLoading));
        return mediatorLiveData;
    }
}
