package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198487qe extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, AbstractC72932td<? extends Integer>, C76800UCe> {
    public static final C198487qe INSTANCE = new C198487qe();

    public C198487qe() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UIAssem selectSubscribe, AbstractC72932td<Integer> userCardState) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(userCardState, "userCardState");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current userCardState: ");
        LIZ.append(C16880lQ.LJLLJ(userCardState.getClass()));
        C221018lt.LJFF("UserCard_Assem", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(UIAssem uIAssem, AbstractC72932td<? extends Integer> abstractC72932td) {
        invoke2(uIAssem, (AbstractC72932td<Integer>) abstractC72932td);
        return C76800UCe.LIZ;
    }
}
