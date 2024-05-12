package X;

import Y.IDiS272S0100000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Nfy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59954Nfy extends TuxTextView {
    public ViewPager LJLLLL;
    public final IDiS272S0100000_10 LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void setViewPager(ViewPager viewPager) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.LJLLLL = viewPager;
            viewPager.removeOnPageChangeListener(this.LJLLLLLL);
            ViewPager viewPager2 = this.LJLLLL;
            o.LJI(viewPager2);
            viewPager2.addOnPageChangeListener(this.LJLLLLLL);
            IDiS272S0100000_10 iDiS272S0100000_10 = this.LJLLLLLL;
            ViewPager viewPager3 = this.LJLLLL;
            o.LJI(viewPager3);
            iDiS272S0100000_10.onPageSelected(viewPager3.getCurrentItem());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59954Nfy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJI(context);
        this.LJLLLLLL = new IDiS272S0100000_10(this, 1);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, context2));
        setTuxFont(33);
    }
}
