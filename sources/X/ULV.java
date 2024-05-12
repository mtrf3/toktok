package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULV extends RxBusSceneObserver<B4Q> {
    public final /* synthetic */ ULZ LIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<B4Q> getType() {
        return B4Q.class;
    }

    public ULV(ULZ ulz) {
        this.LIZ = ulz;
    }

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, B4Q b4q) {
        int LJFF;
        int LJIIL;
        B4Q value = b4q;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        if (C30149BsP.LIZIZ(layeredElementContext.getDataChannel())) {
            TtliveGameLandscapeDesignOptimizeSetting ttliveGameLandscapeDesignOptimizeSetting = TtliveGameLandscapeDesignOptimizeSetting.INSTANCE;
            if (ttliveGameLandscapeDesignOptimizeSetting.isGroup4()) {
                return;
            }
            ValueAnimator valueAnimator = this.LIZ.LJLILLLLZI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!value.LIZIZ) {
                constraintProperty.margin(7, ((UL8) layeredElementContext).LJIILL);
                constraintProperty.apply();
                return;
            }
            if (ttliveGameLandscapeDesignOptimizeSetting.isGroup3()) {
                LJFF = 0;
            } else {
                LJFF = C15380j0.LJFF(R.dimen.adg);
            }
            int LJIIJJI = C15380j0.LJIIJJI() - (value.LIZ + LJFF);
            OSZ osz = (OSZ) layeredElementContext.getDataChannel().kv0(BCI.class);
            if (osz == null || ((Number) osz.getFirst()).intValue() <= 0 || ((Number) osz.getSecond()).intValue() <= 0) {
                constraintProperty.margin(7, layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.add));
                constraintProperty.apply();
                return;
            }
            if (ttliveGameLandscapeDesignOptimizeSetting.isGroup3()) {
                LJIIL = C15380j0.LJIIL() - ((int) ((((Number) osz.getFirst()).intValue() / ((Number) osz.getSecond()).floatValue()) * LJIIJJI));
            } else {
                LJIIL = C15380j0.LJIIL() - ((((Number) osz.getFirst()).intValue() / ((Number) osz.getSecond()).intValue()) * LJIIJJI);
            }
            if (C15410j3.LIZJ(layeredElementContext.getContext())) {
                LJIIL -= C15380j0.LJIILIIL();
            }
            constraintProperty.margin(7, LJIIL);
            constraintProperty.apply();
        }
    }
}
