package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C133355Lf;
import X.C173876s3;
import X.C5M1;
import X.C5Y5;
import X.C6MT;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.WVY;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* loaded from: classes3.dex */
public class AqS0S0000001_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0000001_2(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        WVY setState = (WVY) obj;
        o.LJIIIZ(setState, "$this$setState");
        return WVY.LIZ(setState, 0, false, null, new C173876s3(aqS0S0000001_2.f0), null, null, null, 2039);
    }

    public static final Object invoke$1(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, false, null, null, false, null, false, new C133355Lf(true, aqS0S0000001_2.f0, true), 0, null, null, null, null, null, null, null, null, null, null, false, null, 2097023);
    }

    public static final Object invoke$10(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        QAStickerModel setState = (QAStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return QAStickerModel.copy$default(setState, null, 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, aqS0S0000001_2.f0, 0L, null, null, 3932159, null);
    }

    public static final Object invoke$11(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        float f = 360;
        float f2 = aqS0S0000001_2.f0 % f;
        if (f2 > 180.0f) {
            f2 -= f;
        } else if (f2 < -180.0f) {
            f2 += f;
        }
        return BaseStickerModel.copy$default(setState, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -16777217, null);
    }

    public static final Object invoke$12(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return BaseStickerModel.copy$default(setState, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS0S0000001_2.f0, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -8388609, null);
    }

    public static final Object invoke$2(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        Boolean bool = Boolean.FALSE;
        return C5M1.LIZ(setState, null, true, null, null, false, null, true, new C133355Lf(true, aqS0S0000001_2.f0, true), 0, null, null, null, null, null, null, null, null, new OSZ(bool, bool), null, false, null, 1965885);
    }

    public static final Object invoke$3(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, null, null, null, aqS0S0000001_2.f0, false, 0, null, null, null, 2015);
    }

    public static final Object invoke$4(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, null, null, null, aqS0S0000001_2.f0, false, 0, null, null, null, 2015);
    }

    public static final Object invoke$5(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C5Y5 setState = (C5Y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5Y5.LIZ(setState, 0, (int) (aqS0S0000001_2.f0 * 100), 0, false, false, false, null, null, null, 509);
    }

    public static final Object invoke$6(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C5Y5 setState = (C5Y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5Y5.LIZ(setState, (int) (aqS0S0000001_2.f0 * 100), 0, 0, false, false, false, null, null, null, 510);
    }

    public static final Object invoke$7(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        C5Y5 setState = (C5Y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5Y5.LIZ(setState, 0, 0, (int) (aqS0S0000001_2.f0 * 100), false, false, false, null, null, null, 507);
    }

    public static final Object invoke$8(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return BaseStickerModel.copy$default(setState, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, aqS0S0000001_2.f0, Integer.MAX_VALUE, null);
    }

    public static final Object invoke$9(AqS0S0000001_2 aqS0S0000001_2, Object obj) {
        TextStickerModel setState = (TextStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TextStickerModel.copy$default(setState, null, null, null, 0, 0, 0, 0.0f, TextFontModel.L(setState.getFontModel(), null, null, null, (int) aqS0S0000001_2.f0, null, null, false, false, 495), false, false, false, null, null, null, null, null, null, false, 262015, null);
    }
}
