package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8cC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215008cC extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final int LJLILLLLZI;

    public C215008cC() {
        this(null, 3, 0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("danmaku_id", this.LJLIL);
        linkedHashMap.put("is_sender", Integer.valueOf(this.LJLILLLLZI));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C215008cC(String danmakuId, int i) {
        o.LJIIIZ(danmakuId, "danmakuId");
        this.LJLIL = danmakuId;
        this.LJLILLLLZI = i;
    }

    public /* synthetic */ C215008cC(String str, int i, int i2) {
        this((i & 1) != 0 ? "" : str, 0);
    }
}
