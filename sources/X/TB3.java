package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes13.dex */
public final /* synthetic */ class TB3 {
    public static FrameLayout LIZIZ(Context context, int i) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(i);
        return frameLayout;
    }

    public static int LIZ(PagerAdapter pagerAdapter, int i, int i2) {
        return (pagerAdapter.getCount() - i) + i2;
    }
}
