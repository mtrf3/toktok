package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.internal.o;

/* renamed from: X.SPn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72051SPn {
    public static String LIZ;
    public static final Keva LIZIZ;
    public static final PrivacySettingsRestrictionItem LIZJ;
    public static PrivacySettingsRestrictionItem LIZLLL;

    static {
        Keva repo = Keva.getRepo("compliance_privacy_group_chat_cache");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZIZ = repo;
        LIZJ = new PrivacySettingsRestrictionItem(2, 0, null, 0, 0, 30, null);
    }
}
