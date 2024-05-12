package X;

import android.app.Application;
import com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45758Hxa implements IAVLoaderService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService
    public final void setLoaderOnly() {
        XFW xfw = XFV.LJFF;
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        xfw.LIZ(application).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService
    public final void setLoader(IAVLoaderService.ILoaderCallback<Boolean> callback) {
        o.LJIIIZ(callback, "callback");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new AqS157S0100000_7(callback, (IAVLoaderService.ILoaderCallback<Boolean>) 743);
        c43939HMh.LIZ = new AqS157S0100000_7(callback, (IAVLoaderService.ILoaderCallback<Boolean>) 744);
        c43939HMh.LIZ();
    }
}
