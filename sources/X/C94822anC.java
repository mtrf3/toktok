package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ugc.effectcreator.layer.LayerImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.layer.LayerImpl$updateLayerEvent$1", f = "LayerImpl.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.anC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94822anC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LayerImpl LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ EnumC93710aVG LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94822anC(LayerImpl layerImpl, long j, EnumC93710aVG enumC93710aVG, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = layerImpl;
        this.LJLJI = j;
        this.LJLJJI = enumC93710aVG;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94822anC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
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
            C3BJ<C94221adV> c3bj = this.LJLILLLLZI.featureOperateData;
            C94221adV c94221adV = new C94221adV(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (c3bj.emit(c94221adV, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
