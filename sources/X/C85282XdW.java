package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM$getRequestPopupEnable$result$1", f = "PoiPublishExtensionVM.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.XdW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85282XdW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super PoiSearchApi.PopupEnableResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ PoiPublishExtensionVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85282XdW(PoiPublishExtensionVM poiPublishExtensionVM, InterfaceC67352kd<? super C85282XdW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = poiPublishExtensionVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85282XdW(this.LJLILLLLZI, interfaceC67352kd);
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
            C84661XKn c84661XKn = this.LJLILLLLZI.LJLJJLL;
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
        PoiPublishExtensionVM poiPublishExtensionVM = this.LJLILLLLZI;
        long currentTimeMillis = System.currentTimeMillis();
        PoiPublishExtensionVM poiPublishExtensionVM2 = this.LJLILLLLZI;
        poiPublishExtensionVM.LJLJLJ = currentTimeMillis - poiPublishExtensionVM2.LJLJL;
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "network";
        m3z.LIZ(poiPublishExtensionVM2.LJLJLJ);
        m3z.LIZIZ(2L);
        C56178M3a.LIZ(m3z);
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super PoiSearchApi.PopupEnableResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
