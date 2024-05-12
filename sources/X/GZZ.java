package X;

import android.content.Intent;
import android.graphics.PointF;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class GZZ extends AbstractC41806Gaw<GZY, VideoPublishEditModel> {
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // X.AbstractC41806Gaw
    public final Object LIZIZ(Object obj, C41805Gav c41805Gav) {
        List<CanvasFilterParam> transformList;
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        GZY gzy = (GZY) obj;
        Intent LIZ = C41706GYk.LIZ(gzy.LIZ, gzy.LIZIZ, gzy.LJFF);
        new C43542H7a("forward");
        VideoPublishEditModel LJI = C43542H7a.LJI(C16880lQ.LLJJIJI(LIZ));
        if (gzy.LIZJ) {
            C60903NvH.LJIIJJI().LJIJ();
            C133765Mu LIZIZ2 = C135215Sj.LIZIZ(LJI, false);
            LJI.getPreviewInfo().setPreviewVideoLength(LIZIZ2.getDuration());
            LJI.setVideoLength(LIZIZ2.getDuration());
            LJI.nleData = LIZIZ2.LLJJL();
        }
        VESize vESize = gzy.LIZLLL;
        OSZ<OSZ<Float, Float>, OSZ<Float, Float>> osz = gzy.LJ;
        ArrayList arrayList = new ArrayList();
        C83062Wio.LJIILJJIL.getClass();
        OSZ LIZIZ3 = C163086ae.LIZIZ(vESize, osz);
        CanvasVideoData canvasVideoData = LJI.canvasVideoData;
        if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(transformList, 10));
            Iterator<CanvasFilterParam> it = transformList.iterator();
            while (true) {
                VideoShareInfoStruct videoShareInfoStruct = null;
                if (!it.hasNext()) {
                    break;
                }
                CanvasFilterParam next = it.next();
                InteractStickerStruct LJJIJIIJIL = C78609UtB.LJJIJIIJIL(next.getDegree() * 1.0f, next.getScaleFactor(), (PointF) LIZIZ3.getFirst(), (PointF) LIZIZ3.getSecond(), LJI.getVideoLength());
                CanvasVideoData canvasVideoData2 = LJI.canvasVideoData;
                if (canvasVideoData2 != null && (extra = canvasVideoData2.getExtra()) != null && (forwardCanvasExtra = extra.getForwardCanvasExtra()) != null) {
                    videoShareInfoStruct = forwardCanvasExtra.getVideoShareInfoStruct();
                }
                LJJIJIIJIL.setVideoShareInfoStruct(videoShareInfoStruct);
                arrayList2.add(LJJIJIIJIL);
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        LJI.setMainBusinessData(C164826dS.LJIIIZ(LJI.getMainBusinessContext(), arrayList, EnumC164816dR.TRACK_PAGE_EDIT));
        return LJI;
    }
}
