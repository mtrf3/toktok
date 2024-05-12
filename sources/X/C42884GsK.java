package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.GsK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42884GsK {
    public static void LIZ(Fragment fragment, Bundle bundle) {
        o.LJIIIZ(fragment, "fragment");
        Context context = fragment.getContext();
        if (context != null) {
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("webview_progress_bar", true);
            Intent intent = new Intent(context, (Class<?>) DonationWebPageDialogActivity.class);
            intent.putExtras(bundle);
            C16880lQ.LJII(fragment, intent, 9001);
        }
    }
}
