package X;

import Y.IDRunnableS6S0101000;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import java.util.Objects;

/* renamed from: X.Vcv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80149Vcv extends C1CZ {
    public final ViewPager LJLIL;
    public final ViewPagerBottomSheetBehavior<View> LJLILLLLZI;

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        ViewPager viewPager = this.LJLIL;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LJLILLLLZI;
        Objects.requireNonNull(viewPagerBottomSheetBehavior);
        viewPager.post(new IDRunnableS6S0101000(5, viewPagerBottomSheetBehavior, 5));
    }

    public C80149Vcv(C80147Vct c80147Vct, View view) {
        this.LJLIL = c80147Vct;
        this.LJLILLLLZI = ViewPagerBottomSheetBehavior.LIZ(view);
    }
}
