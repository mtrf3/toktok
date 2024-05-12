package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.innerpush.handler.external.ProfileViewerAndDMHandler$interceptInnerPushClick$1$2$1$1", f = "ProfileViewerAndDMHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3U9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3U9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InnerPushMessage LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3U9(InnerPushMessage innerPushMessage, String str, InterfaceC67352kd<? super C3U9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = innerPushMessage;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3U9(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.getType() == 29) {
            hashMap = C113554cx.LJJJLZIJ(new OSZ("enter_from", "inner_push"), new OSZ("enter_method", "inner_push_profile_viewer"));
        } else {
            hashMap = new HashMap();
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        String str = this.LJLILLLLZI;
        createIIMServicebyMonsterPlugin.getImSayHiService().LIZLLL(str, hashMap);
        createIIMServicebyMonsterPlugin.getImChatService().LJ(str);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
