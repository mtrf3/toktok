package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2O<T1, T2, R> implements RTU {
    public static final G2O<T1, T2, R> LJLIL = new G2O<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object activity) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        o.LJIIIZ(activity, "activity");
        return new G2M(tpcConsentService, new WeakReference(activity));
    }
}
