package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.ugc.android.editor.base.functions.DynamicBottomItem;
import com.ss.ugc.android.editor.base.functions.DynamicBottomOrderModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.53b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286353b {
    public static DynamicBottomOrderModel LIZIZ;
    public static final C1286353b LIZ = new C1286353b();
    public static final Gson LIZJ = new Gson();

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d A[Catch: all -> 0x017c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171 A[Catch: all -> 0x017c, LOOP:7: B:123:0x016b->B:125:0x0171, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[Catch: all -> 0x017c, LOOP:0: B:21:0x0046->B:23:0x004c, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[Catch: all -> 0x017c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: all -> 0x017c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7 A[Catch: all -> 0x017c, LOOP:3: B:59:0x00c1->B:61:0x00c7, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8 A[Catch: all -> 0x017c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x0019, B:17:0x0025, B:20:0x002d, B:21:0x0046, B:23:0x004c, B:25:0x0058, B:27:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x0074, B:38:0x0080, B:41:0x0086, B:48:0x009f, B:49:0x00a4, B:51:0x00ab, B:53:0x00b3, B:55:0x00b9, B:56:0x00bc, B:58:0x00bd, B:59:0x00c1, B:61:0x00c7, B:63:0x00ce, B:64:0x00d2, B:66:0x00d8, B:67:0x00e2, B:69:0x00e8, B:72:0x00fb, B:75:0x00ff, B:77:0x0105, B:103:0x0111, B:83:0x0116, B:85:0x011c, B:99:0x0128, B:91:0x012d, B:94:0x0133, B:111:0x013e, B:112:0x0147, B:114:0x014d, B:117:0x0158, B:122:0x015c, B:123:0x016b, B:125:0x0171), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<X.AnonymousClass523> LIZLLL(java.util.List<X.AnonymousClass523> r11) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1286353b.LIZLLL(java.util.List):java.util.List");
    }

    public static List LIZ(List list, DynamicBottomItem dynamicBottomItem, AnonymousClass523 anonymousClass523) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((AnonymousClass523) obj).LJ, dynamicBottomItem.getLeftTo())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AnonymousClass523 anonymousClass5232 = (AnonymousClass523) obj;
        List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(46), list);
        if (anonymousClass5232 != null) {
            int i = anonymousClass5232.LJIIJ;
            int i2 = anonymousClass523.LJIIJ;
            if (i < i2) {
                anonymousClass523.LJIIJ = i;
                while (i < i2) {
                    ((AnonymousClass523) ListProtector.get(LLILII, i)).LJIIJ++;
                    i++;
                }
            } else if (i > i2) {
                anonymousClass523.LJIIJ = i - 1;
                while (true) {
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                    AnonymousClass523 anonymousClass5233 = (AnonymousClass523) ListProtector.get(LLILII, i2);
                    anonymousClass5233.LJIIJ--;
                }
            }
            Iterator it2 = LLILII.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return ORZ.LLJILJILJ(LLILII);
    }

    public static List LIZIZ(int i, AnonymousClass523 anonymousClass523, List list) {
        int i2 = i - 1;
        if (i2 > list.size() - 1) {
            i2 = list.size() - 1;
        }
        int i3 = anonymousClass523.LJIIJ;
        List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(47), list);
        if (i3 > i2) {
            anonymousClass523.LJIIJ = i2;
            while (i2 < i3) {
                ((AnonymousClass523) ListProtector.get(LLILII, i2)).LJIIJ++;
                i2++;
            }
        } else if (i3 < i2) {
            anonymousClass523.LJIIJ = i2;
            int i4 = i2 + 1;
            for (int i5 = i3 + 1; i5 < i4; i5++) {
                AnonymousClass523 anonymousClass5232 = (AnonymousClass523) ListProtector.get(LLILII, i5);
                anonymousClass5232.LJIIJ--;
            }
        }
        Iterator it = LLILII.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return ORZ.LLJILJILJ(LLILII);
    }

    public static List LIZJ(List list, DynamicBottomItem dynamicBottomItem, AnonymousClass523 anonymousClass523) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((AnonymousClass523) obj).LJ, dynamicBottomItem.getRightTo())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AnonymousClass523 anonymousClass5232 = (AnonymousClass523) obj;
        List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(48), list);
        if (anonymousClass5232 != null) {
            int i = anonymousClass5232.LJIIJ;
            int i2 = anonymousClass523.LJIIJ;
            if (i < i2) {
                anonymousClass523.LJIIJ = i + 1;
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    ((AnonymousClass523) ListProtector.get(LLILII, i)).LJIIJ++;
                }
            } else if (i > i2) {
                anonymousClass523.LJIIJ = i;
                int i3 = i + 1;
                for (int i4 = i2 + 1; i4 < i3; i4++) {
                    AnonymousClass523 anonymousClass5233 = (AnonymousClass523) ListProtector.get(LLILII, i4);
                    anonymousClass5233.LJIIJ--;
                }
            }
            Iterator it2 = LLILII.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return ORZ.LLJILJILJ(LLILII);
    }
}
