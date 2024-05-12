package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Fl4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39886Fl4 extends C39887Fl5 implements InterfaceC39889Fl7 {
    public final InterfaceC38506F9i LIZIZ;

    public C39886Fl4(InterfaceC38506F9i interfaceC38506F9i) {
        this.LIZIZ = interfaceC38506F9i;
    }

    @Override // X.InterfaceC39889Fl7
    public final void LIZ(Context context, C60737Nsb hybridContext, String originUrl) {
        o.LJIIJ(originUrl, "originUrl");
        o.LJIIJ(hybridContext, "hybridContext");
        InterfaceC38506F9i interfaceC38506F9i = this.LIZIZ;
        if (interfaceC38506F9i != null) {
            interfaceC38506F9i.LIZ(context, hybridContext, originUrl);
        }
    }
}
