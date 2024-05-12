package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.71f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1791171f {
    public final View LIZ;
    public InterfaceC1791571j LIZIZ;

    public C1791171f(View watchedView) {
        o.LJIIIZ(watchedView, "watchedView");
        this.LIZ = watchedView;
    }

    public final void LIZ(int i) {
        int i2;
        this.LIZ.setVisibility(i);
        InterfaceC1791571j interfaceC1791571j = this.LIZIZ;
        if (interfaceC1791571j != null) {
            o.LJI(interfaceC1791571j);
            KeyboardDialogFragment keyboardDialogFragment = ((C1791371h) interfaceC1791571j).LIZ;
            if (i == 0) {
                if (keyboardDialogFragment.LLJLLIL && keyboardDialogFragment.LLILZ && (i2 = keyboardDialogFragment.LLJLL) > 0) {
                    C78886Uxe.LJJLIIIJ(i2, keyboardDialogFragment.LLF);
                    return;
                }
                return;
            }
            keyboardDialogFragment.getClass();
        }
    }
}
