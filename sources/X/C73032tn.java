package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickersResponseBody;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedstickers.SuggestedStickersManager$internalHandleResponse$1$1", f = "SuggestedStickersManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73032tn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SuggestedStickersResponseBody LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73032tn(SuggestedStickersResponseBody suggestedStickersResponseBody, InterfaceC67352kd<? super C73032tn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = suggestedStickersResponseBody;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73032tn(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SuggestedStickersResponseBody response = this.LJLIL;
        o.LJIIIZ(response, "response");
        ((Keva) C73042to.LIZ.getValue()).storeString("suggested_stickers_response", C62070OXq.LIZIZ(response));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
