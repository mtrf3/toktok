package X;

import java.io.File;

/* renamed from: X.FhK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39654FhK implements InterfaceC39660FhQ {
    public final /* synthetic */ C39653FhJ LIZ;

    public C39654FhK(C39653FhJ c39653FhJ) {
        this.LIZ = c39653FhJ;
    }

    @Override // X.InterfaceC39660FhQ
    public final void LIZ(C39659FhP c39659FhP, File file, boolean z) {
        this.LIZ.LIZIZ.add(file);
        if (z) {
            return;
        }
        this.LIZ.LIZJ.set(false);
    }
}
