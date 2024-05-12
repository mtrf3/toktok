package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveCohostSeiIdentifyOptEnableSetting;

/* renamed from: X.Tlk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75600Tlk extends AbstractC75865Tq1 {
    public final String LJ = "ttlive_client_audience_cohost_monitor";

    @Override // X.AbstractC75865Tq1
    public final boolean LJIILL() {
        return false;
    }

    @Override // X.AbstractC75865Tq1
    public final void LJIILIIL() {
        long j;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "current_user_id", Long.valueOf(j), true);
    }

    @Override // X.AbstractC75865Tq1
    public final String LJIILJJIL() {
        return this.LJ;
    }

    public final void LJIIZILJ(boolean z) {
        String str;
        if (z) {
            if (C75877TqD.LJFF) {
                str = "room_enter_opt";
            } else {
                str = "room_enter";
            }
        } else if (C75877TqD.LJFF) {
            str = "enter_message_opt";
        } else {
            str = "enter_message";
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "identify_type", str, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "sei_optimize", Integer.valueOf(C75877TqD.LJFF ? 1 : 0), true);
        if (C75877TqD.LJ != 0) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "duration", Long.valueOf(SystemClock.uptimeMillis() - C75877TqD.LJ), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "sei_optimize", Integer.valueOf(LiveCohostSeiIdentifyOptEnableSetting.INSTANCE.getValue() ? 1 : 0), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "linker_arch_type", Integer.valueOf(C75877TqD.LJII), true);
        LJIILLIIL("linked");
    }

    public final void LJIJ(long j, Throwable th) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        if (C75877TqD.LJ != 0) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "duration", Long.valueOf(SystemClock.uptimeMillis() - C75877TqD.LJ), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "linker_arch_type", Integer.valueOf(C75877TqD.LJII), true);
        LJIIJ(th);
        LJIILLIIL("sei_identify_start_failed");
    }

    public final void LJIJI(int i, long j, boolean z, boolean z2) {
        if (C75877TqD.LJI == j) {
            C0NB.LJIIIZ("sei_identify", "monitor was sent earlier");
            return;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        LiveCohostSeiIdentifyOptEnableSetting liveCohostSeiIdentifyOptEnableSetting = LiveCohostSeiIdentifyOptEnableSetting.INSTANCE;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "sei_optimize", Integer.valueOf(liveCohostSeiIdentifyOptEnableSetting.getValue() ? 1 : 0), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "is_first_sei", Integer.valueOf(z ? 1 : 0), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "sei_optimize", Integer.valueOf(liveCohostSeiIdentifyOptEnableSetting.getValue() ? 1 : 0), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "is_first_sei", Integer.valueOf(z ? 1 : 0), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "linker_arch_type", Integer.valueOf(i), true);
        LJIILLIIL("sei_identify_start");
        C75877TqD.LJ = SystemClock.uptimeMillis();
        C75877TqD.LJFF = z2;
        C75877TqD.LJI = j;
        C75877TqD.LJII = i;
    }
}
