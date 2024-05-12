package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS21S0010000_2;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.preview.TiktokEditPreviewComponent$tryPreloadEffectWatermarkResource$1", f = "TiktokEditPreviewComponent.kt", l = {801}, m = "invokeSuspend")
/* renamed from: X.5g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140925g0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C139875eJ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140925g0(C139875eJ c139875eJ, InterfaceC67352kd<? super C140925g0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c139875eJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C140925g0(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC43114Gw2 LIZJ = C60903NvH.LJIIJJI().LIZJ();
                C139875eJ c139875eJ = this.LJLILLLLZI;
                c139875eJ.getLifecycleOwner();
                Context LJJIII = C78688UuS.LJJIII(this.LJLILLLLZI);
                VideoPublishEditModel LLZZJLIL = this.LJLILLLLZI.LLZZJLIL();
                this.LJLIL = 1;
                obj = LIZJ.LJI(c139875eJ, LJJIII, LLZZJLIL, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
            if (!booleanValue) {
                z = false;
            }
            LJJ.LJFF("effect-watermark", new AqS21S0010000_2(z, 0));
        } catch (Exception e) {
            C1I0.LIZIZ().LJFF("effect-watermark", new AqS152S0100000_2(e, 434));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
