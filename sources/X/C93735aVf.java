package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aVf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93735aVf {
    public static final /* synthetic */ int LJ = 0;
    public final C94460ahM LIZ;
    public boolean LIZIZ;
    public final C93738aVi LIZJ;
    public float LIZLLL;

    public final void LIZ() {
        C94034aaU.LIZ("KeyBoardUtils", "un observe");
        C93738aVi c93738aVi = this.LIZJ;
        if (c93738aVi != null) {
            C94460ahM c94460ahM = this.LIZ;
            if (c94460ahM != null) {
                c93738aVi.LIZJ.remove(c94460ahM);
                this.LIZIZ = false;
                return;
            } else {
                o.LJIJI("observer");
                throw null;
            }
        }
        o.LJIJI("keyboardUtils");
        throw null;
    }

    public C93735aVf(View view, View view2, C93738aVi c93738aVi) {
        this.LIZJ = c93738aVi;
        C94460ahM c94460ahM = new C94460ahM(this, view, view2);
        this.LIZ = c94460ahM;
        C94034aaU.LIZ("KeyBoardUtils", "observe");
        c93738aVi.LIZJ.add(c94460ahM);
    }
}
