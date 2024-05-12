package X;

import Y.IDCListenerS258S0100000_12;
import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rjr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70387Rjr extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public int LJLJJLL;
    public List<C70216Rh6> LJLJL;
    public C70216Rh6 LJLJLJ;
    public final int LJLJLLL;
    public int LJLL;
    public InterfaceC70389Rjt LJLLI;
    public final SparseArray<List<View>> LJLLILLLL;
    public final ArrayList<Integer> LJLLJ;
    public S3L LJLLL;
    public final boolean LJLLLL;
    public final Drawable LJLLLLLL;
    public InterfaceC70386Rjq LJLZ;
    public TuxTextView LJZ;
    public boolean LJZI;
    public final IDCListenerS258S0100000_12 LJZL;

    public final void LIZJ() {
        int childCount = getChildCount();
        for (int i = this.LJLJLLL; i < childCount; i++) {
            View childView = getChildAt(i);
            int i2 = i - this.LJLJLLL;
            List<C70216Rh6> list = this.LJLJL;
            if (list != null) {
                if (i2 < list.size()) {
                    List<C70216Rh6> list2 = this.LJLJL;
                    if (list2 != null) {
                        C70216Rh6 c70216Rh6 = (C70216Rh6) ListProtector.get(list2, i2);
                        o.LJIIIIZZ(childView, "childView");
                        LIZLLL(childView, c70216Rh6);
                    } else {
                        o.LJIJI("itemViewInfoList");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("itemViewInfoList");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70387Rjr(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLJLLL = 1;
        this.LJLL = -1;
        this.LJLLILLLL = new SparseArray<>();
        this.LJLLJ = new ArrayList<>();
        this.LJLZ = new C70224RhE();
        this.LJZI = true;
        IDCListenerS258S0100000_12 iDCListenerS258S0100000_12 = new IDCListenerS258S0100000_12(this, 5);
        this.LJZL = iDCListenerS258S0100000_12;
        this.LJLJJI = LIZ(8.0f);
        this.LJLJJL = LIZ(7.0f);
        this.LJLJI = LIZ(12.0f);
        LIZ(56.0f);
        this.LJLLLL = C90193gN.LIZ();
        this.LJLLLLLL = C04270Et.LIZIZ(context, R.drawable.ag_);
        C04270Et.LIZIZ(context, R.drawable.aga);
        addOnLayoutChangeListener(iDCListenerS258S0100000_12);
    }

    public final int LIZ(float f) {
        return (int) KL2.LIZJ(C16880lQ.LLLLL(getContext()), f);
    }

    public final void setCheckedViewInfo(C70216Rh6 checkedViewInfo) {
        o.LJIIIZ(checkedViewInfo, "checkedViewInfo");
        this.LJLJLJ = checkedViewInfo;
    }

    public final void setOnItemCheckedListener(InterfaceC70389Rjt onItemCheckedListener) {
        o.LJIIIZ(onItemCheckedListener, "onItemCheckedListener");
        this.LJLLI = onItemCheckedListener;
    }

    public final void LIZLLL(View view, C70216Rh6 c70216Rh6) {
        String string;
        C70216Rh6 c70216Rh62;
        C70216Rh6 c70216Rh63;
        if (view instanceof TuxTextView) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            if (!c70216Rh6.LJ) {
                appCompatTextView.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getNoStockBg());
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                appCompatTextView.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextNoStockColor(), context));
            } else {
                C70216Rh6 c70216Rh64 = this.LJLJLJ;
                if (c70216Rh64 != null && o.LJ(c70216Rh64, c70216Rh6)) {
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    appCompatTextView.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextCheckedColor(), context2));
                    appCompatTextView.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getCheckedBg());
                } else {
                    appCompatTextView.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getNormalBg());
                    Context context3 = getContext();
                    o.LJIIIIZZ(context3, "context");
                    appCompatTextView.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextNormalColor(), context3));
                }
            }
            this.LJLZ.LJIIIIZZ();
            if (!c70216Rh6.LJ && (c70216Rh63 = this.LJLJLJ) != null && o.LJ(c70216Rh63, c70216Rh6)) {
                appCompatTextView.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getNoStockAndCheckedBg());
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            Iterator it = new IDObjectS332S0100000_12(viewGroup, 16).iterator();
            View view2 = null;
            View view3 = null;
            while (true) {
                IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
                if (!iDObjectS5S0101000_12.hasNext()) {
                    break;
                }
                View view4 = (View) iDObjectS5S0101000_12.next();
                if (view4 instanceof SmartImageView) {
                    view2 = view4;
                } else if (view4 instanceof TuxTextView) {
                    view3 = view4;
                }
            }
            if (!c70216Rh6.LJ) {
                viewGroup.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getNoStockBg());
                if (view2 != null) {
                    view2.setAlpha(0.34f);
                }
                TextView textView = (TextView) view3;
                if (textView != null) {
                    Context context4 = getContext();
                    o.LJIIIIZZ(context4, "context");
                    textView.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextNoStockColor(), context4));
                }
            } else {
                SmartImageView smartImageView = (SmartImageView) view2;
                if (smartImageView != null) {
                    smartImageView.setAlpha(1.0f);
                    smartImageView.setCircleOptions(this.LJLLL);
                    smartImageView.setPlaceholderImage(this.LJLLLLLL);
                }
                C70216Rh6 c70216Rh65 = this.LJLJLJ;
                if (c70216Rh65 != null && o.LJ(c70216Rh65, c70216Rh6)) {
                    TextView textView2 = (TextView) view3;
                    if (textView2 != null) {
                        Context context5 = getContext();
                        o.LJIIIIZZ(context5, "context");
                        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextCheckedColor(), context5));
                    }
                    viewGroup.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getCheckedBg());
                } else {
                    TextView textView3 = (TextView) view3;
                    if (textView3 != null) {
                        Context context6 = getContext();
                        o.LJIIIIZZ(context6, "context");
                        textView3.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextNormalColor(), context6));
                    }
                    viewGroup.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getNormalBg());
                }
            }
            this.LJLZ.LJIIIIZZ();
            if (!c70216Rh6.LJ && (c70216Rh62 = this.LJLJLJ) != null && o.LJ(c70216Rh62, c70216Rh6)) {
                viewGroup.setBackgroundResource(this.LJLZ.LIZJ().getSpecItemStyle().getNoStockAndCheckedBg());
                TextView textView4 = (TextView) view3;
                if (textView4 != null) {
                    Context context7 = getContext();
                    o.LJIIIIZZ(context7, "context");
                    textView4.setTextColor(AnonymousClass636.LJIIIIZZ(this.LJLZ.LIZJ().getSpecItemStyle().getTextNoStockAndCheckColor(), context7));
                }
            }
        }
        TuxTextView tuxTextView = this.LJZ;
        if (tuxTextView != null) {
            C70216Rh6 c70216Rh66 = this.LJLJLJ;
            if (c70216Rh66 == null || (string = c70216Rh66.LIZIZ) == null) {
                string = tuxTextView.getContext().getString(R.string.sly);
            }
            tuxTextView.setText(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70387Rjr.onMeasure(int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int intValue;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        if (!this.LJLLLL) {
            childAt.layout(0, 0, measuredWidth, measuredHeight);
        } else {
            childAt.layout(getMeasuredWidth() - measuredWidth, 0, getMeasuredWidth(), measuredHeight);
        }
        int size = this.LJLLILLLL.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            List<View> list = this.LJLLILLLL.get(i7);
            int size2 = list.size();
            if (i7 == 0) {
                intValue = this.LJLJJLL + measuredHeight;
            } else {
                intValue = ((Number) ListProtector.get(this.LJLLJ, i7 - 1)).intValue() + this.LJLIL;
            }
            i6 += intValue;
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                View view = (View) ListProtector.get(list, i9);
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i9 > 0) {
                    i5 = (this.LJLILLLLZI * i9) + i8;
                } else {
                    i5 = 0;
                }
                if (!this.LJLLLL) {
                    view.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
                } else {
                    view.layout((getMeasuredWidth() - measuredWidth2) - i5, i6, getMeasuredWidth() - i5, measuredHeight2 + i6);
                }
                i8 += measuredWidth2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r23, boolean r24, java.lang.String r25, java.util.List<X.C70216Rh6> r26, int r27, X.InterfaceC70386Rjq r28, X.InterfaceC88473Ynt<? super java.lang.Integer, ? super android.view.ViewGroup, ? super java.lang.String, java.lang.Integer> r29) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70387Rjr.LIZIZ(java.lang.String, boolean, java.lang.String, java.util.List, int, X.Rjq, X.Ynt):void");
    }
}
