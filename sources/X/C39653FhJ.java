package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: X.FhJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39653FhJ implements InterfaceC39657FhN {
    public final /* synthetic */ C36728EbE LIZ;
    public final /* synthetic */ java.util.Set LIZIZ;
    public final /* synthetic */ AtomicBoolean LIZJ;
    public final /* synthetic */ C39648FhE LIZLLL;

    public C39653FhJ(C39648FhE c39648FhE, C36728EbE c36728EbE, java.util.Set set, AtomicBoolean atomicBoolean) {
        this.LIZLLL = c39648FhE;
        this.LIZ = c36728EbE;
        this.LIZIZ = set;
        this.LIZJ = atomicBoolean;
    }

    @Override // X.InterfaceC39657FhN
    public final void LIZ(ZipFile zipFile, java.util.Set<C39659FhP> set) {
        this.LIZLLL.LIZJ(this.LIZ, set, new C39654FhK(this));
    }
}
