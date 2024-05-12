package X;

import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CmU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32330CmU implements InterfaceC32497CpB {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;

    public C32330CmU(AqS171S0100000_5 aqS171S0100000_5) {
        this.LJLIL = aqS171S0100000_5;
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LJLIL.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        this.LJLIL.invoke(Boolean.TRUE);
    }
}
