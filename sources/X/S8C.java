package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import java.util.concurrent.CancellationException;

/* loaded from: classes13.dex */
public final class S8C implements InterfaceC31680Cc0 {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ TuxTextView LIZJ;
    public final /* synthetic */ FrameLayout.LayoutParams LIZLLL;

    @Override // X.InterfaceC31680Cc0
    public final void onSuccess() {
        FrameLayout frameLayout;
        View view = this.LIZIZ;
        TuxTextView tuxTextView = this.LIZJ;
        FrameLayout.LayoutParams layoutParams = this.LIZLLL;
        try {
            if ((view instanceof FrameLayout) && (frameLayout = (FrameLayout) view) != null) {
                frameLayout.addView(tuxTextView, layoutParams);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        S5A.LIZ("finish", "template_decoration", Boolean.TRUE, null, Long.valueOf(System.currentTimeMillis() - this.LIZ), 8);
    }

    @Override // X.InterfaceC31680Cc0
    public final void onFailed(Throwable th) {
        S5A.LIZ("finish", "template_decoration", Boolean.FALSE, th.getMessage(), null, 16);
    }

    public S8C(long j, View view, TuxTextView tuxTextView, FrameLayout.LayoutParams layoutParams) {
        this.LIZ = j;
        this.LIZIZ = view;
        this.LIZJ = tuxTextView;
        this.LIZLLL = layoutParams;
    }
}
