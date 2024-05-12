package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;

/* loaded from: classes6.dex */
public class CO1 extends FrameLayout {
    public COG LJLIL;

    public void setListener(COG cog) {
        this.LJLIL = cog;
    }

    public CO1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C31241CNx c31241CNx;
        if (i == 4) {
            COG cog = this.LJLIL;
            if (cog != null && (c31241CNx = ((TTLiveBrowserFragment) ((C32789Ctt) cog).LJLIL).LLIIIZ) != null) {
                c31241CNx.onHideCustomView();
                return true;
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
