package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastService;
import kotlin.jvm.internal.o;

/* renamed from: X.AKi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26052AKi implements CreativeToastService {
    public static final C26052AKi LIZ = new C26052AKi();

    public static void LIZ(int i, CreativeToastBuilder creativeToastBuilder, C26051AKh c26051AKh) {
        c26051AKh.LIZJ = new C26053AKj(i, creativeToastBuilder, c26051AKh);
        C26054AKk c26054AKk = new C26054AKk(i, creativeToastBuilder, c26051AKh);
        C26045AKb c26045AKb = c26051AKh.LIZ;
        if (c26045AKb != null) {
            c26045AKb.LIZJ(c26054AKk);
        }
        C26048AKe c26048AKe = c26051AKh.LIZIZ;
        if (c26048AKe != null) {
            c26048AKe.LIZ(c26054AKk);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(Activity activity, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(builder, "builder");
        C26051AKh c26051AKh = new C26051AKh(activity, builder);
        LIZ(i, builder, c26051AKh);
        return c26051AKh;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(Dialog dialog, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(builder, "builder");
        C26051AKh c26051AKh = new C26051AKh(dialog, builder);
        LIZ(i, builder, c26051AKh);
        return c26051AKh;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(View parent, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(builder, "builder");
        C26051AKh c26051AKh = new C26051AKh(parent, builder);
        LIZ(i, builder, c26051AKh);
        return c26051AKh;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(PopupWindow popupWindow, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(popupWindow, "popupWindow");
        o.LJIIIZ(builder, "builder");
        C26051AKh c26051AKh = new C26051AKh(popupWindow, builder);
        LIZ(i, builder, c26051AKh);
        return c26051AKh;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(Fragment fragment, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(builder, "builder");
        C26051AKh c26051AKh = new C26051AKh(fragment, builder);
        LIZ(i, builder, c26051AKh);
        return c26051AKh;
    }
}
