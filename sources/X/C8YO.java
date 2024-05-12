package X;

import kotlin.jvm.internal.AqS0S0700000_3;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D, E] */
/* renamed from: X.8YO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YO<A, B, C, D, E> extends AbstractC65781Prl implements InterfaceC88475Ynv<A, B, C, D, E, C76800UCe> {
    public final /* synthetic */ InterfaceC212848Wy<RECEIVER> LJLIL;
    public final /* synthetic */ InterfaceC88476Ynw<RECEIVER, A, B, C, D, E, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8YO(InterfaceC212848Wy<? extends RECEIVER> interfaceC212848Wy, InterfaceC88476Ynw<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        super(5);
        this.LJLIL = interfaceC212848Wy;
        this.LJLILLLLZI = interfaceC88476Ynw;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C3C8 actualReceiver = this.LJLIL.getActualReceiver();
        if (actualReceiver != null) {
            C8VR.LIZIZ(actualReceiver, new AqS0S0700000_3((InterfaceC88476Ynw) this.LJLILLLLZI, (InterfaceC88476Ynw<C3C8, Object, Object, Object, Object, Object, C76800UCe>) actualReceiver, (C3C8) obj, obj2, obj3, obj4, obj5, (Object) 1));
        }
        return C76800UCe.LIZ;
    }
}
