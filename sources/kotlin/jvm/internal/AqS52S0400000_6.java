package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C36558EWk;
import X.C39982Fmc;
import X.C39984Fme;
import X.C40028FnM;
import X.C60254Nko;
import X.C61328O5c;
import X.C61881OQj;
import X.C76732zl;
import X.C76800UCe;
import X.EGQ;
import X.EnumC39958FmE;
import X.FCR;
import X.InterfaceC39983Fmd;
import X.InterfaceC60323Nlv;
import X.InterfaceC88472Yns;
import X.O1I;
import X.ORY;
import X.OSZ;
import X.X1D;
import android.net.Uri;
import com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class AqS52S0400000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS52S0400000_6 aqS52S0400000_6, Object obj) {
        OSZ item = (OSZ) obj;
        o.LJIIJ(item, "item");
        if (ORY.LJJIJ(C36558EWk.LIZLLL(item.getSecond()), (int[]) aqS52S0400000_6.l0)) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) ((Map.Entry) aqS52S0400000_6.l1).getKey());
        LIZ.append(" has wrong value.should be one of ");
        int[] iArr = (int[]) aqS52S0400000_6.l0;
        o.LJIIIZ(iArr, "<this>");
        LIZ.append(new C61881OQj(iArr));
        LIZ.append(" but got ");
        LIZ.append(aqS52S0400000_6.l2);
        throw new EGQ(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if ((r0 instanceof X.InterfaceC40934G4s) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS52S0400000_6 r4, java.lang.Object r5) {
        /*
            X.0eB r5 = (X.InterfaceC12390eB) r5
            java.lang.String r0 = "pageNode"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Object r0 = r4.l0
            X.2zl r0 = (X.C76732zl) r0
            int r1 = r0.element
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L12:
            return r0
        L13:
            java.lang.Object r3 = r4.l1
            X.2zl r3 = (X.C76732zl) r3
            int r1 = r3.element
            r0 = 5
            if (r1 != r0) goto L1f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L12
        L1f:
            r2 = 1
            int r0 = r1 + 1
            r3.element = r0
            X.0eD r0 = r5.LIZIZ()
            java.lang.String r0 = r0.LIZIZ
            java.lang.String r1 = X.C51029K0z.LJIIL(r0)
            java.lang.Object r0 = r4.l2
            com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService r0 = (com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService) r0
            X.Ol8 r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.ORZ.LJLJJI(r1, r0)
            if (r0 != 0) goto L4e
            java.lang.ref.WeakReference r0 = r5.getHost()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r0.get()
        L4a:
            boolean r0 = r0 instanceof X.InterfaceC40934G4s
            if (r0 == 0) goto L8b
        L4e:
            java.lang.Object r0 = r4.l2
            com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService r0 = (com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService) r0
            X.Ol8 r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.ORZ.LJLJJI(r1, r0)
            if (r0 == 0) goto L81
            X.G4q r0 = X.C40932G4q.LIZ
            r0.getClass()
            X.G4x r0 = X.C40932G4q.LIZ(r5)
            if (r0 == 0) goto L7c
            X.G4v r0 = r0.LJLIL
            if (r0 == 0) goto L7c
            java.util.concurrent.ConcurrentHashMap r1 = r0.LIZ()
            if (r1 == 0) goto L7c
            java.lang.Object r0 = r4.l3
            java.util.Map r0 = (java.util.Map) r0
            r0.putAll(r1)
        L7c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L12
        L81:
            java.lang.Object r1 = r4.l0
            X.2zl r1 = (X.C76732zl) r1
            int r0 = r1.element
            int r0 = r0 + 1
            r1.element = r0
        L8b:
            r2 = 0
            goto L7c
        L8d:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS52S0400000_6.invoke$1(kotlin.jvm.internal.AqS52S0400000_6, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS52S0400000_6 aqS52S0400000_6, Object obj) {
        O1I it = (O1I) obj;
        o.LJIIJ(it, "it");
        try {
            ((C39982Fmc) aqS52S0400000_6.l1).LIZJ = it.LIZIZ();
            InterfaceC39983Fmd interfaceC39983Fmd = (InterfaceC39983Fmd) aqS52S0400000_6.l2;
            if (interfaceC39983Fmd != null) {
                interfaceC39983Fmd.LIZ((C39982Fmc) aqS52S0400000_6.l1);
            }
        } catch (Throwable th) {
            InterfaceC60323Nlv interfaceC60323Nlv = ((C40028FnM) aqS52S0400000_6.l0).LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request ");
            interfaceC60323Nlv.printLog(C61328O5c.LIZLLL(LIZ, ((C39984Fme) aqS52S0400000_6.l3).LIZ, " failed, ", th, LIZ), EnumC39958FmE.E, "DefaultLynxRequestProvider");
            InterfaceC39983Fmd interfaceC39983Fmd2 = (InterfaceC39983Fmd) aqS52S0400000_6.l2;
            if (interfaceC39983Fmd2 != null) {
                interfaceC39983Fmd2.LIZIZ((C39982Fmc) aqS52S0400000_6.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS52S0400000_6 aqS52S0400000_6, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        InterfaceC60323Nlv interfaceC60323Nlv = ((C40028FnM) aqS52S0400000_6.l0).LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request ");
        interfaceC60323Nlv.printLog(C61328O5c.LIZLLL(LIZ, ((C39984Fme) aqS52S0400000_6.l1).LIZ, " failed, ", it, LIZ), EnumC39958FmE.E, "DefaultLynxRequestProvider");
        InterfaceC39983Fmd interfaceC39983Fmd = (InterfaceC39983Fmd) aqS52S0400000_6.l2;
        if (interfaceC39983Fmd != null) {
            interfaceC39983Fmd.LIZIZ((C39982Fmc) aqS52S0400000_6.l3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS52S0400000_6 aqS52S0400000_6, Object obj) {
        Uri uri = (Uri) obj;
        o.LJIIJ(uri, "uri");
        if (((Iterator) aqS52S0400000_6.l1).hasNext()) {
            C60254Nko c60254Nko = (C60254Nko) aqS52S0400000_6.l0;
            Iterator it = (Iterator) aqS52S0400000_6.l1;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS52S0400000_6.l2;
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) aqS52S0400000_6.l3;
            c60254Nko.getClass();
            try {
                ((FCR) it.next()).LIZJ(c60254Nko.LIZ, uri, new AqS52S0400000_6(c60254Nko, it, interfaceC88472Yns, interfaceC88472Yns2, 4), interfaceC88472Yns2);
            } catch (Exception e) {
                interfaceC88472Yns2.invoke(e);
            }
        } else {
            ((InterfaceC88472Yns) aqS52S0400000_6.l2).invoke(uri);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS52S0400000_6(X.C40028FnM r3, X.InterfaceC39983Fmd r4, X.C39984Fme r5, X.C39982Fmc r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r6
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r6
            r1.l2 = r4
            r1.l3 = r5
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS52S0400000_6.<init>(X.FnM, X.Fmd, X.Fme, X.Fmc, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS52S0400000_6(C76732zl c76732zl, C76732zl c76732zl2, C76732zl c76732zl3, AbsSearchService absSearchService, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = c76732zl;
        this.l1 = c76732zl2;
        this.l2 = c76732zl3;
        this.l3 = absSearchService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0400000_6(C60254Nko c60254Nko, Iterator it, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c60254Nko;
        this.l1 = it;
        this.l2 = interfaceC88472Yns;
        this.l3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0400000_6(int[] iArr, Map.Entry entry, Object obj, C36558EWk c36558EWk, int i) {
        super(1);
        this.$t = i;
        this.l0 = iArr;
        this.l1 = entry;
        this.l2 = obj;
        this.l3 = c36558EWk;
    }
}
