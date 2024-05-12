package X;

import java.util.Observer;

/* renamed from: X.PzW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66262PzW implements Observer {
    public static final C66262PzW LIZ = new C66262PzW();

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[LOOP:0: B:27:0x0079->B:29:0x007f, LOOP_END] */
    @Override // java.util.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(java.util.Observable r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C64707PaR
            if (r0 == 0) goto Laf
            java.lang.String r0 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }"
            kotlin.jvm.internal.o.LJII(r10, r0)
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.String r0 = "store_idc"
            java.lang.Object r6 = r10.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "store_region"
            java.lang.Object r5 = r10.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "region_source"
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "sec_uid"
            java.lang.Object r4 = r10.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "logid"
            java.lang.Object r7 = r10.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            if (r1 == 0) goto L55
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            if (r2 == 0) goto L55
            int r1 = r2.hashCode()
            r0 = 99455(0x1847f, float:1.39366E-40)
            if (r1 == r0) goto La3
            r0 = 115792(0x1c450, float:1.62259E-40)
            if (r1 == r0) goto L97
            r0 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r1 == r0) goto L8b
        L55:
            X.Pzc r3 = X.EnumC66268Pzc.NONE
        L57:
            X.PzA r2 = new X.PzA
            java.lang.String r1 = ""
            if (r6 != 0) goto L5e
            r6 = r1
        L5e:
            if (r5 != 0) goto L61
            r5 = r1
        L61:
            X.MeP r0 = new X.MeP
            if (r4 != 0) goto L66
            r4 = r1
        L66:
            if (r7 != 0) goto L69
            r7 = r1
        L69:
            r0.<init>(r4, r7)
            r2.<init>(r6, r5, r3, r0)
            X.PzA r3 = X.C66260PzU.LIZ
            X.C66260PzU.LIZ = r2
            java.util.List<X.Pzd> r0 = X.C66260PzU.LIZIZ
            java.util.Iterator r2 = r0.iterator()
        L79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r1 = r2.next()
            X.Pzd r1 = (X.InterfaceC66269Pzd) r1
            X.PzA r0 = X.C66260PzU.LIZ
            r1.LIZ(r3, r0)
            goto L79
        L8b:
            java.lang.String r0 = "local"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L94
            goto L55
        L94:
            X.Pzc r3 = X.EnumC66268Pzc.LOCAL
            goto L57
        L97:
            java.lang.String r0 = "uid"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La0
            goto L55
        La0:
            X.Pzc r3 = X.EnumC66268Pzc.UID
            goto L57
        La3:
            java.lang.String r0 = "did"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lac
            goto L55
        Lac:
            X.Pzc r3 = X.EnumC66268Pzc.DID
            goto L57
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66262PzW.update(java.util.Observable, java.lang.Object):void");
    }
}
