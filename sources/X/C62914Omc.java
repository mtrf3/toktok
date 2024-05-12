package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.ss.android.ugc.aweme.compliance.api.model.BanInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Omc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62914Omc {
    public ComplianceSetting LIZ;
    public final Keva LIZIZ;
    public List<BanInfo> LIZJ;
    public Boolean LIZLLL;
    public Integer LJ;
    public Boolean LJFF;
    public String LJI;
    public Integer LJII;
    public ComplianceSetting LJIIIIZZ;
    public Boolean LJIIIZ;
    public Long LJIIJ;

    public final ComplianceSetting LIZ() {
        ComplianceSetting complianceSetting = this.LJIIIIZZ;
        if (complianceSetting == null) {
            ComplianceSetting complianceSetting2 = this.LIZ;
            if (complianceSetting2 != null) {
                return complianceSetting2;
            }
            String string = this.LIZIZ.getString("cached_setting", "");
            o.LJIIIIZZ(string, "keva.getString(CACHED_SETTING, \"\")");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.LIZ = (ComplianceSetting) new Gson().LJI(string, ComplianceSetting.class);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            return this.LIZ;
        }
        return complianceSetting;
    }

    public C62914Omc() {
        Keva repo = Keva.getRepo("compliance_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZIZ = repo;
    }

    public final void LIZIZ(ComplianceSetting complianceSetting) {
        String str;
        this.LJIIIIZZ = complianceSetting;
        a.LJIIJJI().LIZ();
        this.LIZ = complianceSetting;
        if (complianceSetting == null) {
            this.LIZIZ.clear();
            return;
        }
        this.LIZIZ.storeString("cached_setting", GsonProtectorUtils.toJson(new Gson(), complianceSetting));
        AgeGateInfo ageGateInfo = complianceSetting.getAgeGateInfo();
        if (ageGateInfo != null && ageGateInfo.getRegisterAgeGateAction() != 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "api");
        LogPbBean logPb = complianceSetting.getLogPb();
        if (logPb == null || (str = logPb.getImprId()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("log_id", str);
        FMX.LJIIL("no_age_gate_for_registration_error", c188727au.LIZ);
    }
}
