package X;

import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;

/* renamed from: X.Me6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57290Me6 implements InterfaceC64672gJ<XGX<C57311MeR>> {
    public final /* synthetic */ C57285Me1 LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr LJLILLLLZI;
    public final /* synthetic */ RelationViewVM LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C57311MeR> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Integer num;
        int i;
        Object LJI;
        C38306F1q c38306F1q;
        XGX<C57311MeR> xgx2 = xgx;
        if (xgx2 instanceof XGW) {
            RelationStatus relationStatus = ((C57311MeR) ((XGW) xgx2).LJ).LIZ;
            C57285Me1 c57285Me1 = this.LJLIL;
            RelationStatus copy$default = RelationStatus.copy$default(relationStatus, c57285Me1.LIZ, 0, null, c57285Me1.LIZIZ, null, 22, null);
            InterfaceC88471Ynr interfaceC88471Ynr = this.LJLILLLLZI;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Boolean.TRUE, null);
            }
            RelationViewVM relationViewVM = this.LJLJI;
            C57285Me1 c57285Me12 = this.LJLIL;
            String str = this.LJLJJI;
            relationViewVM.LJLILLLLZI.postValue(new OSZ<>(c57285Me12.LIZ, Boolean.TRUE));
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIJJLI(IMUser.fromUser(c57285Me12.LJIILJJIL));
            String uid = copy$default.getUid();
            int followStatus = copy$default.getFollowStatus();
            if (str == null) {
                str = "";
            }
            C57286Me2.LIZ(followStatus, uid, str);
            if (copy$default.getFollowStatus() == 0) {
                LWM.LIZIZ.LJIIL();
            }
            C74332vt.LIZ(true, Integer.valueOf(copy$default.getFollowStatus()), c57285Me12.LJIILLIIL, c57285Me12.LJFF, null);
            RelationViewVM.gv0(c57285Me12, copy$default, true);
        } else if ((xgx2 instanceof XGV) && !C30581Hy.LJJI(xgx2)) {
            XGV xgv = (XGV) xgx2;
            C38333F2r LIZIZ = C57293Me9.LIZIZ(xgv.LIZLLL);
            InterfaceC88471Ynr interfaceC88471Ynr2 = this.LJLILLLLZI;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(Boolean.FALSE, LIZIZ);
            }
            RelationViewVM relationViewVM2 = this.LJLJI;
            C57285Me1 c57285Me13 = this.LJLIL;
            Throwable th = xgv.LIZLLL;
            relationViewVM2.LJLILLLLZI.postValue(new OSZ<>(c57285Me13.LIZ, Boolean.FALSE));
            RelationDataSource.INSTANCE.get().postValue(new RelationStatus(c57285Me13.LIZ, c57285Me13.LJIIIZ, Integer.valueOf(c57285Me13.LJIIJ), null, c57285Me13.LJIILJJIL, 8, null));
            C38333F2r LIZIZ2 = C57293Me9.LIZIZ(th);
            if (LIZIZ2 != null) {
                num = Integer.valueOf(LIZIZ2.getErrorCode());
            } else {
                num = null;
            }
            C74332vt.LIZ(false, Integer.valueOf(c57285Me13.LJIIIZ), c57285Me13.LJIILLIIL, c57285Me13.LJFF, num);
            RelationStatus relationStatus2 = new RelationStatus(c57285Me13.LIZ, EnumC57435MgR.UNFOLLOW.getValue(), null, null, null, 28, null);
            if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null) {
                i = c38306F1q.getErrorCode();
            } else {
                i = -1;
            }
            relationStatus2.status_code = i;
            RelationViewVM.gv0(c57285Me13, relationStatus2, false);
            if (this.LJLIL.LJIIZILJ && (LJI = XKX.LJI(EXV.LIZ, new C57292Me8(xgx2, null), interfaceC67352kd)) == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI;
            }
        }
        return C76800UCe.LIZ;
    }

    public C57290Me6(C57285Me1 c57285Me1, InterfaceC88471Ynr interfaceC88471Ynr, RelationViewVM relationViewVM, String str) {
        this.LJLIL = c57285Me1;
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = relationViewVM;
        this.LJLJJI = str;
    }
}
