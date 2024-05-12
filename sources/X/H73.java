package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.autocut.util.ImageUtils$getMediaFrame$2", f = "ImageUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H73 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AutoCutMediaModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H73(AutoCutMediaModel autoCutMediaModel, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super H73> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = autoCutMediaModel;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H73(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C44687HgJ.LIZLLL(this.LJLIL.filePath, this.LJLILLLLZI);
        this.LJLJI.invoke(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
