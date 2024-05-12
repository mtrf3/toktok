package X;

import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.model.Selector$onDownloadFinish$1", f = "Selector.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94960apQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C93996aZs LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C94256ae4 LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94960apQ(C93996aZs c93996aZs, String str, String str2, C94256ae4 c94256ae4, InterfaceC88472Yns interfaceC88472Yns, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c93996aZs;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = c94256ae4;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94960apQ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String LIZ = C94023aaJ.LIZ(this.LJLILLLLZI, this.LJLJI, 1280.0f, 0, 24);
        C94034aaU.LIZ("Selector", "notify select");
        if (LIZ.length() > 0 && new File(LIZ).exists()) {
            C94256ae4 c94256ae4 = this.LJLJJI;
            c94256ae4.getClass();
            c94256ae4.LJLJLJ = LIZ;
            this.LJLJJL.invoke(Boolean.TRUE);
            this.LJLIL.LIZ(this.LJLJJI);
            C93996aZs c93996aZs = this.LJLIL;
            c93996aZs.LIZ.onAutoChange(this.LJLJJLL);
        } else {
            this.LJLJJL.invoke(Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }
}
