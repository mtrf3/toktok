package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Xum, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86352Xum implements InterfaceC86351Xul {
    public final WeakReference<InterfaceC86353Xun> LIZ;

    @Override // X.InterfaceC86351Xul
    public final long getBitrate() {
        InterfaceC86353Xun interfaceC86353Xun = this.LIZ.get();
        if (interfaceC86353Xun != null) {
            return interfaceC86353Xun.LLZZZZ();
        }
        return 0L;
    }

    public C86352Xum(InterfaceC86353Xun player) {
        o.LJIIIZ(player, "player");
        this.LIZ = new WeakReference<>(player);
    }
}
