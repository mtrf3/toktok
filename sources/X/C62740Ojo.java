package X;

import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ojo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62740Ojo extends AbstractC26257ASf {
    public final /* synthetic */ Dialog LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public C62740Ojo(Dialog dialog) {
        this.LIZ = dialog;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i == 5) {
            this.LIZ.cancel();
        }
    }
}
