package X;

import com.ss.android.ugc.aweme.ecommercelive.business.audience.config.EcWidgetLoadPriorityConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.RwH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71157RwH extends AbstractC65781Prl implements InterfaceC65784Pro<EcWidgetLoadPriorityConfig> {
    public static final C71157RwH LJLIL = new C71157RwH();

    public C71157RwH() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final EcWidgetLoadPriorityConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EcWidgetLoadPriorityConfig ecWidgetLoadPriorityConfig = C71156RwG.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ec_widget_load_priority_config", 31744, EcWidgetLoadPriorityConfig.class, ecWidgetLoadPriorityConfig);
        if (LJIJ == 0) {
            C71156RwG.LIZ.getClass();
        } else {
            ecWidgetLoadPriorityConfig = LJIJ;
        }
        o.LJIIIIZZ(ecWidgetLoadPriorityConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return ecWidgetLoadPriorityConfig;
    }
}
