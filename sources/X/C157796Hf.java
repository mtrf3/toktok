package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextMgr$effectTextDownloadMgr$2$1", f = "EffectTextMgr.kt", l = {63}, m = "invokeSuspend")
/* renamed from: X.6Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157796Hf extends AbstractC65782Prm implements InterfaceC88471Ynr<C157776Hd, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C157766Hc LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157796Hf(C157766Hc c157766Hc, InterfaceC67352kd<? super C157796Hf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c157766Hc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C157796Hf c157796Hf = new C157796Hf(this.LJLJI, interfaceC67352kd);
        c157796Hf.LJLILLLLZI = obj;
        return c157796Hf;
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
            C157776Hd c157776Hd = (C157776Hd) this.LJLILLLLZI;
            C157766Hc c157766Hc = this.LJLJI;
            ActivityC45651qj activityC45651qj = c157766Hc.LIZ;
            List<C157916Hr> list = c157766Hc.LJI;
            this.LJLIL = 1;
            c157776Hd.getClass();
            if (XKX.LJI(C78613UtF.LIZJ, new C157856Hl(c157776Hd, list, activityC45651qj, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C157776Hd c157776Hd, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c157776Hd, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
