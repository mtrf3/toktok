package X;

import X.C38338F2w;
import android.os.Bundle;

/* renamed from: X.VGk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79458VGk<P extends C38338F2w> {
    public final C0TS LIZ;
    public P LIZIZ;
    public Bundle LIZJ;
    public boolean LIZLLL;

    public final P LIZ() {
        Bundle bundle;
        if (this.LIZ != null) {
            if (this.LIZIZ == null && (bundle = this.LIZJ) != null) {
                this.LIZIZ = (P) EnumC79456VGi.INSTANCE.getPresenter(bundle.getString("presenter_id"));
            }
            if (this.LIZIZ == null) {
                C0TS c0ts = this.LIZ;
                c0ts.getClass();
                try {
                    P p = (P) ((Class) c0ts.LIZ).newInstance();
                    this.LIZIZ = p;
                    EnumC79456VGi.INSTANCE.add(p);
                    P p2 = this.LIZIZ;
                    Bundle bundle2 = this.LIZJ;
                    if (bundle2 != null) {
                        bundle2.getBundle("presenter");
                    }
                    p2.getClass();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            this.LIZJ = null;
        }
        return this.LIZIZ;
    }

    public C79458VGk(C0TS c0ts) {
        this.LIZ = c0ts;
    }
}
