package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AWJ<T1, T2, R> implements RTU {
    public static final AWJ<T1, T2, R> LJLIL = new AWJ<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object activity) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        o.LJIIIZ(activity, "activity");
        return new AWH(tpcConsentService, new WeakReference(activity));
    }
}
