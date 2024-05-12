package X;

import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZsV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public enum EnumC91307ZsV {
    SEQUENCE,
    LIST_LOOP,
    SINGLE_LOOP,
    SHUFFLE;

    public static EnumC91307ZsV valueOf(String str) {
        return (EnumC91307ZsV) V0N.LJJJ(EnumC91307ZsV.class, str);
    }

    public final List<InterfaceC91296ZsK> getRealPlayableList(List<? extends InterfaceC91296ZsK> originPlayableList) {
        o.LJIIIZ(originPlayableList, "originPlayableList");
        ArrayList arrayList = new ArrayList();
        int i = C91306ZsU.LIZ[ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                arrayList.addAll(C47261Igj.LJJJIL(originPlayableList));
            }
        } else {
            arrayList.addAll(originPlayableList);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != 4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC91296ZsK> getFuturePlayableList(java.util.List<? extends X.InterfaceC91296ZsK> r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "realPlayableList"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r1 = X.C91306ZsU.LIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L43
            r0 = 2
            if (r1 == r0) goto L1f
            r0 = 3
            if (r1 == r0) goto L43
            r0 = 4
            if (r1 == r0) goto L43
        L1e:
            return r3
        L1f:
            int r2 = r6 + 1
            int r0 = r5.size()
            r1 = 0
            if (r2 >= r0) goto L3b
            int r0 = r5.size()
            java.util.List r0 = r5.subList(r2, r0)
            r3.addAll(r0)
            java.util.List r0 = r5.subList(r1, r6)
            r3.addAll(r0)
            goto L1e
        L3b:
            java.util.List r0 = r5.subList(r1, r6)
            r3.addAll(r0)
            goto L1e
        L43:
            int r1 = r6 + 1
            int r0 = r5.size()
            if (r1 >= r0) goto L1e
            int r0 = r5.size()
            java.util.List r0 = r5.subList(r1, r0)
            r3.addAll(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC91307ZsV.getFuturePlayableList(java.util.List, int):java.util.List");
    }

    public final InterfaceC91296ZsK getNext(List<? extends InterfaceC91296ZsK> realPlayableList, int i) {
        o.LJIIIZ(realPlayableList, "realPlayableList");
        int i2 = -1;
        while (i != i2) {
            if (i2 == -1) {
                i2 = i;
            }
            int i3 = C91306ZsU.LIZ[ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            continue;
                        }
                    } else {
                        ORZ.LJLLLLLL(i, realPlayableList);
                    }
                }
                i2++;
                if (i2 > C47261Igj.LJJI(realPlayableList)) {
                    i2 = 0;
                }
                InterfaceC91296ZsK interfaceC91296ZsK = (InterfaceC91296ZsK) ORZ.LJLLLLLL(i2, realPlayableList);
                if (interfaceC91296ZsK == null) {
                    return null;
                }
                if (!ExpiredPlayableManager.INSTANCE.isPlayableExpiredToday(interfaceC91296ZsK.getId())) {
                    return interfaceC91296ZsK;
                }
            } else {
                i2++;
                InterfaceC91296ZsK interfaceC91296ZsK2 = (InterfaceC91296ZsK) ORZ.LJLLLLLL(i2, realPlayableList);
                if (interfaceC91296ZsK2 == null) {
                    return null;
                }
                if (!interfaceC91296ZsK2.LJIILIIL() || (interfaceC91296ZsK2.LJIILIIL() && (!ActivityStack.isAppBackGround() || !ExpiredPlayableManager.INSTANCE.isPreviewPlayableExpiredToday(interfaceC91296ZsK2.getId())))) {
                    return interfaceC91296ZsK2;
                }
            }
        }
        return null;
    }

    public final InterfaceC91296ZsK getPre(List<? extends InterfaceC91296ZsK> realPlayableList, int i) {
        o.LJIIIZ(realPlayableList, "realPlayableList");
        int i2 = C91306ZsU.LIZ[ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new C162476Zf();
                    }
                } else {
                    return (InterfaceC91296ZsK) ORZ.LJLLLLLL(i, realPlayableList);
                }
            }
            int i3 = i - 1;
            if (i3 < 0) {
                i3 = C47261Igj.LJJI(realPlayableList);
            }
            return (InterfaceC91296ZsK) ORZ.LJLLLLLL(i3, realPlayableList);
        }
        return (InterfaceC91296ZsK) ORZ.LJLLLLLL(i - 1, realPlayableList);
    }
}
