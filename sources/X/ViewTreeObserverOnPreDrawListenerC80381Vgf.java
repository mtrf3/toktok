package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: X.Vgf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewTreeObserverOnPreDrawListenerC80381Vgf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC80382Vgg LJLJI;
    public final /* synthetic */ ExpandableBehavior LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.LJLJJI;
        if (expandableBehavior.LIZ == this.LJLILLLLZI) {
            InterfaceC80382Vgg interfaceC80382Vgg = this.LJLJI;
            expandableBehavior.LIZ((View) interfaceC80382Vgg, this.LJLIL, interfaceC80382Vgg.LJJJLZIJ(), false);
        }
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC80381Vgf(ExpandableBehavior expandableBehavior, View view, int i, InterfaceC80382Vgg interfaceC80382Vgg) {
        this.LJLJJI = expandableBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC80382Vgg;
    }
}
