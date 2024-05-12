package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Byr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30549Byr extends C73119Smp {
    public final /* synthetic */ C30546Byo LIZ;
    public final /* synthetic */ BIK LIZIZ;

    @Override // X.UDL
    public final void LJFF() {
        this.LIZ.LIZJ(this.LIZIZ.LIZIZ, "deny");
    }

    @Override // X.UDL
    public final void LJI() {
        this.LIZ.LIZJ(this.LIZIZ.LIZIZ, "allow");
    }

    @Override // X.UDL
    public final String LIZIZ(Activity activity) {
        return C15380j0.LJIILJJIL(R.string.kee);
    }

    @Override // X.UDL
    public final String LJ(Activity activity) {
        return C15380j0.LJIILJJIL(R.string.kef);
    }

    public C30549Byr(C30546Byo c30546Byo, BIK bik) {
        this.LIZ = c30546Byo;
        this.LIZIZ = bik;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.UDL
    public final String LIZJ(Activity activity, String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.keg);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_bl…authorization_popup_desc)");
        return LJIILJJIL;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.UDL
    public final String LIZLLL(Activity activity, String... strArr) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        return C15380j0.LJIILJJIL(R.string.keh);
    }
}
