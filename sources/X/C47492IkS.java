package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import java.util.HashMap;

/* renamed from: X.IkS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47492IkS implements ISpeedCalculator {
    public C47495IkV LIZ;
    public final C47493IkT LIZIZ;

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LIZ() {
        this.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final int LIZJ() {
        double speed = this.LIZIZ.getSpeed();
        if (speed == -1.0d) {
            return -1;
        }
        return (int) ((speed / 8.0d) / 1000.0d);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final C47139Iel[] LIZLLL() {
        C47139Iel c47139Iel;
        C47152Iey[] LIZLLL = this.LIZIZ.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        C47139Iel[] c47139IelArr = new C47139Iel[LIZLLL.length];
        for (int i = 0; i < LIZLLL.length; i++) {
            C47152Iey c47152Iey = LIZLLL[i];
            if (c47152Iey == null) {
                c47139Iel = null;
            } else {
                c47139Iel = new C47139Iel(c47152Iey.LJLILLLLZI * 8.0d, c47152Iey.LJLJI);
                c47139Iel.LJLJJI = c47152Iey.LJLJJI;
            }
            c47139IelArr[i] = c47139Iel;
        }
        return c47139IelArr;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final double LJI() {
        return this.LIZIZ.getSpeed();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final double calculateSpeed() {
        return this.LIZIZ.calculateSpeed();
    }

    public C47492IkS() {
        new HashMap();
        this.LIZIZ = C47497IkX.LJ().LIZ;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LIZIZ(double d) {
        this.LIZIZ.LIZIZ = d;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LJ(C47139Iel c47139Iel) {
        C47495IkV c47495IkV = this.LIZ;
        if (c47495IkV != null) {
            double d = c47139Iel.LJLIL;
            if (d > c47495IkV.LJI * 8 || d < c47495IkV.LJFF * 8) {
                return;
            }
            double d2 = c47139Iel.LJLILLLLZI;
            if (d2 > c47495IkV.LJIIIIZZ || d2 < c47495IkV.LJII) {
                return;
            }
        }
        this.LIZIZ.monitorVideoSpeed(c47139Iel.LJLJI, c47139Iel.LJLIL / 8.0d, (long) c47139Iel.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LJFF(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
        C47510Ikk c47510Ikk;
        if (!TextUtils.isEmpty(iSpeedCalculatorConfig.getSpeedCalculateConfig())) {
            this.LIZ = new C47495IkV(iSpeedCalculatorConfig.getSpeedCalculateConfig());
        }
        this.LIZIZ.setSpeedQueueSize(iSpeedCalculatorConfig.getSpeedQueueSize());
        this.LIZIZ.LIZIZ = iSpeedCalculatorConfig.getDefaultSpeedInBPS();
        EnumC47488IkO speedAlgorithmType = iSpeedCalculatorConfig.getSpeedAlgorithmType();
        if (speedAlgorithmType == EnumC47488IkO.INTELLIGENT) {
            this.LIZIZ.LJI = new C47501Ikb(new XX4(iSpeedCalculatorConfig));
            C47500Ika c47500Ika = C47503Ikd.LIZ;
            InterfaceC47509Ikj intelligentAlgoConfig = iSpeedCalculatorConfig.getIntelligentAlgoConfig();
            if (intelligentAlgoConfig == null) {
                c47510Ikk = null;
            } else {
                c47510Ikk = new C47510Ikk(intelligentAlgoConfig);
            }
            J30 j30 = new J30(c47510Ikk);
            c47500Ika.LIZ = j30;
            j30.LIZLLL();
            return;
        }
        if (speedAlgorithmType == EnumC47488IkO.AVERAGE) {
            this.LIZIZ.LJI = new C47496IkW();
            return;
        }
        C47494IkU c47494IkU = new C47494IkU();
        C47495IkV c47495IkV = this.LIZ;
        if (c47495IkV != null) {
            c47494IkU.LIZ = c47495IkV;
        }
        this.LIZIZ.LJI = c47494IkU;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void setSpeedQueueSize(int i) {
        this.LIZIZ.setSpeedQueueSize(i);
    }
}
