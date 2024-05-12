package X;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KOE implements KOG {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;

    public KOE(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    @Override // X.KOG
    public final void LIZ(boolean z) {
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", z);
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIZILJ("visibilityChange", jSONObject);
        } catch (Exception unused) {
        }
    }
}
