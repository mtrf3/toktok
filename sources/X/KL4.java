package X;

import Y.ALAdapterS4S0300000_8;
import Y.ALAdapterS6S0200000_8;
import Y.ARunnableS6S0101000_2;
import android.animation.Animator;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public abstract class KL4 extends KL6 {
    public int LJLILLLLZI;
    public int LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public final HandlerC165316eF LJLJJLL;

    public abstract void LJ();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.6eF] */
    public KL4(Boolean bool) {
        final ARunnableS6S0101000_2 aRunnableS6S0101000_2 = new ARunnableS6S0101000_2(2, this, 1);
        this.LJLJJLL = new Handler(aRunnableS6S0101000_2) { // from class: X.6eF
            public final Runnable LIZ;

            {
                this.LIZ = aRunnableS6S0101000_2;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    this.LIZ.run();
                }
                super.handleMessage(message);
            }
        };
        this.LJLIL = bool.booleanValue();
    }

    @Override // X.KL6, X.KL7, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            if (this.LJLIL) {
                Animator LIZ = LIZ(view);
                LIZ.addListener(new ALAdapterS6S0200000_8(this, view, motionEvent, 3));
                LIZ.start();
            }
            this.LJLILLLLZI = (int) motionEvent.getX();
            this.LJLJI = (int) motionEvent.getY();
            this.LJLJJI = System.currentTimeMillis();
            this.LJLJJL = false;
            Message obtain = Message.obtain();
            obtain.what = 1;
            sendMessageDelayed(obtain, 500L);
            view.setPressed(true);
            return true;
        }
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.LJLILLLLZI) > 50 || Math.abs(y - this.LJLJI) > 50) {
                removeCallbacksAndMessages(null);
            }
            view.setPressed(true);
        } else {
            if (motionEvent.getAction() == 1) {
                if ((hasMessages(1) || this.LJLJJL) && System.currentTimeMillis() - this.LJLJJI >= 500) {
                    z = true;
                } else {
                    z = false;
                }
                Animator LIZJ = LIZJ(view);
                if (!z) {
                    if (this.LJLIL) {
                        LIZJ.addListener(new ALAdapterS4S0300000_8(view, motionEvent, this, 4));
                    } else {
                        LIZIZ(motionEvent, view);
                    }
                }
                LIZJ.start();
                removeCallbacksAndMessages(null);
                view.setPressed(false);
                return true;
            }
            if (motionEvent.getAction() == 3) {
                if (this.LJLIL) {
                    LIZJ(view).start();
                }
                removeCallbacksAndMessages(null);
                view.setPressed(false);
            }
        }
        return false;
    }
}
