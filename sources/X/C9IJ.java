package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.9IJ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IJ {
    public static boolean LIZ;
    public static final java.util.Map<C9IL, java.util.Set<String>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<C9IL, java.util.Set<String>> LIZJ = new LinkedHashMap();

    public static int LIZIZ(boolean z) {
        java.util.Map<C9IL, java.util.Set<String>> map;
        if (z) {
            map = LIZIZ;
        } else {
            map = LIZJ;
        }
        java.util.Set<String> set = map.get(C9IL.INTERACTION);
        if (set != null) {
            return set.size();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r8 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            java.lang.String r0 = "awemeId"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r2 = 1
            if (r8 == 0) goto L1e
            boolean r0 = X.C9IJ.LIZ
            if (r0 != 0) goto L14
            java.util.Map<X.9IL, java.util.Set<java.lang.String>> r0 = X.C9IJ.LIZIZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
        L14:
            X.C9IJ.LIZ = r2
            java.util.Map<X.9IL, java.util.Set<java.lang.String>> r0 = X.C9IJ.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
        L1d:
            return
        L1e:
            java.util.Map<X.9IL, java.util.Set<java.lang.String>> r0 = X.C9IJ.LIZJ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
        L26:
            java.util.Map<X.9IL, java.util.Set<java.lang.String>> r0 = X.C9IJ.LIZJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            goto L1d
        L2e:
            java.util.Map<X.9IL, java.util.Set<java.lang.String>> r0 = X.C9IJ.LIZJ
            goto L33
        L31:
            java.util.Map<X.9IL, java.util.Set<java.lang.String>> r0 = X.C9IJ.LIZIZ
        L33:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L3b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.Object r0 = r4.getKey()
            X.9IL r0 = (X.C9IL) r0
            int[] r1 = X.C9IK.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto Lb8
            r0 = 2
            if (r1 == r0) goto Lb5
            r0 = 3
            if (r1 == r0) goto Lb2
            r0 = 4
            if (r1 == r0) goto Laf
            r0 = 5
            if (r1 != r0) goto Lbf
            java.lang.String r1 = "tab_content"
        L6a:
            java.lang.Object r0 = r4.getValue()
            java.util.Set r0 = (java.util.Set) r0
            int r0 = r0.size()
            r3.LIZLLL(r0, r1)
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L81:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.LIZLLL(r2, r0)
            goto L81
        L91:
            java.lang.String r0 = "to_user_id"
            r3.LJI(r0, r6)
            if (r8 == 0) goto Lac
            java.lang.String r1 = "personal_homepage"
        L9a:
            java.lang.String r0 = "enter_from"
            r3.LJI(r0, r1)
            java.lang.String r0 = "group_id"
            r3.LJI(r0, r7)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "profile_info_collect"
            X.FMX.LJIIL(r0, r1)
            goto L3b
        Lac:
            java.lang.String r1 = "others_homepage"
            goto L9a
        Laf:
            java.lang.String r1 = "interaction_content"
            goto L6a
        Lb2:
            java.lang.String r1 = "bio_content"
            goto L6a
        Lb5:
            java.lang.String r1 = "cta_content"
            goto L6a
        Lb8:
            java.lang.String r1 = "nav_content"
            goto L6a
        Lbb:
            if (r8 == 0) goto L26
            goto L14
        Lbf:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9IJ.LIZ(java.lang.String, java.lang.String, boolean):void");
    }

    public static void LIZJ(boolean z, C9IL contentType, String infoCollectValue, boolean z2) {
        java.util.Map<C9IL, java.util.Set<String>> map;
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(infoCollectValue, "infoCollectValue");
        if (z) {
            map = LIZIZ;
        } else {
            map = LIZJ;
        }
        java.util.Set<String> set = map.get(contentType);
        if (set == null) {
            if (!z2) {
                return;
            }
            set = new LinkedHashSet<>();
            map.put(contentType, set);
        }
        if (z2) {
            set.add(infoCollectValue);
        } else {
            set.remove(infoCollectValue);
        }
    }
}
