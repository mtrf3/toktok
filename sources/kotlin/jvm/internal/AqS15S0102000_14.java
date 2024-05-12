package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C81500Vyi;
import X.InterfaceC88472Yns;
import X.OSJ;
import X.WOB;
import X.WOC;
import X.WOW;
import X.WOX;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes15.dex */
public class AqS15S0102000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AqS15S0102000_14 aqS15S0102000_14, Object obj) {
        FTCEditMusicCutState setState = (FTCEditMusicCutState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditMusicCutState.copy$default(setState, new OSJ((AVMusicWaveBean) aqS15S0102000_14.l0, Integer.valueOf(aqS15S0102000_14.i1), Integer.valueOf(aqS15S0102000_14.i2)), null, null, 6, null);
    }

    public static final Object invoke$1(AqS15S0102000_14 aqS15S0102000_14, Object obj) {
        FTCCountdownState state = (FTCCountdownState) obj;
        o.LJIIIZ(state, "state");
        WOW wow = ((WOC) aqS15S0102000_14.l0).LJLILLLLZI;
        if (wow != null) {
            wow.LIZJ(aqS15S0102000_14.i1, aqS15S0102000_14.i2, state.getMusicPath());
        }
        ((WOC) aqS15S0102000_14.l0).LLJJI(aqS15S0102000_14.i2, state.getStartTime(), state.getMaxDuration());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS15S0102000_14 aqS15S0102000_14, Object obj) {
        CountdownState state = (CountdownState) obj;
        o.LJIIIZ(state, "state");
        WOX wox = ((WOB) aqS15S0102000_14.l0).LJLJI;
        if (wox != null) {
            wox.LIZJ(aqS15S0102000_14.i1, aqS15S0102000_14.i2, state.getMusicPath());
        }
        ((WOB) aqS15S0102000_14.l0).LLJJIII(aqS15S0102000_14.i2, state.getStartTime(), state.getMaxDuration(), false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS15S0102000_14 aqS15S0102000_14, Object obj) {
        C81500Vyi setState = (C81500Vyi) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C81500Vyi.LIZ(setState, null, aqS15S0102000_14.i1, aqS15S0102000_14.i2, null, (Effect) aqS15S0102000_14.l0, false, null, null, null, null, null, null, null, null, 16361);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0102000_14(WOB wob, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = wob;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0102000_14(WOC woc, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = woc;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0102000_14(AVMusicWaveBean aVMusicWaveBean, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = aVMusicWaveBean;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0102000_14(Effect effect, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = effect;
    }
}
