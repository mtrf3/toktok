package X;

import com.ss.android.ugc.aweme.property.CanvasDurationConfig;
import com.ss.android.ugc.aweme.services.external.IAVPhotoModeService;

/* renamed from: X.HUt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44159HUt extends AbstractC65781Prl implements InterfaceC65784Pro<C150335vB> {
    public static final C44159HUt LJLIL = new C44159HUt();

    public C44159HUt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5vB] */
    @Override // X.InterfaceC65784Pro
    public final C150335vB invoke() {
        return new IAVPhotoModeService() { // from class: X.5vB
            @Override // com.ss.android.ugc.aweme.services.external.IAVPhotoModeService
            public final boolean enableSaveSingleImageAsVideo() {
                if (C00F.LIZ(31744, 0, "studio_canvas_to_single_image", true) != 2) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAVPhotoModeService
            public final OSZ<Integer, Integer> getCanvasToVideoDuration() {
                CanvasDurationConfig canvasDurationConfig = C149535tt.LIZ;
                return new OSZ<>(Integer.valueOf(canvasDurationConfig.minDuration), Integer.valueOf(canvasDurationConfig.maxDuration));
            }
        };
    }
}
