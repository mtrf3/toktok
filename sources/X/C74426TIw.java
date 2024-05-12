package X;

import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$2", f = "DefaultStickerSource.kt", l = {378}, m = "invokeSuspend")
/* renamed from: X.TIw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74426TIw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C74418TIo LJLJI;
    public final /* synthetic */ PanelInfoModel LJLJJI;
    public final /* synthetic */ C74413TIj LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74426TIw(C74418TIo c74418TIo, PanelInfoModel panelInfoModel, C74413TIj c74413TIj, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c74418TIo;
        this.LJLJJI = panelInfoModel;
        this.LJLJJL = c74413TIj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C74426TIw c74426TIw = new C74426TIw(this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
        c74426TIw.LJLIL = obj;
        return c74426TIw;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.XKn] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = XKX.LIZIZ(interfaceC70422pa, null, null, new C74425TIv(this, null), 3);
            XIF xif = EXX.LIZ;
            C74427TIx c74427TIx = new C74427TIx(this, c68322mC, null);
            this.LJLILLLLZI = 1;
            if (XKX.LJI(xif, c74427TIx, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
