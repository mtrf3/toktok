package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.ss.android.ugc.aweme.compliance.business.agecontrol.PNSAgeControlService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LE6<T> implements InterfaceC73592SuS {
    public final /* synthetic */ PNSAgeControlService LJLIL;

    public LE6(PNSAgeControlService pNSAgeControlService) {
        this.LJLIL = pNSAgeControlService;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        LE7 le7;
        ComponentCallbacks2 it = (Activity) obj;
        o.LJIIIZ(it, "it");
        PNSAgeControlService pNSAgeControlService = this.LJLIL;
        pNSAgeControlService.getClass();
        if ((it instanceof LE7) && (le7 = (LE7) it) != null) {
            le7.Y7();
            boolean LIZ = pNSAgeControlService.LIZ("age_control_feature_content_preference");
            ((LE7) it).Tg("age_control_feature_content_preference");
            return LIZ;
        }
        return true;
    }
}
