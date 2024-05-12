package X;

import Y.AObjectS71S0300000_14;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.livephoto.BaseLivePhotoComponent$startRecordLivePhoto$2", f = "BaseLivePhotoComponent.kt", l = {173, 202}, m = "invokeSuspend")
/* renamed from: X.Wu9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83765Wu9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AbstractC83766WuA LJLJI;
    public final /* synthetic */ float LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83765Wu9(AbstractC83766WuA abstractC83766WuA, float f, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC83766WuA;
        this.LJLJJI = f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C83765Wu9 c83765Wu9 = new C83765Wu9(this.LJLJI, this.LJLJJI, completion);
        c83765Wu9.LJLIL = obj;
        return c83765Wu9;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    C83770WuE c83770WuE = this.LJLJI.LJLJJI;
                    T LIZ = c83770WuE.LIZIZ.LIZ();
                    o.LJIIIIZZ(LIZ, "statusMachine.status.value");
                    c83770WuE.LIZ(new C83779WuN((EnumC83774WuI) LIZ));
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
            this.LJLJI.LJLJI.LIZIZ.clearAllFrags();
            VERecorder vERecorder = this.LJLJI.LJLJI;
            vERecorder.LIZIZ.changeRecordMode(VERecordMode.MOTION_PHOTO);
            AbstractC83766WuA abstractC83766WuA = this.LJLJI;
            AbstractC84025WyL abstractC84025WyL = abstractC83766WuA.LJLJI.LIZIZ;
            VEVideoEncodeSettings vEVideoEncodeSettings = abstractC84025WyL.mVideoEncodeSettings;
            if (vEVideoEncodeSettings == null) {
                abstractC84025WyL.changeVideoEncodeSettings(abstractC83766WuA.LJLLJ);
                this.LJLIL = interfaceC70422pa;
                this.LJLILLLLZI = 1;
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                if (this.LJLJI.getCameraApiComponent().e8().getMediaController().O8()) {
                    C82891Wg3.LIZLLL().i("livephoto startRecording but is pre playing wait for preplay stop");
                    this.LJLJI.getCameraApiComponent().e8().getMediaController().R8().observe(this.LJLJI, new AObjectS71S0300000_14(interfaceC70422pa, c84654XKg, this, 0));
                } else if (C48841JEv.LJIILLIIL(interfaceC70422pa)) {
                    this.LJLJI.getClass();
                    throw null;
                }
                if (c84654XKg.LIZ() == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                new C87278YNe(vEVideoEncodeSettings);
                this.LJLJI.getClass();
                throw null;
            }
        }
        this.LJLJI.getClass();
        throw null;
    }
}
