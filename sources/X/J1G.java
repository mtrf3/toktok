package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J1G implements InterfaceC86486Xww {
    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return new int[]{1001};
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        boolean z;
        boolean z2;
        boolean z3 = J1N.LIZ().getBoolean("no_click", true);
        long j = J1N.LIZ().getLong("push_interval_millisecond", 0L);
        int i = J1N.LIZ().getInt("push_count", 0);
        if (System.currentTimeMillis() - j > 604800000) {
            z = true;
        } else {
            z = false;
        }
        if (i < 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !JYH.LIZIZ.LJIIJJI();
        boolean z5 = J1N.LIZ().getBoolean("setting_never_enable", true);
        boolean booleanValue = ((Boolean) J1H.LIZ.getValue()).booleanValue();
        if (z3 && z && z2 && z4 && z5 && booleanValue) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        if (J1N.LIZ().getBoolean("no_click", true)) {
            J1N.LIZ().storeBoolean("no_click", false);
            FMX.LJIIL("mute_settings_push_click", new C188727au().LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        MS5.LIZ(C46359IHj.LJLIL);
        return null;
    }
}
