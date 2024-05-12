package X;

import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.67h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1552167h extends AbstractC1552267i {
    public final String LIZ = "caption_sticker_";
    public int LIZIZ = -1;

    @Override // X.AbstractC1552267i
    public final String LIZIZ(int i, String draftDir) {
        o.LJIIIZ(draftDir, "draftDir");
        if (i == -1) {
            i = this.LIZIZ + 1;
        }
        this.LIZIZ = i;
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(draftDir, separator, false)) {
            draftDir = i0.LJFF(draftDir, separator);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(draftDir);
        LIZ.append(this.LIZ);
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ".png", LIZ);
    }
}
