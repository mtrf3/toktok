package X;

import com.ss.android.ugc.aweme.compliance.protection.timelock.api.NightPopupResponse;

/* renamed from: X.Mfv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57403Mfv<T> implements InterfaceC64592gB {
    public static final C57403Mfv<T> LJLIL = new C57403Mfv<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        int i;
        NightPopupResponse nightPopupResponse = (NightPopupResponse) obj;
        if (nightPopupResponse.status_code != 0 || (i = nightPopupResponse.nextTimeStamps) == 0) {
            return;
        }
        C57399Mfr.LIZ = i;
    }
}
