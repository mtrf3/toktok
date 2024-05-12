package X;

import android.animation.ObjectAnimator;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.notification.NoticeCardFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MOY implements PopupWindow.OnDismissListener {
    public final /* synthetic */ NoticeCardFragment LJLIL;

    public MOY(NoticeCardFragment noticeCardFragment) {
        this.LJLIL = noticeCardFragment;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.LJLIL.Dl();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLIL._$_findCachedViewById(R.id.ew0), "rotation", 180.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }
}
