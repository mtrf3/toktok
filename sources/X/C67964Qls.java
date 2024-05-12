package X;

import org.json.JSONArray;

/* renamed from: X.Qls, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67964Qls {
    public final EnumC67961Qlp LIZ;
    public final JSONArray LIZIZ;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public C67964Qls(X.EnumC67961Qlp r2, com.google.android.gms.wallet.PaymentData r3) {
        /*
            r1 = this;
            java.lang.String r0 = "code"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            r1.<init>()
            r1.LIZ = r2
            if (r3 == 0) goto L18
        Ld:
            org.json.JSONArray r0 = X.C67965Qlt.LIZ(r3)     // Catch: java.lang.Exception -> L14
            r1.LIZIZ = r0     // Catch: java.lang.Exception -> L14
            goto L18
        L14:
            X.Qlp r0 = X.EnumC67961Qlp.ParseError
            r1.LIZ = r0
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67964Qls.<init>(X.Qlp, com.google.android.gms.wallet.PaymentData):void");
    }
}
