package X;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.Zg2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90534Zg2 {
    public static final Comparator<C90533Zg1> LJFF = new C90532Zg0();
    public final int[] LIZ;
    public final int[] LIZIZ;
    public final List<C90537Zg5> LIZJ;
    public final InterfaceC90536Zg4[] LIZLLL;
    public final float[] LJ = new float[3];

    public static int LIZIZ(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C90534Zg2(int[] iArr, int i, InterfaceC90536Zg4[] interfaceC90536Zg4Arr) {
        C90533Zg1 c90533Zg1;
        int i2;
        int i3;
        this.LIZLLL = interfaceC90536Zg4Arr;
        int[] iArr2 = new int[32768];
        this.LIZIZ = iArr2;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            int LIZIZ = LIZIZ(Color.blue(i5), 8, 5) | (LIZIZ(Color.red(i5), 8, 5) << 10) | (LIZIZ(Color.green(i5), 8, 5) << 5);
            iArr[i4] = LIZIZ;
            iArr2[LIZIZ] = iArr2[LIZIZ] + 1;
        }
        int i6 = 0;
        int i7 = 0;
        do {
            if (iArr2[i6] > 0) {
                int rgb = Color.rgb(LIZIZ((i6 >> 10) & 31, 5, 8), LIZIZ((i6 >> 5) & 31, 5, 8), LIZIZ(i6 & 31, 5, 8));
                C07290Qj.LIZ(Color.red(rgb), Color.green(rgb), Color.blue(rgb), this.LJ);
                float[] fArr = this.LJ;
                InterfaceC90536Zg4[] interfaceC90536Zg4Arr2 = this.LIZLLL;
                if (interfaceC90536Zg4Arr2 != null && interfaceC90536Zg4Arr2.length > 0) {
                    int length = interfaceC90536Zg4Arr2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        if (!this.LIZLLL[i8].LIZ(fArr)) {
                            iArr2[i6] = 0;
                            break;
                        }
                        i8++;
                    }
                }
            }
            i7 = iArr2[i6] > 0 ? i7 + 1 : i7;
            i6++;
        } while (i6 < 32768);
        int[] iArr3 = new int[i7];
        this.LIZ = iArr3;
        int i9 = 0;
        int i10 = 0;
        do {
            if (iArr2[i9] > 0) {
                iArr3[i10] = i9;
                i10++;
            }
            i9++;
        } while (i9 < 32768);
        if (i7 <= i) {
            this.LIZJ = new ArrayList();
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = iArr3[i11];
                ((ArrayList) this.LIZJ).add(new C90537Zg5(Color.rgb(LIZIZ((i12 >> 10) & 31, 5, 8), LIZIZ((i12 >> 5) & 31, 5, 8), LIZIZ(i12 & 31, 5, 8)), iArr2[i12]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, LJFF);
        priorityQueue.offer(new C90533Zg1(this, 0, this.LIZ.length - 1));
        while (priorityQueue.size() < i && (c90533Zg1 = (C90533Zg1) priorityQueue.poll()) != null) {
            int i13 = c90533Zg1.LIZIZ;
            int i14 = c90533Zg1.LIZ;
            if ((i13 + 1) - i14 <= 1) {
                break;
            }
            if ((i13 + 1) - i14 > 1) {
                int i15 = c90533Zg1.LJ - c90533Zg1.LIZLLL;
                int i16 = c90533Zg1.LJI - c90533Zg1.LJFF;
                int i17 = c90533Zg1.LJIIIIZZ - c90533Zg1.LJII;
                if (i15 >= i16 && i15 >= i17) {
                    i2 = -3;
                } else if (i16 >= i15 && i16 >= i17) {
                    i2 = -2;
                } else {
                    i2 = -1;
                }
                C90534Zg2 c90534Zg2 = c90533Zg1.LJIIIZ;
                int[] iArr4 = c90534Zg2.LIZ;
                int[] iArr5 = c90534Zg2.LIZIZ;
                LIZ(i2, i14, iArr4, i13);
                Arrays.sort(iArr4, c90533Zg1.LIZ, c90533Zg1.LIZIZ + 1);
                LIZ(i2, c90533Zg1.LIZ, iArr4, c90533Zg1.LIZIZ);
                int i18 = c90533Zg1.LIZJ / 2;
                int i19 = c90533Zg1.LIZ;
                int i20 = 0;
                while (true) {
                    int i21 = c90533Zg1.LIZIZ;
                    if (i19 <= i21) {
                        i20 += iArr5[iArr4[i19]];
                        if (i20 >= i18) {
                            i3 = Math.min(i21 - 1, i19);
                            break;
                        }
                        i19++;
                    } else {
                        i3 = c90533Zg1.LIZ;
                        break;
                    }
                }
                C90533Zg1 c90533Zg12 = new C90533Zg1(c90533Zg1.LJIIIZ, i3 + 1, c90533Zg1.LIZIZ);
                c90533Zg1.LIZIZ = i3;
                c90533Zg1.LIZ();
                priorityQueue.offer(c90533Zg12);
                priorityQueue.offer(c90533Zg1);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C90533Zg1 c90533Zg13 = (C90533Zg1) it.next();
            C90534Zg2 c90534Zg22 = c90533Zg13.LJIIIZ;
            int[] iArr6 = c90534Zg22.LIZ;
            int[] iArr7 = c90534Zg22.LIZIZ;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = c90533Zg13.LIZ; i26 <= c90533Zg13.LIZIZ; i26++) {
                int i27 = iArr6[i26];
                int i28 = iArr7[i27];
                i23 += i28;
                i22 += ((i27 >> 10) & 31) * i28;
                i24 += ((i27 >> 5) & 31) * i28;
                i25 += i28 * (i27 & 31);
            }
            float f = i23;
            C90537Zg5 c90537Zg5 = new C90537Zg5(Color.rgb(LIZIZ(Math.round(i22 / f), 5, 8), LIZIZ(Math.round(i24 / f), 5, 8), LIZIZ(Math.round(i25 / f), 5, 8)), i23);
            float[] LIZIZ2 = c90537Zg5.LIZIZ();
            InterfaceC90536Zg4[] interfaceC90536Zg4Arr3 = this.LIZLLL;
            if (interfaceC90536Zg4Arr3 != null && interfaceC90536Zg4Arr3.length > 0) {
                int length2 = interfaceC90536Zg4Arr3.length;
                for (int i29 = 0; i29 < length2; i29++) {
                    if (!this.LIZLLL[i29].LIZ(LIZIZ2)) {
                        break;
                    }
                }
            }
            arrayList.add(c90537Zg5);
        }
        this.LIZJ = arrayList;
    }

    public static void LIZ(int i, int i2, int[] iArr, int i3) {
        if (i != -2) {
            if (i != -1) {
                return;
            }
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = ((i4 >> 10) & 31) | ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5);
                i2++;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
            i2++;
        }
    }
}
