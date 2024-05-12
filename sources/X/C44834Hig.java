package X;

import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* renamed from: X.Hig, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44834Hig extends AbstractC29891Fh<InterfaceC44835Hih> implements InterfaceC44835Hih, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final ShortVideoContext LJLILLLLZI;
    public final InterfaceC44835Hih LJLJI;

    private final void LJJLI() {
        VESize LIZLLL = new C44833Hif(this.LJLILLLLZI).LIZLLL(null);
        if (LIZLLL != null) {
            float LIZIZ = C44833Hif.LIZIZ(LIZLLL);
            ShortVideoContext shortVideoContext = this.LJLILLLLZI;
            int i = LIZLLL.width;
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.mVideoWidth = i;
            cameraComponentModel.mVideoHeight = LIZLLL.height;
            shortVideoContext.creativeModel.recordDowngradeModel.resolution = C79146V4k.LJJIJIIJI(LIZLLL);
            this.LJLILLLLZI.creativeModel.recordDowngradeModel.bitrate = Float.valueOf(LIZIZ);
            RecordDowngradeModel recordDowngradeModel = this.LJLILLLLZI.creativeModel.recordDowngradeModel;
            recordDowngradeModel.hasDowngradeBeforeCameraInit = true;
            recordDowngradeModel.enterRecordPageWithProp = true;
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC44835Hih getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C44834Hig(C82622Wbi diContainer, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = this;
        LJJLI();
    }
}
