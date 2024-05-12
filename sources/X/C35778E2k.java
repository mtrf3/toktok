package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E2k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35778E2k extends F9E {
    public final boolean LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;

    public C35778E2k() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public /* synthetic */ C35778E2k(int i) {
        this(false, C113554cx.LJJJLIIL());
    }

    public C35778E2k(boolean z, java.util.Map<String, String> trackingData) {
        o.LJIIIZ(trackingData, "trackingData");
        this.LJLIL = z;
        this.LJLILLLLZI = trackingData;
    }
}
