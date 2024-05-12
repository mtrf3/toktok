package X;

import com.ss.android.ugc.aweme.creative.compileConfig.ab.SmartSynthesisUploadSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIV extends AbstractC65781Prl implements InterfaceC65784Pro<SmartSynthesisUploadSettings> {
    public static final HIV LJLIL = new HIV();

    public HIV() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SmartSynthesisUploadSettings invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SmartSynthesisUploadSettings smartSynthesisUploadSettings = HIU.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "studio_smart_synthesis_upload_settings", 31744, SmartSynthesisUploadSettings.class, smartSynthesisUploadSettings);
        if (LJIJ != 0) {
            smartSynthesisUploadSettings = LJIJ;
        }
        o.LJIIIIZZ(smartSynthesisUploadSettings, "ABManager.getInstance().…s::class.java) ?: DEFAULT");
        return smartSynthesisUploadSettings;
    }
}
