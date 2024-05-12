package X;

import Y.ARunnableS10S0101000_6;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;

/* loaded from: classes7.dex */
public final class FFH extends AnimationDrawable {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final Handler LJLIL;

    public FFH() {
        setOneShot(false);
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void start() {
        Handler handler;
        super.start();
        if (getNumberOfFrames() <= 0 || getDuration(0) <= 0 || (handler = this.LJLIL) == null) {
            return;
        }
        handler.postDelayed(new ARunnableS10S0101000_6(3, this, 14), getDuration(0) * getNumberOfFrames() * 4);
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
