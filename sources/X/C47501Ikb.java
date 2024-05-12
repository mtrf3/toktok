package X;

import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

/* renamed from: X.Ikb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47501Ikb implements InterfaceC47498IkY {
    public volatile double LIZ = -1.0d;
    public final InterfaceC47506Ikg LIZIZ;

    public C47501Ikb(XX4 xx4) {
        this.LIZIZ = xx4;
    }

    @Override // X.InterfaceC47498IkY
    public final double LIZ(Queue<C47152Iey> queue, C47152Iey[] c47152IeyArr) {
        return this.LIZ;
    }

    @Override // X.InterfaceC47498IkY
    public final double LIZIZ(Queue<C47152Iey> queue, C47152Iey[] c47152IeyArr) {
        int i;
        String str;
        J30 j30 = C47503Ikd.LIZ.LIZ;
        if (j30 == null || !j30.LIZJ() || !j30.LIZLLL()) {
            this.LIZ = -1.0d;
            if (j30 == null) {
                i = 0;
                str = "component is null";
            } else {
                i = 3;
                str = "component is not initialized ready";
            }
            throw new C47502Ikc(i, str);
        }
        queue.toArray(c47152IeyArr);
        HashMap hashMap = new HashMap();
        int min = Math.min(c47152IeyArr.length, queue.size());
        int i2 = min - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = min - i3;
            hashMap.put(KMP.LJ("f", i4), Float.valueOf((float) c47152IeyArr[i3].LJLILLLLZI));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("s");
            LIZ.append(i4);
            hashMap.put(X1D.LIZIZ(LIZ), Float.valueOf(((float) c47152IeyArr[i3].LJLIL) / 8000.0f));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("i");
            LIZ2.append(i4);
            hashMap.put(X1D.LIZIZ(LIZ2), Float.valueOf(((float) c47152IeyArr[i2].LJLJJI) - ((float) c47152IeyArr[i3].LJLJJI)));
        }
        ISpeedCalculatorConfig iSpeedCalculatorConfig = (ISpeedCalculatorConfig) ((XX4) this.LIZIZ).LJLIL;
        HashMap hashMap2 = new HashMap();
        InterfaceC47509Ikj intelligentAlgoConfig = iSpeedCalculatorConfig.getIntelligentAlgoConfig();
        if (intelligentAlgoConfig != null) {
            hashMap2.put("country", intelligentAlgoConfig.getCountry());
            hashMap2.put("access", intelligentAlgoConfig.getNetworkType());
            hashMap2.put("signal", Integer.valueOf(intelligentAlgoConfig.getPhoneSignal()));
        }
        hashMap.putAll(hashMap2);
        H2L h2l = j30.LIZJ;
        List<? extends J5M> LJ = j30.LJ();
        MLConfigModel mLConfigModel = j30.LJFF;
        this.LIZ = ((J32) h2l).LIZIZ(hashMap, LJ, mLConfigModel.output, mLConfigModel.feature_list);
        if (this.LIZ == -1.0d) {
            if (!((J32) j30.LIZJ).LJI) {
                throw new C47502Ikc(4, "evaluator is not initialized");
            }
            throw new C47502Ikc(5, "evaluator calculate error");
        }
        return this.LIZ;
    }
}
