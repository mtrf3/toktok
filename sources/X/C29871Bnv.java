package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Bnv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29871Bnv extends AbstractC29877Bo1 {
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ C29876Bo0 LJLJI;

    @Override // X.InterfaceC29920Boi
    public final void call() {
        ActivityC45651qj activityC45651qj;
        float f;
        float f2;
        C29876Bo0 c29876Bo0 = this.LJLJI;
        C29867Bnr c29867Bnr = c29876Bo0.LIZIZ;
        List list = this.LJLILLLLZI;
        long j = c29876Bo0.LIZ;
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
        J9A.LIZJ(C28787BRn.LIZ("livesdk_share_button_show"), c29867Bnr.LJLLI, "chat_merge", "share_platform");
        if (c29867Bnr.LJLJJI) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_share_button_show"), c29867Bnr.LJLLI, "chat_merge", "share_platform");
        }
        IDdS56S0100000_5 iDdS56S0100000_5 = new IDdS56S0100000_5(c29867Bnr, 9);
        C15640jQ.LJIIIZ(c29867Bnr.LJLLLL, ((UrlModel) ListProtector.get(list, 0)).L(), -1, -1, -1, iDdS56S0100000_5);
        c29867Bnr.LJLLLL.setIcon((Drawable) null);
        long j2 = -1;
        if (j != -1) {
            j2 = (j * 1000) / 600;
        }
        c29867Bnr.LJLJJLL = new AnimatorSet();
        LiveIconView liveIconView = c29867Bnr.LJLLLL;
        Property property = View.SCALE_X;
        float[] fArr = new float[2];
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
        if (c29867Bnr.LJZI) {
            f2 = 1.05f;
        } else {
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
        c29867Bnr.LJLJL.addListener(new C29872Bnw(c29867Bnr, list, iDdS56S0100000_5));
        c29867Bnr.LJLJJLL.start();
    }

    public C29871Bnv(C29876Bo0 c29876Bo0, List list) {
        this.LJLJI = c29876Bo0;
        this.LJLILLLLZI = list;
    }
}
