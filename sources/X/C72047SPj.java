package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.SPj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72047SPj {
    public static final Keva LIZ;
    public static PrivacySettingsRestriction LIZIZ;
    public static String LIZJ;
    public static java.util.Map<String, PrivacySettingsAgreementRecord> LIZLLL;
    public static String LJ;
    public static java.util.Map<String, PrivacySettingsAgreementRecord> LJFF;

    static {
        Keva repo = Keva.getRepo("compliance_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static String LIZ(String str) {
        String LIZ2 = C72052SPo.LIZ();
        if (LIZ2 == null || LIZ2.length() == 0) {
            return str;
        }
        return i0.LJFF(str, LIZ2);
    }
}
