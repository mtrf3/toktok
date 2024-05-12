package X;

import android.content.Intent;
import java.util.List;

/* renamed from: X.Fvd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40541Fvd implements InterfaceC39666FhW {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ List LJ;
    public final /* synthetic */ C40542Fve LJFF;

    public C40541Fvd(C40542Fve c40542Fve, List list, List list2, long j, boolean z, List list3) {
        this.LJFF = c40542Fve;
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = list3;
    }

    @Override // X.InterfaceC39666FhW
    public final void a() {
        this.LJFF.LJIIJ.addAll(this.LIZ);
        this.LJFF.LJIIJJI.addAll(this.LIZIZ);
        this.LJFF.LJI(5, 0, null, Long.valueOf(this.LIZJ), Long.valueOf(this.LIZJ), null, null);
    }

    @Override // X.InterfaceC39666FhW
    public final void b() {
        if (!this.LIZLLL) {
            C40542Fve c40542Fve = this.LJFF;
            List<Intent> list = this.LJ;
            c40542Fve.LJII.a().LIZ(list, new C40541Fvd(c40542Fve, this.LIZ, this.LIZIZ, this.LIZJ, true, list));
        }
    }

    @Override // X.InterfaceC39666FhW
    public final void LIZ(int i) {
        this.LJFF.LJI(6, i, null, null, null, null, null);
    }
}
