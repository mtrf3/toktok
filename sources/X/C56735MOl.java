package X;

import android.animation.ObjectAnimator;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.notification.NotificationFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MOl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56735MOl implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C56733MOj LJLIL;

    public C56735MOl(C56733MOj c56733MOj) {
        this.LJLIL = c56733MOj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ((NotificationFragment) this.LJLIL.LIZ()).Ol();
        this.LJLIL.LJIIL();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLIL.LJIIJJI(R.id.f36), "rotation", 180.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }
}
