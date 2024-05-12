package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.JYy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractViewOnTouchListenerC49364JYy implements View.OnTouchListener {
    public final int LJLIL;
    public View LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final int LJLJL;
    public View.OnTouchListener LJLJLJ;
    public long LJLJLLL;
    public final ARunnableS44S0100000_8 LJLL;

    public abstract void LIZ(boolean z);

    public AbstractViewOnTouchListenerC49364JYy(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = -1;
        this.LJLJL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLL = new ARunnableS44S0100000_8(this, 177);
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
                    this.LJLJLLL = SystemClock.elapsedRealtime();
                    C38816FLg.LIZLLL(this.LJLL, this.LJLJL);
                    LIZ(true);
                    View.OnTouchListener onTouchListener2 = this.LJLJLJ;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this.LJLILLLLZI, motionEvent);
                    }
                } else if (valueOf.intValue() == 5) {
                    C38816FLg.LIZ(this.LJLL);
                    LIZ(false);
                } else if (valueOf.intValue() == 2) {
                    this.LJLJJL = motionEvent.getX();
                    this.LJLJJLL = motionEvent.getY();
                    float abs = Math.abs(this.LJLJI - this.LJLJJL);
                    float abs2 = Math.abs(this.LJLJJI - this.LJLJJLL);
                    float f = this.LJLIL;
                    if (abs > f || abs2 > f) {
                        C38816FLg.LIZ(this.LJLL);
                        LIZ(false);
                    }
                    View.OnTouchListener onTouchListener3 = this.LJLJLJ;
                    if (onTouchListener3 != null) {
                        onTouchListener3.onTouch(this.LJLILLLLZI, motionEvent);
                    }
                } else if (valueOf.intValue() == 3 || valueOf.intValue() == 1) {
                    C38816FLg.LIZ(this.LJLL);
                    LIZ(false);
                    if (SystemClock.elapsedRealtime() - this.LJLJLLL < this.LJLJL && (onTouchListener = this.LJLJLJ) != null) {
                        onTouchListener.onTouch(this.LJLILLLLZI, motionEvent);
                    }
                }
            }
        }
        return true;
    }
}
