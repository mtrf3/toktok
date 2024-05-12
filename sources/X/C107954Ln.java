package X;

import com.bytedance.forest.model.RequestParams;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.chatanimation.resource.ChatRoomAnimationResHelper$fetchAnimationRes$2", f = "ChatAnimationResHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107954Ln extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C107954Ln(InterfaceC88473Ynt<? super String, ? super RequestParams, ? super InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C107954Ln> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107954Ln(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt = this.LJLIL;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setDisableBuiltin(true);
        requestParams.setResourceScene(EnumC61028NxI.OTHER);
        requestParams.setEnableRequestReuse(true);
        Boolean bool = Boolean.TRUE;
        requestParams.setEnableMemoryCache(bool);
        requestParams.setEnableCDNCache(bool);
        requestParams.setChannel("chat_ambient_animation_resource");
        requestParams.setBundle("/");
        interfaceC88473Ynt.invoke("", requestParams, new AqS167S0100000_1(this.LJLILLLLZI, (InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe>) 318));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
