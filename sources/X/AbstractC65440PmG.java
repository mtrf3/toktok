package X;

import com.bytedance.retrofit2.client.Request;

/* renamed from: X.PmG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65440PmG {
    public static final C65442PmI LIZIZ = new C65442PmI(false, false);
    public final AbstractC65440PmG LIZ;

    public abstract C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt c64797Pbt);

    public AbstractC65440PmG(AbstractC65440PmG abstractC65440PmG) {
        this.LIZ = abstractC65440PmG;
    }

    public final C65442PmI LIZIZ(C65441PmH c65441PmH, Request request, C64797Pbt c64797Pbt) {
        AbstractC65440PmG abstractC65440PmG;
        C65442PmI LIZ = LIZ(c65441PmH, request, c64797Pbt);
        if (LIZ.LIZIZ || (abstractC65440PmG = this.LIZ) == null) {
            return LIZ;
        }
        return abstractC65440PmG.LIZIZ(c65441PmH, request, c64797Pbt);
    }
}
