package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashMap;

/* renamed from: X.LKc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnPreDrawListenerC54074LKc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LJLIL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<String, String> hashMap = LX1.LIZ;
        hashMap.put("duration_touch_tab_to_first_view", String.valueOf(elapsedRealtime - LX1.LIZIZ));
        hashMap.put("duration_from_fetch_feed_to_first_view", String.valueOf(elapsedRealtime - LX1.LIZJ));
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC54074LKc(View view) {
        this.LJLIL = view;
    }
}
