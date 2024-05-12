package X;

import android.view.View;
import com.bytedance.common.utility.Logger;

/* loaded from: classes6.dex */
public final class B8R implements View.OnClickListener {
    public static final B8R LJLIL = new B8R();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.setLogLevel(2);
    }
}
