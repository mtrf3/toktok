package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C150575vZ;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState;

/* loaded from: classes3.dex */
public class AqS0S0000101_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f1;
    public long j0;

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

    public static final Object invoke$0(AqS0S0000101_2 aqS0S0000101_2, Object obj) {
        FTCEditStickerState setState = (FTCEditStickerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditStickerState.copy$default(setState, null, null, new C150575vZ(new OSZ(Float.valueOf(aqS0S0000101_2.f1), Long.valueOf(aqS0S0000101_2.j0))), null, null, null, null, null, 251, null);
    }

    public static final Object invoke$1(AqS0S0000101_2 aqS0S0000101_2, Object obj) {
        FTCEditInfoStickerState setState = (FTCEditInfoStickerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditInfoStickerState.copy$default(setState, null, null, null, null, new C150575vZ(new OSZ(Float.valueOf(aqS0S0000101_2.f1), Long.valueOf(aqS0S0000101_2.j0))), null, null, 111, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0000101_2(float f, long j, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.j0 = j;
    }
}
