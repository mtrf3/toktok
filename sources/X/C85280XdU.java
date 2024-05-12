package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionRepository$operator$1$getRequestPopupEnable$result$1", f = "PoiPublishExtensionRepository.kt", l = {113}, m = "invokeSuspend")
/* renamed from: X.XdU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85280XdU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super PoiSearchApi.PopupEnableResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ C85287Xdb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85280XdU(C85287Xdb c85287Xdb, InterfaceC67352kd<? super C85280XdU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c85287Xdb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85280XdU(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn c84661XKn = this.LJLILLLLZI.LIZLLL;
            if (c84661XKn != null) {
                this.LJLIL = 1;
                obj = c84661XKn.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                obj = null;
            }
        }
        C85287Xdb c85287Xdb = this.LJLILLLLZI;
        long currentTimeMillis = System.currentTimeMillis();
        C85287Xdb c85287Xdb2 = this.LJLILLLLZI;
        c85287Xdb.LIZJ = currentTimeMillis - c85287Xdb2.LIZIZ;
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "network";
        m3z.LIZ(c85287Xdb2.LIZJ);
        m3z.LIZIZ(2L);
        C56178M3a.LIZ(m3z);
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super PoiSearchApi.PopupEnableResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
