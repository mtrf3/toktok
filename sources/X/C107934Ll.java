package X;

import com.bytedance.forest.model.RequestParams;
import fjb.a;
import kotlin.jvm.internal.AqS47S0400000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.utils.SwipeForReplyIntroductionAnimationResourceMgr$checkLoadResource$3", f = "SwipeForReplyIntroductionAnimationResourceMgr.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107934Ll extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C38515F9r>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C107934Ll(InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC88473Ynt<? super String, ? super RequestParams, ? super InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC67352kd<? super C107934Ll> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = interfaceC88473Ynt;
        this.LJLJI = interfaceC88471Ynr2;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107934Ll(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkLoadResource -> ");
        C62822Ol8 c62822Ol8 = C108044Lw.LIZJ;
        LIZ.append((String) c62822Ol8.getValue());
        interfaceC88471Ynr.invoke("SwipeForReplyIntroductionAnimationResourceMgr", X1D.LIZIZ(LIZ));
        InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt = this.LJLILLLLZI;
        Object value = c62822Ol8.getValue();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setDisableBuiltin(true);
        requestParams.setResourceScene(EnumC61028NxI.OTHER);
        requestParams.setEnableRequestReuse(true);
        Boolean bool = Boolean.TRUE;
        requestParams.setEnableMemoryCache(bool);
        requestParams.setEnableCDNCache(bool);
        requestParams.setChannel("reply_options_in_dm_resource");
        requestParams.setBundle("light.json");
        return interfaceC88473Ynt.invoke(value, requestParams, new AqS47S0400000_1((InterfaceC88471Ynr) this.LJLJI, (InterfaceC88471Ynr<? super String, ? super String, C76800UCe>) this.LJLJJI, (InterfaceC65784Pro<C76800UCe>) this.LJLIL, (InterfaceC88471Ynr<? super String, ? super String, C76800UCe>) this.LJLJJL, (InterfaceC65784Pro<C76800UCe>) 6));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C38515F9r> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
