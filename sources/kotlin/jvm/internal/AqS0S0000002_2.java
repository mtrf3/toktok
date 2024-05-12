package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C152015xt;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;

/* loaded from: classes3.dex */
public class AqS0S0000002_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;
    public float f1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0000002_2 aqS0S0000002_2, Object obj) {
        C152015xt setState = (C152015xt) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C152015xt.LIZ(setState, null, new C08630Vn(new OSZ(Float.valueOf(aqS0S0000002_2.f0), Float.valueOf(aqS0S0000002_2.f1))), null, 13);
    }

    public static final Object invoke$1(AqS0S0000002_2 aqS0S0000002_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return BaseStickerModel.copy$default(setState, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS0S0000002_2.f0, aqS0S0000002_2.f1, false, 0.0f, 0.0f, false, 0.0f, -100663297, null);
    }

    public static final Object invoke$2(AqS0S0000002_2 aqS0S0000002_2, Object obj) {
        QAStickerModel setState = (QAStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return QAStickerModel.copy$default(setState, BaseStickerModel.copy$default(setState.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, aqS0S0000002_2.f0, aqS0S0000002_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null), 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0.0f, 0L, null, null, 4194302, null);
    }

    public static final Object invoke$3(AqS0S0000002_2 aqS0S0000002_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return BaseStickerModel.copy$default(setState, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, aqS0S0000002_2.f0, aqS0S0000002_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0000002_2(float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
    }
}
