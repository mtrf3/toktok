package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$dealTrendingDataChanged$1", f = "SearchStickerViewModel.kt", l = {396}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TFA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchStickerViewModel LJLILLLLZI;
    public final /* synthetic */ CategoryEffectModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TFA(SearchStickerViewModel searchStickerViewModel, CategoryEffectModel categoryEffectModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchStickerViewModel;
        this.LJLJI = categoryEffectModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new TFA(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.util.ArrayList] */
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
            C68322mC LIZ = C793239k.LIZ(obj);
            List<Effect> LLILLL = ORZ.LLILLL(this.LJLJI.getEffects(), 5);
            ?? arrayList = new ArrayList(C32I.LJJL(LLILLL, 10));
            for (Effect effect : LLILLL) {
                Parcel obtain = Parcel.obtain();
                o.LJIIIIZZ(obtain, "this");
                effect.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                com.ss.android.ugc.effectmanager.effect.model.Effect createFromParcel = com.ss.android.ugc.effectmanager.effect.model.Effect.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                arrayList.add(createFromParcel);
            }
            LIZ.element = arrayList;
            XIF xif = EXX.LIZ;
            TF9 tf9 = new TF9(this, LIZ, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, tf9, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
