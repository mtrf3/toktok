package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1IQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IQ implements Iterable<Integer>, InterfaceC90533gv {
    public static final C1IQ LJLJJL = new C1IQ(0, 0, null, 0);
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final int[] LJLJJI;

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C37655EqB(new C2BB(this, null)).iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C32I.LJJL(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(arrayList, i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        o.LJIIIIZZ(sb3, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb3);
        sb.append(']');
        return sb.toString();
    }

    public final C1IQ LIZJ(C1IQ bits) {
        o.LJIIIZ(bits, "bits");
        C1IQ c1iq = LJLJJL;
        if (bits == c1iq) {
            return this;
        }
        if (this == c1iq) {
            return c1iq;
        }
        int i = bits.LJLJI;
        int i2 = this.LJLJI;
        if (i == i2) {
            int[] iArr = bits.LJLJJI;
            int[] iArr2 = this.LJLJJI;
            if (iArr == iArr2) {
                return new C1IQ(this.LJLIL & (~bits.LJLIL), this.LJLILLLLZI & (~bits.LJLILLLLZI), iArr2, i2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        C1IQ c1iq2 = this;
        while (it.hasNext()) {
            c1iq2 = c1iq2.LJII(it.next().intValue());
        }
        return c1iq2;
    }

    public final C1IQ LJII(int i) {
        int LIZLLL;
        int i2 = this.LJLJI;
        int i3 = i - i2;
        if (i3 >= 0) {
            if (i3 < 64) {
                long j = 1 << i3;
                long j2 = this.LJLILLLLZI;
                if ((j2 & j) != 0) {
                    return new C1IQ(this.LJLIL, j2 & (~j), this.LJLJJI, i2);
                }
            } else if (i3 < 128) {
                long j3 = 1 << (i3 - 64);
                long j4 = this.LJLIL;
                if ((j4 & j3) != 0) {
                    return new C1IQ(j4 & (~j3), this.LJLILLLLZI, this.LJLJJI, i2);
                }
            }
        } else {
            int[] iArr = this.LJLJJI;
            if (iArr != null && (LIZLLL = C30581Hy.LIZLLL(i, iArr)) >= 0) {
                int length = iArr.length - 1;
                if (length == 0) {
                    return new C1IQ(this.LJLIL, this.LJLILLLLZI, null, this.LJLJI);
                }
                int[] iArr2 = new int[length];
                if (LIZLLL > 0) {
                    C61898ORa.LJIILLIIL(0, 0, LIZLLL, iArr, iArr2);
                }
                if (LIZLLL < length) {
                    C61898ORa.LJIILLIIL(LIZLLL, LIZLLL + 1, length + 1, iArr, iArr2);
                }
                return new C1IQ(this.LJLIL, this.LJLILLLLZI, iArr2, this.LJLJI);
            }
        }
        return this;
    }

    public final boolean LJIIIIZZ(int i) {
        int i2 = i - this.LJLJI;
        boolean z = true;
        if (i2 >= 0) {
            if (i2 < 64) {
                if (((1 << i2) & this.LJLILLLLZI) != 0) {
                    return true;
                }
                return false;
            }
            if (i2 < 128 && ((1 << (i2 - 64)) & this.LJLIL) != 0) {
                return true;
            }
            return false;
        }
        int[] iArr = this.LJLJJI;
        if (iArr == null) {
            return false;
        }
        if (C30581Hy.LIZLLL(i, iArr) < 0) {
            z = false;
        }
        return z;
    }

    public final C1IQ LJIIIZ(C1IQ bits) {
        o.LJIIIZ(bits, "bits");
        C1IQ c1iq = LJLJJL;
        if (bits == c1iq) {
            return this;
        }
        if (this == c1iq) {
            return bits;
        }
        int i = bits.LJLJI;
        int i2 = this.LJLJI;
        if (i == i2) {
            int[] iArr = bits.LJLJJI;
            int[] iArr2 = this.LJLJJI;
            if (iArr == iArr2) {
                return new C1IQ(this.LJLIL | bits.LJLIL, this.LJLILLLLZI | bits.LJLILLLLZI, iArr2, i2);
            }
        }
        if (this.LJLJJI == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.LJIILJJIL(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        C1IQ c1iq2 = this;
        while (it2.hasNext()) {
            c1iq2 = c1iq2.LJIILJJIL(it2.next().intValue());
        }
        return c1iq2;
    }

    public final C1IQ LJIILJJIL(int i) {
        int[] iArr;
        int i2 = this.LJLJI;
        int i3 = i - i2;
        long j = 0;
        if (i3 >= 0) {
            if (i3 < 64) {
                long j2 = 1 << i3;
                long j3 = this.LJLILLLLZI;
                if ((j3 & j2) == 0) {
                    return new C1IQ(this.LJLIL, j3 | j2, this.LJLJJI, i2);
                }
            } else if (i3 >= 64) {
                if (i3 < 128) {
                    long j4 = 1 << (i3 - 64);
                    long j5 = this.LJLIL;
                    if ((j5 & j4) == 0) {
                        return new C1IQ(j5 | j4, this.LJLILLLLZI, this.LJLJJI, i2);
                    }
                } else if (!LJIIIIZZ(i)) {
                    long j6 = this.LJLIL;
                    long j7 = this.LJLILLLLZI;
                    int i4 = this.LJLJI;
                    int i5 = ((i + 1) / 64) * 64;
                    ArrayList arrayList = null;
                    while (true) {
                        if (i4 >= i5) {
                            break;
                        }
                        if (j7 != j) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr2 = this.LJLJJI;
                                if (iArr2 != null) {
                                    for (int i6 : iArr2) {
                                        arrayList.add(Integer.valueOf(i6));
                                    }
                                }
                            }
                            int i7 = 0;
                            do {
                                if (((1 << i7) & j7) != 0) {
                                    arrayList.add(Integer.valueOf(i7 + i4));
                                }
                                i7++;
                            } while (i7 < 64);
                            j = 0;
                        }
                        if (j6 == j) {
                            j7 = 0;
                            i4 = i5;
                            break;
                        }
                        i4 += 64;
                        j7 = j6;
                        j6 = 0;
                    }
                    if (arrayList != null) {
                        iArr = ORZ.LLJ(arrayList);
                    } else {
                        iArr = this.LJLJJI;
                    }
                    return new C1IQ(j6, j7, iArr, i4).LJIILJJIL(i);
                }
            }
            return this;
        }
        int[] iArr3 = this.LJLJJI;
        if (iArr3 == null) {
            return new C1IQ(this.LJLIL, this.LJLILLLLZI, new int[]{i}, i2);
        }
        int LIZLLL = C30581Hy.LIZLLL(i, iArr3);
        if (LIZLLL < 0) {
            int i8 = -(LIZLLL + 1);
            int length = iArr3.length + 1;
            int[] iArr4 = new int[length];
            C61898ORa.LJIILLIIL(0, 0, i8, iArr3, iArr4);
            C61898ORa.LJIILLIIL(i8 + 1, i8, length - 1, iArr3, iArr4);
            iArr4[i8] = i;
            return new C1IQ(this.LJLIL, this.LJLILLLLZI, iArr4, this.LJLJI);
        }
        return this;
    }

    public C1IQ(long j, long j2, int[] iArr, int i) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = i;
        this.LJLJJI = iArr;
    }
}
