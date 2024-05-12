package X;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.WsB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83643WsB extends FrameLayout {
    public final /* synthetic */ C83666WsY LJLIL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        C83666WsY c83666WsY = this.LJLIL;
        c83666WsY.getClass();
        o.LJIIIZ(event, "event");
        C83631Wrz c83631Wrz = c83666WsY.LIZ;
        c83631Wrz.getClass();
        c83631Wrz.LIZIZ.onTouchEvent(event);
        c83631Wrz.LIZJ.LIZ(event);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83643WsB(C29S c29s, C83666WsY c83666WsY) {
        super(c29s);
        this.LJLIL = c83666WsY;
    }
}
