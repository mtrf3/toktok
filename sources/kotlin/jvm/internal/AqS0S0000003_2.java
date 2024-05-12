package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C150565vY;
import X.InterfaceC88472Yns;
import X.OSJ;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState;

/* loaded from: classes3.dex */
public class AqS0S0000003_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;
    public float f1;
    public float f2;

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

    public static final Object invoke$0(AqS0S0000003_2 aqS0S0000003_2, Object obj) {
        FTCEditStickerState setState = (FTCEditStickerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditStickerState.copy$default(setState, null, null, null, new C150565vY(new OSJ(Float.valueOf(aqS0S0000003_2.f0), Float.valueOf(aqS0S0000003_2.f1), Float.valueOf(aqS0S0000003_2.f2))), null, null, null, null, 247, null);
    }

    public static final Object invoke$1(AqS0S0000003_2 aqS0S0000003_2, Object obj) {
        FTCEditInfoStickerState setState = (FTCEditInfoStickerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditInfoStickerState.copy$default(setState, null, null, null, null, null, new C150565vY(new OSJ(Float.valueOf(aqS0S0000003_2.f0), Float.valueOf(aqS0S0000003_2.f1), Float.valueOf(aqS0S0000003_2.f2))), null, 95, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0000003_2(float f, float f2, float f3, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
        this.f2 = f3;
    }
}
