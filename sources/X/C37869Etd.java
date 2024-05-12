package X;

import com.lynx.react.bridge.Callback;
import kotlin.jvm.internal.o;

/* renamed from: X.Etd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37869Etd implements Callback {
    public final /* synthetic */ InterfaceC38177Eyb LIZ;

    public C37869Etd(C37863EtX c37863EtX) {
        this.LIZ = c37863EtX;
    }

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object[] it) {
        try {
            o.LJFF(it, "it");
            Object map = ORY.LJJIL(it);
            InterfaceC38177Eyb interfaceC38177Eyb = this.LIZ;
            o.LJFF(map, "map");
            interfaceC38177Eyb.LIZ(map);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
