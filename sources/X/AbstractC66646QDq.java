package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QDq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66646QDq {
    public long LIZ;
    public final HybridSettingInitConfig LIZIZ;
    public VMZ LIZJ;
    public String LIZLLL;

    public abstract VMZ LIZ();

    public final VMZ LIZIZ() {
        VMZ vmz = null;
        try {
            if (TextUtils.isEmpty(this.LIZLLL) || this.LIZJ == null) {
                return null;
            }
            VMZ LJFF = VMX.LJFF(this.LIZLLL);
            vmz = this.LIZJ;
            vmz.LIZ = LJFF.LIZ;
            return vmz;
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
            return vmz;
        }
    }

    public AbstractC66646QDq(HybridSettingInitConfig hybridSettingInitConfig) {
        this.LIZIZ = hybridSettingInitConfig;
    }

    public final VMZ LIZJ(String value) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        SharedPreferences sharedPreferences2;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putLong;
        try {
            if (C77123UOp.LJJJJI("errno", new JSONObject(value)) == 200) {
                VMZ LJ = VMX.LJ(value);
                o.LJIIJ(value, "value");
                Application application = C61654OHq.LIZJ;
                if (application != null && (sharedPreferences = C61654OHq.LIZ) != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString("monitor_setting_response", value)) != null) {
                    putString.apply();
                }
                String str = this.LIZIZ.LJ;
                if (!TextUtils.isEmpty(str) && !CardStruct.IStatusCode.DEFAULT.equals(str)) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    this.LIZ = currentTimeMillis;
                    if (application != null && (sharedPreferences2 = C61654OHq.LIZ) != null && (edit2 = sharedPreferences2.edit()) != null && (putLong = edit2.putLong("monitor_setting_response_fetch_time", currentTimeMillis)) != null) {
                        putLong.apply();
                    }
                }
                this.LIZLLL = value;
                this.LIZJ = LJ;
                return LJ;
            }
            String LIZIZ = C61654OHq.LIZIZ();
            if (!C38354F3m.LJ(LIZIZ)) {
                VMZ LJ2 = VMX.LJ(LIZIZ);
                this.LIZLLL = LIZIZ;
                this.LIZJ = LJ2;
                return LJ2;
            }
            return null;
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
            String LIZIZ2 = C61654OHq.LIZIZ();
            if (!C38354F3m.LJ(LIZIZ2)) {
                VMZ LJ3 = VMX.LJ(LIZIZ2);
                this.LIZLLL = LIZIZ2;
                this.LIZJ = LJ3;
                return LJ3;
            }
            return null;
        }
    }
}
