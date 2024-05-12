package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchSparkContainerHelper$createContainer$1", f = "SearchSparkContainerHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FP7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FP9 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP7(FP9 fp9, InterfaceC67352kd<? super FP7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fp9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new FP7(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        FP9 fp9 = this.LJLIL;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        m mVar = FP5.LIZ;
        m mVar2 = (m) LIZLLL.LJIIIIZZ("tiktok_scc_sdk", m.class, mVar);
        if (mVar2 != null) {
            mVar = mVar2;
        }
        fp9.LIZ.LIZ(mVar);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
