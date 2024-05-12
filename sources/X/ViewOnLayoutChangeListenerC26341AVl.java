package X;

import android.view.View;

/* renamed from: X.AVl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC26341AVl implements View.OnLayoutChangeListener {
    public final /* synthetic */ C72770ShC LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;

    public ViewOnLayoutChangeListenerC26341AVl(C72770ShC c72770ShC, View view, float f, float f2) {
        this.LJLIL = c72770ShC;
        this.LJLILLLLZI = view;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float width;
        C72770ShC c72770ShC = this.LJLIL;
        View view2 = this.LJLILLLLZI;
        float f = this.LJLJI;
        float f2 = this.LJLJJI;
        if (C26338AVi.LIZLLL(view2)) {
            width = f - f2;
        } else {
            view2.getDrawingRect(C26340AVk.LIZ);
            width = ((r0.width() - f) - c72770ShC.LJ) + f2;
        }
        c72770ShC.LJI = width;
    }
}
