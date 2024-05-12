package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.jvm.internal.o;

/* renamed from: X.9gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243099gP extends TimerTask {
    public final C232639Bb LJLIL;
    public final List<String> LJLILLLLZI = new ArrayList();
    public volatile Boolean LJLJI;
    public volatile Boolean LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;

    public final void LIZLLL() {
        String LLD;
        boolean LJ = o.LJ(ORZ.LLFII(this.LJLILLLLZI), this.LJLJJL);
        synchronized (this.LJLILLLLZI) {
            LLD = ORZ.LLD(this.LJLILLLLZI, null, null, null, null, 63);
        }
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("id", this.LJLIL.LIZ), new OSZ(WM7.SCENE_SERVICE, this.LJLIL.LIZIZ), new OSZ("is_under_clear_mode", String.valueOf(this.LJLJJLL)), new OSZ("is_final_step_reached", String.valueOf(LJ)), new OSZ("is_visibility_check_passed", String.valueOf(this.LJLJI)), new OSZ("is_position_check_passed", String.valueOf(this.LJLJJI)), new OSZ("steps", LLD));
        FMX.LJIIL("feed_component_chain", LJJL);
        C221018lt.LJFF("ChainedAnalytics", String.valueOf(LJJL));
        C243109gQ.LIZIZ.remove(this.LJLIL);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C243099gP(C232639Bb c232639Bb) {
        this.LJLIL = c232639Bb;
        C243109gQ.LIZ.schedule(this, 5000L);
    }

    public final void LIZ(String str) {
        synchronized (this.LJLILLLLZI) {
            ((ArrayList) this.LJLILLLLZI).add(str);
        }
    }

    public final void LIZIZ(View view) {
        Rect LIZJ = C73098SmU.LIZJ(view);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        int LJJJJL = C63081OpJ.LJJJJL(context);
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        int LJJJJJL = C63081OpJ.LJJJJJL(context2);
        this.LJLJJI = Boolean.valueOf(LIZJ.intersects(0, -LJJJJJL, LJJJJL, LJJJJJL * 2));
    }

    public static void LIZJ(C243099gP c243099gP, View view) {
        int i = 0;
        while (view.getVisibility() == 0) {
            c243099gP.LJLJI = Boolean.TRUE;
            if (view.getParent() instanceof View) {
                Object parent = view.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.View");
                view = (View) parent;
                i++;
                if (i > 5) {
                    return;
                }
            } else {
                return;
            }
        }
        c243099gP.LJLJI = Boolean.FALSE;
    }
}
