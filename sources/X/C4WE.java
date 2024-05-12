package X;

import Y.ARunnableS37S0100000_1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4WE, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4WE implements InterfaceC81623Ig {
    public final /* synthetic */ C115284fk LIZ;

    public C4WE(C115284fk c115284fk) {
        this.LIZ = c115284fk;
    }

    public final void LIZ(List<? extends C63120Opw> list) {
        if (C63308Osy.LJI().LIZLLL().LJIJI || list == null || list.isEmpty()) {
            return;
        }
        this.LIZ.LJJIIJ(list);
        if (((CopyOnWriteArraySet) this.LIZ.LIZLLL).isEmpty()) {
            return;
        }
        C4WR.LIZ.post(new ARunnableS37S0100000_1(this, 15));
    }
}
