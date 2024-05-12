package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;

/* renamed from: X.J9b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48691J9b {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;

    public C48691J9b(ITpcConsentService iTpcConsentService, Activity activity) {
        this.LIZ = iTpcConsentService;
        this.LIZIZ = iTpcConsentService.LJ(null);
        new WeakReference(activity);
    }
}
