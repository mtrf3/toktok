package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$1$1$3$list$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.TIq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74420TIq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends EffectCategoryModel>>, Object> {
    public final /* synthetic */ C74419TIp LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74420TIq(InterfaceC67352kd interfaceC67352kd, C74419TIp c74419TIp) {
        super(2, interfaceC67352kd);
        this.LJLIL = c74419TIp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74420TIq(completion, this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends EffectCategoryModel>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C30581Hy.LJIILJJIL((C74418TIo) this.LJLIL.LJLJJI.l0);
    }
}
