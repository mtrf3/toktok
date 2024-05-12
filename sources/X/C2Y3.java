package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Y3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Y3 extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    public C2Y3() {
        this(null, 7);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_options", this.LJLIL);
        linkedHashMap.put("enter_method", this.LJLILLLLZI);
        linkedHashMap.put("is_danmaku_entry_available", Integer.valueOf(this.LJLJI));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2Y3(java.lang.String r4, int r5) {
        /*
            r3 = this;
            r0 = r5 & 1
            java.lang.String r2 = ""
            if (r0 == 0) goto L11
            r1 = r2
        L7:
            r0 = r5 & 2
            if (r0 == 0) goto Lc
            r4 = r2
        Lc:
            r0 = 0
            r3.<init>(r1, r4, r0)
            return
        L11:
            r1 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Y3.<init>(java.lang.String, int):void");
    }

    public C2Y3(String showOptions, String enterMethod, int i) {
        o.LJIIIZ(showOptions, "showOptions");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = showOptions;
        this.LJLILLLLZI = enterMethod;
        this.LJLJI = i;
    }
}
