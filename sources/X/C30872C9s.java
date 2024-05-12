package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.C9s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30872C9s extends View {
    public Activity LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;

    public void setCallback(InterfaceC29679Bkp interfaceC29679Bkp) {
    }

    public C30872C9s(Context context) {
        super(context);
        this.LJLJJL = true;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL != null) {
            if (this.LJLJJL && (this.LJLJI || this.LJLILLLLZI)) {
                motionEvent.offsetLocation(0.0f, this.LJLJJI);
            }
            return this.LJLIL.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setActivity(Activity activity) {
        this.LJLIL = activity;
        this.LJLILLLLZI = C15410j3.LIZJ(activity);
        this.LJLJJI = KL2.LJIIL(activity);
    }

    public void setShowStatusBar(boolean z) {
        this.LJLJI = z;
    }

    public C30872C9s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = true;
    }
}
