package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ptj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65903Ptj extends F9E implements PYQ {
    public C65901Pth LJLIL;
    public java.util.Map<Object, ? extends Object> LJLILLLLZI;
    public JSONObject LJLJI;
    public java.util.Set<String> LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;

    public C65903Ptj() {
        this(null, 63);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    @Override // X.PYQ
    public final C65901Pth LJJJJL() {
        return this.LJLIL;
    }

    public final C65903Ptj L(C65922Pu2 c65922Pu2) {
        C65901Pth baseEvent = this.LJLIL;
        java.util.Map<Object, ? extends Object> map = this.LJLILLLLZI;
        JSONObject jSONObject = this.LJLJI;
        java.util.Set<String> contentKeys = this.LJLJJI;
        String str = this.LJLJJL;
        String str2 = this.LJLJJLL;
        o.LJIIIZ(baseEvent, "baseEvent");
        o.LJIIIZ(contentKeys, "contentKeys");
        C65903Ptj c65903Ptj = new C65903Ptj(baseEvent, map, jSONObject, contentKeys, str, str2);
        c65903Ptj.LJLJJI = new LinkedHashSet();
        C65901Pth L = C65901Pth.L(this.LJLIL);
        c65903Ptj.LJLIL = L;
        L.M(c65922Pu2);
        return c65903Ptj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C65903Ptj(X.C65901Pth r8, int r9) {
        /*
            r7 = this;
            r1 = r8
            r0 = r9 & 1
            if (r0 == 0) goto La
            X.Pth r1 = new X.Pth
            r1.<init>()
        La:
            r2 = 0
            r0 = r9 & 8
            if (r0 == 0) goto L1c
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        L14:
            r0 = r7
            r3 = r2
            r5 = r2
            r6 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L1c:
            r4 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65903Ptj.<init>(X.Pth, int):void");
    }

    public C65903Ptj(C65901Pth baseEvent, java.util.Map<Object, ? extends Object> map, JSONObject jSONObject, java.util.Set<String> contentKeys, String str, String str2) {
        o.LJIIIZ(baseEvent, "baseEvent");
        o.LJIIIZ(contentKeys, "contentKeys");
        this.LJLIL = baseEvent;
        this.LJLILLLLZI = map;
        this.LJLJI = jSONObject;
        this.LJLJJI = contentKeys;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }
}
