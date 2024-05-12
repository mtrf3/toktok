package X;

import Y.ALAdapterS4S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Bnu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29870Bnu extends AbstractC29877Bo1 {
    public final /* synthetic */ Drawable LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C29867Bnr LJLJJI;

    @Override // X.InterfaceC29920Boi
    public final void call() {
        ActivityC45651qj activityC45651qj;
        float f;
        C29867Bnr c29867Bnr = this.LJLJJI;
        Drawable drawable = this.LJLILLLLZI;
        long j = this.LJLJI;
        c29867Bnr.getClass();
        C29919Boh LIZ = C29917Bof.LIZ();
        LIZ.LIZIZ = false;
        LIZ.LIZLLL = null;
        LIZ.LIZIZ();
        if (c29867Bnr.LJLLLL == null || (activityC45651qj = c29867Bnr.LJLJLLL) == null || activityC45651qj.isFinishing() || C38354F3m.LIZJ(c29867Bnr.LJLJI, "copy")) {
            return;
        }
        Room room = c29867Bnr.LJLJJL;
        if ((room != null && room.getOwner() != null && c29867Bnr.LJLJJL.getOwner().getSecret() == 1) || c29867Bnr.LJLILLLLZI) {
            return;
        }
        c29867Bnr.LJLILLLLZI = true;
        if (!C38354F3m.LJ(c29867Bnr.LJLJI)) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_share_button_show");
            LIZ2.LJIILLIIL(c29867Bnr.LJLLI);
            LIZ2.LJIJJ(c29867Bnr.LJLJI, "share_platform");
            LIZ2.LJJIIJZLJL();
            if (c29867Bnr.LJLJJI) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_share_button_show");
                LIZ3.LJIILLIIL(c29867Bnr.LJLLI);
                LIZ3.LJIJJ(c29867Bnr.LJLJI, "share_platform");
                LIZ3.LJJIIJZLJL();
            }
        }
        c29867Bnr.LJLLLL.setIcon(drawable);
        long j2 = -1;
        if (j != -1) {
            j2 = (j * 1000) / 600;
        }
        c29867Bnr.LJLJJLL = new AnimatorSet();
        LiveIconView liveIconView = c29867Bnr.LJLLLL;
        Property property = View.SCALE_X;
        float[] fArr = new float[2];
        float f2 = 1.05f;
        if (c29867Bnr.LJZI) {
            f = 1.05f;
        } else {
            f = 1.5f;
        }
        fArr[0] = f;
        fArr[1] = 0.9f;
        c29867Bnr.LJLJL = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) property, fArr).setDuration(600L);
        LiveIconView liveIconView2 = c29867Bnr.LJLLLL;
        Property property2 = View.SCALE_Y;
        float[] fArr2 = new float[2];
        if (!c29867Bnr.LJZI) {
            f2 = 1.5f;
        }
        fArr2[0] = f2;
        fArr2[1] = 0.9f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(liveIconView2, (Property<LiveIconView, Float>) property2, fArr2).setDuration(600L);
        c29867Bnr.LJLJL.setRepeatMode(2);
        duration.setRepeatMode(2);
        if (c29867Bnr.LJLJJI) {
            int i = (int) j2;
            c29867Bnr.LJLJL.setRepeatCount(i);
            duration.setRepeatCount(i);
        } else {
            c29867Bnr.LJLJL.setRepeatCount(-1);
            duration.setRepeatCount(-1);
        }
        c29867Bnr.LJLJJLL.playTogether(c29867Bnr.LJLJL, duration);
        c29867Bnr.LJLJL.addListener(new ALAdapterS4S0100000_5(c29867Bnr, 45));
        c29867Bnr.LJLJJLL.start();
    }

    public C29870Bnu(C29867Bnr c29867Bnr, Drawable drawable, int i) {
        this.LJLJJI = c29867Bnr;
        this.LJLILLLLZI = drawable;
        this.LJLJI = i;
    }
}
