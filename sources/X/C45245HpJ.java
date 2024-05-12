package X;

import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloaderParams;
import com.bytedance.ies.nle.editor_jni.NLEResourcesDAVJNI;
import kotlin.jvm.internal.o;

/* renamed from: X.HpJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45245HpJ extends AbstractC65781Prl implements InterfaceC65784Pro<NLEModelDownloader> {
    public static final C45245HpJ LJLIL = new C45245HpJ();

    public C45245HpJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final NLEModelDownloader invoke() {
        C126944yY c126944yY = C172286pU.LIZ;
        if (c126944yY != null) {
            C45246HpK LIZIZ = c126944yY.LJ.LIZIZ();
            NLEModelDownloaderParams nLEModelDownloaderParams = new NLEModelDownloaderParams(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_6(LIZIZ.LJLIL, LIZIZ.LJLILLLLZI, LIZIZ.LJLJI, LIZIZ.LJLJJI, LIZIZ.LJLJJL, LIZIZ.LJLJJLL, LIZIZ.LJLJL, LIZIZ.LJLJLJ, LIZIZ.LJLJLLL, LIZIZ.LJLLI, LIZIZ.LJLLILLLL, LIZIZ.LJLLJ, "", "", "", ""));
            NLEResourcesDAVJNI.NLEModelDownloaderParams_channel_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, LIZIZ.LJLL);
            return new NLEModelDownloader(nLEModelDownloaderParams);
        }
        o.LJIJI("config");
        throw null;
    }
}
