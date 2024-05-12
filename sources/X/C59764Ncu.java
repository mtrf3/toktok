package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;

/* renamed from: X.Ncu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59764Ncu {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;
    public final WeakReference<Activity> LIZJ;

    public C59764Ncu(ITpcConsentService iTpcConsentService, Activity activity) {
        this.LIZ = iTpcConsentService;
        this.LIZIZ = iTpcConsentService.LJ(null);
        this.LIZJ = new WeakReference<>(activity);
    }
}
