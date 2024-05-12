package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.MeW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57316MeW implements InterfaceC57356MfA<C57318MeY> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57316MeW)) {
            return false;
        }
        C57316MeW c57316MeW = (C57316MeW) obj;
        return o.LJ(this.LJLIL, c57316MeW.LJLIL) && o.LJ(this.LJLILLLLZI, c57316MeW.LJLILLLLZI) && this.LJLJI == c57316MeW.LJLJI && this.LJLJJI == c57316MeW.LJLJJI && this.LJLJJL == c57316MeW.LJLJJL && o.LJ(this.LJLJJLL, c57316MeW.LJLJJLL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LJLILLLLZI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = (((JBR.LIZJ(this.LJLJI, (i2 + hashCode2) * 31, 31) + this.LJLJJI) * 31) + this.LJLJJL) * 31;
        String str3 = this.LJLJJLL;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return LIZJ + i;
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryMusicAwemeListQuery(url=");
        LIZ.append(this.LJLIL);
        LIZ.append(", mcId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", cursor=");
        LIZ.append(this.LJLJI);
        LIZ.append(", count=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", type=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", videoCoverShrink=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r13, X.InterfaceC67352kd<? super X.C57318MeY> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C57317MeX
            if (r0 == 0) goto L45
            r11 = r14
            X.MeX r11 = (X.C57317MeX) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r11.LJLJI = r2
        L12:
            java.lang.Object r3 = r11.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L4b
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.music.model.MusicAwemeList r3 = (com.ss.android.ugc.aweme.music.model.MusicAwemeList) r3
            X.MeY r0 = new X.MeY
            r0.<init>(r3)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApiV2> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApiV2.class
            java.lang.Object r3 = X.C05L.LIZIZ(r3, r13, r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApiV2 r3 = (com.ss.android.ugc.aweme.music.api.MusicDetailApiV2) r3
            java.lang.String r4 = r12.LJLIL
            java.lang.String r5 = r12.LJLILLLLZI
            long r6 = r12.LJLJI
            int r8 = r12.LJLJJI
            int r9 = r12.LJLJJL
            java.lang.String r10 = r12.LJLJJLL
            r11.LJLJI = r1
            java.lang.Object r3 = r3.queryMusicAwemeList(r4, r5, r6, r8, r9, r10, r11)
            if (r3 != r2) goto L20
            return r2
        L45:
            X.MeX r11 = new X.MeX
            r11.<init>(r12, r14)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57316MeW.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C57316MeW(int i, String str, String str2, long j, String str3, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = str3;
    }
}
