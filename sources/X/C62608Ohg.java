package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ohg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62608Ohg {
    public static void LIZ(Activity activity, C45382HrW currentDownloadVideoStatus) {
        o.LJIIIZ(currentDownloadVideoStatus, "currentDownloadVideoStatus");
        C45382HrW.LIZ.getClass();
        if (C45382HrW.LJ) {
            int i = C45382HrW.LJFF;
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJ(R.style.ul);
            c26045AKb.LJIIIZ(C39849FkT.LIZ().getResources().getQuantityText(R.plurals.v1, i));
            c26045AKb.LJIIJ();
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(activity);
        c26045AKb2.LJ(R.style.ul);
        c26045AKb2.LJIIIIZZ(R.string.tn_);
        c26045AKb2.LJIIJ();
    }
}
