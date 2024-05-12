package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.2Q9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Q9 {
    public static final boolean LIZ(String eventType) {
        o.LJIIIZ(eventType, "eventType");
        if (TextUtils.equals(eventType, "homepage_hot")) {
            return true;
        }
        MainPageExperimentServiceImpl.LJ().LIZJ();
        if (TextUtils.equals(eventType, "homepage_follow")) {
            return true;
        }
        return e1.LIZ(31744, "show_global_multi_func", true, false);
    }
}
