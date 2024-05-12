package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C81500Vyi;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeState;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeState;

/* loaded from: classes15.dex */
public class AqS37S1000000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S1000000_14(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS37S1000000_14 aqS37S1000000_14, Object obj) {
        FTCEditVolumeState setState = (FTCEditVolumeState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditVolumeState.copy$default(setState, aqS37S1000000_14.s0, null, null, null, 14, null);
    }

    public static final Object invoke$1(AqS37S1000000_14 aqS37S1000000_14, Object obj) {
        FTCEditVolumeState setState = (FTCEditVolumeState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditVolumeState.copy$default(setState, null, aqS37S1000000_14.s0, null, null, 13, null);
    }

    public static final Object invoke$2(AqS37S1000000_14 aqS37S1000000_14, Object obj) {
        DuetLayoutModeState setStateImmediate = (DuetLayoutModeState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return DuetLayoutModeState.copy$default(setStateImmediate, 0, 0, 0, 0, aqS37S1000000_14.s0, null, null, 111, null);
    }

    public static final Object invoke$3(AqS37S1000000_14 aqS37S1000000_14, Object obj) {
        C81500Vyi setState = (C81500Vyi) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C81500Vyi.LIZ(setState, null, 0, 0, aqS37S1000000_14.s0, null, false, null, null, null, null, null, null, null, null, 16375);
    }
}
