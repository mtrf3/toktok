package X;

import android.animation.ObjectAnimator;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MOp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56739MOp implements PopupWindow.OnDismissListener {
    public final /* synthetic */ MusNewNotificationFragment LJLIL;

    public C56739MOp(MusNewNotificationFragment musNewNotificationFragment) {
        this.LJLIL = musNewNotificationFragment;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.LJLIL.Zl();
        this.LJLIL.Tl();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLIL._$_findCachedViewById(R.id.f36), "rotation", 180.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }
}
