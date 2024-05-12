package X;

import fjb.a;
import org.json.JSONArray;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.preload.AdPreloadManifestFileParser$readJsonFileToArray$2", f = "AdPreloadManifestFileParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2vT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74072vT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super JSONArray>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74072vT(String str, String str2, InterfaceC67352kd<? super C74072vT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74072vT(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0004, B:5:0x000e, B:12:0x001b), top: B:2:0x0004 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            X.C141335gf.LIZJ(r4)
            r2 = 0
            java.lang.String r1 = r3.LJLIL     // Catch: java.lang.Exception -> L22
            java.lang.String r0 = r3.LJLILLLLZI     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = X.C74112vX.LIZIZ(r1, r0)     // Catch: java.lang.Exception -> L22
            if (r1 == 0) goto L17
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> L22
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 == 0) goto L1b
            return r2
        L1b:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L22
            r0.<init>(r1)     // Catch: java.lang.Exception -> L22
            r2 = r0
            goto L2b
        L22:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            java.lang.String r0 = "parse preload manifest file failed"
            X.C36922EeM.LJ(r0)
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74072vT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super JSONArray> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
