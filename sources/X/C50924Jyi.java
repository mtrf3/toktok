package X;

import java.util.HashMap;

/* renamed from: X.Jyi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50924Jyi extends J8E {
    public String LJLILLLLZI = "discovery";
    public int LJLJI;
    public String LJLJJI;
    public String LJLJJL;

    @Override // X.J8E
    public HashMap<String, String> buildParams() {
        appendParam("banner_id", this.LJLJJI, InterfaceC1798974f.LIZIZ);
        String str = this.LJLILLLLZI;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        appendParam("enter_from", str, c1799074g);
        appendParam("tag_id", this.LJLJJL, c1799074g);
        appendParam("client_order", String.valueOf(this.LJLJI), c1799074g);
        return this.LJLIL;
    }

    public C50924Jyi setBannerId(String str) {
        this.LJLJJI = str;
        return this;
    }

    public C50924Jyi setClientOrder(int i) {
        this.LJLJI = i;
        return this;
    }

    public C50924Jyi setEnterFrom(String str) {
        this.LJLILLLLZI = str;
        return this;
    }

    public C50924Jyi setTagId(String str) {
        this.LJLJJL = str;
        return this;
    }
}
