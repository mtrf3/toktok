package X;

import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wv6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83824Wv6<KEY extends Enum<KEY>> implements InterfaceC83823Wv5<KEY> {
    public InterfaceC88472Yns<? super C83664WsW, C76800UCe> LIZ;
    public final LinkedHashMap<InterfaceC83821Wv3<KEY>, C83825Wv7<KEY>> LIZIZ = new LinkedHashMap<>();

    @Override // X.InterfaceC83823Wv5
    public final void LIZ(InterfaceC88472Yns<? super C83664WsW, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC83823Wv5
    public final void LIZIZ(InterfaceC83821Wv3<KEY> key, boolean z, InterfaceC88472Yns<? super C83851WvX, ? extends InterfaceC83830WvC<KEY>> interfaceC88472Yns, InterfaceC88472Yns<? super InterfaceC83822Wv4<KEY>, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(key, "key");
        this.LIZIZ.put(key, new C83825Wv7<>(key, z, interfaceC88472Yns, interfaceC88472Yns2));
    }
}
