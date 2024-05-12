package X;

import Y.IDObjectS0S0101000;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ujb.o;

/* renamed from: X.ZzA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C91720ZzA {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final String LJLIL;
    public C92143a5z LJLILLLLZI;
    public final List<C91712Zz2> LJLJI;
    public final C0MB<C91696Zym> LJLJJI;
    public final java.util.Map<String, C91698Zyo> LJLJJL;
    public int LJLJJLL;
    public String LJLJL;

    static {
        new LinkedHashMap();
    }

    public final java.util.Map<String, C91698Zyo> LJIIIZ() {
        return C113554cx.LJJLIIIJLLLLLLLZ(this.LJLJJL);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = this.LJLJJLL * 31;
        String str = this.LJLJL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = i + hashCode;
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            C91712Zz2 c91712Zz2 = (C91712Zz2) it.next();
            int i3 = i2 * 31;
            String str2 = c91712Zz2.LIZ;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str3 = c91712Zz2.LIZIZ;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str4 = c91712Zz2.LIZJ;
            if (str4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str4.hashCode();
            }
            i2 = i5 + hashCode5;
        }
        IDObjectS0S0101000 LJJIIZ = C78934UyQ.LJJIIZ(this.LJLJJI);
        while (LJJIIZ.hasNext()) {
            LJJIIZ.next().getClass();
            i2 = i2 * 31 * 31;
        }
        for (String str5 : LJIIIZ().keySet()) {
            int hashCode6 = ((i2 * 31) + str5.hashCode()) * 31;
            C91698Zyo c91698Zyo = LJIIIZ().get(str5);
            if (c91698Zyo == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c91698Zyo.hashCode();
            }
            i2 = hashCode6 + hashCode2;
        }
        return i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C16880lQ.LJLLJ(getClass()));
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.LJLJJLL));
        sb.append(")");
        String str = this.LJLJL;
        if (str != null && !o.LJJJJJL(str)) {
            sb.append(" route=");
            sb.append(this.LJLJL);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public C91720ZzA(AbstractC91695Zyl<? extends C91720ZzA> navigator) {
        kotlin.jvm.internal.o.LJIIIZ(navigator, "navigator");
        this.LJLIL = C91699Zyp.LIZ(navigator.getClass());
        this.LJLJI = new ArrayList();
        this.LJLJJI = new C0MB<>();
        this.LJLJJL = new LinkedHashMap();
    }

    public final void LIZJ(C91712Zz2 navDeepLink) {
        kotlin.jvm.internal.o.LJIIIZ(navDeepLink, "navDeepLink");
        java.util.Map<String, C91698Zyo> LJIIIZ = LJIIIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C91698Zyo> entry : LJIIIZ.entrySet()) {
            C91698Zyo value = entry.getValue();
            if (!value.LIZIZ && !value.LIZJ) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            List<String> list = navDeepLink.LIZLLL;
            Collection values = ((LinkedHashMap) navDeepLink.LJ).values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((C91711Zz1) it.next()).LIZIZ, arrayList2);
            }
            if (!((ArrayList) ORZ.LLIIIZ(arrayList2, list)).contains(obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            ((ArrayList) this.LJLJI).add(navDeepLink);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Deep link ");
        LIZ.append((Object) navDeepLink.LIZ);
        LIZ.append(" can't be used to open destination ");
        LIZ.append(this);
        LIZ.append(".\nFollowing required arguments are missing: ");
        LIZ.append(arrayList);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:1: B:24:0x0061->B:38:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle LJII(android.os.Bundle r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L13
            java.util.Map<java.lang.String, X.Zyo> r0 = r7.LJLJJL
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
        Lc:
            r0 = 1
        Ld:
            if (r0 == 0) goto L13
            r0 = 0
            return r0
        L11:
            r0 = 0
            goto Ld
        L13:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.util.Map<java.lang.String, X.Zyo> r0 = r7.LJLJJL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L24:
            boolean r0 = r6.hasNext()
            java.lang.String r5 = "name"
            if (r0 == 0) goto L50
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.getValue()
            X.Zyo r2 = (X.C91698Zyo) r2
            r2.getClass()
            kotlin.jvm.internal.o.LJIIIZ(r3, r5)
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L24
            X.Zyf<java.lang.Object> r1 = r2.LIZ
            java.lang.Object r0 = r2.LIZLLL
            r1.LIZLLL(r4, r3, r0)
            goto L24
        L50:
            if (r8 == 0) goto Lc6
            r4.putAll(r8)
            java.util.Map<java.lang.String, X.Zyo> r0 = r7.LJLJJL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.getValue()
            X.Zyo r2 = (X.C91698Zyo) r2
            r2.getClass()
            kotlin.jvm.internal.o.LJIIIZ(r3, r5)
            boolean r0 = r2.LIZIZ
            if (r0 != 0) goto L93
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L93
            java.lang.Object r0 = X.C16880lQ.LLJJIII(r4, r3)
            if (r0 != 0) goto L93
        L8f:
            r0 = 0
        L90:
            if (r0 == 0) goto L9a
            goto L61
        L93:
            X.Zyf<java.lang.Object> r0 = r2.LIZ     // Catch: java.lang.ClassCastException -> L8f
            r0.LIZ(r4, r3)     // Catch: java.lang.ClassCastException -> L8f
            r0 = 1
            goto L90
        L9a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Wrong argument type for '"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "' in argument bundle. "
            r1.append(r0)
            X.Zyf<java.lang.Object> r0 = r2.LIZ
            java.lang.String r0 = r0.LIZIZ()
            r1.append(r0)
            java.lang.String r0 = " expected."
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91720ZzA.LJII(android.os.Bundle):android.os.Bundle");
    }

    public final int[] LJIIIIZZ(C91720ZzA c91720ZzA) {
        ORV orv = new ORV();
        C91720ZzA c91720ZzA2 = this;
        while (true) {
            C92143a5z c92143a5z = c91720ZzA2.LJLILLLLZI;
            if (c91720ZzA != null && c91720ZzA.LJLILLLLZI != null) {
                C92143a5z c92143a5z2 = c91720ZzA.LJLILLLLZI;
                kotlin.jvm.internal.o.LJI(c92143a5z2);
                if (c92143a5z2.LJIIZILJ(c91720ZzA2.LJLJJLL, true) == c91720ZzA2) {
                    orv.addFirst(c91720ZzA2);
                    break;
                }
            }
            if (c92143a5z == null || c92143a5z.LJLL != c91720ZzA2.LJLJJLL) {
                orv.addFirst(c91720ZzA2);
            }
            if (kotlin.jvm.internal.o.LJ(c92143a5z, c91720ZzA) || c92143a5z == null) {
                break;
            }
            c91720ZzA2 = c92143a5z;
        }
        List LLJI = ORZ.LLJI(orv);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C91720ZzA) it.next()).LJLJJLL));
        }
        return ORZ.LLJ(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91719Zz9 LJIILJJIL(C91717Zz7 c91717Zz7) {
        Bundle bundle;
        boolean z;
        int i;
        Matcher matcher;
        Matcher matcher2;
        Bundle bundle2 = null;
        if (((ArrayList) this.LJLJI).isEmpty()) {
            return null;
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        C91719Zz9 c91719Zz9 = null;
        while (it.hasNext()) {
            C91712Zz2 c91712Zz2 = (C91712Zz2) it.next();
            android.net.Uri uri = c91717Zz7.LIZ;
            if (uri != null) {
                java.util.Map<String, C91698Zyo> LJIIIZ = LJIIIZ();
                c91712Zz2.getClass();
                Pattern pattern = (Pattern) c91712Zz2.LJI.getValue();
                if (pattern != null && (matcher = pattern.matcher(uri.toString())) != null && matcher.matches()) {
                    bundle = new Bundle();
                    int size = ((ArrayList) c91712Zz2.LIZLLL).size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            int i3 = i2 + 1;
                            String str = (String) ListProtector.get(c91712Zz2.LIZLLL, i2);
                            String value = android.net.Uri.decode(matcher.group(i3));
                            C91698Zyo c91698Zyo = LJIIIZ.get(str);
                            kotlin.jvm.internal.o.LJIIIIZZ(value, "value");
                            if (C91712Zz2.LIZIZ(bundle, str, value, c91698Zyo)) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            if (c91712Zz2.LJII) {
                                for (String str2 : ((LinkedHashMap) c91712Zz2.LJ).keySet()) {
                                    C91711Zz1 c91711Zz1 = (C91711Zz1) ((LinkedHashMap) c91712Zz2.LJ).get(str2);
                                    String queryParameter = UriProtector.getQueryParameter(uri, str2);
                                    if (queryParameter != null) {
                                        kotlin.jvm.internal.o.LJI(c91711Zz1);
                                        matcher2 = PatternProtector.compile(c91711Zz1.LIZ).matcher(queryParameter);
                                        if (!matcher2.matches()) {
                                        }
                                    } else {
                                        matcher2 = bundle2;
                                    }
                                    kotlin.jvm.internal.o.LJI(c91711Zz1);
                                    int size2 = ((ArrayList) c91711Zz1.LIZIZ).size();
                                    int i4 = 0;
                                    while (i4 < size2) {
                                        int i5 = i4 + 1;
                                        String str3 = bundle2;
                                        if (matcher2 != null) {
                                            str3 = android.net.Uri.decode(matcher2.group(i5));
                                        }
                                        String str4 = (String) ListProtector.get(c91711Zz1.LIZIZ, i4);
                                        C91698Zyo c91698Zyo2 = LJIIIZ.get(str4);
                                        if (str3 != 0) {
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append('{');
                                            LIZ.append(str4);
                                            LIZ.append('}');
                                            if (!kotlin.jvm.internal.o.LJ(str3, X1D.LIZIZ(LIZ)) && C91712Zz2.LIZIZ(bundle, str4, str3, c91698Zyo2)) {
                                                break;
                                            }
                                        }
                                        i4 = i5;
                                        bundle2 = null;
                                    }
                                }
                            }
                            for (Map.Entry<String, C91698Zyo> entry : LJIIIZ.entrySet()) {
                                String key = entry.getKey();
                                C91698Zyo value2 = entry.getValue();
                                if (value2 != null && !value2.LIZIZ && !value2.LIZJ && !bundle.containsKey(key)) {
                                    bundle = null;
                                }
                            }
                        }
                    }
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str5 = c91717Zz7.LIZIZ;
            if (str5 != null && kotlin.jvm.internal.o.LJ(str5, c91712Zz2.LIZIZ)) {
                z = true;
            } else {
                z = false;
            }
            String str6 = c91717Zz7.LIZJ;
            if (str6 != null) {
                c91712Zz2.getClass();
                if (c91712Zz2.LIZJ != null) {
                    Pattern pattern2 = (Pattern) c91712Zz2.LJIIIZ.getValue();
                    kotlin.jvm.internal.o.LJI(pattern2);
                    if (pattern2.matcher(str6).matches()) {
                        i = new C91710Zz0(c91712Zz2.LIZJ).compareTo(new C91710Zz0(str6));
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            if (bundle != null || z || i > -1) {
                C91719Zz9 c91719Zz92 = new C91719Zz9(this, bundle, c91712Zz2.LJIIJ, z, i);
                if (c91719Zz9 == null || c91719Zz92.compareTo(c91719Zz9) > 0) {
                    c91719Zz9 = c91719Zz92;
                }
            }
            bundle2 = null;
        }
        return c91719Zz9;
    }

    public final void LJIILLIIL(String str) {
        Object obj;
        if (str == null) {
            this.LJLJJLL = 0;
        } else if (!o.LJJJJJL(str)) {
            String LIZ = C91718Zz8.LIZ(str);
            this.LJLJJLL = LIZ.hashCode();
            C91708Zyy c91708Zyy = new C91708Zyy();
            c91708Zyy.LIZ = LIZ;
            LIZJ(new C91712Zz2(c91708Zyy.LIZ));
        } else {
            "Cannot have an empty route".toString();
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        ArrayList arrayList = (ArrayList) this.LJLJI;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.o.LJ(((C91712Zz2) obj).LIZ, C91718Zz8.LIZ(this.LJLJL))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        arrayList.remove(obj);
        this.LJLJL = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r1 < 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r1 < 0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91720ZzA.equals(java.lang.Object):boolean");
    }
}
