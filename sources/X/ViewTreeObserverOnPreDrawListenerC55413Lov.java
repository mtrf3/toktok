package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Lov, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnPreDrawListenerC55413Lov implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        try {
            C06O.LJ(this.LJLILLLLZI);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public ViewTreeObserverOnPreDrawListenerC55413Lov(View view, Activity activity) {
        this.LJLIL = view;
        this.LJLILLLLZI = activity;
    }
}
