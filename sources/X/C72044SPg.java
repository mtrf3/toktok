package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.InteractionVideoCount;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.NoPAControlSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.SPg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72044SPg {
    public static final Keva LIZ;
    public static InteractionVideoCount LIZIZ;
    public static NoPAControlSettings LIZJ;

    static {
        Keva repo = Keva.getRepo("privacy_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static void LIZ(InteractionVideoCount interactionVideoCount) {
        if (o.LJ(interactionVideoCount, LIZIZ)) {
            return;
        }
        LIZIZ = interactionVideoCount;
        if (interactionVideoCount == null) {
            Keva keva = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("privacy_user_interaction_video_count_");
            LIZ2.append(C72052SPo.LIZ());
            keva.erase(X1D.LIZIZ(LIZ2));
            return;
        }
        Keva keva2 = LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("privacy_user_interaction_video_count_");
        LIZ3.append(C72052SPo.LIZ());
        keva2.storeString(X1D.LIZIZ(LIZ3), GsonProtectorUtils.toJson(C79146V4k.LJJIIZ(), interactionVideoCount));
    }

    public static void LIZIZ(NoPAControlSettings noPAControlSettings) {
        if (o.LJ(noPAControlSettings, LIZJ)) {
            return;
        }
        LIZJ = noPAControlSettings;
        if (noPAControlSettings == null) {
            Keva keva = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("privacy_user_no_pa_settings_");
            LIZ2.append(C72052SPo.LIZ());
            keva.erase(X1D.LIZIZ(LIZ2));
            return;
        }
        Keva keva2 = LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("privacy_user_no_pa_settings_");
        LIZ3.append(C72052SPo.LIZ());
        keva2.storeString(X1D.LIZIZ(LIZ3), GsonProtectorUtils.toJson(C79146V4k.LJJIIZ(), noPAControlSettings));
    }
}
