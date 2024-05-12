package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class APU extends APV {
    public final InterfaceC65784Pro<Boolean> LIZIZ;
    public final InterfaceC88471Ynr<Object, UrlModel, Boolean> LIZJ;
    public final InterfaceC88472Yns<APY, C76800UCe> LIZLLL;

    @Override // X.APV
    public final InterfaceC88472Yns<APY, C76800UCe> LIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APU(InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr picFirstCondition) {
        super(interfaceC88472Yns);
        o.LJIIIZ(picFirstCondition, "picFirstCondition");
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = picFirstCondition;
        this.LIZLLL = interfaceC88472Yns;
    }
}
