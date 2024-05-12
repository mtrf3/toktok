package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JSN implements JSL {
    public final InterfaceC65784Pro<JSL> LIZ;
    public JSL LIZIZ;

    @Override // X.JSL
    public final void LIZ(RecyclerView listView, InterfaceC49154JQw interfaceC49154JQw, int i, boolean z) {
        o.LJIIIZ(listView, "listView");
    }

    @Override // X.JSL
    public final void LIZJ() {
    }

    @Override // X.JSL
    public final void LJFF() {
    }

    public final JSL LJII() {
        if (this.LIZIZ == null) {
            this.LIZIZ = this.LIZ.invoke();
        }
        return this.LIZIZ;
    }

    @Override // X.JSL
    public final void LJ() {
        JSL LJII = LJII();
        if (LJII != null) {
            LJII.LJ();
        }
    }

    @Override // X.JSL
    public final void LJI() {
        JSL LJII = LJII();
        if (LJII != null) {
            LJII.LJI();
        }
    }

    @Override // X.JSL
    public final Boolean isActive() {
        JSL LJII = LJII();
        if (LJII != null) {
            return LJII.isActive();
        }
        return null;
    }

    public JSN(AqS158S0100000_8 aqS158S0100000_8) {
        this.LIZ = aqS158S0100000_8;
    }

    @Override // X.JSL
    public final void LIZLLL(JU3 ju3) {
        JSL invoke = this.LIZ.invoke();
        if (invoke == null) {
            return;
        }
        invoke.LIZLLL(ju3);
    }

    @Override // X.JSL
    public final void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        JSL LJII = LJII();
        if (LJII != null) {
            LJII.LIZIZ(i, interfaceC49186JSc);
        }
    }

    @Override // X.JSL
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        o.LJIIIZ(aweme, "aweme");
        JSL LJII = LJII();
        if (LJII != null) {
            LJII.LJIJJLI(aweme, c49196JSm);
        }
    }
}
