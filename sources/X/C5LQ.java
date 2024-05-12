package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5LQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LQ {
    public static final /* synthetic */ int LIZ = 0;

    public static EffectPointModel LIZ(C122334r7 params, boolean z, int i) {
        int startPoint;
        int endPoint;
        o.LJIIIZ(params, "params");
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUuid(params.LIZ);
        effectPointModel.setStartPoint((int) params.LIZIZ);
        effectPointModel.setEndPoint((int) params.LIZJ);
        if (z) {
            startPoint = i - effectPointModel.getEndPoint();
        } else {
            startPoint = effectPointModel.getStartPoint();
        }
        effectPointModel.setUiStartPoint(startPoint);
        if (z) {
            endPoint = i - effectPointModel.getStartPoint();
        } else {
            endPoint = effectPointModel.getEndPoint();
        }
        effectPointModel.setUiEndPoint(endPoint);
        effectPointModel.setSelectedColor(params.LJIIIIZZ);
        effectPointModel.setKey(params.LJFF);
        effectPointModel.setType(params.LJIIIZ);
        effectPointModel.setIndex(params.LJIILIIL);
        effectPointModel.setSelectFrom(params.LJIILJJIL);
        effectPointModel.setChallenge(params.LJIILL);
        effectPointModel.setIsFromEditPro(Boolean.valueOf(params.LJIILLIIL));
        effectPointModel.setFromEnd(false);
        effectPointModel.setResDir(params.LIZLLL);
        effectPointModel.setName(params.LJII);
        effectPointModel.setDuration(effectPointModel.getEndPoint() - effectPointModel.getStartPoint());
        effectPointModel.setCategory(params.LJIIJ);
        effectPointModel.setExtra(params.LJ);
        effectPointModel.setResourceId(params.LJIIL);
        return effectPointModel;
    }
}
