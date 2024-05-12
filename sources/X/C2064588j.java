package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.88j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2064588j {
    public final ViewStub LIZ;
    public final int LIZIZ;
    public final Activity LIZJ;
    public AnimatorSet LIZLLL;

    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("current_page", "personal_homepage");
        c188727au.LJIIIZ("button_type", str);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        FMX.LJIIL("photo_intro_click", c188727au.LIZ);
    }

    public static void LIZIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("current_page", "personal_homepage");
        c188727au.LJIIIZ("button_type", str);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        FMX.LJIIL("photo_intro_show", c188727au.LIZ);
    }

    public C2064588j(ViewStub viewStub, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = viewStub;
        this.LIZIZ = R.id.i9k;
        this.LIZJ = activity;
    }
}
