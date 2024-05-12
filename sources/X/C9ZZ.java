package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.serverpush.service.PushSettingServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$onResume$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZZ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super PushSettings>, Object> {
    public C9ZZ(InterfaceC67352kd<? super C9ZZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZZ(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            return PushSettingServiceImpl.LIZLLL().LIZJ();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super PushSettings> interfaceC67352kd) {
        return new C9ZZ(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
