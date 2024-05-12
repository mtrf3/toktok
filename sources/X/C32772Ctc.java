package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCState;
import kotlin.jvm.internal.o;

/* renamed from: X.Ctc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32772Ctc extends AbstractC65781Prl implements InterfaceC88471Ynr<CPCState, Bundle, CPCState> {
    public static final C32772Ctc INSTANCE = new C32772Ctc();

    public C32772Ctc() {
        super(2);
    }

    public final CPCState invoke(CPCState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ CPCState invoke(CPCState cPCState, Bundle bundle) {
        CPCState cPCState2 = cPCState;
        invoke(cPCState2, bundle);
        return cPCState2;
    }
}
