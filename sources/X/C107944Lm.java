package X;

import com.bytedance.forest.model.RequestParams;
import fjb.a;
import kotlin.jvm.internal.AqS55S1100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager$fetchChannelInner$2", f = "DMGeckoCommonChannelManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107944Lm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C107944Lm(InterfaceC88473Ynt<? super String, ? super RequestParams, ? super InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt, String str, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C107944Lm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107944Lm(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt = this.LJLIL;
        RequestParams requestParams = new RequestParams(null, 1, null);
        String str = this.LJLILLLLZI;
        requestParams.setDisableBuiltin(true);
        requestParams.setResourceScene(EnumC61028NxI.OTHER);
        requestParams.setEnableRequestReuse(true);
        Boolean bool = Boolean.TRUE;
        requestParams.setEnableMemoryCache(bool);
        requestParams.setEnableCDNCache(bool);
        requestParams.setChannel(str);
        requestParams.setBundle("/");
        interfaceC88473Ynt.invoke("", requestParams, new AqS55S1100000_1((InterfaceC88471Ynr) this.LJLJI, (InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe>) this.LJLILLLLZI, (String) 4));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
