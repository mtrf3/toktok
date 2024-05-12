package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jwt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50811Jwt extends F9E {
    public final String LJLIL;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public EnumC50808Jwq LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public C50811Jwt(String name, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, EnumC50808Jwq preloadStatus) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(preloadStatus, "preloadStatus");
        this.LJLIL = name;
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJI = preloadStatus;
        this.LJLJJI = false;
    }
}
