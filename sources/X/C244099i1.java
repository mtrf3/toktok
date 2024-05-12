package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingEntry;

/* renamed from: X.9i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244099i1 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C244169i8.LJLIL);

    public static final ThirdPartyBindingEntry LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            ThirdPartyBindingEntry thirdPartyBindingEntry = (ThirdPartyBindingEntry) SettingsManager.LJII("third_party_binding", ThirdPartyBindingEntry.class);
            if (thirdPartyBindingEntry != null) {
                return thirdPartyBindingEntry;
            }
        } catch (Throwable unused) {
        }
        return (ThirdPartyBindingEntry) LIZ.getValue();
    }
}
