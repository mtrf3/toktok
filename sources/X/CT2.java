package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;

/* loaded from: classes6.dex */
public final class CT2 implements View.OnTouchListener {
    public float LJLIL;
    public final /* synthetic */ PublicScreenWidget LJLILLLLZI;

    public CT2(PublicScreenWidget publicScreenWidget) {
        this.LJLILLLLZI = publicScreenWidget;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && motionEvent.getY() - this.LJLIL != 0.0f) {
                this.LJLILLLLZI.getClass();
            }
        } else {
            this.LJLIL = motionEvent.getY();
            PublicScreenWidget publicScreenWidget = this.LJLILLLLZI;
            if (publicScreenWidget.LJLLILLLL == CT0.NORMAL) {
                publicScreenWidget.LLIIIJ(false);
            }
        }
        return false;
    }
}
