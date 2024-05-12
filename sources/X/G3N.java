package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;

/* loaded from: classes7.dex */
public final class G3N extends AbstractC65781Prl implements InterfaceC65784Pro<ITpcConsentService> {
    public static final G3N LJLIL = new G3N();

    public G3N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ITpcConsentService invoke() {
        return TpcConsentServiceImpl.LJIIZILJ();
    }
}
