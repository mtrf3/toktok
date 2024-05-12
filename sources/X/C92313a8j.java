package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinRule;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewModel;
import java.util.List;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a8j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92313a8j implements InterfaceC91814a0g {
    public final /* synthetic */ PinSetViewAssem LIZ;

    @Override // X.InterfaceC91814a0g
    public final void LIZIZ() {
    }

    public C92313a8j(PinSetViewAssem pinSetViewAssem) {
        this.LIZ = pinSetViewAssem;
    }

    @Override // X.InterfaceC91814a0g
    public final void LIZ(String inputString) {
        o.LJIIIZ(inputString, "inputString");
        PinSetViewAssem pinSetViewAssem = this.LIZ;
        pinSetViewAssem.LJLJJI = inputString;
        PinSetViewModel pinSetViewModel = (PinSetViewModel) pinSetViewAssem.LJLILLLLZI.getValue();
        List<PinRule> pinRuleList = this.LIZ.A3().LJLILLLLZI;
        o.LJIIIZ(pinRuleList, "pinRuleList");
        for (PinRule pinRule : pinRuleList) {
            if (new OJD(pinRule.getRegex()).containsMatchIn(inputString)) {
                pinSetViewModel.setState(new IDqS174S0200000_31(pinRule, pinSetViewModel, 27));
                return;
            }
        }
        pinSetViewModel.setStateImmediate(new IDqS418S0100000_31(pinSetViewModel, LiveTryModeCountDownThresholdSetting.DEFAULT));
    }
}
