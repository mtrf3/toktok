package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionRepository$operator$1$initRequestPopupEnable$1", f = "PoiPublishExtensionRepository.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ELW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super PoiSearchApi.PopupEnableResponse>, Object> {
    public int LJLIL;

    public ELW(InterfaceC67352kd<? super ELW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ELW(interfaceC67352kd);
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
            C85269XdJ c85269XdJ = PoiSearchApi.LIZ;
            this.LJLIL = 1;
            obj = c85269XdJ.LJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super PoiSearchApi.PopupEnableResponse> interfaceC67352kd) {
        return new ELW(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
