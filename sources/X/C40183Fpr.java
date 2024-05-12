package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;

/* renamed from: X.Fpr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40183Fpr extends AbstractC40333FsH {
    @Override // X.AbstractC40333FsH
    public final void LIZ(Context context) {
    }

    @Override // X.AbstractC40333FsH
    public final void LIZIZ(Context context) {
        String LIZ = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZJ.getValue()).liveLinkList.LIZ();
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            LIZ = C40180Fpo.LIZ(bundle, LIZ);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, LIZ);
        buildRoute.withParam(this.LIZ);
        buildRoute.open();
    }
}
