package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94483ahj implements InterfaceC57356MfA<C94482ahi> {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final Long LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94483ahj)) {
            return false;
        }
        C94483ahj c94483ahj = (C94483ahj) obj;
        return this.LJLIL == c94483ahj.LJLIL && o.LJ(this.LJLILLLLZI, c94483ahj.LJLILLLLZI) && o.LJ(this.LJLJI, c94483ahj.LJLJI) && o.LJ(this.LJLJJI, c94483ahj.LJLJJI) && this.LJLJJL == c94483ahj.LJLJJL;
    }

    public final int hashCode() {
        int hashCode = ((this.LJLIL * 31) + this.LJLILLLLZI.hashCode()) * 31;
        Long l = this.LJLJI;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LJLJJI;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetDspPlaylistsQuery(platform=");
        LIZ.append(this.LJLIL);
        LIZ.append(", authToken=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", offset=");
        LIZ.append(this.LJLJI);
        LIZ.append(", offsetStr=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", count=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r12, X.InterfaceC67352kd<? super X.C94482ahi> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C94691al5
            if (r0 == 0) goto L4a
            r10 = r13
            X.al5 r10 = (X.C94691al5) r10
            int r2 = r10.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r10.LJLJI = r2
        L12:
            java.lang.Object r1 = r10.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L50
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylistsResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylistsResponse) r1
            X.ahi r0 = new X.ahi
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r12)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi) r4
            int r5 = r11.LJLIL
            java.lang.String r6 = r11.LJLILLLLZI
            java.lang.Long r7 = r11.LJLJI
            java.lang.String r8 = r11.LJLJJI
            int r9 = r11.LJLJJL
            r10.LJLJI = r2
            java.lang.Object r1 = r4.getDspPlaylists(r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L20
            return r3
        L4a:
            X.al5 r10 = new X.al5
            r10.<init>(r11, r13)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94483ahj.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94483ahj(int i, Long l, int i2, String authToken, String str) {
        o.LJIIIZ(authToken, "authToken");
        this.LJLIL = i;
        this.LJLILLLLZI = authToken;
        this.LJLJI = l;
        this.LJLJJI = str;
        this.LJLJJL = i2;
    }
}
