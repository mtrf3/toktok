package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.NzM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61156NzM {
    public EnumC39910FlS LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final C61157NzN LJFF;
    public final java.util.Map<String, C61157NzN> LJI;
    public final java.util.Set<String> LJII;

    public final String toString() {
        String str;
        Long l;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{[host]=");
        LIZ.append(this.LJ);
        LIZ.append(",[region]=");
        C61157NzN c61157NzN = this.LJFF;
        String str3 = null;
        if (c61157NzN != null) {
            str = c61157NzN.LJFF;
        } else {
            str = null;
        }
        Q89.LIZIZ(LIZ, str, ',', "[appId]=");
        C61157NzN c61157NzN2 = this.LJFF;
        if (c61157NzN2 != null) {
            l = Long.valueOf(c61157NzN2.LIZJ);
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(",[appVersion]=");
        C61157NzN c61157NzN3 = this.LJFF;
        if (c61157NzN3 != null) {
            str2 = c61157NzN3.LIZLLL;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(",[did]=");
        C61157NzN c61157NzN4 = this.LJFF;
        if (c61157NzN4 != null) {
            str3 = c61157NzN4.LJ;
        }
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }

    public final C61157NzN LIZ(String str) {
        String str2;
        java.util.Map<String, C61157NzN> map = this.LJI;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C61157NzN c61157NzN = map.get(str2);
        if (c61157NzN != null) {
            return c61157NzN;
        }
        String str3 = null;
        if (C96Q.LIZ(str)) {
            C61157NzN c61157NzN2 = this.LJFF;
            if (c61157NzN2 != null) {
                str3 = c61157NzN2.LIZ;
            }
            if (o.LJ(str, str3)) {
                C61157NzN c61157NzN3 = this.LJFF;
                if (c61157NzN3 != null) {
                    return c61157NzN3;
                }
                return this.LJFF;
            }
        }
        C61159NzP c61159NzP = C61157NzN.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        c61159NzP.getClass();
        C62822Ol8 c62822Ol8 = C61157NzN.LJII;
        C61157NzN c61157NzN4 = (C61157NzN) ((java.util.Map) c62822Ol8.getValue()).get(str);
        if (c61157NzN4 != null) {
            return c61157NzN4;
        }
        C61520OCm LIZ = O3E.LIZ(str);
        if (LIZ != null) {
            C61276O3c configRegistry = LIZ.LIZ;
            o.LJFF(configRegistry, "configRegistry");
            String str4 = (String) ListProtector.get(configRegistry.LJ, 0);
            if (str4 == null) {
                str4 = "";
            }
            File file = configRegistry.LJIIL;
            o.LJFF(file, "configRegistry.resRootDir");
            String absolutePath = file.getAbsolutePath();
            if (absolutePath == null) {
                absolutePath = "";
            }
            long longValue = configRegistry.LJII.longValue();
            String str5 = configRegistry.LJIIIIZZ;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = configRegistry.LJIIIZ;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = configRegistry.LJIIJJI;
            if (str7 == null) {
                str7 = "";
            }
            C61157NzN c61157NzN5 = new C61157NzN(longValue, str4, absolutePath, str5, str6, str7, false);
            ((java.util.Map) c62822Ol8.getValue()).put(str, c61157NzN5);
            return c61157NzN5;
        }
        return this.LJFF;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61156NzM(java.lang.String r3, X.C61157NzN r4) {
        /*
            r2 = this;
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r0 = "host"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.<init>(r3, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61156NzM.<init>(java.lang.String, X.NzN):void");
    }

    public C61156NzM(String host, C61157NzN c61157NzN, java.util.Map<String, C61157NzN> map, java.util.Set<String> set) {
        o.LJIIJ(host, "host");
        this.LJ = host;
        this.LJFF = c61157NzN;
        this.LJI = map;
        this.LJII = set;
        this.LIZ = C61022NxC.LIZ;
        this.LIZIZ = C61022NxC.LIZJ;
        this.LIZJ = C61022NxC.LIZIZ;
        this.LIZLLL = C61022NxC.LIZLLL;
    }
}
