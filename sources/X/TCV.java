package X;

import android.animation.ObjectAnimator;
import android.widget.PopupWindow;
import com.bytedance.tux.icon.TuxIconView;

/* loaded from: classes13.dex */
public final class TCV implements PopupWindow.OnDismissListener {
    public final /* synthetic */ TuxIconView LJLIL;

    public TCV(TuxIconView tuxIconView) {
        this.LJLIL = tuxIconView;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLIL, "rotation", 180.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }
}
