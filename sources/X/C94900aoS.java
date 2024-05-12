package X;

import com.bytedance.effectcreatormobile.ckeapi.api.IRecovery;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainViewModel$fetchModelFromDraft$2", f = "MainViewModel.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.aoS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94900aoS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94900aoS(String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94900aoS(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        CKEDraftInfo initOneDraftWithPath;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = this;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            String str2 = this.LJLJI;
            if (str2 != null && str2.length() != 0 && new File(this.LJLJI).exists()) {
                IRecovery LIZ = C93943aZ1.LIZ();
                if (LIZ == null || (str = LIZ.getModelPictureId()) == null) {
                    ICKDraftManager LJ = CKEffectEditorContext.LJ();
                    if (LJ != null && (initOneDraftWithPath = LJ.initOneDraftWithPath(this.LJLJI)) != null) {
                        str = initOneDraftWithPath.modelId;
                    } else {
                        str = null;
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("modelID = ");
                LIZ2.append(str);
                C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ2));
                if (str == null || str.length() == 0) {
                    if (xks._state instanceof InterfaceC30550Bys) {
                        C3C5.m7constructorimpl("");
                        xks.resumeWith("");
                    }
                } else {
                    C93797aWf.LIZ().setSelectedModel(str);
                    C93797aWf.LIZ().fetchDefaultModel(new IDqS446S0100000_42(xks, 13));
                }
            }
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
