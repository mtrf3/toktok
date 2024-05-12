package X;

import java.util.LinkedHashMap;

/* renamed from: X.OOz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C61845OOz implements InterfaceC73592SuS {
    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        B5G.LIZIZ().LJJZZI++;
        return true;
    }

    public static String LIZ(String str, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(j);
        return X1D.LIZIZ(LIZ);
    }

    public static void LIZLLL(Integer num, LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.put(str, Integer.valueOf(num.intValue()));
    }

    public static String LIZIZ(StringBuilder sb, C43I c43i, char c, StringBuilder sb2) {
        sb.append(c43i);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static TBT LIZJ(Class cls, String str, String str2, int i, C65351Pkp c65351Pkp) {
        TBT tbt = new TBT(cls, str, str2, i);
        c65351Pkp.getClass();
        return tbt;
    }
}
