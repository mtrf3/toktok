package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.NdB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractViewOnTouchListenerC59781NdB implements View.OnTouchListener {
    public final int LJLIL;
    public View LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final int LJLJL;
    public InterfaceC59783NdD LJLJLJ;
    public View.OnTouchListener LJLJLLL;
    public long LJLL;
    public final ARunnableS46S0100000_10 LJLLI;

    public abstract void LIZ(boolean z);

    public AbstractViewOnTouchListenerC59781NdB(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = -1;
        this.LJLJL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLLI = new ARunnableS46S0100000_10(this, 60);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf;
        View.OnTouchListener onTouchListener;
        if (view != null) {
            this.LJLILLLLZI = view;
            if (!view.isEnabled()) {
                return false;
            }
            if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                if (valueOf.intValue() == 0) {
                    this.LJLJI = motionEvent.getX();
                    this.LJLJJI = motionEvent.getY();
                    this.LJLL = SystemClock.elapsedRealtime();
                    C38816FLg.LIZLLL(this.LJLLI, this.LJLJL);
                    LIZ(true);
                    View.OnTouchListener onTouchListener2 = this.LJLJLLL;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this.LJLILLLLZI, motionEvent);
                    }
                } else if (valueOf.intValue() == 5) {
                    C38816FLg.LIZ(this.LJLLI);
                    LIZ(false);
                } else if (valueOf.intValue() == 2) {
                    this.LJLJJL = motionEvent.getX();
                    this.LJLJJLL = motionEvent.getY();
                    float abs = Math.abs(this.LJLJI - this.LJLJJL);
                    float abs2 = Math.abs(this.LJLJJI - this.LJLJJLL);
                    float f = this.LJLIL;
                    if (abs > f || abs2 > f) {
                        C38816FLg.LIZ(this.LJLLI);
                        LIZ(false);
                    }
                    View.OnTouchListener onTouchListener3 = this.LJLJLLL;
                    if (onTouchListener3 != null) {
                        onTouchListener3.onTouch(this.LJLILLLLZI, motionEvent);
                    }
                } else if (valueOf.intValue() == 3 || valueOf.intValue() == 1) {
                    C38816FLg.LIZ(this.LJLLI);
                    LIZ(false);
                    if (SystemClock.elapsedRealtime() - this.LJLL < this.LJLJL && (onTouchListener = this.LJLJLLL) != null) {
                        onTouchListener.onTouch(this.LJLILLLLZI, motionEvent);
                    }
                }
            }
        }
        return true;
    }
}
