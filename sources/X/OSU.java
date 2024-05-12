package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDownloadTimeOutSetting;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.assets.LynxGiftChannelPreload$startCheckGeckoResource$2", f = "LynxGiftChannelPreload.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OSU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C78072UkW LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSU(C78072UkW c78072UkW, String str, InterfaceC67352kd<? super OSU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c78072UkW;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OSU(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long value = LiveGiftResourceDownloadTimeOutSetting.INSTANCE.getValue();
            C9QA c9qa = new C9QA(this.LJLJI, null);
            this.LJLIL = 1;
            obj = C74209TAn.LIZJ(value, c9qa, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (obj == null) {
            C78983UzD.LJIJ(new Throwable("load gecko resource timeout"), "LynxGiftChannelPreload");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" load gecko result is ");
        LIZ.append(obj);
        LIZ.append(' ');
        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ));
        C78072UkW c78072UkW = this.LJLILLLLZI;
        if (c78072UkW != null) {
            if (o.LJ(obj, Boolean.TRUE)) {
                i = 1001;
            } else {
                i = 1002;
            }
            c78072UkW.LJJL = i;
            OSW osw = OST.LIZ;
            if (osw != null) {
                osw.LIZ(c78072UkW.LJJJJIZL, c78072UkW, i);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
