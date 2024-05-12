package X;

import Y.IDObserverS225S0100000;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.16s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C276616s {
    public final Fragment LIZ;
    public final C12C LIZIZ;
    public final Context LIZJ;
    public DialogC30679C2h LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;
    public final C39331gX LJI;

    public final void LIZ() {
        DialogC30679C2h dialogC30679C2h;
        DialogC30679C2h dialogC30679C2h2 = this.LIZLLL;
        if (dialogC30679C2h2 != null && dialogC30679C2h2.isShowing() && (dialogC30679C2h = this.LIZLLL) != null) {
            dialogC30679C2h.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1gX] */
    public C276616s(Fragment fragment, C12C gameUi) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(gameUi, "gameUi");
        this.LIZ = fragment;
        this.LIZIZ = gameUi;
        Context requireContext = fragment.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        this.LIZJ = requireContext;
        this.LJFF = C221108m2.LIZIZ(AnonymousClass297.LJLIL);
        this.LJI = new CG0() { // from class: X.1gX
            @Override // X.CG0
            public final void LIZ() {
                C276616s c276616s = C276616s.this;
                c276616s.LJ = false;
                C12B.LIZ(c276616s.LIZIZ, false, EnumC264412a.LIVE_TIP_MESSAGE_HEADPHONE.ordinal(), "", 8);
                C276616s.this.LIZ();
                C276616s.this.LIZIZ.LIZIZ().ee0(6);
            }

            @Override // X.CG0
            public final void LIZIZ() {
                if (!((Boolean) C276616s.this.LJFF.getValue()).booleanValue()) {
                    return;
                }
                C276616s c276616s = C276616s.this;
                if (!c276616s.LJ) {
                    DialogC30679C2h dialogC30679C2h = c276616s.LIZLLL;
                    if (dialogC30679C2h != null && dialogC30679C2h.isShowing()) {
                        return;
                    }
                    c276616s.LIZIZ.LIZIZ().addToShow(6, c276616s.LIZ, new IDObserverS225S0100000(c276616s, 17));
                    String string = c276616s.LIZJ.getString(R.string.o0c);
                    o.LJIIIIZZ(string, "context.getString(R.stri…ve_panel_audiolowcontent)");
                    C12B.LIZ(c276616s.LIZIZ, true, EnumC264412a.LIVE_TIP_MESSAGE_HEADPHONE.ordinal(), string, 8);
                    c276616s.LJ = true;
                }
            }
        };
    }
}
