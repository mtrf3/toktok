package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavHelper$startNav$1$1", f = "DMNavHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98623ty extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63120Opw LJLIL;
    public final /* synthetic */ C98603tw LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ DMNavArg LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98623ty(C63120Opw c63120Opw, C98603tw c98603tw, Activity activity, DMNavArg dMNavArg, InterfaceC67352kd<? super C98623ty> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63120Opw;
        this.LJLILLLLZI = c98603tw;
        this.LJLJI = activity;
        this.LJLJJI = dMNavArg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C98623ty(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63120Opw c63120Opw = this.LJLIL;
        if (c63120Opw != null) {
            this.LJLILLLLZI.LIZ(this.LJLJI, this.LJLJJI, (int) c63120Opw.getUnreadCount());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
