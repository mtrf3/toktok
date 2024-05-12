package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MM4 extends LinearLayout implements MMB {
    public final List<MM5> LJLIL;
    public final MM5 LJLILLLLZI;
    public final MM5 LJLJI;
    public final HorizontalScrollView LJLJJI;
    public final LinearLayout LJLJJL;
    public final C253259wn LJLJJLL;
    public final java.util.Set<MMB> LJLJL;
    public MM6 LJLJLJ;

    public final OSZ<Integer, Boolean> getSelectedBarInfo() {
        int index = this.LJLJLJ.getIndex();
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            MM5 mm5 = (MM5) it.next();
            boolean z = true;
            if (mm5.getType() == this.LJLJLJ) {
                C136775Yj c136775Yj = mm5.LJLIL;
                if (c136775Yj == null || c136775Yj.getVisibility() != 0) {
                    z = false;
                }
                return new OSZ<>(Integer.valueOf(index), Boolean.valueOf(z));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.MMB
    public final void LJJJIL(MM6 tabType) {
        o.LJIIIZ(tabType, "tabType");
        if (tabType != MM6.REQUESTS) {
            this.LJLJLJ = tabType;
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                MM5 mm5 = (MM5) it.next();
                if (mm5.getTabType() != tabType) {
                    mm5.setTabSelected(false);
                }
            }
        }
        Iterator<MMB> it2 = this.LJLJL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJIL(tabType);
        }
    }

    @Override // X.MMB
    public final void LJL(EnumC253269wo filterType) {
        o.LJIIIZ(filterType, "filterType");
        Iterator<MMB> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().LJL(filterType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MM4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        ArrayList arrayList = new ArrayList();
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(MM6.values());
        while (LJJIIJZLJL.hasNext()) {
            MM6 mm6 = (MM6) LJJIIJZLJL.next();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            arrayList.add(new MM5(context2, mm6, this));
        }
        this.LJLIL = arrayList;
        this.LJLILLLLZI = (MM5) ListProtector.get(arrayList, 0);
        ListProtector.get(arrayList, 1);
        this.LJLJI = (MM5) ListProtector.get(arrayList, 2);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.LJLJJI = horizontalScrollView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.LJLJJL = linearLayout;
        this.LJLJJLL = new C253259wn(context, this);
        this.LJLJL = new LinkedHashSet();
        this.LJLJLJ = MM6.PRIMARY;
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C7MY.LIZIZ(49));
        layoutParams.topMargin = C7MY.LIZIZ(-16);
        setLayoutParams(layoutParams);
        setPaddingRelative(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), C7MY.LIZIZ(8), C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        linearLayout.addView(this.LJLJJLL);
        horizontalScrollView.addView(this.LJLJJL);
        addView(this.LJLJJI);
        this.LJLILLLLZI.setTabSelected(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = this.LJLJJI.getMeasuredWidth() - this.LJLJJLL.getMeasuredWidth();
        int LIZIZ = C7MY.LIZIZ(24);
        Iterator<MM5> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            LIZIZ += it.next().getMeasuredWidth();
        }
        if (measuredWidth > LIZIZ) {
            int i3 = (measuredWidth - LIZIZ) / 3;
            for (MM5 mm5 : this.LJLIL) {
                ViewGroup.LayoutParams layoutParams = mm5.getLayoutParams();
                layoutParams.width = mm5.getMeasuredWidth() + i3;
                mm5.setLayoutParams(layoutParams);
            }
        } else if (measuredWidth < LIZIZ) {
            for (MM5 mm52 : this.LJLIL) {
                ViewGroup.LayoutParams layoutParams2 = mm52.getLayoutParams();
                layoutParams2.width = -2;
                mm52.setLayoutParams(layoutParams2);
            }
        }
        LinearLayout linearLayout = this.LJLJJL;
        if (measuredWidth < LIZIZ) {
            measuredWidth = LIZIZ;
        }
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(this.LJLJJLL.getMeasuredWidth() + measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(C32151Nz.LJIIZILJ(33)), 1073741824));
    }
}
