package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2M {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;

    public G2M(ITpcConsentService tpcConsentService, WeakReference<Activity> weakReference) {
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        this.LIZ = tpcConsentService;
        this.LIZIZ = tpcConsentService.LJ(null);
    }
}
