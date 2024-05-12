package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aJE, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92964aJE extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC06520Nk, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92964aJE(String str, int i) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC06520Nk AnimatedVisibility, InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        String str = this.LJLIL;
        C92030a4A.LIZIZ((this.LJLILLLLZI >> 3) & 14, interfaceC24520xk, str);
        return C76800UCe.LIZ;
    }
}
