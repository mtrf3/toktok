package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.io.File;

/* renamed from: X.1I0, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1I0 implements RTU {
    public static float LIZ(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static C41859Gbn LIZIZ() {
        return C60903NvH.LJIIJJI().getPublishService().LJJ();
    }

    public static void LIZJ(String str) {
        new File(str).mkdirs();
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return new C32011ChL((ITpcConsentService) obj, (Activity) obj2);
    }
}
