package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.a0P, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91797a0P extends ScrollView {
    public InterfaceC91796a0O LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnScrollListener(InterfaceC91796a0O interfaceC91796a0O) {
        this.LJLIL = interfaceC91796a0O;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91797a0P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC91796a0O interfaceC91796a0O = this.LJLIL;
        if (interfaceC91796a0O != null) {
            interfaceC91796a0O.LIZ(i2);
        }
    }
}
