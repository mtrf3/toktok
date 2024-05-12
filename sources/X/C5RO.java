package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5RO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RO {
    public static final void LIZ(Activity activity) {
        if (activity == null) {
            return;
        }
        String string = activity.getString(R.string.sad, C1533360b.LIZ());
        o.LJIIIIZZ(string, "activity.getString(\n    …iconNameString,\n        )");
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LIZIZ(string);
        UC0.LIZJ(c26227ARb, C5RP.LJLIL);
        c26227ARb.LJI().LIZLLL();
    }

    public static final void LIZIZ(Activity activity) {
        if (!C135125Sa.LIZ().getBoolean("remind_switch_language_enter_editor_pro", false) && activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.sai);
            creativeToastBuilder.acrossActivities(true);
            C78915Uy7.LJJIIZI(activity, 1052, creativeToastBuilder);
            C135125Sa.LIZ().storeBoolean("remind_switch_language_enter_editor_pro", true);
        }
    }
}
