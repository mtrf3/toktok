package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.Calendar;

/* renamed from: X.VYu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79936VYu implements InterfaceC79769VSj {
    public final /* synthetic */ C79930VYo LIZ;

    public C79936VYu(C79930VYo c79930VYo) {
        this.LIZ = c79930VYo;
    }

    @Override // X.InterfaceC79769VSj
    public final void LIZ(int i) {
        Calendar calendar = this.LIZ.LJI;
        calendar.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
        int currentItem = this.LIZ.LIZIZ.getCurrentItem() + this.LIZ.LJ.get(11);
        if (currentItem >= 24) {
            calendar.set(11, currentItem - 24);
            calendar.add(5, 1);
        } else {
            calendar.set(11, currentItem);
        }
        this.LIZ.LIZ(calendar);
        this.LIZ.getClass();
    }
}
