package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7K {
    public KidsComplianceSettings LIZ;
    public final Keva LIZIZ;
    public KidsComplianceSettings LIZJ;

    public final KidsComplianceSettings LIZ() {
        KidsComplianceSettings kidsComplianceSettings = this.LIZJ;
        if (kidsComplianceSettings == null) {
            KidsComplianceSettings kidsComplianceSettings2 = this.LIZ;
            if (kidsComplianceSettings2 != null) {
                return kidsComplianceSettings2;
            }
            String string = this.LIZIZ.getString("cached_setting", "");
            o.LJIIIIZZ(string, "keva.getString(CACHED_SETTING, \"\")");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.LIZ = (KidsComplianceSettings) new Gson().LJI(string, KidsComplianceSettings.class);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            return this.LIZ;
        }
        return kidsComplianceSettings;
    }

    public J7K() {
        Keva repo = Keva.getRepo("compliance_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZIZ = repo;
    }
}
