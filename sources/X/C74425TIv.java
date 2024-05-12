package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$2$resolveCategoryEffect$1", f = "DefaultStickerSource.kt", l = {361, 374}, m = "invokeSuspend")
/* renamed from: X.TIv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74425TIv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CategoryEffectModel>, Object> {
    public CategoryEffectModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C74426TIw LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74425TIv(C74426TIw c74426TIw, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c74426TIw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74425TIv(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CategoryEffectModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, T] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    CategoryEffectModel categoryEffectModel = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    return categoryEffectModel;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C68322mC LIZ = C793239k.LIZ(obj);
            LIZ.element = ORZ.LLJILJILJ(this.LJLJI.LJLJJI.getCategoryList());
            this.LJLJI.LJLJI.LJIL.getValue().LIZJ((List) LIZ.element);
            this.LJLJI.LJLJJI.setCategoryList((List) LIZ.element);
            XIF xif = EXX.LIZ;
            C74428TIy c74428TIy = new C74428TIy(this, LIZ, null);
            this.LJLILLLLZI = 1;
            if (XKX.LJI(xif, c74428TIy, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CategoryEffectModel categoryEffectModel2 = this.LJLJI.LJLJJI.getCategoryEffectModel();
        if (categoryEffectModel2 == null) {
            return null;
        }
        this.LJLJI.LJLJI.LJII(categoryEffectModel2.getCollectEffects());
        this.LJLJI.LJLJI.LJIIL(categoryEffectModel2.getBindEffects());
        java.util.Map<String, List<Effect>> map = this.LJLJI.LJLJI.LJ;
        String categoryKey = categoryEffectModel2.getCategoryKey();
        List<Effect> effects = categoryEffectModel2.getEffects();
        if (effects == null) {
            effects = C61878OQg.INSTANCE;
        }
        map.put(categoryKey, effects);
        o.LJ(categoryEffectModel2.getCategoryKey(), this.LJLJI.LJLJI.LJIIZILJ);
        C74418TIo c74418TIo = this.LJLJI.LJLJI;
        this.LJLIL = categoryEffectModel2;
        this.LJLILLLLZI = 2;
        if (c74418TIo.LJIJI(categoryEffectModel2, false, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return categoryEffectModel2;
    }
}
