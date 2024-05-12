package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FOL {
    public static void LIZ(Activity activity, boolean z, boolean z2) {
        o.LJIIIZ(activity, "activity");
        C56662Kg.LIZ().LIZLLL = false;
        C56662Kg.LIZ().LJIIIZ = false;
        Intent intent = new Intent(activity, (Class<?>) NewUserJourneyActivity.class);
        intent.putExtra("from_main", z);
        if (!z) {
            intent.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
            if (!z2 || activity.getIntent() != null) {
                activity.finish();
            }
        }
        activity.overridePendingTransition(0, 0);
        C16880lQ.LJFF(activity, 18, intent);
    }
}
