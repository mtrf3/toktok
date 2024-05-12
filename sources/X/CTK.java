package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameBottomGradientAlphaSettingSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CTK extends AbstractC65781Prl implements InterfaceC65784Pro<int[]> {
    public static final CTK LJLIL = new CTK();

    public CTK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final int[] invoke() {
        float f;
        if (LiveGameBottomGradientAlphaSettingSetting.INSTANCE.getAlphaLimit() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            List<Float> list = LiveGameBottomGradientAlphaSettingSetting.gradientRatioArray;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Float> it = list.iterator();
            while (it.hasNext()) {
                float floatValue = it.next().floatValue();
                if (floatValue > 0.0f) {
                    f = LiveGameBottomGradientAlphaSettingSetting.INSTANCE.getAlphaLimit() * floatValue;
                } else {
                    f = 0.007f;
                }
                arrayList.add(Integer.valueOf(O6R.LJJIIZ(f * 255) << 24));
            }
            return ORZ.LLJ(arrayList);
        }
        return null;
    }
}
