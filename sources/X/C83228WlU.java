package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83228WlU implements InterfaceC82228WOy {
    public final C83232WlY LIZ;
    public final InterfaceC83142Wk6 LIZIZ;
    public final InterfaceC83246Wlm LIZJ;

    public C83228WlU(InterfaceC83142Wk6 source, C79146V4k c79146V4k, AqS180S0100000_14 configBuilder) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(configBuilder, "configBuilder");
        this.LIZIZ = source;
        this.LIZJ = c79146V4k;
        C83232WlY c83232WlY = new C83232WlY();
        this.LIZ = c83232WlY;
        configBuilder.invoke(c83232WlY);
    }

    @Override // X.InterfaceC82228WOy
    public final InterfaceC82227WOx LIZ(Context context, ViewGroup viewGroup, InterfaceC83144Wk8 listener) {
        o.LJIIIZ(listener, "listener");
        C83242Wli c83242Wli = new C83242Wli(context, viewGroup, this.LIZIZ);
        c83242Wli.LIZ = listener;
        c83242Wli.LIZIZ = this.LIZJ;
        C83232WlY c83232WlY = this.LIZ;
        c83232WlY.LIZLLL = false;
        c83242Wli.LIZJ = c83232WlY;
        C83207Wl9 c83207Wl9 = new C83207Wl9(c83242Wli.LIZLLL, c83242Wli.LJFF, c83242Wli.LIZJ);
        c83207Wl9.setContainer(c83242Wli.LJ);
        c83207Wl9.setBeautyViewListener(c83242Wli.LIZ);
        c83207Wl9.setBeautyBuried(c83242Wli.LIZIZ);
        return c83207Wl9;
    }
}
