package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LuS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55756LuS {
    public final BaseListFragmentPanel LIZ;
    public final C238479Xn LIZIZ;
    public final String LIZJ;
    public final User LIZLLL;
    public boolean LJ;
    public InterfaceC55759LuV LJFF;
    public XKQ LJI;
    public Aweme LJII;

    public final void LIZ() {
        if (this.LJ) {
            C221018lt.LJFF("@LinkRelation_Video", "invoke dialog operator, isShowing!");
            return;
        }
        Aweme aweme = this.LJII;
        if (aweme != null && aweme.getSharer() != null) {
            this.LJFF = LIZJ(aweme);
            return;
        }
        XKQ xkq = this.LJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJI = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C78613UtF.LIZJ, null, new C55754LuQ(this, null), 2);
        C221018lt.LJFF("@LinkRelation_Video", "asyncShowDialog!");
    }

    public final void LIZIZ() {
        XKQ xkq = this.LJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC55759LuV interfaceC55759LuV = this.LJFF;
        if (interfaceC55759LuV != null) {
            interfaceC55759LuV.LIZ(C55761LuX.LIZ);
        }
    }

    public final InterfaceC55759LuV LIZJ(Aweme aweme) {
        C221018lt.LJFF("@LinkRelation_Video", "show dialog with aweme");
        InterfaceC55759LuV LJFF = C57135Mbb.LIZIZ.LJFF();
        LJFF.LIZJ(new C55757LuT(this));
        ActivityC45651qj requireActivity = this.LIZ.getFragment().requireActivity();
        o.LJIIIIZZ(requireActivity, "panel.fragment.requireActivity()");
        C238479Xn c238479Xn = this.LIZIZ;
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZLLL("enter_from", this.LIZ.getEventType());
        Bundle bundle = (Bundle) c40883G2t.LIZ;
        o.LJIIIIZZ(bundle, "newBuilder()\n           …               .builder()");
        LJFF.LIZLLL(requireActivity, c238479Xn, aweme, bundle);
        return LJFF;
    }

    public C55756LuS(BaseListFragmentPanel panel, C238479Xn c238479Xn, String awemeId, User user) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(awemeId, "awemeId");
        this.LIZ = panel;
        this.LIZIZ = c238479Xn;
        this.LIZJ = awemeId;
        this.LIZLLL = user;
        new WeakReference(panel.getContext());
    }
}
