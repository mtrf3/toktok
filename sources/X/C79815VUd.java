package X;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VUd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79815VUd extends C16120kC {
    public final /* synthetic */ DrawerLayout LIZ;

    public C79815VUd(DrawerLayout drawerLayout) {
        this.LIZ = drawerLayout;
        new Rect();
    }

    @Override // X.C16120kC
    public final boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(event, "event");
        if (event.getEventType() == 32) {
            o.LJIIIIZZ(event.getText(), "event.text");
            View LJII = this.LIZ.LJII();
            if (LJII != null) {
                int LJIIIZ = this.LIZ.LJIIIZ(LJII);
                DrawerLayout drawerLayout = this.LIZ;
                drawerLayout.getClass();
                Gravity.getAbsoluteGravity(LJIIIZ, C16310kV.LIZLLL(drawerLayout));
                return true;
            }
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(host, event);
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        event.setClassName("com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout");
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL("com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout");
        info.LJIJJLI(false);
        info.LIZ.setFocused(false);
        info.LJII(C17720mm.LJ);
        info.LJII(C17720mm.LJFF);
    }

    @Override // X.C16120kC
    public final boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(event, "event");
        return super.onRequestSendAccessibilityEvent(host, child, event);
    }
}
