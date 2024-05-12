package X;

import android.app.Activity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.HandleShareProcessModel$showProgressBar$1", f = "HandleShareProcessModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72612t7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43703HDf LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72612t7(C43703HDf c43703HDf, Activity activity, InterfaceC67352kd<? super C72612t7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43703HDf;
        this.LJLILLLLZI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72612t7(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C43703HDf c43703HDf = this.LJLIL;
        if (c43703HDf.LIZ == null) {
            c43703HDf.LIZ = new DialogC25756A8y(this.LJLILLLLZI);
        }
        DialogC25756A8y dialogC25756A8y = this.LJLIL.LIZ;
        if (dialogC25756A8y != null) {
            V1B.LJLJJL(dialogC25756A8y);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
