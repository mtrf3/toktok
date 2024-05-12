package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LSc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54282LSc extends C16120kC {
    public final /* synthetic */ C54283LSd LIZ;

    public C54282LSc(C54283LSd c54283LSd) {
        this.LIZ = c54283LSd;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        String str;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        Context context = this.LIZ.getContext();
        if (context != null) {
            str = context.getString(R.string.a_c);
        } else {
            str = null;
        }
        info.LJIJ(str);
        info.LJIILJJIL(Button.class.getName());
    }
}
