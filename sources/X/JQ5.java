package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.AqS174S0100000_8;

/* loaded from: classes9.dex */
public final class JQ5 implements IEvent {
    public final int LJLIL;
    public final Integer LJLILLLLZI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;
    public final InterfaceC88472Yns<C49128JPw, C76800UCe> LJLJJI;
    public final C49128JPw LJLJJL;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public JQ5(int i, Integer num, AqS174S0100000_8 aqS174S0100000_8, AqS174S0100000_8 aqS174S0100000_82, C49128JPw c49128JPw, int i2) {
        aqS174S0100000_8 = (i2 & 4) != 0 ? null : aqS174S0100000_8;
        aqS174S0100000_82 = (i2 & 8) != 0 ? null : aqS174S0100000_82;
        c49128JPw = (i2 & 16) != 0 ? null : c49128JPw;
        this.LJLIL = i;
        this.LJLILLLLZI = num;
        this.LJLJI = aqS174S0100000_8;
        this.LJLJJI = aqS174S0100000_82;
        this.LJLJJL = c49128JPw;
    }
}
