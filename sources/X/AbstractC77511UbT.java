package X;

import android.content.Context;

/* renamed from: X.UbT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77511UbT implements InterfaceC77512UbU {
    public abstract InterfaceC77501UbJ LIZIZ(Context context, C77518Uba c77518Uba);

    @Override // X.InterfaceC77512UbU
    public final InterfaceC77501UbJ LIZ(Context context, InterfaceC77503UbL interfaceC77503UbL) {
        if (interfaceC77503UbL instanceof C77518Uba) {
            return LIZIZ(context, (C77518Uba) interfaceC77503UbL);
        }
        return UIG.LIZ();
    }
}
