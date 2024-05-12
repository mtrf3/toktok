package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Ptk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65904Ptk extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final double LJLJI;
    public final double LJLJJI;

    public /* synthetic */ C65904Ptk() {
        this(false, false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Double.valueOf(this.LJLJI), Double.valueOf(this.LJLJJI)};
    }

    public C65904Ptk(boolean z, boolean z2, double d, double d2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = d;
        this.LJLJJI = d2;
    }
}
