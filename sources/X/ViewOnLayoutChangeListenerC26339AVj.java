package X;

import android.view.View;

/* renamed from: X.AVj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC26339AVj implements View.OnLayoutChangeListener {
    public final /* synthetic */ C72769ShB LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;

    public ViewOnLayoutChangeListenerC26339AVj(C72769ShB c72769ShB, View view, float f, float f2) {
        this.LJLIL = c72769ShB;
        this.LJLILLLLZI = view;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float width;
        C72769ShB c72769ShB = this.LJLIL;
        View view2 = this.LJLILLLLZI;
        float f = this.LJLJI;
        float f2 = this.LJLJJI;
        if (C26338AVi.LIZLLL(view2)) {
            width = f - f2;
        } else {
            view2.getDrawingRect(C26338AVi.LIZ);
            width = ((r0.width() - f) - c72769ShB.LJ) + f2;
        }
        c72769ShB.LJI = width;
    }
}
