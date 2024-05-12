package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119254m9 extends AbstractC72775ShH {
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final LinearLayout LJLZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119254m9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getRepeatOrientation$annotations() {
    }

    public final int getPreviewItemRes() {
        return this.LJLLL;
    }

    public final int getRepeat() {
        return this.LJLLILLLL;
    }

    public final int getRepeatOrientation() {
        return this.LJLLJ;
    }

    public final void LJ(int i) {
        while (this.LJLZ.getChildCount() < i) {
            FrameLayout.inflate(getContext(), this.LJLLL, this.LJLZ);
        }
        while (this.LJLZ.getChildCount() > i) {
            C16880lQ.LLII(this.LJLZ, 0);
        }
    }

    public final void setPreviewItemRes(int i) {
        if (this.LJLLL != i) {
            this.LJLLL = i;
            this.LJLZ.removeAllViews();
            FrameLayout.inflate(getContext(), this.LJLLL, this.LJLZ);
            this.LJLZ.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.LJLLLL = this.LJLZ.getMeasuredWidth();
            this.LJLLLLLL = this.LJLZ.getMeasuredHeight();
            this.LJLZ.removeAllViews();
        }
    }

    public final void setRepeat(int i) {
        if (this.LJLLILLLL != i) {
            this.LJLLILLLL = i;
            if (LIZJ() && this.LJLLL != 0) {
                requestLayout();
            }
        }
    }

    public final void setRepeatOrientation(int i) {
        if (this.LJLLJ != i) {
            if (LIZJ() && this.LJLLL != 0) {
                if (i == 2 || this.LJLLJ == 2) {
                    this.LJLZ.removeAllViews();
                } else {
                    requestLayout();
                }
            }
            this.LJLLJ = i;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        if (this.LJLLL != 0) {
            z = true;
        } else {
            z = false;
        }
        if (LIZJ() && z) {
            Iterator<View> it = C78924UyG.LIZLLL(this).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                } else {
                    ((View) iDObjectS0S0101000.next()).setVisibility(8);
                }
            }
            this.LJLZ.setVisibility(0);
            LinearLayout linearLayout = this.LJLZ;
            int i11 = this.LJLLJ;
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    i3 = 1;
                } else {
                    throw new IllegalStateException("wrong repeatOrientation");
                }
            } else {
                i3 = 0;
            }
            linearLayout.setOrientation(i3);
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
            if (this.LJLLJ == 2) {
                int i12 = this.LJLLILLLL;
                if (size == 0) {
                    i5 = 1;
                } else {
                    int i13 = this.LJLLLL;
                    int i14 = size / i13;
                    if (size % i13 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    i5 = i14 + i4;
                }
                if (size2 == 0) {
                    i7 = 1;
                } else {
                    int i15 = this.LJLLLLLL;
                    int i16 = size2 / i15;
                    if (size2 % i15 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                    i7 = i16 + i6;
                }
                if (i12 <= 0) {
                    i12 = i5 * i7;
                }
                int i17 = i12 / i5;
                int i18 = i12 % i5;
                if (i18 != 0) {
                    i10 = 0;
                }
                int i19 = i17 - i10;
                if (i18 == 0) {
                    i18 = i5;
                }
                while (true) {
                    i8 = i19 + 1;
                    if (this.LJLZ.getChildCount() >= i8) {
                        break;
                    }
                    LinearLayout linearLayout2 = this.LJLZ;
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    C119254m9 c119254m9 = new C119254m9(context, null, 6);
                    c119254m9.setRepeatOrientation(0);
                    c119254m9.setPreviewItemRes(this.LJLLL);
                    linearLayout2.addView(c119254m9, new FrameLayout.LayoutParams(-1, -2));
                }
                while (this.LJLZ.getChildCount() > i8) {
                    C16880lQ.LLII(this.LJLZ, 0);
                }
                while (i9 < i19) {
                    View childAt = this.LJLZ.getChildAt(i9);
                    o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.tux.skeleton.TuxSkeletonLayout");
                    ((C119254m9) childAt).setRepeat(i5);
                    i9++;
                }
                View childAt2 = this.LJLZ.getChildAt(i19);
                o.LJII(childAt2, "null cannot be cast to non-null type com.bytedance.tux.skeleton.TuxSkeletonLayout");
                ((C119254m9) childAt2).setRepeat(i18);
                this.LJLZ.requestLayout();
            } else {
                int i20 = this.LJLLILLLL;
                if (i20 <= 0) {
                    if (this.LJLZ.getOrientation() == 0) {
                        if (size == 0) {
                            LJ(1);
                        } else {
                            int i21 = this.LJLLLL;
                            int i22 = size / i21;
                            if (size % i21 != 0) {
                                i9 = 1;
                            }
                            LJ(i22 + i9);
                        }
                    } else if (size2 == 0) {
                        LJ(1);
                    } else {
                        int i23 = this.LJLLLLLL;
                        int i24 = size2 / i23;
                        if (size2 % i23 != 0) {
                            i9 = 1;
                        }
                        LJ(i24 + i9);
                    }
                } else {
                    LJ(i20);
                }
            }
        } else {
            Iterator<View> it2 = C78924UyG.LIZLLL(this).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S01010002 = (IDObjectS0S0101000) it2;
                if (!iDObjectS0S01010002.hasNext()) {
                    break;
                } else {
                    ((View) iDObjectS0S01010002.next()).setVisibility(0);
                }
            }
            this.LJLZ.setVisibility(8);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C119254m9(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r3 = 0
            r5.<init>(r6, r7, r3)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.LJLLLL = r0
            r5.LJLLLLLL = r0
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r1.<init>(r0, r0)
            r2.setLayoutParams(r1)
            r5.LJLZ = r2
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x006a: FILL_ARRAY_DATA , data: [2130971968, 2130971971, 2130971974, 2130971975} // fill-array
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r0, r3, r3)
            java.lang.String r0 = "_init_$lambda$2"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r1.hasValue(r3)
            if (r0 == 0) goto L45
            X.C1E4.LJI(r1, r3)
            boolean r0 = r1.getBoolean(r3, r3)
            r5.setLoading(r0)
        L45:
            r0 = 1
            int r0 = r1.getResourceId(r0, r3)
            r5.setPreviewItemRes(r0)
            int r0 = r1.getInt(r4, r3)
            r5.setRepeat(r0)
            r0 = 3
            int r0 = r1.getInt(r0, r3)
            r5.setRepeatOrientation(r0)
            r1.recycle()
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1.<init>(r0, r0)
            r5.addView(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119254m9.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
