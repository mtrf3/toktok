package X;

import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.PreviewData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$showNewUserBubbleIfNeed$1$previewData$1", f = "ECAudienceWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65082gy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super PreviewData>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65082gy(String str, InterfaceC67352kd<? super C65082gy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65082gy(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Object LJII = C27739Aud.LJFF().LJII(this.LJLIL, C65330PkU.LIZJ(C65352Pkq.LJI(PreviewData.class)));
            if (!(LJII instanceof PreviewData)) {
                LJII = null;
            }
            return (PreviewData) LJII;
        } catch (s | Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super PreviewData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
