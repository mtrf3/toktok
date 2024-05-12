package X;

import Y.AfS59S0100000_7;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9T extends C78253UnR {
    public static final /* synthetic */ int LJLJJLL = 0;

    public static void LJII(C43139GwR c43139GwR) {
        InterfaceC139755e7 gyb;
        boolean z;
        float LJJII;
        boolean z2 = true;
        if (!(c43139GwR instanceof C43137GwP)) {
            ExtractFramesModel extractFramesModel = c43139GwR.LJII;
            if (extractFramesModel != null) {
                extractFramesModel.removeLastSegment();
                c43139GwR.LIZLLL.cameraComponentModel.extractFramesModel = extractFramesModel;
            }
            String str = c43139GwR.LIZIZ;
            boolean LJJIJIIJI = V16.LJJIJIIJI(c43139GwR.LIZLLL);
            if (LJJIJIIJI) {
                gyb = new C76857UEj();
            } else {
                gyb = new GYB(0);
            }
            C43138GwQ c43138GwQ = new C43138GwQ();
            c43138GwQ.LIZIZ = System.currentTimeMillis();
            SingleImageCoverBitmapData singleImageCoverBitmapData = c43139GwR.LIZLLL.singleImageCoverBitmapData;
            Bitmap LJJJJI = C78966Uyw.LJJJJI(singleImageCoverBitmapData);
            if (LJJJJI != null) {
                c43138GwQ.LIZ();
                C5VH c5vh = new C5VH();
                c5vh.LIZ(c43139GwR.LIZIZ);
                OSZ<Integer, Integer> imageColorCache = C60903NvH.LJIIJJI().LJIIZILJ().getImageColorCache(c43139GwR.LIZIZ);
                if (imageColorCache == null) {
                    imageColorCache = gyb.LIZIZ(LJJJJI);
                }
                o.LJIIIZ(imageColorCache, "<set-?>");
                c5vh.LIZIZ = imageColorCache;
                CompileConfigResolution LJ = C86793Y4n.LJ();
                if (V16.LJJIJIIJI(c43139GwR.LIZLLL)) {
                    LJJII = C79234V7u.LJJIFFI(singleImageCoverBitmapData.getSrcWidth(), singleImageCoverBitmapData.getSrcHeight());
                } else if (V16.LJJIJIIJIL(c43139GwR.LIZLLL)) {
                    LJJII = C79234V7u.LJJIII(singleImageCoverBitmapData.getSrcWidth(), singleImageCoverBitmapData.getSrcHeight());
                } else {
                    int width = LJ.getWidth();
                    int height = LJ.getHeight();
                    int srcWidth = singleImageCoverBitmapData.getSrcWidth();
                    int srcHeight = singleImageCoverBitmapData.getSrcHeight();
                    if (singleImageCoverBitmapData.getPreviewBitmap() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LJJII = C79234V7u.LJJII(width, height, srcWidth, srcHeight, z);
                }
                c5vh.LIZJ = LJJII;
                List<String> list = c43139GwR.LIZJ;
                if (LJJIJIIJI || !C1535060s.LIZ()) {
                    z2 = false;
                }
                LJIIIIZZ(c43139GwR, C79234V7u.LJJJIL(c5vh, list, z2), c43139GwR.LJIIIIZZ, singleImageCoverBitmapData);
                return;
            }
            CreativeInfo creativeInfo = c43139GwR.LIZLLL.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "pageAction.shortVideoContext.creativeInfo");
            C138895cj c138895cj = new C138895cj(creativeInfo, gyb);
            boolean z3 = !c43139GwR.LJI;
            ShortVideoContext shortVideoContext = c43139GwR.LIZLLL;
            C138895cj.LIZ(c138895cj, str, z3, shortVideoContext.creativeModel.changeAvatarModel.originPath, V16.LJJIJIIJI(shortVideoContext), V16.LJJIJIIJIL(c43139GwR.LIZLLL), 4).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C43135GwN(c43138GwQ, str, c43139GwR, LJJIJIIJI), new AfS59S0100000_7(c43139GwR, 77));
            return;
        }
        System.currentTimeMillis();
        new C43617H9x(null, true);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x044c, code lost:
    
        if (android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r6) != null) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C43139GwR r21, com.ss.android.ugc.aweme.canvas.CanvasVideoData r22, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r23, dmt.av.video.SingleImageCoverBitmapData r24) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H9T.LJIIIIZZ(X.GwR, com.ss.android.ugc.aweme.canvas.CanvasVideoData, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, dmt.av.video.SingleImageCoverBitmapData):void");
    }
}
