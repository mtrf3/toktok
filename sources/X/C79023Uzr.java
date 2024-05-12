package X;

import android.app.Activity;
import android.graphics.ColorSpace;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uzr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79023Uzr {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C79023Uzr(C79022Uzq c79022Uzq) {
        this.LIZ = c79022Uzq;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        arrayList.add(new C79024Uzs(c79022Uzq, new int[]{1}));
    }

    public /* synthetic */ C79023Uzr(Activity activity, Fragment fragment) {
        this.LIZ = new WeakReference(activity);
        this.LIZIZ = new WeakReference(fragment);
    }

    public final void LIZ(int i, int[] iArr) {
        C79024Uzs c79024Uzs;
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                char c = 0;
                int i2 = 1;
                if (i >= ((List) this.LIZIZ).size()) {
                    List list = (List) this.LIZIZ;
                    C79024Uzs c79024Uzs2 = (C79024Uzs) DIX.LIZJ(list, 1, list);
                    int size = ((List) this.LIZIZ).size();
                    while (size <= i) {
                        C79022Uzq c79022Uzq = (C79022Uzq) this.LIZ;
                        int[] iArr2 = new int[2];
                        iArr2[c] = i2;
                        iArr2[i2] = c79022Uzq.LIZ[(size - 1) + c79022Uzq.LJFF];
                        C79024Uzs c79024Uzs3 = new C79024Uzs(c79022Uzq, iArr2);
                        if (c79024Uzs2.LIZ.equals(c79022Uzq)) {
                            if (c79024Uzs2.LIZIZ() || c79024Uzs3.LIZIZ()) {
                                c79024Uzs2 = c79024Uzs2.LIZ.LIZJ;
                            } else {
                                int[] iArr3 = c79024Uzs2.LIZIZ;
                                int length2 = iArr3.length;
                                int[] iArr4 = c79024Uzs3.LIZIZ;
                                int length3 = iArr4.length;
                                int[] iArr5 = new int[(length2 + length3) - 1];
                                for (int i3 = 0; i3 < length2; i3++) {
                                    int i4 = iArr3[i3];
                                    for (int i5 = 0; i5 < length3; i5++) {
                                        int i6 = i3 + i5;
                                        i4 = i4;
                                        iArr5[i6] = c79024Uzs2.LIZ.LIZ(i4, iArr4[i5]) ^ iArr5[i6];
                                    }
                                }
                                c79024Uzs2 = new C79024Uzs(c79024Uzs2.LIZ, iArr5);
                            }
                            ((List) this.LIZIZ).add(c79024Uzs2);
                            size++;
                            c = 0;
                            i2 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                C79024Uzs c79024Uzs4 = (C79024Uzs) ListProtector.get((List) this.LIZIZ, i);
                int[] iArr6 = new int[length];
                System.arraycopy(iArr, 0, iArr6, 0, length);
                C79024Uzs LIZJ = new C79024Uzs((C79022Uzq) this.LIZ, iArr6).LIZJ(i, 1);
                if (LIZJ.LIZ.equals(c79024Uzs4.LIZ)) {
                    if (!c79024Uzs4.LIZIZ()) {
                        C79022Uzq c79022Uzq2 = LIZJ.LIZ;
                        C79024Uzs c79024Uzs5 = c79022Uzq2.LIZJ;
                        if (c79024Uzs4.LIZIZ[(r2.length - 1) - (r2.length - 1)] != 0) {
                            int i7 = c79022Uzq2.LIZ[(c79022Uzq2.LIZLLL - c79022Uzq2.LIZIZ[r3]) - 1];
                            C79024Uzs c79024Uzs6 = LIZJ;
                            while (c79024Uzs6.LIZIZ.length - 1 >= c79024Uzs4.LIZIZ.length - 1 && !c79024Uzs6.LIZIZ()) {
                                int length4 = (r3.length - 1) - (c79024Uzs4.LIZIZ.length - 1);
                                int LIZ = LIZJ.LIZ.LIZ(c79024Uzs6.LIZIZ[(r3.length - 1) - (r3.length - 1)], i7);
                                C79024Uzs LIZJ2 = c79024Uzs4.LIZJ(length4, LIZ);
                                C79022Uzq c79022Uzq3 = LIZJ.LIZ;
                                c79022Uzq3.getClass();
                                if (length4 >= 0) {
                                    if (LIZ == 0) {
                                        c79024Uzs = c79022Uzq3.LIZJ;
                                    } else {
                                        int[] iArr7 = new int[length4 + 1];
                                        iArr7[0] = LIZ;
                                        c79024Uzs = new C79024Uzs(c79022Uzq3, iArr7);
                                    }
                                    c79024Uzs5 = c79024Uzs5.LIZ(c79024Uzs);
                                    c79024Uzs6 = c79024Uzs6.LIZ(LIZJ2);
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            int[] iArr8 = c79024Uzs6.LIZIZ;
                            int length5 = i - iArr8.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                iArr[length + i8] = 0;
                            }
                            System.arraycopy(iArr8, 0, iArr, length + length5, iArr8.length);
                            return;
                        }
                        c79022Uzq2.getClass();
                        throw new ArithmeticException();
                    }
                    throw new IllegalArgumentException("Divide by 0");
                }
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    public /* synthetic */ C79023Uzr(int i, int i2, ColorSpace colorSpace) {
        Pair pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.LIZ = pair;
        this.LIZIZ = colorSpace;
    }
}
