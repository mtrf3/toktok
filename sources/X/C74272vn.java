package X;

import com.ss.android.ugc.aweme.actionai.action.data.AutoCutFrameOutPut;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.bot.frame.autocut.AutoCutFrameExtractManager$startAutoCutFrameExtractJobAsync$1", f = "AutoCutFrameExtractManager.kt", l = {65}, m = "invokeSuspend")
/* renamed from: X.2vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74272vn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74282vo LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74272vn(C74282vo c74282vo, String str, InterfaceC67352kd<? super C74272vn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74282vo;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74272vn(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C74282vo c74282vo = this.LJLILLLLZI;
            c74282vo.LJFF = this.LJLJI;
            XIA xia = C78613UtF.LIZJ;
            C74292vp c74292vp = new C74292vp(c74282vo, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, c74292vp, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AutoCutFrameOutPut autoCutFrameOutPut = (AutoCutFrameOutPut) obj;
        this.LJLILLLLZI.LIZLLL.put(this.LJLJI, autoCutFrameOutPut.getZip_uri());
        return autoCutFrameOutPut.getZip_uri();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
