package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class M3B extends F9E implements Serializable {
    public final double LJLIL;
    public final double LJLILLLLZI;
    public final double LJLJI;
    public final double LJLJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M3B() {
        /*
            r11 = this;
            r1 = 0
            r9 = 15
            r10 = 0
            r0 = r11
            r3 = r1
            r5 = r1
            r7 = r1
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M3B.<init>():void");
    }

    public static /* synthetic */ M3B copy$default(M3B m3b, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = m3b.LJLIL;
        }
        if ((i & 2) != 0) {
            d2 = m3b.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            d3 = m3b.LJLJI;
        }
        if ((i & 8) != 0) {
            d4 = m3b.LJLJJI;
        }
        return m3b.copy(d, d2, d3, d4);
    }

    public final M3B copy(double d, double d2, double d3, double d4) {
        return new M3B(d, d2, d3, d4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.LJLIL), Double.valueOf(this.LJLILLLLZI), Double.valueOf(this.LJLJI), Double.valueOf(this.LJLJJI)};
    }

    public final double getMaxLat() {
        return this.LJLILLLLZI;
    }

    public final double getMaxLng() {
        return this.LJLIL;
    }

    public final double getMinLat() {
        return this.LJLJJI;
    }

    public final double getMinLng() {
        return this.LJLJI;
    }

    public M3B(double d, double d2, double d3, double d4) {
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = d3;
        this.LJLJJI = d4;
    }

    public /* synthetic */ M3B(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2, (i & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d3, (i & 8) == 0 ? d4 : LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }
}
