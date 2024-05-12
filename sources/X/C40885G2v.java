package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.G2v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40885G2v {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;

    public C40885G2v(ITpcConsentService tpcConsentService, WeakReference<Activity> weakReference) {
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        this.LIZ = tpcConsentService;
        this.LIZIZ = tpcConsentService.LJ(null);
    }
}
