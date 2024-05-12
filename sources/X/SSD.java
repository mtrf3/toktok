package X;

import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SSD extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final SSD LJLIL = new SSD();

    public SSD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        IAIGCAvatarService LJIILL = AIGCAvatarServiceImpl.LJIILL();
        o.LJIIIIZZ(LJIILL, "get().getService(IAIGCAvatarService::class.java)");
        LJIILL.LJIIL(EnumC244439iZ.SOCIAL, null);
        return C76800UCe.LIZ;
    }
}
