package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import fjb.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager$getAwemeCacheItem$2", f = "AwemeFetchManager.kt", l = {248}, m = "invokeSuspend")
/* renamed from: X.2oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69702oQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C69802oa>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69702oQ(String str, InterfaceC67352kd<? super C69702oQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69702oQ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AwemeStatusBean awemeStatusBean;
        Aweme aweme;
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
                String str = this.LJLILLLLZI;
                ConcurrentHashMap<String, C33R<InterfaceC69762oW>> concurrentHashMap = C69732oT.LIZIZ;
                C33R<InterfaceC69762oW> c33r = concurrentHashMap.get(str);
                if (c33r == null) {
                    concurrentHashMap.put(str, V8H.LIZ(C69712oR.LIZ));
                } else {
                    c33r.setValue(C69712oR.LIZ);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(this.LJLILLLLZI);
                LIZ.append(']');
                String LIZIZ = X1D.LIZIZ(LIZ);
                this.LJLIL = 1;
                obj = C30U.LIZIZ(LIZIZ, "chat", this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            AwemeDetailList awemeDetailList = (AwemeDetailList) obj;
            String str2 = this.LJLILLLLZI;
            if (awemeDetailList == null) {
                C69732oT.LJI(str2);
                return null;
            }
            List<AwemeStatusBean> awemeStatus = awemeDetailList.getAwemeStatus();
            if (awemeStatus != null && awemeStatus.size() == 1) {
                awemeStatusBean = (AwemeStatusBean) ListProtector.get(awemeStatus, 0);
            } else {
                awemeStatusBean = null;
            }
            List<Aweme> awemeList = awemeDetailList.getAwemeList();
            if (awemeList != null && awemeList.size() == 1) {
                aweme = (Aweme) ListProtector.get(awemeList, 0);
            } else {
                aweme = null;
            }
            return C69732oT.LJII(str2, awemeStatusBean, aweme);
        } catch (Exception unused) {
            C69732oT.LJI(this.LJLILLLLZI);
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C69802oa> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
