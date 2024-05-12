package X;

import Y.ARunnableS40S0100000_4;
import android.app.Dialog;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC55642Lsc("relaunch_popup")
/* renamed from: X.AOr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26165AOr extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final int LJLJJLL;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M74
    public final boolean canShow() {
        if (C36583EXj.LIZJ() != ((Boolean) this.LJLJJL.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C36922EeM.LJ("RelaunchPopTask");
        a.LJI().LJIILLIIL(new ARunnableS40S0100000_4(this, 166), ((Boolean) this.LJLJJL.getValue()).booleanValue());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        FMX.LJIIL("show_relaunch_app_popup", c188727au.LIZ);
        ImageView imageView = new ImageView(this.LJLIL);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LJLJJI);
        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJIIIIZZ.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        C78857UxB.LJJI(LIZ, imageView, new AqS170S0100000_4(this, 1728));
        LIZ.LJFF(this.LJLIL.getString(R.string.q00));
        LIZ.LIZIZ(this.LJLIL.getString(R.string.pzy));
        C77123UOp.LJIILL(LIZ, new AqS170S0100000_4(this, 1730));
        LIZ.LJII = false;
        return LIZ.LJI().LJ();
    }

    public C26165AOr(ActivityC45651qj activityC45651qj, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = 132;
        this.LJLJJI = "https://p16-amd-va.tiktokcdn.com/obj/tiktok-obj/family_friendly.png";
        this.LJLJJL = C221108m2.LIZIZ(C26166AOs.LJLIL);
        this.LJLJJLL = 110;
    }
}
