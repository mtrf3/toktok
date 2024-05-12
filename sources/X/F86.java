package X;

import com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi;
import com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla.GodzillaImpl;

/* loaded from: classes7.dex */
public final class F86 implements IGodzillaApi {
    public static final F86 LIZIZ = new F86();
    public final /* synthetic */ IGodzillaApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public F86() {
        IGodzillaApi iGodzillaApi;
        Object LIZ = C58096Mr6.LIZ(IGodzillaApi.class, false);
        if (LIZ != null) {
            iGodzillaApi = (IGodzillaApi) LIZ;
        } else {
            if (C58096Mr6.Y1 == null) {
                synchronized (IGodzillaApi.class) {
                    if (C58096Mr6.Y1 == null) {
                        C58096Mr6.Y1 = new GodzillaImpl();
                    }
                }
            }
            iGodzillaApi = C58096Mr6.Y1;
        }
        this.LIZ = iGodzillaApi;
    }
}
