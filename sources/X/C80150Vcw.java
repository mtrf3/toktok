package X;

import Y.IDRunnableS6S0101000;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import java.util.Objects;

/* renamed from: X.Vcw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80150Vcw extends C1CZ {
    public final ViewPager LJLIL;
    public final ViewPagerBottomSheetBehavior<View> LJLILLLLZI;

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        ViewPager viewPager = this.LJLIL;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LJLILLLLZI;
        Objects.requireNonNull(viewPagerBottomSheetBehavior);
        viewPager.post(new IDRunnableS6S0101000(11, viewPagerBottomSheetBehavior, 14));
    }

    public C80150Vcw(VW7 vw7, View view) {
        this.LJLIL = vw7;
        this.LJLILLLLZI = ViewPagerBottomSheetBehavior.LIZ(view);
    }
}
