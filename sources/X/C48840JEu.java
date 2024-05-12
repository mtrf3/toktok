package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.placediscovery.model.POICategoryApiState;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel$fetchLastPoiCategoryList$1", f = "NearbyCategoryTabViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JEu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48840JEu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NearbyCategoryTabViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48840JEu(NearbyCategoryTabViewModel nearbyCategoryTabViewModel, InterfaceC67352kd<? super C48840JEu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nearbyCategoryTabViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C48840JEu(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        POICategoryApiState pOICategoryApiState;
        C141335gf.LIZJ(obj);
        Keva keva = LJ6.LIZ;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(curUserId);
        LIZ.append('_');
        LIZ.append("nearby_poi_category_list");
        String string = keva.getString(X1D.LIZIZ(LIZ), "");
        if (C78685UuP.LJJJZ(string) && (pOICategoryApiState = (POICategoryApiState) JsonParseUtils.LIZJ(POICategoryApiState.class, string)) != null) {
            this.LJLIL.setState(new AqS175S0100000_9(pOICategoryApiState, 382));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
