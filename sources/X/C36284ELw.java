package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import kotlin.jvm.internal.o;

/* renamed from: X.ELw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36284ELw {
    public final EnumC58085Mqv LIZ;
    public final boolean LIZIZ;
    public final IAuthApi LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, java.lang.String> r7, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C36275ELn
            if (r0 == 0) goto L45
            r5 = r8
            X.ELn r5 = (X.C36275ELn) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L4b
            X.C141335gf.LIZJ(r1)
        L20:
            X.Ee8 r1 = (X.AbstractC36908Ee8) r1
            r1.checkValid()
            java.lang.String r0 = "authApiService.uploadHas…   ).await().checkValid()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L2b:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.relation.auth.api.IAuthApi r2 = r6.LIZJ
            X.Mqv r0 = r6.LIZ
            int r1 = r0.getValue()
            boolean r0 = r6.LIZIZ
            X.SvC r0 = r2.uploadHashContact(r7, r1, r0)
            r5.LJLJI = r3
            java.lang.Object r1 = X.C77318UWc.LIZ(r0, r5)
            if (r1 != r4) goto L20
            return r4
        L45:
            X.ELn r5 = new X.ELn
            r5.<init>(r6, r8)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36284ELw.LIZ(java.util.Map, X.2kd):java.lang.Object");
    }

    public C36284ELw(EnumC58085Mqv scene, boolean z, int i) {
        AuthApiService authApiService;
        scene = (i & 1) != 0 ? EnumC58085Mqv.UNKNOWN : scene;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            authApiService = AuthApiService.LIZIZ;
        } else {
            authApiService = null;
        }
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(authApiService, "authApiService");
        this.LIZ = scene;
        this.LIZIZ = z;
        this.LIZJ = authApiService;
    }
}
