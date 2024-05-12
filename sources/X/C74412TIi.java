package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postCategoryDataUpdate$5$2", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.TIi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74412TIi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;
    public final /* synthetic */ C74418TIo LJLJI;
    public final /* synthetic */ CategoryEffectModel LJLJJI;
    public final /* synthetic */ AqS194S0100000_12 LJLJJL;
    public final /* synthetic */ AqS194S0100000_12 LJLJJLL;
    public final /* synthetic */ AqS178S0100000_12 LJLJL;
    public final /* synthetic */ InterfaceC67352kd LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74412TIi(C68322mC c68322mC, C68322mC c68322mC2, InterfaceC67352kd interfaceC67352kd, C74418TIo c74418TIo, CategoryEffectModel categoryEffectModel, AqS194S0100000_12 aqS194S0100000_12, AqS194S0100000_12 aqS194S0100000_122, AqS178S0100000_12 aqS178S0100000_12, InterfaceC67352kd interfaceC67352kd2, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c68322mC2;
        this.LJLJI = c74418TIo;
        this.LJLJJI = categoryEffectModel;
        this.LJLJJL = aqS194S0100000_12;
        this.LJLJJLL = aqS194S0100000_122;
        this.LJLJL = aqS178S0100000_12;
        this.LJLJLJ = interfaceC67352kd2;
        this.LJLJLLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74412TIi(this.LJLIL, this.LJLILLLLZI, completion, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (((Boolean) ((OSZ) this.LJLIL.element).getSecond()).booleanValue()) {
            ((LiveData) this.LJLJI.LJIJ.getValue()).setValue(Boolean.TRUE);
        }
        this.LJLJI.LJIILLIIL((String) this.LJLILLLLZI.element).setValue(C74413TIj.LIZJ(this.LJLJJI));
        return C76800UCe.LIZ;
    }
}
