package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* loaded from: classes5.dex */
public final class A2T implements View.OnFocusChangeListener {
    public static final A2T LJLIL = new A2T();

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            KeyboardUtils.LIZLLL(view);
        } else {
            KeyboardUtils.LIZIZ(view);
        }
    }
}
