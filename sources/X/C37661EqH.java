package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EqH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37661EqH extends AbstractC37663EqJ<ReadableMap> {
    public InterfaceC38263Ezz LIZJ;
    public final C36557EWj LIZLLL;

    @Override // X.AbstractC37663EqJ
    public final EnumC37844EtE LIZ() {
        return EnumC37844EtE.LYNX;
    }

    @Override // X.AbstractC37663EqJ
    public final /* bridge */ /* synthetic */ InterfaceC37669EqP<ReadableMap> LIZIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37661EqH(InterfaceC37666EqM bridge, ReadableMap data) {
        super(bridge, data);
        o.LJIIJ(bridge, "bridge");
        o.LJIIJ(data, "data");
        C36557EWj c36557EWj = new C36557EWj();
        c36557EWj.LIZ = this.LIZJ;
        this.LIZLLL = c36557EWj;
    }

    @Override // X.AbstractC37663EqJ
    public final ReadableMap LIZLLL(int i, String message) {
        o.LJIIJ(message, "message");
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("msg", message);
        JavaOnlyMap from = JavaOnlyMap.from(hashMap);
        o.LJFF(from, "JavaOnlyMap.from(hashMap…msg\", message)\n        })");
        return from;
    }
}
