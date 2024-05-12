package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.ab.NewReleaseMusicConfigModel;

/* loaded from: classes13.dex */
public final class SU1 extends AbstractC65781Prl implements InterfaceC65784Pro<NewReleaseMusicConfigModel> {
    public static final SU1 LJLIL = new SU1();

    public SU1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.music.ab.NewReleaseMusicConfigModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final NewReleaseMusicConfigModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        NewReleaseMusicConfigModel newReleaseMusicConfigModel = SU0.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("new_release_music_config", NewReleaseMusicConfigModel.class, newReleaseMusicConfigModel);
        if (LJIIIIZZ == 0) {
            return newReleaseMusicConfigModel;
        }
        return LJIIIIZZ;
    }
}
