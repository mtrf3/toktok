package X;

import android.text.TextPaint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bej, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29301Bej {
    public final TextPaint LIZ;
    public final float LIZIZ;
    public HashMap<String, Float> LIZJ;
    public ArrayList<C29299Beh> LIZLLL;
    public float LJ;

    public final float LIZLLL(String str) {
        if (this.LIZJ.containsKey(str)) {
            Float f = this.LIZJ.get(str);
            if (f == null) {
                return 0.0f;
            }
            return f.floatValue();
        }
        float[] fArr = new float[1];
        this.LIZ.breakText(str, true, this.LIZIZ, fArr);
        this.LIZJ.put(str, Float.valueOf(fArr[0]));
        return fArr[0];
    }

    public C29301Bej(TextPaint textPaint, float f) {
        o.LJIIIZ(textPaint, "textPaint");
        this.LIZ = textPaint;
        this.LIZIZ = f;
        this.LIZJ = new HashMap<>();
        this.LIZLLL = new ArrayList<>();
    }

    public final void LIZ(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (i >= arrayList.size()) {
            return;
        }
        int size = arrayList.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = i; i2 < size; i2++) {
            f2 += LIZLLL((String) ListProtector.get(list, i2));
        }
        if (f2 > this.LIZIZ) {
            int i3 = 0;
            int i4 = i;
            do {
                int LIZIZ = LIZIZ(i4, list);
                if (LIZIZ != -1) {
                    i4 = LIZIZ + 1;
                    i3++;
                } else {
                    float f3 = f2 / 2;
                    int size2 = arrayList.size();
                    int i5 = i;
                    while (i5 < size2) {
                        float LIZLLL = LIZLLL((String) ListProtector.get(list, i5)) + f;
                        if (LIZLLL >= f3) {
                            if (f3 - f < LIZLLL - f3) {
                                i5--;
                            }
                            C29299Beh LJ = LJ(i, i5, list);
                            if (LJ != null) {
                                this.LIZLLL.add(LJ);
                            }
                            C29299Beh LJ2 = LJ(i5 + 1, arrayList.size() - 1, list);
                            if (LJ2 != null) {
                                this.LIZLLL.add(LJ2);
                                return;
                            }
                            return;
                        }
                        i5++;
                        f = LIZLLL;
                    }
                    return;
                }
            } while (i3 <= 2);
            while (true) {
                int LIZIZ2 = LIZIZ(i, list);
                if (LIZIZ2 != -1) {
                    C29299Beh LJ3 = LJ(i, LIZIZ2, list);
                    if (LJ3 != null) {
                        this.LIZLLL.add(LJ3);
                    }
                    if (this.LIZLLL.size() < 2) {
                        i = LIZIZ2 + 1;
                    } else {
                        if (LIZIZ2 != -1 && LIZIZ2 < arrayList.size() - 1) {
                            LIZ(LIZIZ2 + 1, list);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            C29299Beh LJ4 = LJ(i, arrayList.size() - 1, list);
            if (LJ4 != null) {
                this.LIZLLL.add(LJ4);
            }
        }
    }

    public final int LIZIZ(int i, List list) {
        int size = ((ArrayList) list).size();
        float f = 0.0f;
        while (i < size) {
            f += LIZLLL((String) ListProtector.get(list, i));
            if (f > this.LIZIZ) {
                return i - 1;
            }
            if (i == r4.size() - 1 && f > 0.0f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[LOOP:0: B:11:0x0028->B:13:0x002e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[LOOP:1: B:16:0x006c->B:18:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC67352kd<? super java.util.ArrayList<X.C29299Beh>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C29302Bek
            if (r0 == 0) goto L60
            r5 = r8
            X.Bek r5 = (X.C29302Bek) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L83
            X.Bej r4 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            java.util.ArrayList<X.Beh> r0 = r4.LIZLLL
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()
            X.Beh r0 = (X.C29299Beh) r0
            float r1 = r4.LJ
            float r0 = r0.LIZIZ
            float r1 = r1 + r0
            r4.LJ = r1
            goto L28
        L3c:
            X.C141335gf.LIZJ(r1)
            int r0 = r7.length()
            if (r0 != 0) goto L4b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L4b:
            X.XIA r2 = X.C78613UtF.LIZJ
            X.Bel r1 = new X.Bel
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r3
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r5)
            if (r0 != r4) goto L5e
            return r4
        L5e:
            r4 = r6
            goto L22
        L60:
            X.Bek r5 = new X.Bek
            r5.<init>(r6, r8)
            goto L12
        L66:
            java.util.ArrayList<X.Beh> r0 = r4.LIZLLL
            java.util.Iterator r3 = r0.iterator()
        L6c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r2 = r3.next()
            X.Beh r2 = (X.C29299Beh) r2
            float r1 = r2.LIZIZ
            float r0 = r4.LJ
            float r1 = r1 / r0
            r2.LIZIZ = r1
            goto L6c
        L80:
            java.util.ArrayList<X.Beh> r0 = r4.LIZLLL
            return r0
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29301Bej.LIZJ(java.lang.String, X.2kd):java.lang.Object");
    }

    public final C29299Beh LJ(int i, int i2, List<String> list) {
        if (i2 < i || i < 0 || i2 >= ((ArrayList) list).size()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        float f = 0.0f;
        if (i <= i2) {
            while (true) {
                sb.append((String) ListProtector.get(list, i));
                f += LIZLLL((String) ListProtector.get(list, i));
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "s.toString()");
        return new C29299Beh(sb2, f);
    }
}
