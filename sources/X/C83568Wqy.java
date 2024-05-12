package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMoreAutoCutting;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMoreMaxSize;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;

/* renamed from: X.Wqy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83568Wqy extends AbstractC65781Prl implements InterfaceC88472Yns<Effect, DiyPropUploadVideoAutoCutConfigure> {
    public static final C83568Wqy LJLIL = new C83568Wqy();

    public C83568Wqy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final DiyPropUploadVideoAutoCutConfigure invoke(Effect effect) {
        XN9<?, ?>[] LIZIZ;
        AbstractC83571Wr1 abstractC83571Wr1;
        double d;
        double d2;
        double d3;
        UIAnnotationAssetUIMoreAutoCutting autoCutting;
        XN6 LJFF = DiyPropParser.LJFF(effect);
        if (LJFF == null || (LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) == null) {
            return null;
        }
        boolean z = false;
        XN9<?, ?> xn9 = LIZIZ[0];
        if (!(xn9 instanceof XNE) || xn9 == null || (abstractC83571Wr1 = (AbstractC83571Wr1) xn9.LIZ) == null) {
            return null;
        }
        UIAnnotationAssetUIMoreMaxSize LJIILIIL = abstractC83571Wr1.LJIILIIL();
        double d4 = 480.0d;
        if (LJIILIIL != null) {
            d = LJIILIIL.getWidth();
        } else {
            d = 480.0d;
        }
        UIAnnotationAssetUIMoreMaxSize LJIILIIL2 = abstractC83571Wr1.LJIILIIL();
        if (LJIILIIL2 != null) {
            d4 = LJIILIIL2.getHeight();
        }
        UIAnnotationUIMore uIAnnotationUIMore = (UIAnnotationUIMore) abstractC83571Wr1.LJLILLLLZI;
        if (uIAnnotationUIMore != null && (autoCutting = ((UIAnnotationAssetUIMore) uIAnnotationUIMore).getAutoCutting()) != null) {
            z = autoCutting.getEnabled();
            d2 = autoCutting.getWidth();
            d3 = autoCutting.getHeight();
        } else {
            d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return new DiyPropUploadVideoAutoCutConfigure(z, d2, d3, d, d4, 1000L, 60000L);
    }
}
