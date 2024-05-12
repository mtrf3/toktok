package X;

import com.bytedance.ies.smartmovie.jni.DavinciResourceConfig;
import com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate;
import com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate;
import com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate;
import com.bytedance.ies.smartmovie.jni.ITosDelegate;
import com.bytedance.ies.smartmovie.jni.SmartMovieConfig;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.keva.Keva;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import defpackage.e1;

/* renamed from: X.Hny, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45162Hny extends AbstractC65781Prl implements InterfaceC65784Pro<SmartMovieConfig> {
    public static final C45162Hny LJLIL = new C45162Hny();

    public C45162Hny() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SmartMovieConfig invoke() {
        Object LIZ;
        long j;
        if (C133625Mg.LIZ()) {
            try {
                C5N8.LIZJ.LIZ();
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
        }
        C45161Hnx.LJIIJ = true;
        if (e1.LIZ(31744, "autocut_pre_init_in_album", true, false)) {
            Keva repo = Keva.getRepo("repo_auto_cut");
            if (!repo.getBoolean("is_auto_cut_inited", false)) {
                repo.storeBoolean("is_auto_cut_inited", true);
            }
        }
        DavinciResource davinciResource = DavinciResource.INSTANCE;
        davinciResource.setHttpClient(C45104Hn2.LIZ());
        davinciResource.setLogger((DAVLoggerListener) C45161Hnx.LJIIIIZZ.getValue());
        davinciResource.setLogLevel(DAVLogLevel.LEVEL_DEBUG);
        davinciResource.setUnZipper((DAVUnZipFunc) C45161Hnx.LJIIIZ.getValue());
        SmartMovieConfig smartMovieConfig = new SmartMovieConfig();
        INLEModelNetworkDelegate iNLEModelNetworkDelegate = (INLEModelNetworkDelegate) C45161Hnx.LIZIZ.getValue();
        SmartMovieJniJNI.SmartMovieConfig_nleModelNetworkDelegate_set(smartMovieConfig.LIZ, smartMovieConfig, INLEModelNetworkDelegate.getCPtr(iNLEModelNetworkDelegate), iNLEModelNetworkDelegate);
        IMusicNetworkDelegate iMusicNetworkDelegate = (IMusicNetworkDelegate) C45161Hnx.LIZJ.getValue();
        SmartMovieJniJNI.SmartMovieConfig_musicNetworkDelegate_set(smartMovieConfig.LIZ, smartMovieConfig, IMusicNetworkDelegate.getCPtr(iMusicNetworkDelegate), iMusicNetworkDelegate);
        ITosDelegate iTosDelegate = (ITosDelegate) C45161Hnx.LIZLLL.getValue();
        SmartMovieJniJNI.SmartMovieConfig_tosDelegate_set(smartMovieConfig.LIZ, smartMovieConfig, ITosDelegate.getCPtr(iTosDelegate), iTosDelegate);
        IMetaInfoDelegate iMetaInfoDelegate = (IMetaInfoDelegate) C45161Hnx.LJ.getValue();
        SmartMovieJniJNI.SmartMovieConfig_metaInfoDelegate_set(smartMovieConfig.LIZ, smartMovieConfig, IMetaInfoDelegate.getCPtr(iMetaInfoDelegate), iMetaInfoDelegate);
        DavinciResourceConfig davinciResourceConfig = (DavinciResourceConfig) C45161Hnx.LJFF.getValue();
        long j2 = smartMovieConfig.LIZ;
        if (davinciResourceConfig == null) {
            j = 0;
        } else {
            j = davinciResourceConfig.LIZ;
        }
        SmartMovieJniJNI.SmartMovieConfig_davinciConfig_set(j2, smartMovieConfig, j, davinciResourceConfig);
        return smartMovieConfig;
    }
}
