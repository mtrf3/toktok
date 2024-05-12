package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WoK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83404WoK implements InterfaceC83391Wo7 {
    public final /* synthetic */ C83399WoF LIZ;

    public C83404WoK(C83399WoF c83399WoF) {
        this.LIZ = c83399WoF;
    }

    @Override // X.InterfaceC83391Wo7
    public final void LIZ(boolean z) {
        int i;
        View view = this.LIZ.LJJLIIIIJ().LJLJI;
        if (view != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            if (!z) {
                this.LIZ.LJJLIIIIJ().LLJILJIL().clearFocus();
            }
            this.LIZ.LJLL = z;
            return;
        }
        o.LJIJI("hideBtn");
        throw null;
    }
}
