package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Y0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Y0 extends F9E implements InterfaceC54035LIp {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    public C2Y0() {
        this(0, null, 0, 7);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("shown_danmaku_cnt", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("danmaku_id_list", this.LJLILLLLZI);
        linkedHashMap.put("uniq_danmaku_cnt", Integer.valueOf(this.LJLJI));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C2Y0(int i, String danmakuIdList, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        danmakuIdList = (i3 & 2) != 0 ? "" : danmakuIdList;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        o.LJIIIZ(danmakuIdList, "danmakuIdList");
        this.LJLIL = i;
        this.LJLILLLLZI = danmakuIdList;
        this.LJLJI = i2;
    }
}
