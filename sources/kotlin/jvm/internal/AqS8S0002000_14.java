package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C150575vZ;
import X.C76800UCe;
import X.C87278YNe;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState;

/* loaded from: classes15.dex */
public class AqS8S0002000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
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

    public static final Object invoke$0(AqS8S0002000_14 aqS8S0002000_14, Object obj) {
        C87278YNe it = (C87278YNe) obj;
        o.LJIIIZ(it, "it");
        it.LJIIJ(aqS8S0002000_14.i0, aqS8S0002000_14.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S0002000_14 aqS8S0002000_14, Object obj) {
        EditPreviewStickerState setState = (EditPreviewStickerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditPreviewStickerState.copy$default(setState, null, null, null, null, null, null, null, null, new C150575vZ(new OSZ(Integer.valueOf(aqS8S0002000_14.i0), Integer.valueOf(aqS8S0002000_14.i1))), 255, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0002000_14(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
