package X;

import com.bytedance.helios.api.config.DefaultSampleRateConfig;

/* renamed from: X.PuI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65938PuI extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final DefaultSampleRateConfig LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public /* synthetic */ C65938PuI(int i) {
        this(false, false, false, null);
    }

    public C65938PuI(boolean z, boolean z2, boolean z3, DefaultSampleRateConfig defaultSampleRateConfig) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = defaultSampleRateConfig;
    }
}
