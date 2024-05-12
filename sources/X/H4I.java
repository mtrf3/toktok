package X;

import android.app.Application;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.composer.EffectWatermarkComposer$loadEffectWatermarkResource$1", f = "EffectWatermarkComposer.kt", l = {136, 142}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H4I extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int[] LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ H4P LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<C142385iM, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H4I(H4P h4p, InterfaceC88472Yns<? super C142385iM, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super H4I> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = h4p;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H4I(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int[] iArr;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C141335gf.LIZJ(obj);
                    this.LJLJJI.invoke((C142385iM) obj);
                    return C76800UCe.LIZ;
                }
                iArr = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                iArr = new int[]{this.LJLJI.LJ.video.getWidth(), this.LJLJI.LJ.video.getHeight()};
                H4P h4p = this.LJLJI;
                this.LJLIL = iArr;
                this.LJLILLLLZI = 1;
                obj = h4p.LJFF(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            H4O LIZJ = H49.LIZJ(new CreativeInfo(null, 0, null, 7, null), iArr, (ViralEffectInfo) obj);
            C76940UHo c76940UHo = new C76940UHo();
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            C43534H6s c43534H6s = new C43534H6s(c76940UHo, application, LIZJ);
            this.LJLIL = null;
            this.LJLILLLLZI = 2;
            obj = c43534H6s.LIZIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
            this.LJLJJI.invoke((C142385iM) obj);
            return C76800UCe.LIZ;
        } catch (Exception e) {
            throw new C72512sx(10087, null, e, 2, null);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
