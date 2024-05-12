package X;

import java.util.HashSet;
import java.util.zip.ZipFile;

/* renamed from: X.FhI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39652FhI implements InterfaceC39657FhN {
    public final /* synthetic */ java.util.Set LIZ;
    public final /* synthetic */ C36728EbE LIZIZ;
    public final /* synthetic */ C39648FhE LIZJ;

    public C39652FhI(C39648FhE c39648FhE, java.util.Set set, C36728EbE c36728EbE) {
        this.LIZJ = c39648FhE;
        this.LIZ = set;
        this.LIZIZ = c36728EbE;
    }

    @Override // X.InterfaceC39657FhN
    public final void LIZ(ZipFile zipFile, java.util.Set<C39659FhP> set) {
        java.util.Set set2 = this.LIZ;
        C39648FhE c39648FhE = this.LIZJ;
        C36728EbE c36728EbE = this.LIZIZ;
        HashSet hashSet = new HashSet();
        c39648FhE.LIZJ(c36728EbE, set, new C39650FhG(hashSet, c36728EbE, zipFile));
        set2.addAll(hashSet);
    }
}
