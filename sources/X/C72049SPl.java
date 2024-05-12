package X;

import com.ss.android.ugc.tiktok.tpsc.data.effectcount.PrivacyUserEffectCountApi;

/* renamed from: X.SPl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72049SPl<T> implements InterfaceC64592gB {
    public static final C72049SPl<T> LJLIL = new C72049SPl<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PrivacyUserEffectCountApi.PrivacyUserEffectCountResp privacyUserEffectCountResp = (PrivacyUserEffectCountApi.PrivacyUserEffectCountResp) obj;
        if (privacyUserEffectCountResp.status_code != 0) {
            return;
        }
        C72044SPg.LIZ(privacyUserEffectCountResp.interactionVideoCount);
        C72044SPg.LIZIZ(privacyUserEffectCountResp.noPAControlSettings);
    }
}
