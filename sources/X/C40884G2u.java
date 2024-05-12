package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.G2u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40884G2u<T1, T2, R> implements RTU {
    public static final C40884G2u<T1, T2, R> LJLIL = new C40884G2u<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object activity) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        o.LJIIIZ(activity, "activity");
        return new C40885G2v(tpcConsentService, new WeakReference(activity));
    }
}
