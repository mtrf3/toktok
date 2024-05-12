package X;

import Y.ACallableS110S0100000_7;
import Y.ACallableS54S0300000_2;
import android.content.Context;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.HzI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45864HzI implements InterfaceC45863HzH {
    public final Context LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        if (e1.LIZ(31744, "creative_tools_textfont_request_frequency", true, false)) {
            C1554568f LIZ = C1554568f.LIZ();
            Context context = this.LJLIL;
            LIZ.getClass();
            C10K.LIZJ(new ACallableS54S0300000_2(LIZ, context, null, 2));
            return;
        }
        if (C45866HzK.LIZIZ()) {
            C10K.LIZJ(new ACallableS110S0100000_7(this, 29));
            return;
        }
        C1554568f LIZ2 = C1554568f.LIZ();
        Context context2 = this.LJLIL;
        LIZ2.getClass();
        C10K.LIZJ(new ACallableS54S0300000_2(LIZ2, context2, null, 2));
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P2;
    }

    public C45864HzI(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = C221108m2.LIZIZ(HZT.LJLIL);
    }
}
