package X;

import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import com.ss.android.ugc.aweme.voiceconversion.viewmodel.VoiceConversionConversionDetailsViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.voiceconversion.viewmodel.VoiceConversionConversionDetailsViewModel$fetchVoiceDetails$1", f = "VoiceConversionConversionDetailsViewModel.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.T8q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74160T8q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VoiceConversionConversionDetailsViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74160T8q(VoiceConversionConversionDetailsViewModel voiceConversionConversionDetailsViewModel, String str, InterfaceC67352kd<? super C74160T8q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = voiceConversionConversionDetailsViewModel;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74160T8q(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC74161T8r interfaceC74161T8r = (InterfaceC74161T8r) this.LJLILLLLZI.LJLIL.getValue().getOperator();
            String str = this.LJLJI;
            this.LJLIL = 1;
            obj = interfaceC74161T8r.LIZLLL(str, true, true, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC72932td abstractC72932td = (AbstractC72932td) obj;
        if (abstractC72932td instanceof C72912tb) {
            VoiceConversionConversionDetailsViewModel voiceConversionConversionDetailsViewModel = this.LJLILLLLZI;
            voiceConversionConversionDetailsViewModel.setState(new AqS143S0200000_12(abstractC72932td, (AbstractC72932td<VoiceConversionDetailsResponse>) voiceConversionConversionDetailsViewModel, (VoiceConversionConversionDetailsViewModel) 80));
        } else if (abstractC72932td instanceof C3C1) {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(abstractC72932td, (AbstractC72932td<Boolean>) 382));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
