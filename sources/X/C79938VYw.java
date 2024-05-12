package X;

import java.util.Calendar;

/* renamed from: X.VYw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79938VYw implements InterfaceC79769VSj {
    public final /* synthetic */ C79930VYo LIZ;

    public C79938VYw(C79930VYo c79930VYo) {
        this.LIZ = c79930VYo;
    }

    @Override // X.InterfaceC79769VSj
    public final void LIZ(int i) {
        Calendar calendar = this.LIZ.LJI;
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int i4 = this.LIZ.LJ.get(11);
        int i5 = this.LIZ.LJ.get(12);
        int i6 = this.LIZ.LJ.get(13);
        if (i4 == i2 && i3 == i5) {
            calendar.set(13, this.LIZ.LIZLLL.getCurrentItem() + i6);
        } else {
            calendar.set(13, this.LIZ.LIZLLL.getCurrentItem());
        }
        this.LIZ.LIZ(calendar);
        this.LIZ.getClass();
    }
}
