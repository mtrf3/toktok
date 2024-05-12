package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.3nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94623nW extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Lifecycle.State state;
        LifecycleOwner LIZIZ;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (LIZIZ = C57434MgQ.LIZIZ(LJIJJ)) != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED) {
            final String str = "should not remove this view";
            C78983UzD.LJIIZILJ(new RuntimeException(str) { // from class: X.3nX
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(str);
                    o.LJIIIZ(str, "message");
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94623nW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
