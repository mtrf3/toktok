package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$getProjectSize$2$draftInfo$1", f = "MainFragment.kt", l = {245}, m = "invokeSuspend")
/* renamed from: X.aoi, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94916aoi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CKEDraftInfo>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94920aom LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94916aoi(C94920aom c94920aom, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94920aom;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94916aoi(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CKEDraftInfo> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            MainFragment mainFragment = this.LJLILLLLZI.LJLJI;
            this.LJLIL = 1;
            obj = mainFragment.em(false, true, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}