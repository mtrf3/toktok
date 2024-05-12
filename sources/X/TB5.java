package X;

import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TB5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public TB7 LJ;
    public RealtimeCaptionsTranslationResult LJFF;
    public String LJI;
    public final long LJII;
    public Long LJIIIIZZ;
    public TBB LJIIIZ;
    public final AqS162S0100000_12 LJIIJ;

    public final void LIZ(TBB status) {
        int i;
        Integer num;
        Integer num2;
        o.LJIIIZ(status, "status");
        TBB tbb = this.LJIIIZ;
        TBB tbb2 = TBB.CLA_REALTIME_STATUS_REQUESTED;
        if (tbb == tbb2 && status != tbb2) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = Long.valueOf(System.currentTimeMillis() - this.LJII);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("load_status", status.getStatusName());
            String str = this.LIZLLL;
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("group_id", this.LIZ);
            c188727au.LJIIIZ("subtitle_source_lang", this.LIZJ);
            c188727au.LJIIIZ("target_lang", this.LIZIZ);
            c188727au.LJFF(this.LJIIIIZZ, "load_duration_overall");
            RealtimeCaptionsTranslationResult realtimeCaptionsTranslationResult = this.LJFF;
            int i2 = -1;
            if (realtimeCaptionsTranslationResult != null && (num2 = realtimeCaptionsTranslationResult.aiLabTime) != null) {
                i = num2.intValue();
            } else {
                i = -1;
            }
            c188727au.LIZLLL(i, "ai_lab_duration");
            RealtimeCaptionsTranslationResult realtimeCaptionsTranslationResult2 = this.LJFF;
            if (realtimeCaptionsTranslationResult2 != null && (num = realtimeCaptionsTranslationResult2.translationCacheTime) != null) {
                i2 = num.intValue();
            }
            c188727au.LIZLLL(i2, "check_server_cache_duration");
            FMX.LJIIL("subtitle_translation_status", c188727au.LIZ);
        }
        if (this.LJIIIZ.compareTo(status) < 0) {
            this.LJIIIZ = status;
        }
    }

    public TB5(String str, String targetLanguageCode, String str2, String str3, C9B2 c9b2) {
        o.LJIIIZ(targetLanguageCode, "targetLanguageCode");
        this.LIZ = str;
        this.LIZIZ = targetLanguageCode;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = c9b2;
        new AqS162S0100000_12(this, 1086);
        this.LJII = System.currentTimeMillis();
        this.LJIIIZ = TBB.CLA_REALTIME_STATUS_REQUESTED;
        this.LJIIJ = new AqS162S0100000_12(this, 1087);
    }
}
