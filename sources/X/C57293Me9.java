package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Me9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57293Me9 {
    public static final /* synthetic */ int LIZ = 0;

    public static C38333F2r LIZIZ(Throwable th) {
        Throwable th2;
        C57300MeG c57300MeG;
        if (th == null) {
            return null;
        }
        if (th instanceof C38333F2r) {
            return (C38333F2r) th;
        }
        if (th.getCause() instanceof C38333F2r) {
            Throwable cause = th.getCause();
            o.LJII(cause, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            return (C38333F2r) cause;
        }
        if ((th instanceof C57300MeG) && (c57300MeG = (C57300MeG) th) != null) {
            th2 = c57300MeG.getE();
        } else {
            th2 = null;
        }
        if (!(th2 instanceof C38333F2r)) {
            return null;
        }
        Throwable e = ((C57300MeG) th).getE();
        o.LJII(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
        return (C38333F2r) e;
    }

    public static final void LIZ(Activity activity, Throwable th) {
        Integer valueOf;
        if (activity == null) {
            return;
        }
        C38333F2r LIZIZ = LIZIZ(th);
        if (LIZIZ != null && (valueOf = Integer.valueOf(LIZIZ.getErrorCode())) != null) {
            if (valueOf.intValue() == 5) {
                AnonymousClass114.LIZ(activity, R.string.gj6);
                return;
            }
            if (valueOf.intValue() == 2059) {
                AnonymousClass114.LIZ(activity, R.string.gj4);
                return;
            }
            if (valueOf.intValue() == 2065) {
                AnonymousClass114.LIZ(activity, R.string.gj7);
                return;
            }
            if (valueOf.intValue() == 2149) {
                AnonymousClass114.LIZ(activity, R.string.gj_);
                return;
            }
            if (valueOf.intValue() == 4) {
                AnonymousClass114.LIZ(activity, R.string.gj9);
                return;
            }
            if (valueOf.intValue() == 24) {
                C1FJ.LJI(LIZIZ, new C26045AKb(activity));
                return;
            }
            if (valueOf != null) {
                if (valueOf.intValue() == 3231) {
                    AnonymousClass114.LIZ(activity, R.string.gj8);
                    return;
                }
                if (valueOf.intValue() == 3058) {
                    AnonymousClass114.LIZ(activity, R.string.gj8);
                    return;
                } else if (valueOf.intValue() == 3059) {
                    AnonymousClass114.LIZ(activity, R.string.gj8);
                    return;
                } else if (valueOf.intValue() == 2067) {
                    C1FJ.LJI(LIZIZ, new C26045AKb(activity));
                    return;
                }
            }
        }
        AnonymousClass114.LIZ(activity, R.string.gjc);
    }
}
