package X;

import android.app.Activity;
import android.graphics.Rect;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133315Lb {
    public final Activity LIZ;
    public final InterfaceC143655kP LIZIZ;
    public final InterfaceC153045zY LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final MutableLiveData<C5MM> LJFF;
    public OSZ<Long, Long> LJI;
    public final C62822Ol8 LJII;
    public final float LJIIIIZZ;

    public final int LIZ() {
        return ((C81184Vtc.LIZIZ(this.LIZ) - ((int) KL2.LIZJ(this.LIZ, this.LJIIIIZZ + 44.0f))) - C81184Vtc.LJFF(this.LIZ)) - C81184Vtc.LIZJ(this.LIZ);
    }

    public final void LIZIZ(Rect rect) {
        if (rect != null) {
            int i = rect.left;
            if (i > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) {
                this.LIZJ.LIZ(i, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public C133315Lb(ActivityC45651qj activity, InterfaceC142545ic editPreviewApi, InterfaceC153045zY interfaceC153045zY, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LIZ = activity;
        this.LIZIZ = editPreviewApi;
        this.LIZJ = interfaceC153045zY;
        this.LIZLLL = aqS152S0100000_2;
        this.LJ = aqS152S0100000_22;
        this.LJFF = editPreviewApi.DM();
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 221));
        this.LJIIIIZZ = KL2.LJIILL(activity, C81184Vtc.LIZLLL(C60903NvH.LJ) * 0.35f) + 72.0f;
    }
}
