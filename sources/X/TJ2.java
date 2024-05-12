package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postHotStickers$1", f = "DefaultStickerSource.kt", l = {420}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TJ2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74418TIo LJLILLLLZI;
    public final /* synthetic */ FetchHotEffectResponse LJLJI;
    public final /* synthetic */ C74413TIj LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TJ2(C74418TIo c74418TIo, FetchHotEffectResponse fetchHotEffectResponse, C74413TIj c74413TIj, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74418TIo;
        this.LJLJI = fetchHotEffectResponse;
        this.LJLJJI = c74413TIj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new TJ2(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            List<Effect> LLJILJILJ = ORZ.LLJILJILJ(this.LJLJI.getEffects());
            this.LJLILLLLZI.LJIJJ.getValue().LIZJ("", LLJILJILJ);
            this.LJLJI.setEffects(LLJILJILJ);
            List<Effect> collection = this.LJLJI.getCollection();
            if (collection != null && !collection.isEmpty()) {
                this.LJLILLLLZI.LJII(this.LJLJI.getCollection());
            }
            XIF xif = EXX.LIZ;
            TJ4 tj4 = new TJ4(this, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, tj4, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
