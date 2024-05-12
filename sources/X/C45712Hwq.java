package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45712Hwq extends TMN {
    public final /* synthetic */ C45709Hwn LIZ;

    @Override // X.TMN
    public final void LIZ(View view) {
    }

    public C45712Hwq(C45709Hwn c45709Hwn) {
        this.LIZ = c45709Hwn;
    }

    @Override // X.TMN
    public final void LIZIZ(int i, View view) {
        if (i != 1) {
            if (i != 5) {
                return;
            }
            this.LIZ.LLJJ(false, false);
        } else {
            if (!C45716Hwu.LIZ()) {
                return;
            }
            C42231Ghn c42231Ghn = this.LIZ.LJLLLLLL;
            if (c42231Ghn != null) {
                if (c42231Ghn.getVisibility() != 8) {
                    return;
                }
                this.LIZ.LLJILJIL(true);
                return;
            }
            o.LJIJI("galleryButton");
            throw null;
        }
    }
}
