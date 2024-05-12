package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.9zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C255179zt {
    public String LIZ = HG3.LJIILL().getCurUserId();
    public C255179zt LIZIZ;
    public final Keva LIZJ;

    public final C255179zt LIZ() {
        if (this.LIZIZ == null || !o.LJ(this.LIZ, HG3.LJIILL().getCurUserId())) {
            synchronized (C255179zt.class) {
                this.LIZ = HG3.LJIILL().getCurUserId();
                this.LIZIZ = new C255179zt();
            }
        }
        C255179zt c255179zt = this.LIZIZ;
        o.LJI(c255179zt);
        return c255179zt;
    }

    public C255179zt() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("guide_user_bind_number_");
        LIZ.append(this.LIZ);
        this.LIZJ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
