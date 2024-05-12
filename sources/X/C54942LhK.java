package X;

import com.ss.android.ugc.tiktok.location.popup.config.FypPoiPermissionFrequencyConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.LhK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54942LhK extends AbstractC65781Prl implements InterfaceC65784Pro<FypPoiPermissionFrequencyConfig> {
    public static final C54942LhK LJLIL = new C54942LhK();

    public C54942LhK() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final FypPoiPermissionFrequencyConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        FypPoiPermissionFrequencyConfig fypPoiPermissionFrequencyConfig = C54943LhL.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(false, "gps_frequency_control", 31744, FypPoiPermissionFrequencyConfig.class, fypPoiPermissionFrequencyConfig);
        if (LJIJ == 0) {
            C54943LhL.LIZ.getClass();
        } else {
            fypPoiPermissionFrequencyConfig = LJIJ;
        }
        o.LJIIIIZZ(fypPoiPermissionFrequencyConfig, "ABManager.getInstance()\n…\n            ) ?: DEFAULT");
        return fypPoiPermissionFrequencyConfig;
    }
}
