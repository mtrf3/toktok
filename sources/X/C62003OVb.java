package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.OVb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62003OVb implements HPG {
    @Override // X.HPG
    public final boolean LJFF() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    @Override // X.HPG
    public final int LIZ(Context context) {
        o.LJIIIZ(context, "context");
        return C61184Nzo.LIZ.LIZ(context);
    }

    @Override // X.HPG
    public final int LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return C61184Nzo.LIZ(context);
    }

    @Override // X.HPG
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        C40211FqJ.LIZIZ(context);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.HPG
    public final int LIZLLL(Context context, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(str, OHQ.LIZ);
        return C04330Ez.LIZ(context, str);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.HPG
    public final boolean LJI(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(str, OHQ.LIZ);
        return C1AR.LJI(activity, str);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.HVQ
    public final void LIZJ(ActivityC45651qj activityC45651qj, HVP hvp, String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        C61115Nyh.LIZJ(activityC45651qj, strArr, new C62004OVc(hvp));
    }
}
