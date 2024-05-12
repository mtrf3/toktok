package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class AXW {
    public static final java.util.Map<Class, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(Context context, Class<T> cls) {
        final Context LLLLL;
        if (context == null || (LLLLL = C16880lQ.LLLLL(context)) == null || !cls.isInterface() || !InterfaceC26386AXe.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null || !(t instanceof C81033Fz)) {
            T t2 = (T) new InterfaceC26386AXe(LLLLL) { // from class: X.3Fz
                public final SharedPreferences LIZ;

                @Override // X.InterfaceC26386AXe
                public final void LIZ() {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    edit.putBoolean("shouldCleanEffectsAtFirstLaunch", false);
                    edit.apply();
                }

                @Override // X.InterfaceC26386AXe
                public final void LIZIZ() {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    edit.putBoolean("isCheckContentLanguageDialogWhenFirstLaunch", true);
                    edit.apply();
                }

                @Override // X.InterfaceC26386AXe
                public final long LIZJ() {
                    return this.LIZ.getLong("cleanEffectsLastTime", 0L);
                }

                @Override // X.InterfaceC26386AXe
                public final boolean LIZLLL() {
                    return this.LIZ.getBoolean("secondTabLastLandFollowTab", false);
                }

                @Override // X.InterfaceC26386AXe
                public final void LJFF() {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    edit.putString("hasClickActivityDot", "true");
                    edit.apply();
                }

                @Override // X.InterfaceC26386AXe
                public final boolean LJI() {
                    return this.LIZ.getBoolean("isCheckContentLanguageDialogWhenFirstLaunch", false);
                }

                @Override // X.InterfaceC26386AXe
                public final boolean LJIIIIZZ() {
                    return this.LIZ.getBoolean("shouldCleanEffectsAtFirstLaunch", true);
                }

                @Override // X.InterfaceC26386AXe
                public final String LJIIJ() {
                    return this.LIZ.getString("hasClickActivityDot", "");
                }

                @Override // X.InterfaceC26386AXe
                public final String LJIIJJI() {
                    return this.LIZ.getString("unloginContentLanguage", "");
                }

                @Override // X.InterfaceC26386AXe
                public final boolean LJIIL() {
                    return this.LIZ.getBoolean("hasShowUnloginContentLanguageDialog", false);
                }

                {
                    this.LIZ = F9J.LIZIZ(LLLLL, 0, "MainTabPreferences");
                }

                @Override // X.InterfaceC26386AXe
                public final void LJ(long j) {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    edit.putLong("cleanEffectsLastTime", j);
                    edit.apply();
                }

                @Override // X.InterfaceC26386AXe
                public final void LJII(String str) {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    edit.putString("unloginContentLanguage", str);
                    edit.apply();
                }

                @Override // X.InterfaceC26386AXe
                public final void LJIIIZ(boolean z) {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    edit.putBoolean("hasShowUnloginContentLanguageDialog", z);
                    edit.apply();
                }
            };
            concurrentHashMap.put(cls, t2);
            return t2;
        }
        return t;
    }
}
