package X;

import com.ss.ttm.player.u;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZS extends C46742IWc {
    @Override // X.C46742IWc, X.IZT
    public final void LJIJJ() {
        C47282Ih4 q7 = this.LJLILLLLZI.q7();
        if (q7 != null && 1 == q7.LJJI) {
            Object value = IZ8.LLZZZZ.getValue();
            o.LJIIIIZZ(value, "<get-PLAYER_SET_THREAD_POOL_STACK_SIZE>(...)");
            int intValue = ((Number) value).intValue();
            if (intValue <= 0) {
                return;
            }
            try {
                Class cls = Integer.TYPE;
                u.class.getDeclaredMethod("LJFF", cls, cls).invoke(null, 25, Integer.valueOf(intValue));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public IZS(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        C46882Iac player;
        C47282Ih4 q7 = this.LJLILLLLZI.q7();
        if (q7 == null || (player = this.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        player.LJLLLL(411, q7.LJJI);
    }
}
