package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.SXv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72267SXv extends C74232TBk implements InterfaceC88472Yns<Context, C78516Urg> {
    public static final C72267SXv LJLIL = new C72267SXv();

    public C72267SXv() {
        super(1);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "<init>";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(C78516Urg.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "<init>(Landroid/content/Context;)V";
    }

    @Override // X.InterfaceC88472Yns
    public final C78516Urg invoke(Context context) {
        Context p1 = context;
        o.LJIIJ(p1, "p1");
        return new C78516Urg(p1);
    }
}
