package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AT9 {
    public final View LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public final void LIZIZ() {
        ActivityC45651qj activityC45651qj;
        Context context = this.LIZIZ;
        if ((context instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) context) != null) {
            LIZ("show");
            DialogFragment dialogFragment = (DialogFragment) this.LJ.getValue();
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            dialogFragment.show(supportFragmentManager, "long_press_sheet");
            FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
            if (LJIIZILJ != null) {
                LJIIZILJ.LJIILLIIL(true);
            }
        }
    }

    public final void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("enter_from", this.LIZJ);
        FMX.LJIIL("big_card_long_press", c188727au.LIZ);
    }

    public AT9(View parent, Context context, String enterFrom, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = parent;
        this.LIZIZ = context;
        this.LIZJ = enterFrom;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1223));
        this.LJFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1222));
    }
}
