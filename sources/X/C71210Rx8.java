package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.shopbag.PublishAtmosphereTag;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$onMessage$4$params$1", f = "ECAudienceWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rx8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71210Rx8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ AtmosphereTagInfo LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71210Rx8(AtmosphereTagInfo atmosphereTagInfo, InterfaceC67352kd<? super C71210Rx8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = atmosphereTagInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71210Rx8(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            return C75792yF.LIZJ(new PublishAtmosphereTag(this.LJLIL));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
