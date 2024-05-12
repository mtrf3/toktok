package X;

import com.ss.android.ugc.aweme.prop.experiment.PreLoadBonusH5BannerData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T9N extends AbstractC65781Prl implements InterfaceC65784Pro<PreLoadBonusH5BannerData> {
    public static final T9N LJLIL = new T9N();

    public T9N() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PreLoadBonusH5BannerData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PreLoadBonusH5BannerData preLoadBonusH5BannerData = T9M.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "h5_entrance_config", 31744, PreLoadBonusH5BannerData.class, preLoadBonusH5BannerData);
        if (LJIJ == 0) {
            T9M.LIZ.getClass();
        } else {
            preLoadBonusH5BannerData = LJIJ;
        }
        o.LJIIIIZZ(preLoadBonusH5BannerData, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return preLoadBonusH5BannerData;
    }
}
