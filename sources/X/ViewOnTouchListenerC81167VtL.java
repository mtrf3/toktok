package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.VtL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC81167VtL implements View.OnTouchListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public MotionEvent LJLJLLL;
    public MotionEvent LJLL;
    public final /* synthetic */ InterfaceC81168VtM LJLLI;
    public final /* synthetic */ Handler LJLLILLLL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        this.LJLLI.LIZ();
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int x = (int) (event.getX() - this.LJLIL);
                    int y = (int) (event.getY() - this.LJLILLLLZI);
                    int i = (y * y) + (x * x);
                    if (i > this.LJLJJI || Math.abs(x) >= this.LJLJI) {
                        this.LJLJL = false;
                        this.LJLLILLLL.removeMessages(0);
                    }
                    if (i > this.LJLJJL) {
                        this.LJLJJLL = false;
                    }
                }
            } else if (this.LJLJL) {
                if (!this.LJLJLJ && this.LJLJLLL != null) {
                    Handler handler = this.LJLLILLLL;
                    Message obtainMessage = handler.obtainMessage(0, new C15070iV(Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI)));
                    long doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() - event.getEventTime();
                    MotionEvent motionEvent = this.LJLJLLL;
                    o.LJI(motionEvent);
                    handler.sendMessageDelayed(obtainMessage, motionEvent.getEventTime() + doubleTapTimeout);
                }
                MotionEvent motionEvent2 = this.LJLL;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.LJLL = MotionEvent.obtain(event);
            }
        } else {
            if (this.LJLLILLLL.hasMessages(0)) {
                this.LJLLILLLL.removeMessages(0);
            }
            this.LJLJLJ = false;
            MotionEvent motionEvent3 = this.LJLJLLL;
            MotionEvent motionEvent4 = this.LJLL;
            if (motionEvent3 != null && motionEvent4 != null && this.LJLJJLL) {
                long eventTime = event.getEventTime() - motionEvent4.getEventTime();
                if (eventTime <= ViewConfiguration.getDoubleTapTimeout() && eventTime >= 40) {
                    int x2 = ((int) motionEvent3.getX()) - ((int) event.getX());
                    int y2 = ((int) motionEvent3.getY()) - ((int) event.getY());
                    if ((y2 * y2) + (x2 * x2) < this.LJLJJL) {
                        this.LJLJLJ = true;
                        this.LJLLI.LJJJ(this.LJLJLLL);
                    }
                }
            }
            MotionEvent motionEvent5 = this.LJLJLLL;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.LJLJLLL = MotionEvent.obtain(event);
            this.LJLJL = true;
            this.LJLJJLL = true;
            this.LJLIL = event.getX();
            this.LJLILLLLZI = event.getY();
        }
        return false;
    }

    public ViewOnTouchListenerC81167VtL(Activity activity, WeakHandler weakHandler, C82712WdA c82712WdA) {
        this.LJLLI = c82712WdA;
        this.LJLLILLLL = weakHandler;
        int scaledDoubleTapSlop = ViewConfiguration.get(activity).getScaledDoubleTapSlop();
        int scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop() * 3;
        this.LJLJI = scaledTouchSlop;
        this.LJLJJI = scaledTouchSlop * scaledTouchSlop;
        this.LJLJJL = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }
}
