package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F7D implements F7K {
    public static final boolean LIZLLL() {
        return C19N.LJ("ul_need_register_sim_change", false);
    }

    @Override // X.F7K
    public final String LIZ() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).mockMccMnc();
    }

    @Override // X.F7K
    public final boolean LIZIZ() {
        if (C48189Ivh.LJI(EF7.LIZIZ()) && !((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).isForceData()) {
            return true;
        }
        return false;
    }

    @Override // X.F7K
    public final String LIZJ() {
        String lowerCase = C85990Xow.LIZ().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @Override // X.F7K
    public final boolean needForceAssociateMsisdn() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).needForceAssociateMsisdn();
    }
}
