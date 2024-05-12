package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.NDt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59005NDt {
    public static final C59005NDt LIZ = new C59005NDt();
    public static final String LIZIZ;

    static {
        String str;
        if (GeckoGlobalConfig.ENVType.PROD == O3U.LJFF()) {
            str = "a1a15b782e3ee8a25247561a91a99835";
        } else {
            str = "0da04670c45fcb4f5dee6049f06a9d77";
        }
        LIZIZ = str;
    }

    public static boolean LIZJ(String channel) {
        o.LJIIIZ(channel, "channel");
        if (O3U.LJIILL(channel) || C59019NEh.LIZ(LIZIZ, channel) || C59019NEh.LIZ(C59086NGw.LIZ(), channel)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.commerce.IBEInfo r10, X.C58628Mzg r11, X.InterfaceC67352kd<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.NEY
            if (r0 == 0) goto La6
            r5 = r12
            X.NEY r5 = (X.NEY) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r1 = r5.LJLJJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L30
            if (r0 == r8) goto L24
            if (r0 != r4) goto Lad
            X.C141335gf.LIZJ(r1)
        L23:
            return r1
        L24:
            java.lang.Object r3 = r5.LJLJI
            java.lang.String r3 = (java.lang.String) r3
            X.Mzg r11 = r5.LJLILLLLZI
            X.NDt r2 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L76
        L30:
            X.C141335gf.LIZJ(r1)
            java.lang.String r1 = r10.getLynxSchema()
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r0 = "channel"
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            if (r3 != 0) goto L4b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L4b:
            boolean r7 = LIZJ(r3)
            X.N0X r0 = X.N0X.LIZ
            r0.getClass()
            X.MIu r2 = X.N0X.LJIIIIZZ
            kotlin.jvm.internal.AqS15S0010000_10 r1 = new kotlin.jvm.internal.AqS15S0010000_10
            r0 = 0
            r1.<init>(r7, r0)
            r11.LJIILJJIL(r2, r1)
            if (r7 == 0) goto L64
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L64:
            java.lang.String r0 = X.C59005NDt.LIZIZ
            r5.LJLIL = r9
            r5.LJLILLLLZI = r11
            r5.LJLJI = r3
            r5.LJLJJLL = r8
            java.lang.Object r1 = r9.LIZIZ(r11, r3, r0, r5)
            if (r1 != r6) goto L75
            return r6
        L75:
            r2 = r9
        L76:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L81
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L81:
            X.Ol8 r0 = X.E4W.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L92
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L92:
            java.lang.String r1 = X.C59086NGw.LIZ()
            r0 = 0
            r5.LJLIL = r0
            r5.LJLILLLLZI = r0
            r5.LJLJI = r0
            r5.LJLJJLL = r4
            java.lang.Object r1 = r2.LIZIZ(r11, r3, r1, r5)
            if (r1 != r6) goto L23
            return r6
        La6:
            X.NEY r5 = new X.NEY
            r5.<init>(r9, r12)
            goto L12
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59005NDt.LIZ(com.ss.android.ugc.aweme.commerce.IBEInfo, X.Mzg, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C58628Mzg r7, java.lang.String r8, java.lang.String r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.NEZ
            if (r0 == 0) goto L26
            r5 = r10
            X.NEZ r5 = (X.NEZ) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r2 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            java.lang.Object r8 = r5.LJLJI
            java.lang.String r8 = (java.lang.String) r8
            X.Mzg r7 = r5.LJLILLLLZI
            X.NDt r1 = r5.LJLIL
            goto L5a
        L26:
            X.NEZ r5 = new X.NEZ
            r5.<init>(r6, r10)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r2)
            X.N0X r0 = X.N0X.LIZ
            r0.getClass()
            X.MIu r0 = X.N0X.LJIIIZ
            r7.LIZIZ(r0)
            X.EO6 r2 = new X.EO6     // Catch: java.lang.Throwable -> L65
            r0 = 0
            r2.<init>(r9, r8, r0)     // Catch: java.lang.Throwable -> L65
            r5.LJLIL = r6     // Catch: java.lang.Throwable -> L65
            r5.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> L65
            r5.LJLJI = r8     // Catch: java.lang.Throwable -> L65
            r5.LJLJJLL = r3     // Catch: java.lang.Throwable -> L65
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.C74209TAn.LIZIZ(r0, r2, r5)     // Catch: java.lang.Throwable -> L65
            if (r2 != r4) goto L58
            return r4
        L58:
            r1 = r6
            goto L5d
        L5a:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L63
        L5d:
            com.bytedance.geckox.model.UpdatePackage r2 = (com.bytedance.geckox.model.UpdatePackage) r2     // Catch: java.lang.Throwable -> L63
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L63
            goto L6e
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r1 = r6
        L67:
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L6e:
            boolean r0 = X.C3C5.m13isSuccessimpl(r2)
            if (r0 != 0) goto L7d
            r1.getClass()
            boolean r0 = LIZJ(r8)
            if (r0 == 0) goto L8e
        L7d:
            if (r3 == 0) goto L89
            X.N0X r0 = X.N0X.LIZ
            r0.getClass()
            X.MIu r0 = X.N0X.LJIIJ
            r7.LIZIZ(r0)
        L89:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L8e:
            r3 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59005NDt.LIZIZ(X.Mzg, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
