package com.ss.android.ugc.aweme;

import X.C16880lQ;
import X.C221108m2;
import X.C58096Mr6;
import X.C62822Ol8;
import X.E6Q;
import X.EF7;
import X.EGG;
import X.EGH;
import X.EGI;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.bytedance.keva.Keva;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AutobackupService implements IAutobackupService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(EGI.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EGG.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(EGH.LJLIL);

    public static IAutobackupService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAutobackupService.class, false);
        if (LIZ != null) {
            return (IAutobackupService) LIZ;
        }
        if (C58096Mr6.LJJJLZIJ == null) {
            synchronized (IAutobackupService.class) {
                if (C58096Mr6.LJJJLZIJ == null) {
                    C58096Mr6.LJJJLZIJ = new AutobackupService();
                }
            }
        }
        return C58096Mr6.LJJJLZIJ;
    }

    @Override // com.ss.android.ugc.aweme.IAutobackupService
    public final boolean LIZ() {
        int i;
        if (((SharedPreferences) this.LIZJ.getValue()).getAll().isEmpty()) {
            try {
                i = ((Keva) this.LIZ.getValue()).getInt("prev_data", -1);
            } catch (Exception unused) {
                i = -1;
            }
        } else {
            i = ((SharedPreferences) this.LIZJ.getValue()).getInt("prev_data", -1);
        }
        if (i != -1) {
            if (i == 1) {
                return true;
            }
            return false;
        }
        Map<String, ?> all = ((SharedPreferences) this.LIZIZ.getValue()).getAll();
        o.LJIIIIZZ(all, "autobackupSP.all");
        int i2 = !all.isEmpty() ? 1 : 0;
        ((SharedPreferences) this.LIZJ.getValue()).edit().putInt("prev_data", i2).apply();
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAutobackupService
    public final SharedPreferences LIZIZ() {
        LIZ();
        SharedPreferences autobackupSP = (SharedPreferences) this.LIZIZ.getValue();
        o.LJIIIIZZ(autobackupSP, "autobackupSP");
        return autobackupSP;
    }

    @Override // com.ss.android.ugc.aweme.IAutobackupService
    public final E6Q LJJZZIII() {
        E6Q e6q;
        try {
            Context LIZIZ = EF7.LIZIZ();
            if ((C16880lQ.LLLLLLZ(LIZIZ.getPackageManager(), LIZIZ.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                e6q = E6Q.AVAILABLE;
            } else {
                e6q = E6Q.UNAVAILABLE;
            }
            return e6q;
        } catch (Settings.SettingNotFoundException unused) {
            return E6Q.UNKNOWN;
        }
    }
}
