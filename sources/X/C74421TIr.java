package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postSearchUpdate$1", f = "DefaultStickerSource.kt", l = {398}, m = "invokeSuspend")
/* renamed from: X.TIr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74421TIr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74418TIo LJLILLLLZI;
    public final /* synthetic */ SearchEffectResponseV2 LJLJI;
    public final /* synthetic */ C74413TIj LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74421TIr(C74418TIo c74418TIo, SearchEffectResponseV2 searchEffectResponseV2, C74413TIj c74413TIj, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74418TIo;
        this.LJLJI = searchEffectResponseV2;
        this.LJLJJI = c74413TIj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74421TIr(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<Effect> arrayList;
        List<Effect> bindEffects;
        List<Effect> collectionList;
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
            SearchEffectModel data = this.LJLJI.getData();
            if (data == null || (arrayList = data.getEffectList()) == null) {
                arrayList = new ArrayList<>();
            }
            List<Effect> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            this.LJLILLLLZI.LJIJJ.getValue().LIZJ("", LLJILJILJ);
            SearchEffectModel data2 = this.LJLJI.getData();
            if (data2 != null) {
                data2.setEffectList(LLJILJILJ);
            }
            SearchEffectModel data3 = this.LJLJI.getData();
            if (data3 != null && (collectionList = data3.getCollectionList()) != null) {
                this.LJLILLLLZI.LJII(collectionList);
            }
            SearchEffectModel data4 = this.LJLJI.getData();
            if (data4 != null && (bindEffects = data4.getBindEffects()) != null) {
                this.LJLILLLLZI.LJIIL(bindEffects);
            }
            XIF xif = EXX.LIZ;
            C74422TIs c74422TIs = new C74422TIs(this, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c74422TIs, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
