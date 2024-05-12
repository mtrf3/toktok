package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.TikTokResolution;
import kotlin.jvm.internal.o;

/* renamed from: X.RVf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69651RVf extends AbstractC65781Prl implements InterfaceC65784Pro<TikTokResolution.TiktokResolution> {
    public static final C69651RVf LJLIL = new C69651RVf();

    public C69651RVf() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final TikTokResolution.TiktokResolution invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TikTokResolution.TiktokResolution tiktokResolution = TikTokResolution.LIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("tiktok_avatar_editor_resolution", TikTokResolution.TiktokResolution.class, tiktokResolution);
        if (LJIIIIZZ != 0) {
            tiktokResolution = LJIIIIZZ;
        }
        o.LJIIIIZZ(tiktokResolution, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        return tiktokResolution;
    }
}
