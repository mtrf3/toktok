package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17630md {
    public static final C61878OQg LIZ = C61878OQg.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AbstractC17560mW> LIZ(String str) {
        char c;
        int i;
        float[] fArr;
        char charAt;
        int i2;
        boolean z;
        if (str == null) {
            return LIZ;
        }
        C17590mZ c17590mZ = new C17590mZ();
        ((ArrayList) c17590mZ.LIZ).clear();
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char charAt2 = str.charAt(i5);
                if ((charAt2 - 'Z') * (charAt2 - 'A') > 0) {
                    if ((charAt2 - 'z') * (charAt2 - 'a') > 0) {
                        continue;
                        i5++;
                    }
                }
                if (charAt2 != 'e' && charAt2 != 'E') {
                    break;
                }
                i5++;
            }
            String substring = str.substring(i6, i5);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - i3;
            int i7 = 0;
            boolean z2 = false;
            while (true) {
                c = ' ';
                if (i7 > length) {
                    break;
                }
                if (!z2) {
                    i2 = i7;
                } else {
                    i2 = length;
                }
                if (o.LJIIJJI(substring.charAt(i2), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i7++;
                    }
                } else {
                    if (!z) {
                        break;
                    }
                    length--;
                }
            }
            String LIZJ = C132805Jc.LIZJ(length, i3, substring, i7);
            if (LIZJ.length() > 0) {
                if (LIZJ.charAt(i4) == 'z' || LIZJ.charAt(i4) == 'Z') {
                    i = 0;
                    fArr = new float[i4];
                } else {
                    int length2 = LIZJ.length();
                    float[] fArr2 = new float[length2];
                    C17570mX c17570mX = new C17570mX(i4);
                    int length3 = LIZJ.length();
                    int i8 = 1;
                    int i9 = 0;
                    boolean z3 = i4;
                    while (i8 < length3) {
                        c17570mX.LIZIZ = z3;
                        boolean z4 = false;
                        int i10 = i8;
                        boolean z5 = z3;
                        while (true) {
                            if (i10 >= LIZJ.length() || (charAt = LIZJ.charAt(i10)) == c || charAt == ',') {
                                break;
                            }
                            z5 = z5;
                            z5 = z5;
                            if (charAt == '-') {
                                if (i10 != i8 && !z4) {
                                    c17570mX.LIZIZ = true;
                                    break;
                                }
                                z4 = false;
                            } else {
                                if (charAt == '.') {
                                    if (!z5) {
                                        z5 = true;
                                    } else {
                                        c17570mX.LIZIZ = true;
                                        break;
                                    }
                                } else {
                                    z5 = z5;
                                    if (charAt == 'e' || charAt == 'E') {
                                        z4 = true;
                                    }
                                }
                                z4 = false;
                            }
                            i10++;
                            c = ' ';
                            z5 = z5;
                        }
                        c17570mX.LIZ = i10;
                        if (i8 < i10) {
                            String substring2 = LIZJ.substring(i8, i10);
                            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            fArr2[i9] = CastFloatProtector.parseFloat(substring2);
                            i9++;
                        }
                        if (!c17570mX.LIZIZ) {
                            i10++;
                        }
                        i8 = i10;
                        z3 = 0;
                        c = ' ';
                    }
                    if (i9 >= 0) {
                        if (length2 >= 0) {
                            fArr = new float[i9];
                            i = 0;
                            System.arraycopy(fArr2, 0, fArr, 0, Math.min(i9, length2));
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                c17590mZ.LIZ(LIZJ.charAt(i), fArr);
            }
            i4 = 0;
            i6 = i5;
            i5++;
            i3 = 1;
        }
        if (i5 - i6 == i3 && i6 < str.length()) {
            c17590mZ.LIZ(str.charAt(i6), new float[i4]);
        }
        return c17590mZ.LIZ;
    }
}
