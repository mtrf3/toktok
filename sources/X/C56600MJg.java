package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.MJg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56600MJg extends C81334Vw2 {
    public View LLIL;
    public int LLILII;
    public boolean LLILIL;
    public float LLILL;
    public float LLILLIZIL;
    public float LLILLJJLI;
    public int LLILLL;

    @Override // X.C81334Vw2, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.LLIL != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2) {
                        if (this.LLILIL) {
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(this.LLILLL);
                        float x = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x - this.LLILLIZIL);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.LLILLJJLI);
                        if (abs > this.LLILII && abs * 0.5f > abs2 && this.LLIL.getBottom() > y) {
                            this.LLILIL = true;
                            return false;
                        }
                        if (x - this.LLILLIZIL > 0.0f) {
                            f = this.LLILL + this.LLILII;
                        } else {
                            f = this.LLILL - this.LLILII;
                        }
                        this.LLILLIZIL = f;
                        this.LLILLJJLI = y;
                    }
                } else {
                    float x2 = motionEvent.getX();
                    this.LLILL = x2;
                    this.LLILLIZIL = x2;
                    this.LLILLJJLI = motionEvent.getY();
                    this.LLILIL = false;
                    this.LLILLL = motionEvent.getPointerId(0);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void setHeader(View view) {
        this.LLIL = view;
    }

    public C56600MJg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILII = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.LLILIL = false;
        setDoNotCatchException(true);
    }
}
