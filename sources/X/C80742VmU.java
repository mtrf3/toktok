package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.VmU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80742VmU extends AbstractC80739VmR {
    public final /* synthetic */ DialogC80741VmT LIZ;

    @Override // X.AbstractC80739VmR
    public final void LIZ(View sheet) {
        o.LJIIIZ(sheet, "sheet");
    }

    public C80742VmU(DialogC80741VmT dialogC80741VmT) {
        this.LIZ = dialogC80741VmT;
    }

    @Override // X.AbstractC80739VmR
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            this.LIZ.cancel();
        }
    }
}
