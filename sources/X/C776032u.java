package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.search.data.api.IMSearchSuggestedApi;
import com.ss.android.ugc.aweme.im.sdk.search.data.api.IMSearchSuggestedResponse;
import com.ss.android.ugc.aweme.im.sdk.search.data.api.SearchDoc;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.SuggestedContactDataSource$getLatestSuggestedContact$2", f = "SuggestedContactDataSource.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.32u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C776032u extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends SearchDoc>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C776532z LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C776032u(C776532z c776532z, InterfaceC67352kd<? super C776032u> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c776532z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C776032u(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends SearchDoc>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        List<SearchDoc> list;
        Integer num;
        String str;
        Integer num2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                IMSearchSuggestedApi.LIZ.getClass();
                IMSearchSuggestedApi iMSearchSuggestedApi = (IMSearchSuggestedApi) RetrofitFactory.LIZLLL().LIZ(C30Y.LIZIZ).LJFF().LIZ.LIZ(IMSearchSuggestedApi.class);
                this.LJLIL = 1;
                obj = iMSearchSuggestedApi.getIMSearchSuggested(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (IMSearchSuggestedResponse) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C776532z c776532z = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            IMSearchSuggestedResponse iMSearchSuggestedResponse = (IMSearchSuggestedResponse) LIZ;
            C98453th LIZIZ = c776532z.LIZIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("latest doc size ");
            List<SearchDoc> list2 = iMSearchSuggestedResponse.docList;
            if (list2 != null) {
                num = new Integer(list2.size());
            } else {
                num = null;
            }
            LIZ2.append(num);
            LIZ2.append(" logid ");
            BaseResponse.ServerTimeExtra serverTimeExtra = iMSearchSuggestedResponse.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZIZ.LIZ(X1D.LIZIZ(LIZ2));
            C98453th LIZIZ2 = c776532z.LIZIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("latest doc size ");
            List<SearchDoc> list3 = iMSearchSuggestedResponse.docList;
            if (list3 != null) {
                num2 = new Integer(list3.size());
            } else {
                num2 = null;
            }
            LIZ3.append(num2);
            LIZ3.append(' ');
            LIZ3.append(C776232w.LIZ(iMSearchSuggestedResponse.docList));
            LIZIZ2.LIZ(X1D.LIZIZ(LIZ3));
        }
        C776532z c776532z2 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            c776532z2.LIZIZ().LIZLLL(m10exceptionOrNullimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        IMSearchSuggestedResponse iMSearchSuggestedResponse2 = (IMSearchSuggestedResponse) LIZ;
        if (iMSearchSuggestedResponse2 == null || (list = iMSearchSuggestedResponse2.docList) == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }
}
