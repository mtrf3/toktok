package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.XUy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84932XUy implements C10I<InterfaceC84498XEg, Void> {
    public final /* synthetic */ boolean LIZ = false;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C84942XVi LIZLLL;

    @Override // X.C10I
    public final Void then(C10K<InterfaceC84498XEg> c10k) {
        C84930XUw c84930XUw;
        boolean z;
        C84942XVi c84942XVi = this.LIZLLL;
        if (c84942XVi.LIZIZ != null) {
            java.util.Map<String, String> LJ = c84942XVi.LJ();
            if (this.LIZ) {
                C84942XVi c84942XVi2 = this.LIZLLL;
                c84942XVi2.LJJIFFI.fetchEffectListResource(c84942XVi2.LIZLLL, LJ, false, c84942XVi2.LIZIZ, c84942XVi2.LJJJJJL);
            } else {
                C34821Yg LJFF = this.LIZLLL.LJFF();
                if (this.LIZIZ) {
                    c84930XUw = null;
                } else {
                    c84930XUw = this.LIZLLL.LJJJJL;
                }
                boolean z2 = this.LIZJ;
                String str = (String) ListProtector.get(this.LIZLLL.LIZLLL, 0);
                C84942XVi c84942XVi3 = this.LIZLLL;
                if (c84942XVi3.LJJJJI && c84942XVi3.LIZ) {
                    z = true;
                } else {
                    z = false;
                }
                LJFF.LJIIIZ(LJ, c84930XUw, z2, str, z);
            }
        }
        return null;
    }

    public C84932XUy(C84942XVi c84942XVi, boolean z, boolean z2) {
        this.LIZLLL = c84942XVi;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
