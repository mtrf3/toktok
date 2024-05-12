package X;

import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver$checkNotice$3$1", f = "FBVNoticeObserver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.OoD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63013OoD extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super FBVCheckResponse>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FBVNoticeObserver LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63013OoD(FBVNoticeObserver fBVNoticeObserver, InterfaceC67352kd<? super C63013OoD> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = fBVNoticeObserver;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        H7B.LIZIZ("FBVNoticeObserver", "checkFBVStatus Error cause");
        InterfaceC63015OoF interfaceC63015OoF = this.LJLIL.LJLJLJ;
        if (interfaceC63015OoF != null) {
            interfaceC63015OoF.LIZ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super FBVCheckResponse> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C63013OoD(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
