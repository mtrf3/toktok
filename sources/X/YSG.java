package X;

import android.view.KeyEvent;
import android.view.Window;
import com.ss.android.videoshop.context.VideoContext;

/* loaded from: classes16.dex */
public final class YSG extends Z9T {
    public final /* synthetic */ VideoContext LJLILLLLZI;

    @Override // X.Z9T, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.LJLILLLLZI.isFullScreen() && ((keyEvent.getKeyCode() == 4 || (!this.LJLILLLLZI.keyCodes.isEmpty() && this.LJLILLLLZI.keyCodes.contains(Integer.valueOf(keyEvent.getKeyCode())))) && this.LJLILLLLZI.dispatchKeyEvent(keyEvent))) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YSG(VideoContext videoContext, Window.Callback callback) {
        super(callback);
        this.LJLILLLLZI = videoContext;
    }
}
