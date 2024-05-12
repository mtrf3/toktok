package X;

import android.content.Context;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.preinstall.attribution.manager.PreInstallTrackingManager$insertPreloadDataToTestProvider$1", f = "PreInstallTrackingManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Fba, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39298Fba extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C39316Fbs LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39298Fba(Context context, String str, C39316Fbs c39316Fbs, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = c39316Fbs;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C39298Fba(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        new C03880Dg(this.LJLIL);
        try {
            Context context = this.LJLIL;
            String str = this.LJLILLLLZI;
            C39316Fbs c39316Fbs = this.LJLJI;
            C03880Dg.LIZ(context, str, c39316Fbs, this.LJLJJI, this.LJLJJL, c39316Fbs.LIZ.LJLLJ);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
