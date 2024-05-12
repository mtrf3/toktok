package X;

import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("ug_campaign_lynx")
/* renamed from: X.AXn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26395AXn extends M71 {
    public static final /* synthetic */ int LJLJJI = 0;
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC88471Ynr<C54082LKk, M78, C76800UCe> LJLJI;

    @Override // X.M74
    public final AY1 getPopupExtraParams() {
        return new AY1(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLIL;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLJI.invoke(context, wrapper);
    }

    public C26395AXn(InterfaceC55643Lsd interfaceC55643Lsd, String str, AqS186S0100000_4 aqS186S0100000_4) {
        super(interfaceC55643Lsd);
        this.LJLIL = 221;
        this.LJLILLLLZI = str;
        this.LJLJI = aqS186S0100000_4;
    }
}
