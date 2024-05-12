package X;

import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes29.dex */
public final class ZXF implements View.OnClickListener {
    public final /* synthetic */ DialogC90914ZmA LJLIL;

    public ZXF(DialogC90914ZmA dialogC90914ZmA) {
        this.LJLIL = dialogC90914ZmA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        boolean z;
        int id = view.getId();
        int i = 1;
        if (id == 16908313 || id == 16908314) {
            if (this.LJLIL.LJLJJLL.LJI()) {
                ZY5 zy5 = this.LJLIL.LJLJJI;
                if (id == 16908313) {
                    i = 2;
                }
                zy5.getClass();
                ZY5.LJII(i);
            }
            this.LJLIL.dismiss();
            return;
        }
        if (id == R.id.b3) {
            DialogC90914ZmA dialogC90914ZmA = this.LJLIL;
            MediaControllerCompat mediaControllerCompat = dialogC90914ZmA.LLIL;
            if (mediaControllerCompat == null || (playbackStateCompat = dialogC90914ZmA.LLILIL) == null) {
                return;
            }
            int i2 = 0;
            if (playbackStateCompat.mState == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ((playbackStateCompat.mActions & 514) != 0) {
                    mediaControllerCompat.LIZ.LIZ().LIZ();
                    i2 = R.string.ay;
                } else if ((playbackStateCompat.mActions & 1) != 0) {
                    mediaControllerCompat.LIZ.LIZ().LIZJ();
                    i2 = R.string.b0;
                }
            } else if ((playbackStateCompat.mActions & 516) != 0) {
                mediaControllerCompat.LIZ.LIZ().LIZIZ();
                i2 = R.string.az;
            }
            AccessibilityManager accessibilityManager = this.LJLIL.LLJJIJI;
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.setPackageName(this.LJLIL.LJLJL.getPackageName());
            obtain.setClassName(ZXF.class.getName());
            obtain.getText().add(this.LJLIL.LJLJL.getString(i2));
            this.LJLIL.LLJJIJI.sendAccessibilityEvent(obtain);
            return;
        }
        if (id != R.id.b1) {
            return;
        }
        this.LJLIL.dismiss();
    }
}
