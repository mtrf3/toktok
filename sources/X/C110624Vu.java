package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;

/* renamed from: X.4Vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110624Vu implements InterfaceC110644Vw {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C110634Vv.LJLIL);

    public final ConcurrentHashSet<InterfaceC110644Vw> LIZLLL() {
        return (ConcurrentHashSet) this.LIZ.getValue();
    }

    @Override // X.InterfaceC110644Vw
    public final void LIZ(int i) {
        Iterator<InterfaceC110644Vw> it = LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZ(i);
        }
    }

    @Override // X.InterfaceC110644Vw
    public final void LIZIZ(MotionEvent motionEvent, View view) {
        Iterator<InterfaceC110644Vw> it = LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(motionEvent, view);
        }
    }

    @Override // X.InterfaceC110644Vw
    public final void LIZJ(View view, MotionEvent motionEvent, MotionEvent motionEvent2) {
        Iterator<InterfaceC110644Vw> it = LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZJ(view, motionEvent, motionEvent2);
        }
    }
}
