package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.SetLiveEffectMethod$handle$1", f = "SetLiveEffectMethod.kt", l = {42}, m = "invokeSuspend")
/* renamed from: X.NDu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59006NDu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC58898N9q LJLILLLLZI;
    public final /* synthetic */ CompletionBlock<InterfaceC58899N9r> LJLJI;
    public final /* synthetic */ NEV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59006NDu(InterfaceC58898N9q interfaceC58898N9q, CompletionBlock<InterfaceC58899N9r> completionBlock, NEV nev, InterfaceC67352kd<? super C59006NDu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC58898N9q;
        this.LJLJI = completionBlock;
        this.LJLJJI = nev;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59006NDu(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            o.LJIIIIZZ(liveEffectController, "getService(IEffectServic…ava).liveEffectController");
            String resourceId = this.LJLILLLLZI.getResourceId();
            String panelName = this.LJLILLLLZI.getPanelName();
            String tabKey = this.LJLILLLLZI.getTabKey();
            C59018NEg c59018NEg = C59018NEg.LJLIL;
            this.LJLIL = 1;
            obj = C0WK.LIZ(liveEffectController, resourceId, panelName, tabKey, null, c59018NEg, null, this, 96);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            CompletionBlock<InterfaceC58899N9r> completionBlock = this.LJLJI;
            this.LJLJJI.getClass();
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC58899N9r.class, null);
            InterfaceC58899N9r interfaceC58899N9r = (InterfaceC58899N9r) LIZJ;
            interfaceC58899N9r.setCode(new Integer(1));
            interfaceC58899N9r.setMsg("");
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
