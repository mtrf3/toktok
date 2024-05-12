package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.HAx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43643HAx extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ IAVInfoService.IGetInfoCallback<int[]> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43643HAx(String str, boolean z, IAVInfoService.IGetInfoCallback iGetInfoCallback) {
        super(0);
        this.LJLIL = iGetInfoCallback;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        IAVInfoService.IGetInfoCallback<int[]> iGetInfoCallback = this.LJLIL;
        String strInVideo = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        o.LJIIIZ(strInVideo, "strInVideo");
        C60903NvH.LJIIJJI().LJIJ();
        int[] iArr = new int[11];
        if (z) {
            VEUtils.VEVideoFileInfo LIZIZ = H8A.LIZIZ(strInVideo);
            if (LIZIZ != null) {
                iArr[0] = LIZIZ.width;
                iArr[1] = LIZIZ.height;
                int i = LIZIZ.rotation;
                iArr[2] = i;
                iArr[3] = i;
                iArr[4] = 0;
                iArr[5] = 0;
                iArr[6] = LIZIZ.bitrate;
                iArr[7] = LIZIZ.fps;
                iArr[8] = LIZIZ.codec;
                iArr[9] = LIZIZ.keyFrameCount;
                iArr[10] = LIZIZ.maxDuration;
            }
        } else {
            C43495H5f.LIZIZ(strInVideo);
        }
        iGetInfoCallback.finish(iArr);
        return C76800UCe.LIZ;
    }
}
