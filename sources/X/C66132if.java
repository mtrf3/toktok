package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.cameraicon.mgr.AddCameraIconMgr$initUpdateSet$2$2$1", f = "AddCameraIconMgr.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66132if extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66132if(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr, String str, InterfaceC67352kd<? super C66132if> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66132if(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88471Ynr<Boolean, String, C76800UCe> interfaceC88471Ynr = this.LJLIL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.TRUE, this.LJLILLLLZI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
