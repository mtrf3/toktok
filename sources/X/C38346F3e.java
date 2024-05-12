package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.F3e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38346F3e extends C77119UOl {
    public static final String LJJIJIIJI(String str) {
        int i;
        int i2;
        o.LJIIIZ(str, "<this>");
        List LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(s.LJLJJLL(str, new String[]{"\r\n", "\n", "\r"})));
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJIJLIJ) {
            if (!ujb.o.LJJJJJL((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!C17N.LJJIJIIJIL(str2.charAt(i))) {
                    if (i != -1) {
                    }
                } else {
                    i++;
                }
            }
            i = str2.length();
            arrayList2.add(Integer.valueOf(i));
        }
        Integer num = (Integer) ORZ.LLII(arrayList2);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        LJJIJLIJ.size();
        int i3 = 0 + length2;
        C38347F3f c38347F3f = C38347F3f.LJLIL;
        int LJJI = C47261Igj.LJJI(LJJIJLIJ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : LJJIJLIJ) {
            int i4 = i + 1;
            if (i >= 0) {
                String str3 = (String) obj2;
                if ((i != 0 && i != LJJI) || !ujb.o.LJJJJJL(str3)) {
                    String LLF = C40689Fy1.LLF(i2, str3);
                    c38347F3f.invoke(LLF);
                    if (LLF == null) {
                        LLF = str3;
                        if (str3 == null) {
                        }
                    }
                    arrayList3.add(LLF);
                }
                i = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(i3);
        ORZ.LL(arrayList3, sb, "\n", null, 124);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIJIIJIL(java.lang.String r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.lang.String r8 = "|"
            boolean r0 = ujb.o.LJJJJJL(r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lab
            java.lang.String r1 = "\r\n"
            java.lang.String r0 = "\r"
            java.lang.String r6 = "\n"
            java.lang.String[] r0 = new java.lang.String[]{r1, r6, r0}
            X.4Vp r0 = ujb.s.LJLJJLL(r12, r0)
            java.util.List r0 = X.OJ4.LJJLIIIJ(r0)
            java.util.List r1 = X.C47261Igj.LJJIJLIJ(r0)
            int r0 = r12.length()
            r1.size()
            r7 = 0
            int r7 = r7 + r0
            X.F3f r9 = X.C38347F3f.LJLIL
            int r5 = X.C47261Igj.LJJI(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r1.iterator()
            r1 = 0
        L3e:
            boolean r0 = r12.hasNext()
            r2 = 0
            if (r0 == 0) goto L97
            java.lang.Object r3 = r12.next()
            int r11 = r1 + 1
            if (r1 < 0) goto L93
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L53
            if (r1 != r5) goto L5b
        L53:
            boolean r0 = ujb.o.LJJJJJL(r3)
            if (r0 == 0) goto L5b
        L59:
            r1 = r11
            goto L3e
        L5b:
            int r10 = r3.length()
            r2 = 0
        L60:
            r1 = -1
            if (r2 >= r10) goto L71
            char r0 = r3.charAt(r2)
            boolean r0 = X.C17N.LJJIJIIJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L90
            if (r2 != r1) goto L76
        L71:
            r1 = r3
        L72:
            r4.add(r1)
            goto L59
        L76:
            boolean r0 = r3.startsWith(r8, r2)
            if (r0 == 0) goto L71
            int r0 = r8.length()
            int r0 = r0 + r2
            java.lang.String r1 = r3.substring(r0)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            if (r1 == 0) goto L71
            r9.invoke(r1)
            goto L72
        L90:
            int r2 = r2 + 1
            goto L60
        L93:
            X.C47261Igj.LJJJJJ()
            throw r2
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r0 = 124(0x7c, float:1.74E-43)
            X.ORZ.LL(r4, r1, r6, r2, r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        Lab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38346F3e.LJJIJIIJIL(java.lang.String):java.lang.String");
    }
}
