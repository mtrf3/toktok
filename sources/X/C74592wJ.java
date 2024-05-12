package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.DigitalWellbeingProtectionApi;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.DigitalWellbeingResponse;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeSetting;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2wJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74592wJ {
    public static final DigitalWellbeingProtectionApi LIZ;

    public static void LIZ() {
        LIZ.getDigitalWellbeingSettings().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.2Wb
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ScreenTimeSetting screenTimeSetting;
                Integer num;
                DigitalWellbeingResponse digitalWellbeingResponse = (DigitalWellbeingResponse) obj;
                if (digitalWellbeingResponse.status_code != 0 || (screenTimeSetting = digitalWellbeingResponse.getScreenTimeSetting()) == null || (num = screenTimeSetting.minorUpsell) == null || num.intValue() != 1) {
                    return;
                }
                C2U8.LIZ(new IEvent() { // from class: X.2Wc
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }
                });
            }
        }, new InterfaceC64592gB() { // from class: X.2Wd
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (DigitalWellbeingProtectionApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, DigitalWellbeingProtectionApi.class);
    }
}
