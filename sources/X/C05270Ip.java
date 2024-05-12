package X;

import Y.IDCListenerS135S0100000;
import Y.IDCListenerS83S0200000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05270Ip extends ViewGroup {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final List<List<View>> LJLJJI;
    public final ArrayList<Integer> LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final boolean LJLL;
    public int LJLLI;
    public InterfaceC88472Yns<? super BlockWord, C76800UCe> LJLLILLLL;

    public final int getSize() {
        return getChildCount() - 1;
    }

    public final int getMaxLinesInFoldStatus() {
        return this.LJLLI;
    }

    public final void setDeleteListener(InterfaceC88472Yns<? super BlockWord, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLILLLL = listener;
    }

    public final void setMaxLinesInFoldStatus(int i) {
        this.LJLLI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05270Ip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "mContext");
        View LJIIIIZZ = C29306Beo.LJIIIIZZ(R.layout.cuu, this, false);
        this.LJLIL = LJIIIIZZ;
        ImageView _init_$lambda$0 = (ImageView) LJIIIIZZ.findViewById(R.id.e_q);
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            o.LJIIIIZZ(_init_$lambda$0, "_init_$lambda$0");
            C87277YNd.LJJIIJ(R.drawable.d1u, _init_$lambda$0);
        } else {
            _init_$lambda$0.setImageResource(R.drawable.d1u);
        }
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 13), LJIIIIZZ);
        addView(LJIIIIZZ);
        this.LJLILLLLZI = C15380j0.LIZ(8.0f);
        this.LJLJI = C15380j0.LIZ(8.0f);
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList<>();
        this.LJLJJLL = true;
        this.LJLL = C15380j0.LJIIZILJ();
        this.LJLLI = 1;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 8;
        if (this.LJLLI == 1) {
            ((ArrayList) this.LJLJJI).clear();
            this.LJLJJL.clear();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            ArrayList arrayList = new ArrayList();
            this.LJLJL = false;
            int childCount = getChildCount();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i4);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (childAt.getVisibility() != i3) {
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft + paddingRight, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, paddingTop + paddingBottom, layoutParams.height));
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (this.LJLJJLL) {
                        if (this.LJLJL) {
                            break;
                        }
                        if (measuredWidth + i6 + this.LJLILLLLZI > size) {
                            this.LJLJL = true;
                            int i9 = 0;
                            int max = Math.max(i4 - 1, 0);
                            while (true) {
                                if (-1 >= max) {
                                    break;
                                }
                                i9 += getChildAt(max).getMeasuredWidth() + this.LJLILLLLZI;
                                if (i9 > C15380j0.LIZ(31.0f) + this.LJLILLLLZI) {
                                    this.LJLJLLL = max;
                                    ((ArrayList) this.LJLJJI).add(arrayList);
                                    break;
                                }
                                max--;
                            }
                            i8 = i7 + this.LJLJI + i8;
                        }
                    }
                    if (measuredWidth + i6 + this.LJLILLLLZI > size) {
                        ((ArrayList) this.LJLJJI).add(arrayList);
                        this.LJLJJL.add(Integer.valueOf(i7));
                        i8 = i7 + this.LJLJI + i8;
                        i5 = Math.max(i5, i6 + this.LJLILLLLZI);
                        arrayList = new ArrayList();
                        i7 = 0;
                        i6 = 0;
                    }
                    if (this.LJLJJLL) {
                        if (!o.LJ(childAt, this.LJLIL)) {
                            arrayList.add(childAt);
                        }
                    } else {
                        arrayList.add(childAt);
                    }
                    i6 += measuredWidth + this.LJLILLLLZI;
                    i7 = Math.max(i7, measuredHeight);
                    if (i4 == getChildCount() - 1) {
                        ((ArrayList) this.LJLJJI).add(arrayList);
                        this.LJLJJL.add(Integer.valueOf(i7));
                        i8 = this.LJLJI + i7 + i8;
                        i5 = Math.max(i5, this.LJLILLLLZI + i6);
                    }
                }
                i4++;
                i3 = 8;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode != 1073741824) {
                size = i5;
            }
            if (mode2 != 1073741824) {
                size2 = i8;
            }
            int max2 = Math.max(size2, 102);
            if (getChildCount() == 1 && o.LJ(getChildAt(0), this.LJLIL)) {
                max2 = 0;
            }
            setMeasuredDimension(size, max2);
            return;
        }
        ((ArrayList) this.LJLJJI).clear();
        this.LJLJJL.clear();
        int paddingLeft2 = getPaddingLeft();
        int paddingRight2 = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(i2);
        ArrayList arrayList2 = new ArrayList();
        this.LJLJL = false;
        int childCount2 = getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i10 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i10);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft2 + paddingRight2, layoutParams2.width), ViewGroup.getChildMeasureSpec(i2, paddingTop2 + paddingBottom2, layoutParams2.height));
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                if (this.LJLJJLL && this.LJLJL) {
                    break;
                }
                if (measuredWidth2 + i12 + this.LJLILLLLZI > size3) {
                    ((ArrayList) this.LJLJJI).add(arrayList2);
                    this.LJLJJL.add(Integer.valueOf(i13));
                    i14 += i13 + this.LJLJI;
                    i11 = Math.max(i11, i12 + this.LJLILLLLZI);
                    arrayList2 = new ArrayList();
                    if (this.LJLJJLL && ((ArrayList) this.LJLJJI).size() >= this.LJLLI && !o.LJ(childAt2, this.LJLIL)) {
                        int i15 = i10 - 1;
                        int i16 = 0;
                        int max3 = Math.max(i15, 0);
                        while (true) {
                            if (-1 >= max3) {
                                break;
                            }
                            i16 += getChildAt(max3).getMeasuredWidth() + this.LJLILLLLZI;
                            if (i16 > C15380j0.LIZ(31.0f) + this.LJLILLLLZI) {
                                this.LJLJLLL = max3;
                                break;
                            }
                            max3--;
                        }
                        this.LJLJL = true;
                    } else {
                        i12 = 0;
                        i13 = 0;
                    }
                }
                if (this.LJLJJLL) {
                    if (!o.LJ(childAt2, this.LJLIL)) {
                        arrayList2.add(childAt2);
                    }
                } else {
                    arrayList2.add(childAt2);
                }
                int i17 = measuredWidth2 + this.LJLILLLLZI + i12;
                i13 = Math.max(i13, measuredHeight2);
                if (i10 == getChildCount() - 1) {
                    ((ArrayList) this.LJLJJI).add(arrayList2);
                    this.LJLJJL.add(Integer.valueOf(i13));
                    int i18 = this.LJLJI + i13 + i14;
                    i11 = Math.max(i11, this.LJLILLLLZI + i17);
                    i12 = i17;
                    i14 = i18;
                } else {
                    i12 = i17;
                }
            }
            i10++;
        }
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (mode3 != 1073741824) {
            size3 = i11;
        }
        if (mode4 != 1073741824) {
            size4 = i14;
        }
        int max4 = Math.max(size4, 102);
        if (getChildCount() == 1 && o.LJ(getChildAt(0), this.LJLIL)) {
            max4 = 0;
        }
        setMeasuredDimension(size3, max4);
    }

    public final void LIZ(BlockWord blockword, View wordView, int i) {
        o.LJIIIZ(blockword, "blockword");
        o.LJIIIZ(wordView, "wordView");
        this.LJLJLJ = false;
        C16880lQ.LJIIZILJ((LinearLayout) wordView.findViewById(R.id.amm), new IDCListenerS83S0200000(blockword, this, 1));
        ((TextView) wordView.findViewById(R.id.aml)).setText(blockword.content);
        addView(wordView, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LJLJJLL && this.LJLJL) {
            if (this.LJLLI == 1) {
                if (this.LJLL) {
                    int measuredWidth = getMeasuredWidth() - getPaddingRight();
                    int paddingTop = getPaddingTop();
                    if (getChildCount() == 1) {
                        return;
                    }
                    int childCount = getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (i5 < this.LJLJLLL) {
                            int measuredWidth2 = measuredWidth - childAt.getMeasuredWidth();
                            C17M.LIZIZ(childAt, paddingTop, measuredWidth2, paddingTop, measuredWidth);
                            measuredWidth = measuredWidth2 - this.LJLILLLLZI;
                        } else if (!o.LJ(childAt, this.LJLIL)) {
                            childAt.layout(0, 0, 0, 0);
                        }
                    }
                    if (this.LJLJLLL != getChildCount() - 1 || this.LJLJLLL == 0) {
                        this.LJLIL.layout(measuredWidth - this.LJLIL.getMeasuredWidth(), paddingTop, measuredWidth, this.LJLIL.getMeasuredHeight() + paddingTop);
                        return;
                    }
                    this.LJLIL.layout(0, 0, 0, 0);
                    return;
                }
                int paddingLeft = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                if (getChildCount() == 1) {
                    return;
                }
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = getChildAt(i6);
                    if (i6 < this.LJLJLLL) {
                        int measuredWidth3 = childAt2.getMeasuredWidth() + paddingLeft;
                        C17M.LIZIZ(childAt2, paddingTop2, paddingLeft, paddingTop2, measuredWidth3);
                        paddingLeft = measuredWidth3 + this.LJLILLLLZI;
                    } else if (!o.LJ(childAt2, this.LJLIL)) {
                        childAt2.layout(0, 0, 0, 0);
                    }
                }
                if (this.LJLJLLL != getChildCount() - 1 || this.LJLJLLL == 0) {
                    this.LJLIL.layout(paddingLeft, paddingTop2, this.LJLIL.getMeasuredWidth() + paddingLeft, this.LJLIL.getMeasuredHeight() + paddingTop2);
                    return;
                }
                this.LJLIL.layout(0, 0, 0, 0);
                return;
            }
            if (this.LJLL) {
                int measuredWidth4 = getMeasuredWidth() - getPaddingRight();
                int paddingTop3 = getPaddingTop();
                if (getChildCount() == 1 || ((ArrayList) this.LJLJJI).size() < 1) {
                    return;
                }
                int size = ((ArrayList) this.LJLJJI).size();
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    List<View> list = (List) ListProtector.get(this.LJLJJI, i8);
                    Object obj = ListProtector.get(this.LJLJJL, i8);
                    o.LJIIIIZZ(obj, "lineHeights[i]");
                    int intValue = ((Number) obj).intValue();
                    for (View view : list) {
                        int measuredWidth5 = measuredWidth4 - view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight() + paddingTop3;
                        if (i7 < this.LJLJLLL) {
                            view.layout(measuredWidth5, paddingTop3, measuredWidth4, measuredHeight);
                            measuredWidth4 = measuredWidth5 - this.LJLILLLLZI;
                        } else if (!o.LJ(view, this.LJLIL)) {
                            view.layout(0, 0, 0, 0);
                        }
                        i7++;
                    }
                    if (i8 != size - 1) {
                        measuredWidth4 = getMeasuredWidth() - getPaddingRight();
                        paddingTop3 = intValue + this.LJLJI + paddingTop3;
                    }
                }
                int childCount3 = getChildCount();
                while (i7 < childCount3) {
                    View childAt3 = getChildAt(i7);
                    if (!o.LJ(childAt3, this.LJLIL)) {
                        childAt3.layout(0, 0, 0, 0);
                    }
                    i7++;
                }
                if (this.LJLJLLL != getChildCount() - 1 || this.LJLJLLL == 0) {
                    this.LJLIL.layout(measuredWidth4 - this.LJLIL.getMeasuredWidth(), paddingTop3, measuredWidth4, this.LJLIL.getMeasuredHeight() + paddingTop3);
                    return;
                }
                this.LJLIL.layout(0, 0, 0, 0);
                return;
            }
            int paddingLeft2 = getPaddingLeft();
            int paddingTop4 = getPaddingTop();
            if (getChildCount() == 1 || ((ArrayList) this.LJLJJI).size() < 1) {
                return;
            }
            int size2 = ((ArrayList) this.LJLJJI).size();
            int i9 = 0;
            for (int i10 = 0; i10 < size2; i10++) {
                List<View> list2 = (List) ListProtector.get(this.LJLJJI, i10);
                Object obj2 = ListProtector.get(this.LJLJJL, i10);
                o.LJIIIIZZ(obj2, "lineHeights[i]");
                int intValue2 = ((Number) obj2).intValue();
                for (View view2 : list2) {
                    int measuredWidth6 = view2.getMeasuredWidth() + paddingLeft2;
                    int measuredHeight2 = view2.getMeasuredHeight() + paddingTop4;
                    if (i9 < this.LJLJLLL) {
                        view2.layout(paddingLeft2, paddingTop4, measuredWidth6, measuredHeight2);
                        paddingLeft2 = measuredWidth6 + this.LJLILLLLZI;
                    } else if (!o.LJ(view2, this.LJLIL)) {
                        view2.layout(0, 0, 0, 0);
                    }
                    i9++;
                }
                if (i10 != size2 - 1) {
                    int i11 = intValue2 + this.LJLJI + paddingTop4;
                    paddingLeft2 = getPaddingLeft();
                    paddingTop4 = i11;
                }
            }
            int childCount4 = getChildCount();
            while (i9 < childCount4) {
                View childAt4 = getChildAt(i9);
                if (!o.LJ(childAt4, this.LJLIL)) {
                    childAt4.layout(0, 0, 0, 0);
                }
                i9++;
            }
            if (this.LJLJLLL != getChildCount() - 1 || this.LJLJLLL == 0) {
                this.LJLIL.layout(paddingLeft2, paddingTop4, this.LJLIL.getMeasuredWidth() + paddingLeft2, this.LJLIL.getMeasuredHeight() + paddingTop4);
                return;
            }
            this.LJLIL.layout(0, 0, 0, 0);
            return;
        }
        if (this.LJLL) {
            int size3 = ((ArrayList) this.LJLJJI).size();
            int measuredWidth7 = getMeasuredWidth() - getPaddingRight();
            int paddingTop5 = getPaddingTop();
            for (int i12 = 0; i12 < size3; i12++) {
                List<View> list3 = (List) ListProtector.get(this.LJLJJI, i12);
                Object obj3 = ListProtector.get(this.LJLJJL, i12);
                o.LJIIIIZZ(obj3, "lineHeights[i]");
                int intValue3 = ((Number) obj3).intValue();
                for (View view3 : list3) {
                    int measuredWidth8 = measuredWidth7 - view3.getMeasuredWidth();
                    C17M.LIZIZ(view3, paddingTop5, measuredWidth8, paddingTop5, measuredWidth7);
                    measuredWidth7 = measuredWidth8 - this.LJLILLLLZI;
                }
                paddingTop5 += intValue3 + this.LJLJI;
                measuredWidth7 = getMeasuredWidth() - getPaddingRight();
            }
            if (size3 > this.LJLLI || !this.LJLJLJ) {
                return;
            }
            this.LJLIL.layout(0, 0, 0, 0);
            return;
        }
        int size4 = ((ArrayList) this.LJLJJI).size();
        int paddingLeft3 = getPaddingLeft();
        int paddingTop6 = getPaddingTop();
        for (int i13 = 0; i13 < size4; i13++) {
            List<View> list4 = (List) ListProtector.get(this.LJLJJI, i13);
            Object obj4 = ListProtector.get(this.LJLJJL, i13);
            o.LJIIIIZZ(obj4, "lineHeights[i]");
            int intValue4 = ((Number) obj4).intValue();
            for (View view4 : list4) {
                int measuredWidth9 = view4.getMeasuredWidth() + paddingLeft3;
                C17M.LIZIZ(view4, paddingTop6, paddingLeft3, paddingTop6, measuredWidth9);
                paddingLeft3 = this.LJLILLLLZI + measuredWidth9;
            }
            paddingTop6 += intValue4 + this.LJLJI;
            paddingLeft3 = getPaddingLeft();
        }
        if (size4 > this.LJLLI || !this.LJLJLJ) {
            return;
        }
        this.LJLIL.layout(0, 0, 0, 0);
    }
}
