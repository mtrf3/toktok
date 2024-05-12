package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.DownloadLiveEffectMethod$handle$1", f = "DownloadLiveEffectMethod.kt", l = {41}, m = "invokeSuspend")
/* renamed from: X.NDv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59007NDv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC58890N9i LJLILLLLZI;
    public final /* synthetic */ CompletionBlock<InterfaceC58887N9f> LJLJI;
    public final /* synthetic */ NEW LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59007NDv(InterfaceC58890N9i interfaceC58890N9i, CompletionBlock<InterfaceC58887N9f> completionBlock, NEW r4, InterfaceC67352kd<? super C59007NDv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC58890N9i;
        this.LJLJI = completionBlock;
        this.LJLJJI = r4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59007NDv(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C0WL liveEffectController = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectController();
            String resourceId = this.LJLILLLLZI.getResourceId();
            String panelName = this.LJLILLLLZI.getPanelName();
            String tabKey = this.LJLILLLLZI.getTabKey();
            this.LJLIL = 1;
            obj = liveEffectController.LIZLLL(resourceId, panelName, tabKey, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            CompletionBlock<InterfaceC58887N9f> completionBlock = this.LJLJI;
            this.LJLJJI.getClass();
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC58887N9f.class, null);
            InterfaceC58887N9f interfaceC58887N9f = (InterfaceC58887N9f) LIZJ;
            interfaceC58887N9f.setCode(new Integer(1));
            interfaceC58887N9f.setMsg("");
            completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        } else {
            C31626Cb8.LIZ(this.LJLJI, 0, "download fail", 4);
        }
        this.LJLJJI.LJLJJL.remove(this.LJLILLLLZI.getResourceId());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
