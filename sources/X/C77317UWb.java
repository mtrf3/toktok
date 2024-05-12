package X;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.UWb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77317UWb implements LAO {
    public final Activity LIZ;
    public final View LIZIZ;
    public C119994nL LIZJ;
    public C77316UWa LIZLLL;

    public final void LIZ() {
        try {
            C119994nL c119994nL = this.LIZJ;
            if (c119994nL != null) {
                c119994nL.LJLILLLLZI.setVisibility(8);
            }
            C77316UWa unit = this.LIZLLL;
            o.LJIIIZ(unit, "unit");
            if (C1DH.LJIL()) {
                C81525Vz7 LIZ = C77439UaJ.LIZ();
                synchronized (LIZ) {
                    ((ArrayList) LIZ.LJI).remove(unit);
                }
            }
            this.LIZLLL = null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C77317UWb(Activity activity, View view) {
        C77316UWa c77316UWa = new C77316UWa(this);
        this.LIZLLL = c77316UWa;
        this.LIZ = activity;
        this.LIZIZ = view;
        if (!C1DH.LJIL()) {
            return;
        }
        C81525Vz7 LIZ = C77439UaJ.LIZ();
        synchronized (LIZ) {
            if (!C1DH.LJIL()) {
                return;
            }
            if (LIZ.LJFF.LIZIZ.get()) {
                c77316UWa.invoke(Boolean.TRUE);
            }
            ((ArrayList) LIZ.LJI).add(c77316UWa);
        }
    }
}
