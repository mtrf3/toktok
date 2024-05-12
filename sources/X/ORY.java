package X;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ORY extends C61898ORa {
    public static final InterfaceC1039145z LJJIIZ(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (objArr.length == 0) {
            return OJA.LIZ;
        }
        return new C36974EfC(objArr);
    }

    public static final List LJJIJIL(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        return ORZ.LLJI(LJLIIL(objArr));
    }

    public static final List LJJIJL(Object[] objArr) {
        int length = objArr.length - 1;
        if (length < 0 || length == 0) {
            return C61878OQg.INSTANCE;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return LJJZZIII(objArr);
        }
        if (length == 1) {
            return C47261Igj.LJJIJ(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = length2 - length; i < length2; i++) {
            arrayList.add(objArr[i]);
        }
        return arrayList;
    }

    public static final List LJJIJLIJ(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Object LJJIL(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[0];
    }

    public static final Integer LJJIZ(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final Object LJJJ(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final int LJJJI(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        return objArr.length - 1;
    }

    public static String LJJJJLI(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (long j : jArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) String.valueOf(j));
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final int LJJJJZ(int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[iArr.length - 1];
    }

    public static final Object LJJJJZI(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[objArr.length - 1];
    }

    public static final Integer LJJJLL(int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static final Object LJJJLZIJ(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static final Integer LJJJZ(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        C118234kV it = new C40517FvF(1, iArr.length - 1).iterator();
        while (it.LJLJI) {
            int i2 = iArr[it.nextInt()];
            if (i < i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    public static final int LJJL(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        C118234kV it = new C40517FvF(1, iArr.length - 1).iterator();
        while (it.LJLJI) {
            int i2 = iArr[it.nextInt()];
            if (i < i2) {
                i = i2;
            }
        }
        return i;
    }

    public static final Integer LJJLI(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        C118234kV it = new C40517FvF(1, iArr.length - 1).iterator();
        while (it.LJLJI) {
            int i2 = iArr[it.nextInt()];
            if (i > i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Object[] LJJLIIIIJ(Object[] objArr) {
        if (objArr.length == 0) {
            return objArr;
        }
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), objArr.length);
        o.LJII(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        Object[] objArr2 = (Object[]) newInstance;
        int length = objArr.length - 1;
        C118234kV it = new C40517FvF(0, length).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            objArr2[length - nextInt] = objArr[nextInt];
        }
        return objArr2;
    }

    public static final char LJJLIIIJ(char[] cArr) {
        o.LJIIIZ(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int LJJLIIIJL(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final float[] LJJLIIJ(Float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    public static final HashSet LJJLIL(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        HashSet hashSet = new HashSet(C51029K0z.LJJIIZ(objArr.length));
        LJJLIIIJLLLLLLLZ(hashSet, objArr);
        return hashSet;
    }

    public static final int[] LJJLJ(Integer[] numArr) {
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static final List LJJLJLI(byte[] bArr) {
        o.LJIIIZ(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte b : bArr) {
                    arrayList.add(Byte.valueOf(b));
                }
                return arrayList;
            }
            return C47261Igj.LJJIJ(Byte.valueOf(bArr[0]));
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJLL(float[] fArr) {
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Float.valueOf(f));
                }
                return arrayList;
            }
            return C47261Igj.LJJIJ(Float.valueOf(fArr[0]));
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJZ(int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return LJLI(iArr);
            }
            return C47261Igj.LJJIJ(Integer.valueOf(iArr[0]));
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJZZI(long[] jArr) {
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return C47261Igj.LJJIJ(Long.valueOf(jArr[0]));
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJZZIII(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return LJLIIIL(objArr);
            }
            return C47261Igj.LJJIJ(objArr[0]);
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJL(boolean[] zArr) {
        o.LJIIIZ(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z : zArr) {
                    arrayList.add(Boolean.valueOf(z));
                }
                return arrayList;
            }
            return C47261Igj.LJJIJ(Boolean.valueOf(zArr[0]));
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJLI(int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List LJLIIIL(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        return new ArrayList(new ORD(false, objArr));
    }

    public static final java.util.Set LJLIIL(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(objArr.length));
        LJJLIIIJLLLLLLLZ(linkedHashSet, objArr);
        return linkedHashSet;
    }

    public static final java.util.Set LJLIL(Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(objArr.length));
                LJJLIIIJLLLLLLLZ(linkedHashSet, objArr);
                return linkedHashSet;
            }
            return C77275UUl.LJII(objArr[0]);
        }
        return OQY.INSTANCE;
    }

    public static final boolean LJJIIZI(char c, char[] cArr) {
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJ(int i, int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                if (i2 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJIIJI(long j, long[] jArr) {
        o.LJIIIZ(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJIIJIL(Object obj, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (LJJJJIZL(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static final Float LJJJIL(int i, float[] fArr) {
        if (i >= 0 && i <= fArr.length - 1) {
            return Float.valueOf(fArr[i]);
        }
        return null;
    }

    public static final Integer LJJJJ(int i, int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        if (i >= 0 && i <= iArr.length - 1) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static final Object LJJJJI(int i, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (i >= 0 && i <= objArr.length - 1) {
            return objArr[i];
        }
        return null;
    }

    public static final int LJJJJIZL(Object obj, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (o.LJ(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int LJJJLIIL(Object obj, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (o.LJ(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static final List LJJLIIIJILLIZJL(Object[] objArr, C40517FvF indices) {
        o.LJIIIZ(objArr, "<this>");
        o.LJIIIZ(indices, "indices");
        if (indices.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        return C61898ORa.LJIILL(C61898ORa.LJIL(indices.getStart().intValue(), indices.LJIIIIZZ().intValue() + 1, objArr));
    }

    public static final byte[] LJJLIIIJJI(byte[] bArr, C40517FvF indices) {
        o.LJIIIZ(indices, "indices");
        if (indices.isEmpty()) {
            return new byte[0];
        }
        int intValue = indices.getStart().intValue();
        int intValue2 = indices.LJIIIIZZ().intValue() + 1;
        OQN.LJFF(intValue2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, intValue, intValue2);
        o.LJIIIIZZ(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final List LJJLIIIJJIZ(Comparator comparator, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            o.LJIIIIZZ(objArr, "copyOf(this, size)");
            C61898ORa.LJJIIJZLJL(comparator, objArr);
        }
        return C61898ORa.LJIILL(objArr);
    }

    public static final List LJJLIIIJLJLI(int i, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return C61878OQg.INSTANCE;
            }
            if (i >= objArr.length) {
                return LJJZZIII(objArr);
            }
            if (i == 1) {
                return C47261Igj.LJJIJ(objArr[0]);
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : objArr) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        String LIZIZ = C0NY.LIZIZ("Requested element count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final void LJJLIIIJLLLLLLLZ(Collection collection, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static String LJJJJJL(byte[] bArr, CharSequence charSequence, InterfaceC88472Yns interfaceC88472Yns) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (interfaceC88472Yns != null) {
                sb.append((CharSequence) interfaceC88472Yns.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r2 > r6) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJJJL(int[] r9, java.lang.CharSequence r10, X.InterfaceC88472Yns r11, int r12) {
        /*
            r0 = r12 & 1
            if (r0 == 0) goto L6
            java.lang.String r10 = ", "
        L6:
            r0 = r12 & 2
            r2 = 0
            java.lang.String r8 = ""
            if (r0 == 0) goto L71
            r1 = r8
        Le:
            r0 = r12 & 4
            if (r0 == 0) goto L6f
        L12:
            r0 = r12 & 8
            r7 = 0
            if (r0 == 0) goto L6d
            r6 = -1
        L18:
            r0 = r12 & 16
            if (r0 == 0) goto L6b
            java.lang.String r5 = "..."
        L1e:
            r0 = r12 & 32
            if (r0 == 0) goto L23
            r11 = r2
        L23:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            int r3 = r9.length
            r2 = 0
        L41:
            if (r7 >= r3) goto L73
            r1 = r9[r7]
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L4d
            r4.append(r10)
        L4d:
            if (r6 < 0) goto L51
            if (r2 > r6) goto L77
        L51:
            if (r11 == 0) goto L63
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.append(r0)
        L60:
            int r7 = r7 + 1
            goto L41
        L63:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r4.append(r0)
            goto L60
        L6b:
            r5 = r2
            goto L1e
        L6d:
            r6 = 0
            goto L18
        L6f:
            r8 = r2
            goto L12
        L71:
            r1 = r2
            goto Le
        L73:
            if (r6 < 0) goto L7a
            if (r2 <= r6) goto L7a
        L77:
            r4.append(r5)
        L7a:
            r4.append(r8)
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ORY.LJJJJL(int[], java.lang.CharSequence, X.Yns, int):java.lang.String");
    }

    public static String LJJJJLL(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC88472Yns interfaceC88472Yns, int i) {
        int i2;
        String truncated;
        CharSequence separator = charSequence;
        CharSequence prefix = charSequence2;
        if ((i & 1) != 0) {
            separator = ", ";
        }
        CharSequence postfix = "";
        if ((i & 2) != 0) {
            prefix = "";
        }
        if ((i & 4) == 0) {
            postfix = charSequence3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        InterfaceC88472Yns interfaceC88472Yns2 = null;
        if ((i & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i & 32) == 0) {
            interfaceC88472Yns2 = interfaceC88472Yns;
        }
        o.LJIIIZ(objArr, "<this>");
        o.LJIIIZ(separator, "separator");
        o.LJIIIZ(prefix, "prefix");
        o.LJIIIZ(postfix, "postfix");
        o.LJIIIZ(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        LJJJJJ(objArr, sb, separator, prefix, postfix, i2, truncated, interfaceC88472Yns2);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r5.append(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r11 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r2 <= r11) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJJ(java.lang.Object[] r6, java.lang.Appendable r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, java.lang.CharSequence r12, X.InterfaceC88472Yns r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r5 = r7
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            r5.append(r9)
            int r4 = r6.length
            r3 = 0
            r2 = 0
        L22:
            if (r3 >= r4) goto L38
            r1 = r6[r3]
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L2e
            r5.append(r8)
        L2e:
            if (r11 < 0) goto L32
            if (r2 > r11) goto L3a
        L32:
            X.C77119UOl.LIZ(r7, r1, r13)
            int r3 = r3 + 1
            goto L22
        L38:
            if (r11 < 0) goto L3f
        L3a:
            if (r2 <= r11) goto L3f
            r5.append(r12)
        L3f:
            r5.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ORY.LJJJJJ(java.lang.Object[], java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, X.Yns):void");
    }
}
