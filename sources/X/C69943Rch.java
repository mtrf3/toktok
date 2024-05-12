package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model.PdpV2EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS54S0110000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel$favoriteProduct$1", f = "PdpMainViewModel.kt", l = {403, 411, 433, 456}, m = "invokeSuspend")
/* renamed from: X.Rch, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69943Rch extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpMainViewModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69943Rch(PdpMainViewModel pdpMainViewModel, InterfaceC71003Rtn interfaceC71003Rtn, boolean z, View view, InterfaceC67352kd<? super C69943Rch> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpMainViewModel;
        this.LJLJI = interfaceC71003Rtn;
        this.LJLJJI = z;
        this.LJLJJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69943Rch(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String catalogId;
        String catalogId2;
        Response response;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        C141335gf.LIZJ(obj);
                        return C76800UCe.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                response = (Response) obj;
            } else {
                C141335gf.LIZJ(obj);
                response = (Response) obj;
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.setState(C69944Rci.LJLIL);
            InterfaceC71003Rtn interfaceC71003Rtn = this.LJLJI;
            if (interfaceC71003Rtn != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70972RtI(), new AqS16S0010000_12(this.LJLJJI, 16));
            }
            String str = "";
            if (this.LJLJJI) {
                C37228EjI c37228EjI = FavoriteApi.LIZ;
                String LIZIZ = this.LJLILLLLZI.iv0().LIZIZ();
                int LIZ = this.LJLILLLLZI.iv0().LIZ();
                PdpV2EnterParams pdpV2EnterParams = this.LJLILLLLZI.iv0().LJLIL;
                if (pdpV2EnterParams != null && (catalogId2 = pdpV2EnterParams.getCatalogId()) != null) {
                    str = catalogId2;
                }
                FavoriteInfo favoriteInfo = new FavoriteInfo(LIZIZ, LIZ, null, null, str, 12, null);
                this.LJLIL = 1;
                obj = c37228EjI.LIZ(favoriteInfo, null, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                response = (Response) obj;
            } else {
                C37228EjI c37228EjI2 = FavoriteApi.LIZ;
                String LIZIZ2 = this.LJLILLLLZI.iv0().LIZIZ();
                int LIZ2 = this.LJLILLLLZI.iv0().LIZ();
                PdpV2EnterParams pdpV2EnterParams2 = this.LJLILLLLZI.iv0().LJLIL;
                if (pdpV2EnterParams2 != null && (catalogId = pdpV2EnterParams2.getCatalogId()) != null) {
                    str = catalogId;
                }
                FavoriteInfo favoriteInfo2 = new FavoriteInfo(LIZIZ2, LIZ2, null, null, str, 12, null);
                this.LJLIL = 2;
                obj = c37228EjI2.LIZIZ(favoriteInfo2, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                response = (Response) obj;
            }
        }
        this.LJLILLLLZI.setState(C69945Rcj.LJLIL);
        InterfaceC71003Rtn interfaceC71003Rtn2 = this.LJLJI;
        if (interfaceC71003Rtn2 != null) {
            C78946Uyc.LJJII(interfaceC71003Rtn2, new C70965RtB(), new AqS54S0110000_12(this.LJLJJI, (boolean) response, (Response<Object>) 14));
        }
        if (response != null && response.isCodeOK()) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C27717AuH c27717AuH = new C27717AuH(this.LJLJJI, this.LJLILLLLZI, this.LJLJJL, null);
            this.LJLIL = 3;
            if (XKX.LJI(abstractC78621UtN, c27717AuH, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        } else {
            AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
            C72192sR c72192sR = new C72192sR(this.LJLJJL, null, this.LJLJJI);
            this.LJLIL = 4;
            if (XKX.LJI(abstractC78621UtN2, c72192sR, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
