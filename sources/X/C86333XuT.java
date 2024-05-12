package X;

import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import kotlin.jvm.internal.o;

/* renamed from: X.XuT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86333XuT extends AbstractC65781Prl implements InterfaceC65784Pro<PreviewGuideData> {
    public static final C86333XuT LJLIL = new C86333XuT();

    public C86333XuT() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PreviewGuideData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PreviewGuideData previewGuideData = C86332XuS.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "live_preview_guide_style_setting", 31744, PreviewGuideData.class, previewGuideData);
        if (LJIJ == 0) {
            C86332XuS.LIZ.getClass();
        } else {
            previewGuideData = LJIJ;
        }
        o.LJIIIIZZ(previewGuideData, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return previewGuideData;
    }
}
