package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;

/* renamed from: X.Xs8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86188Xs8 extends AbstractC86187Xs7 implements Observer<C207668Da> {
    public C62846OlW LJLJJLL;
    public FrameLayout LJLJL;
    public TextView LJLJLJ;
    public boolean LJLJLLL;

    public C86188Xs8(View view) {
        super(view);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 != null && TextUtils.equals(c207668Da2.LIZ, "live_has_end")) {
            Object obj = c207668Da2.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.LJLJLLL = true;
            }
        }
    }
}
