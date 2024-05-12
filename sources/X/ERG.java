package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$generateCreativeDirAsync$2", f = "MobileEffectExportWorkflowImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super File>, Object> {
    public final /* synthetic */ ERD LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERG(ERD erd, String str, boolean z, InterfaceC67352kd<? super ERG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = erd;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ERG(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ERD erd = this.LJLIL;
        String str = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        erd.getClass();
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = erd.LJLIL.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        File LJIIIZ = pathService.LJIIIZ(creativeInfo, EnumC43649HBd.MOBILE_EFFECT, str, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prop dir generated, propDir=");
        LIZ.append(LJIIIZ.getAbsolutePath());
        H78.LIZIZ("MET-JEFF", X1D.LIZIZ(LIZ));
        return LJIIIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super File> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
