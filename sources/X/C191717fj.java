package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191717fj extends F9E implements Serializable {
    public final double LJLIL;
    public final double LJLILLLLZI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C191717fj() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191717fj.<init>():void");
    }

    public static /* synthetic */ C191717fj copy$default(C191717fj c191717fj, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = c191717fj.LJLIL;
        }
        if ((i & 2) != 0) {
            d2 = c191717fj.LJLILLLLZI;
        }
        return c191717fj.copy(d, d2);
    }

    public final C191717fj copy(double d, double d2) {
        return new C191717fj(d, d2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.LJLIL), Double.valueOf(this.LJLILLLLZI)};
    }

    public final double getLatitude() {
        return this.LJLIL;
    }

    public final double getLongitude() {
        return this.LJLILLLLZI;
    }

    public C191717fj(double d, double d2) {
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
    }

    public /* synthetic */ C191717fj(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2);
    }
}
