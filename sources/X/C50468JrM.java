package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JrM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50468JrM implements InterfaceC63694OzC<C50468JrM> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final String LJLJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50468JrM() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r7 = 127(0x7f, float:1.78E-43)
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50468JrM.<init>():void");
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", this.LJLIL);
        linkedHashMap.put("group_id", this.LJLILLLLZI);
        linkedHashMap.put("is_feed_liked", Boolean.valueOf(this.LJLJI));
        linkedHashMap.put("is_feed_collected", Boolean.valueOf(this.LJLJJI));
        linkedHashMap.put("is_feed_comment_clicked", Boolean.valueOf(this.LJLJJL));
        linkedHashMap.put("is_feed_forward_clicked", Boolean.valueOf(this.LJLJJLL));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        boolean z = this.LJLJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        boolean z2 = this.LJLJJI;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.LJLJJL;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        if (!this.LJLJJLL) {
            i = 0;
        }
        return this.LJLJL.hashCode() + ((i7 + i) * 31);
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
        LIZ.append("SearchVideoState(authorId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", groupId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isFeedLiked=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFeedCollected=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFeedCommentClicked=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFeedForwardClicked=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50468JrM)) {
            return false;
        }
        C50468JrM c50468JrM = (C50468JrM) obj;
        if (o.LJ(this.LJLIL, c50468JrM.LJLIL) && o.LJ(this.LJLILLLLZI, c50468JrM.LJLILLLLZI) && this.LJLJI == c50468JrM.LJLJI && this.LJLJJI == c50468JrM.LJLJJI && this.LJLJJL == c50468JrM.LJLJJL && this.LJLJJLL == c50468JrM.LJLJJLL && o.LJ(this.LJLJL, c50468JrM.LJLJL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50468JrM(java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13, boolean r14, int r15) {
        /*
            r8 = this;
            r7 = r14
            r6 = r13
            r5 = r12
            r1 = r9
            r4 = r11
            r0 = r15 & 1
            java.lang.String r2 = ""
            if (r0 == 0) goto Lc
            r1 = r2
        Lc:
            r0 = r15 & 2
            if (r0 == 0) goto L35
        L10:
            r0 = r15 & 4
            if (r0 == 0) goto L15
            r4 = 0
        L15:
            r0 = r15 & 8
            if (r0 == 0) goto L1a
            r5 = 0
        L1a:
            r0 = r15 & 16
            if (r0 == 0) goto L1f
            r6 = 0
        L1f:
            r0 = r15 & 32
            if (r0 == 0) goto L24
            r7 = 0
        L24:
            r0 = r15 & 64
            if (r0 == 0) goto L33
            java.lang.String r0 = "randomUUID().toString()"
            java.lang.String r3 = X.AnonymousClass629.LIZ(r0)
        L2e:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L33:
            r3 = 0
            goto L2e
        L35:
            r2 = r10
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50468JrM.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int):void");
    }

    public C50468JrM(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        HH1.LIZ(str, "authorId", str2, "groupId", str3, "sourceId");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
        this.LJLJL = str3;
    }
}
