package X;

import Y.ARunnableS7S0301000_6;
import android.content.Context;
import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.FOn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38901FOn extends AbstractC38902FOo {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIJ(msg, "msg");
        return true;
    }

    @Override // X.InterfaceC38906FOs
    public final void LIZ(int i, Context context, InterfaceC39061FUr interfaceC39061FUr) {
        FOR.LJFF.LIZ().postDelayed(new ARunnableS7S0301000_6(i, this, interfaceC39061FUr, context, 0), 5L);
    }
}
