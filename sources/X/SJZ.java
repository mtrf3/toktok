package X;

import android.graphics.PointF;

/* loaded from: classes13.dex */
public final class SJZ extends C06800Om<PointF> {
    public final /* synthetic */ float LIZJ;

    public SJZ(float f) {
        this.LIZJ = f;
    }

    @Override // X.C06800Om
    public final PointF LIZ(C06790Ol<PointF> c06790Ol) {
        PointF pointF = c06790Ol.LIZ;
        return new PointF(pointF.x - (this.LIZJ * c06790Ol.LIZJ), pointF.y);
    }
}
