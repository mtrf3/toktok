package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.VoucherApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.ClaimInfo;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.DaInfo;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.couponcard.impl.ECLiveNewUserCouponCardImpl$setClaimOrUse$2", f = "ECLiveNewUserCouponCardImpl.kt", l = {437}, m = "invokeSuspend")
/* renamed from: X.Rva, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71114Rva extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ VoucherInfo LJLJJI;
    public final /* synthetic */ C71113RvZ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71114Rva(VoucherInfo voucherInfo, C71113RvZ c71113RvZ, InterfaceC67352kd<? super C71114Rva> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = voucherInfo;
        this.LJLJJL = c71113RvZ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71114Rva c71114Rva = new C71114Rva(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c71114Rva.LJLJI = obj;
        return c71114Rva;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        long currentTimeMillis;
        long j;
        String str;
        VoucherInfo voucherInfo;
        String str2;
        String str3;
        String LIZ;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    currentTimeMillis = this.LJLIL;
                    interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
                    C141335gf.LIZJ(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj2);
                interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
                currentTimeMillis = System.currentTimeMillis();
                C71117Rvd c71117Rvd = VoucherApi.LIZ;
                String str4 = this.LJLJJI.voucherTypeId;
                Room room = this.LJLJJL.LIZIZ;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                this.LJLJI = interfaceC70422pa;
                this.LJLIL = currentTimeMillis;
                this.LJLILLLLZI = 1;
                c71117Rvd.getClass();
                obj2 = ((VoucherApi) C71117Rvd.LIZIZ.create(VoucherApi.class)).claimVoucher(new VoucherApi.ClaimVoucherRequest(str4, j, 1, false, 1, 1), this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            BaseResponse baseResponse = (BaseResponse) obj2;
            if (!C48841JEv.LJIILLIIL(interfaceC70422pa)) {
                return C76800UCe.LIZ;
            }
            if (baseResponse.getCode() == 0) {
                Activity LJIJJ = C45804HyK.LJIJJ(this.LJLJJL.LJ);
                if (LJIJJ != null) {
                    C71113RvZ c71113RvZ = this.LJLJJL;
                    C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                    ClaimInfo claimInfo = (ClaimInfo) baseResponse.getData();
                    if (claimInfo == null || (LIZ = claimInfo.successMsg) == null) {
                        LIZ = C29822Bn8.LIZ(c71113RvZ.LJ, R.string.f2p, "context.resources.getStr…e_coupon_claimed_success)");
                    }
                    c26045AKb.LJIIIZ(LIZ);
                    c26045AKb.LJIIJ();
                }
                ClaimInfo claimInfo2 = (ClaimInfo) baseResponse.getData();
                if (claimInfo2 != null && (voucherInfo = claimInfo2.voucher) != null) {
                    C71113RvZ c71113RvZ2 = this.LJLJJL;
                    VoucherInfo voucherInfo2 = this.LJLJJI;
                    C71109RvV.LIZLLL(c71113RvZ2.LJFF.LIZJ("author_id"), c71113RvZ2.LJFF.LIZJ("room_id"), voucherInfo.voucherId, true, voucherInfo.voucherTypeId, "", EnumC71217RxF.AUDIENCE.toString(), System.currentTimeMillis() - currentTimeMillis);
                    String LIZJ = c71113RvZ2.LJFF.LIZJ("author_id");
                    String LIZJ2 = c71113RvZ2.LJFF.LIZJ("room_id");
                    String LIZJ3 = c71113RvZ2.LJFF.LIZJ("enter_from_merge");
                    String LIZJ4 = c71113RvZ2.LJFF.LIZJ("enter_method");
                    String LIZJ5 = c71113RvZ2.LJFF.LIZJ("action_type");
                    String LIZJ6 = c71113RvZ2.LJFF.LIZJ("follow_status");
                    String LIZJ7 = c71113RvZ2.LJFF.LIZJ("page_name");
                    String str5 = voucherInfo.voucherId;
                    String str6 = voucherInfo.voucherTypeId;
                    DaInfo LIZ2 = voucherInfo.LIZ();
                    if (LIZ2 != null) {
                        str2 = LIZ2.couponTypeInfo;
                    } else {
                        str2 = null;
                    }
                    C71109RvV.LIZ(LIZJ, LIZJ2, LIZJ3, LIZJ4, LIZJ5, LIZJ6, LIZJ7, str5, str6, str2, true, "");
                    C71118Rve c71118Rve = c71113RvZ2.LJI;
                    c71118Rve.getClass();
                    c71118Rve.LJLILLLLZI = voucherInfo;
                    C71110RvW c71110RvW = c71118Rve.LJLJJL;
                    if (c71110RvW != null) {
                        c71110RvW.LJJLL(voucherInfo, c71118Rve.LJLJI, c71118Rve.LJLJJI);
                    }
                    if (C78857UxB.LJJJIL(voucherInfo.voucherId) && (str3 = voucherInfo.schema) != null) {
                        c71113RvZ2.LIZIZ(voucherInfo2.vapSchemaType, str3, voucherInfo2.voucherTypeId, voucherInfo2.voucherId, voucherInfo2.daInfo);
                    }
                }
            } else {
                C71109RvV.LIZLLL(this.LJLJJL.LJFF.LIZJ("author_id"), this.LJLJJL.LJFF.LIZJ("room_id"), "", false, "", baseResponse.getMessage(), EnumC71217RxF.AUDIENCE.toString(), System.currentTimeMillis() - currentTimeMillis);
                Activity LJIJJ2 = C45804HyK.LJIJJ(this.LJLJJL.LJ);
                if (LJIJJ2 != null) {
                    C26045AKb c26045AKb2 = new C26045AKb(LJIJJ2);
                    c26045AKb2.LJIIIZ(baseResponse.getMessage());
                    c26045AKb2.LJIIJ();
                }
                String LIZJ8 = this.LJLJJL.LJFF.LIZJ("author_id");
                String LIZJ9 = this.LJLJJL.LJFF.LIZJ("room_id");
                String LIZJ10 = this.LJLJJL.LJFF.LIZJ("enter_from_merge");
                String LIZJ11 = this.LJLJJL.LJFF.LIZJ("enter_method");
                String LIZJ12 = this.LJLJJL.LJFF.LIZJ("action_type");
                String LIZJ13 = this.LJLJJL.LJFF.LIZJ("follow_status");
                String LIZJ14 = this.LJLJJL.LJFF.LIZJ("page_name");
                VoucherInfo voucherInfo3 = this.LJLJJI;
                String str7 = voucherInfo3.voucherId;
                String str8 = voucherInfo3.voucherTypeId;
                DaInfo LIZ3 = voucherInfo3.LIZ();
                if (LIZ3 != null) {
                    str = LIZ3.couponTypeInfo;
                } else {
                    str = null;
                }
                C71109RvV.LIZ(LIZJ8, LIZJ9, LIZJ10, LIZJ11, LIZJ12, LIZJ13, LIZJ14, str7, str8, str, false, String.valueOf(baseResponse.getCode()));
            }
            return C76800UCe.LIZ;
        } catch (Exception unused) {
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
