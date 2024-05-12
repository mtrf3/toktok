package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.QsI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68362QsI extends C68363QsJ {
    public final C68284Qr2 LJLILLLLZI;

    public C68362QsI(C68284Qr2 c68284Qr2) {
        this.LJLILLLLZI = c68284Qr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    @Override // X.C68363QsJ, X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        Object obj;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    C68368QsO.LJII(0, "getEventName", list);
                    return new C68376QsW(this.LJLILLLLZI.LIZIZ.LIZ);
                }
                return super.LJIILJJIL(str, c68377QsX, list);
            case 45521504:
                if (str.equals("getTimestamp")) {
                    C68368QsO.LJII(0, "getTimestamp", list);
                    return new C68366QsM(Double.valueOf(this.LJLILLLLZI.LIZIZ.LIZIZ));
                }
                return super.LJIILJJIL(str, c68377QsX, list);
            case 146575578:
                if (str.equals("getParamValue")) {
                    C68368QsO.LJII(1, "getParamValue", list);
                    String LJII = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                    C68276Qqu c68276Qqu = this.LJLILLLLZI.LIZIZ;
                    if (((HashMap) c68276Qqu.LIZJ).containsKey(LJII)) {
                        obj = ((HashMap) c68276Qqu.LIZJ).get(LJII);
                    } else {
                        obj = null;
                    }
                    return C68361QsH.LIZIZ(obj);
                }
                return super.LJIILJJIL(str, c68377QsX, list);
            case 700587132:
                if (str.equals("getParams")) {
                    C68368QsO.LJII(0, "getParams", list);
                    java.util.Map map = this.LJLILLLLZI.LIZIZ.LIZJ;
                    C68363QsJ c68363QsJ = new C68363QsJ();
                    HashMap hashMap = (HashMap) map;
                    for (String str2 : hashMap.keySet()) {
                        c68363QsJ.LJIIIIZZ(str2, C68361QsH.LIZIZ(hashMap.get(str2)));
                    }
                    return c68363QsJ;
                }
                return super.LJIILJJIL(str, c68377QsX, list);
            case 920706790:
                if (str.equals("setParamValue")) {
                    C68368QsO.LJII(2, "setParamValue", list);
                    String LJII2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                    InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                    C68276Qqu c68276Qqu2 = this.LJLILLLLZI.LIZIZ;
                    Object LJFF = C68368QsO.LJFF(LIZIZ);
                    if (LJFF == null) {
                        ((HashMap) c68276Qqu2.LIZJ).remove(LJII2);
                    } else {
                        ((HashMap) c68276Qqu2.LIZJ).put(LJII2, LJFF);
                    }
                    return LIZIZ;
                }
                return super.LJIILJJIL(str, c68377QsX, list);
            case 1570616835:
                if (str.equals("setEventName")) {
                    C68368QsO.LJII(1, "setEventName", list);
                    InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if (!InterfaceC68379QsZ.LJIIJ.equals(LIZIZ2) && !InterfaceC68379QsZ.LJIIJJI.equals(LIZIZ2)) {
                        this.LJLILLLLZI.LIZIZ.LIZ = LIZIZ2.LJII();
                        return new C68376QsW(LIZIZ2.LJII());
                    }
                    throw new IllegalArgumentException("Illegal event name");
                }
                return super.LJIILJJIL(str, c68377QsX, list);
            default:
                return super.LJIILJJIL(str, c68377QsX, list);
        }
    }
}
