package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.data.api.FilterKeywordsService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.dmfilter.data.api.FilterKeywordsServiceUtil$uploadKeywords$1", f = "FilterKeywordsServiceUtil.kt", l = {38}, m = "invokeSuspend")
/* renamed from: X.2oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69842oe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public FilterKeywordsService LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69842oe(String str, InterfaceC67352kd<? super C69842oe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69842oe(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Exception e) {
            C34B.LJFF(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            FilterKeywordsService filterKeywordsService = (FilterKeywordsService) C69852of.LIZ.getValue();
            if (filterKeywordsService != null) {
                String str = this.LJLJI;
                this.LJLIL = filterKeywordsService;
                this.LJLILLLLZI = 1;
                obj = filterKeywordsService.setFilterKeywords(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        if (((BaseResponse) obj).status_code == 0) {
            SQM.LIZ().storeBoolean("KeywordsEditedBefore", true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
