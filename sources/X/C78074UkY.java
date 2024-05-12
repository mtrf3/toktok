package X;

import Y.ARunnableS37S0100000_1;
import Y.ARunnableS8S0310000_13;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayNewSortSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ujb.o;

/* renamed from: X.UkY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78074UkY {
    public static final AbstractC73946T0k LIZ = C73969T1h.LIZIZ();
    public static final C73318Sq2 LIZIZ = new C73318Sq2();

    public static void LIZ(List list, boolean z, C78072UkW c78072UkW) {
        EnumC78099Ukx enumC78099Ukx;
        EnumC53652L3w enumC53652L3w;
        boolean z2 = c78072UkW.LJJJJJL;
        boolean z3 = c78072UkW.LJJJJL;
        if (C78084Uki.LJFF()) {
            if (o.LJJJJIZL(C78084Uki.LIZJ(z2, z3)._msgEnqueueConfig.sortType, "time", true)) {
                enumC53652L3w = EnumC53652L3w.TIME;
            } else {
                enumC53652L3w = EnumC53652L3w.VALUE;
            }
        } else {
            if (z2) {
                enumC78099Ukx = EnumC78099Ukx.SELF;
            } else if (z3) {
                enumC78099Ukx = EnumC78099Ukx.ANCHOR;
            } else {
                enumC78099Ukx = EnumC78099Ukx.OTHER;
            }
            int i = C78100Uky.LIZ[enumC78099Ukx.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC53652L3w = EnumC53652L3w.VALUE;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    enumC53652L3w = EnumC53652L3w.VALUE;
                }
            } else {
                enumC53652L3w = EnumC53652L3w.TIME;
            }
        }
        int i2 = c78072UkW.LIZLLL;
        if (enumC53652L3w == EnumC53652L3w.VALUE) {
            int i3 = 0;
            if (GiftReceiveMsgThreadSetting.INSTANCE.getMultiThread()) {
                synchronized (list) {
                    if (LiveGiftTrayNewSortSettings.INSTANCE.getEnable() && !z) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!c78072UkW.LJFF((C78072UkW) it.next())) {
                                i3++;
                            } else {
                                if (i3 != -1) {
                                    list.add(i3, c78072UkW);
                                }
                                list.add(list.size(), c78072UkW);
                            }
                        }
                        list.add(list.size(), c78072UkW);
                    } else {
                        Iterator it2 = list.iterator();
                        i3 = 0;
                        while (it2.hasNext()) {
                            if (i2 <= ((C78072UkW) it2.next()).LIZLLL) {
                                i3++;
                            } else {
                                if (i3 != -1 && i3 <= list.size()) {
                                    list.add(i3, c78072UkW);
                                }
                                list.add(list.size(), c78072UkW);
                            }
                        }
                        list.add(list.size(), c78072UkW);
                    }
                }
                return;
            }
            if (LiveGiftTrayNewSortSettings.INSTANCE.getEnable() && !z) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (c78072UkW.LJFF((C78072UkW) it3.next())) {
                        if (i3 != -1) {
                            ListProtector.add(list, i3, c78072UkW);
                            return;
                        }
                        ListProtector.add(list, list.size(), c78072UkW);
                        return;
                    }
                    i3++;
                }
                ListProtector.add(list, list.size(), c78072UkW);
                return;
            }
            Iterator it4 = list.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if (i2 > ((C78072UkW) it4.next()).LIZLLL) {
                    if (i3 != -1 && i3 <= list.size()) {
                        ListProtector.add(list, i3, c78072UkW);
                        return;
                    }
                    ListProtector.add(list, list.size(), c78072UkW);
                    return;
                }
                i3++;
            }
            ListProtector.add(list, list.size(), c78072UkW);
            return;
        }
        if (GiftReceiveMsgThreadSetting.INSTANCE.getMultiThread()) {
            synchronized (list) {
                list.add(list.size(), c78072UkW);
            }
        } else {
            ListProtector.add(list, list.size(), c78072UkW);
        }
    }

    public static void LIZJ(C78072UkW c78072UkW, List list, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        long j;
        boolean z2 = c78072UkW.LJJJJJL;
        boolean z3 = c78072UkW.LJJJJL;
        if (C78084Uki.LJFF()) {
            j = C78084Uki.LIZJ(z2, z3)._receiveMsgConfig.delayEnqueueSec;
        } else {
            j = 0;
        }
        if (!C78084Uki.LJFF() || j == 0) {
            LIZ(list, z, c78072UkW);
            C32433Co9.LIZJ(c78072UkW, z);
            LIZ.LIZIZ(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 138));
            return;
        }
        LIZ.LIZJ(new ARunnableS8S0310000_13(list, c78072UkW, z, interfaceC65784Pro, 1), j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C78072UkW r5, java.util.List r6, java.util.HashSet r7, boolean r8, boolean r9, X.InterfaceC65784Pro r10) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78074UkY.LIZIZ(X.UkW, java.util.List, java.util.HashSet, boolean, boolean, X.Pro):void");
    }
}
