package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

/* renamed from: X.ICn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46233ICn extends AbstractC65781Prl implements InterfaceC65784Pro<IAVEffectService> {
    public static final C46233ICn LJLIL = new C46233ICn();

    public C46233ICn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVEffectService invoke() {
        return AVExternalServiceImpl.LIZ().abilityService().effectService();
    }
}
