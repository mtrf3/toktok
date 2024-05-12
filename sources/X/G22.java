package X;

import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;

/* loaded from: classes7.dex */
public final class G22 extends AbstractC65781Prl implements InterfaceC65784Pro<IMandatoryLoginService> {
    public static final G22 LJLIL = new G22();

    public G22() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IMandatoryLoginService invoke() {
        return MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
    }
}
