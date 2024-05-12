package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MBu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56406MBu implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ TrendingTitleSwitcher LIZ;

    public C56406MBu(TrendingTitleSwitcher trendingTitleSwitcher) {
        this.LIZ = trendingTitleSwitcher;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        Context context = this.LIZ.LJLIL.getContext();
        Context context2 = this.LIZ.LJLIL.getContext();
        o.LJIIIIZZ(context2, "textSwitcher.context");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(8388611);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTextDirection(2);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTextColor(C04330Ez.LIZIZ(context, R.color.bc));
        tuxTextView.setTuxFont(62);
        return tuxTextView;
    }
}
