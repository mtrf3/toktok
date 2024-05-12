package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LTz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54331LTz {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;

    public C54331LTz(ITpcConsentService tpcConsentService, Activity activity) {
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        o.LJIIIZ(activity, "activity");
        this.LIZ = tpcConsentService;
        this.LIZIZ = tpcConsentService.LJ(null);
        new WeakReference(activity);
    }
}
