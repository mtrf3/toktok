package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ck2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32178Ck2 extends AbstractC31742Cd0 {
    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(10000);
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32178Ck2(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        C71172RwW c71172RwW = new C71172RwW(context, true, true);
        c71172RwW.LJLJJI = this;
        ((ArrayList) this.LJLJI).add(c71172RwW);
        C71143Rw3 c71143Rw3 = new C71143Rw3(context);
        c71143Rw3.LJLJJI = this;
        ((ArrayList) this.LJLJI).add(c71143Rw3);
    }
}
