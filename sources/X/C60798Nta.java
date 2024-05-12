package X;

/* renamed from: X.Nta, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60798Nta implements NJZ {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;

    @Override // X.NJZ
    public final void LIZIZ() {
        InterfaceC60812Nto interfaceC60812Nto = this.LIZ.LJLL;
        if (interfaceC60812Nto != null) {
            interfaceC60812Nto.show();
        }
    }

    public C60798Nta(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    @Override // X.NJZ
    public final void LIZ(boolean z) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
        if (z) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLZ.removeAllViews();
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLZ.setVisibility(8);
        } else {
            InterfaceC60812Nto interfaceC60812Nto = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLL;
            if (interfaceC60812Nto == null) {
                return;
            }
            interfaceC60812Nto.hide();
        }
    }
}
