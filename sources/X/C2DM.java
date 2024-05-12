package X;

import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.speeddetector.core.impl.NetworkSpeedDetectorManager$doRepeatUploadData$1$1", f = "NetworkSpeedDetectorManager.kt", l = {358}, m = "invokeSuspend")
/* renamed from: X.2DM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C42111l1 LJLILLLLZI;
    public final /* synthetic */ StringBuilder LJLJI;
    public final /* synthetic */ ConfigData LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DM(C42111l1 c42111l1, StringBuilder sb, ConfigData configData, InterfaceC67352kd<? super C2DM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c42111l1;
        this.LJLJI = sb;
        this.LJLJJI = configData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2DM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C42111l1 c42111l1 = this.LJLILLLLZI;
            StringBuilder sb = this.LJLJI;
            ConfigData configData = this.LJLJJI;
            this.LJLIL = 1;
            if (c42111l1.LJI(sb, configData, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
