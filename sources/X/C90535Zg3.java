package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Zg3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90535Zg3 {
    public final Bitmap LIZ;
    public final List<C90539Zg7> LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<InterfaceC90536Zg4> LJFF;

    public final C90538Zg6 LIZ() {
        int max;
        int i;
        double d;
        InterfaceC90536Zg4[] interfaceC90536Zg4Arr;
        int i2;
        char c;
        float f;
        float f2;
        float f3;
        Bitmap bitmap = this.LIZ;
        if (bitmap != null) {
            if (this.LIZLLL > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i3 = this.LIZLLL;
                if (width > i3) {
                    d = Math.sqrt(i3 / width);
                }
                d = -1.0d;
            } else {
                if (this.LJ > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.LJ)) {
                    d = i / max;
                }
                d = -1.0d;
            }
            char c2 = 0;
            if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
            }
            int width2 = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width2 * height];
            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
            int i4 = this.LIZJ;
            if (((ArrayList) this.LJFF).isEmpty()) {
                interfaceC90536Zg4Arr = null;
            } else {
                ArrayList arrayList = (ArrayList) this.LJFF;
                interfaceC90536Zg4Arr = (InterfaceC90536Zg4[]) arrayList.toArray(new InterfaceC90536Zg4[arrayList.size()]);
            }
            C90534Zg2 c90534Zg2 = new C90534Zg2(iArr, i4, interfaceC90536Zg4Arr);
            if (bitmap != this.LIZ) {
                bitmap.recycle();
            }
            List<C90537Zg5> list = c90534Zg2.LIZJ;
            List<C90539Zg7> list2 = this.LIZIZ;
            C90538Zg6 c90538Zg6 = new C90538Zg6(list, list2);
            int size = ((ArrayList) list2).size();
            int i5 = 0;
            while (i5 < size) {
                C90539Zg7 c90539Zg7 = (C90539Zg7) ListProtector.get(c90538Zg6.LIZIZ, i5);
                int length = c90539Zg7.LIZJ.length;
                float f4 = 0.0f;
                float f5 = 0.0f;
                for (int i6 = 0; i6 < length; i6++) {
                    float f6 = c90539Zg7.LIZJ[i6];
                    if (f6 > 0.0f) {
                        f5 += f6;
                    }
                }
                if (f5 != 0.0f) {
                    int length2 = c90539Zg7.LIZJ.length;
                    for (int i7 = 0; i7 < length2; i7++) {
                        float[] fArr = c90539Zg7.LIZJ;
                        float f7 = fArr[i7];
                        if (f7 > 0.0f) {
                            fArr[i7] = f7 / f5;
                        }
                    }
                }
                C1HQ c1hq = c90538Zg6.LIZJ;
                int size2 = c90538Zg6.LIZ.size();
                int i8 = 0;
                C90537Zg5 c90537Zg5 = null;
                float f8 = 0.0f;
                while (i8 < size2) {
                    C90537Zg5 c90537Zg52 = (C90537Zg5) ListProtector.get(c90538Zg6.LIZ, i8);
                    float[] LIZIZ = c90537Zg52.LIZIZ();
                    float f9 = LIZIZ[1];
                    float[] fArr2 = c90539Zg7.LIZ;
                    if (f9 >= fArr2[c2] && f9 <= fArr2[2]) {
                        float f10 = LIZIZ[2];
                        float[] fArr3 = c90539Zg7.LIZIZ;
                        if (f10 >= fArr3[c2] && f10 <= fArr3[2] && !c90538Zg6.LIZLLL.get(c90537Zg52.LIZLLL)) {
                            float[] LIZIZ2 = c90537Zg52.LIZIZ();
                            C90537Zg5 c90537Zg53 = c90538Zg6.LJ;
                            if (c90537Zg53 != null) {
                                i2 = c90537Zg53.LJ;
                            } else {
                                i2 = 1;
                            }
                            float f11 = c90539Zg7.LIZJ[c2];
                            if (f11 > f4) {
                                c = 1;
                                f = f11 * (1.0f - Math.abs(LIZIZ2[1] - c90539Zg7.LIZ[1]));
                            } else {
                                c = 1;
                                f = 0.0f;
                            }
                            float f12 = c90539Zg7.LIZJ[c];
                            if (f12 > f4) {
                                f2 = f12 * (1.0f - Math.abs(LIZIZ2[2] - c90539Zg7.LIZIZ[c]));
                            } else {
                                f2 = 0.0f;
                            }
                            float f13 = c90539Zg7.LIZJ[2];
                            if (f13 > 0.0f) {
                                f3 = f13 * (c90537Zg52.LJ / i2);
                            } else {
                                f3 = 0.0f;
                            }
                            float f14 = f + f2 + f3;
                            if (c90537Zg5 == null || f14 > f8) {
                                f8 = f14;
                                c90537Zg5 = c90537Zg52;
                            }
                        }
                    }
                    i8++;
                    c2 = 0;
                    f4 = 0.0f;
                }
                if (c90537Zg5 != null && c90539Zg7.LIZLLL) {
                    c90538Zg6.LIZLLL.append(c90537Zg5.LIZLLL, true);
                }
                c1hq.put(c90539Zg7, c90537Zg5);
                i5++;
                c2 = 0;
            }
            c90538Zg6.LIZLLL.clear();
            return c90538Zg6;
        }
        throw new AssertionError();
    }

    public C90535Zg3(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = 16;
        this.LIZLLL = 12544;
        this.LJ = -1;
        ArrayList arrayList2 = new ArrayList();
        this.LJFF = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(C90538Zg6.LJFF);
            this.LIZ = bitmap;
            arrayList.add(C90539Zg7.LJ);
            arrayList.add(C90539Zg7.LJFF);
            arrayList.add(C90539Zg7.LJI);
            arrayList.add(C90539Zg7.LJII);
            arrayList.add(C90539Zg7.LJIIIIZZ);
            arrayList.add(C90539Zg7.LJIIIZ);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }
}
