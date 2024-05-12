package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;

/* loaded from: classes16.dex */
public final class YE2 extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ YE2(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new FrameLayout(context, attributeSet);
            default:
                return new LongPressLayout(context, attributeSet);
        }
    }
}
