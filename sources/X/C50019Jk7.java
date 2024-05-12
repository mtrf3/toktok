package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Jk7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50019Jk7 extends AbstractC65781Prl implements InterfaceC65784Pro<OptimizeConfig> {
    public static final C50019Jk7 LJLIL = new C50019Jk7();

    public C50019Jk7() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final OptimizeConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        OptimizeConfig optimizeConfig = C50018Jk6.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_vertical_request_size", 31744, OptimizeConfig.class, optimizeConfig);
        if (LJIJ != 0) {
            optimizeConfig = LJIJ;
        }
        o.LJIIIIZZ(optimizeConfig, "ABManager.getInstance().…ig::class.java) ?: CONFIG");
        return optimizeConfig;
    }
}
