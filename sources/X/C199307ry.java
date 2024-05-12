package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199307ry implements InterfaceC57356MfA<C7T1> {
    public final String LJLIL;
    public final int LJLILLLLZI = 21;
    public final String LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199307ry)) {
            return false;
        }
        C199307ry c199307ry = (C199307ry) obj;
        return o.LJ(this.LJLIL, c199307ry.LJLIL) && this.LJLILLLLZI == c199307ry.LJLILLLLZI && o.LJ(this.LJLJI, c199307ry.LJLJI);
    }

    public final int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        String str = this.LJLJI;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetMovieVideosQuery(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", count=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", pageExtra=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C199307ry(String str, String str2) {
        this.LJLIL = str;
        this.LJLJI = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r8, X.InterfaceC67352kd<? super X.C7T1> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C199357s3
            if (r0 == 0) goto L3f
            r6 = r9
            X.7s3 r6 = (X.C199357s3) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L45
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.topic.movie.detail.api.MovieVideosResp r1 = (com.ss.android.ugc.aweme.topic.movie.detail.api.MovieVideosResp) r1
            X.7T1 r0 = new X.7T1
            r0.<init>(r1)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi> r0 = com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi.class
            java.lang.Object r3 = X.C05L.LIZIZ(r1, r8, r0)
            com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi r3 = (com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi) r3
            java.lang.String r2 = r7.LJLIL
            int r1 = r7.LJLILLLLZI
            java.lang.String r0 = r7.LJLJI
            r6.LJLJI = r4
            java.lang.Object r1 = r3.getMovieVideos(r2, r1, r0, r6)
            if (r1 != r5) goto L20
            return r5
        L3f:
            X.7s3 r6 = new X.7s3
            r6.<init>(r7, r9)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199307ry.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
