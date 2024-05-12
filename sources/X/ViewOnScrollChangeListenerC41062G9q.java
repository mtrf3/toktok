package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.G9q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnScrollChangeListenerC41062G9q implements View.OnScrollChangeListener {
    public final /* synthetic */ GAG LIZ;

    public ViewOnScrollChangeListenerC41062G9q(GAG gag) {
        this.LIZ = gag;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View v, int i, int i2, int i3, int i4) {
        for (InterfaceC41061G9p interfaceC41061G9p : this.LIZ.LIZJ) {
            o.LJIIIIZZ(v, "v");
            interfaceC41061G9p.LIZ(v);
        }
    }
}
