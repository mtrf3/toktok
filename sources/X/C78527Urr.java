package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Urr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78527Urr extends C74232TBk implements InterfaceC88472Yns<Context, C78517Urh> {
    public static final C78527Urr LJLIL = new C78527Urr();

    public C78527Urr() {
        super(1);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "<init>";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(C78517Urh.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "<init>(Landroid/content/Context;)V";
    }

    @Override // X.InterfaceC88472Yns
    public final C78517Urh invoke(Context context) {
        Context p1 = context;
        o.LJIIJ(p1, "p1");
        return new C78517Urh(p1);
    }
}
