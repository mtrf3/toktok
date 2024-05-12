package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32444CoK;
import X.C59612NaS;
import X.C59613NaT;
import X.C76542zS;
import X.C76800UCe;
import X.EnumC38166EyQ;
import X.InterfaceC88473Ynt;
import X.O5G;
import X.O92;
import X.O95;
import X.O9B;
import X.O9F;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.xelement.LynxSeekerManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Map;

/* loaded from: classes11.dex */
public class IDqS435S0100000_10 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS435S0100000_10(C59612NaS c59612NaS, int i) {
        super(3);
        this.$t = i;
        this.l0 = c59612NaS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS435S0100000_10(C59613NaT c59613NaT, int i) {
        super(3);
        this.$t = i;
        this.l0 = c59613NaT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS435S0100000_10(O5G o5g, int i) {
        super(3);
        this.$t = i;
        this.l0 = o5g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS435S0100000_10(O95 o95, int i) {
        super(3);
        this.$t = i;
        this.l0 = o95;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS435S0100000_10(O9B o9b, int i) {
        super(3);
        this.$t = i;
        this.l0 = o9b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS435S0100000_10(LynxSeekerManager lynxSeekerManager, int i) {
        super(3);
        this.$t = i;
        this.l0 = lynxSeekerManager;
    }

    public static final Object invoke$0(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        long j;
        int i;
        boolean z;
        String str;
        String str2 = (String) obj;
        Map globalProps = (Map) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(globalProps, "globalProps");
        O9B o9b = (O9B) iDqS435S0100000_10.l0;
        o9b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int LIZ = O9B.LIZ(str2);
        Long l = o9b.LJLJJI.get(str2);
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        Object obj4 = globalProps.get("usePreload");
        if ((obj4 instanceof String) && (str = (String) obj4) != null) {
            i = CastIntegerProtector.parseInt(str);
        } else {
            i = 0;
        }
        Boolean bool = o9b.LJLJL.get(str2);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C76542zS.LIZJ("rd_tiktokec_pdp_lynx_dur", new O9F(i, LIZ, elapsedRealtime, j, str2, booleanValue, z));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        String methodName = (String) obj;
        EnumC38166EyQ bridgeAccess = (EnumC38166EyQ) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(bridgeAccess, "bridgeAccess");
        ((C59612NaS) iDqS435S0100000_10.l0).reportOnJsbReject(methodName, bridgeAccess, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        String methodName = (String) obj;
        EnumC38166EyQ bridgeAccess = (EnumC38166EyQ) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(bridgeAccess, "bridgeAccess");
        ((C59612NaS) iDqS435S0100000_10.l0).reportOnJsbReject(methodName, bridgeAccess, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        String methodName = (String) obj;
        EnumC38166EyQ bridgeAccess = (EnumC38166EyQ) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(bridgeAccess, "bridgeAccess");
        ((C59613NaT) iDqS435S0100000_10.l0).reportOnJsbReject(methodName, bridgeAccess, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        String methodName = (String) obj;
        EnumC38166EyQ bridgeAccess = (EnumC38166EyQ) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(bridgeAccess, "bridgeAccess");
        ((C59613NaT) iDqS435S0100000_10.l0).reportOnJsbReject(methodName, bridgeAccess, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        byte[] byteArray = (byte[]) obj3;
        o.LJIIJ(byteArray, "byteArray");
        if (intValue == 0) {
            i = 0;
        } else {
            O5G o5g = (O5G) iDqS435S0100000_10.l0;
            i = ((intValue - 1) * o5g.LJIIIZ) + o5g.LJIIL;
        }
        if (byteArray.length + i >= ((O5G) iDqS435S0100000_10.l0).LIZLLL) {
            if (booleanValue) {
                O5G o5g2 = (O5G) iDqS435S0100000_10.l0;
                o5g2.LJI(o5g2.LJIIJJI, byteArray, i);
            } else {
                ((O5G) iDqS435S0100000_10.l0).LJI(byteArray.length, byteArray, i);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r6.equals("seekend") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r6.equals("seekchanged") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r6.equals("seekbegin") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.IDqS435S0100000_10 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIJ(r6, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            java.lang.String r0 = "<anonymous parameter 2>"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            X.3mF r2 = X.C113554cx.LJJJLIIL()
            int r1 = r6.hashCode()
            r0 = 831845681(0x3194f531, float:4.335242E-9)
            if (r1 == r0) goto L80
            r0 = 1507777852(0x59dedd3c, float:7.841337E15)
            if (r1 == r0) goto L77
            r0 = 1971816291(0x75878763, float:3.4360647E32)
            if (r1 == r0) goto L6e
        L2a:
            java.lang.String r1 = ""
            r7 = r2
        L2d:
            java.lang.Object r0 = r5.l0
            com.bytedance.ies.xelement.LynxSeekerManager r0 = (com.bytedance.ies.xelement.LynxSeekerManager) r0
            X.VNU r0 = r0.mContext
            if (r0 == 0) goto L8c
            X.VNL r4 = r0.LJLJJL
            if (r4 == 0) goto L8c
            int r0 = r1.length()
            if (r0 <= 0) goto L8c
            X.Jdb r3 = new X.Jdb
            java.lang.Object r0 = r5.l0
            com.bytedance.ies.xelement.LynxSeekerManager r0 = (com.bytedance.ies.xelement.LynxSeekerManager) r0
            int r0 = r0.getSign()
            r3.<init>(r0, r1)
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r3.LIZJ(r0, r1)
            goto L54
        L6e:
            java.lang.String r1 = "seekend"
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L2a
            goto L2d
        L77:
            java.lang.String r1 = "seekchanged"
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L2a
            goto L2d
        L80:
            java.lang.String r1 = "seekbegin"
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L2a
            goto L2d
        L89:
            r4.LIZIZ(r3)
        L8c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS435S0100000_10.invoke$6(kotlin.jvm.internal.IDqS435S0100000_10, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(IDqS435S0100000_10 iDqS435S0100000_10, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String schema = (String) obj2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        C32444CoK.LIZ(null, "real preCreate Spark view");
        return ((O95) iDqS435S0100000_10.l0).LIZ.LIZ(context, schema, O92.LJLIL);
    }
}
