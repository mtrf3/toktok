package X;

import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.BasicInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.IconCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.repo.MallReddotApi;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM$compareAndReportShow$1", f = "CustomDotVM.kt", l = {411, 411}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EC0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CustomDotVM LJLILLLLZI;
    public final /* synthetic */ IconCfg LJLJI;
    public final /* synthetic */ IconCfg LJLJJI;
    public final /* synthetic */ CountCfg LJLJJL;
    public final /* synthetic */ CountCfg LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC0(CustomDotVM customDotVM, IconCfg iconCfg, IconCfg iconCfg2, CountCfg countCfg, CountCfg countCfg2, boolean z, InterfaceC67352kd<? super EC0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = customDotVM;
        this.LJLJI = iconCfg;
        this.LJLJJI = iconCfg2;
        this.LJLJJL = countCfg;
        this.LJLJJLL = countCfg2;
        this.LJLJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EC0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<BasicInfo> list;
        List<BasicInfo> list2;
        List<BasicInfo> list3;
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
                return C76800UCe.LIZ;
            }
        } else {
            C141335gf.LIZJ(obj);
            CustomDotVM customDotVM = this.LJLILLLLZI;
            IconCfg iconCfg = this.LJLJI;
            IconCfg iconCfg2 = this.LJLJJI;
            CountCfg countCfg = this.LJLJJL;
            CountCfg countCfg2 = this.LJLJJLL;
            boolean z = this.LJLJL;
            ArrayList arrayList = new ArrayList();
            List<BasicInfo> list4 = null;
            if (iconCfg != null) {
                list = iconCfg.getBasicInfoList();
            } else {
                list = null;
            }
            if (iconCfg2 == null) {
                list2 = null;
            } else {
                list2 = iconCfg2.getBasicInfoList();
            }
            List<BasicInfo> jv0 = customDotVM.jv0(list, list2);
            if (jv0 != null) {
                arrayList.addAll(jv0);
            }
            if (countCfg != null) {
                list3 = countCfg.getBasicInfoList();
            } else {
                list3 = null;
            }
            if (countCfg2 != null) {
                list4 = countCfg2.getBasicInfoList();
            }
            List<BasicInfo> jv02 = customDotVM.jv0(list3, list4);
            if (jv02 != null) {
                arrayList.addAll(jv02);
            }
            if (!arrayList.isEmpty()) {
                MallReddotApi.LIZ.getClass();
                MallReddotApi mallReddotApi = EC3.LIZIZ;
                List<BasicInfo> gv0 = customDotVM.gv0(arrayList);
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                CustomDotUpdateParams customDotUpdateParams = new CustomDotUpdateParams(1, gv0, 0, i, customDotVM.LJLLJ);
                this.LJLIL = 2;
                if (mallReddotApi.updateUserMsg(customDotUpdateParams, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
