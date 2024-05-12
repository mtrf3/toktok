package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.AAf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25789AAf implements EUJ {
    public static final C25789AAf LJLIL = new C25789AAf();

    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (settings.emptyProfileMission > repo.getInt(C226788vC.LIZ("post_guide_count_follow_from_recommend"), 0)) {
            repo.storeInt(C226788vC.LIZ("post_guide_count_follow_from_recommend"), settings.emptyProfileMission);
        }
        C77266UUc.LIZIZ.LJJII(settings.contactStatus);
    }
}
