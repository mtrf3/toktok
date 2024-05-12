package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4cF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113114cF extends AbstractC65781Prl implements InterfaceC88471Ynr<Context, String, Boolean> {
    public static final C113114cF LJLIL = new C113114cF();

    public C113114cF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Context context, String str) {
        final Context context2 = context;
        final String route = str;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(route, "route");
        C26408AYa.LJI("inc_activity_deep_link_start", route, new LinkedHashMap());
        SmartRoute buildRoute = SmartRouter.buildRoute(context2, route);
        buildRoute.withCallback(new OpenResultCallback() { // from class: X.4cG
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C113134cH.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C113134cH.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str2) {
                Activity LJIJJ = C45804HyK.LJIJJ(context2);
                if (LJIJJ != null) {
                    AnonymousClass114.LIZ(LJIJJ, R.string.ev5);
                }
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                ActivityC45651qj activityC45651qj;
                FragmentManager supportFragmentManager;
                Fragment LJJJIL;
                DialogFragment dialogFragment;
                if (s.LJJJLZIJ(route, "//now/feed", false)) {
                    Activity LJIJJ = C45804HyK.LJIJJ(context2);
                    if ((LJIJJ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIJJ) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("quick_chat_sheet")) != null && (LJJJIL instanceof TuxSheet) && (dialogFragment = (DialogFragment) LJJJIL) != null) {
                        dialogFragment.dismiss();
                    }
                }
                C26408AYa.LJI("inc_activity_deep_link_end", route, new LinkedHashMap());
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                Activity LJIJJ = C45804HyK.LJIJJ(context2);
                if (LJIJJ != null) {
                    AnonymousClass114.LIZ(LJIJJ, R.string.ev5);
                }
            }
        });
        buildRoute.open();
        return Boolean.TRUE;
    }
}
