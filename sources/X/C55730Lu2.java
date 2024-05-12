package X;

import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$2$firstAwemeJobDeferred$1", f = "ECAwemeListModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Lu2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55730Lu2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Aweme>, Object> {
    public final /* synthetic */ M89 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55730Lu2(M89 m89, InterfaceC67352kd<? super C55730Lu2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = m89;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55730Lu2(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        try {
            M89 m89 = this.LJLIL;
            if (m89 == null || (str = m89.getAid()) == null) {
                str = "";
            }
            if (C78857UxB.LJJJIL(str)) {
                return DetailApiProxyImpl.LIZIZ().LIZ(str);
            }
        } catch (Throwable th) {
            C36746EbW.LIZ(6, th.getMessage());
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Aweme> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
