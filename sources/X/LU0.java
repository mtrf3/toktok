package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LU0<T1, T2, R> implements RTU {
    public static final LU0<T1, T2, R> LJLIL = new LU0<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        Activity activity = (Activity) obj2;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        o.LJIIIZ(activity, "activity");
        return new C54331LTz(tpcConsentService, activity);
    }
}
