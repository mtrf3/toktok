package X;

import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;

/* loaded from: classes11.dex */
public abstract class NDW {
    public final String LIZ;
    public final InteractiveBrandedEffectInfo LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJ;
    public boolean LJFF;

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJFF() {
    }

    public final boolean LIZ() {
        return this.LJFF;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ() {
        return this.LJ;
    }

    public NDW(String str, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, int i, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        interactiveBrandedEffectInfo = (i2 & 2) != 0 ? null : interactiveBrandedEffectInfo;
        i = (i2 & 4) != 0 ? 0 : i;
        this.LIZ = str;
        this.LIZIZ = interactiveBrandedEffectInfo;
        this.LIZJ = i;
        this.LIZLLL = false;
        this.LJ = null;
        this.LJFF = false;
    }
}
