package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50429Jqj implements InterfaceC63694OzC<C50429Jqj> {
    public final java.util.Map<String, String> LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C50429Jqj() {
        this((java.util.Map) null, (String) (0 == true ? 1 : 0), false, (String) (0 == true ? 1 : 0), 31);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("extra_log_params", this.LJLIL);
        linkedHashMap.put("enter_comment_id", this.LJLILLLLZI);
        linkedHashMap.put("is_from_outside", Boolean.valueOf(this.LJLJI));
        linkedHashMap.put("is_from_photo", this.LJLJJI);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJJL.hashCode() + C79062V1e.LJ(this.LJLJJI, (LJ + i) * 31, 31);
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
        LIZ.append("SearchEventState(extraLogParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterCommentId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isFromOutside=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFromPhoto=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50429Jqj)) {
            return false;
        }
        C50429Jqj c50429Jqj = (C50429Jqj) obj;
        if (o.LJ(this.LJLIL, c50429Jqj.LJLIL) && o.LJ(this.LJLILLLLZI, c50429Jqj.LJLILLLLZI) && this.LJLJI == c50429Jqj.LJLJI && o.LJ(this.LJLJJI, c50429Jqj.LJLJJI) && o.LJ(this.LJLJJL, c50429Jqj.LJLJJL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50429Jqj(java.util.Map r7, java.lang.String r8, boolean r9, java.lang.String r10, int r11) {
        /*
            r6 = this;
            r5 = r9
            r4 = r7
            r1 = r8
            r0 = r11 & 1
            if (r0 == 0) goto Lb
            X.3mF r4 = X.C113554cx.LJJJLIIL()
        Lb:
            r0 = r11 & 2
            java.lang.String r2 = ""
            if (r0 == 0) goto L12
            r1 = r2
        L12:
            r0 = r11 & 4
            if (r0 == 0) goto L17
            r5 = 0
        L17:
            r0 = r11 & 8
            if (r0 == 0) goto L2c
        L1b:
            r0 = r11 & 16
            if (r0 == 0) goto L2a
            java.lang.String r0 = "randomUUID().toString()"
            java.lang.String r3 = X.AnonymousClass629.LIZ(r0)
        L25:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L2a:
            r3 = 0
            goto L25
        L2c:
            r2 = r10
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50429Jqj.<init>(java.util.Map, java.lang.String, boolean, java.lang.String, int):void");
    }

    public C50429Jqj(String enterCommentId, String isFromPhoto, String sourceId, java.util.Map extraLogParams, boolean z) {
        o.LJIIIZ(extraLogParams, "extraLogParams");
        o.LJIIIZ(enterCommentId, "enterCommentId");
        o.LJIIIZ(isFromPhoto, "isFromPhoto");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = extraLogParams;
        this.LJLILLLLZI = enterCommentId;
        this.LJLJI = z;
        this.LJLJJI = isFromPhoto;
        this.LJLJJL = sourceId;
    }
}
