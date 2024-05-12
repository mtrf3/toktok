package X;

import Y.ALAdapterS4S0300000_8;
import Y.ALAdapterS6S0200000_8;
import Y.IDRunnableS6S0101000;
import android.animation.Animator;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public abstract class KL5 extends KL6 {
    public int LJLILLLLZI;
    public int LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public final HandlerC48508J2a LJLJJLL = new HandlerC48508J2a(new IDRunnableS6S0101000(3, this, 26));

    public abstract void LJ();

    public KL5(Boolean bool) {
        this.LJLIL = bool.booleanValue();
    }

    @Override // X.KL6, X.KL7, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            if (this.LJLIL) {
                Animator LIZ = LIZ(view);
                LIZ.addListener(new ALAdapterS6S0200000_8(this, view, motionEvent, 1));
                LIZ.start();
            }
            this.LJLILLLLZI = (int) motionEvent.getX();
            this.LJLJI = (int) motionEvent.getY();
            this.LJLJJI = System.currentTimeMillis();
            this.LJLJJL = false;
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.LJLJJLL.sendMessageDelayed(obtain, 500L);
            view.setPressed(true);
            return true;
        }
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.LJLILLLLZI) > 50 || Math.abs(y - this.LJLJI) > 50) {
                this.LJLJJLL.removeCallbacksAndMessages(null);
            }
            view.setPressed(true);
        } else {
            if (motionEvent.getAction() == 1) {
                if ((this.LJLJJLL.hasMessages(1) || this.LJLJJL) && System.currentTimeMillis() - this.LJLJJI >= 500) {
                    z = true;
                } else {
                    z = false;
                }
                Animator LIZJ = LIZJ(view);
                if (!z) {
                    if (this.LJLIL) {
                        LIZJ.addListener(new ALAdapterS4S0300000_8(view, motionEvent, this, 1));
                    } else {
                        LIZIZ(motionEvent, view);
                    }
                }
                LIZJ.start();
                this.LJLJJLL.removeCallbacksAndMessages(null);
                view.setPressed(false);
                return true;
            }
            if (motionEvent.getAction() == 3) {
                if (this.LJLIL) {
                    LIZJ(view).start();
                }
                this.LJLJJLL.removeCallbacksAndMessages(null);
                view.setPressed(false);
            }
        }
        return false;
    }
}
