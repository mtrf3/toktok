package X;

import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;

/* renamed from: X.I0a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45908I0a {
    public static void LIZ(InterfaceC45959I1z interfaceC45959I1z) {
        H78.LIZ("start download aec model");
        String audioAECModelName = TEEffectUtils.getAudioAECModelName();
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioAECModel"}, C113554cx.LJJLIIIIJ(new OSZ("AudioAECModel", C47261Igj.LJJIJIL(audioAECModelName))), new I2N(audioAECModelName, interfaceC45959I1z));
    }
}
