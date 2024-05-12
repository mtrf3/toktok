package X;

import java.util.Calendar;

/* renamed from: X.VYv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79937VYv implements InterfaceC79769VSj {
    public final /* synthetic */ C79930VYo LIZ;

    public C79937VYv(C79930VYo c79930VYo) {
        this.LIZ = c79930VYo;
    }

    @Override // X.InterfaceC79769VSj
    public final void LIZ(int i) {
        Calendar calendar = this.LIZ.LJI;
        int i2 = calendar.get(11);
        int i3 = this.LIZ.LJ.get(11);
        int i4 = this.LIZ.LJ.get(12);
        if (i3 == i2) {
            calendar.set(12, this.LIZ.LIZJ.getCurrentItem() + i4);
        } else {
            calendar.set(12, this.LIZ.LIZJ.getCurrentItem());
        }
        this.LIZ.LIZ(calendar);
        this.LIZ.getClass();
    }
}
