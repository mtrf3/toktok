package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VOLogicComponent$prepareSaving$1", f = "VOApiComponent.kt", l = {602}, m = "invokeSuspend")
/* renamed from: X.5F8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C5F9 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C5T6 LJLJJI;
    public final /* synthetic */ AudioRecorderParam LJLJJL;
    public final /* synthetic */ AudioRecorderParam LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F8(C5F9 c5f9, boolean z, C5T6 c5t6, AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, InterfaceC67352kd<? super C5F8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c5f9;
        this.LJLJI = z;
        this.LJLJJI = c5t6;
        this.LJLJJL = audioRecorderParam;
        this.LJLJJLL = audioRecorderParam2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5F8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            XIA xia = C78613UtF.LIZJ;
            C5F5 c5f5 = new C5F5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c5f5, this) == enumC58928NAu) {
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
