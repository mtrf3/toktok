package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.OSPDesignConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Axq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27938Axq extends AbstractC65781Prl implements InterfaceC65784Pro<OSPDesignConfig> {
    public static final C27938Axq LJLIL = new C27938Axq();

    public C27938Axq() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final OSPDesignConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        OSPDesignConfig oSPDesignConfig = C27937Axp.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ec_cashier_style_config", 31744, OSPDesignConfig.class, oSPDesignConfig);
        if (LJIJ == 0) {
            C27937Axp.LIZ.getClass();
        } else {
            oSPDesignConfig = LJIJ;
        }
        o.LJIIIIZZ(oSPDesignConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return oSPDesignConfig;
    }
}
