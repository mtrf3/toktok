package X;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vch, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80135Vch {
    public final InterfaceC80136Vci LIZ;
    public boolean[] LIZIZ;
    public int[] LIZJ;
    public long[] LIZLLL;
    public long[] LJ;

    public C80135Vch(InterfaceC80136Vci interfaceC80136Vci) {
        this.LIZ = interfaceC80136Vci;
    }

    public final List<C80138Vck> LJFF(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.LIZ.LJIIIZ(i2).getLayoutParams();
            C80138Vck c80138Vck = new C80138Vck();
            c80138Vck.LJLILLLLZI = flexItem.getOrder();
            c80138Vck.LJLIL = i2;
            arrayList.add(c80138Vck);
        }
        return arrayList;
    }

    public final void LJIIIIZZ(int i) {
        int[] iArr = this.LIZJ;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.LIZJ = new int[i];
        } else {
            if (iArr.length >= i) {
                return;
            }
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.LIZJ = Arrays.copyOf(iArr, i);
        }
    }

    public final void LJIIIZ(int i) {
        long[] jArr = this.LIZLLL;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.LIZLLL = new long[i];
        } else {
            if (jArr.length >= i) {
                return;
            }
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.LIZLLL = Arrays.copyOf(jArr, i);
        }
    }

    public final void LJIIJ(int i) {
        long[] jArr = this.LJ;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.LJ = new long[i];
        } else {
            if (jArr.length >= i) {
                return;
            }
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.LJ = Arrays.copyOf(jArr, i);
        }
    }

    public final void LJIJJ(int i) {
        int i2;
        View LJIIJJI;
        if (i >= this.LIZ.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.LIZ.getFlexDirection();
        if (this.LIZ.getAlignItems() == 4) {
            int[] iArr = this.LIZJ;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List<C80134Vcg> flexLinesInternal = this.LIZ.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i2 < size) {
                C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(flexLinesInternal, i2);
                int i3 = c80134Vcg.LJII;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c80134Vcg.LJIILJJIL + i4;
                    if (i4 < this.LIZ.getFlexItemCount() && (LJIIJJI = this.LIZ.LJIIJJI(i5)) != null && LJIIJJI.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) LJIIJJI.getLayoutParams();
                        if (flexItem.LLLZZ() == -1 || flexItem.LLLZZ() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection == 2 || flexDirection == 3) {
                                    LJIJ(c80134Vcg.LJI, i5, LJIIJJI);
                                } else {
                                    throw new IllegalArgumentException(KMP.LJ("Invalid flex direction: ", flexDirection));
                                }
                            } else {
                                LJIJI(c80134Vcg.LJI, i5, LJIIJJI);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (C80134Vcg c80134Vcg2 : this.LIZ.getFlexLinesInternal()) {
            Iterator it = ((ArrayList) c80134Vcg2.LJIILIIL).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                View LJIIJJI2 = this.LIZ.LJIIJJI(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection == 2 || flexDirection == 3) {
                        LJIJ(c80134Vcg2.LJI, num.intValue(), LJIIJJI2);
                    } else {
                        throw new IllegalArgumentException(KMP.LJ("Invalid flex direction: ", flexDirection));
                    }
                } else {
                    LJIJI(c80134Vcg2.LJI, num.intValue(), LJIIJJI2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r6, android.view.View r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r4 = (com.google.android.flexbox.FlexItem) r4
            int r3 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r0 = r4.getMinWidth()
            if (r3 >= r0) goto L47
            int r3 = r4.getMinWidth()
        L18:
            r1 = 1
        L19:
            int r0 = r4.getMinHeight()
            if (r2 >= r0) goto L39
            int r2 = r4.getMinHeight()
        L23:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r5.LJIJJLI(r7, r6, r1, r0)
            X.Vci r0 = r5.LIZ
            r0.LJIILL(r6, r7)
        L38:
            return
        L39:
            int r0 = r4.getMaxHeight()
            if (r2 <= r0) goto L44
            int r2 = r4.getMaxHeight()
            goto L23
        L44:
            if (r1 == 0) goto L38
            goto L23
        L47:
            int r0 = r4.getMaxWidth()
            if (r3 <= r0) goto L52
            int r3 = r4.getMaxWidth()
            goto L18
        L52:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80135Vch.LIZJ(int, android.view.View):void");
    }

    public final void LIZLLL(int i, List list) {
        int i2 = this.LIZJ[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            ListProtector.remove(list, size);
        }
        int[] iArr = this.LIZJ;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.LIZLLL;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public static List LJ(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C80134Vcg c80134Vcg = new C80134Vcg();
        c80134Vcg.LJI = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c80134Vcg);
            }
            arrayList.add(ListProtector.get(list, i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c80134Vcg);
            }
        }
        return arrayList;
    }

    public static int[] LJIIZILJ(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = ((ArrayList) list).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C80138Vck c80138Vck = (C80138Vck) it.next();
            int i3 = c80138Vck.LJLIL;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c80138Vck.LJLILLLLZI);
            i2++;
        }
        return iArr;
    }

    public final void LJI(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.LIZ.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection == 2 || flexDirection == 3) {
                mode = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
            } else {
                throw new IllegalArgumentException(KMP.LJ("Invalid flex direction: ", flexDirection));
            }
        } else {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        }
        List<C80134Vcg> flexLinesInternal = this.LIZ.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.LIZ.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C80134Vcg) ListProtector.get(flexLinesInternal, 0)).LJI = size - i3;
                return;
            }
            if (flexLinesInternal.size() < 2) {
                return;
            }
            int alignContent = this.LIZ.getAlignContent();
            if (alignContent != 1) {
                if (alignContent != 2) {
                    if (alignContent != 3) {
                        if (alignContent != 4) {
                            if (alignContent != 5 || sumOfCrossSize >= size) {
                                return;
                            }
                            float size2 = (size - sumOfCrossSize) / flexLinesInternal.size();
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i4 < size3) {
                                C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(flexLinesInternal, i4);
                                float f2 = c80134Vcg.LJI + size2;
                                if (i4 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                float f3 = (f2 - round) + f;
                                if (f3 > 1.0f) {
                                    round++;
                                    f3 -= 1.0f;
                                } else if (f3 < -1.0f) {
                                    round--;
                                    f3 += 1.0f;
                                }
                                f = f3;
                                c80134Vcg.LJI = round;
                                i4++;
                            }
                            return;
                        }
                        if (sumOfCrossSize >= size) {
                            this.LIZ.setFlexLines(LJ(size, sumOfCrossSize, flexLinesInternal));
                            return;
                        }
                        int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C80134Vcg c80134Vcg2 = new C80134Vcg();
                        c80134Vcg2.LJI = size4;
                        for (C80134Vcg c80134Vcg3 : flexLinesInternal) {
                            arrayList.add(c80134Vcg2);
                            arrayList.add(c80134Vcg3);
                            arrayList.add(c80134Vcg2);
                        }
                        this.LIZ.setFlexLines(arrayList);
                        return;
                    }
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f4 = 0.0f;
                    while (i4 < size6) {
                        arrayList2.add(ListProtector.get(flexLinesInternal, i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            C80134Vcg c80134Vcg4 = new C80134Vcg();
                            if (i4 == flexLinesInternal.size() - 2) {
                                c80134Vcg4.LJI = Math.round(f4 + size5);
                                f4 = 0.0f;
                            } else {
                                c80134Vcg4.LJI = Math.round(size5);
                            }
                            int i5 = c80134Vcg4.LJI;
                            float f5 = (size5 - i5) + f4;
                            if (f5 > 1.0f) {
                                c80134Vcg4.LJI = i5 + 1;
                                f5 -= 1.0f;
                            } else if (f5 < -1.0f) {
                                c80134Vcg4.LJI = i5 - 1;
                                f5 += 1.0f;
                            }
                            arrayList2.add(c80134Vcg4);
                            f4 = f5;
                        }
                        i4++;
                    }
                    this.LIZ.setFlexLines(arrayList2);
                    return;
                }
                this.LIZ.setFlexLines(LJ(size, sumOfCrossSize, flexLinesInternal));
                return;
            }
            C80134Vcg c80134Vcg5 = new C80134Vcg();
            c80134Vcg5.LJI = size - sumOfCrossSize;
            ListProtector.add(flexLinesInternal, 0, c80134Vcg5);
        }
    }

    public final void LJII(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int flexItemCount = this.LIZ.getFlexItemCount();
        boolean[] zArr = this.LIZIZ;
        int i4 = 0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.LIZIZ = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.LIZIZ = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= this.LIZ.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.LIZ.getFlexDirection();
        int flexDirection2 = this.LIZ.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode = View.MeasureSpec.getMode(i2);
                size = View.MeasureSpec.getSize(i2);
                if (mode != 1073741824) {
                    size = this.LIZ.getLargestMainSize();
                }
                paddingLeft = this.LIZ.getPaddingTop();
                paddingRight = this.LIZ.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(KMP.LJ("Invalid flex direction: ", flexDirection));
            }
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.LIZ.getLargestMainSize();
            if (mode2 != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.LIZ.getPaddingLeft();
            paddingRight = this.LIZ.getPaddingRight();
        }
        int i5 = paddingRight + paddingLeft;
        int[] iArr = this.LIZJ;
        if (iArr != null) {
            i4 = iArr[i3];
        }
        List<C80134Vcg> flexLinesInternal = this.LIZ.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i4 < size2) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(flexLinesInternal, i4);
            int i6 = c80134Vcg.LJ;
            if (i6 < size && c80134Vcg.LJIILLIIL) {
                LJIIJJI(i, i2, c80134Vcg, size, i5, false);
            } else if (i6 > size && c80134Vcg.LJIIZILJ) {
                LJIILLIIL(i, i2, c80134Vcg, size, i5, false);
            }
            i4++;
        }
    }

    public final int LJIIL(int i, FlexItem flexItem, int i2) {
        InterfaceC80136Vci interfaceC80136Vci = this.LIZ;
        int LJIIJ = interfaceC80136Vci.LJIIJ(i, this.LIZ.getPaddingBottom() + interfaceC80136Vci.getPaddingTop() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(LJIIJ);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(LJIIJ));
        }
        if (size >= flexItem.getMinHeight()) {
            return LJIIJ;
        }
        return View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(LJIIJ));
    }

    public final int LJIILIIL(int i, FlexItem flexItem, int i2) {
        InterfaceC80136Vci interfaceC80136Vci = this.LIZ;
        int LJIILJJIL = interfaceC80136Vci.LJIILJJIL(i, this.LIZ.getPaddingRight() + interfaceC80136Vci.getPaddingLeft() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(LJIILJJIL);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(LJIILJJIL));
        }
        if (size >= flexItem.getMinWidth()) {
            return LJIILJJIL;
        }
        return View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(LJIILJJIL));
    }

    public final void LJIJ(int i, int i2, View view) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.LIZ.LJ(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.LJ;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i2] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        LJIJJLI(view, i2, makeMeasureSpec2, makeMeasureSpec);
        this.LIZ.LJIILL(i2, view);
    }

    public final void LJIJI(int i, int i2, View view) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.LIZ.LJ(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.LJ;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        LJIJJLI(view, i2, makeMeasureSpec, makeMeasureSpec2);
        this.LIZ.LJIILL(i2, view);
    }

    public final void LIZ(List<C80134Vcg> list, C80134Vcg c80134Vcg, int i, int i2) {
        c80134Vcg.LJIIL = i2;
        this.LIZ.LJI(c80134Vcg);
        c80134Vcg.LJIILL = i;
        list.add(c80134Vcg);
    }

    public final void LJIJJLI(View view, int i, int i2, int i3) {
        long[] jArr = this.LIZLLL;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = this.LJ;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    public final void LJIIJJI(int i, int i2, C80134Vcg c80134Vcg, int i3, int i4, boolean z) {
        int i5;
        double d;
        double d2;
        float f = c80134Vcg.LJIIIZ;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = c80134Vcg.LJ)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        c80134Vcg.LJ = i4 + c80134Vcg.LJFF;
        if (!z) {
            c80134Vcg.LJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f4 = 0.0f;
        while (i6 < c80134Vcg.LJII) {
            int i8 = c80134Vcg.LJIILJJIL + i6;
            View LJIIJJI = this.LIZ.LJIIJJI(i8);
            if (LJIIJJI != null && LJIIJJI.getVisibility() != 8) {
                FlexItem flexItem = (FlexItem) LJIIJJI.getLayoutParams();
                int flexDirection = this.LIZ.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = LJIIJJI.getMeasuredWidth();
                    long[] jArr = this.LJ;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = LJIIJJI.getMeasuredHeight();
                    long[] jArr2 = this.LJ;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.LIZIZ[i8] && flexItem.LLIIL() > 0.0f) {
                        float LLIIL = (flexItem.LLIIL() * f3) + measuredWidth;
                        if (i6 == c80134Vcg.LJII - 1) {
                            LLIIL += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(LLIIL);
                        if (round > flexItem.getMaxWidth()) {
                            round = flexItem.getMaxWidth();
                            this.LIZIZ[i8] = true;
                            c80134Vcg.LJIIIZ -= flexItem.LLIIL();
                            z2 = true;
                        } else {
                            float f5 = (LLIIL - round) + f4;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = f5;
                            }
                            f5 = (float) d;
                            f4 = f5;
                        }
                        int LJIIL = LJIIL(i2, flexItem, c80134Vcg.LJIIL);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        LJIIJJI.measure(makeMeasureSpec, LJIIL);
                        measuredWidth = LJIIJJI.getMeasuredWidth();
                        measuredHeight = LJIIJJI.getMeasuredHeight();
                        LJIJJLI(LJIIJJI, i8, makeMeasureSpec, LJIIL);
                        this.LIZ.LJIILL(i8, LJIIJJI);
                    }
                    i7 = Math.max(i7, this.LIZ.LJ(LJIIJJI) + measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom());
                    c80134Vcg.LJ = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + c80134Vcg.LJ;
                } else {
                    int measuredHeight2 = LJIIJJI.getMeasuredHeight();
                    long[] jArr3 = this.LJ;
                    if (jArr3 != null) {
                        measuredHeight2 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth2 = LJIIJJI.getMeasuredWidth();
                    long[] jArr4 = this.LJ;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i8];
                    }
                    if (!this.LIZIZ[i8] && flexItem.LLIIL() > f2) {
                        float LLIIL2 = (flexItem.LLIIL() * f3) + measuredHeight2;
                        if (i6 == c80134Vcg.LJII - 1) {
                            LLIIL2 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(LLIIL2);
                        if (round2 > flexItem.getMaxHeight()) {
                            round2 = flexItem.getMaxHeight();
                            this.LIZIZ[i8] = true;
                            c80134Vcg.LJIIIZ -= flexItem.LLIIL();
                            z2 = true;
                        } else {
                            float f6 = (LLIIL2 - round2) + f4;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            } else {
                                f4 = f6;
                            }
                            f4 = (float) d2;
                        }
                        int LJIILIIL = LJIILIIL(i, flexItem, c80134Vcg.LJIIL);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        LJIIJJI.measure(LJIILIIL, makeMeasureSpec2);
                        measuredWidth2 = LJIIJJI.getMeasuredWidth();
                        measuredHeight2 = LJIIJJI.getMeasuredHeight();
                        LJIJJLI(LJIIJJI, i8, LJIILIIL, makeMeasureSpec2);
                        this.LIZ.LJIILL(i8, LJIIJJI);
                    }
                    i7 = Math.max(i7, this.LIZ.LJ(LJIIJJI) + measuredWidth2 + flexItem.getMarginLeft() + flexItem.getMarginRight());
                    c80134Vcg.LJ = measuredHeight2 + flexItem.getMarginTop() + flexItem.getMarginBottom() + c80134Vcg.LJ;
                }
                c80134Vcg.LJI = Math.max(c80134Vcg.LJI, i7);
            }
            i6++;
            f2 = 0.0f;
        }
        if (!z2 || i5 == c80134Vcg.LJ) {
            return;
        }
        LJIIJJI(i, i2, c80134Vcg, i3, i4, true);
    }

    public final void LJIILJJIL(View view, C80134Vcg c80134Vcg, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.LIZ.getAlignItems();
        if (flexItem.LLLZZ() != -1) {
            alignItems = flexItem.LLLZZ();
        }
        int i5 = c80134Vcg.LJI;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.LIZ.getFlexWrap() != 2) {
                        int max = Math.max(c80134Vcg.LJIIJJI - view.getBaseline(), flexItem.getMarginTop());
                        view.layout(i, i2 + max, i3, i4 + max);
                        return;
                    } else {
                        int max2 = Math.max(view.getBaseline() + (c80134Vcg.LJIIJJI - view.getMeasuredHeight()), flexItem.getMarginBottom());
                        view.layout(i, i2 - max2, i3, i4 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                    if (this.LIZ.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        C17M.LIZIZ(view, i6, i, i6, i3);
                        return;
                    } else {
                        int i7 = i2 - measuredHeight;
                        C17M.LIZIZ(view, i7, i, i7, i3);
                        return;
                    }
                }
            } else if (this.LIZ.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i8 - flexItem.getMarginBottom());
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.getMarginTop(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.getMarginTop());
                return;
            }
        }
        if (this.LIZ.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    public final void LJIILLIIL(int i, int i2, C80134Vcg c80134Vcg, int i3, int i4, boolean z) {
        int i5 = c80134Vcg.LJ;
        float f = c80134Vcg.LJIIJ;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i5) {
            return;
        }
        float f3 = (i5 - i3) / f;
        c80134Vcg.LJ = i4 + c80134Vcg.LJFF;
        if (!z) {
            c80134Vcg.LJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f4 = 0.0f;
        while (i6 < c80134Vcg.LJII) {
            int i8 = c80134Vcg.LJIILJJIL + i6;
            View LJIIJJI = this.LIZ.LJIIJJI(i8);
            if (LJIIJJI != null && LJIIJJI.getVisibility() != 8) {
                FlexItem flexItem = (FlexItem) LJIIJJI.getLayoutParams();
                int flexDirection = this.LIZ.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = LJIIJJI.getMeasuredWidth();
                    long[] jArr = this.LJ;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = LJIIJJI.getMeasuredHeight();
                    long[] jArr2 = this.LJ;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.LIZIZ[i8] && flexItem.LLFII() > 0.0f) {
                        float LLFII = measuredWidth - (flexItem.LLFII() * f3);
                        if (i6 == c80134Vcg.LJII - 1) {
                            LLFII += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(LLFII);
                        if (round < flexItem.getMinWidth()) {
                            round = flexItem.getMinWidth();
                            this.LIZIZ[i8] = true;
                            c80134Vcg.LJIIJ -= flexItem.LLFII();
                            z2 = true;
                        } else {
                            float f5 = (LLFII - round) + f4;
                            double d = f5;
                            if (d > 1.0d) {
                                round++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f5 += 1.0f;
                            }
                            f4 = f5;
                        }
                        int LJIIL = LJIIL(i2, flexItem, c80134Vcg.LJIIL);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        LJIIJJI.measure(makeMeasureSpec, LJIIL);
                        measuredWidth = LJIIJJI.getMeasuredWidth();
                        measuredHeight = LJIIJJI.getMeasuredHeight();
                        LJIJJLI(LJIIJJI, i8, makeMeasureSpec, LJIIL);
                        this.LIZ.LJIILL(i8, LJIIJJI);
                    }
                    i7 = Math.max(i7, this.LIZ.LJ(LJIIJJI) + measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom());
                    c80134Vcg.LJ = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + c80134Vcg.LJ;
                } else {
                    int measuredHeight2 = LJIIJJI.getMeasuredHeight();
                    long[] jArr3 = this.LJ;
                    if (jArr3 != null) {
                        measuredHeight2 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth2 = LJIIJJI.getMeasuredWidth();
                    long[] jArr4 = this.LJ;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i8];
                    }
                    if (!this.LIZIZ[i8] && flexItem.LLFII() > f2) {
                        float LLFII2 = measuredHeight2 - (flexItem.LLFII() * f3);
                        if (i6 == c80134Vcg.LJII - 1) {
                            LLFII2 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(LLFII2);
                        if (round2 < flexItem.getMinHeight()) {
                            round2 = flexItem.getMinHeight();
                            this.LIZIZ[i8] = true;
                            c80134Vcg.LJIIJ -= flexItem.LLFII();
                            z2 = true;
                        } else {
                            float f6 = (LLFII2 - round2) + f4;
                            double d2 = f6;
                            if (d2 > 1.0d) {
                                round2++;
                                f6 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f6 += 1.0f;
                            }
                            f4 = f6;
                        }
                        int LJIILIIL = LJIILIIL(i, flexItem, c80134Vcg.LJIIL);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        LJIIJJI.measure(LJIILIIL, makeMeasureSpec2);
                        measuredWidth2 = LJIIJJI.getMeasuredWidth();
                        measuredHeight2 = LJIIJJI.getMeasuredHeight();
                        LJIJJLI(LJIIJJI, i8, LJIILIIL, makeMeasureSpec2);
                        this.LIZ.LJIILL(i8, LJIIJJI);
                    }
                    i7 = Math.max(i7, this.LIZ.LJ(LJIIJJI) + measuredWidth2 + flexItem.getMarginLeft() + flexItem.getMarginRight());
                    c80134Vcg.LJ = measuredHeight2 + flexItem.getMarginTop() + flexItem.getMarginBottom() + c80134Vcg.LJ;
                }
                c80134Vcg.LJI = Math.max(c80134Vcg.LJI, i7);
            }
            i6++;
            f2 = 0.0f;
        }
        if (!z2 || i5 == c80134Vcg.LJ) {
            return;
        }
        LJIILLIIL(i, i2, c80134Vcg, i3, i4, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x032f, code lost:
    
        if (r21 < (r13 + r16)) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C80130Vcc r29, int r30, int r31, int r32, int r33, int r34, java.util.List<X.C80134Vcg> r35) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80135Vch.LIZIZ(X.Vcc, int, int, int, int, int, java.util.List):void");
    }

    public final void LJIILL(View view, C80134Vcg c80134Vcg, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.LIZ.getAlignItems();
        if (flexItem.LLLZZ() != -1) {
            alignItems = flexItem.LLLZZ();
        }
        int i5 = c80134Vcg.LJI;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int LIZJ = ((C16530kr.LIZJ(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - C16530kr.LIZIZ(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + LIZJ, i2, i3 + LIZJ, i4);
                        return;
                    } else {
                        view.layout(i - LIZJ, i2, i3 - LIZJ, i4);
                        return;
                    }
                }
            } else {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.getMarginLeft(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.getMarginLeft(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        } else {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        }
    }
}
