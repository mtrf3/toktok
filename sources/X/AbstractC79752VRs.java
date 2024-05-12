package X;

import android.text.style.ReplacementSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;

/* renamed from: X.VRs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79752VRs extends ReplacementSpan {
    public int LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public C0XW LJLJJI;
    public boolean LJLJJL;

    public final float LIZ(float f, float f2) {
        float floatValue;
        C0XW c0xw = this.LJLJJI;
        if (c0xw != null) {
            int i = this.LJLIL;
            float f3 = this.LJLILLLLZI;
            c0xw.getClass();
            float f4 = f2 - f;
            switch (i) {
                case 2:
                    f3 = (-f4) * 0.1f;
                    break;
                case 3:
                    f3 = f4 * 0.1f;
                    break;
                case 4:
                case 5:
                    f3 = f - ((Float) ListProtector.get((List) c0xw.LIZ, 0)).floatValue();
                    break;
                case 6:
                    f2 += f;
                    floatValue = ((Float) ListProtector.get((List) c0xw.LIZ, 2)).floatValue();
                    f3 = (floatValue + f2) * 0.5f;
                    break;
                case 7:
                case 8:
                    f3 = f2 - ((Float) ListProtector.get((List) c0xw.LIZ, 1)).floatValue();
                    break;
                case 9:
                    break;
                case 10:
                    f3 = (((Float) ListProtector.get((List) c0xw.LIZ, 3)).floatValue() * f3) / 100.0f;
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    floatValue = ((-((Float) ListProtector.get((List) c0xw.LIZ, 0)).floatValue()) - ((Float) ListProtector.get((List) c0xw.LIZ, 1)).floatValue()) + f;
                    f3 = (floatValue + f2) * 0.5f;
                    break;
                default:
                    f3 = 0.0f;
                    break;
            }
            return (-f3) + f;
        }
        return f;
    }
}
