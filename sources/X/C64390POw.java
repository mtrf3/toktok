package X;

import com.ss.android.ugc.aweme.trace.ITraceConfigApi;
import com.ss.android.ugc.aweme.trace.TraceConfigApiImpl;

/* renamed from: X.POw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64390POw implements ITraceConfigApi {
    public static final C64390POw LIZIZ = new C64390POw();
    public final /* synthetic */ ITraceConfigApi LIZ;

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final void LIZLLL(E5O e5o) {
        this.LIZ.LIZLLL(e5o);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final C64382POo LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJII(String str) {
        return this.LIZ.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    public C64390POw() {
        ITraceConfigApi iTraceConfigApi;
        Object LIZ = C58096Mr6.LIZ(ITraceConfigApi.class, false);
        if (LIZ != null) {
            iTraceConfigApi = (ITraceConfigApi) LIZ;
        } else {
            if (C58096Mr6.F7 == null) {
                synchronized (ITraceConfigApi.class) {
                    if (C58096Mr6.F7 == null) {
                        C58096Mr6.F7 = new TraceConfigApiImpl();
                    }
                }
            }
            iTraceConfigApi = C58096Mr6.F7;
        }
        this.LIZ = iTraceConfigApi;
    }
}
