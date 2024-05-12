package X;

import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wip, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83063Wip extends AbstractC214518bP<CanvasVideoData> {
    public final /* synthetic */ C83062Wio LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83063Wip(C83062Wio c83062Wio) {
        super(null);
        this.LIZIZ = c83062Wio;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, CanvasVideoData canvasVideoData, CanvasVideoData canvasVideoData2) {
        List<CanvasFilterParam> transformList;
        CanvasExtra extra;
        o.LJIIIZ(property, "property");
        CanvasVideoData canvasVideoData3 = canvasVideoData2;
        if (canvasVideoData3 != null && (extra = canvasVideoData3.getExtra()) != null) {
            this.LIZIZ.LJIIIIZZ = extra.getGestureConfig();
            this.LIZIZ.LJFF = extra.getScaleMinLimit();
            this.LIZIZ.LJI = extra.getScaleMaxLimit();
            C83062Wio c83062Wio = this.LIZIZ;
            AnonymousClass671 anonymousClass671 = c83062Wio.LIZJ;
            if (anonymousClass671 != null) {
                anonymousClass671.setEnableFakeFeedView(c83062Wio.LJIIIIZZ.getEnableFakeFeedView());
            }
        }
        C83062Wio c83062Wio2 = this.LIZIZ;
        C83064Wiq c83064Wiq = c83062Wio2.LJIIIZ;
        String id = c83062Wio2.LJ;
        CanvasFilterParam canvasFilterParam = null;
        if (canvasVideoData3 != null && (transformList = canvasVideoData3.getTransformList()) != null) {
            canvasFilterParam = (CanvasFilterParam) ORZ.LJLLLL(transformList);
        }
        c83064Wiq.getClass();
        o.LJIIIZ(id, "id");
        c83064Wiq.LIZIZ = id;
        if (canvasFilterParam != null) {
            if (c83064Wiq.LIZ.get(id) == null) {
                c83064Wiq.LIZ.put(id, C79004UzY.LJJJJZI(canvasFilterParam));
            } else {
                VEVideoTransformFilterParam vEVideoTransformFilterParam = c83064Wiq.LIZ.get(id);
                if (vEVideoTransformFilterParam != null) {
                    vEVideoTransformFilterParam.scaleFactor = canvasFilterParam.getScaleFactor();
                    vEVideoTransformFilterParam.transX = canvasFilterParam.getTransX();
                    vEVideoTransformFilterParam.transY = canvasFilterParam.getTransY();
                    vEVideoTransformFilterParam.degree = canvasFilterParam.getDegree();
                }
            }
        }
        C35746E1e LJIILIIL = this.LIZIZ.LJIILIIL();
        if (LJIILIIL.LIZ == null) {
            LJIILIIL.LIZ = this.LIZIZ.LJIIIZ();
        }
    }
}
