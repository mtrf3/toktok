package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AWN<T> implements InterfaceC64592gB {
    public static final AWN<T> LJLIL = new AWN<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        tpcConsentService.LJFF();
    }
}
