package X;

import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes7.dex */
public final class F7F implements F7J {
    @Override // X.F7J
    public final String[] LIZ() {
        F7G.LIZ.getClass();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = F7G.LIZIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("ul_zero_rating_mcc_mnc", String[].class, strArr);
        if (strArr2 == null) {
            return strArr;
        }
        return strArr2;
    }
}
