package X;

import Y.AObjectS47S0101000_2;
import Y.AObjectS48S0101000_3;
import Y.AObjectS51S0201000_7;
import Y.AObjectS52S0101000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVQ implements InterfaceC41418GNi {
    @Override // X.InterfaceC41418GNi
    public final void openDraftActivity(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        C60903NvH.LJIIJJI().LJIILL().LJ().refreshData();
        if (bundle == null) {
            DraftBoxActivity.LLIIIILZ(context, new AObjectS47S0101000_2(2, context, 5), new AObjectS48S0101000_3(2, context, 1));
        } else {
            DraftBoxActivity.LLIIIILZ(context, new AObjectS51S0201000_7(1, context, bundle, 0), new AObjectS52S0101000_7(3, context, 1));
        }
    }

    @Override // X.InterfaceC41418GNi
    public final void LIZ(Activity activity, Intent intent, boolean z, boolean z2) {
        HZV.LIZ().LIZ(activity, intent, z, z2);
    }
}
