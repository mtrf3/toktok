package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94495ahv implements InterfaceC57356MfA<C94494ahu> {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94495ahv)) {
            return false;
        }
        C94495ahv c94495ahv = (C94495ahv) obj;
        return this.LJLIL == c94495ahv.LJLIL && o.LJ(this.LJLILLLLZI, c94495ahv.LJLILLLLZI) && o.LJ(this.LJLJI, c94495ahv.LJLJI) && o.LJ(this.LJLJJI, c94495ahv.LJLJJI);
    }

    public final int hashCode() {
        int hashCode = ((((this.LJLIL * 31) + this.LJLILLLLZI.hashCode()) * 31) + this.LJLJI.hashCode()) * 31;
        String str = this.LJLJJI;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SongCheckForDspQuery(platform=");
        LIZ.append(this.LJLIL);
        LIZ.append(", songId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", authToken=");
        LIZ.append(this.LJLJI);
        LIZ.append(", region=");
        LIZ.append(this.LJLJJI);
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
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r11, X.InterfaceC67352kd<? super X.C94494ahu> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C94697alB
            if (r0 == 0) goto L48
            r9 = r12
            X.alB r9 = (X.C94697alB) r9
            int r2 = r9.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r9.LJLJI = r2
        L12:
            java.lang.Object r1 = r9.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L4e
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongCheckResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongCheckResponse) r1
            X.ahu r0 = new X.ahu
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi) r4
            int r5 = r10.LJLIL
            java.lang.String r6 = r10.LJLILLLLZI
            java.lang.String r7 = r10.LJLJI
            java.lang.String r8 = r10.LJLJJI
            r9.LJLJI = r2
            java.lang.Object r1 = r4.songCheckForDsp(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L20
            return r3
        L48:
            X.alB r9 = new X.alB
            r9.<init>(r10, r12)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94495ahv.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94495ahv(int i, String songId, String authToken, String str) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(authToken, "authToken");
        this.LJLIL = i;
        this.LJLILLLLZI = songId;
        this.LJLJI = authToken;
        this.LJLJJI = str;
    }
}
