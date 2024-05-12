package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startChangeBanMusic$1$2", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gl4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42434Gl4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IRecordService.UICallback LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42434Gl4(IRecordService.UICallback uICallback, Activity activity, InterfaceC67352kd<? super C42434Gl4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uICallback;
        this.LJLILLLLZI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42434Gl4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IRecordService.UICallback uICallback = this.LJLIL;
        if (uICallback != null) {
            uICallback.postFail();
        }
        this.LJLILLLLZI.finish();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
