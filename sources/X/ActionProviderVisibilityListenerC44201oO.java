package X;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.1oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ActionProviderVisibilityListenerC44201oO extends C37361dM implements ActionProvider.VisibilityListener {
    public InterfaceC16130kD LJ;

    @Override // X.AbstractC16150kF
    public final boolean LIZIZ() {
        return this.LIZJ.isVisible();
    }

    @Override // X.AbstractC16150kF
    public final boolean LJI() {
        return this.LIZJ.overridesItemVisibility();
    }

    @Override // X.AbstractC16150kF
    public final View LIZLLL(MenuItem menuItem) {
        return this.LIZJ.onCreateActionView(menuItem);
    }

    @Override // X.AbstractC16150kF
    public final void LJII(C281518p c281518p) {
        this.LJ = c281518p;
        this.LIZJ.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC16130kD interfaceC16130kD = this.LJ;
        if (interfaceC16130kD != null) {
            C281318n c281318n = ((C281518p) interfaceC16130kD).LIZ.LJIILIIL;
            c281318n.LJII = true;
            c281318n.LJIILL(true);
        }
    }

    public ActionProviderVisibilityListenerC44201oO(MenuItemC37381dO menuItemC37381dO, Context context, ActionProvider actionProvider) {
        super(menuItemC37381dO, context, actionProvider);
    }
}
