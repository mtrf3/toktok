package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.nows.savelocal.DualMixTaskCompiler$start$1", f = "DualMixTaskCompiler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H2Q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C162816aD LJLIL;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, String, C6ZI, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H2Q(C162816aD c162816aD, InterfaceC88473Ynt<? super Boolean, ? super String, ? super C6ZI, C76800UCe> interfaceC88473Ynt, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super H2Q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c162816aD;
        this.LJLILLLLZI = interfaceC88473Ynt;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H2Q(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String LIZ = C15190ih.LIZ();
        this.LJLIL.getClass();
        try {
            ((C43421H2j) this.LJLIL.LJ.getValue()).LJ(new ERR(C47261Igj.LJJIJIIJI(new C43397H1l(LIZ), new C43403H1r(this.LJLIL.LIZIZ), new C43404H1s(C43001GuD.LJFF(this.LJLIL.LIZJ)), new XFL(this.LJLIL.LIZIZ.mParallelUploadOutputFile, LIZ), new C43478H4o(), new H2S(true, C90193gN.LIZ()))), new H2R(this.LJLJI, this.LJLILLLLZI));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            this.LJLILLLLZI.invoke(Boolean.FALSE, null, new C6ZI(LiveNetAdaptiveHurryTimeSetting.DEFAULT, e, 2));
        }
        return C76800UCe.LIZ;
    }
}
