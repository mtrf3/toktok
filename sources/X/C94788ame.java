package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainViewModel$dataChangeListener$1$onElementAdd$1", f = "MainViewModel.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "invokeSuspend")
/* renamed from: X.ame, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94788ame extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94115abn LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94788ame(C94115abn c94115abn, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94115abn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94788ame(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
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
            XLL xll = this.LJLILLLLZI.LIZ.LJLJJLL;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            this.LJLIL = 1;
            if (xll.emit(c76800UCe, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}