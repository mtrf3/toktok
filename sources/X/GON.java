package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel$permissionGranted$1", f = "TTEPVideoSaveViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GON extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C29901Fi LJLIL;
    public C29901Fi LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ TTEPVideoSaveViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GON(TTEPVideoSaveViewModel tTEPVideoSaveViewModel, InterfaceC67352kd<? super GON> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = tTEPVideoSaveViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GON(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0054: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777300), block:B:21:0x0052 */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        GOP gop;
        C29901Fi<GOP> c29901Fi;
        C29901Fi<GOP> c29901Fi2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c29901Fi2 = this.LJLILLLLZI;
                    C29901Fi c29901Fi3 = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                TTEPVideoSaveViewModel tTEPVideoSaveViewModel = this.LJLJJI;
                C29901Fi<GOP> c29901Fi4 = tTEPVideoSaveViewModel.LJLILLLLZI;
                PublishModel publishModel = tTEPVideoSaveViewModel.LJLIL;
                this.LJLIL = c29901Fi4;
                this.LJLILLLLZI = c29901Fi4;
                this.LJLJI = 1;
                obj = TTEPVideoSaveViewModel.hv0(publishModel, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                c29901Fi2 = c29901Fi4;
            }
            if (((Boolean) obj).booleanValue()) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LIZLLL("shoot_way", "scan");
                FMX.LJIIL("save_demo_success", c145995oB.LIZ);
                gop = GOQ.LIZ;
            } else {
                gop = GOO.LIZ;
            }
        } catch (Exception unused) {
            gop = GOO.LIZ;
            c29901Fi2 = c29901Fi;
        }
        c29901Fi2.LJII(gop);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
