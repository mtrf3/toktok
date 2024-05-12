package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jd9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49587Jd9 implements InterfaceC63694OzC<C49587Jd9> {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final boolean LJLJLJ;
    public final String LJLJLLL;

    public C49587Jd9() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("impl_id", this.LJLIL);
        linkedHashMap.put("origin_type", Integer.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("enter_from", this.LJLJI);
        linkedHashMap.put("rank", Integer.valueOf(this.LJLJJI));
        linkedHashMap.put("is_in_mix_search", Boolean.valueOf(this.LJLJJL));
        linkedHashMap.put("log_pb", this.LJLJJLL);
        linkedHashMap.put("doc_id", this.LJLJL);
        linkedHashMap.put("is_preload", Boolean.valueOf(this.LJLJLJ));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = (C79062V1e.LJ(this.LJLJI, ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31, 31) + this.LJLJJI) * 31;
        boolean z = this.LJLJJL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, (LJ + i2) * 31, 31), 31);
        if (!this.LJLJLJ) {
            i = 0;
        }
        return this.LJLJLLL.hashCode() + ((LJ2 + i) * 31);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchItemState(implId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", originType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJI);
        LIZ.append(", rankInList=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isInMixSearch=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", logPb=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", docId=");
        LIZ.append(this.LJLJL);
        LIZ.append(", isPreload=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public /* synthetic */ C49587Jd9(int i) {
        this("", "", "", false, "", AnonymousClass629.LIZ("randomUUID().toString()"), false, 0, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49587Jd9)) {
            return false;
        }
        C49587Jd9 c49587Jd9 = (C49587Jd9) obj;
        if (o.LJ(this.LJLIL, c49587Jd9.LJLIL) && this.LJLILLLLZI == c49587Jd9.LJLILLLLZI && o.LJ(this.LJLJI, c49587Jd9.LJLJI) && this.LJLJJI == c49587Jd9.LJLJJI && this.LJLJJL == c49587Jd9.LJLJJL && o.LJ(this.LJLJJLL, c49587Jd9.LJLJJLL) && o.LJ(this.LJLJL, c49587Jd9.LJLJL) && this.LJLJLJ == c49587Jd9.LJLJLJ && o.LJ(this.LJLJLLL, c49587Jd9.LJLJLLL)) {
            return true;
        }
        return false;
    }

    public C49587Jd9(String implId, String enterFrom, String logPb, boolean z, String docId, String sourceId, boolean z2, int i, int i2) {
        o.LJIIIZ(implId, "implId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(logPb, "logPb");
        o.LJIIIZ(docId, "docId");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = implId;
        this.LJLILLLLZI = i;
        this.LJLJI = enterFrom;
        this.LJLJJI = i2;
        this.LJLJJL = z;
        this.LJLJJLL = logPb;
        this.LJLJL = docId;
        this.LJLJLJ = z2;
        this.LJLJLLL = sourceId;
    }

    public static C49587Jd9 LIZ(C49587Jd9 c49587Jd9, String str, int i, String str2, int i2, boolean z, String str3, String str4, boolean z2, int i3) {
        String sourceId;
        boolean z3 = z2;
        String docId = str4;
        int i4 = i;
        String implId = str;
        String enterFrom = str2;
        int i5 = i2;
        boolean z4 = z;
        String logPb = str3;
        if ((i3 & 1) != 0) {
            implId = c49587Jd9.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i4 = c49587Jd9.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            enterFrom = c49587Jd9.LJLJI;
        }
        if ((i3 & 8) != 0) {
            i5 = c49587Jd9.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            z4 = c49587Jd9.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            logPb = c49587Jd9.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            docId = c49587Jd9.LJLJL;
        }
        if ((i3 & 128) != 0) {
            z3 = c49587Jd9.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            sourceId = c49587Jd9.LJLJLLL;
        } else {
            sourceId = null;
        }
        c49587Jd9.getClass();
        o.LJIIIZ(implId, "implId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(logPb, "logPb");
        o.LJIIIZ(docId, "docId");
        o.LJIIIZ(sourceId, "sourceId");
        return new C49587Jd9(implId, enterFrom, logPb, z4, docId, sourceId, z3, i4, i5);
    }
}
