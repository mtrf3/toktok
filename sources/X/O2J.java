package X;

import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2J implements FD3 {
    public final String LIZ;
    public List<String> LIZIZ;
    public GeckoConfig LIZJ;
    public java.util.Map<String, GeckoConfig> LIZLLL;
    public final Object LJ;
    public final Object LJFF;
    public InterfaceC61272O2y LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public List<String> LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2J)) {
            return false;
        }
        O2J o2j = (O2J) obj;
        return o.LJ(this.LIZ, o2j.LIZ) && o.LJ(this.LIZIZ, o2j.LIZIZ) && o.LJ(this.LIZJ, o2j.LIZJ) && o.LJ(this.LIZLLL, o2j.LIZLLL) && o.LJ(this.LJ, o2j.LJ) && o.LJ(this.LJFF, o2j.LJFF) && o.LJ(this.LJI, o2j.LJI) && this.LJII == o2j.LJII && this.LJIIIIZZ == o2j.LJIIIIZZ && this.LJIIIZ == o2j.LJIIIZ && this.LJIIJ == o2j.LJIIJ && this.LJIIJJI == o2j.LJIIJJI && o.LJ(this.LJIIL, o2j.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        GeckoConfig geckoConfig = this.LIZJ;
        int hashCode3 = (hashCode2 + (geckoConfig != null ? geckoConfig.hashCode() : 0)) * 31;
        java.util.Map<String, GeckoConfig> map = this.LIZLLL;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Object obj = this.LJ;
        int hashCode5 = (hashCode4 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.LJFF;
        int hashCode6 = (hashCode5 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        InterfaceC61272O2y interfaceC61272O2y = this.LJI;
        int hashCode7 = (((((hashCode6 + (interfaceC61272O2y != null ? interfaceC61272O2y.hashCode() : 0)) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31;
        boolean z = this.LJIIIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z2 = this.LJIIJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJIIJJI ? 1 : 0)) * 31;
        List<String> list2 = this.LJIIL;
        return i4 + (list2 != null ? list2.hashCode() : 0);
    }

    public static String LIZ() {
        String appId;
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null && (appId = c39858Fkc.getAppId()) != null) {
            return appId;
        }
        return "";
    }

    public static String LIZIZ() {
        String appVersion;
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null && (appVersion = c39858Fkc.getAppVersion()) != null) {
            return appVersion;
        }
        return "";
    }

    public static String LIZJ() {
        String did;
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null && (did = c39858Fkc.getDid()) != null) {
            return did;
        }
        return "";
    }

    public static String LIZLLL() {
        String region;
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null && (region = c39858Fkc.getRegion()) != null) {
            return region;
        }
        return "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{[host]=");
        sb.append(this.LIZ);
        sb.append(",[region]=");
        sb.append(LIZLLL());
        sb.append(",[prefix]=");
        Object[] array = this.LIZIZ.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            o.LJFF(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            sb.append(",[appId]=");
            sb.append(LIZ());
            sb.append(",[appVersion]=");
            sb.append(LIZIZ());
            sb.append(",[did]=");
            sb.append(LIZJ());
            sb.append('}');
            return sb.toString();
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ O2J(java.lang.String r15, java.util.List r16, com.bytedance.lynx.hybrid.resource.config.GeckoConfig r17, java.lang.Object r18, int r19) {
        /*
            r14 = this;
            r6 = r18
            r1 = r19
            r0 = r1 & 8
            r13 = 0
            if (r0 == 0) goto L45
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        Le:
            r5 = 0
            r0 = r1 & 32
            if (r0 == 0) goto L14
            r6 = r13
        L14:
            r0 = r1 & 64
            if (r0 == 0) goto L43
            X.O3F r7 = new X.O3F
            r7.<init>()
        L1d:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L41
            r8 = 10
        L23:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3f
            r9 = 83886080(0x5000000, float:6.018531E-36)
        L29:
            r10 = 0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L33
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L33:
            r1 = r15
            r0 = r14
            r2 = r16
            r3 = r17
            r11 = r10
            r12 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L3f:
            r9 = 0
            goto L29
        L41:
            r8 = 0
            goto L23
        L43:
            r7 = r13
            goto L1d
        L45:
            r4 = r13
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2J.<init>(java.lang.String, java.util.List, com.bytedance.lynx.hybrid.resource.config.GeckoConfig, java.lang.Object, int):void");
    }

    public O2J(String host, List<String> list, GeckoConfig geckoConfig, java.util.Map<String, GeckoConfig> geckoConfigs, Object obj, Object obj2, InterfaceC61272O2y download, int i, int i2, boolean z, boolean z2, boolean z3, List<String> sampleWhiteList) {
        o.LJIIJ(host, "host");
        o.LJIIJ(geckoConfigs, "geckoConfigs");
        o.LJIIJ(download, "download");
        o.LJIIJ(sampleWhiteList, "sampleWhiteList");
        this.LIZ = host;
        this.LIZIZ = list;
        this.LIZJ = geckoConfig;
        this.LIZLLL = geckoConfigs;
        this.LJ = obj;
        this.LJFF = obj2;
        this.LJI = download;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = z;
        this.LJIIJ = z2;
        this.LJIIJJI = z3;
        this.LJIIL = sampleWhiteList;
    }
}
