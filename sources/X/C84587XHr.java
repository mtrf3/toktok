package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XHr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84587XHr extends F9E implements XGE {
    public final String LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(1, 100L, true);
    }

    public C84587XHr(String mixId) {
        o.LJIIIZ(mixId, "mixId");
        this.LJLIL = mixId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r6, X.InterfaceC67352kd<? super X.XI4> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C84589XHt
            if (r0 == 0) goto L3b
            r4 = r7
            X.XHt r4 = (X.C84589XHt) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L41
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            X.XI4 r0 = new X.XI4
            r0.<init>(r1)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.favorites.business.playlist.api.PlaylistCollectionApi> r0 = com.ss.android.ugc.aweme.favorites.business.playlist.api.PlaylistCollectionApi.class
            java.lang.Object r1 = X.C05L.LIZIZ(r1, r6, r0)
            com.ss.android.ugc.aweme.favorites.business.playlist.api.PlaylistCollectionApi r1 = (com.ss.android.ugc.aweme.favorites.business.playlist.api.PlaylistCollectionApi) r1
            java.lang.String r0 = r5.LJLIL
            r4.LJLJI = r2
            java.lang.Object r1 = r1.collectPlaylist(r0, r4)
            if (r1 != r3) goto L20
            return r3
        L3b:
            X.XHt r4 = new X.XHt
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84587XHr.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
