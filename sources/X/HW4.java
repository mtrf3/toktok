package X;

import android.app.Application;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.effectmanager.EffectManager;

/* loaded from: classes8.dex */
public final class HW4 extends AbstractC65781Prl implements InterfaceC65784Pro<EffectManager> {
    public static final HW4 LJLIL = new HW4();

    public HW4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final EffectManager invoke() {
        IEffectService effectService = AVServiceImpl.LIZ().effectService();
        if (effectService != null) {
            Application application = C60903NvH.LJ;
            C60903NvH.LJIIJJI().getRegionService();
            InterfaceC84498XEg createEffectPlatform = effectService.createEffectPlatform(application, C44296Ha0.LIZ());
            if (createEffectPlatform != null) {
                return createEffectPlatform.LJLJJLL();
            }
        }
        return null;
    }
}
