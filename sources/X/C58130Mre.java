package X;

import com.ss.android.elearning.lingo.gecko.GeckoAPI;
import com.ss.android.ugc.aweme.lingo.GeckoService;

/* renamed from: X.Mre, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58130Mre implements GeckoAPI {
    public static final /* synthetic */ C58130Mre LIZJ = new C58130Mre();
    public final /* synthetic */ GeckoAPI LIZIZ;

    @Override // com.ss.android.elearning.lingo.gecko.GeckoAPI
    public final long LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // com.ss.android.elearning.lingo.gecko.GeckoAPI
    public final C61520OCm LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    public C58130Mre() {
        GeckoAPI geckoAPI;
        Object LIZ = C58096Mr6.LIZ(GeckoAPI.class, false);
        if (LIZ != null) {
            geckoAPI = (GeckoAPI) LIZ;
        } else {
            if (C58096Mr6.s2 == null) {
                synchronized (GeckoAPI.class) {
                    if (C58096Mr6.s2 == null) {
                        C58096Mr6.s2 = new GeckoService();
                    }
                }
            }
            geckoAPI = C58096Mr6.s2;
        }
        this.LIZIZ = geckoAPI;
    }
}
