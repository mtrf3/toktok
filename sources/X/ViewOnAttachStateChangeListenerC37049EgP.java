package X;

import android.view.View;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EgP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC37049EgP implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        v.removeOnAttachStateChangeListener(this);
        ((ConcurrentHashMap) SecLinkManager.LIZ).remove(v);
    }
}
