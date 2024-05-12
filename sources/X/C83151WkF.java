package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$1$localData$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WkF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83151WkF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<BeautyCategory>>, Object> {
    public final /* synthetic */ C83152WkG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83151WkF(C83152WkG c83152WkG, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c83152WkG;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83151WkF(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<BeautyCategory>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<BeautyCategory> LJIILLIIL = this.LJLIL.LJLILLLLZI.LJJIIZ.LJIILLIIL();
        String str = "";
        if (LJIILLIIL != null) {
            for (BeautyCategory beautyCategory : LJIILLIIL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(beautyCategory.getCategoryResponse().getName());
                str = X1D.LIZIZ(LIZ);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LJT getPanelDataFromLocal: ");
        LIZ2.append(str);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ2));
        if (LJIILLIIL != null) {
            C83146WkA c83146WkA = this.LJLIL.LJLILLLLZI;
            if (!c83146WkA.LJIILLIIL.LJI(c83146WkA.LJJIIZI, LJIILLIIL)) {
                C83175Wkd.LIZIZ("LJT getPanelDataFromLocal: panel not valid, local is null");
                return null;
            }
            return LJIILLIIL;
        }
        return LJIILLIIL;
    }
}
