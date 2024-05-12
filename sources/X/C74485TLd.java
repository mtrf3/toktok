package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import kotlin.jvm.internal.o;

/* renamed from: X.TLd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74485TLd {
    public final ViewPagerBottomSheetBehavior<View> LIZ;
    public final C73893SzJ<TLY> LIZIZ;

    public final C73426Srm LIZ() {
        C73893SzJ<TLY> c73893SzJ = this.LIZIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public C74485TLd(View view, ViewPager viewPager, boolean z) {
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZIZ = new C73893SzJ<>();
        if (z) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = new ViewPagerBottomSheetBehavior<>(view.getContext());
            this.LIZ = viewPagerBottomSheetBehavior;
            viewPagerBottomSheetBehavior.setPeekHeight(0);
            viewPagerBottomSheetBehavior.LJII = true;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C06F c06f = (C06F) (layoutParams instanceof C06F ? layoutParams : null);
            if (c06f != null) {
                c06f.LIZIZ(viewPagerBottomSheetBehavior);
            }
            viewPager.addOnPageChangeListener(new C80583Vjv(viewPager, viewPagerBottomSheetBehavior));
            viewPagerBottomSheetBehavior.LJIIZILJ = new C74484TLc(this);
            return;
        }
        this.LIZ = null;
    }
}
