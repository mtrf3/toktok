package X;

import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FIL extends AbstractC65781Prl implements InterfaceC65784Pro<PreloadWidgetsData> {
    public static final FIL LJLIL = new FIL();

    public FIL() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PreloadWidgetsData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PreloadWidgetsData preloadWidgetsData = FIK.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "live_preload_widgets_setting", 31744, PreloadWidgetsData.class, preloadWidgetsData);
        if (LJIJ == 0) {
            FIK.LIZ.getClass();
        } else {
            preloadWidgetsData = LJIJ;
        }
        o.LJIIIIZZ(preloadWidgetsData, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return preloadWidgetsData;
    }
}
