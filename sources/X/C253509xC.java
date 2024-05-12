package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.DialogOption;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253509xC extends AbstractC253439x5 {
    @Override // X.AbstractC253439x5
    public final void LIZ(android.net.Uri uri) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(LJIIIIZZ);
        String queryParameter = UriProtector.getQueryParameter(uri, "title");
        if (queryParameter != null) {
            c26227ARb.LJFF(queryParameter);
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "description");
        if (queryParameter2 != null) {
            c26227ARb.LIZIZ(queryParameter2);
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "options");
        if (queryParameter3 != null) {
            try {
                DialogOption[] dialogOptionArr = (DialogOption[]) new Gson().LJI(queryParameter3, DialogOption[].class);
                if (dialogOptionArr == null) {
                    return;
                } else {
                    UC0.LIZJ(c26227ARb, new AqS50S0400000_4(dialogOptionArr, uri, this, LJIIIIZZ, 12));
                }
            } catch (Exception unused) {
                return;
            }
        }
        c26227ARb.LJI().LIZLLL();
    }

    public static void LIZIZ(DialogOption dialogOption, Activity activity) {
        String str = dialogOption.optionUrl;
        if (str != null) {
            SmartRouter.buildRoute(activity, str).open();
        }
        if (dialogOption.optionId != null) {
            String flattenToShortString = activity.getComponentName().flattenToShortString();
            o.LJIIIIZZ(flattenToShortString, "currentActivity.componen…me.flattenToShortString()");
            C2U8.LIZ(new C253549xG(flattenToShortString, dialogOption.optionId));
        }
    }
}
