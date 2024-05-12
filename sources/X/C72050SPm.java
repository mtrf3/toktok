package X;

import com.ss.android.ugc.tiktok.tpsc.data.usersettings.PrivacyUserSettingsResponse;

/* renamed from: X.SPm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72050SPm<T> implements InterfaceC64592gB {
    public static final C72050SPm<T> LJLIL = new C72050SPm<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PrivacyUserSettingsResponse privacyUserSettingsResponse = (PrivacyUserSettingsResponse) obj;
        if (privacyUserSettingsResponse.status_code != 0) {
            return;
        }
        C72045SPh.LIZIZ = System.currentTimeMillis();
        C72042SPe.LIZ(privacyUserSettingsResponse);
    }
}
