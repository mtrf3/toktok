package X;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;

/* renamed from: X.1dM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37361dM extends AbstractC16150kF {
    public final ActionProvider LIZJ;
    public final /* synthetic */ MenuItemC37381dO LIZLLL;

    @Override // X.AbstractC16150kF
    public final boolean LIZ() {
        return this.LIZJ.hasSubMenu();
    }

    @Override // X.AbstractC16150kF
    public final View LIZJ() {
        return this.LIZJ.onCreateActionView();
    }

    @Override // X.AbstractC16150kF
    public final boolean LJ() {
        return this.LIZJ.onPerformDefaultAction();
    }

    @Override // X.AbstractC16150kF
    public final void LJFF(SubMenuC39851hN subMenuC39851hN) {
        this.LIZJ.onPrepareSubMenu(this.LIZLLL.LJ(subMenuC39851hN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37361dM(MenuItemC37381dO menuItemC37381dO, Context context, ActionProvider actionProvider) {
        super(context);
        this.LIZLLL = menuItemC37381dO;
        this.LIZJ = actionProvider;
    }
}
