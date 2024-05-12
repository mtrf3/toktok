package X;

import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.5sN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148595sN extends AbstractC65781Prl implements InterfaceC65784Pro<CreativeToolsEntranceReversalConfig> {
    public static final C148595sN LJLIL = new C148595sN();

    public C148595sN() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final CreativeToolsEntranceReversalConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        CreativeToolsEntranceReversalConfig creativeToolsEntranceReversalConfig = C148585sM.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "studio_creative_tools_entrance_reversal", 31744, CreativeToolsEntranceReversalConfig.class, creativeToolsEntranceReversalConfig);
        if (LJIJ == 0) {
            C148585sM.LIZ.getClass();
        } else {
            creativeToolsEntranceReversalConfig = LJIJ;
        }
        o.LJIIIIZZ(creativeToolsEntranceReversalConfig, "ABManager.getInstance()\n…a)\n            ?: default");
        return creativeToolsEntranceReversalConfig;
    }
}
