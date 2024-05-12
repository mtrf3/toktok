package X;

import Y.IDCListenerS262S0100000_42;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aUw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93690aUw extends HorizontalScrollView {
    public final List<InterfaceC93688aUu> LJLIL;
    public final List<View.OnLayoutChangeListener> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final int LJLJJL;

    public C93690aUw(Context context) {
        super(context, null, 0);
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
        this.LJLJJL = viewConfiguration.getScaledTouchSlop();
        setHorizontalScrollBarEnabled(false);
        setBackground(null);
        setPadding(0, 0, 0, 0);
        addOnLayoutChangeListener(new IDCListenerS262S0100000_42(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getActionMasked() == 0) {
                this.LJLJI = (int) motionEvent.getX();
                this.LJLJJI = (int) motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 1 && Math.abs(((int) motionEvent.getX()) - this.LJLJI) < this.LJLJJL && Math.abs(((int) motionEvent.getY()) - this.LJLJJI) < this.LJLJJL) {
                performClick();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC93688aUu) it.next()).LIZ(this, i);
        }
    }
}
