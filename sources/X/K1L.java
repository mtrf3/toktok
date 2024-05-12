package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import fjb.a;
import kotlin.jvm.internal.AqS50S1200000_8;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate.LoadDelegate$ssrHydrate$1", f = "LoadDelegate.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class K1L extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C50098JlO LJLILLLLZI;
    public final /* synthetic */ InterfaceC60761Nsz LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1L(C50098JlO c50098JlO, InterfaceC60761Nsz interfaceC60761Nsz, InterfaceC67352kd<? super K1L> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c50098JlO;
        this.LJLJI = interfaceC60761Nsz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new K1L(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        TemplateData templateData;
        C60726NsQ c60726NsQ;
        C60737Nsb hybridContext;
        C39902FlK c39902FlK;
        C60606NqU c60606NqU;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            int LIZ = C00F.LIZ(31744, 0, "ssr_hydrate_delay_time", true);
            if (LIZ != 0) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(LIZ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        JTC jtc = this.LJLILLLLZI.LJLIL.LJIIZILJ;
        if (jtc != null) {
            str = jtc.LIZIZ;
        } else {
            str = null;
        }
        byte[] LIZ2 = C36861EdN.LIZ(str);
        DynamicPatch dynamicPatch = this.LJLILLLLZI.LJLIL.LJII;
        if (dynamicPatch != null) {
            str2 = dynamicPatch.schema;
        } else {
            str2 = null;
        }
        InterfaceC60710NsA interfaceC60710NsA = this.LJLJI.getHybridContext().hybridParams;
        if ((interfaceC60710NsA instanceof C60606NqU) && (c60606NqU = (C60606NqU) interfaceC60710NsA) != null) {
            templateData = c60606NqU.LJIIIIZZ;
        } else {
            templateData = null;
        }
        if (str2 != null) {
            C50107JlX c50107JlX = this.LJLILLLLZI.LJLIL.LIZ;
            if (LIZ2 != null) {
                z = true;
            }
            C50098JlO.LJII(c50107JlX, z, true);
            if (LIZ2 != null) {
                VNS vns = this.LJLILLLLZI.LJLIL.LIZLLL;
                if (vns != null) {
                    vns.ssrHydrate(LIZ2, str2, templateData);
                }
            } else {
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str2), "url");
                VNS vns2 = this.LJLILLLLZI.LJLIL.LIZLLL;
                if ((vns2 instanceof C60726NsQ) && (c60726NsQ = (C60726NsQ) vns2) != null && (hybridContext = c60726NsQ.getHybridContext()) != null && C78685UuP.LJJJZ(queryParameter)) {
                    RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_TEMPLATE);
                    requestParams.setLoadToMemory(true);
                    requestParams.getCustomParams().put("rl_container_uuid", hybridContext.containerId);
                    requestParams.setAllowIOOnMainThread(true);
                    requestParams.setBundle(UriProtector.getQueryParameter(UriProtector.parse(str2), "bundle"));
                    requestParams.setChannel(UriProtector.getQueryParameter(UriProtector.parse(str2), "channel"));
                    C60905NvJ.LJ(requestParams, hybridContext);
                    requestParams.getCustomParams().put("resource_url", str2);
                    InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(hybridContext, null);
                    if ((LIZIZ instanceof C39902FlK) && (c39902FlK = (C39902FlK) LIZIZ) != null) {
                        c39902FlK.LIZLLL(queryParameter, requestParams, new AqS50S1200000_8(this.LJLILLLLZI, str2, templateData, 2));
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
