package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZ1 extends F9E implements KK7 {
    public final InterfaceC88472Yns<EnterRoomConfig, EnterRoomConfig> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().CB().LIZIZ(C65352Pkq.LIZ(JZ1.class), JZ3.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JZ1(InterfaceC88472Yns<? super EnterRoomConfig, EnterRoomConfig> liveRoomConfig) {
        o.LJIIIZ(liveRoomConfig, "liveRoomConfig");
        this.LJLIL = liveRoomConfig;
    }
}
