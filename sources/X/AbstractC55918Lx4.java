package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lx4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC55918Lx4 {
    public List<InterfaceC55926LxC> LIZ;

    public abstract void LIZIZ();

    public abstract void LJ(View view, View view2);

    public final void LIZJ() {
        List<InterfaceC55926LxC> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC55926LxC> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        }
    }

    public final void LIZLLL() {
        List<InterfaceC55926LxC> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC55926LxC> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    public final void LIZ(InterfaceC55926LxC interfaceC55926LxC) {
        if (this.LIZ == null) {
            this.LIZ = new ArrayList();
        }
        List<InterfaceC55926LxC> list = this.LIZ;
        if (list != null) {
            ((ArrayList) list).add(interfaceC55926LxC);
        }
    }
}
