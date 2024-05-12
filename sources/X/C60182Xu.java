package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60182Xu extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("group_id", this.LJLIL);
        linkedHashMap.put("user_id", this.LJLILLLLZI);
        linkedHashMap.put("author_id", this.LJLJI);
        linkedHashMap.put("enter_from", this.LJLJJI);
        linkedHashMap.put("is_author", Integer.valueOf(this.LJLJJL));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C60182Xu(String str, String str2, String str3, String enterFrom, int i) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = enterFrom;
        this.LJLJJL = i;
    }
}
