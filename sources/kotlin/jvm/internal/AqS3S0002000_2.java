package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass391;
import X.C26338AVi;
import X.C5GH;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.graphics.Paint;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;

/* loaded from: classes3.dex */
public class AqS3S0002000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;

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

    public static final Object invoke$0(AqS3S0002000_2 aqS3S0002000_2, Object obj) {
        Paint circlePaint;
        C5GH initConfig = (C5GH) obj;
        o.LJIIIZ(initConfig, "$this$initConfig");
        initConfig.setTextFont(92);
        initConfig.setGravity(16);
        C26338AVi.LJI(initConfig, Integer.valueOf(aqS3S0002000_2.i0), 0, AnonymousClass391.LIZJ(4), 0, false, 16);
        if (aqS3S0002000_2.i1 != 0 && (circlePaint = initConfig.getCirclePaint()) != null) {
            circlePaint.setColor(aqS3S0002000_2.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S0002000_2 aqS3S0002000_2, Object obj) {
        AddYoursStickerModel setState = (AddYoursStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddYoursStickerModel.copy$default(setState, BaseStickerModel.copy$default(setState.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, aqS3S0002000_2.i0, aqS3S0002000_2.i1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0002000_2(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
