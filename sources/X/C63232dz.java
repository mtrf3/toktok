package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.tiktok.addyours.route.AddYoursTopicDetailRouterAction;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.route.AddYoursTopicDetailRouterAction$open$1", f = "AddYoursTopicDetailRouterAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63232dz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AddYoursTopicDetailRouterAction LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63232dz(AddYoursTopicDetailRouterAction addYoursTopicDetailRouterAction, Context context, Bundle bundle, InterfaceC67352kd<? super C63232dz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = addYoursTopicDetailRouterAction;
        this.LJLILLLLZI = context;
        this.LJLJI = bundle;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63232dz(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.realOpenDetailFragment(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
