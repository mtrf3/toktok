package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.G2e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40868G2e<T1, T2, R> implements RTU {
    public static final C40868G2e<T1, T2, R> LJLIL = new C40868G2e<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object activity) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        o.LJIIIZ(activity, "activity");
        return new G2M(tpcConsentService, new WeakReference(activity));
    }
}
