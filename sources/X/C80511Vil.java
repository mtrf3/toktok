package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.MaterialTimePicker;

/* renamed from: X.Vil, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80511Vil extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C80509Vij LJLIL;

    public C80511Vil(C80509Vij c80509Vij) {
        this.LJLIL = c80509Vij;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        InterfaceC80526Vj0 interfaceC80526Vj0 = this.LJLIL.LJLJLJ;
        if (interfaceC80526Vj0 != null) {
            C80521Viv c80521Viv = (C80521Viv) interfaceC80526Vj0;
            MaterialTimePicker materialTimePicker = c80521Viv.LIZ;
            boolean z2 = true;
            materialTimePicker.LJLLLL = 1;
            materialTimePicker.vl(materialTimePicker.LJLLL);
            C80506Vig c80506Vig = c80521Viv.LIZ.LJLJLJ;
            C80503Vid c80503Vid = c80506Vig.LJLJJL;
            if (c80506Vig.LJLILLLLZI.LJLJJI == 12) {
                z = true;
            } else {
                z = false;
            }
            c80503Vid.setChecked(z);
            C80503Vid c80503Vid2 = c80506Vig.LJLJJLL;
            if (c80506Vig.LJLILLLLZI.LJLJJI != 10) {
                z2 = false;
            }
            c80503Vid2.setChecked(z2);
        }
        return onDoubleTap;
    }
}
