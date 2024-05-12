package X;

import Y.IDComparatorS28S0000000;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12920f2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final float LJFF(int i, int i2, int i3) {
        if (i3 == 0) {
            return 0.0f;
        }
        return (i3 * 1.0f) / (i - i2);
    }

    public static List LJII(List list) {
        ArrayList LJ = C61328O5c.LJ(list);
        if (LJ.size() > 1) {
            C40675Fxn.LJJLIIIJ(LJ, new IDComparatorS28S0000000(12));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = LJ.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C12930f3 c12930f3 = (C12930f3) next;
            if (c12930f3.LJII) {
                long j = c12930f3.LJ;
                Long LIZJ = InterfaceC30442Bx8.LLLZLZ.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_FILTER_CHANGE_TIME.value");
                if (j >= LIZJ.longValue()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public static List LJIIIIZZ(List list) {
        ArrayList LJ = C61328O5c.LJ(list);
        if (LJ.size() > 1) {
            C40675Fxn.LJJLIIIJ(LJ, new IDComparatorS28S0000000(13));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = LJ.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C12930f3 c12930f3 = (C12930f3) next;
            if (c12930f3.LJII) {
                long j = c12930f3.LJ;
                Long LIZJ = InterfaceC30442Bx8.LLLZLZ.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_FILTER_CHANGE_TIME.value");
                if (j < LIZJ.longValue()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public static String[] LJIIJ(C12930f3 c12930f3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) c12930f3.LJI).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C12940f4) next).LIZIZ != null) {
                if (next != null) {
                    List<C12940f4> list = c12930f3.LJI;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((C12940f4) next2).LIZIZ != null) {
                            arrayList2.add(next2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        C12940f4 c12940f4 = (C12940f4) it3.next();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(c12930f3.LIZJ);
                        LIZ2.append(':');
                        LIZ2.append(c12940f4.LIZ);
                        LIZ2.append(':');
                        LIZ2.append(c12940f4.LIZIZ);
                        arrayList.add(X1D.LIZIZ(LIZ2));
                    }
                }
            }
        }
        arrayList.add(c12930f3.LIZJ);
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static List LJIIJJI(List composerNodeList) {
        o.LJIIIZ(composerNodeList, "composerNodeList");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(composerNodeList);
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS28S0000000(15));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C12930f3) next).LJII) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final int LIZ(LiveEffect.ComposerConfig composerConfig, float f) {
        int i;
        float f2;
        float f3;
        int i2;
        if (f == 0.0f) {
            return 0;
        }
        if (composerConfig != null) {
            i = composerConfig.LIZJ;
            i2 = composerConfig.LIZLLL;
            f2 = composerConfig.LJ;
            f3 = composerConfig.LJFF;
            if (i2 < 0) {
                if (f > 0.0f) {
                    if (f2 == 0.0f) {
                        return 0;
                    }
                    if (f > f2) {
                        f = f2;
                    }
                    return C29306Beo.LJJLIIJ((f / f2) * i);
                }
                if (f < f3) {
                    f = f3;
                }
                return C29306Beo.LJJLIIJ((f / f3) * i2);
            }
            if (f2 == f3) {
                return 0;
            }
        } else {
            i = 100;
            f2 = 1.0f;
            f3 = 0.0f;
            i2 = 0;
        }
        if (f > f2) {
            f = f2;
        } else if (f < f3) {
            f = f3;
        }
        return C29306Beo.LJJLIIJ((f / (f2 - f3)) * (i - i2));
    }

    public static final int LIZIZ(LiveEffect liveEffect, float f) {
        o.LJIIIZ(liveEffect, "liveEffect");
        return LIZ(liveEffect.getSmallItemConfig(), f);
    }

    public static final float LIZJ(LiveEffect.ComposerConfig composerConfig, int i) {
        float f;
        int i2;
        int i3;
        float f2;
        if (i == 0) {
            return 0.0f;
        }
        if (composerConfig != null) {
            i2 = composerConfig.LIZJ;
            i3 = composerConfig.LIZLLL;
            f2 = composerConfig.LJ;
            f = composerConfig.LJFF;
            if (i3 < 0) {
                if (i > 0) {
                    return (i / i2) * f2;
                }
                return f * (i / i3);
            }
        } else {
            f = 0.0f;
            i2 = 100;
            i3 = 0;
            f2 = 1.0f;
        }
        return (f2 - f) * ((i * 1.0f) / (i2 - i3));
    }

    public static final float LIZLLL(LiveEffect liveEffect, int i) {
        o.LJIIIZ(liveEffect, "liveEffect");
        return LIZJ(liveEffect.getSmallItemConfig(), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r0 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] LJI(java.lang.String[] r10, java.util.Map r11) {
        /*
            java.lang.String r0 = "allSticker"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "pathList"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = r10.length
            r6.<init>(r0)
            int r7 = r10.length
            r5 = 0
            r4 = 0
        L13:
            if (r4 >= r7) goto L61
            r8 = r10[r4]
            r0 = r11
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r9 = r0.iterator()
        L22:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r9.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L32:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r1
            java.lang.String r0 = r1.unzipPath
            boolean r0 = X.C29306Beo.LJIJJLI(r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = r1.unzipPath
            boolean r0 = ujb.o.LJJJLIIL(r8, r0, r5)
            if (r0 == 0) goto L32
        L4f:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2
            if (r2 == 0) goto L22
            java.lang.String r0 = r2.extra
            if (r0 != 0) goto L59
        L57:
            java.lang.String r0 = ""
        L59:
            r6.add(r0)
            int r4 = r4 + 1
            goto L13
        L5f:
            r2 = 0
            goto L4f
        L61:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r3 = r6.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "effect extra list:"
            r2.append(r0)
            java.lang.String r1 = java.util.Arrays.toString(r3)
            java.lang.String r0 = "toString(this)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "LiveComposerUtils"
            X.C0NB.LIZIZ(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12920f2.LJI(java.lang.String[], java.util.Map):java.lang.String[]");
    }

    public static String[] LJIIIZ(List composerNodeList, boolean z) {
        o.LJIIIZ(composerNodeList, "composerNodeList");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(composerNodeList);
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS28S0000000(14));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C12930f3) next).LJII) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            C12930f3 c12930f3 = (C12930f3) it2.next();
            Iterator it3 = ((ArrayList) c12930f3.LJI).iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                C12940f4 c12940f4 = (C12940f4) next2;
                if (z || c12940f4.LIZIZ != null) {
                    if (next2 != null) {
                        List<C12940f4> list = c12930f3.LJI;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = ((ArrayList) list).iterator();
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            C12940f4 c12940f42 = (C12940f4) next3;
                            if (z || c12940f42.LIZIZ != null) {
                                arrayList4.add(next3);
                            }
                        }
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            C12940f4 c12940f43 = (C12940f4) it5.next();
                            if (z) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(c12930f3.LIZJ);
                                LIZ2.append(':');
                                LIZ2.append(c12940f43.LIZ);
                                LIZ2.append(":0");
                                arrayList2.add(X1D.LIZIZ(LIZ2));
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(c12930f3.LIZJ);
                                LIZ3.append(':');
                                LIZ3.append(c12940f43.LIZ);
                                LIZ3.append(':');
                                LIZ3.append(c12940f43.LIZIZ);
                                arrayList2.add(X1D.LIZIZ(LIZ3));
                            }
                        }
                    } else {
                        arrayList2.add(c12930f3.LIZJ);
                    }
                }
            }
            arrayList2.add(c12930f3.LIZJ);
        }
        C0NB.LIZIZ("LiveComposerManagerB", arrayList2.toString());
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static final int LJ(float f, int i, int i2) {
        if (f == 0.0f) {
            return 0;
        }
        return C29306Beo.LJJLIIJ(f * (i - i2));
    }
}
