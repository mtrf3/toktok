package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.RrO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewTreeObserverOnPreDrawListenerC70854RrO implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ InterfaceC27538ArO LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (C78929UyL.LJIL(this.LJLIL)) {
            this.LJLILLLLZI.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC70854RrO(InterfaceC27538ArO interfaceC27538ArO, View view) {
        this.LJLIL = interfaceC27538ArO;
        this.LJLILLLLZI = view;
    }
}
