package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.8za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229508za implements InterfaceC57356MfA<C229538zd> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final boolean LJLJL;
    public final Integer LJLJLJ;
    public final int LJLJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C229508za)) {
            return false;
        }
        C229508za c229508za = (C229508za) obj;
        return o.LJ(this.LJLIL, c229508za.LJLIL) && o.LJ(this.LJLILLLLZI, c229508za.LJLILLLLZI) && this.LJLJI == c229508za.LJLJI && this.LJLJJI == c229508za.LJLJJI && o.LJ(this.LJLJJL, c229508za.LJLJJL) && o.LJ(this.LJLJJLL, c229508za.LJLJJLL) && this.LJLJL == c229508za.LJLJL && o.LJ(this.LJLJLJ, c229508za.LJLJLJ) && this.LJLJLLL == c229508za.LJLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, (JBR.LIZJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31) + this.LJLJJI) * 31, 31), 31);
        boolean z = this.LJLJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        Integer num = this.LJLJLJ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.LJLJLLL;
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetMixVideoListQuery(mixId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", itemId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", cursor=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pullType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", authorUid=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", authorSecUid=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", fromShare=");
        LIZ.append(this.LJLJL);
        LIZ.append(", count=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", defaultPageType=");
        return b0.LIZJ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r15, X.InterfaceC67352kd<? super X.C229538zd> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C229518zb
            if (r0 == 0) goto L4d
            r13 = r3
            X.8zb r13 = (X.C229518zb) r13
            int r2 = r13.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r13.LJLJI = r2
        L14:
            java.lang.Object r3 = r13.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r2 = r13.LJLJI
            r0 = 1
            if (r2 == 0) goto L2a
            if (r2 != r0) goto L53
            X.C141335gf.LIZJ(r3)
        L22:
            com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r3 = (com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse) r3
            X.8zd r0 = new X.8zd
            r0.<init>(r3)
            return r0
        L2a:
            java.lang.Class<com.ss.android.ugc.aweme.mix.api.MixFeedApi> r2 = com.ss.android.ugc.aweme.mix.api.MixFeedApi.class
            java.lang.Object r2 = X.C05L.LIZIZ(r3, r15, r2)
            com.ss.android.ugc.aweme.mix.api.MixFeedApi r2 = (com.ss.android.ugc.aweme.mix.api.MixFeedApi) r2
            java.lang.String r3 = r14.LJLIL
            java.lang.String r4 = r14.LJLILLLLZI
            long r5 = r14.LJLJI
            int r7 = r14.LJLJJI
            java.lang.String r8 = r14.LJLJJL
            java.lang.String r9 = r14.LJLJJLL
            boolean r10 = r14.LJLJL
            java.lang.Integer r11 = r14.LJLJLJ
            int r12 = r14.LJLJLLL
            r13.LJLJI = r0
            java.lang.Object r3 = r2.getMixVideoList(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            if (r3 != r1) goto L22
            return r1
        L4d:
            X.8zb r13 = new X.8zb
            r13.<init>(r14, r3)
            goto L14
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229508za.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C229508za(String mixId, String itemId, long j, int i, String str, String str2, boolean z, Integer num, int i2) {
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(itemId, "itemId");
        this.LJLIL = mixId;
        this.LJLILLLLZI = itemId;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = z;
        this.LJLJLJ = num;
        this.LJLJLLL = i2;
    }
}
