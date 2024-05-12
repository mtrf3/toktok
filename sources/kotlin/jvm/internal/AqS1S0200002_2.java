package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1NS;
import X.C6OF;
import X.InterfaceC88472Yns;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* loaded from: classes3.dex */
public class AqS1S0200002_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f2;
    public float f3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S0200002_2 aqS1S0200002_2, Object obj) {
        TextStickerModel setState = (TextStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        C1NS<TextStickerModel> c1ns = ((C6OF) aqS1S0200002_2.l0).LJLJLLL;
        if (c1ns != null) {
            return TextStickerModel.copy$default(setState, BaseStickerModel.copy$default(c1ns.LJ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS1S0200002_2.f2, aqS1S0200002_2.f3, false, 0.0f, 0.0f, false, 0.0f, -100663297, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, (TTSModel) aqS1S0200002_2.l1, null, null, null, null, null, false, 260094, null);
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public static final Object invoke$1(AqS1S0200002_2 aqS1S0200002_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        float translateX = ((BaseStickerModel) aqS1S0200002_2.l0).getTranslateX();
        float f = aqS1S0200002_2.f2;
        Object animatedValue = ((ValueAnimator) aqS1S0200002_2.l1).getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = (((Float) animatedValue).floatValue() * f) + translateX;
        float translateY = ((BaseStickerModel) aqS1S0200002_2.l0).getTranslateY();
        float f2 = aqS1S0200002_2.f3;
        Object animatedValue2 = ((ValueAnimator) aqS1S0200002_2.l1).getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        return BaseStickerModel.copy$default(setState, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, floatValue, (((Float) animatedValue2).floatValue() * f2) + translateY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0200002_2(C6OF c6of, float f, float f2, TTSModel tTSModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c6of;
        this.f2 = f;
        this.f3 = f2;
        this.l1 = tTSModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0200002_2(BaseStickerModel baseStickerModel, float f, ValueAnimator valueAnimator, float f2, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseStickerModel;
        this.f2 = f;
        this.l1 = valueAnimator;
        this.f3 = f2;
    }
}
