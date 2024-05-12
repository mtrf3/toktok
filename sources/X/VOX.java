package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.ies.xelement.overlay.LynxOverlayView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VOX extends VRK {
    public final /* synthetic */ LynxOverlayView LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        VPJ vpj;
        VPN vpn;
        VNU lynxContext = this.LJLIL.mContext;
        o.LJFF(lynxContext, "lynxContext");
        boolean z = lynxContext.LJLJLLL.LJLILLLLZI;
        LynxOverlayView lynxOverlayView = this.LJLIL;
        if (!lynxOverlayView.LJLLILLLL) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (z ? !((vpj = this.LJLIL.LJLLJ) == null || !vpj.LIZ(motionEvent)) : !((vpn = lynxOverlayView.LJLLL) == null || !vpn.LJII(motionEvent))) {
            return true;
        }
        return onHoverEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VOX(LynxOverlayView lynxOverlayView, Context context) {
        super(context);
        this.LJLIL = lynxOverlayView;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent event) {
        o.LJIIJ(event, "event");
        if (this.LJLIL.LJLLILLLL && event.getEventType() == 2048) {
            event.setSource(this);
        }
        return super.requestSendAccessibilityEvent(view, event);
    }
}
